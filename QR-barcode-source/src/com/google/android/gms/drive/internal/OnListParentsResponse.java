// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.drive.internal;

import android.os.Parcel;
import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.drive.i;

// Referenced classes of package com.google.android.gms.drive.internal:
//            ao

public class OnListParentsResponse extends i
    implements SafeParcelable
{

    public static final android.os.Parcelable.Creator CREATOR = new ao();
    final int BR;
    final DataHolder Pv;

    OnListParentsResponse(int j, DataHolder dataholder)
    {
        BR = j;
        Pv = dataholder;
    }

    protected void I(Parcel parcel, int j)
    {
        ao.a(this, parcel, j);
    }

    public int describeContents()
    {
        return 0;
    }

    public DataHolder ik()
    {
        return Pv;
    }

}
