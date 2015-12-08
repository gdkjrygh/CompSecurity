// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.cast.internal;

import java.util.Map;

// Referenced classes of package com.google.android.gms.cast.internal:
//            e, p

final class i
    implements Runnable
{

    final e a;
    final String b;
    final String c;
    final e.b d;

    i(e.b b1, e e1, String s, String s1)
    {
        d = b1;
        a = e1;
        b = s;
        c = s1;
        super();
    }

    public final void run()
    {
        com.google.android.gms.cast.a.e e1;
        synchronized (e.e(a))
        {
            e1 = (com.google.android.gms.cast.a.e)e.e(a).get(b);
        }
        if (e1 != null)
        {
            e1.onMessageReceived(e.f(a), b, c);
            return;
        } else
        {
            e.b().a("Discarded message for unknown namespace '%s'", new Object[] {
                b
            });
            return;
        }
        exception;
        map;
        JVM INSTR monitorexit ;
        throw exception;
    }
}
