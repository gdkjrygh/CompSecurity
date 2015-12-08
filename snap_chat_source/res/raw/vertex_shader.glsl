attribute vec4 aPosition;
attribute vec2 aTextureCoord;

varying float vHorizontalPosition; // from 0-1
varying vec2 vTextureCoord;

uniform mat4 uModelViewProjectionMatrix;

void main() {
    gl_Position = uModelViewProjectionMatrix * aPosition;
    vHorizontalPosition = gl_Position.x / 2.0 + 0.5;
    vTextureCoord = aTextureCoord.xy;
}
