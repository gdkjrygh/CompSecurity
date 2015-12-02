uniform mat4 uSTMatrix;

attribute vec2 aPosition;
attribute vec4 aTextureCoord;

varying vec2 vTextureCoord;

void main() {
    gl_Position = vec4(aPosition * vec2(1.0, -1.0), 0.0, 1.0);
    vTextureCoord = (uSTMatrix * aTextureCoord).xy;
}