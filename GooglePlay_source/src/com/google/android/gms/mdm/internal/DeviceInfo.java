// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.mdm.internal;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

// Referenced classes of package com.google.android.gms.mdm.internal:
//            DeviceInfoCreator

public final class DeviceInfo
    implements SafeParcelable
{

    public static final android.os.Parcelable.Creator CREATOR = new DeviceInfoCreator();
    final String mModelName;
    final String mNickname;
    final int mVersionCode;

    DeviceInfo(int i, String s, String s1)
    {
        mVersionCode = i;
        mNickname = s;
        mModelName = s1;
    }

    public final int describeContents()
    {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i)
    {
        DeviceInfoCreator.writeToParcel$3faa3d67(this, parcel);
    }

}
