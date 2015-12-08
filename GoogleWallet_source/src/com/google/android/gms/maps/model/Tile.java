// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.maps.model;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.maps.internal.aa;

// Referenced classes of package com.google.android.gms.maps.model:
//            u, v

public final class Tile
    implements SafeParcelable
{

    public static final u CREATOR = new u();
    public final byte data[];
    public final int height;
    private final int mVersionCode;
    public final int width;

    Tile(int i, int j, int k, byte abyte0[])
    {
        mVersionCode = i;
        width = j;
        height = k;
        data = abyte0;
    }

    public Tile(int i, int j, byte abyte0[])
    {
        this(1, i, j, abyte0);
    }

    public final int describeContents()
    {
        return 0;
    }

    final int getVersionCode()
    {
        return mVersionCode;
    }

    public final void writeToParcel(Parcel parcel, int i)
    {
        if (aa.qp())
        {
            v.a(this, parcel, i);
            return;
        } else
        {
            u.a(this, parcel, i);
            return;
        }
    }

}
