// Copyright 2011 Google Inc. All Rights Reserved.
// Author: sxp@google.com (Sameer Padala)
//
// Converts a NV21 texture into an RGB texture.

precision mediump float;
varying vec2 v_texCoord;
uniform sampler2D y_texture;
uniform sampler2D uv_texture;

// From http://www.fourcc.org/fccyvrgb.php
void main() {
  float Y = texture2D(y_texture, v_texCoord).r - 0.0625;

  // Note that NV21 has the V channel before the U channel
  vec2 VU = texture2D(uv_texture, v_texCoord).ra - vec2(0.5, 0.5);

  gl_FragColor.r = 1.164 * Y + (1.596) * VU.x;
  gl_FragColor.g = 1.164 * Y - (0.813) * VU.x - (0.391) * VU.y;
  gl_FragColor.b = 1.164 * Y                  + (2.018) * VU.y;
  gl_FragColor.a = 1.0;
}
