// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.android.slyce.a.c;

import com.android.slyce.a.a.a;

// Referenced classes of package com.android.slyce.a.c:
//            ai, ar

class an
    implements a
{

    final com.android.slyce.a.a a;
    final ar b;
    final String c;
    final ai d;

    an(ai ai1, com.android.slyce.a.a a1, ar ar, String s)
    {
        d = ai1;
        a = a1;
        b = ar;
        c = s;
        super();
    }

    public void a(Exception exception)
    {
        synchronized (d)
        {
            a.remove(b);
            com.android.slyce.a.c.ai.a(d, c);
        }
        return;
        exception1;
        exception;
        JVM INSTR monitorexit ;
        throw exception1;
    }
}
