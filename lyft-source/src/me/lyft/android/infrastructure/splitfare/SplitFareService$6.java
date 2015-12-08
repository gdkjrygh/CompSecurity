// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.infrastructure.splitfare;

import java.util.List;
import me.lyft.android.analytics.studies.SplitFareAnalytics;
import me.lyft.android.common.Unit;
import me.lyft.android.providers.ISplitFareProvider;
import rx.functions.Action1;

// Referenced classes of package me.lyft.android.infrastructure.splitfare:
//            SplitFareService

class val.contacts
    implements Action1
{

    final SplitFareService this$0;
    final List val$contacts;

    public volatile void call(Object obj)
    {
        call((Unit)obj);
    }

    public void call(Unit unit)
    {
        SplitFareAnalytics.trackSplitRequestSuccess(val$contacts.size());
        SplitFareService.access$000(SplitFareService.this).incrementSplitFareCount(val$contacts);
    }

    A()
    {
        this$0 = final_splitfareservice;
        val$contacts = List.this;
        super();
    }
}
