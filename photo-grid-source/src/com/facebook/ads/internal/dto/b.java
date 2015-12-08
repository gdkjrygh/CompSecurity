// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.ads.internal.dto;

import java.util.ArrayList;
import java.util.List;

// Referenced classes of package com.facebook.ads.internal.dto:
//            a, c

public class b
{

    protected String a;
    protected List b;
    protected c c;
    private int d;

    public b()
    {
        d = 0;
        b = new ArrayList();
    }

    public c a()
    {
        return c;
    }

    public void a(a a1)
    {
        b.add(a1);
    }

    public void a(c c1)
    {
        c = c1;
    }

    public void a(String s)
    {
        a = s;
    }

    public int b()
    {
        return b.size();
    }

    public a c()
    {
        if (d < b.size())
        {
            d = d + 1;
            return (a)b.get(d - 1);
        } else
        {
            return null;
        }
    }
}
