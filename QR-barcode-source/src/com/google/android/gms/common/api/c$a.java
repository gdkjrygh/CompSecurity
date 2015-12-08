// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.common.api;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import com.google.android.gms.common.internal.o;

// Referenced classes of package com.google.android.gms.common.api:
//            c

private final class Jt extends Handler
{

    final c Jt;

    public void handleMessage(Message message)
    {
        boolean flag = true;
        if (message.what != 1)
        {
            flag = false;
        }
        o.K(flag);
        Jt.b((Jt)message.obj);
    }

    public .o(c c1, Looper looper)
    {
        Jt = c1;
        super(looper);
    }
}
