// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.ui.splitfare;

import me.lyft.android.analytics.studies.SplitFareAnalytics;
import me.lyft.android.common.Unit;
import rx.functions.Action1;

// Referenced classes of package me.lyft.android.ui.splitfare:
//            InviteToSplitView

class this._cls0
    implements Action1
{

    final InviteToSplitView this$0;

    public volatile void call(Object obj)
    {
        call((Unit)obj);
    }

    public void call(Unit unit)
    {
        SplitFareAnalytics.trackSplitRequestCancel();
    }

    ics()
    {
        this$0 = InviteToSplitView.this;
        super();
    }
}
