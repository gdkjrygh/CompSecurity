// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.drive.internal;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.drive.DrivePreferences;

// Referenced classes of package com.google.android.gms.drive.internal:
//            OnDrivePreferencesResponseCreator

public class OnDrivePreferencesResponse
    implements SafeParcelable
{

    public static final android.os.Parcelable.Creator CREATOR = new OnDrivePreferencesResponseCreator();
    DrivePreferences mPrefs;
    final int mVersionCode;

    OnDrivePreferencesResponse(int i, DrivePreferences drivepreferences)
    {
        mVersionCode = i;
        mPrefs = drivepreferences;
    }

    public int describeContents()
    {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        OnDrivePreferencesResponseCreator.writeToParcel(this, parcel, i);
    }

}
