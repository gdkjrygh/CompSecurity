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

public class VignetteFilter extends ahn
{

    private static final String mVignetteShaderCode = "precision mediump float;\nuniform sampler2D tex_sampler_0;\nuniform float range;\nuniform float inv_max_dist;\nuniform float shade;\nuniform vec2 scale;\nvarying vec2 v_texcoord;\nvoid main() {\n  const float slope = 20.0;\n  vec2 coord = v_texcoord - vec2(0.5, 0.5);\n  float dist = length(coord * scale);\n  float lumen = shade / (1.0 + exp((dist * inv_max_dist - range) * slope)) + (1.0 - shade);\n  vec4 color = texture2D(tex_sampler_0, v_texcoord);\n  gl_FragColor = vec4(color.rgb * lumen, color.a);\n}\n";
    private int mHeight;
    private float mScale;
    private final float mShade = 0.85F;
    private ajl mShader;
    private int mWidth;

    public VignetteFilter(ajr ajr, String s)
    {
        super(ajr, s);
        mScale = 1.0F;
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
        mShader = new ajl("precision mediump float;\nuniform sampler2D tex_sampler_0;\nuniform float range;\nuniform float inv_max_dist;\nuniform float shade;\nuniform vec2 scale;\nvarying vec2 v_texcoord;\nvoid main() {\n  const float slope = 20.0;\n  vec2 coord = v_texcoord - vec2(0.5, 0.5);\n  float dist = length(coord * scale);\n  float lumen = shade / (1.0 + exp((dist * inv_max_dist - range) * slope)) + (1.0 - shade);\n  vec4 color = texture2D(tex_sampler_0, v_texcoord);\n  gl_FragColor = vec4(color.rgb * lumen, color.a);\n}\n");
    }

    protected final void e()
    {
        this;
        JVM INSTR monitorenter ;
        aju aju1;
        ahv ahv1;
        ahv ahv2;
        aju1 = b("image");
        ahv1 = a("image").a().h();
        ahv2 = aju1.a(ahv1.l()).h();
        if (ahv1.m() == mWidth && ahv1.n() == mHeight) goto _L2; else goto _L1
_L1:
        mWidth = ahv1.m();
        mHeight = ahv1.n();
        if (mShader == null) goto _L2; else goto _L3
_L3:
        float af[] = new float[2];
        if (mWidth <= mHeight) goto _L5; else goto _L4
_L4:
        af[0] = 1.0F;
        af[1] = (float)mHeight / (float)mWidth;
_L6:
        float f = (float)Math.sqrt(af[0] * af[0] + af[1] * af[1]);
        mShader.a("scale", af);
        mShader.a("inv_max_dist", 1.0F / (f * 0.5F));
        mShader.a("shade", 0.85F);
_L2:
        mShader.a("range", 1.3F - (float)Math.sqrt(mScale) * 0.7F);
        mShader.a(ahv1, ahv2);
        aju1.a(ahv2);
        this;
        JVM INSTR monitorexit ;
        return;
_L5:
        af[0] = (float)mWidth / (float)mHeight;
        af[1] = 1.0F;
          goto _L6
        Exception exception;
        exception;
        throw exception;
    }
}
