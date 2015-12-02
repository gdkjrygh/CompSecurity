// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.qihoo.security.notify;

import com.qihoo.security.locale.d;
import com.qihoo360.common.utils.Utils;
import com.qihoo360.mobilesafe.b.q;

// Referenced classes of package com.qihoo.security.notify:
//            NotificationService

class a
    implements com.qihoo.security.opti.a.a
{

    final NotificationService a;

    public void a()
    {
        q.a().a(0x7f0c007e);
    }

    public void a(int i, int j)
    {
        j = (int)(((long)j * 100L) / Utils.getMemoryTotalKb());
        String s = a.a.a(0x7f0c007d, new Object[] {
            Integer.valueOf(i), Integer.valueOf(j)
        });
        q.a().a(s);
    }

    (NotificationService notificationservice)
    {
        a = notificationservice;
        super();
    }
}
