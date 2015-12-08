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

public class BrightnessFilter extends ahn
{

    private static final String mBrightnessShader = "precision mediump float;\nuniform sampler2D tex_sampler_0;\nuniform float brightness;\nvarying vec2 v_texcoord;\nvoid main() {\n  vec4 color = texture2D(tex_sampler_0, v_texcoord);\n  if (brightness < 0.5) {\n    gl_FragColor = color * (2.0 * brightness);\n  } else {\n    vec4 diff = 1.0 - color;\n    gl_FragColor = color + diff * (2.0 * (brightness - 0.5));\n  }\n}\n";
    private float mBrightness;
    private ajl mShader;

    public BrightnessFilter(ajr ajr, String s)
    {
        super(ajr, s);
        mBrightness = 1.0F;
    }

    public final ajw b()
    {
        aif aif1 = aif.a(301, 2);
        aif aif2 = aif.a(301, 16);
        return (new ajw()).a("image", 2, aif1).a("brightness", 1, aif.a(Float.TYPE)).b("image", 2, aif2).a();
    }

    public final void b(ajo ajo1)
    {
        if (ajo1.b.equals("brightness"))
        {
            ajo1.a("mBrightness");
            ajo1.g = true;
        }
    }

    protected final void c()
    {
        mShader = new ajl("precision mediump float;\nuniform sampler2D tex_sampler_0;\nuniform float brightness;\nvarying vec2 v_texcoord;\nvoid main() {\n  vec4 color = texture2D(tex_sampler_0, v_texcoord);\n  if (brightness < 0.5) {\n    gl_FragColor = color * (2.0 * brightness);\n  } else {\n    vec4 diff = 1.0 - color;\n    gl_FragColor = color + diff * (2.0 * (brightness - 0.5));\n  }\n}\n");
    }

    protected final void e()
    {
        aju aju1 = b("image");
        ahv ahv1 = a("image").a().h();
        ahv ahv2 = aju1.a(ahv1.l()).h();
        mShader.a("brightness", mBrightness);
        mShader.a(ahv1, ahv2);
        aju1.a(ahv2);
    }
}
