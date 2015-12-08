// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.util.Log;
import com.google.android.gms.common.api.b;
import java.util.ArrayList;

// Referenced classes of package com.google.android.gms.internal:
//            ga, gc

final class gb extends Handler
{

    final ga a;

    public gb(ga ga1, Looper looper)
    {
        a = ga1;
        super(looper);
    }

    public final void handleMessage(Message message)
    {
        if (message.what == 1)
        {
            synchronized (ga.a(a))
            {
                if (com.google.android.gms.internal.ga.b(a).j() && com.google.android.gms.internal.ga.b(a).e() && ga.a(a).contains(message.obj))
                {
                    com.google.android.gms.internal.ga.b(a);
                    ((b)message.obj).a();
                }
            }
            return;
        } else
        {
            Log.wtf("GmsClientEvents", "Don't know how to handle this message.");
            return;
        }
    }
}
