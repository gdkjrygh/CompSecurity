// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.ui.passenger;

import me.lyft.android.analytics.ScreenAnalytics;
import me.lyft.android.application.ride.IDestinySession;
import me.lyft.android.common.Unit;
import me.lyft.android.controls.Toolbar;
import me.lyft.android.rx.Binder;
import me.lyft.android.ui.ride.RideMap;
import rx.functions.Action1;

// Referenced classes of package me.lyft.android.ui.passenger:
//            SetDestinyView

class this._cls0
    implements Action1
{

    final SetDestinyView this$0;

    public volatile void call(Object obj)
    {
        call((Unit)obj);
    }

    public void call(Unit unit)
    {
        ScreenAnalytics.trackScreenView("driver_add_destiny");
        rideMap.bindPadding(topView, bottomView);
        rideMap.centerMapGestures(true);
        rideMap.clearAllMarkers();
        rideMap.showShortcuts();
        SetDestinyView.access$000(SetDestinyView.this).bind(toolbar.observeItemClick(), SetDestinyView.access$200(SetDestinyView.this));
        SetDestinyView.access$000(SetDestinyView.this).bind(rideMap.observeMapDragEnd(), SetDestinyView.access$300(SetDestinyView.this));
        SetDestinyView.access$000(SetDestinyView.this).bind(rideMap.observeShortcutClick(), SetDestinyView.access$400(SetDestinyView.this));
        SetDestinyView.access$000(SetDestinyView.this).bind(destinySession.observeLocationChanges(), SetDestinyView.access$500(SetDestinyView.this));
        SetDestinyView.access$000(SetDestinyView.this).bind(rideMap.observeMapDragEnd(), SetDestinyView.access$300(SetDestinyView.this));
        SetDestinyView.access$000(SetDestinyView.this).bind(SetDestinyView.access$600(SetDestinyView.this), SetDestinyView.access$700(SetDestinyView.this));
    }

    on()
    {
        this$0 = SetDestinyView.this;
        super();
    }
}
