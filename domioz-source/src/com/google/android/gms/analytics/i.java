// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.analytics;

import android.text.TextUtils;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public final class i
{

    private final Map a = new HashMap();
    private final Map b = new HashMap();
    private final boolean c = false;
    private final String d;

    public i(String s)
    {
        d = s;
    }

    public final String a()
    {
        if (!c)
        {
            return "";
        }
        StringBuilder stringbuilder = new StringBuilder();
        stringbuilder.append(d);
        String s;
        for (Iterator iterator = a.keySet().iterator(); iterator.hasNext(); stringbuilder.append("&").append(s).append("=").append(a.get(s)))
        {
            s = (String)iterator.next();
        }

        String s1;
        for (Iterator iterator1 = b.keySet().iterator(); iterator1.hasNext(); stringbuilder.append("&").append(s1).append("=").append((String)b.get(s1)))
        {
            s1 = (String)iterator1.next();
        }

        return stringbuilder.toString();
    }

    public final void a(String s, int j)
    {
        if (!c)
        {
            return;
        }
        Integer integer1 = (Integer)a.get(s);
        Integer integer = integer1;
        if (integer1 == null)
        {
            integer = Integer.valueOf(0);
        }
        a.put(s, Integer.valueOf(integer.intValue() + j));
    }

    public final void a(String s, String s1)
    {
        if (!c || TextUtils.isEmpty(s))
        {
            return;
        } else
        {
            b.put(s, s1);
            return;
        }
    }
}
