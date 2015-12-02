// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.orca.notify;

import com.facebook.push.g;

// Referenced classes of package com.facebook.orca.notify:
//            ai, aj

public class w extends ai
{

    private final String b;
    private final String c;
    private final g d;
    private boolean e;

    public w(String s, String s1, g g)
    {
        super(aj.LOGGED_OUT);
        b = s;
        c = s1;
        d = g;
    }

    public String a()
    {
        return b;
    }

    public void a(boolean flag)
    {
        e = flag;
    }

    public String b()
    {
        return c;
    }

    public String c()
    {
        return c;
    }

    public g d()
    {
        return d;
    }

    public boolean e()
    {
        return e;
    }
}
