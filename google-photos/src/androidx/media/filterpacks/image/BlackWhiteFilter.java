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

public class BlackWhiteFilter extends ahn
{

    private float mBlack;
    private final String mBlackWhiteShader = "precision mediump float;\nuniform sampler2D tex_sampler_0;\nuniform vec2 seed;\nuniform float black;\nuniform float scale;\nuniform float stepsize;\nvarying vec2 v_texcoord;\nfloat rand(vec2 loc) {\n  return fract(sin(dot((loc + seed), vec2(12.9898, 78.233))) * 43758.5453);\n}\nvoid main() {\n  vec4 color = texture2D(tex_sampler_0, v_texcoord);\n  float dither = rand(v_texcoord);\n  vec3 xform = clamp((color.rgb - black) * scale, 0.0, 1.0);\n  vec3 temp = clamp((color.rgb + stepsize - black) * scale, 0.0, 1.0);\n  vec3 new_color = clamp(xform + (temp - xform) * (dither - 0.5), 0.0, 1.0);\n  gl_FragColor = vec4(new_color, color.a);\n}\n";
    private Random mRandom;
    private ajl mShader;
    private float mWhite;

    public BlackWhiteFilter(ajr ajr, String s)
    {
        super(ajr, s);
        mBlack = 0.0F;
        mWhite = 1.0F;
        mRandom = new Random();
    }

    public final ajw b()
    {
        aif aif1 = aif.a(301, 2);
        aif aif2 = aif.a(301, 16);
        return (new ajw()).a("image", 2, aif1).a("black", 1, aif.a(Float.TYPE)).a("white", 1, aif.a(Float.TYPE)).b("image", 2, aif2).a();
    }

    public final void b(ajo ajo1)
    {
        if (ajo1.b.equals("black"))
        {
            ajo1.a("mBlack");
            ajo1.g = true;
        } else
        if (ajo1.b.equals("white"))
        {
            ajo1.a("mWhite");
            ajo1.g = true;
            return;
        }
    }

    protected final void c()
    {
        mShader = new ajl("precision mediump float;\nuniform sampler2D tex_sampler_0;\nuniform vec2 seed;\nuniform float black;\nuniform float scale;\nuniform float stepsize;\nvarying vec2 v_texcoord;\nfloat rand(vec2 loc) {\n  return fract(sin(dot((loc + seed), vec2(12.9898, 78.233))) * 43758.5453);\n}\nvoid main() {\n  vec4 color = texture2D(tex_sampler_0, v_texcoord);\n  float dither = rand(v_texcoord);\n  vec3 xform = clamp((color.rgb - black) * scale, 0.0, 1.0);\n  vec3 temp = clamp((color.rgb + stepsize - black) * scale, 0.0, 1.0);\n  vec3 new_color = clamp(xform + (temp - xform) * (dither - 0.5), 0.0, 1.0);\n  gl_FragColor = vec4(new_color, color.a);\n}\n");
    }

    protected final void e()
    {
        aju aju1 = b("image");
        ahv ahv1 = a("image").a().h();
        ahv ahv2 = aju1.a(ahv1.l()).h();
        float f;
        float f1;
        float f2;
        if (mBlack != mWhite)
        {
            f = 1.0F / (mWhite - mBlack);
        } else
        {
            f = 2000F;
        }
        f1 = mRandom.nextFloat();
        f2 = mRandom.nextFloat();
        mShader.a("black", mBlack);
        mShader.a("scale", f);
        mShader.a("stepsize", 0.003921569F);
        mShader.a("seed", new float[] {
            f1, f2
        });
        mShader.a(ahv1, ahv2);
        aju1.a(ahv2);
    }
}
