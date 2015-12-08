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
        return "#extension GL_OES_EGL_image_external : require\nprecision mediump float; \nvarying vec2 vTextureCoord;\nuniform samplerExternalOES sTexture;\nvoid main() {\n    vec2 uv;\n    vec2 xy = 2.0 *vTextureCoord.xy - 1.0;\n    float d = length(xy);\n    float phi = atan(xy.x, xy.y); \n    if (d < 0.7) { \n      d = pow(d, 2.1) / sqrt(2.0);\n       float phi = atan(xy.y, xy.x);\n      uv.x = d*cos(phi) + 0.5;\n      uv.y = d*sin(phi) + 0.5;\n    } else {\n      uv = vTextureCoord;\n    }    gl_FragColor = texture2D(sTexture, uv); \n}\n";
    }

    ()
    {
    }
}
