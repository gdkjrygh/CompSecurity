// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.chromium.net;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.TreeMap;
import java.util.concurrent.atomic.AtomicLong;

public final class UrlResponseInfo
{

    public final int a;
    public final String b;
    public final boolean c;
    public final String d;
    private final List e;
    private final String f;
    private final List g;
    private final AtomicLong h = new AtomicLong();
    private Map i;

    UrlResponseInfo(List list, int j, String s, List list1, boolean flag, String s1, String s2)
    {
        e = Collections.unmodifiableList(list);
        a = j;
        b = s;
        g = Collections.unmodifiableList(list1);
        c = flag;
        d = s1;
        f = s2;
    }

    public final Map a()
    {
        if (i != null)
        {
            return i;
        }
        TreeMap treemap = new TreeMap(String.CASE_INSENSITIVE_ORDER);
        java.util.Map.Entry entry;
        ArrayList arraylist;
        for (Iterator iterator = g.iterator(); iterator.hasNext(); treemap.put(entry.getKey(), Collections.unmodifiableList(arraylist)))
        {
            entry = (java.util.Map.Entry)iterator.next();
            arraylist = new ArrayList();
            if (treemap.containsKey(entry.getKey()))
            {
                arraylist.addAll((Collection)treemap.get(entry.getKey()));
            }
            arraylist.add(entry.getValue());
        }

        i = Collections.unmodifiableMap(treemap);
        return i;
    }

    final void a(long l)
    {
        h.set(l);
    }

    public final String toString()
    {
        return String.format(Locale.ROOT, "UrlResponseInfo[%s]: urlChain = %s, httpStatus = %d %s, headers = %s, wasCached = %b, negotiatedProtocol = %s, proxyServer= %s, receivedBytesCount = %d", new Object[] {
            (String)e.get(e.size() - 1), e.toString(), Integer.valueOf(a), b, g.toString(), Boolean.valueOf(c), d, f, Long.valueOf(h.get())
        });
    }
}
