// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.unveil.nonstop;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;

// Referenced classes of package com.google.android.apps.unveil.nonstop:
//            m, i

final class j extends Handler
{

    final i a;

    j(i k)
    {
        a = k;
        super();
    }

    public final void handleMessage(Message message)
    {
        if (message.what == -1)
        {
            Looper.myLooper().quit();
            return;
        } else
        {
            message = (m)message.obj;
            a.a(message);
            return;
        }
    }
}
