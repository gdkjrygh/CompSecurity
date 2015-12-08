// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.ui.passenger;

import me.lyft.android.analytics.AsyncActionAnalytics;
import me.lyft.android.common.AppFlow;
import me.lyft.android.common.DialogFlow;
import me.lyft.android.common.Unit;
import me.lyft.android.rx.AsyncCall;
import me.lyft.android.ui.IProgressController;
import me.lyft.android.ui.IViewErrorHandler;

// Referenced classes of package me.lyft.android.ui.passenger:
//            PassengerSubmitRatingButton

class val.analytics extends AsyncCall
{

    final PassengerSubmitRatingButton this$0;
    final AsyncActionAnalytics val$analytics;
    final int val$rating;

    public void onFail(Throwable throwable)
    {
        super.onFail(throwable);
        val$analytics.trackResponseFailure(throwable);
        viewErrorHandler.handle(throwable);
    }

    public volatile void onSuccess(Object obj)
    {
        onSuccess((Unit)obj);
    }

    public void onSuccess(Unit unit)
    {
        super.onSuccess(unit);
        appFlow.resetTo(new me.lyft.android.ui.gButton.appFlow());
        if (PassengerSubmitRatingButton.access$000(PassengerSubmitRatingButton.this, val$rating))
        {
            if (PassengerSubmitRatingButton.access$100(PassengerSubmitRatingButton.this))
            {
                dialogFlow.show(new ndedDialog());
                unit = "show_invite_recommended";
            } else
            {
                dialogFlow.show(new eDialog());
                unit = "show_prompt_to_invite";
            }
        } else
        {
            unit = "done";
        }
        val$analytics.trackResponseSuccess(unit);
    }

    public void onUnsubscribe()
    {
        super.onUnsubscribe();
        progressController.enableUI();
    }

    eDialog()
    {
        this$0 = final_passengersubmitratingbutton;
        val$rating = i;
        val$analytics = AsyncActionAnalytics.this;
        super();
    }
}
