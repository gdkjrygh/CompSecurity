/**
 * Samples a single texture using the overlay texture coordinates and multiplies the output by
 * blend weight.
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
    gl_FragColor = texture2D(sampler_source_b, v_texcoord_b) * blend_weight;
}
