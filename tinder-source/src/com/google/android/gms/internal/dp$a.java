// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import com.google.android.gms.common.internal.u;

// Referenced classes of package com.google.android.gms.internal:
//            dp

private final class a extends Handler
{

    final dp a;

    public final void handleMessage(Message message)
    {
        boolean flag = true;
        Object obj;
        if (message.what != 1)
        {
            flag = false;
        }
        u.b(flag);
        obj = a;
        message = (a)message.obj;
        obj = ((dp) (obj)).a;
        if (obj == null)
        {
            message.a();
            return;
        }
        try
        {
            message.a(obj);
            return;
        }
        catch (RuntimeException runtimeexception)
        {
            message.a();
            throw runtimeexception;
        }
    }

    public l.u(dp dp1, Looper looper)
    {
        a = dp1;
        super(looper);
    }
}
