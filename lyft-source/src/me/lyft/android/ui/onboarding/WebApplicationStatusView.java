// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.ui.onboarding;

import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.net.Uri;
import android.util.AttributeSet;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;
import butterknife.ButterKnife;
import com.lyft.scoop.Scoop;
import me.lyft.android.ILyftPreferences;
import me.lyft.android.IUserSession;
import me.lyft.android.application.settings.ISignUrlService;
import me.lyft.android.common.AppFlow;
import me.lyft.android.infrastructure.ats.ATSApi;
import me.lyft.android.infrastructure.ats.ATSException;
import me.lyft.android.infrastructure.ats.DriverApplicationDTO;
import me.lyft.android.rx.AsyncCall;
import me.lyft.android.rx.Binder;
import me.lyft.android.ui.IProgressController;
import me.lyft.android.ui.IViewErrorHandler;

public class WebApplicationStatusView extends LinearLayout
{

    AppFlow appFlow;
    TextView applicationCompletenessTextView;
    ATSApi atsApi;
    private Binder binder;
    TextView completeApplicationSubtitleTextView;
    LinearLayout contentLayout;
    ILyftPreferences lyftPreferences;
    IProgressController progressController;
    Button resumeApplicationButton;
    ISignUrlService signUrlService;
    IUserSession userSession;
    IViewErrorHandler viewErrorHandler;

    public WebApplicationStatusView(Context context, AttributeSet attributeset)
    {
        super(context, attributeset);
        Scoop.a(this).b(this);
    }

    private void initView(DriverApplicationDTO driverapplicationdto)
    {
        int i = driverapplicationdto.getWebOnboardingCompleteness().intValue();
        String s = getResources().getString(0x7f070072, new Object[] {
            Integer.valueOf(i)
        });
        applicationCompletenessTextView.setText(s);
        if (driverapplicationdto.isWebOnboardingComplete())
        {
            completeApplicationSubtitleTextView.setText(0x7f070074);
            resumeApplicationButton.setText(0x7f070073);
            return;
        } else
        {
            completeApplicationSubtitleTextView.setText(0x7f070075);
            resumeApplicationButton.setText(0x7f070079);
            return;
        }
    }

    private void loadDriverApplication()
    {
        contentLayout.setVisibility(4);
        progressController.showProgress();
        binder.bind(atsApi.getDriverApplication(), new AsyncCall() {

            final WebApplicationStatusView this$0;

            public void onFail(Throwable throwable)
            {
                super.onFail(throwable);
                if ((throwable instanceof ATSException) && ((ATSException)throwable).getStatusCode() == 404)
                {
                    appFlow.replaceWith(new OnboardingScreens.BecomeLyftDriver());
                    return;
                } else
                {
                    viewErrorHandler.handle(throwable);
                    return;
                }
            }

            public volatile void onSuccess(Object obj)
            {
                onSuccess((DriverApplicationDTO)obj);
            }

            public void onSuccess(DriverApplicationDTO driverapplicationdto)
            {
                super.onSuccess(driverapplicationdto);
                userSession.setDriverApplication(driverapplicationdto);
                initView(driverapplicationdto);
            }

            public void onUnsubscribe()
            {
                super.onUnsubscribe();
                contentLayout.setVisibility(0);
                progressController.hideProgress();
            }

            
            {
                this$0 = WebApplicationStatusView.this;
                super();
            }
        });
    }

    protected void onAttachedToWindow()
    {
        super.onAttachedToWindow();
        if (isInEditMode())
        {
            return;
        } else
        {
            binder = Binder.attach(this);
            loadDriverApplication();
            return;
        }
    }

    protected void onFinishInflate()
    {
        super.onFinishInflate();
        if (isInEditMode())
        {
            return;
        } else
        {
            ButterKnife.a(this);
            return;
        }
    }

    void onResumeApplicationClicked()
    {
        progressController.showProgress();
        String s = (new StringBuilder()).append(lyftPreferences.getLyftWebRoot()).append("/drivers?from_app=1").toString();
        binder.bind(signUrlService.getSignedUrl(s), new AsyncCall() {

            final WebApplicationStatusView this$0;

            public void onFail(Throwable throwable)
            {
                super.onFail(throwable);
                viewErrorHandler.handle(throwable);
            }

            public volatile void onSuccess(Object obj)
            {
                onSuccess((String)obj);
            }

            public void onSuccess(String s1)
            {
                super.onSuccess(s1);
                s1 = new Intent("android.intent.action.VIEW", Uri.parse(s1));
                s1.addFlags(0x10000000);
                getContext().startActivity(s1);
            }

            public void onUnsubscribe()
            {
                super.onUnsubscribe();
                progressController.hideProgress();
            }

            
            {
                this$0 = WebApplicationStatusView.this;
                super();
            }
        });
    }

}
