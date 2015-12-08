// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.samsung.multiscreen.net.dial;

import java.util.HashMap;
import java.util.Map;

public final class a
{

    Map a;
    private String b;
    private String c;
    private String d;
    private String e;
    private boolean f;

    public a()
    {
        a = new HashMap();
    }

    public final String a()
    {
        return c;
    }

    public final void a(String s)
    {
        b = s;
    }

    public final void a(String s, String s1)
    {
        a.put(s, s1);
    }

    public final void a(boolean flag)
    {
        f = flag;
    }

    public final String b()
    {
        return d;
    }

    protected final void b(String s)
    {
        c = s;
    }

    public final void c(String s)
    {
        d = s;
    }

    public final void d(String s)
    {
        e = s;
    }

    public final String toString()
    {
        StringBuilder stringbuilder = new StringBuilder();
        stringbuilder.append("[DialApplication] name: ").append(b).append(", state: ").append(c).append(", relLink: ").append(d).append(", hrefLink: ").append(e).append(", stopAllowed:").append(f);
        return stringbuilder.toString();
    }
}
