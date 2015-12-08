// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.analytics;

import android.os.Handler;
import android.os.Message;
import com.skype.Account;
import com.skype.android.inject.EventThread;
import java.util.concurrent.TimeUnit;
import javax.inject.Provider;

// Referenced classes of package com.skype.android.analytics:
//            AnalyticsEvent, Analytics

public class SessionReporter
    implements android.os.Handler.Callback
{

    private static long d = -1L;
    Analytics a;
    Provider b;
    private Handler c;

    public SessionReporter()
    {
        c = new Handler(EventThread.BACKGROUND.getLooper(), this);
    }

    public final void a()
    {
        c.removeMessages(1);
        if (d == -1L)
        {
            d = System.currentTimeMillis();
        }
    }

    public final void b()
    {
        c.removeMessages(1);
        c.sendEmptyMessageDelayed(1, 1000L);
    }

    public boolean handleMessage(Message message)
    {
        switch (message.what)
        {
        default:
            return false;

        case 1: // '\001'
            break;
        }
        if (d != -1L && ((Account)b.get()).getStatusProp() == com.skype.Account.STATUS.LOGGED_IN)
        {
            long l = System.currentTimeMillis();
            l = TimeUnit.MILLISECONDS.toSeconds(l - 1000L - d);
            a.a(AnalyticsEvent.aw, Analytics.e(l));
            d = -1L;
        }
        return true;
    }

}
