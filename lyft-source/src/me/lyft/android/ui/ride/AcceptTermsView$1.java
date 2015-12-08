// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.ui.ride;

import me.lyft.android.analytics.studies.RegistrationAnalytics;
import me.lyft.android.common.Unit;
import rx.functions.Action1;

// Referenced classes of package me.lyft.android.ui.ride:
//            AcceptTermsView

class this._cls0
    implements Action1
{

    final AcceptTermsView this$0;

    public volatile void call(Object obj)
    {
        call((Unit)obj);
    }

    public void call(Unit unit)
    {
        RegistrationAnalytics.trackCloseTermsOfService();
    }

    tionAnalytics()
    {
        this$0 = AcceptTermsView.this;
        super();
    }
}
