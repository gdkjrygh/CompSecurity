// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import com.google.android.gms.common.api.m;

// Referenced classes of package com.google.android.gms.internal:
//            xk

public final class xj
{

    public static final xj a = (new xk()).a();
    private final boolean b;
    private final boolean c;
    private final String d;
    private final m e;
    private final boolean f;
    private final boolean g;

    private xj(boolean flag, boolean flag1, String s, m m, boolean flag2, boolean flag3)
    {
        b = flag;
        c = flag1;
        d = s;
        e = m;
        f = flag2;
        g = flag3;
    }

    xj(boolean flag, boolean flag1, String s, m m, boolean flag2, boolean flag3, byte byte0)
    {
        this(flag, flag1, s, m, flag2, flag3);
    }

    public final boolean a()
    {
        return b;
    }

    public final boolean b()
    {
        return c;
    }

    public final String c()
    {
        return d;
    }

    public final m d()
    {
        return e;
    }

    public final boolean e()
    {
        return f;
    }

    public final boolean f()
    {
        return g;
    }

}
