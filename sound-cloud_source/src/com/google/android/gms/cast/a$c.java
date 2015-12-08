// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.cast;

import com.google.android.gms.common.internal.zzx;

// Referenced classes of package com.google.android.gms.cast:
//            a, CastDevice

public static final class a
    implements com.google.android.gms.common.api.ApiOptions.HasOptions
{
    public static final class a
    {

        CastDevice a;
        a.d b;
        int c;

        public final a a()
        {
            c = c | 1;
            return this;
        }

        public a(CastDevice castdevice, a.d d)
        {
            zzx.zzb(castdevice, "CastDevice parameter cannot be null");
            zzx.zzb(d, "CastListener parameter cannot be null");
            a = castdevice;
            b = d;
            c = 0;
        }
    }


    final CastDevice a;
    final Device b;
    private final int c;

    static int a(Device device)
    {
        return device.c;
    }

    public static a a(CastDevice castdevice, Device device)
    {
        return new a(castdevice, device);
    }

    private a(a a1)
    {
        a = a1.a;
        b = a1.b;
        c = a1.c;
    }

    public a(a a1, byte byte0)
    {
        this(a1);
    }
}
