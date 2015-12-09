// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.util.HashMap;
import java.util.Map;

final class bou
{

    final Map a = new HashMap();
    private final Map b = new HashMap();
    private final Map c = new HashMap();

    public bou()
    {
    }

    public final bou a(String s, String s1, int i)
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
}
