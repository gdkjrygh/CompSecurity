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
        return "#extension GL_OES_EGL_image_external : require\nprecision mediump float; \nvarying vec2 vTextureCoord;\nuniform samplerExternalOES sTexture;\nvoid main()\n{\n    vec3 rgbColor = texture2D(sTexture, vTextureCoord).rgb;\n    vec3 pink = vec3(1.000, 0.412, 0.706);\n    vec3 colorNorm = normalize(rgbColor);\n    float p = dot(colorNorm, normalize(pink));\n    p = max(0.0,(p-0.8)*1.);\n    \n    vec3 amplRed = vec3(rgbColor.r+1.5*p,rgbColor.g,rgbColor.b+p);\n    gl_FragColor = vec4(amplRed,1);\n}\n";
    }

    ()
    {
    }
}
