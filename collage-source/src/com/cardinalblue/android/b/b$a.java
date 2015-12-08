// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.cardinalblue.android.b;

import android.os.Handler;
import android.os.Message;
import android.os.SystemClock;

// Referenced classes of package com.cardinalblue.android.b:
//            b

private class b extends Handler
{

    final b a;
    private final b b;

    public void handleMessage(Message message)
    {
        message = b;
        if (message != null)
        {
            long l = com.cardinalblue.android.b.b.a(message) - SystemClock.elapsedRealtime();
            if (l <= 0L)
            {
                message.c();
                return;
            }
            if (l < com.cardinalblue.android.b.b.b(message))
            {
                sendMessageDelayed(obtainMessage(1), l);
                return;
            }
            long l1 = SystemClock.elapsedRealtime();
            message.a(l);
            for (l = (com.cardinalblue.android.b.b.b(message) + l1) - SystemClock.elapsedRealtime(); l < 0L; l += com.cardinalblue.android.b.b.b(message)) { }
            if (!com.cardinalblue.android.b.b.c(message))
            {
                sendMessageDelayed(obtainMessage(1), l);
                return;
            }
        }
    }

    public (b b1, b b2)
    {
        a = b1;
        super();
        b = b2;
    }
}
