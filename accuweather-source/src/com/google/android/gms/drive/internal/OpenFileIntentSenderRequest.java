// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.drive.internal;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.drive.DriveId;

// Referenced classes of package com.google.android.gms.drive.internal:
//            as

public class OpenFileIntentSenderRequest
    implements SafeParcelable
{

    public static final android.os.Parcelable.Creator CREATOR = new as();
    final String HV;
    final String HW[];
    final DriveId HX;
    final int xJ;

    OpenFileIntentSenderRequest(int i, String s, String as1[], DriveId driveid)
    {
        xJ = i;
        HV = s;
        HW = as1;
        HX = driveid;
    }

    public OpenFileIntentSenderRequest(String s, String as1[], DriveId driveid)
    {
        this(1, s, as1, driveid);
    }

    public int describeContents()
    {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        as.a(this, parcel, i);
    }

}
