// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.drive.internal;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

// Referenced classes of package com.google.android.gms.drive.internal:
//            z

public class GetDriveIdFromUniqueIdentifierRequest
    implements SafeParcelable
{

    public static final android.os.Parcelable.Creator CREATOR = new z();
    final int BR;
    final String Ph;
    final boolean Pi;

    GetDriveIdFromUniqueIdentifierRequest(int i, String s, boolean flag)
    {
        BR = i;
        Ph = s;
        Pi = flag;
    }

    public int describeContents()
    {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        z.a(this, parcel, i);
    }

}
