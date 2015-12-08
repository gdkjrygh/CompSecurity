// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.android.volley;

import android.os.SystemClock;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

// Referenced classes of package com.android.volley:
//            x

static final class c
{
    private static final class a
    {

        public final String a;
        public final long b;
        public final long c;

        public a(String s, long l, long l1)
        {
            a = s;
            b = l;
            c = l1;
        }
    }


    public static final boolean a;
    private final List b = new ArrayList();
    private boolean c;

    public final void a(String s)
    {
        this;
        JVM INSTR monitorenter ;
        int i;
        c = true;
        i = b.size();
        if (i != 0) goto _L2; else goto _L1
_L1:
        long l = 0L;
_L9:
        if (l > 0L) goto _L4; else goto _L3
_L3:
        this;
        JVM INSTR monitorexit ;
        return;
_L2:
        l = ((a)b.get(0)).c;
        l = ((a)b.get(b.size() - 1)).c - l;
        continue; /* Loop/switch isn't completed */
_L4:
        long l1;
        l1 = ((a)b.get(0)).c;
        x.b("(%-4d ms) %s", new Object[] {
            Long.valueOf(l), s
        });
        s = b.iterator();
        l = l1;
_L6:
        if (!s.hasNext())
        {
            break; /* Loop/switch isn't completed */
        }
        a a1 = (a)s.next();
        l1 = a1.c;
        x.b("(+%-4d) [%2d] %s", new Object[] {
            Long.valueOf(l1 - l), Long.valueOf(a1.b), a1.a
        });
        l = l1;
        if (true) goto _L6; else goto _L5
_L5:
        if (true) goto _L3; else goto _L7
_L7:
        s;
        throw s;
        if (true) goto _L9; else goto _L8
_L8:
    }

    public final void a(String s, long l)
    {
        this;
        JVM INSTR monitorenter ;
        if (c)
        {
            throw new IllegalStateException("Marker added to finished log");
        }
        break MISSING_BLOCK_LABEL_24;
        s;
        this;
        JVM INSTR monitorexit ;
        throw s;
        b.add(new a(s, l, SystemClock.elapsedRealtime()));
        this;
        JVM INSTR monitorexit ;
    }

    protected final void finalize()
    {
        if (!c)
        {
            a("Request on the loose");
            x.c("Marker log finalized without finish() - uncaught exit point for request", new Object[0]);
        }
    }

    static 
    {
        a = x.b;
    }

    a.c()
    {
        c = false;
    }
}
