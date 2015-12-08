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
        return "#extension GL_OES_EGL_image_external : require\nprecision mediump float;varying  vec2 vTextureCoord;\nuniform samplerExternalOES sTexture;\nfloat intensity = 1.0;\nfloat width = 480.0; \nfloat height = 480.0; \nfloat blurStep = 0.2 ;\nconst vec3 W = vec3(0.2125, 0.7154, 0.0721);\nvoid main()\n {\nvec4 sample0, sample1, sample2, sample3;\nfloat step = blurStep / 100.0;\nsample0 = texture2D(sTexture, \n       vec2(vTextureCoord.x - step, vTextureCoord.y - step)); \n sample1 = texture2D(sTexture, \n       vec2(vTextureCoord.x + step, vTextureCoord.y + step)); \n sample2 = texture2D(sTexture, \n       vec2(vTextureCoord.x - step, vTextureCoord.y + step)); \n sample3 = texture2D(sTexture, \n       vec2(vTextureCoord.x + step, vTextureCoord.y - step)); \n vec3 textureColor = texture2D(sTexture, vTextureCoord).rgb;\nvec2 stp0 = vec2(1.0 / width, 0.0);\nvec2 st0p = vec2(0.0, 1.0 / height);\nvec2 stpp = vec2(1.0 / width, 1.0 / height);\nvec2 stpm = vec2(1.0 / width, -1.0 / height);\nfloat center   = dot( textureColor, W);\nfloat im1m1 = dot( texture2D(sTexture, vTextureCoord - stpp).rgb, W);\nfloat ip1p1 = dot( texture2D(sTexture, vTextureCoord + stpp).rgb, W);\nfloat im1p1 = dot( texture2D(sTexture, vTextureCoord - stpm).rgb, W);\nfloat ip1m1 = dot( texture2D(sTexture, vTextureCoord + stpm).rgb, W);\nfloat im10 = dot( texture2D(sTexture, vTextureCoord - stp0).rgb, W);\nfloat ip10 = dot( texture2D(sTexture, vTextureCoord + stp0).rgb, W);\nfloat i0m1 = dot( texture2D(sTexture, vTextureCoord - st0p).rgb, W);\nfloat i0p1 = dot( texture2D(sTexture, vTextureCoord + st0p).rgb, W);\nfloat horizontal = -im1p1 - 2.0 * i0p1 - ip1p1 + im1m1 + 2.0 * i0m1 + ip1m1;\nfloat vertical = -im1m1 - 2.0 * im10 - im1p1 + ip1m1 + 2.0 * ip10 + ip1p1;\nfloat mag = 1.0 - length(vec2(horizontal, vertical));\nvec3 target = vec3(mag);\nvec3 resultEdge = pow(mix(textureColor, target, intensity), vec3(3.0));\nvec4 resultBlur = (sample0 + sample1 + sample2 + sample3)/4.0;\nvec3 result;\n if (dot(resultEdge, W) < 0.1) { \n    result = resultEdge;}\n else { \n     result = floor(resultBlur.rgb * 16.0)/16.0; \n}\n    gl_FragColor = vec4(result, 1.0);\n }";
    }

    ()
    {
    }
}
