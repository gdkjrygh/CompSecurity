// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.util.HashMap;
import java.util.Map;

final class jvr
{

    final Map a = new HashMap();
    final Map b = new HashMap();
    private final Map c = new HashMap();

    public jvr()
    {
    }

    public final jvr a(String s, String s1, int i)
    {
        c.put(s, s1);
        a.put(s1, s);
        b.put(s, Integer.valueOf(i));
        return this;
    }
}
