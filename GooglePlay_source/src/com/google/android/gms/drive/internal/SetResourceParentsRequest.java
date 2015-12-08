// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.drive.internal;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.drive.DriveId;
import java.util.List;

// Referenced classes of package com.google.android.gms.drive.internal:
//            SetResourceParentsRequestCreator

public class SetResourceParentsRequest
    implements SafeParcelable
{

    public static final android.os.Parcelable.Creator CREATOR = new SetResourceParentsRequestCreator();
    final List mParentIds;
    final DriveId mTargetId;
    final int mVersionCode;

    SetResourceParentsRequest(int i, DriveId driveid, List list)
    {
        mVersionCode = i;
        mTargetId = driveid;
        mParentIds = list;
    }

    public int describeContents()
    {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        SetResourceParentsRequestCreator.writeToParcel(this, parcel, i);
    }

}
