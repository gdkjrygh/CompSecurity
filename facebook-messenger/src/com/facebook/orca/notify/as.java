// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.orca.notify;

import com.facebook.orca.prefs.n;
import com.facebook.prefs.shared.d;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

// Referenced classes of package com.facebook.orca.notify:
//            NotificationSetting

public class as
{

    private final d a;

    public as(d d1)
    {
        a = d1;
    }

    public NotificationSetting a()
    {
        return NotificationSetting.b(a.a(n.o, 0L));
    }

    public NotificationSetting a(String s)
    {
        s = n.a(s);
        return NotificationSetting.b(a.a(s, 0L));
    }

    public boolean a(NotificationSetting notificationsetting)
    {
        long l = notificationsetting.b();
        return notificationsetting.a() && (l == -1L || l < System.currentTimeMillis() / 1000L);
    }

    public Date b()
    {
        Calendar calendar = GregorianCalendar.getInstance();
        calendar.setTime(new Date());
        calendar.set(12, 0);
        calendar.set(13, 0);
        calendar.set(14, 0);
        int i = calendar.get(11);
        if (i < 8)
        {
            calendar.add(10, 8 - i);
        } else
        {
            calendar.add(10, 32 - i);
        }
        return calendar.getTime();
    }

    public boolean b(NotificationSetting notificationsetting)
    {
        long l = notificationsetting.b();
        return notificationsetting.a() && l != -1L && l > System.currentTimeMillis() / 1000L;
    }
}
