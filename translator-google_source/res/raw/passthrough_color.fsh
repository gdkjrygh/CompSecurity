// Copyright 2011 Google Inc. All Rights Reserved.
// Author: sxp@google.com (Sameer Padala)
//
// Passes color data through to the frame buffer without any calculations.

precision mediump float;
uniform vec4 color;

void main() {
  gl_FragColor = color;
}
