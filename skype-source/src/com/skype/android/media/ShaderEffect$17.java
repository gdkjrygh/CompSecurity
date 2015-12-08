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
        return "#extension GL_OES_EGL_image_external : require\nprecision mediump float;\nvarying vec2 vTextureCoord;\nuniform samplerExternalOES sTexture;\nvec3 contrast_sat_bright(vec3 color, float brt, float sat, float con)\n{\n        const float AvgLumR = 0.5;\n        const float AvgLumG = 0.5;\n        const float AvgLumB = 0.5;\n        const vec3 LumCoeff = vec3(0.2125, 0.7154, 0.0721);\n        vec3 AvgLumin = vec3(AvgLumR, AvgLumG, AvgLumB);\n        vec3 brtColor = color * brt;\n        vec3 intensity = vec3(dot(brtColor, LumCoeff));\n        vec3 satColor = mix(intensity, brtColor, sat);\n        vec3 conColor = mix(AvgLumin, satColor, con);\n        return conColor;\n}\nvoid main() {\n    vec4 tc = texture2D(sTexture, vTextureCoord);\n    vec3 rgbaColor = contrast_sat_bright(tc.rgb, 1.3, 0.0, 1.2);\n    float y = dot(rgbaColor, vec3(0.299, 0.584, 0.114));\n    vec3 xrayColor = vec3(1.0, 1.0, 1.0) - (vec3(y, y, y) + vec3(-0.128, -0.242, -0.230)); \n    gl_FragColor = vec4(xrayColor, 1.0);\n}\n";
    }

    ()
    {
    }
}
