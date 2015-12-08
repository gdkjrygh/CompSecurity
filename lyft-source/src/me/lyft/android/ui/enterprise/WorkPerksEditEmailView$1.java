// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.ui.enterprise;

import android.content.res.Resources;
import java.util.List;
import me.lyft.android.analytics.AsyncActionAnalytics;
import me.lyft.android.common.AppFlow;
import me.lyft.android.controls.AdvancedEditText;
import me.lyft.android.infrastructure.lyft.LyftApiException;
import me.lyft.android.infrastructure.lyft.work.OrganizationDTO;
import me.lyft.android.infrastructure.lyft.work.UserOrganizationDTO;
import me.lyft.android.rx.AsyncCall;
import me.lyft.android.ui.IProgressController;
import me.lyft.android.ui.IViewErrorHandler;

// Referenced classes of package me.lyft.android.ui.enterprise:
//            WorkPerksEditEmailView

class val.analytics extends AsyncCall
{

    final WorkPerksEditEmailView this$0;
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
                    Object obj1 = (me.lyft.android.infrastructure.lyft.)((LyftApiException) (obj)).getValidationErrors().get(0);
                    obj = ((me.lyft.android.infrastructure.lyft.) (obj1)).getField();
                    obj1 = ((me.lyft.android.infrastructure.lyft.) (obj1)).getReason();
                    if (((String) (obj)).equalsIgnoreCase("email"))
                    {
                        if (((String) (obj1)).equalsIgnoreCase("duplicateAccount"))
                        {
                            val$analytics.trackResponseFailure("duplicateAccount");
                            handleEmailError(getResources().getString(0x7f070398));
                            return;
                        }
                        if (((String) (obj1)).equalsIgnoreCase("invalidFormat"))
                        {
                            val$analytics.trackResponseFailure("invalidFormat");
                            handleEmailError(getResources().getString(0x7f07039b));
                            return;
                        }
                        if (((String) (obj1)).equalsIgnoreCase("emailInvalid"))
                        {
                            val$analytics.trackResponseFailure("emailInvalid");
                            handleEmailError(getResources().getString(0x7f07039a));
                            return;
                        } else
                        {
                            val$analytics.trackResponseFailure("general");
                            handleEmailError(getResources().getString(0x7f070399));
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
        onSuccess((UserOrganizationDTO)obj);
    }

    public void onSuccess(UserOrganizationDTO userorganizationdto)
    {
        AsyncActionAnalytics asyncactionanalytics = val$analytics;
        String s;
        if (userorganizationdto.getOrganization() != null)
        {
            s = userorganizationdto.getOrganization().getName();
        } else
        {
            s = "";
        }
        asyncactionanalytics.trackResponseSuccess(s);
        appFlow.replaceWith(new ksVerifyEmailScreen(emailEditText.getEditableText().toString(), userorganizationdto));
    }

    public void onUnsubscribe()
    {
        progressController.enableUI();
        progressController.hideProgress();
    }

    onDTO()
    {
        this$0 = final_workperkseditemailview;
        val$analytics = AsyncActionAnalytics.this;
        super();
    }
}
