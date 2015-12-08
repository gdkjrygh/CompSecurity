// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.moviemaker.filterpacks.miscellaneous;

import ahs;
import aif;
import aig;
import ajo;
import ajr;
import ajw;

// Referenced classes of package com.google.android.apps.moviemaker.filterpacks.miscellaneous:
//            BaseEmitterFilter

public class StatisticEmitterFilter extends BaseEmitterFilter
{

    public StatisticEmitterFilter(ajr ajr, String s)
    {
        super(ajr, s);
    }

    public final ajw b()
    {
        return (new ajw()).a("input", 2, aif.b()).a();
    }

    protected final void e()
    {
        aig aig1 = a("input").a().d();
        a(aig1.c() / 1000L, aig1.m());
    }
}
