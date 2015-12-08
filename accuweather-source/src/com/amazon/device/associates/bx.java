// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.amazon.device.associates;

import java.util.HashMap;

// Referenced classes of package com.amazon.device.associates:
//            bj

public class bx extends bj
{

    private HashMap a;
    private HashMap b;

    public bx()
    {
        a = new HashMap();
        b = new HashMap();
    }

    public HashMap a()
    {
        return a;
    }

    public volatile void a(String s)
    {
        super.a(s);
    }

    public void a(String s, String s1)
    {
        a.put(s, s1);
    }

    public void b(String s, String s1)
    {
        b.put(s, s1);
    }

    public HashMap e()
    {
        return b;
    }
}
