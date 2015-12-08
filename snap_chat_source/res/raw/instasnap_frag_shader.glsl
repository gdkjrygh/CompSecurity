precision mediump float;

uniform sampler2D u_TextureY;
uniform sampler2D u_TextureVU;
uniform float u_CircleRadius;

varying vec2 v_TexCoordinate;
varying vec2 v_CircleCoordinate;

void main() {
    // Sample from camera texture.
    float y = texture2D(u_TextureY, v_TexCoordinate).r;
    float cr = texture2D(u_TextureVU, v_TexCoordinate).r - 0.5;
    float cb = texture2D(u_TextureVU, v_TexCoordinate).a - 0.5;

    float radius = distance(v_CircleCoordinate, vec2(0.0, 0.0));

    // This is 1.0 if in the circle, 0.0 if not.
    float inCircle = float(radius < u_CircleRadius);

    // Convert to RGB color space.
    float r = (y + 1.403 * cr) * inCircle;
    float g = (y - 0.344 * cb - 0.714 * cr) * inCircle;
    float b = (y + 1.773 * cb) * inCircle;

    gl_FragColor = vec4(r, g, b, inCircle);
}
