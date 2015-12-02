// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.mobvista.sdk.m.core.d;

import com.mobvista.sdk.m.a.c.d;
import com.mobvista.sdk.m.core.q;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

// Referenced classes of package com.mobvista.sdk.m.core.d:
//            b

public final class a
    implements d
{

    private HashMap a;
    private com.mobvista.sdk.m.a.c.a b;
    private List c;

    public a()
    {
        a = null;
        b = null;
        c = null;
        a = new HashMap();
        c = new LinkedList();
        b = new com.mobvista.sdk.m.a.c.a();
        b.a(this);
    }

    public final void a(int i, String s, String s1)
    {
        s1 = (b)a.get(s);
        if (s1 != null)
        {
            s1.b(s);
        }
        c.remove(s);
        a.remove(s);
    }

    public final void a(String s, String s1, int i)
    {
        s = (b)a.get(s);
        if (s != null)
        {
            s.a(i);
        }
    }

    public final void a(String s, String s1, b b1)
    {
        for (Iterator iterator = c.iterator(); iterator.hasNext();)
        {
            if (((String)iterator.next()).equals(s))
            {
                a.put(s, b1);
                return;
            }
        }

        String s2 = com.mobvista.sdk.m.core.util.a.a(s);
        b.a(s, s1, q.c, s2, this);
        c.add(s);
        a.put(s, b1);
    }

    public final void a(String s, String s1, String s2)
    {
        s1 = (b)a.get(s);
        if (s1 != null)
        {
            s1.a(s2);
        }
        c.remove(s);
        a.remove(s);
    }
}
