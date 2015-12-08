/**
 * Single texture sampling fragment shader.
 */
precision mediump float;

// Uniforms:
uniform sampler2D sampler_source;

// Vertex-stream inputs:
varying vec2 v_texcoord;

void main() {
    gl_FragColor = texture2D(sampler_source, v_texcoord);
}
