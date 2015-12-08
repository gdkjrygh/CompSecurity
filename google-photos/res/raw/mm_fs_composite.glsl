/**
 * The theme fragment shader that is used mulitple times per frame to draw
 * textured quads.
 * Supports:
 *   Optional color adjustment via a look-up-table
 * Note this shader does not support (unlike fs_main):
 *   Variable barrel distortion
 *   Optional background sampling
 *   Cropping
 */
precision mediump float;

// Uniforms:
// Input frame A
uniform sampler2D sampler_primary_frame;

// 3D lut
uniform sampler2D sampler_lut;
uniform int lut_is_active;

// Vertex-stream inputs:
varying vec2 v_texcoord;
varying vec2 v_primary_texcoord;

vec4 texture3D(in sampler2D tex, in float size, in vec3 texCoord) {
    float zSliceWidth = 1.0 / size;
    float singlePixelWidth = zSliceWidth / size;
    // need to pad slices by 1/2 pixel on each side to avoid interpolation between slices
    float zSlicePaddedWidth = singlePixelWidth * (size - 1.0);
    float zSliceLower = min(floor(texCoord.z * size), size - 1.0);
    float zSliceUpper = min(zSliceLower + 1.0, size - 1.0);
    float xOffset = texCoord.x * zSlicePaddedWidth + singlePixelWidth / 2.0;
    float lowerSliceX = xOffset + (zSliceLower * zSliceWidth);
    float upperSliceX = xOffset + (zSliceUpper * zSliceWidth);
    vec4 lowerSliceColor = texture2D(tex, vec2(lowerSliceX, texCoord.y));
    vec4 upperSliceColor = texture2D(tex, vec2(upperSliceX, texCoord.y));
    float zOffset = mod(texCoord.z * size, 1.0);
    return mix(lowerSliceColor, upperSliceColor, zOffset);
}

void main() {
    vec2 coord = v_primary_texcoord;
    vec4 color = texture2D(sampler_primary_frame, coord);
    color = vec4(color.rgb * color.a, 1.0);

    if (lut_is_active != 0) {
        // The color must be passed in as RBG because the luts have red on the x axis,
        // blue on the y axis, and green on the z axis.
        color = texture3D(sampler_lut, 16.0, color.rbg);
    }

    gl_FragColor = vec4(color.rgb, 1.0);
}
