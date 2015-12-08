// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.ui.invites;

import me.lyft.android.analytics.ActionAnalytics;
import me.lyft.android.common.DialogFlow;
import me.lyft.android.common.Strings;
import me.lyft.android.common.Unit;
import me.lyft.android.rx.AsyncCall;
import me.lyft.android.ui.IProgressController;
import me.lyft.android.ui.IViewErrorHandler;

// Referenced classes of package me.lyft.android.ui.invites:
//            InviteScreenView

class val.phones extends AsyncCall
{

    final InviteScreenView this$0;
    final ActionAnalytics val$analytics;
    final StringBuilder val$phones;

    public void onFail(Throwable throwable)
    {
        val$analytics.trackFailure(throwable);
        viewErrorHandler.handle(throwable);
    }

    public volatile void onSuccess(Object obj)
    {
        onSuccess((Unit)obj);
    }

    public void onSuccess(Unit unit)
    {
        checkAllItems(false);
        InviteScreenView.access$000(InviteScreenView.this);
        if (!Strings.isNullOrEmpty(val$phones.toString()))
        {
            startGroupSmsIntentWithDelay(val$phones.toString(), 250);
        }
        val$analytics.trackSuccess();
        dialogFlow.show(new me.lyft.android.ui.passenger.vitesSentDialog());
    }

    public void onUnsubscribe()
    {
        progressController.enableUI();
        progressController.hideProgress();
    }

    InvitesSentDialog()
    {
        this$0 = final_invitescreenview;
        val$analytics = actionanalytics;
        val$phones = StringBuilder.this;
        super();
    }
}
