// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.util.HashSet;
import java.util.Map;
import java.util.Set;

abstract class lqd
{

    final Set a;
    private final String b;

    public transient lqd(String s, String as[])
    {
        b = s;
        a = new HashSet(as.length);
        int j = as.length;
        for (int i = 0; i < j; i++)
        {
            s = as[i];
            a.add(s);
        }

    }

    public String a()
    {
        return b;
    }

    public abstract ksp a(Map map);

    public abstract boolean b();

    public Set c()
    {
        return a;
    }
}
