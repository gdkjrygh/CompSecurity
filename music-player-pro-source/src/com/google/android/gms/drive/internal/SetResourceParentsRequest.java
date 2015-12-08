// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.drive.internal;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.drive.DriveId;
import java.util.List;

// Referenced classes of package com.google.android.gms.drive.internal:
//            bf

public class SetResourceParentsRequest
    implements SafeParcelable
{

    public static final android.os.Parcelable.Creator CREATOR = new bf();
    final int CK;
    final DriveId QW;
    final List QX;

    SetResourceParentsRequest(int i, DriveId driveid, List list)
    {
        CK = i;
        QW = driveid;
        QX = list;
    }

    public SetResourceParentsRequest(DriveId driveid, List list)
    {
        this(1, driveid, list);
    }

    public int describeContents()
    {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        bf.a(this, parcel, i);
    }

}
