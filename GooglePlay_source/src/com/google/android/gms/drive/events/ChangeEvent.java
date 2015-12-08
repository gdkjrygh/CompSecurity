// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.drive.events;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.drive.DriveId;
import java.util.Locale;

// Referenced classes of package com.google.android.gms.drive.events:
//            ResourceEvent, ChangeEventCreator

public final class ChangeEvent
    implements SafeParcelable, ResourceEvent
{

    public static final android.os.Parcelable.Creator CREATOR = new ChangeEventCreator();
    final int mChangeFlags;
    final DriveId mDriveId;
    final int mVersionCode;

    ChangeEvent(int i, DriveId driveid, int j)
    {
        mVersionCode = i;
        mDriveId = driveid;
        mChangeFlags = j;
    }

    public final int describeContents()
    {
        return 0;
    }

    public final int getType()
    {
        return 1;
    }

    public final String toString()
    {
        return String.format(Locale.US, "ChangeEvent [id=%s,changeFlags=%x]", new Object[] {
            mDriveId, Integer.valueOf(mChangeFlags)
        });
    }

    public final void writeToParcel(Parcel parcel, int i)
    {
        ChangeEventCreator.writeToParcel(this, parcel, i);
    }

}
