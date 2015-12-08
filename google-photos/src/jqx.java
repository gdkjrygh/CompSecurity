// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public final class jqx extends liz
{

    public Map a;

    public jqx()
    {
        a = new HashMap(4);
    }

    public final void a(liz liz1)
    {
        ((jqx)liz1).a.putAll(a);
    }

    public final String toString()
    {
        HashMap hashmap = new HashMap();
        java.util.Map.Entry entry;
        for (Iterator iterator = a.entrySet().iterator(); iterator.hasNext(); hashmap.put((new StringBuilder("metric")).append(entry.getKey()).toString(), entry.getValue()))
        {
            entry = (java.util.Map.Entry)iterator.next();
        }

        return liz.a(hashmap, 0);
    }
}
