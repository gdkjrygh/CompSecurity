/**
 * Blends between two textures using the 'add-subtract' blend method.
 * The base texture is sampled using the screen-texture coordinates.
 * The overlay texture is sampled using the overlay texture coordinates.
 *
 * TODO(bclayton): describe the 'add-subtract' blending algorithm used.
 */
precision mediump float;

// Uniforms:
uniform sampler2D sampler_source_a;
uniform sampler2D sampler_source_b;
uniform float blend_weight;

// Vertex-stream inputs:
varying vec2 v_texcoord_a;
varying vec2 v_texcoord_b;

void main() {
    vec4 current = texture2D(sampler_source_a, v_texcoord_a);
    vec4 overlay = texture2D(sampler_source_b, v_texcoord_b) * blend_weight;
    gl_FragColor = vec4(current.rgb + 2.0 * overlay.rgb - overlay.a, 1.0);
}
