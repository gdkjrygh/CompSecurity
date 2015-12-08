// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.wallet.navdrawer;

import com.google.android.apps.wallet.base.java.System;
import com.google.android.apps.wallet.eventbus.EventBus;
import com.google.android.apps.wallet.logging.WLog;
import com.google.android.apps.wallet.util.async.AsyncCallback;

// Referenced classes of package com.google.android.apps.wallet.navdrawer:
//            NavDrawerPublisher, NavDrawerEvent

final class this._cls0
    implements AsyncCallback
{

    final NavDrawerPublisher this$0;

    private void onSuccess(com.google.wallet.proto.api.FetchNavigationResponse fetchnavigationresponse)
    {
        NavDrawerPublisher.access$300(NavDrawerPublisher.this).post(new NavDrawerEvent(fetchnavigationresponse.topNavigation));
        fetchnavigationresponse = NavDrawerPublisher.this;
        System _tmp = NavDrawerPublisher.access$700(NavDrawerPublisher.this);
        NavDrawerPublisher.access$602(fetchnavigationresponse, System.currentTimeMillis());
    }

    public final void onFailure(Exception exception)
    {
        WLog.efmt(NavDrawerPublisher.access$400(), "Exception in RPC trying to retrieve NavDrawer from xBar: %s", new Object[] {
            exception
        });
    }

    public final volatile void onSuccess(Object obj)
    {
        onSuccess((com.google.wallet.proto.api.FetchNavigationResponse)obj);
    }

    onResponse()
    {
        this$0 = NavDrawerPublisher.this;
        super();
    }
}
