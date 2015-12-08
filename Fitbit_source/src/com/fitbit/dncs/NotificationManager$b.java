// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fitbit.dncs;

import android.os.SystemClock;
import com.fitbit.dncs.domain.EventID;

// Referenced classes of package com.fitbit.dncs:
//            NotificationManager, Notification

private static class c
    implements Comparable
{

    final Notification a;
    final long b = SystemClock.elapsedRealtime();
    final csNotificationDisplayType c;
    boolean d;
    String e;
    EventID f;

    public int a(c c1)
    {
        int i;
        int j;
        boolean flag;
        flag = true;
        j = 0;
        if (a.e() == c1.a.e())
        {
            break MISSING_BLOCK_LABEL_172;
        }
        if (c == csNotificationDisplayType.a)
        {
            i = 1;
        } else
        {
            i = 0;
        }
        if (c1.c == csNotificationDisplayType.a)
        {
            j = 1;
        }
        if (i == 0 || j == 0) goto _L2; else goto _L1
_L1:
        j = (int)(c1.b - b);
        i = j;
        if (j == 0)
        {
            i = ((Integer)c1.a.e()).intValue() - ((Integer)a.e()).intValue();
        }
_L4:
        return i;
_L2:
        if (i != 0 && j == 0)
        {
            return -1;
        }
        if (i != 0)
        {
            break; /* Loop/switch isn't completed */
        }
        i = ((flag) ? 1 : 0);
        if (j != 0) goto _L4; else goto _L3
_L3:
        j = (int)(b - c1.b);
        i = j;
        if (j != 0) goto _L4; else goto _L5
_L5:
        return ((Integer)a.e()).intValue() - ((Integer)c1.a.e()).intValue();
        return 0;
    }

    public int compareTo(Object obj)
    {
        return a((a)obj);
    }

    public boolean equals(Object obj)
    {
        return (obj instanceof a) && ((a)obj).a.e() == a.e();
    }

    csNotificationDisplayType(Notification notification, csNotificationDisplayType csnotificationdisplaytype)
    {
        d = false;
        f = EventID.a;
        a = notification;
        if (csnotificationdisplaytype == null)
        {
            csnotificationdisplaytype = csNotificationDisplayType.b;
        }
        c = csnotificationdisplaytype;
    }
}
