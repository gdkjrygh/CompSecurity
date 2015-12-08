// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.m4b.maps.bq;

import android.os.Handler;
import android.os.Message;
import android.util.Pair;
import com.google.android.m4b.maps.bd.d;
import com.google.android.m4b.maps.bo.ad;

// Referenced classes of package com.google.android.m4b.maps.bq:
//            b

final class a extends Handler
{

    private b a;

    public final void handleMessage(Message message)
    {
        switch (message.what)
        {
        default:
            return;

        case 1: // '\001'
            b.a(a, (a)message.obj);
            return;

        case 2: // '\002'
            b.a(a);
            return;

        case 3: // '\003'
            b.a(a, (a)message.obj);
            return;

        case 4: // '\004'
            b.b(a);
            return;

        case 5: // '\005'
            synchronized (message.obj)
            {
                message.obj.notify();
            }
            b.c(a);
            return;

        case 6: // '\006'
            message = (Pair)message.obj;
            b.a(a, (ad)((Pair)((Pair) (message)).first).first, (a)((Pair)((Pair) (message)).first).second, (d)((Pair) (message)).second);
            return;
        }
        message;
        obj;
        JVM INSTR monitorexit ;
        throw message;
    }

    (b b1)
    {
        a = b1;
        super();
    }
}
