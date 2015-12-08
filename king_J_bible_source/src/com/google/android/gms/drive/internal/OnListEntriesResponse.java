// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.drive.internal;

import android.os.Parcel;
import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

// Referenced classes of package com.google.android.gms.drive.internal:
//            ad

public class OnListEntriesResponse
    implements SafeParcelable
{

    public static final android.os.Parcelable.Creator CREATOR = new ad();
    final DataHolder FJ;
    final boolean Fg;
    final int xH;

    OnListEntriesResponse(int i, DataHolder dataholder, boolean flag)
    {
        xH = i;
        FJ = dataholder;
        Fg = flag;
    }

    public int describeContents()
    {
        return 0;
    }

    public DataHolder fN()
    {
        return FJ;
    }

    public boolean fO()
    {
        return Fg;
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        ad.a(this, parcel, i);
    }

}
