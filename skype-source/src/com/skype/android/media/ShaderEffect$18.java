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
        return "#extension GL_OES_EGL_image_external : require\nprecision mediump float; \nvarying vec2 vTextureCoord;\nuniform samplerExternalOES sTexture;\nvoid main() {\n    vec4 tc = texture2D(sTexture, vTextureCoord);\n    vec3 lum = vec3(0.299, 0.587, 0.114);    float gray = dot(tc.xyz, lum);\n    gl_FragColor = vec4(gray, gray, gray, tc.w);\n    gl_FragColor.rgb *= vec3(1.15,1.1,0.8);\n}\n";
    }

    ()
    {
    }
}
