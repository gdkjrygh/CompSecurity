// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.ui.enterprise;

import java.util.List;
import me.lyft.android.analytics.AsyncActionAnalytics;
import me.lyft.android.common.Unit;
import me.lyft.android.rx.AsyncCall;
import me.lyft.android.ui.IProgressController;
import me.lyft.android.ui.IViewErrorHandler;

// Referenced classes of package me.lyft.android.ui.enterprise:
//            WorkPerksInviteCoworkersViaContactsView

class val.analytics extends AsyncCall
{

    final WorkPerksInviteCoworkersViaContactsView this$0;
    final AsyncActionAnalytics val$analytics;

    public void onFail(Throwable throwable)
    {
        val$analytics.trackResponseFailure(throwable);
        viewErrorHandler.handle(throwable);
    }

    public volatile void onSuccess(Object obj)
    {
        onSuccess((Unit)obj);
    }

    public void onSuccess(Unit unit)
    {
        val$analytics.trackResponseSuccess(String.format("Invites sent: %d", new Object[] {
            Integer.valueOf(invitesToSend.size())
        }));
        WorkPerksInviteCoworkersViaContactsView.access$500(WorkPerksInviteCoworkersViaContactsView.this);
    }

    public void onUnsubscribe()
    {
        progressController.enableUI();
        progressController.hideProgress();
    }

    ()
    {
        this$0 = final_workperksinvitecoworkersviacontactsview;
        val$analytics = AsyncActionAnalytics.this;
        super();
    }
}
