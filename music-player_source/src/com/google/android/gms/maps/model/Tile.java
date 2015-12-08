// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.maps.model;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.common.internal.safeparcel.c;
import com.google.android.gms.maps.a.b;

// Referenced classes of package com.google.android.gms.maps.model:
//            k

public final class Tile
    implements SafeParcelable
{

    public static final k a = new k();
    public final int b;
    public final int c;
    public final byte d[];
    private final int e;

    public Tile()
    {
        this(1, -1, -1, null);
    }

    Tile(int i, int j, int l, byte abyte0[])
    {
        e = i;
        b = j;
        c = l;
        d = abyte0;
    }

    final int a()
    {
        return e;
    }

    public final int describeContents()
    {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i)
    {
        if (com.google.android.gms.maps.a.b.a())
        {
            i = com.google.android.gms.common.internal.safeparcel.c.a(parcel);
            com.google.android.gms.common.internal.safeparcel.c.a(parcel, 1, e);
            com.google.android.gms.common.internal.safeparcel.c.a(parcel, 2, b);
            com.google.android.gms.common.internal.safeparcel.c.a(parcel, 3, c);
            com.google.android.gms.common.internal.safeparcel.c.a(parcel, 4, d);
            com.google.android.gms.common.internal.safeparcel.c.a(parcel, i);
            return;
        } else
        {
            k.a(this, parcel);
            return;
        }
    }

}
