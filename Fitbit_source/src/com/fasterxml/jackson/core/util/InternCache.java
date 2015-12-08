// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fasterxml.jackson.core.util;

import java.util.LinkedHashMap;

public final class InternCache extends LinkedHashMap
{

    public static final InternCache a = new InternCache();
    private static final int b = 100;

    private InternCache()
    {
        super(100, 0.8F, true);
    }

    public String a(String s)
    {
        this;
        JVM INSTR monitorenter ;
        String s2 = (String)get(s);
        String s1;
        s1 = s2;
        if (s2 != null)
        {
            break MISSING_BLOCK_LABEL_29;
        }
        s1 = s.intern();
        put(s1, s1);
        this;
        JVM INSTR monitorexit ;
        return s1;
        s;
        throw s;
    }

    protected boolean removeEldestEntry(java.util.Map.Entry entry)
    {
        return size() > 100;
    }

}
