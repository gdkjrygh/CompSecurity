// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.maps.model;

import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.common.internal.safeparcel.c;
import com.google.android.gms.maps.model.a.a;
import com.google.android.gms.maps.model.a.b;

// Referenced classes of package com.google.android.gms.maps.model:
//            m, l, n

public final class TileOverlayOptions
    implements SafeParcelable
{

    public static final m a = new m();
    private final int b;
    private a c;
    private n d;
    private boolean e;
    private float f;
    private boolean g;

    public TileOverlayOptions()
    {
        e = true;
        g = true;
        b = 1;
    }

    TileOverlayOptions(int i, IBinder ibinder, boolean flag, float f1, boolean flag1)
    {
        e = true;
        g = true;
        b = i;
        c = com.google.android.gms.maps.model.a.b.a(ibinder);
        if (c == null)
        {
            ibinder = null;
        } else
        {
            ibinder = new l(this);
        }
        d = ibinder;
        e = flag;
        f = f1;
        g = flag1;
    }

    static a a(TileOverlayOptions tileoverlayoptions)
    {
        return tileoverlayoptions.c;
    }

    final int a()
    {
        return b;
    }

    final IBinder b()
    {
        return c.asBinder();
    }

    public final float c()
    {
        return f;
    }

    public final boolean d()
    {
        return e;
    }

    public final int describeContents()
    {
        return 0;
    }

    public final boolean e()
    {
        return g;
    }

    public final void writeToParcel(Parcel parcel, int i)
    {
        if (com.google.android.gms.maps.a.b.a())
        {
            i = com.google.android.gms.common.internal.safeparcel.c.a(parcel);
            com.google.android.gms.common.internal.safeparcel.c.a(parcel, 1, b);
            com.google.android.gms.common.internal.safeparcel.c.a(parcel, 2, b());
            com.google.android.gms.common.internal.safeparcel.c.a(parcel, 3, e);
            com.google.android.gms.common.internal.safeparcel.c.a(parcel, 4, f);
            com.google.android.gms.common.internal.safeparcel.c.a(parcel, i);
            return;
        } else
        {
            com.google.android.gms.maps.model.m.a(this, parcel);
            return;
        }
    }

}
