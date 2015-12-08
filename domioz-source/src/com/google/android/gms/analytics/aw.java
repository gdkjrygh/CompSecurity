// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.analytics;

import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

final class aw
{

    private final Map a;
    private final long b;
    private final String c;
    private final List d;

    public final Map a()
    {
        return a;
    }

    public final long b()
    {
        return b;
    }

    public final String c()
    {
        return c;
    }

    public final List d()
    {
        return d;
    }

    public final String toString()
    {
        StringBuilder stringbuilder = new StringBuilder();
        stringbuilder.append("PATH: ");
        stringbuilder.append(c);
        if (a != null)
        {
            stringbuilder.append("  PARAMS: ");
            for (Iterator iterator = a.entrySet().iterator(); iterator.hasNext(); stringbuilder.append(",  "))
            {
                java.util.Map.Entry entry = (java.util.Map.Entry)iterator.next();
                stringbuilder.append((String)entry.getKey());
                stringbuilder.append("=");
                stringbuilder.append((String)entry.getValue());
            }

        }
        return stringbuilder.toString();
    }
}
