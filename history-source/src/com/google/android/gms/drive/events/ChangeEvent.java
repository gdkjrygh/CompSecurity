// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.drive.events;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.drive.DriveId;
import java.util.Locale;

// Referenced classes of package com.google.android.gms.drive.events:
//            ResourceEvent, a

public final class ChangeEvent
    implements SafeParcelable, ResourceEvent
{

    public static final android.os.Parcelable.Creator CREATOR = new a();
    final int CK;
    final int OX;
    final DriveId Oj;

    ChangeEvent(int i, DriveId driveid, int j)
    {
        CK = i;
        Oj = driveid;
        OX = j;
    }

    public int describeContents()
    {
        return 0;
    }

    public DriveId getDriveId()
    {
        return Oj;
    }

    public int getType()
    {
        return 1;
    }

    public boolean hasContentChanged()
    {
        return (OX & 2) != 0;
    }

    public boolean hasMetadataChanged()
    {
        return (OX & 1) != 0;
    }

    public String toString()
    {
        return String.format(Locale.US, "ChangeEvent [id=%s,changeFlags=%x]", new Object[] {
            Oj, Integer.valueOf(OX)
        });
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        a.a(this, parcel, i);
    }

}
