// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import com.google.android.gms.common.api.g;
import com.google.android.gms.common.api.p;

// Referenced classes of package com.google.android.gms.internal:
//            ll

public final class lk
    implements g
{

    public static final lk a = (new ll()).a();
    private final boolean b;
    private final boolean c;
    private final String d;
    private final p e;

    private lk(boolean flag, boolean flag1, String s, p p)
    {
        b = flag;
        c = flag1;
        d = s;
        e = p;
    }

    lk(boolean flag, boolean flag1, String s, p p, byte byte0)
    {
        this(flag, flag1, s, p);
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

    public final p d()
    {
        return e;
    }

}
