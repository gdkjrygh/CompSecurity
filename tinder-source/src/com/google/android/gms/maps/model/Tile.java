// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.maps.model;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

// Referenced classes of package com.google.android.gms.maps.model:
//            p

public final class Tile
    implements SafeParcelable
{

    public static final p CREATOR = new p();
    final int a;
    public final int b;
    public final int c;
    public final byte d[];

    public Tile()
    {
        this(1, -1, -1, null);
    }

    Tile(int i, int j, int k, byte abyte0[])
    {
        a = i;
        b = j;
        c = k;
        d = abyte0;
    }

    public final int describeContents()
    {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i)
    {
        p.a(this, parcel);
    }

}
