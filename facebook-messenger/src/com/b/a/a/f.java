// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.b.a.a;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

// Referenced classes of package com.b.a.a:
//            g

public class f
    implements g
{

    private final List mSetters;

    public f(List list)
    {
        mSetters = new ArrayList(list);
    }

    public transient f(g ag[])
    {
        this(toList(ag));
    }

    private static List toList(g ag[])
    {
        ArrayList arraylist = new ArrayList(ag.length);
        int j = ag.length;
        for (int i = 0; i < j; i++)
        {
            arraylist.add(ag[i]);
        }

        return arraylist;
    }

    public void set()
    {
        for (Iterator iterator = mSetters.iterator(); iterator.hasNext(); ((g)iterator.next()).set()) { }
    }
}
