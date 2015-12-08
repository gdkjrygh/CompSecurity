// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.cast;

import com.google.android.gms.common.internal.o;

// Referenced classes of package com.google.android.gms.cast:
//            Cast, CastDevice

public static final class <init>
{

    CastDevice EN;
    EP EO;
    private int EP;

    static int a(<init> <init>1)
    {
        return <init>1.EP;
    }

    public EP build()
    {
        return new EP(this, null);
    }

    public EP setVerboseLoggingEnabled(boolean flag)
    {
        if (flag)
        {
            EP = EP | 1;
            return this;
        } else
        {
            EP = EP & -2;
            return this;
        }
    }

    private (CastDevice castdevice,  )
    {
        o.b(castdevice, "CastDevice parameter cannot be null");
        o.b(, "CastListener parameter cannot be null");
        EN = castdevice;
        EO = ;
        EP = 0;
    }

    EP(CastDevice castdevice, EP ep, EP ep1)
    {
        this(castdevice, ep);
    }
}
