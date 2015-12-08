/**
 * The main theme fragment shader with support for transitioning.
 * Supports:
 *   Variable barrel distortion
 *   Optional background sampling
 *   Optional color adjustment via a look-up-table
 */
precision mediump float;

// Uniforms:
// Input frame A
uniform sampler2D sampler_primary_frame;

// Frame A - blurred background
uniform sampler2D sampler_primary_blurred_source;

// Input frame B
uniform sampler2D sampler_secondary_frame;
uniform float secondary_opacity;

// Frame B - blurred background
uniform sampler2D sampler_secondary_blurred_source;
uniform int use_blurred_background;

// 3D lut
uniform sampler2D sampler_lut;
uniform int lut_is_active;

// Barrel distortion
uniform float barrel_distortion_amount;

// Padding color
uniform vec4 padding_color;

// Vertex-stream inputs:
varying vec2 v_texcoord;
varying vec2 v_primary_texcoord;
varying vec2 v_primary_cropcoord;
varying vec2 v_primary_bkgd_texcoord;

varying vec2 v_secondary_texcoord;
varying vec2 v_secondary_cropcoord;
varying vec2 v_secondary_bkgd_texcoord;

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

vec2 barrelDistortion(vec2 coord, float amount) {
    vec2 xy = coord - 0.5;
    float dist = dot(xy, xy);
    return coord + xy * dist * amount;
}

void main() {
    vec2 coord = v_primary_texcoord;
    coord = barrelDistortion(coord, barrel_distortion_amount);
    vec4 color = texture2D(sampler_primary_frame, coord);
    if (v_primary_cropcoord.x < 0.0 || v_primary_cropcoord.x > 1.0 ||
        v_primary_cropcoord.y < 0.0 || v_primary_cropcoord.y > 1.0) {
        color.a = 0.0;
    }

    if (use_blurred_background != 0) {
        vec4 background_color = texture2D(sampler_primary_blurred_source, v_primary_bkgd_texcoord);
        color = vec4(mix(background_color.rgb, color.rgb, color.a), 1.0);
    } else {
        color = vec4(mix(padding_color.rgb, color.rgb, color.a), 1.0);
    }

    vec4 color_b = texture2D(sampler_secondary_frame, v_secondary_texcoord);
    if (v_secondary_cropcoord.x < 0.0 || v_secondary_cropcoord.x > 1.0 ||
        v_secondary_cropcoord.y < 0.0 || v_secondary_cropcoord.y > 1.0) {
        color_b.a = 0.0;
    }

    if (use_blurred_background != 0) {
        vec4 background_color = texture2D(sampler_secondary_blurred_source,
            v_secondary_bkgd_texcoord);
        color_b = vec4(mix(background_color.rgb, color_b.rgb, color_b.a), 1.0);
    }

    color = vec4(mix(color.rgb, color_b.rgb, secondary_opacity * color_b.a), 1.0);

    if (lut_is_active != 0) {
        // The color must be passed in as RBG because the luts have red on the x axis,
        // blue on the y axis, and green on the z axis.
        color = texture3D(sampler_lut, 16.0, color.rbg);
    }

    gl_FragColor = vec4(color.rgb, 1.0);
}
