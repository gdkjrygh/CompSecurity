// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.infrastructure.splitfare;

import me.lyft.android.analytics.studies.SplitFareAnalytics;
import me.lyft.android.common.Unit;
import rx.functions.Action1;

// Referenced classes of package me.lyft.android.infrastructure.splitfare:
//            SplitFareService

class val.accept
    implements Action1
{

    final SplitFareService this$0;
    final boolean val$accept;

    public volatile void call(Object obj)
    {
        call((Unit)obj);
    }

    public void call(Unit unit)
    {
        SplitFareAnalytics.trackSplitResponseSuccess(val$accept);
    }

    A()
    {
        this$0 = final_splitfareservice;
        val$accept = Z.this;
        super();
    }
}
