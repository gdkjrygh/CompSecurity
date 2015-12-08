// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.ui.driver.achievements.card;

import android.view.View;
import me.lyft.android.analytics.studies.ExpressPayAnalytics;
import me.lyft.android.application.driver.expresspay.IExpressPayService;
import me.lyft.android.common.AppFlow;
import me.lyft.android.common.Unit;
import me.lyft.android.rx.AsyncCall;
import me.lyft.android.rx.Binder;
import me.lyft.android.ui.IProgressController;
import me.lyft.android.ui.driver.expresspay.IExpressPayErrorHandler;

// Referenced classes of package me.lyft.android.ui.driver.achievements.card:
//            ExpressPayAchievementCard

class this._cls1 extends AsyncCall
{

    final ressController this$1;

    public void onFail(Throwable throwable)
    {
        super.onFail(throwable);
        expressPayErrorHandler.handleExpressPayError(throwable);
    }

    public volatile void onSuccess(Object obj)
    {
        onSuccess((Unit)obj);
    }

    public void onSuccess(Unit unit)
    {
        super.onSuccess(unit);
        appFlow.goTo(new me.lyft.android.ui.driver.());
    }

    public void onUnsubscribe()
    {
        super.onUnsubscribe();
        progressController.hideProgress();
    }

    is._cls0()
    {
        this$1 = this._cls1.this;
        super();
    }

    // Unreferenced inner class me/lyft/android/ui/driver/achievements/card/ExpressPayAchievementCard$1

/* anonymous class */
    class ExpressPayAchievementCard._cls1
        implements android.view.View.OnClickListener
    {

        final ExpressPayAchievementCard this$0;

        public void onClick(View view)
        {
            ExpressPayAnalytics.trackGetPaidTaps();
            progressController.showProgress();
            binder.bind(expressPayService.getExpressPay(), new ExpressPayAchievementCard._cls1._cls1());
        }

            
            {
                this$0 = ExpressPayAchievementCard.this;
                super();
            }
    }

}
