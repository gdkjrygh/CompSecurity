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
import android.graphics.Color;

public class TintFilter extends ahn
{

    private static final String mTintShaderCode = "precision mediump float;\nuniform sampler2D tex_sampler_0;\nuniform vec3 tint;\nuniform vec3 color_ratio;\nvarying vec2 v_texcoord;\nvoid main() {\n  vec4 color = texture2D(tex_sampler_0, v_texcoord);\n  float avg_color = dot(color_ratio, color.rgb);\n  vec3 new_color = min(0.8 * avg_color + 0.2 * tint, 1.0);\n  gl_FragColor = vec4(new_color.rgb, color.a);\n}\n";
    private ajl mShader;
    private int mTint;

    public TintFilter(ajr ajr, String s)
    {
        super(ajr, s);
        mTint = 0xff0000ff;
    }

    public final ajw b()
    {
        aif aif1 = aif.a(301, 2);
        aif aif2 = aif.a(301, 16);
        return (new ajw()).a("image", 2, aif1).a("tint", 1, aif.a(Integer.TYPE)).b("image", 2, aif2).a();
    }

    public final void b(ajo ajo1)
    {
        if (ajo1.b.equals("tint"))
        {
            ajo1.a("mTint");
            ajo1.g = true;
        }
    }

    protected final void c()
    {
        mShader = new ajl("precision mediump float;\nuniform sampler2D tex_sampler_0;\nuniform vec3 tint;\nuniform vec3 color_ratio;\nvarying vec2 v_texcoord;\nvoid main() {\n  vec4 color = texture2D(tex_sampler_0, v_texcoord);\n  float avg_color = dot(color_ratio, color.rgb);\n  vec3 new_color = min(0.8 * avg_color + 0.2 * tint, 1.0);\n  gl_FragColor = vec4(new_color.rgb, color.a);\n}\n");
        mShader.a("color_ratio", new float[] {
            0.21F, 0.71F, 0.07F
        });
    }

    protected final void e()
    {
        this;
        JVM INSTR monitorenter ;
        aju aju1 = b("image");
        ahv ahv1 = a("image").a().h();
        ahv ahv2 = aju1.a(ahv1.l()).h();
        float f = (float)Color.red(mTint) / 255F;
        float f1 = (float)Color.green(mTint) / 255F;
        float f2 = (float)Color.blue(mTint) / 255F;
        mShader.a("tint", new float[] {
            f, f1, f2
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
