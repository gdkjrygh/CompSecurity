// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package androidx.media.filterpacks.histogram;

import ahn;
import ahs;
import ahu;
import aif;
import ajo;
import ajr;
import aju;
import ajw;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.FloatBuffer;

public final class ChromaHistogramFilter extends ahn
{

    private int mHueBins;
    private int mSaturationBins;

    public ChromaHistogramFilter(ajr ajr, String s)
    {
        super(ajr, s);
        mHueBins = 6;
        mSaturationBins = 3;
    }

    private static native void extractChromaHistogram(ByteBuffer bytebuffer, FloatBuffer floatbuffer, int i, int j);

    public final void a(ajo ajo1)
    {
        if (ajo1.b.equals("huebins"))
        {
            ajo1.a("mHueBins");
            ajo1.g = true;
        } else
        if (ajo1.b.equals("saturationbins"))
        {
            ajo1.a("mSaturationBins");
            ajo1.g = true;
            return;
        }
    }

    public final ajw b()
    {
        aif aif1 = aif.a(301, 1);
        aif aif2 = aif.b(200);
        return (new ajw()).a("image", 2, aif1).a("huebins", 1, aif.a(Integer.TYPE)).a("saturationbins", 1, aif.a(Integer.TYPE)).b("histogram", 2, aif2).a();
    }

    protected final void e()
    {
        ahv ahv = a("image").a().h();
        aju aju1 = b("histogram");
        ahu ahu1 = aju1.a(new int[] {
            mHueBins, mSaturationBins
        }).g();
        ByteBuffer bytebuffer = ahv.a(1);
        ByteBuffer bytebuffer1 = ahu1.a(1);
        bytebuffer1.order(ByteOrder.nativeOrder());
        extractChromaHistogram(bytebuffer, bytebuffer1.asFloatBuffer(), mHueBins, mSaturationBins);
        ahv.k();
        ahu1.k();
        aju1.a(ahu1);
    }

    public final int l()
    {
        return 25;
    }

    static 
    {
        System.loadLibrary("filterframework_jni");
    }
}
