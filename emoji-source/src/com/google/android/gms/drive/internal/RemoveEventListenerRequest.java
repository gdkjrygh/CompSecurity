// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.drive.internal;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.drive.DriveId;

// Referenced classes of package com.google.android.gms.drive.internal:
//            au

public class RemoveEventListenerRequest
    implements SafeParcelable
{

    public static final android.os.Parcelable.Creator CREATOR = new au();
    final DriveId Hz;
    final int Iq;
    final int xM;

    RemoveEventListenerRequest(int i, DriveId driveid, int j)
    {
        xM = i;
        Hz = driveid;
        Iq = j;
    }

    public RemoveEventListenerRequest(DriveId driveid, int i)
    {
        this(1, driveid, i);
    }

    public int describeContents()
    {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        au.a(this, parcel, i);
    }

}
