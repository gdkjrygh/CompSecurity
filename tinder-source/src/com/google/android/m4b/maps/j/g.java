// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.m4b.maps.j;

import android.accounts.Account;
import android.view.View;
import com.google.android.m4b.maps.dd.d;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public final class g
{
    public static final class a
    {

        public final Set a;
        public final boolean b;
    }


    public final Account a = null;
    public final Set b;
    final Set c;
    public final Map d;
    public final String e;
    public final String f;
    public final d g;
    public Integer h;
    private final int i = 0;
    private final View j = null;

    public g(Collection collection, Map map, String s, String s1, d d1)
    {
        if (collection == null)
        {
            collection = Collections.EMPTY_SET;
        } else
        {
            collection = Collections.unmodifiableSet(new HashSet(collection));
        }
        b = collection;
        collection = map;
        if (map == null)
        {
            collection = Collections.EMPTY_MAP;
        }
        d = collection;
        e = s;
        f = s1;
        g = d1;
        collection = new HashSet(b);
        for (map = d.values().iterator(); map.hasNext(); collection.addAll(((a)map.next()).a)) { }
        c = Collections.unmodifiableSet(collection);
    }
}
