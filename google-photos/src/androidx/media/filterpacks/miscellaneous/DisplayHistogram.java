// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package androidx.media.filterpacks.miscellaneous;

import ahn;
import ahs;
import ahv;
import aif;
import ajl;
import ajo;
import ajr;
import aju;
import ajw;
import android.opengl.GLES20;

public final class DisplayHistogram extends ahn
{

    private final String mFragmentShader = "precision mediump float;\nvoid main() {\n  gl_FragColor = vec4(1.0, 0.0, 0.0, 0.5);\n}\n";
    private ajl mGraphShader;
    private int mHistogram[];
    private ajl mIdShader;
    private final String mVertexShader = "attribute vec4 a_position2;\nvoid main() {\n  gl_Position = a_position2;\n}\n";
    private float mVertices[];
    private float mYScale;

    public DisplayHistogram(ajr ajr, String s)
    {
        super(ajr, s);
        mYScale = 1.0F;
    }

    public final ajw b()
    {
        aif aif1 = aif.a(301, 2);
        aif aif2 = aif.a(301, 16);
        return (new ajw()).a("image", 2, aif1).a("histogram", 2, aif.b(Integer.TYPE)).a("YScale", 1, aif.a(Float.TYPE)).b("composite", 2, aif2).a();
    }

    public final void b(ajo ajo1)
    {
        if (ajo1.b.equals("YScale"))
        {
            ajo1.a("mYScale");
            ajo1.g = true;
        } else
        if (ajo1.b.equals("histogram"))
        {
            ajo1.a("mHistogram");
            ajo1.g = true;
            return;
        }
    }

    protected final void c()
    {
        mIdShader = ajl.a();
        mGraphShader = new ajl("attribute vec4 a_position2;\nvoid main() {\n  gl_Position = a_position2;\n}\n", "precision mediump float;\nvoid main() {\n  gl_FragColor = vec4(1.0, 0.0, 0.0, 0.5);\n}\n");
    }

    protected final void e()
    {
        aju aju1 = b("composite");
        ahv ahv1 = a("image").a().h();
        int ai[] = ahv1.l();
        ahv ahv2 = aju1.a(ai).h();
        mIdShader.a(ahv1, ahv2);
        int j = ai[0];
        int k = ai[1];
        int l = mHistogram.length;
        float f1 = 2.0F / ((float)l + 2.0F);
        mVertices = new float[l * 4];
        float f = f1 - 1.0F;
        for (int i = 0; i < l; i++)
        {
            mVertices[i * 4] = f;
            mVertices[i * 4 + 1] = 1.0F;
            mVertices[i * 4 + 2] = f;
            mVertices[i * 4 + 3] = 1.0F - (2.0F * (float)mHistogram[i] * mYScale) / (float)(j * k);
            f += f1;
        }

        mGraphShader.a("a_position2", mVertices, 2);
        GLES20.glLineWidth(0.6F * f1 * (float)ai[0]);
        mGraphShader.f = 1;
        mGraphShader.g = l * 2;
        mGraphShader.a(ahv2);
        aju1.a(ahv2);
    }
}
