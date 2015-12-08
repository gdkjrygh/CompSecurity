// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package androidx.media.filterpacks.performance;

import ahn;
import ahs;
import aif;
import aig;
import ajo;
import ajr;
import aju;
import ajw;
import alc;
import android.os.SystemClock;

public class ThroughputFilter extends ahn
{

    private long mLastTime;
    private int mPeriod;
    private int mPeriodFrameCount;
    private int mTotalFrameCount;

    public ThroughputFilter(ajr ajr, String s)
    {
        super(ajr, s);
        mPeriod = 3;
        mLastTime = 0L;
        mTotalFrameCount = 0;
        mPeriodFrameCount = 0;
    }

    public final ajw b()
    {
        aif aif1 = aif.a(alc);
        return (new ajw()).a("frame", 2, aif.a()).b("throughput", 2, aif1).b("frame", 2, aif.a()).a("period", 1, aif.a(Integer.TYPE)).a();
    }

    public final void b(ajo ajo1)
    {
        if (ajo1.b.equals("period"))
        {
            ajo1.a("mPeriod");
            return;
        } else
        {
            ajo1.a(b("frame"));
            return;
        }
    }

    protected final void d()
    {
        mTotalFrameCount = 0;
        mPeriodFrameCount = 0;
        mLastTime = 0L;
    }

    protected final void e()
    {
        this;
        JVM INSTR monitorenter ;
        ahs ahs1 = a("frame").a();
        mTotalFrameCount = mTotalFrameCount + 1;
        mPeriodFrameCount = mPeriodFrameCount + 1;
        if (mLastTime == 0L)
        {
            mLastTime = SystemClock.elapsedRealtime();
        }
        long l = SystemClock.elapsedRealtime();
        if (l - mLastTime >= (long)(mPeriod * 1000))
        {
            aju aju1 = b("throughput");
            alc alc1 = new alc(mTotalFrameCount, mPeriodFrameCount, l - mLastTime);
            aig aig1 = aju1.a(null).d();
            aig1.a(alc1);
            aju1.a(aig1);
            mLastTime = l;
            mPeriodFrameCount = 0;
        }
        b("frame").a(ahs1);
        this;
        JVM INSTR monitorexit ;
        return;
        Exception exception;
        exception;
        throw exception;
    }
}
