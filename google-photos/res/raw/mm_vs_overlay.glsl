/**
 * Vertex shader that emits two sets of texture coordinates by multiplying the input texture
 * coordinate by two separate 3x3 transform matrices.
 * The positions are passed through unaltered.
 */

// Uniforms:
uniform mat3 texcoord_transform_a;
uniform mat3 texcoord_transform_b;

// Vertex-stream inputs:
attribute vec4 a_position;
attribute vec3 a_texcoord;

// Vertex-stream outputs:
varying vec2 v_texcoord_a;
varying vec2 v_texcoord_b;

void main() {
    gl_Position = a_position;
    v_texcoord_a = (texcoord_transform_a * a_texcoord).xy;
    v_texcoord_b = (texcoord_transform_b * a_texcoord).xy;
}
