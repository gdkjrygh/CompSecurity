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
        return "#extension GL_OES_EGL_image_external : require\nprecision mediump float; \nvarying vec2 vTextureCoord;\nuniform samplerExternalOES sTexture;\nvoid main() {\nvec2 normCoord = vTextureCoord * 2.0  - 1.0; \nfloat radius = length(normCoord); \nfloat phi = atan(normCoord.x, normCoord.y); \nphi = phi + (1.0 - smoothstep(-0.8, 0.8, radius)) * 2.0; \nnormCoord.y = radius * cos(phi);\nnormCoord.x = radius * sin(phi); \nvec2 texCoords = (normCoord + 1.0) * 0.5; \ngl_FragColor = texture2D(sTexture, texCoords); \n}\n";
    }

    ()
    {
    }
}
