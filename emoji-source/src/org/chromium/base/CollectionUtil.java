// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.chromium.base;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;

public final class CollectionUtil
{

    private CollectionUtil()
    {
    }

    public static ArrayList newArrayList(Iterable iterable)
    {
        ArrayList arraylist = new ArrayList();
        for (iterable = iterable.iterator(); iterable.hasNext(); arraylist.add(iterable.next())) { }
        return arraylist;
    }

    public static transient ArrayList newArrayList(Object aobj[])
    {
        ArrayList arraylist = new ArrayList(aobj.length);
        Collections.addAll(arraylist, aobj);
        return arraylist;
    }

    public static transient HashSet newHashSet(Object aobj[])
    {
        HashSet hashset = new HashSet(aobj.length);
        Collections.addAll(hashset, aobj);
        return hashset;
    }
}
