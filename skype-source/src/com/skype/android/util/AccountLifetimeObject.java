// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.util;

import com.skype.Account;
import com.skype.PROPKEY;
import com.skype.android.event.EventBusInstance;
import com.skype.android.inject.EventSubscriberBinder;

// Referenced classes of package com.skype.android.util:
//            State

public abstract class AccountLifetimeObject
{

    private State statusState;

    public AccountLifetimeObject()
    {
        (new EventSubscriberBinder(EventBusInstance.a(), this)).bind();
        statusState = new State();
    }

    public void onAccountEvent(com.skype.android.gen.AccountListener.OnPropertyChange onpropertychange)
    {
    }

    public final void onEvent(com.skype.android.gen.AccountListener.OnPropertyChange onpropertychange)
    {
label0:
        {
            com.skype.Account.STATUS status;
label1:
            {
                if (onpropertychange.getPropKey() != PROPKEY.ACCOUNT_STATUS)
                {
                    break label0;
                }
                status = ((Account)onpropertychange.getSender()).getStatusProp();
                if (statusState.a(status))
                {
                    if (status != com.skype.Account.STATUS.LOGGED_OUT && status != com.skype.Account.STATUS.LOGGED_OUT_AND_PWD_SAVED)
                    {
                        break label1;
                    }
                    onLogout();
                }
                return;
            }
            if (status == com.skype.Account.STATUS.LOGGING_OUT)
            {
                onLoggingOut();
                return;
            }
            if (status == com.skype.Account.STATUS.LOGGED_IN)
            {
                onLogin();
                return;
            } else
            {
                onAccountEvent(onpropertychange);
                return;
            }
        }
        onAccountEvent(onpropertychange);
    }

    public void onLoggingOut()
    {
    }

    public abstract void onLogin();

    public abstract void onLogout();

    public void setOnStateUpdateListener(State.OnStateUpdateListener onstateupdatelistener)
    {
        statusState.a(onstateupdatelistener);
    }
}
