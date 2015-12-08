/**
 * Single external-oes texture sampling fragment shader.
 */
#extension GL_OES_EGL_image_external : require
precision mediump float;

// Uniforms:
uniform samplerExternalOES sampler_source;

// Vertex-stream inputs:
varying vec2 v_texcoord;

void main() {
    gl_FragColor = texture2D(sampler_source, v_texcoord);
}
