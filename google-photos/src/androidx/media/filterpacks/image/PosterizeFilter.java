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

public class PosterizeFilter extends ahn
{

    private static final String mPosterizeShaderCode = "precision mediump float;\nuniform sampler2D tex_sampler_0;\nuniform float binSize;\nvarying vec2 v_texcoord;\nvoid main() {\n  vec4 color = texture2D(tex_sampler_0, v_texcoord);\n  vec4 bc = mod(color, binSize);\n  float bs2 = binSize / 2.0;\n  vec3 result;\n  result.r = (bc.r >= bs2) ? color.r + binSize - bc.r : color.r - bc.r;\n  result.g = (bc.g >= bs2) ? color.g + binSize - bc.g : color.g - bc.g;\n  result.b = (bc.b >= bs2) ? color.b + binSize - bc.b : color.b - bc.b;\n  gl_FragColor = vec4(result, color.a);\n}\n";
    private int mLevels;
    private ajl mShader;

    public PosterizeFilter(ajr ajr, String s)
    {
        super(ajr, s);
        mLevels = 2;
    }

    public final ajw b()
    {
        aif aif1 = aif.a(301, 2);
        aif aif2 = aif.a(301, 16);
        return (new ajw()).a("image", 2, aif1).a("levels", 1, aif.a(Integer.TYPE)).b("image", 2, aif2).a();
    }

    public final void b(ajo ajo1)
    {
        if (ajo1.b.equals("levels"))
        {
            ajo1.a("mLevels");
            ajo1.g = true;
        }
    }

    protected final void c()
    {
        mShader = new ajl("precision mediump float;\nuniform sampler2D tex_sampler_0;\nuniform float binSize;\nvarying vec2 v_texcoord;\nvoid main() {\n  vec4 color = texture2D(tex_sampler_0, v_texcoord);\n  vec4 bc = mod(color, binSize);\n  float bs2 = binSize / 2.0;\n  vec3 result;\n  result.r = (bc.r >= bs2) ? color.r + binSize - bc.r : color.r - bc.r;\n  result.g = (bc.g >= bs2) ? color.g + binSize - bc.g : color.g - bc.g;\n  result.b = (bc.b >= bs2) ? color.b + binSize - bc.b : color.b - bc.b;\n  gl_FragColor = vec4(result, color.a);\n}\n");
    }

    protected final void e()
    {
        aju aju1 = b("image");
        ahv ahv1 = a("image").a().h();
        ahv ahv2 = aju1.a(ahv1.l()).h();
        if (mLevels < 2)
        {
            int i = mLevels;
            throw new IllegalArgumentException((new StringBuilder(59)).append("Posterize filter obtained levels less than 2 (").append(i).append(")!").toString());
        } else
        {
            mShader.a("binSize", 1.0F / (float)(mLevels - 1));
            mShader.a(ahv1, ahv2);
            aju1.a(ahv2);
            return;
        }
    }
}
