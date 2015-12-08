// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.drive.events;

import android.os.Parcel;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import java.util.Arrays;
import java.util.Locale;

// Referenced classes of package com.google.android.gms.drive.events:
//            DriveEvent, ChangesAvailableEventCreator, ChangesAvailableOptions

public final class ChangesAvailableEvent
    implements SafeParcelable, DriveEvent
{

    public static final android.os.Parcelable.Creator CREATOR = new ChangesAvailableEventCreator();
    final String mAccountName;
    final ChangesAvailableOptions mChangesAvailableOptions;
    final int mVersionCode;

    ChangesAvailableEvent(int i, String s, ChangesAvailableOptions changesavailableoptions)
    {
        mVersionCode = i;
        mAccountName = s;
        mChangesAvailableOptions = changesavailableoptions;
    }

    public final int describeContents()
    {
        return 0;
    }

    public final boolean equals(Object obj)
    {
        boolean flag1 = true;
        if (obj != null && obj.getClass() == getClass()) goto _L2; else goto _L1
_L1:
        boolean flag = false;
_L4:
        return flag;
_L2:
        flag = flag1;
        if (obj == this) goto _L4; else goto _L3
_L3:
        obj = (ChangesAvailableEvent)obj;
        if (!Objects.equal(mChangesAvailableOptions, ((ChangesAvailableEvent) (obj)).mChangesAvailableOptions))
        {
            break; /* Loop/switch isn't completed */
        }
        flag = flag1;
        if (Objects.equal(mAccountName, ((ChangesAvailableEvent) (obj)).mAccountName)) goto _L4; else goto _L5
_L5:
        return false;
    }

    public final int getType()
    {
        return 4;
    }

    public final int hashCode()
    {
        return Arrays.hashCode(new Object[] {
            mChangesAvailableOptions, mAccountName
        });
    }

    public final String toString()
    {
        return String.format(Locale.US, "ChangesAvailableEvent [changesAvailableOptions=%s]", new Object[] {
            mChangesAvailableOptions
        });
    }

    public final void writeToParcel(Parcel parcel, int i)
    {
        ChangesAvailableEventCreator.writeToParcel(this, parcel, i);
    }

}
