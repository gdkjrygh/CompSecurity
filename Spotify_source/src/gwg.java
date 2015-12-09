// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import com.squareup.picasso.Picasso;

final class gwg extends Handler
{

    private final gwf a;

    public gwg(Looper looper, gwf gwf1)
    {
        super(looper);
        a = gwf1;
    }

    public final void handleMessage(Message message)
    {
        gwf gwf3;
        switch (message.what)
        {
        default:
            Picasso.a.post(new Runnable(message) {

                private Message a;

                public final void run()
                {
                    throw new AssertionError((new StringBuilder("Unhandled stats message.")).append(a.what).toString());
                }

            
            {
                a = message;
                super();
            }
            });
            return;

        case 0: // '\0'
            message = a;
            message.c = ((gwf) (message)).c + 1L;
            return;

        case 1: // '\001'
            message = a;
            message.d = ((gwf) (message)).d + 1L;
            return;

        case 2: // '\002'
            gwf gwf1 = a;
            long l = message.arg1;
            gwf1.l = gwf1.l + 1;
            gwf1.f = l + gwf1.f;
            int i = gwf1.l;
            gwf1.i = gwf1.f / (long)i;
            return;

        case 3: // '\003'
            gwf gwf2 = a;
            long l1 = message.arg1;
            gwf2.m = gwf2.m + 1;
            gwf2.g = l1 + gwf2.g;
            int j = gwf2.l;
            gwf2.j = gwf2.g / (long)j;
            return;

        case 4: // '\004'
            gwf3 = a;
            break;
        }
        message = (Long)message.obj;
        gwf3.k = gwf3.k + 1;
        gwf3.e = gwf3.e + message.longValue();
        int k = gwf3.k;
        gwf3.h = gwf3.e / (long)k;
    }
}
