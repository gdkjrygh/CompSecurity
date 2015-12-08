// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package androidx.media.filterpacks.numeric;

import ahn;
import ahs;
import aif;
import aig;
import ajo;
import ajr;
import aju;
import ajw;
import ako;
import akq;
import androidx.media.filterfw.imageutils.RegionStatsCalculator;

public class StatsFilter extends ahn
{

    private ako mCropRect;
    private RegionStatsCalculator mRegionStatsCalculator;
    private boolean mSuppressZero;

    public StatsFilter(ajr ajr, String s)
    {
        super(ajr, s);
        mCropRect = ako.a(0.0F, 0.0F, 1.0F, 1.0F);
        mSuppressZero = false;
    }

    public final ajw b()
    {
        aif aif1 = aif.b(100);
        aif aif2 = aif.a(Float.TYPE);
        return (new ajw()).a("buffer", 2, aif1).a("cropRect", 1, aif.a(ako)).a("suppressZero", 1, aif.a(Boolean.TYPE)).b("mean", 1, aif2).b("stdev", 1, aif2).a();
    }

    public final void b(ajo ajo1)
    {
        if (ajo1.b.equals("cropRect"))
        {
            ajo1.a("mCropRect");
            ajo1.g = true;
        }
        if (ajo1.b.equals("suppressZero"))
        {
            ajo1.a("mSuppressZero");
            ajo1.g = true;
        }
    }

    protected final void c()
    {
        super.c();
        mRegionStatsCalculator = new RegionStatsCalculator();
    }

    protected final void e()
    {
        Object obj = a("buffer").a().g();
        obj = mRegionStatsCalculator.a(((ahu) (obj)), mCropRect, mSuppressZero);
        aju aju1 = b("mean");
        if (aju1 != null)
        {
            aig aig1 = aju1.a(null).d();
            aig1.a(Float.valueOf(((akq) (obj)).a));
            aju1.a(aig1);
        }
        aju1 = b("stdev");
        if (aju1 != null)
        {
            aig aig2 = aju1.a(null).d();
            aig2.a(Float.valueOf(((akq) (obj)).b));
            aju1.a(aig2);
        }
    }
}
