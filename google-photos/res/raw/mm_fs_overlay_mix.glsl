/**
 * Fragment shader that outputs a linear blend between two texture samplers.
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
    vec4 base = texture2D(sampler_source_a, v_texcoord_a);
    vec4 overlay = texture2D(sampler_source_b, v_texcoord_a);
    gl_FragColor = mix(base, overlay, blend_weight);
}
