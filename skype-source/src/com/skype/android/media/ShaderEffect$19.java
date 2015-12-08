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
        return "#extension GL_OES_EGL_image_external : require\nprecision mediump float; \nvarying vec2 vTextureCoord;\nuniform samplerExternalOES sTexture;\nvoid main() {\n    float sX = 0.02;\n    float sY = 0.04;\n    vec2 texCoord = vec2(sX*ceil(vTextureCoord.x/sX), sY*ceil(vTextureCoord.y/sY));\n    gl_FragColor = texture2D(sTexture, texCoord);\n}\n";
    }

    ()
    {
    }
}
