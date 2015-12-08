// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.content.Context;
import android.os.Handler;
import java.util.Iterator;
import java.util.List;

// Referenced classes of package com.google.android.gms.internal:
//            ek, aq, ap, aw, 
//            au, cd, eh, ao, 
//            ba

public final class an
{

    private final cd a;
    private final ba b;
    private final Context c;
    private final Object d = new Object();
    private final aq e;
    private boolean f;
    private au g;

    public an(Context context, cd cd1, ba ba, aq aq1)
    {
        f = false;
        c = context;
        a = cd1;
        b = ba;
        e = aq1;
    }

    public final aw a(long l)
    {
        Iterator iterator;
        ek.a("Starting mediation.");
        iterator = e.a.iterator();
_L4:
        ap ap1;
        Iterator iterator1;
        if (!iterator.hasNext())
        {
            break MISSING_BLOCK_LABEL_233;
        }
        ap1 = (ap)iterator.next();
        ek.b((new StringBuilder("Trying mediation network: ")).append(ap1.b).toString());
        iterator1 = ap1.c.iterator();
_L2:
        String s;
label0:
        {
            if (!iterator1.hasNext())
            {
                break; /* Loop/switch isn't completed */
            }
            s = (String)iterator1.next();
            aw aw1;
            synchronized (d)
            {
                if (!f)
                {
                    break label0;
                }
                aw1 = new aw(-1);
            }
            return aw1;
        }
        g = new au(c, s, b, e, ap1, a.d, a.e, a.l);
        obj;
        JVM INSTR monitorexit ;
        obj = g.a(l);
        if (((aw) (obj)).a == 0)
        {
            ek.a("Adapter succeeded.");
            return ((aw) (obj));
        }
        break MISSING_BLOCK_LABEL_207;
        exception;
        throw exception;
        if (((aw) (obj)).c != null)
        {
            eh.a.post(new ao(this, ((aw) (obj))));
        }
        if (true) goto _L2; else goto _L1
_L1:
        if (true) goto _L4; else goto _L3
_L3:
        return new aw(1);
    }

    public final void a()
    {
        synchronized (d)
        {
            f = true;
            if (g != null)
            {
                g.a();
            }
        }
    }
}
