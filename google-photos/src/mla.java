// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.util.Map;

public final class mla extends mld
{

    private final Map a;

    public mla(Map map)
    {
        a = map;
    }

    public final String a(String s, String s1)
    {
        if (!s.contains(s))
        {
            s = String.valueOf(s);
            if (s.length() != 0)
            {
                s = "Couldn't find string for animation group with id ".concat(s);
            } else
            {
                s = new String("Couldn't find string for animation group with id ");
            }
            throw new RuntimeException(s);
        } else
        {
            return (String)a.get(s);
        }
    }
}
