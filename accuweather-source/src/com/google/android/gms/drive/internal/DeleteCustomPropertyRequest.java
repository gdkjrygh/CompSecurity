// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.drive.internal;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.drive.DriveId;
import com.google.android.gms.drive.metadata.CustomPropertyKey;

// Referenced classes of package com.google.android.gms.drive.internal:
//            m

public class DeleteCustomPropertyRequest
    implements SafeParcelable
{

    public static final android.os.Parcelable.Creator CREATOR = new m();
    final DriveId Hw;
    final CustomPropertyKey IG;
    final int xJ;

    DeleteCustomPropertyRequest(int i, DriveId driveid, CustomPropertyKey custompropertykey)
    {
        xJ = i;
        Hw = driveid;
        IG = custompropertykey;
    }

    public int describeContents()
    {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        m.a(this, parcel, i);
    }

}
