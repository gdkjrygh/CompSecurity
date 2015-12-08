// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.drive.internal;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import java.util.List;

// Referenced classes of package com.google.android.gms.drive.internal:
//            GetPermissionsResponseCreator

public class GetPermissionsResponse
    implements SafeParcelable
{

    public static final android.os.Parcelable.Creator CREATOR = new GetPermissionsResponseCreator();
    final List mPermissionList;
    final int mResponseCode;
    final int mVersionCode;

    GetPermissionsResponse(int i, List list, int j)
    {
        mVersionCode = i;
        mPermissionList = list;
        mResponseCode = j;
    }

    public int describeContents()
    {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        GetPermissionsResponseCreator.writeToParcel$24269fd8(this, parcel);
    }

}
