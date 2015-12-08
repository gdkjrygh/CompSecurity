// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.util.HashMap;
import java.util.Map;

static final class lang.String
{

    private static final Map a;

    public static lang.String a(String s)
    {
        return (lang.Object)a.get(s);
    }

    static 
    {
        HashMap hashmap = new HashMap(10);
        a = hashmap;
        hashmap.put("none", a);
        a.put("xMinYMin", b);
        a.put("xMidYMin", c);
        a.put("xMaxYMin", d);
        a.put("xMinYMid", e);
        a.put("xMidYMid", f);
        a.put("xMaxYMid", g);
        a.put("xMinYMax", h);
        a.put("xMidYMax", i);
        a.put("xMaxYMax", j);
    }
}
