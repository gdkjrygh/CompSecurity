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

public class DocumentaryFilter extends ahn
{

    private final String mDocumentaryShader = "precision mediump float;\nuniform sampler2D tex_sampler_0;\nuniform vec2 seed;\nuniform float stepsize;\nuniform float inv_max_dist;\nuniform vec2 center;\nvarying vec2 v_texcoord;\nfloat rand(vec2 loc) {\n  return fract(sin(dot((loc + seed), vec2(12.9898, 78.233))) * 43758.5453);\n}\nvoid main() {\n  vec4 color = texture2D(tex_sampler_0, v_texcoord);\n  float dither = rand(v_texcoord);\n  vec3 xform = clamp(2.0 * color.rgb, 0.0, 1.0);\n  vec3 temp = clamp(2.0 * (color.rgb + stepsize), 0.0, 1.0);\n  vec3 new_color = clamp(xform + (temp - xform) * (dither - 0.5), 0.0, 1.0);\n  float gray = dot(new_color, vec3(0.299, 0.587, 0.114));\n  new_color = vec3(gray, gray, gray);\n  float dist = distance(gl_FragCoord.xy, center);\n  float lumen = 0.85 / (1.0 + exp((dist * inv_max_dist - 0.83) * 20.0)) + 0.15;\n  gl_FragColor = vec4(new_color * lumen, color.a);\n}\n";
    private int mHeight;
    private Random mRandom;
    private ajl mShader;
    private int mWidth;

    public DocumentaryFilter(ajr ajr, String s)
    {
        super(ajr, s);
        mWidth = 0;
        mHeight = 0;
        mRandom = new Random();
    }

    private void a()
    {
        float f = (float)((double)mWidth * 0.5D);
        float f1 = (float)((double)mHeight * 0.5D);
        float f2 = (float)Math.sqrt(f * f + f1 * f1);
        mShader.a("center", new float[] {
            f, f1
        });
        mShader.a("inv_max_dist", 1.0F / f2);
        mShader.a("stepsize", 0.003921569F);
    }

    public final ajw b()
    {
        aif aif1 = aif.a(301, 2);
        aif aif2 = aif.a(301, 16);
        return (new ajw()).a("image", 2, aif1).b("image", 2, aif2).a();
    }

    protected final void c()
    {
        mShader = new ajl("precision mediump float;\nuniform sampler2D tex_sampler_0;\nuniform vec2 seed;\nuniform float stepsize;\nuniform float inv_max_dist;\nuniform vec2 center;\nvarying vec2 v_texcoord;\nfloat rand(vec2 loc) {\n  return fract(sin(dot((loc + seed), vec2(12.9898, 78.233))) * 43758.5453);\n}\nvoid main() {\n  vec4 color = texture2D(tex_sampler_0, v_texcoord);\n  float dither = rand(v_texcoord);\n  vec3 xform = clamp(2.0 * color.rgb, 0.0, 1.0);\n  vec3 temp = clamp(2.0 * (color.rgb + stepsize), 0.0, 1.0);\n  vec3 new_color = clamp(xform + (temp - xform) * (dither - 0.5), 0.0, 1.0);\n  float gray = dot(new_color, vec3(0.299, 0.587, 0.114));\n  new_color = vec3(gray, gray, gray);\n  float dist = distance(gl_FragCoord.xy, center);\n  float lumen = 0.85 / (1.0 + exp((dist * inv_max_dist - 0.83) * 20.0)) + 0.15;\n  gl_FragColor = vec4(new_color * lumen, color.a);\n}\n");
        a();
    }

    protected final void e()
    {
        this;
        JVM INSTR monitorenter ;
        ahv ahv1 = a("image").a().h();
        int ai[] = ahv1.l();
        aju aju1 = b("image");
        ahv ahv2 = aju1.a(ai).h();
        if (ahv1.m() != mWidth || ahv1.n() != mHeight)
        {
            mWidth = ahv1.m();
            mHeight = ahv1.n();
            a();
        }
        float f = mRandom.nextFloat();
        float f1 = mRandom.nextFloat();
        mShader.a("seed", new float[] {
            f, f1
        });
        mShader.a(ahv1, ahv2);
        aju1.a(ahv2);
        this;
        JVM INSTR monitorexit ;
        return;
        Exception exception;
        exception;
        throw exception;
    }
}
