// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.maps.model;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.maps.internal.v;

// Referenced classes of package com.google.android.gms.maps.model:
//            TileCreator, i

public final class Tile
    implements SafeParcelable
{

    public static final TileCreator CREATOR = new TileCreator();
    public final byte data[];
    public final int height;
    public final int width;
    private final int xM;

    Tile(int j, int k, int l, byte abyte0[])
    {
        xM = j;
        width = k;
        height = l;
        data = abyte0;
    }

    public Tile(int j, int k, byte abyte0[])
    {
        this(1, j, k, abyte0);
    }

    public int describeContents()
    {
        return 0;
    }

    int getVersionCode()
    {
        return xM;
    }

    public void writeToParcel(Parcel parcel, int j)
    {
        if (v.jL())
        {
            i.a(this, parcel, j);
            return;
        } else
        {
            TileCreator.a(this, parcel, j);
            return;
        }
    }

}
