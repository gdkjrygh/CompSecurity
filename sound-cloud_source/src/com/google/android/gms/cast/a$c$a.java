// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.cast;

import com.google.android.gms.common.internal.zzx;

// Referenced classes of package com.google.android.gms.cast:
//            a, CastDevice

public static final class c
{

    CastDevice a;
    vice b;
    int c;

    public final c a()
    {
        c = c | 1;
        return this;
    }

    public vice(CastDevice castdevice, vice vice)
    {
        zzx.zzb(castdevice, "CastDevice parameter cannot be null");
        zzx.zzb(vice, "CastListener parameter cannot be null");
        a = castdevice;
        b = vice;
        c = 0;
    }
}
