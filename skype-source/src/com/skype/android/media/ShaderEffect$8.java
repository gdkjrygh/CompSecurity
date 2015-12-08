// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.media;


// Referenced classes of package com.skype.android.media:
//            ShaderEffect

static final class 
    implements ShaderEffect
{

    public final String a()
    {
        return "#extension GL_OES_EGL_image_external : require\nprecision mediump float; \nvarying vec2 vTextureCoord;\nuniform samplerExternalOES sTexture;\n// david van brink 2014\n// Given an xy in range (0, 1), return\n// the distorted \"distance from center\"\n// in range (0, 1) such that a fixed radius\n// cutoff gives a rounded square edge.\nfloat ovalFrame(vec2 xy)\n{\n    xy = 2.0 * xy - 1.0;\n    float ovoidness = 4.0;\n    xy = pow(xy, vec2(ovoidness, ovoidness));\n    return sqrt(dot(xy,xy));\n}\n\nfloat mapRangeAndClamp(float x, float inLow, float inHigh, float outLow, float outHigh)\n{\n    x -= inLow;\n    x = x * (outHigh - outLow) / (inHigh - inLow);\n    x += outLow;\n    if(outLow < outHigh)\n\t    x = clamp(x, outLow, outHigh);\n    else\n\t    x = clamp(x, outHigh, outLow);\n\n    return x;\n}\n\nvoid main()\n{\n    vec4 result = texture2D(sTexture, vTextureCoord);\n    \n    // black-and-white-ize it, with a blasted-out color curve\n    float gray = result.r * 0.3 + result.g * 0.8 + result.b * 0.2;\n    gray = pow(gray, 1.8) * 1.3;\n    result = vec4(gray * 0.9, gray * 0.9, gray , 1.0);\n    \n    // scanlines, adjust as needed for actual resolution\n    // too many and they get lost,\n    // too few and it's just stripes\n    float scanLineCount = 50.0;\n    float scanLineDarkening = sin(vTextureCoord.x * scanLineCount * 6.282);\n    scanLineDarkening = pow(scanLineDarkening, 3.0); // flatten it more\n    scanLineDarkening = mapRangeAndClamp(scanLineDarkening, -1.0, 1.0, 0.4, 1.0);\n    result *= scanLineDarkening;\n    \n    // Extra atmosphere with partial vignetting.\n    // We use a squarified circle.\n    float r = ovalFrame(vTextureCoord);\n    // Control width of border with inLow,inHigh \n    float darker = mapRangeAndClamp(r, 0.4, 0.46, 1.0, 0.2);\n    result *= darker;\n    \n    gl_FragColor = result;\n}\n";
    }

    ()
    {
    }
}
