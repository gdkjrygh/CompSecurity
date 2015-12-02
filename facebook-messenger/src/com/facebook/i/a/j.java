// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.i.a;

import android.os.DeadObjectException;
import android.os.Message;
import android.os.Messenger;
import android.os.RemoteException;
import com.facebook.common.e.h;

// Referenced classes of package com.facebook.i.a:
//            a, d, b

class j
    implements Runnable
{

    final a a;
    final Message b;
    final d c;

    j(d d1, a a1, Message message)
    {
        c = d1;
        a = a1;
        b = message;
        super();
    }

    public void run()
    {
        try
        {
            a.a.send(b);
            return;
        }
        catch (RemoteException remoteexception)
        {
            if (remoteexception instanceof DeadObjectException)
            {
                d.a(c, a);
                return;
            } else
            {
                d.k(c).a(com/facebook/i/a/b.getSimpleName(), (new StringBuilder()).append("RemoteException occurred when sending the message to peer ").append(a.c).toString(), remoteexception);
                return;
            }
        }
    }
}
