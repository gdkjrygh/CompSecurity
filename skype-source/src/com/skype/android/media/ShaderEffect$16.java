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
        return "#extension GL_OES_EGL_image_external : require\nprecision mediump float; \nvarying vec2 vTextureCoord;\nuniform samplerExternalOES sTexture;\nvoid main() {\n    vec4 tc = texture2D(sTexture, vTextureCoord);\n    vec3 color = tc.rgb; \n    vec3 colorNorm = normalize(color); \n    float mixVal = dot(colorNorm, vec3(1.0, 0.0, 0.0));\n    mixVal = pow(mixVal, 7.0);\n    float g = dot(color, vec3(0.3, 0.59, 0.11)); \n    vec3 gray = vec3(g, g, g); \n    vec3 res = mix(gray, color, mixVal); \n    gl_FragColor = vec4(res.r, res.g, res.b, 1.0);\n}\n";
    }

    ()
    {
    }
}
