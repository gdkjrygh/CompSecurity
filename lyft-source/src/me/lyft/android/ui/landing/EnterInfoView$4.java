// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.ui.landing;

import java.util.Iterator;
import java.util.List;
import me.lyft.android.analytics.ActionAnalytics;
import me.lyft.android.application.landing.InvalidField;
import me.lyft.android.application.landing.exceptions.LandingValidationException;
import me.lyft.android.application.landing.exceptions.TermsNotAcceptedException;
import me.lyft.android.common.Unit;
import me.lyft.android.controls.AdvancedEditText;
import me.lyft.android.controls.EmailAutoFillEditText;
import me.lyft.android.persistence.landing.SignupUser;
import me.lyft.android.rx.AsyncCall;
import me.lyft.android.ui.IProgressController;
import me.lyft.android.ui.IViewErrorHandler;
import rx.subjects.PublishSubject;

// Referenced classes of package me.lyft.android.ui.landing:
//            EnterInfoView, TermsOfServiceView

class ser extends AsyncCall
{

    final EnterInfoView this$0;
    final ActionAnalytics val$analytics;
    final SignupUser val$signupUser;

    public void onFail(Throwable throwable)
    {
label0:
        {
            super.onFail(throwable);
            val$analytics.trackFailure(throwable);
            if (throwable instanceof LandingValidationException)
            {
                throwable = ((LandingValidationException)throwable).getFields().iterator();
                do
                {
                    if (!throwable.hasNext())
                    {
                        break;
                    }
                    InvalidField invalidfield = (InvalidField)throwable.next();
                    if (invalidfield.getName().equals("first_name"))
                    {
                        firstNameEdit.setValidationErrorId(Integer.valueOf(0x7f0701a9));
                        firstNameEdit.showValidationMessage();
                    }
                    if (invalidfield.getName().equals("last_name"))
                    {
                        lastNameEdit.setValidationErrorId(Integer.valueOf(0x7f0701aa));
                        lastNameEdit.showValidationMessage();
                    }
                    if (invalidfield.getName().equals("email"))
                    {
                        emailEdit.setValidationErrorId(Integer.valueOf(0x7f0701a7));
                        emailEdit.showValidationMessage();
                    }
                } while (true);
            } else
            {
                if (!(throwable instanceof TermsNotAcceptedException))
                {
                    break label0;
                }
                tosCheckBox.showTermsOfServiceError(true);
            }
            return;
        }
        viewErrorHandler.handle(throwable);
    }

    public volatile void onSuccess(Object obj)
    {
        onSuccess((Unit)obj);
    }

    public void onSuccess(Unit unit)
    {
        super.onSuccess(unit);
        val$analytics.trackSuccess();
        submitProfileInfoSubject.onNext(val$signupUser);
    }

    public void onUnsubscribe()
    {
        super.onUnsubscribe();
        progressController.hideProgress();
    }

    ser()
    {
        this$0 = final_enterinfoview;
        val$analytics = actionanalytics;
        val$signupUser = SignupUser.this;
        super();
    }
}
