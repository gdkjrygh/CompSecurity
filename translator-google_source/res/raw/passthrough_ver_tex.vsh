// Copyright 2011 Google Inc. All Rights Reserved.
// Author: sxp@google.com (Sameer Padala)
//
// Passes the vertex and texture data through to the fragment shader without
// any calculations.

attribute vec4 vPosition;
attribute vec2 a_texCoord;
varying vec2 v_texCoord;

void main() {
  gl_Position = vPosition;
  v_texCoord = a_texCoord;
}
