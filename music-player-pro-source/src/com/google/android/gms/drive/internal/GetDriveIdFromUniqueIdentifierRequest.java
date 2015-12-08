// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.drive.internal;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

// Referenced classes of package com.google.android.gms.drive.internal:
//            ac

public class GetDriveIdFromUniqueIdentifierRequest
    implements SafeParcelable
{

    public static final android.os.Parcelable.Creator CREATOR = new ac();
    final int CK;
    final String QC;
    final boolean QD;

    GetDriveIdFromUniqueIdentifierRequest(int i, String s, boolean flag)
    {
        CK = i;
        QC = s;
        QD = flag;
    }

    public int describeContents()
    {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        ac.a(this, parcel, i);
    }

}
