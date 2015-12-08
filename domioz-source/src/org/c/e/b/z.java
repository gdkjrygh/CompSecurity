// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.c.e.b;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import org.c.d.m;

// Referenced classes of package org.c.e.b:
//            x, g, y, e

final class z
    implements x
{

    private final List a;

    private transient z(String as[])
    {
        a = new ArrayList();
        a.addAll(b(as));
    }

    z(String as[], byte byte0)
    {
        this(as);
    }

    private static transient Collection b(String as[])
    {
        ArrayList arraylist = new ArrayList();
        int j = as.length;
        for (int i = 0; i < j; i++)
        {
            String s = as[i];
            if (m.hasText(s))
            {
                arraylist.add(s);
            }
        }

        return arraylist;
    }

    public final e a()
    {
        return new g(a);
    }

    public final x a(String s)
    {
        y y1 = new y(this, (byte)0);
        y1.a(s);
        return y1;
    }

    public final transient x a(String as[])
    {
        a.addAll(b(as));
        return this;
    }
}
