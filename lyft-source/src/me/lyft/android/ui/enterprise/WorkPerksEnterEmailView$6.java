// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.ui.enterprise;

import android.content.res.Resources;
import java.util.List;
import me.lyft.android.analytics.AsyncActionAnalytics;
import me.lyft.android.common.AppFlow;
import me.lyft.android.common.Strings;
import me.lyft.android.infrastructure.lyft.LyftApiException;
import me.lyft.android.infrastructure.lyft.work.OrganizationDTO;
import me.lyft.android.infrastructure.lyft.work.UserOrganizationDTO;
import me.lyft.android.rx.AsyncCall;
import me.lyft.android.ui.IProgressController;
import me.lyft.android.ui.IViewErrorHandler;

// Referenced classes of package me.lyft.android.ui.enterprise:
//            WorkPerksEnterEmailView

class val.analytics extends AsyncCall
{

    final WorkPerksEnterEmailView this$0;
    final AsyncActionAnalytics val$analytics;

    public void onFail(Throwable throwable)
    {
        if (throwable instanceof LyftApiException)
        {
            Object obj = (LyftApiException)throwable;
            if (((LyftApiException) (obj)).getStatusCode() == 422)
            {
                if (((LyftApiException) (obj)).getValidationErrors().size() > 0)
                {
                    Object obj1 = (me.lyft.android.infrastructure.lyft.tionErrors)((LyftApiException) (obj)).getValidationErrors().get(0);
                    obj = ((me.lyft.android.infrastructure.lyft.tionErrors) (obj1)).getField();
                    obj1 = ((me.lyft.android.infrastructure.lyft.getField) (obj1)).getReason();
                    if (((String) (obj)).equalsIgnoreCase("email"))
                    {
                        if (((String) (obj1)).equalsIgnoreCase("duplicateAccount"))
                        {
                            val$analytics.trackResponseFailure("duplicateAccount");
                            WorkPerksEnterEmailView.access$400(WorkPerksEnterEmailView.this, getResources().getString(0x7f070398));
                            return;
                        }
                        if (((String) (obj1)).equalsIgnoreCase("invalidFormat"))
                        {
                            val$analytics.trackResponseFailure("invalidFormat");
                            WorkPerksEnterEmailView.access$400(WorkPerksEnterEmailView.this, getResources().getString(0x7f07039b));
                            return;
                        }
                        if (((String) (obj1)).equalsIgnoreCase("emailInvalid"))
                        {
                            val$analytics.trackResponseFailure("emailInvalid");
                            WorkPerksEnterEmailView.access$400(WorkPerksEnterEmailView.this, getResources().getString(0x7f07039a));
                            return;
                        } else
                        {
                            val$analytics.trackResponseFailure("general");
                            WorkPerksEnterEmailView.access$400(WorkPerksEnterEmailView.this, getResources().getString(0x7f070399));
                            return;
                        }
                    } else
                    {
                        val$analytics.trackResponseFailure("unknown");
                        viewErrorHandler.handle(throwable);
                        return;
                    }
                } else
                {
                    val$analytics.trackResponseFailure(throwable);
                    viewErrorHandler.handle(throwable);
                    return;
                }
            }
        }
        val$analytics.trackResponseFailure(throwable);
        viewErrorHandler.handle(throwable);
    }

    public volatile void onSuccess(Object obj)
    {
        onSuccess((List)obj);
    }

    public void onSuccess(List list)
    {
        String s;
        if (WorkPerksEnterEmailView.access$200(WorkPerksEnterEmailView.this).getOrganization() != null)
        {
            s = WorkPerksEnterEmailView.access$200(WorkPerksEnterEmailView.this).getOrganization().getStatus();
        } else
        {
            s = null;
        }
        if (!Strings.isNullOrEmpty(s) && "unverified".equalsIgnoreCase(s))
        {
            if (list.isEmpty())
            {
                val$analytics.trackResponseSuccess("Unverified with 0 users");
                appFlow.replaceWith(new sVerifyEmailScreen(WorkPerksEnterEmailView.access$300(WorkPerksEnterEmailView.this), WorkPerksEnterEmailView.access$200(WorkPerksEnterEmailView.this)));
                return;
            } else
            {
                val$analytics.trackResponseSuccess(String.format("Unverified with %d users", new Object[] {
                    Integer.valueOf(list.size())
                }));
                appFlow.goTo(new sInviteCoworkersViaContactsScreen(WorkPerksEnterEmailView.access$300(WorkPerksEnterEmailView.this), WorkPerksEnterEmailView.access$200(WorkPerksEnterEmailView.this)));
                return;
            }
        } else
        {
            val$analytics.trackResponseSuccess(String.format("Verified with %d users", new Object[] {
                Integer.valueOf(list.size())
            }));
            appFlow.replaceWith(new sInviteCoworkersSelectScreen(WorkPerksEnterEmailView.access$300(WorkPerksEnterEmailView.this), WorkPerksEnterEmailView.access$200(WorkPerksEnterEmailView.this)));
            return;
        }
    }

    public void onUnsubscribe()
    {
        progressController.enableUI();
        progressController.hideProgress();
    }

    sInviteCoworkersSelectScreen()
    {
        this$0 = final_workperksenteremailview;
        val$analytics = AsyncActionAnalytics.this;
        super();
    }
}
