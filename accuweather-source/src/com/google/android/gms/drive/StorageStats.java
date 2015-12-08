// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.drive;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

// Referenced classes of package com.google.android.gms.drive:
//            e

public class StorageStats
    implements SafeParcelable
{

    public static final android.os.Parcelable.Creator CREATOR = new e();
    final long HY;
    final long HZ;
    final long Ia;
    final long Ib;
    final int Ic;
    final int xJ;

    StorageStats(int i, long l, long l1, long l2, 
            long l3, int j)
    {
        xJ = i;
        HY = l;
        HZ = l1;
        Ia = l2;
        Ib = l3;
        Ic = j;
    }

    public int describeContents()
    {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        e.a(this, parcel, i);
    }

}
