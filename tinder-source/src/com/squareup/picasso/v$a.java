// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.squareup.picasso;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;

// Referenced classes of package com.squareup.picasso:
//            v, Picasso

private static final class a extends Handler
{

    private final v a;

    public final void handleMessage(Message message)
    {
        v v3;
        switch (message.what)
        {
        default:
            Picasso.a.post(new Runnable(message) {

                final Message a;
                final v.a b;

                public final void run()
                {
                    throw new AssertionError((new StringBuilder("Unhandled stats message.")).append(a.what).toString());
                }

            
            {
                b = v.a.this;
                a = message;
                super();
            }
            });
            return;

        case 0: // '\0'
            message = a;
            message.d = ((v) (message)).d + 1L;
            return;

        case 1: // '\001'
            message = a;
            message.e = ((v) (message)).e + 1L;
            return;

        case 2: // '\002'
            v v1 = a;
            long l = message.arg1;
            v1.m = v1.m + 1;
            v1.g = l + v1.g;
            int i = v1.m;
            v1.j = v1.g / (long)i;
            return;

        case 3: // '\003'
            v v2 = a;
            long l1 = message.arg1;
            v2.n = v2.n + 1;
            v2.h = l1 + v2.h;
            int j = v2.m;
            v2.k = v2.h / (long)j;
            return;

        case 4: // '\004'
            v3 = a;
            break;
        }
        message = (Long)message.obj;
        v3.l = v3.l + 1;
        v3.f = v3.f + message.longValue();
        int k = v3.l;
        v3.i = v3.f / (long)k;
    }

    public _cls1.a(Looper looper, v v1)
    {
        super(looper);
        a = v1;
    }
}
