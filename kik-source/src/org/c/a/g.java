// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.c.a;

import java.util.ArrayList;
import java.util.List;
import org.c.a;
import org.c.b;

// Referenced classes of package org.c.a:
//            d

public final class g
    implements a
{

    final List a = new ArrayList();

    public g()
    {
    }

    public final List a()
    {
        ArrayList arraylist = new ArrayList();
        synchronized (a)
        {
            arraylist.addAll(a);
        }
        return arraylist;
        exception;
        list;
        JVM INSTR monitorexit ;
        throw exception;
    }

    public final b a(String s)
    {
        synchronized (a)
        {
            a.add(s);
        }
        return org.c.a.d.a;
        s;
        list;
        JVM INSTR monitorexit ;
        throw s;
    }
}
