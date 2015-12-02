// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.i.a;

import android.os.DeadObjectException;
import android.os.Message;
import android.os.Messenger;
import android.os.RemoteException;
import com.facebook.common.e.h;
import com.google.common.a.hq;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ConcurrentMap;

// Referenced classes of package com.facebook.i.a:
//            d, a, b

class i
    implements Runnable
{

    final Message a;
    final d b;

    i(d d1, Message message)
    {
        b = d1;
        a = message;
        super();
    }

    public void run()
    {
        Object obj = hq.a();
        for (Iterator iterator = d.l(b).values().iterator(); iterator.hasNext();)
        {
            a a2 = (a)iterator.next();
            try
            {
                a2.a.send(a);
            }
            catch (RemoteException remoteexception)
            {
                if (remoteexception instanceof DeadObjectException)
                {
                    ((List) (obj)).add(a2);
                } else
                {
                    d.k(b).a(com/facebook/i/a/b.getSimpleName(), (new StringBuilder()).append("RemoteException occurred when sending the message to peer ").append(a2.c).toString(), remoteexception);
                }
            }
        }

        a a1;
        for (obj = ((List) (obj)).iterator(); ((Iterator) (obj)).hasNext(); d.a(b, a1))
        {
            a1 = (a)((Iterator) (obj)).next();
        }

    }
}
