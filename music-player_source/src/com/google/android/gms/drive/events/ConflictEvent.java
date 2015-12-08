// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.drive.events;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.drive.DriveId;

// Referenced classes of package com.google.android.gms.drive.events:
//            DriveEvent, b

public final class ConflictEvent
    implements SafeParcelable, DriveEvent
{

    public static final android.os.Parcelable.Creator CREATOR = new b();
    final int a;
    final DriveId b;

    ConflictEvent(int i, DriveId driveid)
    {
        a = i;
        b = driveid;
    }

    public final int describeContents()
    {
        return 0;
    }

    public final String toString()
    {
        return String.format("ConflictEvent [id=%s]", new Object[] {
            b
        });
    }

    public final void writeToParcel(Parcel parcel, int i)
    {
        com.google.android.gms.drive.events.b.a(this, parcel, i);
    }

}
