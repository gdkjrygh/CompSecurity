// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.ui.passenger;

import android.content.res.Resources;
import me.lyft.android.analytics.AsyncActionAnalytics;
import me.lyft.android.common.DialogFlow;
import me.lyft.android.common.Unit;
import me.lyft.android.rx.AsyncCall;
import me.lyft.android.ui.IProgressController;
import me.lyft.android.ui.dialogs.Toast;

// Referenced classes of package me.lyft.android.ui.passenger:
//            InviteTopContactsDialogView

class val.actualInviteCount extends AsyncCall
{

    final InviteTopContactsDialogView this$0;
    final int val$actualInviteCount;

    public void onFail(Throwable throwable)
    {
        InviteTopContactsDialogView.access$000(InviteTopContactsDialogView.this).trackResponseFailure(throwable);
        dialogFlow.dismiss();
    }

    public volatile void onSuccess(Object obj)
    {
        onSuccess((Unit)obj);
    }

    public void onSuccess(Unit unit)
    {
        InviteTopContactsDialogView.access$000(InviteTopContactsDialogView.this).trackResponseSuccess(String.format("invited %s", new Object[] {
            Integer.valueOf(val$actualInviteCount)
        }));
        dialogFlow.show(new Toast(getResources().getString(0x7f0701b9)));
    }

    public void onUnsubscribe()
    {
        super.onUnsubscribe();
        progressController.hideProgress();
    }

    ()
    {
        this$0 = final_invitetopcontactsdialogview;
        val$actualInviteCount = I.this;
        super();
    }
}
