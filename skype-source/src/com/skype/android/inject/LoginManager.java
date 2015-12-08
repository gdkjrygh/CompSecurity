// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.inject;

import android.app.Application;
import com.skype.Account;
import com.skype.Setup;
import com.skype.SkyLib;
import com.skype.android.app.settings.UserPreferences;
import com.skype.android.skylib.SkyLibInitializer;
import java.util.logging.Logger;
import javax.inject.Provider;

// Referenced classes of package com.skype.android.inject:
//            a

public class LoginManager
{
    public static final class LoginRequiredResult extends Enum
    {

        private static final LoginRequiredResult $VALUES[];
        public static final LoginRequiredResult LOGGEDIN;
        public static final LoginRequiredResult LOGGEDOUT;
        public static final LoginRequiredResult LOGINFAILED;
        public static final LoginRequiredResult LOGINFAILEDTIMEOUT;
        public static final LoginRequiredResult LOGINSUCCESS;

        public static LoginRequiredResult valueOf(String s)
        {
            return (LoginRequiredResult)Enum.valueOf(com/skype/android/inject/LoginManager$LoginRequiredResult, s);
        }

        public static LoginRequiredResult[] values()
        {
            return (LoginRequiredResult[])$VALUES.clone();
        }

        static 
        {
            LOGGEDIN = new LoginRequiredResult("LOGGEDIN", 0);
            LOGGEDOUT = new LoginRequiredResult("LOGGEDOUT", 1);
            LOGINSUCCESS = new LoginRequiredResult("LOGINSUCCESS", 2);
            LOGINFAILED = new LoginRequiredResult("LOGINFAILED", 3);
            LOGINFAILEDTIMEOUT = new LoginRequiredResult("LOGINFAILEDTIMEOUT", 4);
            $VALUES = (new LoginRequiredResult[] {
                LOGGEDIN, LOGGEDOUT, LOGINSUCCESS, LOGINFAILED, LOGINFAILEDTIMEOUT
            });
        }

        private LoginRequiredResult(String s, int i)
        {
            super(s, i);
        }
    }


    private static final Logger log = Logger.getLogger("LoginManager");
    private Provider accountProvider;
    private Application context;
    private Provider skyLibProvider;

    public LoginManager(Application application, Provider provider, Provider provider1)
    {
        context = application;
        accountProvider = provider;
        skyLibProvider = provider1;
    }

    public boolean isLoggedOut()
    {
        boolean flag = false;
        if (accountProvider.get() != null)
        {
            if ((new UserPreferences(accountProvider, context)).getAccountLogoutReason() != null)
            {
                flag = true;
            }
            return flag;
        } else
        {
            return true;
        }
    }

    public LoginRequiredResult loginIfRequired(Account account)
    {
        return loginIfRequired(account, false);
    }

    public LoginRequiredResult loginIfRequired(Account account, boolean flag)
    {
        com.skype.Account.STATUS status = account.getStatusProp();
        static final class _cls1
        {

            static final int $SwitchMap$com$skype$Account$STATUS[];

            static 
            {
                $SwitchMap$com$skype$Account$STATUS = new int[com.skype.Account.STATUS.values().length];
                try
                {
                    $SwitchMap$com$skype$Account$STATUS[com.skype.Account.STATUS.LOGGED_IN_PARTIALLY.ordinal()] = 1;
                }
                catch (NoSuchFieldError nosuchfielderror3) { }
                try
                {
                    $SwitchMap$com$skype$Account$STATUS[com.skype.Account.STATUS.LOGGED_IN.ordinal()] = 2;
                }
                catch (NoSuchFieldError nosuchfielderror2) { }
                try
                {
                    $SwitchMap$com$skype$Account$STATUS[com.skype.Account.STATUS.LOGGING_OUT.ordinal()] = 3;
                }
                catch (NoSuchFieldError nosuchfielderror1) { }
                try
                {
                    $SwitchMap$com$skype$Account$STATUS[com.skype.Account.STATUS.LOGGED_OUT.ordinal()] = 4;
                }
                catch (NoSuchFieldError nosuchfielderror)
                {
                    return;
                }
            }
        }

        switch (_cls1..SwitchMap.com.skype.Account.STATUS[status.ordinal()])
        {
        default:
            if (flag)
            {
                log.info("Requesting userless foreground login.");
                requestUserlessForegroundFlag();
            }
            SkyLibInitializer.a().b();
            return (new a()).beginLogin(account);

        case 1: // '\001'
        case 2: // '\002'
            return LoginRequiredResult.LOGGEDIN;

        case 3: // '\003'
        case 4: // '\004'
            log.severe("Logged out or logging out.");
            return LoginRequiredResult.LOGGEDOUT;
        }
    }

    public boolean loginIfRequired()
    {
        return loginIfRequired(false);
    }

    public boolean loginIfRequired(boolean flag)
    {
        LoginRequiredResult loginrequiredresult = loginIfRequired((Account)accountProvider.get(), flag);
        return loginrequiredresult == LoginRequiredResult.LOGGEDIN || loginrequiredresult == LoginRequiredResult.LOGINSUCCESS;
    }

    public void requestUserlessForegroundFlag()
    {
        ((SkyLib)skyLibProvider.get()).getSetup().setInt("*Lib/MSNP/UserlessForeground", 1);
    }

    public void unsetUserlessForegroundFlag()
    {
        this;
        JVM INSTR monitorenter ;
        ((SkyLib)skyLibProvider.get()).getSetup().setInt("*Lib/MSNP/UserlessForeground", 0);
        this;
        JVM INSTR monitorexit ;
        return;
        Exception exception;
        exception;
        throw exception;
    }

}
