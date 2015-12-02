#extension GL_OES_EGL_image_external : require

precision mediump float;      // highp here doesn't seem to matter
varying vec2 vTextureCoord;
uniform samplerExternalOES sTexture;

void main() {
    gl_FragColor = texture2D(sTexture, vTextureCoord);
}