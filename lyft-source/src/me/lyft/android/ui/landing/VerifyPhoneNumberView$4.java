// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.ui.landing;

import me.lyft.android.analytics.ActionAnalytics;
import me.lyft.android.application.landing.exceptions.DuplicatePhoneException;
import me.lyft.android.application.landing.exceptions.InvalidPhoneExeception;
import me.lyft.android.application.landing.exceptions.InvalidVerificationCodeException;
import me.lyft.android.application.landing.exceptions.LandingServiceException;
import me.lyft.android.application.landing.exceptions.SuspendedPhoneException;
import me.lyft.android.common.DialogFlow;
import me.lyft.android.common.Unit;
import me.lyft.android.rx.AsyncCall;
import me.lyft.android.ui.IProgressController;
import me.lyft.android.ui.IViewErrorHandler;
import rx.subjects.PublishSubject;

// Referenced classes of package me.lyft.android.ui.landing:
//            VerifyPhoneNumberView, LandingDialogs

class val.analytics extends AsyncCall
{

    final VerifyPhoneNumberView this$0;
    final ActionAnalytics val$analytics;

    public void onFail(Throwable throwable)
    {
        val$analytics.trackFailure(throwable);
        if (throwable instanceof LandingServiceException)
        {
            if ((throwable instanceof InvalidVerificationCodeException) || (throwable instanceof InvalidPhoneExeception))
            {
                VerifyPhoneNumberView.access$200(VerifyPhoneNumberView.this);
                return;
            }
            if (throwable instanceof DuplicatePhoneException)
            {
                dialogFlow.show(LandingDialogs.createDuplicatePhoneNumberErrorDialog(getResources(), throwable.getMessage()));
                return;
            }
            if (throwable instanceof SuspendedPhoneException)
            {
                dialogFlow.show(LandingDialogs.createSuspendedErrorDialog(getResources(), throwable.getMessage()));
                return;
            } else
            {
                viewErrorHandler.handle(throwable);
                return;
            }
        } else
        {
            viewErrorHandler.handle(throwable);
            return;
        }
    }

    public volatile void onSuccess(Object obj)
    {
        onSuccess((Unit)obj);
    }

    public void onSuccess(Unit unit)
    {
        val$analytics.trackSuccess();
        VerifyPhoneNumberView.access$100(VerifyPhoneNumberView.this).onNext(Unit.create());
    }

    public void onUnsubscribe()
    {
        super.onUnsubscribe();
        progressController.hideProgress();
    }

    endedPhoneException()
    {
        this$0 = final_verifyphonenumberview;
        val$analytics = ActionAnalytics.this;
        super();
    }
}
