// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.drive.internal;

import android.os.Parcel;
import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

// Referenced classes of package com.google.android.gms.drive.internal:
//            ak

public class OnListEntriesResponse
    implements SafeParcelable
{

    public static final android.os.Parcelable.Creator CREATOR = new ak();
    final boolean IP;
    final DataHolder JA;
    final int xM;

    OnListEntriesResponse(int i, DataHolder dataholder, boolean flag)
    {
        xM = i;
        JA = dataholder;
        IP = flag;
    }

    public int describeContents()
    {
        return 0;
    }

    public DataHolder gy()
    {
        return JA;
    }

    public boolean gz()
    {
        return IP;
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        ak.a(this, parcel, i);
    }

}
