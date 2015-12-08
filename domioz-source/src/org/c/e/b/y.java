// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.c.e.b;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

// Referenced classes of package org.c.e.b:
//            x, f, w, z, 
//            e

final class y
    implements x
{

    private final List a;

    private y(x x1)
    {
        a = new ArrayList();
        a.add(x1);
    }

    y(x x1, byte byte0)
    {
        this(x1);
    }

    public final e a()
    {
        ArrayList arraylist = new ArrayList(a.size());
        for (Iterator iterator = a.iterator(); iterator.hasNext(); arraylist.add(((x)iterator.next()).a())) { }
        return new f(arraylist);
    }

    public final x a(String s)
    {
        a.add(new w(s, (byte)0));
        return this;
    }

    public final transient x a(String as[])
    {
        a.add(new z(as, (byte)0));
        return this;
    }
}
