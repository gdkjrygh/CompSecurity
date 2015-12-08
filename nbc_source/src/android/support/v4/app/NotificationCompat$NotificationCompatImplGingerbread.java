// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v4.app;

import android.app.Notification;

// Referenced classes of package android.support.v4.app:
//            NotificationCompat, NotificationCompatGingerbread

static class Q extends Q
{

    public Notification build(Q q, Q q1)
    {
        q1 = q.Q;
        q1.setLatestEventInfo(q.Q, q.Q, q.Q, q.Q);
        q1 = NotificationCompatGingerbread.add(q1, q.Q, q.Q, q.Q, q.Q, q.Q);
        if (q.Q > 0)
        {
            q1.flags = ((Notification) (q1)).flags | 0x80;
        }
        return q1;
    }

    Q()
    {
    }
}
