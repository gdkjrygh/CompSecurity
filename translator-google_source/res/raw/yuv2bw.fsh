// Copyright 2011 Google Inc. All Rights Reserved.
// Author: sxp@google.com (Sameer Padala)
//
// Converts a NV21 texture into an BW texture.

precision mediump float;
varying vec2 v_texCoord;
uniform sampler2D y_texture;
uniform sampler2D uv_texture;

void main() {
  float Y = texture2D(y_texture, v_texCoord).r - 0.0625;

  // This line is unused, but it is required so that this shader can be drop-in
  // replacement for yuv2rgb.fsh. If it is removed, GLSL optimizes away the 
  // uniform sampler2D uv_texture which causes linker errors.
  vec2 VU = texture2D(uv_texture, v_texCoord).ra - vec2(0.5, 0.5);

  // For testing reasons, the shader will make the preview appear B&W
  gl_FragColor.rgb = vec3(Y, Y, Y);
  gl_FragColor.a = 1.0;
}
