// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.drive.internal;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.drive.DriveId;

// Referenced classes of package com.google.android.gms.drive.internal:
//            aw

public class OpenFileIntentSenderRequest
    implements SafeParcelable
{

    public static final android.os.Parcelable.Creator CREATOR = new aw();
    final int BR;
    final String Nw;
    final String Nx[];
    final DriveId Ny;

    OpenFileIntentSenderRequest(int i, String s, String as[], DriveId driveid)
    {
        BR = i;
        Nw = s;
        Nx = as;
        Ny = driveid;
    }

    public OpenFileIntentSenderRequest(String s, String as[], DriveId driveid)
    {
        this(1, s, as, driveid);
    }

    public int describeContents()
    {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        aw.a(this, parcel, i);
    }

}
