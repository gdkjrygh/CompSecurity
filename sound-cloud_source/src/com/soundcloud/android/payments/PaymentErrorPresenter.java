// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.payments;

import android.support.v4.app.FragmentActivity;
import com.soundcloud.android.api.ApiRequestException;
import com.soundcloud.android.events.EventQueue;
import com.soundcloud.android.events.PaymentFailureEvent;
import com.soundcloud.rx.eventbus.EventBus;

// Referenced classes of package com.soundcloud.android.payments:
//            PaymentErrorView

class PaymentErrorPresenter
{

    private static final String ERROR_KEY_ALREADY_SUBSCRIBED = "already_subscribed";
    private static final String ERROR_KEY_UNCONFIRMED_EMAIL = "unconfirmed_email";
    private static final String ERROR_KEY_WRONG_USER = "wrong_user";
    private PaymentErrorView errorView;
    private EventBus eventBus;

    PaymentErrorPresenter(PaymentErrorView paymenterrorview, EventBus eventbus)
    {
        errorView = paymenterrorview;
        eventBus = eventbus;
    }

    private void handleApiException(ApiRequestException apirequestexception)
    {
        switch (_cls1..SwitchMap.com.soundcloud.android.api.ApiRequestException.Reason[apirequestexception.reason().ordinal()])
        {
        default:
            showConnectionError();
            return;

        case 1: // '\001'
            handleBadRequest(apirequestexception);
            return;

        case 2: // '\002'
            errorView.showStaleCheckout();
            break;
        }
        trackFailure("Stale checkout");
    }

    private void handleBadRequest(ApiRequestException apirequestexception)
    {
        byte byte0;
        apirequestexception = apirequestexception.errorKey();
        byte0 = -1;
        apirequestexception.hashCode();
        JVM INSTR lookupswitch 3: default 44
    //                   -993047903: 77
    //                   258063133: 91
    //                   1337096963: 105;
           goto _L1 _L2 _L3 _L4
_L1:
        break; /* Loop/switch isn't completed */
_L4:
        break MISSING_BLOCK_LABEL_105;
_L5:
        switch (byte0)
        {
        default:
            showConnectionError();
            return;

        case 0: // '\0'
            errorView.showAlreadySubscribed();
            trackFailure("Already subscribed");
            return;

        case 1: // '\001'
            errorView.showWrongUser();
            trackFailure("Wrong user");
            return;

        case 2: // '\002'
            errorView.showUnconfirmedEmail();
            break;
        }
        break MISSING_BLOCK_LABEL_154;
_L2:
        if (apirequestexception.equals("already_subscribed"))
        {
            byte0 = 0;
        }
          goto _L5
_L3:
        if (apirequestexception.equals("wrong_user"))
        {
            byte0 = 1;
        }
          goto _L5
        if (apirequestexception.equals("unconfirmed_email"))
        {
            byte0 = 2;
        }
          goto _L5
        trackFailure("Unconfirmed email");
        return;
    }

    private void trackFailure(String s)
    {
        eventBus.publish(EventQueue.TRACKING, PaymentFailureEvent.create(s));
    }

    public void onError(Throwable throwable)
    {
        if (throwable instanceof ApiRequestException)
        {
            handleApiException((ApiRequestException)throwable);
            return;
        } else
        {
            errorView.showUnknownError();
            trackFailure("Unknown");
            return;
        }
    }

    public void setActivity(FragmentActivity fragmentactivity)
    {
        errorView.bind(fragmentactivity);
    }

    public void showBillingUnavailable()
    {
        errorView.showBillingUnavailable();
        trackFailure("Billing unavailable");
    }

    public void showCancelled()
    {
        errorView.showCancelled();
    }

    public void showConnectionError()
    {
        errorView.showConnectionError();
    }

    public void showVerifyFail()
    {
        errorView.showVerifyFail();
        trackFailure("Verify fail");
    }

    public void showVerifyTimeout()
    {
        errorView.showVerifyTimeout();
        trackFailure("Verify timeout");
    }

    private class _cls1
    {

        static final int $SwitchMap$com$soundcloud$android$api$ApiRequestException$Reason[];

        static 
        {
            $SwitchMap$com$soundcloud$android$api$ApiRequestException$Reason = new int[com.soundcloud.android.api.ApiRequestException.Reason.values().length];
            try
            {
                $SwitchMap$com$soundcloud$android$api$ApiRequestException$Reason[com.soundcloud.android.api.ApiRequestException.Reason.BAD_REQUEST.ordinal()] = 1;
            }
            catch (NoSuchFieldError nosuchfielderror1) { }
            try
            {
                $SwitchMap$com$soundcloud$android$api$ApiRequestException$Reason[com.soundcloud.android.api.ApiRequestException.Reason.NOT_FOUND.ordinal()] = 2;
            }
            catch (NoSuchFieldError nosuchfielderror)
            {
                return;
            }
        }
    }

}
