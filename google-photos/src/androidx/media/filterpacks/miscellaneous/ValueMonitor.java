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

public final class ValueMonitor extends ahn
{

    private static final int NUM_SAMPLES = 100;
    private final String mFragmentShader = "precision mediump float;\nvoid main() {\n  gl_FragColor = vec4(1.0, 1.0, 0.0, 0.1);\n}\n";
    private ajl mGraphShader;
    private ajl mIdShader;
    private float mMaxVal;
    private float mMinVal;
    private float mValue;
    private float mValues[];
    private final String mVertexShader = "attribute vec4 a_position2;\nvoid main() {\n  gl_Position = a_position2;\n}\n";
    private float mYBottom;
    private float mYTop;

    public ValueMonitor(ajr ajr, String s)
    {
        super(ajr, s);
        mMaxVal = 1.0F;
        mMinVal = 0.0F;
        mYTop = 0.0F;
        mYBottom = 1.0F;
        mValue = 0.0F;
    }

    public final ajw b()
    {
        aif aif1 = aif.a(301, 2);
        aif aif2 = aif.a(301, 16);
        return (new ajw()).a("source", 2, aif1).a("value", 2, aif.a(Float.TYPE)).a("maxValue", 1, aif.a(Float.TYPE)).a("minValue", 1, aif.a(Float.TYPE)).a("YTop", 1, aif.a(Float.TYPE)).a("YBottom", 1, aif.a(Float.TYPE)).b("composite", 2, aif2).a();
    }

    public final void b(ajo ajo1)
    {
        if (ajo1.b.equals("value"))
        {
            ajo1.a("mValue");
            ajo1.g = true;
        } else
        {
            if (ajo1.b.equals("maxValue"))
            {
                ajo1.a("mMaxVal");
                ajo1.g = true;
                return;
            }
            if (ajo1.b.equals("minValue"))
            {
                ajo1.a("mMinVal");
                ajo1.g = true;
                return;
            }
            if (ajo1.b.equals("YTop"))
            {
                ajo1.a("mYTop");
                ajo1.g = true;
                return;
            }
            if (ajo1.b.equals("YBottom"))
            {
                ajo1.a("mYBottom");
                ajo1.g = true;
                return;
            }
        }
    }

    protected final void c()
    {
        mIdShader = ajl.a();
        mGraphShader = new ajl("attribute vec4 a_position2;\nvoid main() {\n  gl_Position = a_position2;\n}\n", "precision mediump float;\nvoid main() {\n  gl_FragColor = vec4(1.0, 1.0, 0.0, 0.1);\n}\n");
        mValues = new float[200];
        for (int i = 0; i < 100; i++)
        {
            mValues[i * 2] = (2.0F * (float)i) / 100F - 1.0F;
            mValues[i * 2 + 1] = mYBottom;
        }

    }

    protected final void e()
    {
        for (int i = 0; i < 99; i++)
        {
            mValues[i * 2 + 1] = mValues[i * 2 + 3];
        }

        float af[] = mValues;
        float f = mValue;
        aju aju1;
        ahv ahv1;
        ahv ahv2;
        if (mMaxVal > mMinVal)
        {
            f = (f - mMinVal) / (mMaxVal - mMinVal);
        } else
        {
            f = 0.0F;
        }
        af[199] = f * (mYTop - mYBottom) + mYBottom;
        mGraphShader.a("a_position2", mValues, 2);
        aju1 = b("composite");
        ahv1 = a("source").a().h();
        ahv2 = aju1.a(ahv1.l()).h();
        mIdShader.a(ahv1, ahv2);
        GLES20.glLineWidth(3F);
        mGraphShader.f = 3;
        mGraphShader.g = 100;
        mGraphShader.a(ahv2);
        aju1.a(ahv2);
    }
}
