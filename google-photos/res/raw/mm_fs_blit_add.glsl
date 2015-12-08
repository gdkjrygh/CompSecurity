/**
 * Fragment shader that samples a single texture and adds a constant to the rgb values.
 */
precision mediump float;

// Uniforms:
uniform sampler2D sampler_source;
uniform float postaddition;

// Vertex-stream inputs:
varying vec2 v_texcoord;

void main() {
    vec4 color = texture2D(sampler_source, v_texcoord);
    gl_FragColor = vec4(postaddition + color.rgb, 1.0);
}
