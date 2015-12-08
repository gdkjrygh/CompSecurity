// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.drive;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

// Referenced classes of package com.google.android.gms.drive:
//            g

public class StorageStats
    implements SafeParcelable
{

    public static final android.os.Parcelable.Creator CREATOR = new g();
    final int CK;
    final long OM;
    final long ON;
    final long OO;
    final long OP;
    final int OQ;

    StorageStats(int i, long l, long l1, long l2, 
            long l3, int j)
    {
        CK = i;
        OM = l;
        ON = l1;
        OO = l2;
        OP = l3;
        OQ = j;
    }

    public int describeContents()
    {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        g.a(this, parcel, i);
    }

}
