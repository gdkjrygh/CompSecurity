// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package androidx.media.filterpacks.image;

import ahn;
import ahs;
import ahv;
import aif;
import ajl;
import ajo;
import ajr;
import aju;
import ajw;
import java.nio.ByteBuffer;

public class GaussianFilter7x7 extends ahn
{

    private static final String mGaussian1x7Source = "precision mediump float;\nuniform sampler2D tex_sampler_0;\nuniform float pix;\nuniform float pix2;\nuniform float pix3;\nvarying vec2 v_texcoord;\nvoid main() {\n  vec4 a1 = 0.0044 * texture2D(tex_sampler_0, v_texcoord + vec2(-pix3, 0.0));\n  vec4 a2 = 0.0540 * texture2D(tex_sampler_0, v_texcoord + vec2(-pix2, 0.0));\n  vec4 a3 = 0.2420 * texture2D(tex_sampler_0, v_texcoord + vec2(-pix, 0.0));\n  vec4 a4 = 0.3992 * texture2D(tex_sampler_0, v_texcoord + vec2(0.0, 0.0));\n  vec4 a5 = 0.2420 * texture2D(tex_sampler_0, v_texcoord + vec2(pix, 0.0));\n  vec4 a6 = 0.0540 * texture2D(tex_sampler_0, v_texcoord + vec2(pix2, 0.0));\n  vec4 a7 = 0.0044 * texture2D(tex_sampler_0, v_texcoord + vec2(pix3, 0.0));\n  gl_FragColor = a1 + a2 + a3 + a4 + a5 + a6 + a7;\n}\n";
    private static final String mGaussian7x1Source = "precision mediump float;\nuniform sampler2D tex_sampler_0;\nuniform float pix;\nuniform float pix2;\nuniform float pix3;\nvarying vec2 v_texcoord;\nvoid main() {\n  vec4 a1 = 0.0044 * texture2D(tex_sampler_0, v_texcoord + vec2(0.0, -pix3));\n  vec4 a2 = 0.0540 * texture2D(tex_sampler_0, v_texcoord + vec2(0.0, -pix2));\n  vec4 a3 = 0.2420 * texture2D(tex_sampler_0, v_texcoord + vec2(0.0, -pix));\n  vec4 a4 = 0.3992 * texture2D(tex_sampler_0, v_texcoord + vec2(0.0, 0.0));\n  vec4 a5 = 0.2420 * texture2D(tex_sampler_0, v_texcoord + vec2(0.0, pix));\n  vec4 a6 = 0.0540 * texture2D(tex_sampler_0, v_texcoord + vec2(0.0, pix2));\n  vec4 a7 = 0.0044 * texture2D(tex_sampler_0, v_texcoord + vec2(0.0, pix3));\n  gl_FragColor = a1 + a2 + a3 + a4 + a5 + a6 + a7;\n}\n";
    private ajl mGaussian1x7Shader;
    private ajl mGaussian7x1Shader;
    private aif mImageType;

    public GaussianFilter7x7(ajr ajr, String s)
    {
        super(ajr, s);
    }

    private static native boolean blur(int i, int j, ByteBuffer bytebuffer, ByteBuffer bytebuffer1);

    public final ajw b()
    {
        aif aif1 = aif.a(301, 2);
        aif aif2 = aif.a(301, 16);
        return (new ajw()).a("image", 2, aif1).b("image", 1, aif2).a();
    }

