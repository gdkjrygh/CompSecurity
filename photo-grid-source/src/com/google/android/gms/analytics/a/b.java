// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.analytics.a;

import com.google.android.gms.c.d;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public final class b
{

    Map a;

    public final Map a()
    {
        return new HashMap(a);
    }

    public final String toString()
    {
        HashMap hashmap = new HashMap();
        for (Iterator iterator = a.entrySet().iterator(); iterator.hasNext();)
        {
            java.util.Map.Entry entry = (java.util.Map.Entry)iterator.next();
            if (((String)entry.getKey()).startsWith("&"))
            {
                hashmap.put(((String)entry.getKey()).substring(1), entry.getValue());
            } else
            {
                hashmap.put(entry.getKey(), entry.getValue());
            }
        }

        return d.a(hashmap);
    }
}
