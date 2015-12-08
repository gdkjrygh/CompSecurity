/**
 * The main theme vertex shader without support for transitioning.
 */

// Uniforms:
uniform mat3 primary_transform;
uniform mat3 primary_crop;
uniform mat3 primary_bkgd_transform;

// Vertex-stream inputs:
attribute vec4 a_position;
attribute vec3 a_texcoord;

// Vertex-stream outputs:
varying vec2 v_texcoord;
varying vec2 v_primary_texcoord;
varying vec2 v_primary_cropcoord;
varying vec2 v_primary_bkgd_texcoord;

void main() {
    gl_Position = a_position;

    v_texcoord = a_texcoord.xy;

    v_primary_texcoord = (primary_transform * a_texcoord).xy;
    v_primary_cropcoord = (primary_crop * a_texcoord).xy;
    v_primary_bkgd_texcoord = (primary_bkgd_transform * a_texcoord).xy;
}
