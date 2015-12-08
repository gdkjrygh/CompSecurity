// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.ui.passenger;

import android.view.View;
import android.widget.AbsListView;
import java.util.List;
import me.lyft.android.analytics.AsyncActionAnalytics;
import me.lyft.android.common.DialogFlow;
import me.lyft.android.rx.AsyncCall;

// Referenced classes of package me.lyft.android.ui.passenger:
//            InviteTopContactsDialogView

class this._cls0 extends AsyncCall
{

    final InviteTopContactsDialogView this$0;

    public void onFail(Throwable throwable)
    {
        super.onFail(throwable);
        InviteTopContactsDialogView.access$000(InviteTopContactsDialogView.this).trackResponseFailure(throwable);
        dialogFlow.dismiss();
    }

    public volatile void onSuccess(Object obj)
    {
        onSuccess((List)obj);
    }

    public void onSuccess(List list)
    {
        super.onSuccess(list);
        if (list.size() == 0)
        {
            InviteTopContactsDialogView.access$000(InviteTopContactsDialogView.this).trackResponseFailure("no_users");
            dialogFlow.dismiss();
            return;
        } else
        {
            InviteTopContactsDialogView.access$102(InviteTopContactsDialogView.this, new ntactsAdapter(InviteTopContactsDialogView.this, getContext(), list));
            gridView.setAdapter(InviteTopContactsDialogView.access$100(InviteTopContactsDialogView.this));
            return;
        }
    }

    public void onUnsubscribe()
    {
        super.onUnsubscribe();
        rootContainer.setVisibility(0);
    }

    ntactsAdapter()
    {
        this$0 = InviteTopContactsDialogView.this;
        super();
    }
}
