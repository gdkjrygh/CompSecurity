// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.drive.internal;

import android.app.PendingIntent;
import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.drive.DriveId;

// Referenced classes of package com.google.android.gms.drive.internal:
//            a

public class AddEventListenerRequest
    implements SafeParcelable
{

    public static final android.os.Parcelable.Creator CREATOR = new a();
    final DriveId Hz;
    final int Iq;
    final PendingIntent Ir;
    final int xM;

    AddEventListenerRequest(int i, DriveId driveid, int j, PendingIntent pendingintent)
    {
        xM = i;
        Hz = driveid;
        Iq = j;
        Ir = pendingintent;
    }

    public AddEventListenerRequest(DriveId driveid, int i, PendingIntent pendingintent)
    {
        this(1, driveid, i, pendingintent);
    }

    public int describeContents()
    {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        a.a(this, parcel, i);
    }

}
