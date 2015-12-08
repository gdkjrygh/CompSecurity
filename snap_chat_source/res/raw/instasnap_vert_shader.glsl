attribute vec4 a_Position;
attribute vec2 a_TexCoordinate;
attribute vec2 a_CircleCoordinate;
			  
varying vec2 v_TexCoordinate;
varying vec2 v_CircleCoordinate;

void main() {
    gl_Position = a_Position;
    v_TexCoordinate = a_TexCoordinate;
    v_CircleCoordinate = a_CircleCoordinate;
}


