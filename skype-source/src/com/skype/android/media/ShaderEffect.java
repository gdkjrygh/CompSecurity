// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.media;


public interface ShaderEffect
{

    public static final ShaderEffect a = new ShaderEffect() {

        public final String a()
        {
            return "#extension GL_OES_EGL_image_external : require\nprecision mediump float; \nvarying vec2 vTextureCoord;\nuniform samplerExternalOES sTexture;\nvoid main() {\n    gl_FragColor = texture2D(sTexture, vTextureCoord);\n}\n";
        }

    };
    public static final ShaderEffect b = new ShaderEffect() {

        public final String a()
        {
            return "#extension GL_OES_EGL_image_external : require\nprecision mediump float; \nvarying vec2 vTextureCoord;\nuniform samplerExternalOES sTexture;\nvoid main() {\n    vec4 tc = texture2D(sTexture, vTextureCoord);\n    float color = tc.r * 0.3 + tc.g * 0.59 + tc.b * 0.11;\n    gl_FragColor = vec4(color, color, color, 1.0);\n}\n";
        }

    };
    public static final ShaderEffect c = new ShaderEffect() {

        public final String a()
        {
            return "#extension GL_OES_EGL_image_external : require\nprecision mediump float; \nvarying vec2 vTextureCoord;\nuniform samplerExternalOES sTexture;\nvoid main()\n{\nvec3 rgbColor = texture2D(sTexture, vTextureCoord).rgb;\n    vec3 blue = vec3(0.000, 0.50, 1.00);\n    float a=0.35;\n    float b=0.50;\n    float shft = max(0.1,rgbColor.b+rgbColor.r-rgbColor.g*2.0);\n    vec3 amplBlue = vec3(rgbColor.r+shft,rgbColor.g+shft,rgbColor.b+2.0*shft);\n    gl_FragColor = vec4(rgbColor*a+amplBlue*b+blue*(1.-a-b),1.);}\n";
        }

    };
    public static final ShaderEffect d = new ShaderEffect() {

        public final String a()
        {
            return "#extension GL_OES_EGL_image_external : require\nprecision mediump float; \nvarying vec2 vTextureCoord;\nuniform samplerExternalOES sTexture;\nvoid main()\n{\n    vec3 rgbColor = texture2D(sTexture, vTextureCoord).rgb;\n    vec3 pink = vec3(1.000, 0.412, 0.706);\n    vec3 colorNorm = normalize(rgbColor);\n    float p = dot(colorNorm, normalize(pink));\n    p = max(0.0,(p-0.8)*1.);\n    \n    vec3 amplRed = vec3(rgbColor.r+1.5*p,rgbColor.g,rgbColor.b+p);\n    gl_FragColor = vec4(amplRed,1);\n}\n";
        }

    };
    public static final ShaderEffect e = new ShaderEffect() {

        public final String a()
        {
            return "#extension GL_OES_EGL_image_external : require\nprecision mediump float; \nvarying vec2 vTextureCoord;\nuniform samplerExternalOES sTexture;\nvoid main() {\n    vec4 tc = texture2D(sTexture, vTextureCoord);\n    vec3 color = tc.rgb; \n    vec3 colorNorm = normalize(color); \n    float mixVal = dot(colorNorm, vec3(1.0, 0.0, 0.0));\n    mixVal = pow(mixVal, 7.0);\n    float g = dot(color, vec3(0.3, 0.59, 0.11)); \n    vec3 gray = vec3(g, g, g); \n    vec3 res = mix(gray, color, mixVal); \n    gl_FragColor = vec4(res.r, res.g, res.b, 1.0);\n}\n";
        }

    };
    public static final ShaderEffect f = new ShaderEffect() {

        public final String a()
        {
            return "#extension GL_OES_EGL_image_external : require\nprecision mediump float;\nvarying vec2 vTextureCoord;\nuniform samplerExternalOES sTexture;\nvec3 contrast_sat_bright(vec3 color, float brt, float sat, float con)\n{\n        const float AvgLumR = 0.5;\n        const float AvgLumG = 0.5;\n        const float AvgLumB = 0.5;\n        const vec3 LumCoeff = vec3(0.2125, 0.7154, 0.0721);\n        vec3 AvgLumin = vec3(AvgLumR, AvgLumG, AvgLumB);\n        vec3 brtColor = color * brt;\n        vec3 intensity = vec3(dot(brtColor, LumCoeff));\n        vec3 satColor = mix(intensity, brtColor, sat);\n        vec3 conColor = mix(AvgLumin, satColor, con);\n        return conColor;\n}\nvoid main() {\n    vec4 tc = texture2D(sTexture, vTextureCoord);\n    vec3 rgbaColor = contrast_sat_bright(tc.rgb, 1.3, 0.0, 1.2);\n    float y = dot(rgbaColor, vec3(0.299, 0.584, 0.114));\n    vec3 xrayColor = vec3(1.0, 1.0, 1.0) - (vec3(y, y, y) + vec3(-0.128, -0.242, -0.230)); \n    gl_FragColor = vec4(xrayColor, 1.0);\n}\n";
        }

    };
    public static final ShaderEffect g = new ShaderEffect() {

        public final String a()
        {
            return "#extension GL_OES_EGL_image_external : require\nprecision mediump float; \nvarying vec2 vTextureCoord;\nuniform samplerExternalOES sTexture;\nvoid main() {\n    vec4 tc = texture2D(sTexture, vTextureCoord);\n    vec3 lum = vec3(0.299, 0.587, 0.114);    float gray = dot(tc.xyz, lum);\n    gl_FragColor = vec4(gray, gray, gray, tc.w);\n    gl_FragColor.rgb *= vec3(1.15,1.1,0.8);\n}\n";
        }

    };
    public static final ShaderEffect h = new ShaderEffect() {

        public final String a()
        {
            return "#extension GL_OES_EGL_image_external : require\nprecision mediump float; \nvarying vec2 vTextureCoord;\nuniform samplerExternalOES sTexture;\nvoid main() {\n    float sX = 0.02;\n    float sY = 0.04;\n    vec2 texCoord = vec2(sX*ceil(vTextureCoord.x/sX), sY*ceil(vTextureCoord.y/sY));\n    gl_FragColor = texture2D(sTexture, texCoord);\n}\n";
        }

    };
    public static final ShaderEffect i = new ShaderEffect() {

        public final String a()
        {
            return "#extension GL_OES_EGL_image_external : require\nprecision mediump float; \nvarying vec2 vTextureCoord;\nuniform samplerExternalOES sTexture;\nvoid main() {\n  vec3 color = texture2D(sTexture, vTextureCoord).rgb;\n  float gamma = 1.0;\n  float numColors = 4.0;\n  color = pow(color, vec3(gamma, gamma, gamma));\n  color = color * numColors;\n  color = floor(color);\n  color = color / numColors;\n  color = pow(color, vec3(1.0/gamma));\n    gl_FragColor = vec4(color, 1.0);\n}\n";
        }

    };
    public static final ShaderEffect j = new ShaderEffect() {

        public final String a()
        {
            return "#extension GL_OES_EGL_image_external : require\nprecision mediump float; \nvarying vec2 vTextureCoord;\nuniform samplerExternalOES sTexture;\nvoid main() {\nvec2 normCoord = vTextureCoord * 2.0  - 1.0; \nfloat radius = length(normCoord); \nfloat phi = atan(normCoord.x, normCoord.y); \nradius = 2.0 * radius - radius * smoothstep(-0.4, 1.1, radius); \nnormCoord.y = radius * cos(phi);\nnormCoord.x = radius * sin(phi); \nvec2 texCoords = (normCoord + 1.0) * 0.5; \ngl_FragColor = texture2D(sTexture, texCoords); \n}\n";
        }

    };
    public static final ShaderEffect k = new ShaderEffect() {

        public final String a()
        {
            return "#extension GL_OES_EGL_image_external : require\nprecision mediump float; \nvarying vec2 vTextureCoord;\nuniform samplerExternalOES sTexture;\nvoid main() {\n    vec2 uv;\n    vec2 xy = 2.0 *vTextureCoord.xy - 1.0;\n    float d = length(xy);\n    float phi = atan(xy.x, xy.y); \n    if (d < 0.7) { \n      d = pow(d, 2.1) / sqrt(2.0);\n       float phi = atan(xy.y, xy.x);\n      uv.x = d*cos(phi) + 0.5;\n      uv.y = d*sin(phi) + 0.5;\n    } else {\n      uv = vTextureCoord;\n    }    gl_FragColor = texture2D(sTexture, uv); \n}\n";
        }

    };
    public static final ShaderEffect l = new ShaderEffect() {

        public final String a()
        {
            return "#extension GL_OES_EGL_image_external : require\nprecision mediump float; \nvarying vec2 vTextureCoord;\nuniform samplerExternalOES sTexture;\nvoid main() {\nvec2 normCoord = vTextureCoord * 2.0  - 1.0; \nfloat radius = length(normCoord); \nfloat phi = atan(normCoord.x, normCoord.y); \nphi = phi + (1.0 - smoothstep(-0.8, 0.8, radius)) * 2.0; \nnormCoord.y = radius * cos(phi);\nnormCoord.x = radius * sin(phi); \nvec2 texCoords = (normCoord + 1.0) * 0.5; \ngl_FragColor = texture2D(sTexture, texCoords); \n}\n";
        }

    };
    public static final ShaderEffect m = new ShaderEffect() {

        public final String a()
        {
            return "#extension GL_OES_EGL_image_external : require\nprecision mediump float; \nvarying vec2 vTextureCoord;\nuniform samplerExternalOES sTexture;\nvoid main() {\nvec2 normCoord = vTextureCoord * 2.0  - 1.0; \nfloat radius = length(normCoord); \nfloat phi = atan(normCoord.x, normCoord.y); \nradius = pow(radius, 1.0/1.75) * 0.8; \nnormCoord.y = radius * cos(phi);\nnormCoord.x = radius * sin(phi); \nvec2 texCoords = (normCoord + 1.0) * 0.5; \ngl_FragColor = texture2D(sTexture, texCoords); \n}\n";
        }

    };
    public static final ShaderEffect n = new ShaderEffect() {

        public final String a()
        {
            return "#extension GL_OES_EGL_image_external : require\nprecision mediump float; \nvarying vec2 vTextureCoord;\nuniform samplerExternalOES sTexture;\nvoid main() {\nvec2 normCoord = vTextureCoord * 2.0  - 1.0; \nvec2 s = sign(normCoord); \nnormCoord = abs(normCoord); \nnormCoord = 0.5 * normCoord + 0.5 * smoothstep(0.25, 0.5, normCoord) * normCoord;\nnormCoord = s * normCoord; \nvec2 texCoords = (normCoord + 1.0) * 0.5; \ngl_FragColor = texture2D(sTexture, texCoords); \n}\n";
        }

    };
    public static final ShaderEffect o = new ShaderEffect() {

        public final String a()
        {
            return "#extension GL_OES_EGL_image_external : require\nprecision mediump float; \nvarying vec2 vTextureCoord;\nuniform samplerExternalOES sTexture;\nvoid main() {\nvec2 texCoords; \ntexCoords.x = vTextureCoord.x + 0.001;\ntexCoords.y = vTextureCoord.y + 0.001;\nvec4 color = texture2D(sTexture, texCoords); \nvec4 col1 = color.bgra;\n texCoords.x = vTextureCoord.x - 0.001;\n texCoords.y = vTextureCoord.y - 0.001;\n color = texture2D(sTexture, texCoords); \nvec4 col2 = color.bgra;\n vec4 col = 2.0 * (col2 - col1); \ncol.r = 0.5 - col.r;\ncol.g = 0.5 - col.g;\ncol.b = 0.5 - col.b;\nfloat finalColor = (col.r + col.g + col.b) / 3.0;\ngl_FragColor = vec4(finalColor, finalColor, finalColor, 1.0); \n}\n";
        }

    };
    public static final ShaderEffect p = new ShaderEffect() {

        public final String a()
        {
            return "#extension GL_OES_EGL_image_external : require\nprecision mediump float; \nvarying vec2 vTextureCoord;\nuniform samplerExternalOES sTexture;\n// david van brink 2014\n// Given an xy in range (0, 1), return\n// the distorted \"distance from center\"\n// in range (0, 1) such that a fixed radius\n// cutoff gives a rounded square edge.\nfloat ovalFrame(vec2 xy)\n{\n    xy = 2.0 * xy - 1.0;\n    float ovoidness = 4.0;\n    xy = pow(xy, vec2(ovoidness, ovoidness));\n    return sqrt(dot(xy,xy));\n}\n\nfloat mapRangeAndClamp(float x, float inLow, float inHigh, float outLow, float outHigh)\n{\n    x -= inLow;\n    x = x * (outHigh - outLow) / (inHigh - inLow);\n    x += outLow;\n    if(outLow < outHigh)\n\t    x = clamp(x, outLow, outHigh);\n    else\n\t    x = clamp(x, outHigh, outLow);\n\n    return x;\n}\n\nvoid main()\n{\n    vec4 result = texture2D(sTexture, vTextureCoord);\n    \n    // black-and-white-ize it, with a blasted-out color curve\n    float gray = result.r * 0.3 + result.g * 0.8 + result.b * 0.2;\n    gray = pow(gray, 1.8) * 1.3;\n    result = vec4(gray * 0.9, gray * 0.9, gray , 1.0);\n    \n    // scanlines, adjust as needed for actual resolution\n    // too many and they get lost,\n    // too few and it's just stripes\n    float scanLineCount = 50.0;\n    float scanLineDarkening = sin(vTextureCoord.x * scanLineCount * 6.282);\n    scanLineDarkening = pow(scanLineDarkening, 3.0); // flatten it more\n    scanLineDarkening = mapRangeAndClamp(scanLineDarkening, -1.0, 1.0, 0.4, 1.0);\n    result *= scanLineDarkening;\n    \n    // Extra atmosphere with partial vignetting.\n    // We use a squarified circle.\n    float r = ovalFrame(vTextureCoord);\n    // Control width of border with inLow,inHigh \n    float darker = mapRangeAndClamp(r, 0.4, 0.46, 1.0, 0.2);\n    result *= darker;\n    \n    gl_FragColor = result;\n}\n";
        }

    };
    public static final ShaderEffect q = new ShaderEffect() {

        public final String a()
        {
            return "#extension GL_OES_EGL_image_external : require\nprecision mediump float; \n// david van brink 2014\nvarying vec2 vTextureCoord;\nuniform samplerExternalOES sTexture;\nvoid main()  {\nfloat buttomY = min(vTextureCoord.y, 1.0 - vTextureCoord.y); \nvec2 leftSample = vec2(vTextureCoord.x, buttomY); \nvec4 result = texture2D(sTexture, leftSample); \ngl_FragColor = result; \n}\n";
        }

    };
    public static final ShaderEffect r = new ShaderEffect() {

        public final String a()
        {
            return "#extension GL_OES_EGL_image_external : require\nprecision mediump float; \nvarying vec2 vTextureCoord;\nuniform samplerExternalOES sTexture;\nvoid main()  {\nvec2 m = vec2(0.5,0.5);\n    vec2 kz = vec2(1.0, 0.625); \n    vec2 nt = (vTextureCoord - m)*kz;\n    vec2 f = (step(nt.y,nt.x)*step(nt.y,-nt.x))*vec2(nt.x,nt.y) + (step(-nt.y,nt.x)*step(-nt.y,-nt.x))*vec2(nt.x,-nt.y) + (step(nt.x,-nt.y)*step(nt.x,nt.y))*vec2(nt.y,nt.x) + (step(-nt.x,-nt.y)*step(-nt.x,nt.y))*vec2(nt.y,-nt.x);\n    f.x = abs(f.x);    \n    f.y += 0.4;\n    vec2 res = f/kz + m;\n    gl_FragColor = texture2D(sTexture, res);}\n";
        }

    };
    public static final ShaderEffect s = new ShaderEffect() {

        public final String a()
        {
            return "#extension GL_OES_EGL_image_external : require\nprecision mediump float; \nvarying vec2 vTextureCoord;\nuniform samplerExternalOES sTexture;\nvoid main()  {\n    float a = 1.0;\n    float b = 0.625;\n    float x0 = vTextureCoord.x;\n    float y0 = vTextureCoord.y;\n    float k1 = -0.70710678118*(1.0-2.0*step(x0,0.5));\n    float k2 = -0.70710678118*(1.0-2.0*step(y0,0.5));\n    float x1 = (k1*(x0-0.5)*a - k2*(y0-0.5)*b)+0.5; \n    float y1 = (k1*(x0-0.5)*a + k2*(y0-0.5)*b)+0.5; \n    x1 = 0.5-abs(x1-0.5);    \n    y1 += 0.4;\n    gl_FragColor = texture2D(sTexture, vec2(1.0-y1, 1.0-x1));\n}\n";
        }

    };
    public static final ShaderEffect t = new ShaderEffect() {

        public final String a()
        {
            return "#extension GL_OES_EGL_image_external : require\nprecision mediump float;varying  vec2 vTextureCoord;\nuniform samplerExternalOES sTexture;\nfloat intensity = 1.0;\nfloat width = 480.0; \nfloat height = 480.0; \nfloat blurStep = 0.2 ;\nconst vec3 W = vec3(0.2125, 0.7154, 0.0721);\nvoid main()\n {\nvec4 sample0, sample1, sample2, sample3;\nfloat step = blurStep / 100.0;\nsample0 = texture2D(sTexture, \n       vec2(vTextureCoord.x - step, vTextureCoord.y - step)); \n sample1 = texture2D(sTexture, \n       vec2(vTextureCoord.x + step, vTextureCoord.y + step)); \n sample2 = texture2D(sTexture, \n       vec2(vTextureCoord.x - step, vTextureCoord.y + step)); \n sample3 = texture2D(sTexture, \n       vec2(vTextureCoord.x + step, vTextureCoord.y - step)); \n vec3 textureColor = texture2D(sTexture, vTextureCoord).rgb;\nvec2 stp0 = vec2(1.0 / width, 0.0);\nvec2 st0p = vec2(0.0, 1.0 / height);\nvec2 stpp = vec2(1.0 / width, 1.0 / height);\nvec2 stpm = vec2(1.0 / width, -1.0 / height);\nfloat center   = dot( textureColor, W);\nfloat im1m1 = dot( texture2D(sTexture, vTextureCoord - stpp).rgb, W);\nfloat ip1p1 = dot( texture2D(sTexture, vTextureCoord + stpp).rgb, W);\nfloat im1p1 = dot( texture2D(sTexture, vTextureCoord - stpm).rgb, W);\nfloat ip1m1 = dot( texture2D(sTexture, vTextureCoord + stpm).rgb, W);\nfloat im10 = dot( texture2D(sTexture, vTextureCoord - stp0).rgb, W);\nfloat ip10 = dot( texture2D(sTexture, vTextureCoord + stp0).rgb, W);\nfloat i0m1 = dot( texture2D(sTexture, vTextureCoord - st0p).rgb, W);\nfloat i0p1 = dot( texture2D(sTexture, vTextureCoord + st0p).rgb, W);\nfloat horizontal = -im1p1 - 2.0 * i0p1 - ip1p1 + im1m1 + 2.0 * i0m1 + ip1m1;\nfloat vertical = -im1m1 - 2.0 * im10 - im1p1 + ip1m1 + 2.0 * ip10 + ip1p1;\nfloat mag = 1.0 - length(vec2(horizontal, vertical));\nvec3 target = vec3(mag);\nvec3 resultEdge = pow(mix(textureColor, target, intensity), vec3(3.0));\nvec4 resultBlur = (sample0 + sample1 + sample2 + sample3)/4.0;\nvec3 result;\n if (dot(resultEdge, W) < 0.1) { \n    result = resultEdge;}\n else { \n     result = floor(resultBlur.rgb * 16.0)/16.0; \n}\n    gl_FragColor = vec4(result, 1.0);\n }";
        }

    };

    public abstract String a();

}
