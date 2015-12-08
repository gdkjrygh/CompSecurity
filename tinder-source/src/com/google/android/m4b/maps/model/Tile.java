// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.m4b.maps.model;

import android.os.Parcel;
import com.google.android.m4b.maps.k.c;

// Referenced classes of package com.google.android.m4b.maps.model:
//            s

public final class Tile
    implements c
{

    public static final s CREATOR = new s();
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
        s.a(this, parcel);
    }

}
