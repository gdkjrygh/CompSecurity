// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.common.collect;

import com.google.common.base.p;
import com.google.common.c.a;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;

// Referenced classes of package com.google.common.collect:
//            ag, bl, af

public final class Lists
{

    public static ArrayList a(Iterable iterable)
    {
        p.a(iterable);
        if (iterable instanceof Collection)
        {
            return new ArrayList(com.google.common.collect.ag.a(iterable));
        } else
        {
            return a(iterable.iterator());
        }
    }

    public static ArrayList a(Iterator iterator)
    {
        ArrayList arraylist = new ArrayList();
        com.google.common.collect.bl.a(arraylist, iterator);
        return arraylist;
    }

    public static transient ArrayList a(Object aobj[])
    {
        p.a(((Object) (aobj)));
        int i = aobj.length;
        com.google.common.collect.af.a(i, "arraySize");
        long l = i;
        ArrayList arraylist = new ArrayList(com.google.common.c.a.a((long)(i / 10) + (5L + l)));
        Collections.addAll(arraylist, aobj);
        return arraylist;
    }
}
