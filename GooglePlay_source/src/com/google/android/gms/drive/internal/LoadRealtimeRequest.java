// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.drive.internal;

import android.os.Parcel;
import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.drive.DriveId;
import java.util.List;

// Referenced classes of package com.google.android.gms.drive.internal:
//            LoadRealtimeRequestCreator

public class LoadRealtimeRequest
    implements SafeParcelable
{

    public static final android.os.Parcelable.Creator CREATOR = new LoadRealtimeRequestCreator();
    final List mCustomTypeWhitelist;
    final DriveId mDriveId;
    final boolean mIsInMemory;
    final DataHolder mJson;
    final String mLocalId;
    final boolean mUseTestMode;
    final int mVersionCode;

    LoadRealtimeRequest(int i, DriveId driveid, boolean flag, List list, boolean flag1, DataHolder dataholder, String s)
    {
        mVersionCode = i;
        mDriveId = driveid;
        mUseTestMode = flag;
        mCustomTypeWhitelist = list;
        mIsInMemory = flag1;
        mJson = dataholder;
        mLocalId = s;
    }

    public int describeContents()
    {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        LoadRealtimeRequestCreator.writeToParcel(this, parcel, i);
    }

}
