// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import com.google.common.collect.ImmutableMap;
import com.google.common.collect.RegularImmutableMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class cur
{

    com.google.common.collect.ImmutableMapEntry.TerminalEntry a[];
    int b;

    public cur()
    {
        this((byte)0);
    }

    private cur(byte byte0)
    {
        a = new com.google.common.collect.ImmutableMapEntry.TerminalEntry[4];
        b = 0;
    }

    private void a(int i)
    {
        if (i > a.length)
        {
            a = (com.google.common.collect.ImmutableMapEntry.TerminalEntry[])cuz.b(a, cup.a(a.length, i));
        }
    }

    public ImmutableMap a()
    {
        switch (b)
        {
        default:
            return new RegularImmutableMap(b, a);

        case 0: // '\0'
            return ImmutableMap.h();

        case 1: // '\001'
            return ImmutableMap.b(a[0].getKey(), a[0].getValue());
        }
    }

    public cur a(Object obj, Object obj1)
    {
        a(b + 1);
        obj = ImmutableMap.c(obj, obj1);
        obj1 = a;
        int i = b;
        b = i + 1;
        obj1[i] = obj;
        return this;
    }

    public cur a(java.util.Map.Entry entry)
    {
        return a(entry.getKey(), entry.getValue());
    }

    public cur a(Map map)
    {
        a(b + map.size());
        for (map = map.entrySet().iterator(); map.hasNext(); a((java.util.Map.Entry)map.next())) { }
        return this;
    }
}
