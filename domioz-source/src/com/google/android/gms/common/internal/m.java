// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.common.internal;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.util.Log;
import com.google.android.gms.common.ConnectionResult;

// Referenced classes of package com.google.android.gms.common.internal:
//            k, n, t

final class m extends Handler
{

    final k a;

    public m(k k1, Looper looper)
    {
        a = k1;
        super(looper);
    }

    public final void handleMessage(Message message)
    {
        if ((message.what == 1 || message.what == 5 || message.what == 6) && !a.h())
        {
            ((n)message.obj).c();
            return;
        }
        if (message.what == 3)
        {
            k.a(a).a(new ConnectionResult(((Integer)message.obj).intValue(), null));
            return;
        }
        if (message.what == 4)
        {
            k.a(a, 4);
            k.a(a).a(((Integer)message.obj).intValue());
            k.a(a, 4, 1, null);
            return;
        }
        if (message.what == 2 && !a.c())
        {
            ((n)message.obj).c();
            return;
        }
        if (message.what == 2 || message.what == 1 || message.what == 5 || message.what == 6)
        {
            ((n)message.obj).b();
            return;
        } else
        {
            Log.wtf("GmsClient", "Don't know how to handle this message.");
            return;
        }
    }
}
