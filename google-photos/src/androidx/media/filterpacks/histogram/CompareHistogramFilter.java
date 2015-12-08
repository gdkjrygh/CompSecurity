// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package androidx.media.filterpacks.histogram;

import ahn;
import ahs;
import aif;
import aig;
import ajo;
import ajr;
import aju;
import ajw;

public final class CompareHistogramFilter extends ahn
{

    public static final int EMD = 0;
    private int mHistogram1[];
    private int mHistogram2[];
    private int mMetric;

    public CompareHistogramFilter(ajr ajr, String s)
    {
        super(ajr, s);
        mHistogram1 = null;
        mHistogram2 = null;
        mMetric = 0;
    }

    public final ajw b()
    {
        return (new ajw()).a("histogram1", 2, aif.b(Integer.TYPE)).a("histogram2", 2, aif.b(Integer.TYPE)).a("metric", 1, aif.a(Integer.TYPE)).b("value", 2, aif.a(Float.TYPE)).a();
    }

    public final void b(ajo ajo1)
    {
        if (ajo1.b.equals("histogram1"))
        {
            ajo1.a("mHistogram1");
            ajo1.g = true;
        } else
        {
            if (ajo1.b.equals("histogram2"))
            {
                ajo1.a("mHistogram2");
                ajo1.g = true;
                return;
            }
            if (ajo1.b.equals("metric"))
            {
                ajo1.a("mMetric");
                ajo1.g = true;
                return;
            }
        }
    }

    protected final void e()
    {
        int l = 0;
        switch (mMetric)
        {
        default:
            throw new RuntimeException("Unknown metric to compare histograms!");

        case 0: // '\0'
            break;
        }
        if (mHistogram1.length != mHistogram2.length)
        {
            throw new RuntimeException("Can only compare histograms of same length!");
        }
        int k = 0;
        int i = 0;
        int j = 0;
        for (; k < mHistogram1.length; k++)
        {
            j += mHistogram1[k];
            i += mHistogram2[k];
        }

        int i1 = 0;
        float f = 0.0F;
        boolean flag = false;
        k = l;
        l = ((flag) ? 1 : 0);
        for (; k < mHistogram1.length; k++)
        {
            i1 += mHistogram1[k];
            l += mHistogram2[k];
            f += Math.abs((float)i1 / (float)j - (float)l / (float)i);
        }

        float f1;
        aju aju1;
        aig aig1;
        if (mHistogram1.length > 1)
        {
            f1 = mHistogram1.length - 1;
        } else
        {
            f1 = 1.0F;
        }
        f /= f1;
        aju1 = b("value");
        aig1 = aju1.a(null).d();
        aig1.a(Float.valueOf(f));
        aju1.a(aig1);
    }
}
