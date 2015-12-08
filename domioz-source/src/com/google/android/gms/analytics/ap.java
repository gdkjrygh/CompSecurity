// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.analytics;

import android.os.Handler;
import android.os.Message;
import android.os.SystemClock;

// Referenced classes of package com.google.android.gms.analytics:
//            an, bb

final class ap
    implements android.os.Handler.Callback
{

    final an a;

    ap(an an1)
    {
        a = an1;
        super();
    }

    public final boolean handleMessage(Message message)
    {
        if (1 == message.what && an.d().equals(message.obj))
        {
            long l = SystemClock.elapsedRealtime();
            if (l >= an.b(a) + (long)(an.c(a) * 1000))
            {
                bb.a().a(true);
                a.a();
                bb.a().a(false);
                an.a(a, l);
            }
            if (an.c(a) > 0 && !an.d(a))
            {
                an.e(a).sendMessageDelayed(an.e(a).obtainMessage(1, an.d()), Math.min(60, an.c(a)) * 1000);
            }
        }
        return true;
    }
}
