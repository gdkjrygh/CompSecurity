// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.unveil.env;

import java.lang.ref.ReferenceQueue;
import java.util.Collection;
import java.util.Vector;

// Referenced classes of package com.google.android.apps.unveil.env:
//            af, j, Size, n, 
//            o

public final class m
{

    private static final af e = new af();
    private static m f;
    ReferenceQueue a;
    final Collection b = new Vector();
    volatile boolean c;
    Thread d;

    private m()
    {
        a = new ReferenceQueue();
        c = false;
    }

    public static m a()
    {
        if (f == null)
        {
            f = new m();
        }
        return f;
    }

    static String a(j j1)
    {
        return b(j1);
    }

    static af b()
    {
        return e;
    }

    private static String b(j j1)
    {
        StringBuilder stringbuilder = new StringBuilder();
        stringbuilder.append(j1.getClass().getSimpleName());
        stringbuilder.append(", ");
        if (j1.b)
        {
            stringbuilder.append(" already recycled");
            return stringbuilder.toString();
        } else
        {
            Size size = j1.b();
            stringbuilder.append(size.width);
            stringbuilder.append("x");
            stringbuilder.append(size.height);
            stringbuilder.append(", ");
            stringbuilder.append(j1.d());
            stringbuilder.append(" bytes");
            return stringbuilder.toString();
        }
    }

    public final void a(j j1, j j2)
    {
        this;
        JVM INSTR monitorenter ;
        if (j1 != null && j2 != null) goto _L2; else goto _L1
_L1:
        this;
        JVM INSTR monitorexit ;
        return;
_L2:
        if (c)
        {
            throw new IllegalStateException("No picture can be added once exitWhenFinished() is called");
        }
        break MISSING_BLOCK_LABEL_35;
        j1;
        this;
        JVM INSTR monitorexit ;
        throw j1;
        if (d == null)
        {
            d = new n(this);
            d.start();
        }
        b.add(new o(this, j1, a, j2));
        e.a("Tracked: %s, total %d", new Object[] {
            b(j2), Integer.valueOf(b.size())
        });
          goto _L1
    }

}
