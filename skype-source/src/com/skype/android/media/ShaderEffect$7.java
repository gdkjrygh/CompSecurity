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
        return "#extension GL_OES_EGL_image_external : require\nprecision mediump float; \nvarying vec2 vTextureCoord;\nuniform samplerExternalOES sTexture;\nvoid main() {\nvec2 texCoords; \ntexCoords.x = vTextureCoord.x + 0.001;\ntexCoords.y = vTextureCoord.y + 0.001;\nvec4 color = texture2D(sTexture, texCoords); \nvec4 col1 = color.bgra;\n texCoords.x = vTextureCoord.x - 0.001;\n texCoords.y = vTextureCoord.y - 0.001;\n color = texture2D(sTexture, texCoords); \nvec4 col2 = color.bgra;\n vec4 col = 2.0 * (col2 - col1); \ncol.r = 0.5 - col.r;\ncol.g = 0.5 - col.g;\ncol.b = 0.5 - col.b;\nfloat finalColor = (col.r + col.g + col.b) / 3.0;\ngl_FragColor = vec4(finalColor, finalColor, finalColor, 1.0); \n}\n";
    }

    ()
    {
    }
}
