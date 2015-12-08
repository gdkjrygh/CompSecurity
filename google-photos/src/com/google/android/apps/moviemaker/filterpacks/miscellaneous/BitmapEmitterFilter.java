// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.moviemaker.filterpacks.miscellaneous;

import ahs;
import ahv;
import aif;
import ajo;
import ajr;
import ajw;

// Referenced classes of package com.google.android.apps.moviemaker.filterpacks.miscellaneous:
//            BaseEmitterFilter

public class BitmapEmitterFilter extends BaseEmitterFilter
{

    private int mEmitIntervalMillis;
    private long mLastEmittedTimestampNs;

    public BitmapEmitterFilter(ajr ajr, String s)
    {
        super(ajr, s);
        mEmitIntervalMillis = 5000;
        mLastEmittedTimestampNs = 0x8000000000000000L;
    }

    public final ajw b()
    {
        return (new ajw()).a("input", 2, aif.a(301, 1)).a("emitIntervalMillis", 1, aif.a(Integer.TYPE)).a();
    }

    public final void b(ajo ajo1)
    {
        if (ajo1.b.equals("emitIntervalMillis"))
        {
            ajo1.a("mEmitIntervalMillis");
            ajo1.g = true;
        }
    }

    protected final void c()
    {
        mLastEmittedTimestampNs = 0x8000000000000000L;
    }

    protected final void e()
    {
        ahs ahs1 = a("input").a();
        long l = ahs1.c();
        if (l - (long)mEmitIntervalMillis * 1000L * 1000L >= mLastEmittedTimestampNs)
        {
            ahv ahv1 = ahs1.h();
            a(ahs1.c() / 1000L, ahv1.q());
            mLastEmittedTimestampNs = l;
        }
    }
}
