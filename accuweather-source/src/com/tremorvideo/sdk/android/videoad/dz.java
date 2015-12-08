// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.tremorvideo.sdk.android.videoad;

import java.util.List;

// Referenced classes of package com.tremorvideo.sdk.android.videoad:
//            fz, az

public class dz
{

    private fz a;
    private int b;
    private boolean c;
    private String d;

    public dz(fz fz1, String s)
    {
        a = fz1;
        d = s;
        b = 0;
        c = false;
    }

    public void a()
    {
        b = b + 1;
        c = false;
    }

    public boolean b()
    {
        return c;
    }

    public void c()
    {
        c = true;
    }

    public boolean d()
    {
        return b >= a.d().size();
    }

    public az e()
    {
        return (az)a.d().get(b);
    }

    public String f()
    {
        return d;
    }

    public fz g()
    {
        return a;
    }
}
