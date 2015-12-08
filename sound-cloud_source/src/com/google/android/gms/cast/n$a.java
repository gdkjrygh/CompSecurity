// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.cast;

import java.util.HashMap;
import java.util.Map;

// Referenced classes of package com.google.android.gms.cast:
//            n

private static final class 
{

    final Map a = new HashMap();
    private final Map b = new HashMap();
    private final Map c = new HashMap();

    public final  a(String s, String s1, int i)
    {
        b.put(s, s1);
        a.put(s1, s);
        c.put(s, Integer.valueOf(i));
        return this;
    }

    public final String a(String s)
    {
        return (String)b.get(s);
    }

    public final int b(String s)
    {
        s = (Integer)c.get(s);
        if (s != null)
        {
            return s.intValue();
        } else
        {
            return 0;
        }
    }

    public ()
    {
    }
}
