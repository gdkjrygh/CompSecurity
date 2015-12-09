// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.drive.internal;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.drive.DriveId;
import java.util.List;

// Referenced classes of package com.google.android.gms.drive.internal:
//            ChangeResourceParentsRequestCreator

public class ChangeResourceParentsRequest
    implements SafeParcelable
{

    public static final android.os.Parcelable.Creator CREATOR = new ChangeResourceParentsRequestCreator();
    final List mParentIdsToAdd;
    final List mParentIdsToRemove;
    final DriveId mTargetId;
    final int mVersionCode;

    ChangeResourceParentsRequest(int i, DriveId driveid, List list, List list1)
    {
        mVersionCode = i;
        mTargetId = driveid;
        mParentIdsToAdd = list;
        mParentIdsToRemove = list1;
    }

    public int describeContents()
    {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        ChangeResourceParentsRequestCreator.writeToParcel(this, parcel, i);
    }

}
