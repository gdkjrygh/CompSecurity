// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.androidannotations.a.c;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

// Referenced classes of package org.androidannotations.a.c:
//            b, a

public class c
{

    private static c a;
    private final List b = new LinkedList();

    public c()
    {
    }

    public static c a(c c1)
    {
        c c2 = a;
        a = c1;
        return c2;
    }

    public static void a(b b1)
    {
        if (a != null)
        {
            a.b.add(b1);
        }
    }

    public void a(a a1)
    {
        for (Iterator iterator = b.iterator(); iterator.hasNext(); ((b)iterator.next()).a(a1)) { }
    }
}
