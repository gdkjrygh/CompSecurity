// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.cast;

import com.google.android.gms.internal.fq;

// Referenced classes of package com.google.android.gms.cast:
//            Cast, CastDevice

public static final class <init>
{

    CastDevice xW;
    xY xX;
    private int xY;

    static int a(<init> <init>1)
    {
        return <init>1.xY;
    }

    public xY build()
    {
        return new xY(this, null);
    }

    public xY setVerboseLoggingEnabled(boolean flag)
    {
        if (flag)
        {
            xY = xY | 1;
            return this;
        } else
        {
            xY = xY & -2;
            return this;
        }
    }

    private (CastDevice castdevice,  )
    {
        fq.b(castdevice, "CastDevice parameter cannot be null");
        fq.b(, "CastListener parameter cannot be null");
        xW = castdevice;
        xX = ;
        xY = 0;
    }

    xY(CastDevice castdevice, xY xy, xY xy1)
    {
        this(castdevice, xy);
    }
}
