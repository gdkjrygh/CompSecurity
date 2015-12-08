// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.cast;

import com.google.android.gms.internal.jx;

// Referenced classes of package com.google.android.gms.cast:
//            Cast, CastDevice

public static final class <init>
{

    CastDevice FC;
    FE FD;
    private int FE;

    static int a(<init> <init>1)
    {
        return <init>1.FE;
    }

    public FE build()
    {
        return new FE(this, null);
    }

    public FE setVerboseLoggingEnabled(boolean flag)
    {
        if (flag)
        {
            FE = FE | 1;
            return this;
        } else
        {
            FE = FE & -2;
            return this;
        }
    }

    private (CastDevice castdevice,  )
    {
        jx.b(castdevice, "CastDevice parameter cannot be null");
        jx.b(, "CastListener parameter cannot be null");
        FC = castdevice;
        FD = ;
        FE = 0;
    }

    FE(CastDevice castdevice, FE fe, FE fe1)
    {
        this(castdevice, fe);
    }
}
