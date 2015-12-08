// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.infrastructure.splitfare;

import java.util.List;
import me.lyft.android.analytics.studies.SplitFareAnalytics;
import rx.functions.Action1;

// Referenced classes of package me.lyft.android.infrastructure.splitfare:
//            SplitFareService

class this._cls0
    implements Action1
{

    final SplitFareService this$0;

    public volatile void call(Object obj)
    {
        call((List)obj);
    }

    public void call(List list)
    {
        SplitFareAnalytics.trackSplitLoadContactsSuccess(list.size());
    }

    A()
    {
        this$0 = SplitFareService.this;
        super();
    }
}
