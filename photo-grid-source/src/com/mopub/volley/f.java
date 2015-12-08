// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.mopub.volley;

import android.os.SystemClock;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

// Referenced classes of package com.mopub.volley:
//            VolleyLog, g

final class f
{

    public static final boolean ENABLED;
    private final List a = new ArrayList();
    private boolean b;

    f()
    {
        b = false;
    }

    public final void add(String s, long l)
    {
        this;
        JVM INSTR monitorenter ;
        if (b)
        {
            throw new IllegalStateException("Marker added to finished log");
        }
        break MISSING_BLOCK_LABEL_24;
        s;
        this;
        JVM INSTR monitorexit ;
        throw s;
        a.add(new g(s, l, SystemClock.elapsedRealtime()));
        this;
        JVM INSTR monitorexit ;
    }

    protected final void finalize()
    {
        if (!b)
        {
            finish("Request on the loose");
            VolleyLog.e("Marker log finalized without finish() - uncaught exit point for request", new Object[0]);
        }
    }

    public final void finish(String s)
    {
        this;
        JVM INSTR monitorenter ;
        int i;
        b = true;
        i = a.size();
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
        l = ((g)a.get(0)).time;
        l = ((g)a.get(a.size() - 1)).time - l;
        continue; /* Loop/switch isn't completed */
_L4:
        long l1;
        l1 = ((g)a.get(0)).time;
        VolleyLog.d("(%-4d ms) %s", new Object[] {
            Long.valueOf(l), s
        });
        s = a.iterator();
        l = l1;
_L6:
        if (!s.hasNext())
        {
            break; /* Loop/switch isn't completed */
        }
        g g1 = (g)s.next();
        l1 = g1.time;
        VolleyLog.d("(+%-4d) [%2d] %s", new Object[] {
            Long.valueOf(l1 - l), Long.valueOf(g1.thread), g1.name
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

    static 
    {
        ENABLED = VolleyLog.DEBUG;
    }
}
