// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.qihoo360.mobilesafe.support.a;

import android.os.RemoteException;
import java.util.List;

// Referenced classes of package com.qihoo360.mobilesafe.support.a:
//            d, a, b

class h
    implements Runnable
{

    final d a;
    private final d b;
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
        d.a(1, false, null);
        return;
        exception;
        h1;
        JVM INSTR monitorexit ;
        throw exception;
        b.a = com.qihoo360.mobilesafe.support.a.d.i().b(e, f, g, h);
        if (c && d != null)
        {
            d.a(1, b.a(), null);
        }
_L2:
        synchronized (b)
        {
            b.d = false;
            b.notify();
        }
        return;
        exception1;
        h2;
        JVM INSTR monitorexit ;
        throw exception1;
        Object obj;
        obj;
        if (c && d != null)
        {
            try
            {
                d.a(1, false, null);
            }
            // Misplaced declaration of an exception variable
            catch (Object obj) { }
        }
        if (true) goto _L2; else goto _L1
_L1:
        obj;
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
