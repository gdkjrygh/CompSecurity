// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.c.b;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;

// Referenced classes of package com.c.b:
//            aj, be, bc

final class bd extends Handler
{

    private final bc a;

    public bd(Looper looper, bc bc1)
    {
        super(looper);
        a = bc1;
    }

    public final void handleMessage(Message message)
    {
        bc bc3;
        switch (message.what)
        {
        default:
            aj.a.post(new be(this, message));
            return;

        case 0: // '\0'
            message = a;
            message.d = ((bc) (message)).d + 1L;
            return;

        case 1: // '\001'
            message = a;
            message.e = ((bc) (message)).e + 1L;
            return;

        case 2: // '\002'
            bc bc1 = a;
            long l = message.arg1;
            bc1.m = bc1.m + 1;
            bc1.g = l + bc1.g;
            int i = bc1.m;
            bc1.j = bc1.g / (long)i;
            return;

        case 3: // '\003'
            bc bc2 = a;
            long l1 = message.arg1;
            bc2.n = bc2.n + 1;
            bc2.h = l1 + bc2.h;
            int j = bc2.m;
            bc2.k = bc2.h / (long)j;
            return;

        case 4: // '\004'
            bc3 = a;
            break;
        }
        message = (Long)message.obj;
        bc3.l = bc3.l + 1;
        bc3.f = bc3.f + message.longValue();
        int k = bc3.l;
        bc3.i = bc3.f / (long)k;
    }
}
