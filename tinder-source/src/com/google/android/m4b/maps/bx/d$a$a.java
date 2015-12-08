// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.m4b.maps.bx;

import com.google.android.m4b.maps.y.j;

// Referenced classes of package com.google.android.m4b.maps.bx:
//            d

public static final class 
{

    boolean a;
    private Boolean b;
    private Integer c;
    private Integer d;
    private int e;
    private int f;

    public final  a(int i)
    {
        c = Integer.valueOf(i);
        d = Integer.valueOf(i);
        return this;
    }

    public final d a(int i, int k)
    {
        e = i;
        f = k;
        return this;
    }

    public final f a(boolean flag)
    {
        b = Boolean.valueOf(flag);
        return this;
    }

    public final b a()
    {
        boolean flag;
        if (d != null)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        j.b(flag, "Texture ID must be specified.");
        return new nit>(b, a, c.intValue(), d.intValue(), e, f);
    }

    public ()
    {
    }
}
