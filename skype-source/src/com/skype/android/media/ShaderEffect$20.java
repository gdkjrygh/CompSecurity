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
        return "#extension GL_OES_EGL_image_external : require\nprecision mediump float; \nvarying vec2 vTextureCoord;\nuniform samplerExternalOES sTexture;\nvoid main() {\n  vec3 color = texture2D(sTexture, vTextureCoord).rgb;\n  float gamma = 1.0;\n  float numColors = 4.0;\n  color = pow(color, vec3(gamma, gamma, gamma));\n  color = color * numColors;\n  color = floor(color);\n  color = color / numColors;\n  color = pow(color, vec3(1.0/gamma));\n    gl_FragColor = vec4(color, 1.0);\n}\n";
    }

    ()
    {
    }
}
