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

public class DuotoneFilter extends ahn
{

    private final String mDuotoneShader = "precision mediump float;\nuniform sampler2D tex_sampler_0;\nuniform vec3 first;\nuniform vec3 second;\nvarying vec2 v_texcoord;\nvoid main() {\n  vec4 color = texture2D(tex_sampler_0, v_texcoord);\n  float energy = (color.r + color.g + color.b) * 0.3333;\n  vec3 new_color = (1.0 - energy) * first + energy * second;\n  gl_FragColor = vec4(new_color.rgb, color.a);\n}\n";
    private int mFirstColor;
    private int mSecondColor;
    private ajl mShader;

    public DuotoneFilter(ajr ajr, String s)
    {
        super(ajr, s);
        mFirstColor = 0xffff0000;
        mSecondColor = -256;
    }

    public final ajw b()
    {
        aif aif1 = aif.a(301, 2);
        aif aif2 = aif.a(301, 16);
        return (new ajw()).a("image", 2, aif1).a("firstColor", 1, aif.a(Integer.TYPE)).a("secondColor", 1, aif.a(Integer.TYPE)).b("image", 2, aif2).a();
    }

    public final void b(ajo ajo1)
    {
        if (ajo1.b.equals("firstColor"))
        {
            ajo1.a("mFirstColor");
            ajo1.g = true;
        } else
        if (ajo1.b.equals("secondColor"))
        {
            ajo1.a("mSecondColor");
            ajo1.g = true;
            return;
        }
    }

    protected final void c()
    {
        mShader = new ajl("precision mediump float;\nuniform sampler2D tex_sampler_0;\nuniform vec3 first;\nuniform vec3 second;\nvarying vec2 v_texcoord;\nvoid main() {\n  vec4 color = texture2D(tex_sampler_0, v_texcoord);\n  float energy = (color.r + color.g + color.b) * 0.3333;\n  vec3 new_color = (1.0 - energy) * first + energy * second;\n  gl_FragColor = vec4(new_color.rgb, color.a);\n}\n");
    }

    protected final void e()
    {
        aju aju1 = b("image");
        ahv ahv1 = a("image").a().h();
        ahv ahv2 = aju1.a(ahv1.l()).h();
        float f = (float)Color.red(mFirstColor) / 255F;
        float f1 = (float)Color.green(mFirstColor) / 255F;
        float f2 = (float)Color.blue(mFirstColor) / 255F;
        float f3 = (float)Color.red(mSecondColor) / 255F;
        float f4 = (float)Color.green(mSecondColor) / 255F;
        float f5 = (float)Color.blue(mSecondColor) / 255F;
        mShader.a("first", new float[] {
            f, f1, f2
        });
        mShader.a("second", new float[] {
            f3, f4, f5
        });
        mShader.a(ahv1, ahv2);
        aju1.a(ahv2);
    }
}
