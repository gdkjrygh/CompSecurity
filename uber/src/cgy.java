// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.os.Handler;
import android.os.Looper;
import android.os.Message;

final class cgy extends Handler
{

    private final cgx a;

    public cgy(Looper looper, cgx cgx1)
    {
        super(looper);
        a = cgx1;
    }

    public final void handleMessage(Message message)
    {
        switch (message.what)
        {
        default:
            cgh.a.post(new Runnable(message) {

                final Message a;
                final cgy b;

                public final void run()
                {
                    throw new AssertionError((new StringBuilder("Unhandled stats message.")).append(a.what).toString());
                }

            
            {
                b = cgy.this;
                a = message;
                super();
            }
            });
            return;

        case 0: // '\0'
            a.c();
            return;

        case 1: // '\001'
            a.d();
            return;

        case 2: // '\002'
            a.b(message.arg1);
            return;

        case 3: // '\003'
            a.c(message.arg1);
            return;

        case 4: // '\004'
            a.a((Long)message.obj);
            break;
        }
    }
}
