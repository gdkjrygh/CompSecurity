// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import com.google.android.gms.c.d;
import com.google.android.gms.common.internal.bl;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public final class sy extends d
{

    private final Map a = new HashMap();

    public sy()
    {
    }

    public final Map a()
    {
        return Collections.unmodifiableMap(a);
    }

    public final void a(d d1)
    {
        d1 = (sy)d1;
        bl.a(d1);
        ((sy) (d1)).a.putAll(a);
    }

    public final void a(String s, String s1)
    {
        bl.a(s);
        String s2 = s;
        if (s != null)
        {
            s2 = s;
            if (s.startsWith("&"))
            {
                s2 = s.substring(1);
            }
        }
        bl.a(s2, "Name can not be empty or \"&\"");
        a.put(s2, s1);
    }

    public final String toString()
    {
        return a(a);
    }
}
