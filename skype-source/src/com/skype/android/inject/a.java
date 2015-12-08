// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.inject;

import android.os.ConditionVariable;
import com.skype.Account;
import com.skype.ObjectInterface;
import com.skype.PROPKEY;
import com.skype.android.util.DeviceFeatures;
import com.skype.android.util.PerformanceLog;
import java.util.logging.Logger;

final class a
    implements com.skype.ObjectInterface.ObjectInterfaceIListener
{

    private static final int LOGIN_RECOVER_TIMEOUT;
    private static final Logger log = Logger.getLogger("LoginExecutor");
    private final ConditionVariable loggedInCondition = new ConditionVariable();

    public a()
    {
    }

    public final LoginManager.LoginRequiredResult beginLogin(Account account)
    {
        LoginManager.LoginRequiredResult loginrequiredresult;
        PerformanceLog.g.b();
        loginrequiredresult = LoginManager.LoginRequiredResult.LOGINFAILED;
        com.skype.Account.STATUS status;
        boolean flag;
        if (account.getStatusProp() == com.skype.Account.STATUS.LOGGED_OUT_AND_PWD_SAVED)
        {
            PerformanceLog.g.a("begin login");
            account.beginLogin();
        }
        account.addListener(this);
        log.info((new StringBuilder("beginLogin: block: accountStatus:")).append(account.getStatusProp()).toString());
        flag = loggedInCondition.block(LOGIN_RECOVER_TIMEOUT);
        account.removeListener(this);
        status = account.getStatusProp();
        log.info((new StringBuilder("beginLogin: UNLOCK: accountStatus:")).append(account.getStatusProp()).toString());
        if (status == com.skype.Account.STATUS.LOGGED_IN_PARTIALLY)
        {
            account.finishLogin();
        }
        if (status != com.skype.Account.STATUS.LOGGED_IN && status != com.skype.Account.STATUS.LOGGED_IN_PARTIALLY) goto _L2; else goto _L1
_L1:
        log.info("beginLogin logged in ");
        account = LoginManager.LoginRequiredResult.LOGINSUCCESS;
_L3:
        PerformanceLog.g.c();
        return account;
_L2:
        if (flag)
        {
            break MISSING_BLOCK_LABEL_192;
        }
        log.info("beginLogin timed out ");
        account = LoginManager.LoginRequiredResult.LOGINFAILEDTIMEOUT;
          goto _L3
        log.info((new StringBuilder("beginLogin failed with status ")).append(status).toString());
        account = LoginManager.LoginRequiredResult.LOGINFAILED;
          goto _L3
        account;
        account.printStackTrace();
        PerformanceLog.g.c();
        return loginrequiredresult;
        account;
        PerformanceLog.g.c();
        throw account;
    }

    public final void onPropertyChange(ObjectInterface objectinterface, PROPKEY propkey)
    {
        if (propkey == PROPKEY.ACCOUNT_STATUS)
        {
            objectinterface = ((Account)objectinterface).getStatusProp();
            PerformanceLog.g.a((new StringBuilder("Account status changed ")).append(objectinterface).toString());
            log.info((new StringBuilder("onPropertyChange() status: ")).append(objectinterface).toString());
            if (objectinterface == com.skype.Account.STATUS.LOGGED_IN || objectinterface == com.skype.Account.STATUS.LOGGED_IN_PARTIALLY)
            {
                loggedInCondition.open();
            }
        }
    }

    static 
    {
        int i;
        if (DeviceFeatures.d())
        {
            i = 10000;
        } else
        {
            i = 3000;
        }
        LOGIN_RECOVER_TIMEOUT = i;
    }
}
