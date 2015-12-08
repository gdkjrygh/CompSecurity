// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.ui.enterprise;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.LinearLayout;
import butterknife.ButterKnife;
import com.lyft.scoop.Scoop;
import me.lyft.android.analytics.AsyncActionAnalytics;
import me.lyft.android.analytics.studies.WorkPerksAnalytics;
import me.lyft.android.common.AppFlow;
import me.lyft.android.common.Objects;
import me.lyft.android.common.Strings;
import me.lyft.android.infrastructure.lyft.ILyftApi;
import me.lyft.android.infrastructure.lyft.work.OrganizationDTO;
import me.lyft.android.infrastructure.lyft.work.UserOrganizationDTO;
import me.lyft.android.rx.AsyncCall;
import me.lyft.android.rx.Binder;
import me.lyft.android.ui.IProgressController;
import me.lyft.android.ui.IViewErrorHandler;

public class WorkPerksMainView extends LinearLayout
{

    AppFlow appFlow;
    Binder binder;
    ILyftApi lyftApi;
    EnterpriseScreens.WorkPerksMainScreen params;
    IProgressController progressController;
    UserOrganizationDTO userOrganization;
    IViewErrorHandler viewErrorHandler;

    public WorkPerksMainView(Context context, AttributeSet attributeset)
    {
        super(context, attributeset);
        context = Scoop.a(this);
        context.b(this);
        params = (EnterpriseScreens.WorkPerksMainScreen)context.a();
    }

    private void getUserOrganization()
    {
        final AsyncActionAnalytics analytics = WorkPerksAnalytics.trackGetUserOrganizationAttempt();
        progressController.disableUI();
        progressController.showProgress();
        binder.bind(lyftApi.getUserOrganization(), new AsyncCall() {

            final WorkPerksMainView this$0;
            final AsyncActionAnalytics val$analytics;

            public void onFail(Throwable throwable)
            {
                analytics.trackResponseFailure(throwable);
                viewErrorHandler.handle(throwable);
            }

            public volatile void onSuccess(Object obj)
            {
                onSuccess((UserOrganizationDTO)obj);
            }

            public void onSuccess(UserOrganizationDTO userorganizationdto)
            {
                String s;
                if (userorganizationdto.getOrganization() != null)
                {
                    s = userorganizationdto.getOrganization().getName();
                } else
                {
                    s = "";
                }
                analytics.trackResponseSuccess(s);
                userOrganization = userorganizationdto;
                workPerksScreenChooser();
            }

            public void onUnsubscribe()
            {
                progressController.enableUI();
                progressController.hideProgress();
            }

            
            {
                this$0 = WorkPerksMainView.this;
                analytics = asyncactionanalytics;
                super();
            }
        });
    }

    private void workPerksScreenChooser()
    {
        OrganizationDTO organizationdto = (OrganizationDTO)Objects.firstNonNull(userOrganization.getOrganization(), new OrganizationDTO(null, null, null, null, null, null, null, null, null));
        if (Strings.isNullOrEmpty((String)Objects.firstNonNull(organizationdto.getStatus(), "")))
        {
            appFlow.replaceWith(new EnterpriseScreens.WorkPerksEnterEmailScreen((String)Objects.firstNonNull(organizationdto.getEmail(), ""), userOrganization));
            return;
        }
        if (!Strings.isNullOrEmpty(organizationdto.getStatus()) && "unverified".equalsIgnoreCase(organizationdto.getStatus()))
        {
            appFlow.replaceWith(new EnterpriseScreens.WorkPerksVerifyEmailSelectScreen((String)Objects.firstNonNull(organizationdto.getEmail(), ""), userOrganization));
            return;
        }
        if (!Strings.isNullOrEmpty(organizationdto.getStatus()) && "unapproved".equalsIgnoreCase(organizationdto.getStatus()))
        {
            appFlow.replaceWith(new EnterpriseScreens.WorkPerksInviteCoworkersSelectScreen((String)Objects.firstNonNull(organizationdto.getEmail(), ""), userOrganization));
            return;
        }
        if (!Strings.isNullOrEmpty(organizationdto.getStatus()) && "approved".equalsIgnoreCase(organizationdto.getStatus()))
        {
            String s = params.getOrganizationCreditLabel();
            if (Strings.isNullOrEmpty(s))
            {
                appFlow.replaceWith(new EnterpriseScreens.WorkPerksInviteCoworkersSelectScreen((String)Objects.firstNonNull(organizationdto.getEmail(), ""), userOrganization));
                return;
            } else
            {
                appFlow.replaceWith(new EnterpriseScreens.WorkPerksInviteCoworkersScreen((String)Objects.firstNonNull(organizationdto.getEmail(), ""), userOrganization, s));
                return;
            }
        } else
        {
            appFlow.replaceWith(new EnterpriseScreens.WorkPerksEnterEmailScreen((String)Objects.firstNonNull(organizationdto.getEmail(), ""), userOrganization));
            return;
        }
    }

    protected void onAttachedToWindow()
    {
        super.onAttachedToWindow();
        binder = Binder.attach(this);
        getUserOrganization();
    }

    protected void onFinishInflate()
    {
        super.onFinishInflate();
        ButterKnife.a(this);
    }

}
