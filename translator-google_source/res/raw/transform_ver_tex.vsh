// Copyright 2011 Google Inc. All Rights Reserved.
// Author: sxp@google.com (Sameer Padala)
//
// Passes the vertex and texture data through to the fragment shader. Performs
// a standard Perspective-View matrix transformation on the vertex data

attribute vec4 vPosition;
uniform mat4 PVMatrix;

attribute vec2 a_texCoord;
varying vec2 v_texCoord;

void main() {
  gl_Position = PVMatrix * vPosition;
  v_texCoord = a_texCoord;
}
