// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.drive;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

// Referenced classes of package com.google.android.gms.drive:
//            DrivePreferencesCreator

public class DrivePreferences
    implements SafeParcelable
{

    public static final android.os.Parcelable.Creator CREATOR = new DrivePreferencesCreator();
    final boolean mSyncOverWifiOnly;
    final int mVersionCode;

    DrivePreferences(int i, boolean flag)
    {
        mVersionCode = i;
        mSyncOverWifiOnly = flag;
    }

    public int describeContents()
    {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        DrivePreferencesCreator.writeToParcel$2d14f4c5(this, parcel);
    }

}
