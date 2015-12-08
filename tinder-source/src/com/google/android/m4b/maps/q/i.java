// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.m4b.maps.q;

import android.accounts.Account;
import android.content.Context;
import android.os.Looper;
import android.os.RemoteException;
import android.util.Log;
import com.google.android.m4b.maps.j.g;
import com.google.android.m4b.maps.p.a;
import com.google.android.m4b.maps.p.c;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;

// Referenced classes of package com.google.android.m4b.maps.q:
//            a, h, p, f, 
//            l

public final class i extends com.google.android.m4b.maps.q.a
{

    final h e;
    private final c f;

    public i(Context context, Looper looper, com.google.android.m4b.maps.h.d.b b, com.google.android.m4b.maps.h.d.d d1, String s, g g1)
    {
        this(context, looper, b, d1, s, g1, a.a);
    }

    private i(Context context, Looper looper, com.google.android.m4b.maps.h.d.b b, com.google.android.m4b.maps.h.d.d d1, String s, g g1, a a1)
    {
        super(context, looper, b, d1, s, g1);
        e = new h(context, d);
        if (g1.a != null)
        {
            looper = g1.a.name;
        } else
        {
            looper = null;
        }
        f = new c(context, looper, g1.e, d, a1);
    }

    public final void d()
    {
        h h1 = e;
        h1;
        JVM INSTR monitorenter ;
        boolean flag = e();
        if (!flag) goto _L2; else goto _L1
_L1:
        Object obj2 = e;
        Object obj = ((h) (obj2)).c;
        obj;
        JVM INSTR monitorenter ;
        Iterator iterator = ((h) (obj2)).c.values().iterator();
_L6:
        if (!iterator.hasNext()) goto _L4; else goto _L3
_L3:
        Object obj3 = (h.c)iterator.next();
        if (obj3 == null) goto _L6; else goto _L5
_L5:
        ((f)((h) (obj2)).a.b()).a(com.google.android.m4b.maps.q.l.a(((com.google.android.m4b.maps.o.n) (obj3))));
          goto _L6
        obj2;
        obj;
        JVM INSTR monitorexit ;
        throw obj2;
        obj;
        Object obj1;
        try
        {
            throw new IllegalStateException(((Throwable) (obj)));
        }
        // Misplaced declaration of an exception variable
        catch (Object obj) { }
        finally { }
        Log.e("LocationClientImpl", "Client disconnected before listeners could be cleaned up", ((Throwable) (obj)));
_L2:
        super.d();
        h1;
        JVM INSTR monitorexit ;
        return;
_L4:
        ((h) (obj2)).c.clear();
        iterator = ((h) (obj2)).d.values().iterator();
_L7:
        do
        {
            if (!iterator.hasNext())
            {
                break MISSING_BLOCK_LABEL_207;
            }
            obj3 = (h.a)iterator.next();
        } while (obj3 == null);
        ((f)((h) (obj2)).a.b()).a(com.google.android.m4b.maps.q.l.a(((com.google.android.m4b.maps.o.l) (obj3))));
          goto _L7
        ((h) (obj2)).d.clear();
        obj;
        JVM INSTR monitorexit ;
        obj = e;
        flag = ((h) (obj)).b;
        if (!flag) goto _L2; else goto _L8
_L8:
        ((h) (obj)).a.a();
        ((f)((h) (obj)).a.b()).a(false);
        obj.b = false;
          goto _L2
        obj1;
        throw new IllegalStateException(((Throwable) (obj1)));
        h1;
        JVM INSTR monitorexit ;
        throw obj1;
    }

    public final boolean m()
    {
        return true;
    }
}
