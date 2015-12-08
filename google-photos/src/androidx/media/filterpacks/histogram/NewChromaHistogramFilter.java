// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package androidx.media.filterpacks.histogram;

import ahn;
import ahs;
import aht;
import ahu;
import aif;
import ajo;
import ajr;
import aju;
import ajw;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.FloatBuffer;

public final class NewChromaHistogramFilter extends ahn
{

    private int mHueBins;
    private int mSaturationBins;
    private int mSaturationThreshold;
    private int mValueThreshold;

    public NewChromaHistogramFilter(ajr ajr, String s)
    {
        super(ajr, s);
        mHueBins = 6;
        mSaturationBins = 3;
        mSaturationThreshold = 26;
        mValueThreshold = 51;
    }

    private static native boolean extractChromaHistogram(ByteBuffer bytebuffer, FloatBuffer floatbuffer, int i, int j, FloatBuffer floatbuffer1, int k, int l, int i1);

    public final ajw b()
    {
        aif aif1 = aif.a(301, 1);
        aif aif2 = aif.b(200);
        aif aif3 = aif.a(200);
        aif aif4 = aif.a(Integer.TYPE);
        return (new ajw()).a("image", 2, aif1).a("huebins", 1, aif4).a("saturationbins", 1, aif4).a("saturationthreshold", 1, aif.a(Integer.TYPE)).a("valuethreshold", 1, aif4).b("huesat", 2, aif2).b("value", 2, aif3).a();
    }

    public final void b(ajo ajo1)
    {
        if (ajo1.b.equals("huebins"))
        {
            ajo1.a("mHueBins");
            ajo1.g = true;
        } else
        {
            if (ajo1.b.equals("saturationbins"))
            {
                ajo1.a("mSaturationBins");
                ajo1.g = true;
                return;
            }
            if (ajo1.b.equals("saturationthreshold"))
            {
                ajo1.a("mSaturationThreshold");
                ajo1.g = true;
                return;
            }
            if (ajo1.b.equals("valuethreshold"))
            {
                ajo1.a("mValueThreshold");
                ajo1.g = true;
                return;
            }
        }
    }

    protected final void e()
    {
        ahv ahv = a("image").a().h();
        aju aju1 = b("huesat");
        aju aju2 = b("value");
        int i = mHueBins;
        ahu ahu1 = aju1.a(new int[] {
            mHueBins, mSaturationBins
        }).g();
        aht aht1 = aju2.a(new int[] {
            i
        }).f();
        ByteBuffer bytebuffer = ahv.a(1);
        Object obj1 = ahu1.a(2);
        Object obj = aht1.a(2);
        ((ByteBuffer) (obj1)).order(ByteOrder.nativeOrder());
        ((ByteBuffer) (obj)).order(ByteOrder.nativeOrder());
        obj1 = ((ByteBuffer) (obj1)).asFloatBuffer();
        obj = ((ByteBuffer) (obj)).asFloatBuffer();
        if (!extractChromaHistogram(bytebuffer, ((FloatBuffer) (obj1)), mHueBins, mSaturationBins, ((FloatBuffer) (obj)), i, mSaturationThreshold, mValueThreshold))
        {
            throw new RuntimeException("Error running native histogram extraction!");
        } else
        {
            ahv.k();
            ahu1.k();
            aht1.k();
            aju1.a(ahu1);
            aju2.a(aht1);
            return;
        }
    }

    static 
    {
        System.loadLibrary("filterframework_jni");
    }
}
