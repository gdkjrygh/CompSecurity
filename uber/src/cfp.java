// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.net.NetworkInfo;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;

final class cfp extends Handler
{

    private final cfo a;

    public cfp(Looper looper, cfo cfo1)
    {
        super(looper);
        a = cfo1;
    }

    public final void handleMessage(Message message)
    {
        boolean flag = true;
        cfo cfo1;
        switch (message.what)
        {
        case 3: // '\003'
        case 8: // '\b'
        default:
            cgh.a.post(new Runnable(message) {

                final Message a;
                final cfp b;

                public final void run()
                {
                    throw new AssertionError((new StringBuilder("Unknown handler message received: ")).append(a.what).toString());
                }

            
            {
                b = cfp.this;
                a = message;
                super();
            }
            });
            return;

        case 1: // '\001'
            message = (cfe)message.obj;
            a.c(message);
            return;

        case 2: // '\002'
            message = (cfe)message.obj;
            a.d(message);
            return;

        case 11: // '\013'
            message = ((Message) (message.obj));
            a.c(message);
            return;

        case 12: // '\f'
            message = ((Message) (message.obj));
            a.d(message);
            return;

        case 4: // '\004'
            message = (cfh)message.obj;
            a.e(message);
            return;

        case 5: // '\005'
            message = (cfh)message.obj;
            a.d(message);
            return;

        case 6: // '\006'
            message = (cfh)message.obj;
            a.a(message, false);
            return;

        case 7: // '\007'
            a.a();
            return;

        case 9: // '\t'
            message = (NetworkInfo)message.obj;
            a.b(message);
            return;

        case 10: // '\n'
            cfo1 = a;
            break;
        }
        if (message.arg1 != 1)
        {
            flag = false;
        }
        cfo1.b(flag);
    }
}
