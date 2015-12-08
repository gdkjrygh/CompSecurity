/**
 * Blends between two textures using the 'overlay' blend method.
 * The base texture is sampled using the screen-texture coordinates.
 * The overlay texture is sampled using the overlay texture coordinates.
 *
 * TODO(bclayton): describe the 'overlay' blending algorithm used.
 */
precision mediump float;

// Uniforms:
uniform sampler2D sampler_source_a;
uniform sampler2D sampler_source_b;
uniform float blend_weight;

// Vertex-stream inputs:
varying vec2 v_texcoord_a;
varying vec2 v_texcoord_b;

// Overlays colors in overlay blend mode, expects the overlay color is alpha pre-multiplied.
vec4 overlayBlendColors(vec4 current, vec4 overlay, float overlay_alpha) {
    return mix(2.0 * current * overlay + current * (1.0 - overlay_alpha),
            current + 2.0 * overlay - 2.0 * overlay * current + overlay_alpha * (current - 1.0),
            step(current, vec4(0.5, 0.5, 0.5, 0.5)));
}

void main() {
    vec4 current = texture2D(sampler_source_a, v_texcoord_a);
    vec4 overlay = texture2D(sampler_source_b, v_texcoord_b) * blend_weight;
    gl_FragColor = overlayBlendColors(current, overlay, overlay.a);
}
