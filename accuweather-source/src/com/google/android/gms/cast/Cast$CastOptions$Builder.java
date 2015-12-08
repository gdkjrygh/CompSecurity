// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.cast;

import com.google.android.gms.internal.hn;

// Referenced classes of package com.google.android.gms.cast:
//            Cast, CastDevice

public static final class <init>
{

    CastDevice Aa;
    Ac Ab;
    private int Ac;

    static int a(<init> <init>1)
    {
        return <init>1.Ac;
    }

    public Ac build()
    {
        return new Ac(this, null);
    }

    public Ac setVerboseLoggingEnabled(boolean flag)
    {
        if (flag)
        {
            Ac = Ac | 1;
            return this;
        } else
        {
            Ac = Ac & -2;
            return this;
        }
    }

    private (CastDevice castdevice,  )
    {
        hn.b(castdevice, "CastDevice parameter cannot be null");
        hn.b(, "CastListener parameter cannot be null");
        Aa = castdevice;
        Ab = ;
        Ac = 0;
    }

    Ac(CastDevice castdevice, Ac ac, Ac ac1)
    {
        this(castdevice, ac);
    }
}
