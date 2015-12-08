// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.ui.ride;

import android.content.Context;
import android.content.res.Resources;
import android.util.AttributeSet;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import butterknife.ButterKnife;
import com.lyft.scoop.IHandleBack;
import com.lyft.scoop.Scoop;
import me.lyft.android.analytics.studies.RegistrationAnalytics;
import me.lyft.android.application.IUserProvider;
import me.lyft.android.application.landing.ILandingService;
import me.lyft.android.common.AppFlow;
import me.lyft.android.common.DialogFlow;
import me.lyft.android.common.Unit;
import me.lyft.android.controls.Toolbar;
import me.lyft.android.domain.User;
import me.lyft.android.rx.AsyncCall;
import me.lyft.android.rx.Binder;
import me.lyft.android.ui.IProgressController;
import me.lyft.android.ui.IViewErrorHandler;
import me.lyft.android.ui.WebBrowserView;
import me.lyft.android.ui.dialogs.Toast;
import rx.functions.Action1;

public class AcceptTermsView extends LinearLayout
    implements IHandleBack
{

    Button acceptButton;
    AppFlow appFlow;
    DialogFlow dialogFlow;
    IViewErrorHandler errorHandler;
    boolean isToDriverFlow;
    ILandingService landingService;
    final me.lyft.android.ui.MainScreens.AcceptTermsScreen params;
    IProgressController progressController;
    Toolbar toolbar;
    IUserProvider userProvider;
    WebBrowserView webBrowserView;

    public AcceptTermsView(Context context, AttributeSet attributeset)
    {
        super(context, attributeset);
        context = Scoop.a(this);
        context.b(this);
        params = (me.lyft.android.ui.MainScreens.AcceptTermsScreen)context.a();
        isToDriverFlow = params.isToDriverFlow();
    }

    protected void onAttachedToWindow()
    {
        super.onAttachedToWindow();
        final Binder binder = Binder.attach(this);
        binder.bind(toolbar.observeHomeClick(), new Action1() {

            final AcceptTermsView this$0;

            public volatile void call(Object obj)
            {
                call((Unit)obj);
            }

            public void call(Unit unit)
            {
                RegistrationAnalytics.trackCloseTermsOfService();
            }

            
            {
                this$0 = AcceptTermsView.this;
                super();
            }
        });
        acceptButton.setVisibility(0);
        acceptButton.setOnClickListener(new android.view.View.OnClickListener() {

            final AcceptTermsView this$0;
            final Binder val$binder;

            public void onClick(View view)
            {
                progressController.showProgress();
                binder.bind(landingService.setTosAcceptedAndUpdateUser(), new AsyncCall() {

                    final _cls2 this$1;

                    public void onFail(Throwable throwable)
                    {
                        super.onFail(throwable);
                        errorHandler.handle(throwable);
                    }

                    public volatile void onSuccess(Object obj)
                    {
                        onSuccess((Unit)obj);
                    }

                    public void onSuccess(Unit unit)
                    {
                        super.onSuccess(unit);
                        if (isToDriverFlow)
                        {
                            dialogFlow.show(new Toast(getResources().getString(0x7f070364)));
                            if (userProvider.getUser().isApprovedDriver())
                            {
                                appFlow.resetTo(new me.lyft.android.ui.MainScreens.RideScreen());
                                return;
                            } else
                            {
                                appFlow.replaceWith(new me.lyft.android.ui.onboarding.OnboardingScreens.WebApplicationStatusScreen());
                                return;
                            }
                        } else
                        {
                            appFlow.goBack();
                            return;
                        }
                    }

                    public void onUnsubscribe()
                    {
                        super.onUnsubscribe();
                        progressController.hideProgress();
                    }

            
            {
                this$1 = _cls2.this;
                super();
            }
                });
            }

            
            {
                this$0 = AcceptTermsView.this;
                binder = binder1;
                super();
            }
        });
    }

    public boolean onBack()
    {
        return false;
    }

    protected void onFinishInflate()
    {
        super.onFinishInflate();
        ButterKnife.a(this);
        toolbar.setTitle(getContext().getResources().getString(0x7f070365));
        toolbar.setHomeButtonEnabled(true);
        toolbar.setHomeIconVisible(true);
        toolbar.setHomeIcon(0x7f020003);
        webBrowserView.setTargetUrl("http://api.lyft.com.s3.amazonaws.com/static/terms.html");
        if (isToDriverFlow)
        {
            acceptButton.setBackgroundResource(0x7f020050);
        }
    }
}
