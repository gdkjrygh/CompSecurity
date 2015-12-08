// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package androidx.media.filterpacks.miscellaneous;

import ahn;
import ahs;
import aif;
import ajl;
import ajo;
import ajr;
import aju;
import ajw;
import ako;

public final class QuadsToMaskFilter extends ahn
{

    private ajl mBackgroundShader;
    private final String mBgFragmentShader = "precision mediump float;\nvoid main() {\n  gl_FragColor = vec4(0.0, 0.0, 0.0, 0.0);\n}\n";
    private int mImageSize[];
    private final String mQuadFragmentShader = "precision mediump float;\nvoid main() {\n  gl_FragColor = vec4(1.0, 1.0, 1.0, 1.0);\n}\n";
    private ajl mQuadShader;
    private ako mQuads[];

    public QuadsToMaskFilter(ajr ajr, String s)
    {
        super(ajr, s);
    }

    public final ajw b()
    {
        aif aif1 = aif.a(301, 16);
        return (new ajw()).a("quads", 2, aif.b(ako)).a("imageSize", 2, aif.b(Integer.TYPE)).b("mask", 2, aif1).a();
    }

    public final void b(ajo ajo1)
    {
        if (ajo1.b.equals("imageSize"))
        {
            ajo1.a("mImageSize");
            ajo1.g = true;
        } else
        if (ajo1.b.equals("quads"))
        {
            ajo1.a("mQuads");
            ajo1.g = true;
            return;
        }
    }

    protected final void c()
    {
        mBackgroundShader = new ajl("precision mediump float;\nvoid main() {\n  gl_FragColor = vec4(0.0, 0.0, 0.0, 0.0);\n}\n");
        mQuadShader = new ajl("precision mediump float;\nvoid main() {\n  gl_FragColor = vec4(1.0, 1.0, 1.0, 1.0);\n}\n");
    }

    protected final void e()
    {
        aju aju1 = b("mask");
        ahv ahv = aju1.a(mImageSize).h();
        mBackgroundShader.a(ahv);
        for (int i = 0; i < mQuads.length; i++)
        {
            mQuadShader.b(mQuads[i]);
            mQuadShader.a(ahv);
        }

        aju1.a(ahv);
    }
}
