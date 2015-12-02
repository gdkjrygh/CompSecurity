attribute vec4 aPosition;
attribute vec4 aTextureCoord;

uniform mat4 uSTMatrix;
uniform mat4 uConstMatrix;

varying vec2 vTextureCoord;

void main() {
  gl_Position = aPosition;
  vTextureCoord = (uSTMatrix * uConstMatrix * aTextureCoord).xy;
}
