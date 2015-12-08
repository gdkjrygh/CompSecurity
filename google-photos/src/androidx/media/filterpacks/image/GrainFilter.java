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
import java.util.Random;

public class GrainFilter extends ahn
{

    private ajl mGrainShader;
    private final String mGrainSource = "precision mediump float;\nuniform sampler2D tex_sampler_0;\nuniform sampler2D tex_sampler_1;\nuniform float scale;\nuniform float stepX;\nuniform float stepY;\nvarying vec2 v_texcoord;\nvoid main() {\n  float noise = texture2D(tex_sampler_1, v_texcoord + vec2(-stepX, -stepY)).r * 0.224;\n  noise += texture2D(tex_sampler_1, v_texcoord + vec2(-stepX, stepY)).r * 0.224;\n  noise += texture2D(tex_sampler_1, v_texcoord + vec2(stepX, -stepY)).r * 0.224;\n  noise += texture2D(tex_sampler_1, v_texcoord + vec2(stepX, stepY)).r * 0.224;\n  noise += 0.4448;\n  noise *= scale;\n  vec4 color = texture2D(tex_sampler_0, v_texcoord);\n  float energy = 0.33333 * color.r + 0.33333 * color.g + 0.33333 * color.b;\n  float mask = (1.0 - sqrt(energy));\n  float weight = 1.0 - 1.333 * mask * noise;\n  gl_FragColor = vec4(color.rgb * weight, color.a);\n}\n";
    private int mHeight;
    private ahv mNoiseFrame;
    private ajl mNoiseShader;
    private final String mNoiseSource = "precision mediump float;\nuniform vec2 seed;\nvarying vec2 v_texcoord;\nfloat rand(vec2 loc) {\n  const float divide = 0.0003630780547;\n  const float factor = 2754.228703;\n  float value = sin(dot(loc, vec2(12.9898, 78.233)));\n  float residual = mod(dot(mod(loc, divide), vec2(0.9898, 0.233)), divide);\n  float part2 = mod(value, divide);\n  float part1 = value - part2;\n  return fract(0.5453 * part1 + factor * (part2 + residual));\n}\nvoid main() {\n  gl_FragColor = vec4(rand(v_texcoord + seed), 0.0, 0.0, 1.0);\n}\n";
    private Random mRandom;
    private float mScale;
    private int mWidth;

    public GrainFilter(ajr ajr, String s)
    {
        super(ajr, s);
        mScale = 1.0F;
        mWidth = 0;
        mHeight = 0;
        mNoiseFrame = null;
        mRandom = new Random();
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
        mNoiseShader = new ajl("precision mediump float;\nuniform vec2 seed;\nvarying vec2 v_texcoord;\nfloat rand(vec2 loc) {\n  const float divide = 0.0003630780547;\n  const float factor = 2754.228703;\n  float value = sin(dot(loc, vec2(12.9898, 78.233)));\n  float residual = mod(dot(mod(loc, divide), vec2(0.9898, 0.233)), divide);\n  float part2 = mod(value, divide);\n  float part1 = value - part2;\n  return fract(0.5453 * part1 + factor * (part2 + residual));\n}\nvoid main() {\n  gl_FragColor = vec4(rand(v_texcoord + seed), 0.0, 0.0, 1.0);\n}\n");
        mGrainShader = new ajl("precision mediump float;\nuniform sampler2D tex_sampler_0;\nuniform sampler2D tex_sampler_1;\nuniform float scale;\nuniform float stepX;\nuniform float stepY;\nvarying vec2 v_texcoord;\nvoid main() {\n  float noise = texture2D(tex_sampler_1, v_texcoord + vec2(-stepX, -stepY)).r * 0.224;\n  noise += texture2D(tex_sampler_1, v_texcoord + vec2(-stepX, stepY)).r * 0.224;\n  noise += texture2D(tex_sampler_1, v_texcoord + vec2(stepX, -stepY)).r * 0.224;\n  noise += texture2D(tex_sampler_1, v_texcoord + vec2(stepX, stepY)).r * 0.224;\n  noise += 0.4448;\n  noise *= scale;\n  vec4 color = texture2D(tex_sampler_0, v_texcoord);\n  float energy = 0.33333 * color.r + 0.33333 * color.g + 0.33333 * color.b;\n  float mask = (1.0 - sqrt(energy));\n  float weight = 1.0 - 1.333 * mask * noise;\n  gl_FragColor = vec4(color.rgb * weight, color.a);\n}\n");
    }

    protected final void e()
    {
        this;
        JVM INSTR monitorenter ;
        aju aju1;
        ahv ahv1;
        ahv ahv2;
        int ai[];
        aju1 = b("image");
        ahv1 = a("image").a().h();
        ai = ahv1.l();
        ahv2 = aju1.a(ai).h();
        if (ai[0] == mWidth && ai[1] == mHeight && mNoiseFrame != null)
        {
            break MISSING_BLOCK_LABEL_187;
        }
        int i;
        int j;
        i = ai[0];
        j = ai[1];
        mWidth = i;
        mHeight = j;
        mGrainShader.a("stepX", 0.5F / (float)mWidth);
        mGrainShader.a("stepY", 0.5F / (float)mHeight);
        i = ai[0] / 2;
        j = ai[1] / 2;
        if (mNoiseFrame != null)
        {
            mNoiseFrame.i();
        }
        mNoiseFrame = ahs.a(aif.a(301, 18), new int[] {
            i, j
        }).h();
        mGrainShader.a("scale", mScale);
        mRandom.nextFloat();
        mRandom.nextFloat();
        Object obj = mNoiseShader;
        ahv ahv3 = mNoiseFrame;
        ((ajl) (obj)).a(new ahv[0], ahv3);
        obj = mNoiseFrame;
        mGrainShader.a(new ahv[] {
            ahv1, obj
        }, ahv2);
        aju1.a(ahv2);
        this;
        JVM INSTR monitorexit ;
        return;
        Exception exception;
        exception;
        throw exception;
    }

    public final void g()
    {
        if (mNoiseFrame != null)
        {
            mNoiseFrame.i();
            mNoiseFrame = null;
        }
    }
}
