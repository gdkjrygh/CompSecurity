// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.drive.events;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.drive.DriveId;

// Referenced classes of package com.google.android.gms.drive.events:
//            ResourceEvent, a

public final class ChangeEvent
    implements SafeParcelable, ResourceEvent
{

    public static final android.os.Parcelable.Creator CREATOR = new a();
    final int ER;
    final DriveId Ew;
    final int xH;

    ChangeEvent(int i, DriveId driveid, int j)
    {
        xH = i;
        Ew = driveid;
        ER = j;
    }

    public int describeContents()
    {
        return 0;
    }

    public DriveId getDriveId()
    {
        return Ew;
    }

    public int getType()
    {
        return 1;
    }

    public boolean hasContentChanged()
    {
        return (ER & 2) != 0;
    }

    public boolean hasMetadataChanged()
    {
        return (ER & 1) != 0;
    }

    public String toString()
    {
        return String.format("ChangeEvent [id=%s,changeFlags=%x]", new Object[] {
            Ew, Integer.valueOf(ER)
        });
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        a.a(this, parcel, i);
    }

}
