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
        return "#extension GL_OES_EGL_image_external : require\nprecision mediump float; \nvarying vec2 vTextureCoord;\nuniform samplerExternalOES sTexture;\nvoid main() {\nvec2 normCoord = vTextureCoord * 2.0  - 1.0; \nvec2 s = sign(normCoord); \nnormCoord = abs(normCoord); \nnormCoord = 0.5 * normCoord + 0.5 * smoothstep(0.25, 0.5, normCoord) * normCoord;\nnormCoord = s * normCoord; \nvec2 texCoords = (normCoord + 1.0) * 0.5; \ngl_FragColor = texture2D(sTexture, texCoords); \n}\n";
    }

    ()
    {
    }
}
