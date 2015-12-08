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

public class FisheyeFilter extends ahn
{

    private static final String mFisheyeShader = "precision mediump float;\nuniform sampler2D tex_sampler_0;\nuniform vec2 scale;\nuniform float alpha;\nuniform float radius2;\nuniform float factor;\nvarying vec2 v_texcoord;\nvoid main() {\n  const float m_pi_2 = 1.570963;\n  vec2 coord = v_texcoord - vec2(0.5, 0.5);\n  float dist = length(coord * scale);\n  float radian = m_pi_2 - atan(alpha * sqrt(radius2 - dist * dist), dist);\n  float scalar = radian * factor / dist;\n  vec2 new_coord = coord * scalar + vec2(0.5, 0.5);\n  gl_FragColor = texture2D(tex_sampler_0, new_coord);\n}\n";
    private int mHeight;
    private float mScale;
    private ajl mShader;
    private int mWidth;

    public FisheyeFilter(ajr ajr, String s)
    {
        super(ajr, s);
        mScale = 0.5F;
        mWidth = 0;
        mHeight = 0;
    }

    public final ajw b()
    {
        aif aif1 = aif.a(301, 2);
        aif aif2 = aif.a(301, 16);
        return (new ajw()).a("image", 2, aif1).a("scale", 1, aif.a(Float.TYPE)).b("image", 2, aif2).a();
    }

    public final void b(ajo ajo1)
    {
        if (ajo1.b.equals("scale"))
        {
            ajo1.a("mScale");
            ajo1.g = true;
        }
    }

    protected final void c()
    {
        mShader = new ajl("precision mediump float;\nuniform sampler2D tex_sampler_0;\nuniform vec2 scale;\nuniform float alpha;\nuniform float radius2;\nuniform float factor;\nvarying vec2 v_texcoord;\nvoid main() {\n  const float m_pi_2 = 1.570963;\n  vec2 coord = v_texcoord - vec2(0.5, 0.5);\n  float dist = length(coord * scale);\n  float radian = m_pi_2 - atan(alpha * sqrt(radius2 - dist * dist), dist);\n  float scalar = radian * factor / dist;\n  vec2 new_coord = coord * scalar + vec2(0.5, 0.5);\n  gl_FragColor = texture2D(tex_sampler_0, new_coord);\n}\n");
    }

    protected final void e()
    {
        this;
        JVM INSTR monitorenter ;
        aju aju1;
        ahv ahv1;
        ahv ahv2;
        float af[];
        aju1 = b("image");
        ahv1 = a("image").a().h();
        ahv2 = aju1.a(ahv1.l()).h();
        if (ahv1.m() != mWidth || ahv1.n() != mHeight)
        {
            int i = ahv1.m();
            int j = ahv1.n();
            mWidth = i;
            mHeight = j;
        }
        af = new float[2];
        if (mWidth <= mHeight) goto _L2; else goto _L1
_L1:
        af[0] = 1.0F;
        af[1] = (float)mHeight / (float)mWidth;
_L3:
        float f = mScale * 2.0F + 0.75F;
        float f1 = 0.25F * (af[0] * af[0] + af[1] * af[1]);
        float f2 = (float)Math.sqrt(f1);
        float f3;
        f3 = 1.15F * f2;
        f3 *= f3;
        float f4 = f / f2;
        f1 = f2 / (1.570796F - (float)Math.atan((float)Math.sqrt(f3 - f1) * f4));
        mShader.a("scale", af);
        mShader.a("radius2", f3);
        mShader.a("factor", f1);
        mShader.a("alpha", f);
        mShader.a(ahv1, ahv2);
        aju1.a(ahv2);
        this;
        JVM INSTR monitorexit ;
        return;
_L2:
        af[0] = (float)mWidth / (float)mHeight;
        af[1] = 1.0F;
          goto _L3
        Exception exception;
        exception;
        throw exception;
    }
}
