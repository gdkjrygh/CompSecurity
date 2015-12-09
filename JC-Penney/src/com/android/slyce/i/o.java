// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.android.slyce.i;

import android.os.Handler;
import android.os.Message;
import android.util.Log;

// Referenced classes of package com.android.slyce.i:
//            e, n, m

class o extends Handler
{

    private n a;

    private o(n n1)
    {
        a = n1;
    }

    o(n n1, m m)
    {
        this(n1);
    }

    public void handleMessage(Message message)
    {
        switch (message.what)
        {
        default:
            Log.e("WorkerThread", (new StringBuilder()).append("handleMessage: bad message received (").append(message.what).append(")").toString());
            return;

        case 0: // '\0'
            n.b(a, (e)message.obj);
            return;

        case 1: // '\001'
            n.b(a);
            break;
        }
    }
}
