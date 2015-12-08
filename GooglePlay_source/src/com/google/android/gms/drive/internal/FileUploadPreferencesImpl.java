// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.drive.internal;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

// Referenced classes of package com.google.android.gms.drive.internal:
//            FileUploadPreferencesImplCreator

public final class FileUploadPreferencesImpl
    implements SafeParcelable
{

    public static final android.os.Parcelable.Creator CREATOR = new FileUploadPreferencesImplCreator();
    boolean mAllowRoaming;
    int mBatteryUsagePreference;
    int mNetworkTypePreference;
    final int mVersionCode;

    FileUploadPreferencesImpl(int i, int j, int k, boolean flag)
    {
        mVersionCode = i;
        mNetworkTypePreference = j;
        mBatteryUsagePreference = k;
        mAllowRoaming = flag;
    }

    public final int describeContents()
    {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i)
    {
        FileUploadPreferencesImplCreator.writeToParcel$25ee2196(this, parcel);
    }

}
