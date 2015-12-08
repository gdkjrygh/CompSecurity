// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.c.e.b;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

// Referenced classes of package org.c.e.b:
//            e, s

final class f
    implements e
{

    private final List a;

    f(List list)
    {
        a = list;
    }

    public final String a()
    {
        StringBuilder stringbuilder = new StringBuilder();
        for (Iterator iterator = a.iterator(); iterator.hasNext(); stringbuilder.append(((e)iterator.next()).a())) { }
        return stringbuilder.toString();
    }

    public final e a(String s)
    {
        ArrayList arraylist = new ArrayList(a.size());
        for (Iterator iterator = a.iterator(); iterator.hasNext(); arraylist.add(((e)iterator.next()).a(s))) { }
        return new f(arraylist);
    }

    public final e a(s s)
    {
        ArrayList arraylist = new ArrayList(a.size());
        for (Iterator iterator = a.iterator(); iterator.hasNext(); arraylist.add(((e)iterator.next()).a(s))) { }
        return new f(arraylist);
    }

    public final List b()
    {
        ArrayList arraylist = new ArrayList();
        for (Iterator iterator = a.iterator(); iterator.hasNext(); arraylist.addAll(((e)iterator.next()).b())) { }
        return arraylist;
    }

    public final void c()
    {
        for (Iterator iterator = a.iterator(); iterator.hasNext(); ((e)iterator.next()).c()) { }
    }
}
