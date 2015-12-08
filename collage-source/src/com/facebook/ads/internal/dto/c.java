// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.ads.internal.dto;

import java.util.ArrayList;
import java.util.List;

// Referenced classes of package com.facebook.ads.internal.dto:
//            a, d

public class c
{

    private List a;
    private int b;
    private d c;

    public c()
    {
        b = 0;
        a = new ArrayList();
    }

    public d a()
    {
        return c;
    }

    public void a(a a1)
    {
        a.add(a1);
    }

    public void a(d d)
    {
        c = d;
    }

    public int b()
    {
        return a.size();
    }

    public a c()
    {
        if (b < a.size())
        {
            b = b + 1;
            return (a)a.get(b - 1);
        } else
        {
            return null;
        }
    }
}
