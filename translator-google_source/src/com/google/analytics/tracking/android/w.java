// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.analytics.tracking.android;

import android.os.Handler;
import android.os.Message;

// Referenced classes of package com.google.analytics.tracking.android:
//            u, GAUsage

final class w
    implements android.os.Handler.Callback
{

    final u a;

    w(u u1)
    {
        a = u1;
        super();
    }

    public final boolean handleMessage(Message message)
    {
        if (1 == message.what && u.d().equals(message.obj))
        {
            GAUsage.a().a(true);
            a.c();
            GAUsage.a().a(false);
            if (u.b(a) > 0 && !u.c(a))
            {
                u.d(a).sendMessageDelayed(u.d(a).obtainMessage(1, u.d()), u.b(a) * 1000);
            }
        }
        return true;
    }
}
