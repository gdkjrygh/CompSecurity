// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.ui.payment;

import android.content.Context;
import android.content.res.Resources;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import butterknife.ButterKnife;
import com.lyft.scoop.Scoop;
import me.lyft.android.ILyftPreferences;
import me.lyft.android.analytics.AsyncActionAnalytics;
import me.lyft.android.analytics.studies.ConcurAnalytics;
import me.lyft.android.application.IUserProvider;
import me.lyft.android.application.ride.IExpenseNoteSession;
import me.lyft.android.application.settings.ISignUrlService;
import me.lyft.android.common.AppFlow;
import me.lyft.android.controls.Toggle;
import me.lyft.android.domain.User;
import me.lyft.android.rx.AsyncCall;
import me.lyft.android.rx.Binder;
import me.lyft.android.ui.IProgressController;
import me.lyft.android.ui.IViewErrorHandler;
import me.lyft.android.utils.WebBrowser;
import rx.functions.Action1;

public class ConcurView extends LinearLayout
{

    AppFlow appFlow;
    private Binder binder;
    IExpenseNoteSession expenseNoteSession;
    ILyftPreferences lyftPreferences;
    private final int mode;
    private PaymentScreens.PaymentBaseScreen params;
    IProgressController progressController;
    TextView sendToConcur;
    Toggle sendToConcurToggle;
    ISignUrlService signUrlService;
    IUserProvider userProvider;
    IViewErrorHandler viewErrorHandler;

    public ConcurView(Context context, AttributeSet attributeset)
    {
        super(context, attributeset);
        attributeset = Scoop.a(this);
        attributeset.b(this);
        params = (PaymentScreens.PaymentBaseScreen)attributeset.a();
        mode = params.getPaymentMode();
        setOrientation(1);
        context = attributeset.a(context);
        int i;
        if (mode == 0)
        {
            i = 0x7f030040;
        } else
        {
            i = 0x7f03003e;
        }
        context.inflate(i, this, true);
        ButterKnife.a(this);
    }

    private boolean isConcurLinked()
    {
        return userProvider.getUser().isConcurLinked();
    }

    private void linkConcur()
    {
        String s = (new StringBuilder()).append(lyftPreferences.getLyftWebRoot()).append("/concur/login").toString();
        final AsyncActionAnalytics analytics = ConcurAnalytics.linkAccountAnalytics();
        analytics.trackRequest();
        progressController.showProgress();
        binder.bind(signUrlService.getSignedUrl(s), new AsyncCall() {

            final ConcurView this$0;
            final AsyncActionAnalytics val$analytics;

            public void onFail(Throwable throwable)
            {
                super.onFail(throwable);
                analytics.trackResponseFailure(throwable);
                viewErrorHandler.handle(throwable);
            }

            public volatile void onSuccess(Object obj)
            {
                onSuccess((String)obj);
            }

            public void onSuccess(String s1)
            {
                super.onSuccess(s1);
                analytics.trackResponseSuccess();
                WebBrowser.open(getContext(), s1);
            }

            public void onUnsubscribe()
            {
                super.onUnsubscribe();
                progressController.hideProgress();
            }

            
            {
                this$0 = ConcurView.this;
                analytics = asyncactionanalytics;
                super();
            }
        });
    }

    private boolean sendConcurRideReceipts()
    {
        return userProvider.getUser().sendConcurRideReceipts();
    }

    protected void onAttachedToWindow()
    {
        super.onAttachedToWindow();
        if (isInEditMode())
        {
            return;
        }
        binder = Binder.attach(this);
        if (mode == 0)
        {
            if (isConcurLinked())
            {
                TextView textview = sendToConcur;
                Resources resources = getResources();
                int i;
                if (sendConcurRideReceipts())
                {
                    i = 0x7f070213;
                } else
                {
                    i = 0x7f070211;
                }
                textview.setText(resources.getString(i));
            }
            setOnClickListener(new android.view.View.OnClickListener() {

                final ConcurView this$0;

                public void onClick(View view)
                {
                    if (userProvider.getUser().isConcurLinked())
                    {
                        appFlow.goTo(new PaymentScreens.ConcurSendRideReceiptsScreen());
                        return;
                    } else
                    {
                        linkConcur();
                        return;
                    }
                }

            
            {
                this$0 = ConcurView.this;
                super();
            }
            });
            return;
        }
        if (isConcurLinked())
        {
            sendToConcurToggle.setChecked(expenseNoteSession.isConcurEnabled(), false);
            binder.bind(sendToConcurToggle.observeChange(), new Action1() {

                final ConcurView this$0;

                public void call(Boolean boolean1)
                {
                    if (boolean1.booleanValue())
                    {
                        ConcurAnalytics.sendReceiptsEnabledDuringRide();
                    } else
                    {
                        ConcurAnalytics.sendReceiptsDisabledDuringRide();
                    }
                    expenseNoteSession.reset();
                    expenseNoteSession.setConcurEnabled(boolean1.booleanValue());
                }

                public volatile void call(Object obj)
                {
                    call((Boolean)obj);
                }

            
            {
                this$0 = ConcurView.this;
                super();
            }
            });
            return;
        } else
        {
            setVisibility(8);
            return;
        }
    }

}
