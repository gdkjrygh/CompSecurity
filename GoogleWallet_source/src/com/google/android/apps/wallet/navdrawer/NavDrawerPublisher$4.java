// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.wallet.navdrawer;

import com.google.android.apps.wallet.eventbus.EventBus;
import com.google.android.apps.wallet.logging.WLog;
import com.google.android.apps.wallet.util.async.AsyncCallback;

// Referenced classes of package com.google.android.apps.wallet.navdrawer:
//            NavDrawerPublisher, NavDrawerEvent

final class val.doAfter
    implements AsyncCallback
{

    final NavDrawerPublisher this$0;
    final Runnable val$doAfter;

    private void onSuccess(com.google.wallet.proto.api.FetchNavigationResponse fetchnavigationresponse)
    {
        if (fetchnavigationresponse != null)
        {
            NavDrawerPublisher.access$300(NavDrawerPublisher.this).post(new NavDrawerEvent(fetchnavigationresponse.topNavigation));
        } else
        {
            WLog.dfmt(NavDrawerPublisher.access$400(), "FetchNavigationResponse from db is null", new Object[0]);
        }
        if (val$doAfter != null)
        {
            val$doAfter.run();
        }
    }

    public final void onFailure(Exception exception)
    {
        WLog.efmt(NavDrawerPublisher.access$400(), "Exception retrieving NavDrawer from db: %s", new Object[] {
            exception
        });
        if (val$doAfter != null)
        {
            val$doAfter.run();
        }
    }

    public final volatile void onSuccess(Object obj)
    {
        onSuccess((com.google.wallet.proto.api.FetchNavigationResponse)obj);
    }

    onResponse()
    {
        this$0 = final_navdrawerpublisher;
        val$doAfter = Runnable.this;
        super();
    }
}
