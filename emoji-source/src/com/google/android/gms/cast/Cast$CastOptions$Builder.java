// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.cast;

import com.google.android.gms.internal.hm;

// Referenced classes of package com.google.android.gms.cast:
//            Cast, CastDevice

public static final class <init>
{

    CastDevice Ad;
    Af Ae;
    private int Af;

    static int a(<init> <init>1)
    {
        return <init>1.Af;
    }

    public Af build()
    {
        return new Af(this, null);
    }

    public Af setVerboseLoggingEnabled(boolean flag)
    {
        if (flag)
        {
            Af = Af | 1;
            return this;
        } else
        {
            Af = Af & -2;
            return this;
        }
    }

    private (CastDevice castdevice,  )
    {
        hm.b(castdevice, "CastDevice parameter cannot be null");
        hm.b(, "CastListener parameter cannot be null");
        Ad = castdevice;
        Ae = ;
        Af = 0;
    }

    Af(CastDevice castdevice, Af af, Af af1)
    {
        this(castdevice, af);
    }
}
