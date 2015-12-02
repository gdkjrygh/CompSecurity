// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.qihoo.security.leak;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;

// Referenced classes of package com.qihoo.security.leak:
//            c, d

class a extends c
{

    a(d d1)
    {
        super(d1);
    }

    public String a()
    {
        return "leak_exynos_mem";
    }

    boolean b()
    {
        return false;
    }

    public boolean c()
    {
        return false;
    }

    public Drawable d()
    {
        return a.getResources().getDrawable(0x7f0200a9);
    }

    int e()
    {
        return 0x7f0e000f;
    }

    public boolean f()
    {
        return false;
    }
}
