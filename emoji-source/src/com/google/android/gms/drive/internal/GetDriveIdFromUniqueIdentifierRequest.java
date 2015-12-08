// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.drive.internal;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

// Referenced classes of package com.google.android.gms.drive.internal:
//            y

public class GetDriveIdFromUniqueIdentifierRequest
    implements SafeParcelable
{

    public static final android.os.Parcelable.Creator CREATOR = new y();
    final String Jp;
    final boolean Jq;
    final int xM;

    GetDriveIdFromUniqueIdentifierRequest(int i, String s, boolean flag)
    {
        xM = i;
        Jp = s;
        Jq = flag;
    }

    public int describeContents()
    {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        y.a(this, parcel, i);
    }

}
