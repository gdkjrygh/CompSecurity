// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.androidannotations.api.d;

import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;

// Referenced classes of package org.androidannotations.api.d:
//            b, a

public final class c
{

    private static c a;
    private final Set b = new LinkedHashSet();

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

    public final void a(a a1)
    {
        for (Iterator iterator = b.iterator(); iterator.hasNext(); ((b)iterator.next()).onViewChanged(a1)) { }
    }
}
