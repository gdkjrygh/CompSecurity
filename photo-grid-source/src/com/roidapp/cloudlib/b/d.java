// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.roidapp.cloudlib.b;

import android.os.Handler;
import android.os.Message;

// Referenced classes of package com.roidapp.cloudlib.b:
//            a

final class d
    implements Runnable
{

    final String a;
    final a b;

    d(a a1, String s)
    {
        b = a1;
        a = s;
        super();
    }

    public final void run()
    {
        String s = a;
        int i = com.roidapp.cloudlib.b.a.a(b);
        try
        {
            Thread.sleep(500L);
            com.roidapp.cloudlib.b.a.m(b).obtainMessage(i, s).sendToTarget();
            return;
        }
        catch (InterruptedException interruptedexception)
        {
            interruptedexception.printStackTrace();
        }
    }
}
