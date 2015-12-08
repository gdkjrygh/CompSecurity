// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.ui.passenger.v2.widgets;

import rx.functions.Action1;

// Referenced classes of package me.lyft.android.ui.passenger.v2.widgets:
//            FixedFareWidgetPresenter

class this._cls0
    implements Action1
{

    final FixedFareWidgetPresenter this$0;

    public void call(Boolean boolean1)
    {
        ((xedFareView)FixedFareWidgetPresenter.access$400(FixedFareWidgetPresenter.this)).setLoading(boolean1.booleanValue());
    }

    public volatile void call(Object obj)
    {
        call((Boolean)obj);
    }

    xedFareView()
    {
        this$0 = FixedFareWidgetPresenter.this;
        super();
    }
}
