// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.app.signin.tasks;

import com.skype.Account;
import com.skype.android.analytics.AnalyticsInAppObserver;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.logging.Logger;

// Referenced classes of package com.skype.android.app.signin.tasks:
//            AccountTask, c, e, d, 
//            a, f, b, ExternalCacheCleanup

public class AccountTaskComposition
    implements AccountTask
{

    private static Logger log = Logger.getLogger("AccountTaskComposition");
    private Set actions;

    public AccountTaskComposition(c c, e e, d d, a a, f f, b b, ExternalCacheCleanup externalcachecleanup, 
            AnalyticsInAppObserver analyticsinappobserver)
    {
        actions = new HashSet();
        actions.add(c);
        actions.add(e);
        actions.add(d);
        actions.add(a);
        actions.add(f);
        actions.add(b);
        actions.add(externalcachecleanup);
        actions.add(analyticsinappobserver);
    }

    public void onLogin(Account account)
    {
        for (Iterator iterator = actions.iterator(); iterator.hasNext();)
        {
            AccountTask accounttask = (AccountTask)iterator.next();
            try
            {
                accounttask.onLogin(account);
            }
            catch (Exception exception)
            {
                exception.printStackTrace();
                log.severe(exception.toString());
            }
        }

    }

    public void onLogout(Account account)
    {
        for (Iterator iterator = actions.iterator(); iterator.hasNext();)
        {
            AccountTask accounttask = (AccountTask)iterator.next();
            try
            {
                accounttask.onLogout(account);
            }
            catch (Exception exception)
            {
                exception.printStackTrace();
                log.severe(exception.toString());
            }
        }

    }

}
