// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public final class cln extends cpd
{

    public Map a;

    public cln()
    {
        a = new HashMap(4);
    }

    public final void a(cpd cpd1)
    {
        ((cln)cpd1).a.putAll(a);
    }

    public final String toString()
    {
        HashMap hashmap = new HashMap();
        java.util.Map.Entry entry;
        for (Iterator iterator = a.entrySet().iterator(); iterator.hasNext(); hashmap.put((new StringBuilder("dimension")).append(entry.getKey()).toString(), entry.getValue()))
        {
            entry = (java.util.Map.Entry)iterator.next();
        }

        return a(hashmap);
    }
}
