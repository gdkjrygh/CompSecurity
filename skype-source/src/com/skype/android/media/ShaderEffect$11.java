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
        return "#extension GL_OES_EGL_image_external : require\nprecision mediump float; \nvarying vec2 vTextureCoord;\nuniform samplerExternalOES sTexture;\nvoid main()  {\n    float a = 1.0;\n    float b = 0.625;\n    float x0 = vTextureCoord.x;\n    float y0 = vTextureCoord.y;\n    float k1 = -0.70710678118*(1.0-2.0*step(x0,0.5));\n    float k2 = -0.70710678118*(1.0-2.0*step(y0,0.5));\n    float x1 = (k1*(x0-0.5)*a - k2*(y0-0.5)*b)+0.5; \n    float y1 = (k1*(x0-0.5)*a + k2*(y0-0.5)*b)+0.5; \n    x1 = 0.5-abs(x1-0.5);    \n    y1 += 0.4;\n    gl_FragColor = texture2D(sTexture, vec2(1.0-y1, 1.0-x1));\n}\n";
    }

    ()
    {
    }
}