    protected final void c()
    {
        if (r())
        {
            mGaussian7x1Shader = new ajl("precision mediump float;\nuniform sampler2D tex_sampler_0;\nuniform float pix;\nuniform float pix2;\nuniform float pix3;\nvarying vec2 v_texcoord;\nvoid main() {\n  vec4 a1 = 0.0044 * texture2D(tex_sampler_0, v_texcoord + vec2(0.0, -pix3));\n  vec4 a2 = 0.0540 * texture2D(tex_sampler_0, v_texcoord + vec2(0.0, -pix2));\n  vec4 a3 = 0.2420 * texture2D(tex_sampler_0, v_texcoord + vec2(0.0, -pix));\n  vec4 a4 = 0.3992 * texture2D(tex_sampler_0, v_texcoord + vec2(0.0, 0.0));\n  vec4 a5 = 0.2420 * texture2D(tex_sampler_0, v_texcoord + vec2(0.0, pix));\n  vec4 a6 = 0.0540 * texture2D(tex_sampler_0, v_texcoord + vec2(0.0, pix2));\n  vec4 a7 = 0.0044 * texture2D(tex_sampler_0, v_texcoord + vec2(0.0, pix3));\n  gl_FragColor = a1 + a2 + a3 + a4 + a5 + a6 + a7;\n}\n");
            mGaussian1x7Shader = new ajl("precision mediump float;\nuniform sampler2D tex_sampler_0;\nuniform float pix;\nuniform float pix2;\nuniform float pix3;\nvarying vec2 v_texcoord;\nvoid main() {\n  vec4 a1 = 0.0044 * texture2D(tex_sampler_0, v_texcoord + vec2(-pix3, 0.0));\n  vec4 a2 = 0.0540 * texture2D(tex_sampler_0, v_texcoord + vec2(-pix2, 0.0));\n  vec4 a3 = 0.2420 * texture2D(tex_sampler_0, v_texcoord + vec2(-pix, 0.0));\n  vec4 a4 = 0.3992 * texture2D(tex_sampler_0, v_texcoord + vec2(0.0, 0.0));\n  vec4 a5 = 0.2420 * texture2D(tex_sampler_0, v_texcoord + vec2(pix, 0.0));\n  vec4 a6 = 0.0540 * texture2D(tex_sampler_0, v_texcoord + vec2(pix2, 0.0));\n  vec4 a7 = 0.0044 * texture2D(tex_sampler_0, v_texcoord + vec2(pix3, 0.0));\n  gl_FragColor = a1 + a2 + a3 + a4 + a5 + a6 + a7;\n}\n");
            mImageType = aif.a(301, 18);
        }
    }

    protected final void e()
    {
        ahv ahv1;
        ahv ahv3;
        aju aju1 = b("image");
        ahv3 = a("image").a().h();
        int ai[] = ahv3.l();
        ahv ahv2;
        if (aju1 != null)
        {
            ahv1 = aju1.a(ai).h();
        } else
        {
            ahv1 = null;
        }
        if (!r()) goto _L2; else goto _L1
_L1:
        mGaussian7x1Shader.a("pix", 1.0F / (float)ai[1]);
        mGaussian7x1Shader.a("pix2", 2.0F / (float)ai[1]);
        mGaussian7x1Shader.a("pix3", 3F / (float)ai[1]);
        mGaussian1x7Shader.a("pix", 1.0F / (float)ai[0]);
        mGaussian1x7Shader.a("pix2", 2.0F / (float)ai[0]);
        mGaussian1x7Shader.a("pix3", 3F / (float)ai[0]);
        ahv2 = ahs.a(mImageType, ai).h();
        if (aju1 != null)
        {
            mGaussian7x1Shader.a(ahv3, ahv2);
            mGaussian1x7Shader.a(ahv2, ahv1);
        }
        ahv2.i();
_L4:
        if (ahv1 != null)
        {
            aju1.a(ahv1);
        }
        return;
_L2:
        ByteBuffer bytebuffer1 = ahv3.a(1);
        ByteBuffer bytebuffer;
        if (ahv1 != null)
        {
            bytebuffer = ahv1.a(2);
        } else
        {
            bytebuffer = null;
        }
        blur(ahv3.m(), ahv3.n(), bytebuffer1, bytebuffer);
        ahv3.k();
        if (ahv1 != null)
        {
            ahv1.k();
        }
        if (true) goto _L4; else goto _L3
_L3:
    }

    static 
    {
        System.loadLibrary("filterframework_jni");
    }
}
