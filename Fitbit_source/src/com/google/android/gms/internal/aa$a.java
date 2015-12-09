// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.util.Log;
import com.google.android.gms.common.b;

// Referenced classes of package com.google.android.gms.internal:
//            aa, ab

final class a extends Handler
{

    final aa a;

    public void handleMessage(Message message)
    {
        if (message.what == 1 && !a.f())
        {
            message = (a)message.obj;
            message.a();
            message.c();
            return;
        }
        if (message.what == 3)
        {
            aa.a(a).a(new b(((Integer)message.obj).intValue(), null));
            return;
        }
        if (message.what == 4)
        {
            aa.a(a, 4, null);
            aa.a(a).a(((Integer)message.obj).intValue());
            aa.a(a, 4, 1, null);
            return;
        }
        if (message.what == 2 && !a.c())
        {
            message = (a)message.obj;
            message.a();
            message.c();
            return;
        }
        if (message.what == 2 || message.what == 1)
        {
            ((c)message.obj).b();
            return;
        } else
        {
            Log.wtf("GmsClient", "Don't know how to handle this message.");
            return;
        }
    }

    public (aa aa1, Looper looper)
    {
        a = aa1;
        super(looper);
    }
}
