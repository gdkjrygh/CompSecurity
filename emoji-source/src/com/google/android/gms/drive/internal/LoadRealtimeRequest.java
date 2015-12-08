// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.drive.internal;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.drive.DriveId;

// Referenced classes of package com.google.android.gms.drive.internal:
//            ae

public class LoadRealtimeRequest
    implements SafeParcelable
{

    public static final android.os.Parcelable.Creator CREATOR = new ae();
    final DriveId Hz;
    final boolean Js;
    final int xM;

    LoadRealtimeRequest(int i, DriveId driveid, boolean flag)
    {
        xM = i;
        Hz = driveid;
        Js = flag;
    }

    public int describeContents()
    {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        ae.a(this, parcel, i);
    }

}
