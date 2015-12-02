// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v4.a;

import android.os.Handler;
import android.os.Message;

// Referenced classes of package android.support.v4.a:
//            n, i, j

class o extends Handler
{

    private o()
    {
    }

    o(j j)
    {
        this();
    }

    public void handleMessage(Message message)
    {
        n n1 = (n)message.obj;
        switch (message.what)
        {
        default:
            return;

        case 1: // '\001'
            i.c(n1.a, n1.b[0]);
            return;

        case 2: // '\002'
            n1.a.b(n1.b);
            break;
        }
    }
}
