/**
 * The theme vertex shader that is used mulitple times per frame to draw
 * textured quads.
 */

// Uniforms:
uniform mat3 primary_transform;
uniform mat4 quad_transform;

// Vertex-stream inputs:
attribute vec4 a_position;
attribute vec3 a_texcoord;

// Vertex-stream outputs:
varying vec2 v_texcoord;
varying vec2 v_primary_texcoord;

void main() {
    gl_Position = quad_transform * a_position;

    v_texcoord = a_texcoord.xy;

    v_primary_texcoord = (primary_transform * a_texcoord).xy;
}
