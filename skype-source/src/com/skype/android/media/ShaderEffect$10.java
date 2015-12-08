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
        return "#extension GL_OES_EGL_image_external : require\nprecision mediump float; \nvarying vec2 vTextureCoord;\nuniform samplerExternalOES sTexture;\nvoid main()  {\nvec2 m = vec2(0.5,0.5);\n    vec2 kz = vec2(1.0, 0.625); \n    vec2 nt = (vTextureCoord - m)*kz;\n    vec2 f = (step(nt.y,nt.x)*step(nt.y,-nt.x))*vec2(nt.x,nt.y) + (step(-nt.y,nt.x)*step(-nt.y,-nt.x))*vec2(nt.x,-nt.y) + (step(nt.x,-nt.y)*step(nt.x,nt.y))*vec2(nt.y,nt.x) + (step(-nt.x,-nt.y)*step(-nt.x,nt.y))*vec2(nt.y,-nt.x);\n    f.x = abs(f.x);    \n    f.y += 0.4;\n    vec2 res = f/kz + m;\n    gl_FragColor = texture2D(sTexture, res);}\n";
    }

    ()
    {
    }
}
