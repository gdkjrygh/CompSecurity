/**
 * Outputs the position unmodified and the texture coordinates transformed by texcoord_transform.
 */

// Uniforms:
uniform mat3 texcoord_transform;

// Vertex-stream inputs:
attribute vec4 a_position;
attribute vec3 a_texcoord;

// Vertex-stream outputs:
varying vec2 v_texcoord;

void main() {
    gl_Position = a_position;
    v_texcoord = (texcoord_transform * a_texcoord).xy;
}
