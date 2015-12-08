// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.analytics;

import android.app.Application;
import com.skype.Account;
import java.util.UUID;

// Referenced classes of package com.skype.android.analytics:
//            PersistentStorage, AnalyticsStorage

public class AnalyticsPersistentStorage extends PersistentStorage
    implements AnalyticsStorage
{

    public AnalyticsPersistentStorage(Application application)
    {
        super(application, "telemetryStorage");
    }

    public final long a()
    {
        return e("telemetryInappEndEventLastOpenedTimestamp");
    }

    public final void a(long l)
    {
        a("telemetryInappEndEventLastOpenedTimestamp", l);
    }

    public final void a(Account account)
    {
        com.skype.Account.LOGOUTREASON logoutreason = null;
        if (account != null)
        {
            logoutreason = account.getLogoutReasonProp();
        }
        if (logoutreason != null)
        {
            account = logoutreason.name();
        } else
        {
            account = null;
        }
        a("telemetryLastLogoutReason", ((String) (account)));
    }

    public final void a(String s)
    {
        a("telemetryInappEndEventSent", s);
    }

    public final String b()
    {
        String s1 = b("telemetryInstallID", null);
        String s = s1;
        if (s1 == null)
        {
            s = UUID.randomUUID().toString();
            a("telemetryInstallID", s);
        }
        return s;
    }

    public final String b(String s)
    {
        return b("telemetryInappEndEventSent", s);
    }

    public final com.skype.Account.LOGOUTREASON c()
    {
        Object obj = b("telemetryLastLogoutReason", null);
        if (obj == null)
        {
            return null;
        }
        try
        {
            obj = com.skype.Account.LOGOUTREASON.valueOf(((String) (obj)));
        }
        catch (IllegalArgumentException illegalargumentexception)
        {
            return null;
        }
        return ((com.skype.Account.LOGOUTREASON) (obj));
    }

    public final void c(String s)
    {
        a("telemetryInappEndEventEntryPoint", s);
    }

    public final String d(String s)
    {
        return b("telemetryInappEndEventEntryPoint", s);
    }

    public final void d()
    {
        a("telemetryLastLogoutReason", null);
    }
}
