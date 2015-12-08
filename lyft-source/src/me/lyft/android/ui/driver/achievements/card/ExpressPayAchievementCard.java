// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.ui.driver.achievements.card;

import android.content.Context;
import android.content.res.Resources;
import android.view.View;
import android.widget.Button;
import me.lyft.android.analytics.studies.ExpressPayAnalytics;
import me.lyft.android.application.driver.expresspay.IExpressPayService;
import me.lyft.android.common.AppFlow;
import me.lyft.android.common.Unit;
import me.lyft.android.rx.AsyncCall;
import me.lyft.android.rx.Binder;
import me.lyft.android.ui.IProgressController;
import me.lyft.android.ui.driver.expresspay.IExpressPayErrorHandler;

// Referenced classes of package me.lyft.android.ui.driver.achievements.card:
//            LightAchievementCardView

public class ExpressPayAchievementCard extends LightAchievementCardView
{

    AppFlow appFlow;
    private final String buttonText;
    IExpressPayErrorHandler expressPayErrorHandler;
    IExpressPayService expressPayService;
    Button getPaidButton;
    IProgressController progressController;

    public ExpressPayAchievementCard(Context context, String s)
    {
        super(context);
        buttonText = s;
    }

    public int getGradientEndColor()
    {
        return getResources().getColor(0x7f0c006a);
    }

    public int getGradientStartColor()
    {
        return getResources().getColor(0x7f0c000c);
    }

    protected int getLayout()
    {
        return 0x7f030075;
    }

    int getSubtitleColor()
    {
        return getResources().getColor(0x7f0c0025);
    }

    int getTitleColor()
    {
        return getResources().getColor(0x7f0c0025);
    }

    protected void onAttachedToWindow()
    {
        super.onAttachedToWindow();
        getPaidButton.setText(buttonText);
        getPaidButton.setOnClickListener(new android.view.View.OnClickListener() {

            final ExpressPayAchievementCard this$0;

            public void onClick(View view)
            {
                ExpressPayAnalytics.trackGetPaidTaps();
                progressController.showProgress();
                binder.bind(expressPayService.getExpressPay(), new AsyncCall() {

                    final _cls1 this$1;

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
                        appFlow.goTo(new me.lyft.android.ui.driver.DriverScreens.ExpressPayScreen());
                    }

                    public void onUnsubscribe()
                    {
                        super.onUnsubscribe();
                        progressController.hideProgress();
                    }

            
            {
                this$1 = _cls1.this;
                super();
            }
                });
            }

            
            {
                this$0 = ExpressPayAchievementCard.this;
                super();
            }
        });
    }
}
