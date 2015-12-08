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
        return "#extension GL_OES_EGL_image_external : require\nprecision mediump float; \nvarying vec2 vTextureCoord;\nuniform samplerExternalOES sTexture;\nvoid main()\n{\nvec3 rgbColor = texture2D(sTexture, vTextureCoord).rgb;\n    vec3 blue = vec3(0.000, 0.50, 1.00);\n    float a=0.35;\n    float b=0.50;\n    float shft = max(0.1,rgbColor.b+rgbColor.r-rgbColor.g*2.0);\n    vec3 amplBlue = vec3(rgbColor.r+shft,rgbColor.g+shft,rgbColor.b+2.0*shft);\n    gl_FragColor = vec4(rgbColor*a+amplBlue*b+blue*(1.-a-b),1.);}\n";
    }

    ()
    {
    }
}
