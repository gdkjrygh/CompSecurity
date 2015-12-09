// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.squareup.a;

import android.net.NetworkInfo;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;

// Referenced classes of package com.squareup.a:
//            ak, t, a, r, 
//            d

class s extends Handler
{

    private final r a;

    public s(Looper looper, r r1)
    {
        super(looper);
        a = r1;
    }

    public void handleMessage(Message message)
    {
        boolean flag = true;
        r r1;
        switch (message.what)
        {
        case 3: // '\003'
        case 8: // '\b'
        default:
            ak.a.post(new t(this, message));
            return;

        case 1: // '\001'
            message = (a)message.obj;
            a.c(message);
            return;

        case 2: // '\002'
            message = (a)message.obj;
            a.d(message);
            return;

        case 11: // '\013'
            message = ((Message) (message.obj));
            a.a(message);
            return;

        case 12: // '\f'
            message = ((Message) (message.obj));
            a.b(message);
            return;

        case 4: // '\004'
            message = (d)message.obj;
            a.e(message);
            return;

        case 5: // '\005'
            message = (d)message.obj;
            a.d(message);
            return;

        case 6: // '\006'
            message = (d)message.obj;
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
            r1 = a;
            break;
        }
        if (message.arg1 != 1)
        {
            flag = false;
        }
        r1.b(flag);
    }
}
