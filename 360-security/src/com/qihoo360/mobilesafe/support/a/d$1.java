// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.qihoo360.mobilesafe.support.a;

import android.os.RemoteException;
import android.util.Log;
import java.util.List;

// Referenced classes of package com.qihoo360.mobilesafe.support.a:
//            d, a, b

class h
    implements Runnable
{

    final d a;
    private final a b;
    private final boolean c;
    private final a d;
    private final String e;
    private final List f;
    private final List g;
    private final long h;

    public void run()
    {
        com.qihoo360.mobilesafe.support.a.d.h();
        if (com.qihoo360.mobilesafe.support.a.d.i() != null)
        {
            break MISSING_BLOCK_LABEL_65;
        }
        synchronized (b)
        {
            b.d = false;
            b.notify();
        }
        if (!c || d == null)
        {
            break MISSING_BLOCK_LABEL_59;
        }
        d.a(2, false, null);
_L1:
        return;
        exception;
        h1;
        JVM INSTR monitorexit ;
        throw exception;
        try
        {
            b.c = com.qihoo360.mobilesafe.support.a.d.i().c(e, f, g, h);
            if (c && d != null)
            {
                d.a(2, true, b.c);
            }
        }
        // Misplaced declaration of an exception variable
        catch (Object obj)
        {
            if (a.f)
            {
                Log.e("RootClient", ((Exception) (obj)).getMessage(), ((Throwable) (obj)));
            }
            if (c && d != null)
            {
                try
                {
                    d.a(2, false, null);
                }
                // Misplaced declaration of an exception variable
                catch (Object obj) { }
            }
        }
        synchronized (b)
        {
            b.d = false;
            b.notify();
        }
        if (a.f)
        {
            Log.i("RootClient", "Exec thread finished.");
            return;
        }
          goto _L1
        exception1;
        obj;
        JVM INSTR monitorexit ;
        throw exception1;
        RemoteException remoteexception;
        remoteexception;
    }

    (d d1,  , boolean flag, a a1, String s, List list, List list1, 
            long l)
    {
        a = d1;
        b = ;
        c = flag;
        d = a1;
        e = s;
        f = list;
        g = list1;
        h = l;
        super();
    }
}
