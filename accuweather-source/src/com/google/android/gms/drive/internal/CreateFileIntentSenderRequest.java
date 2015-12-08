// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.drive.internal;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.drive.DriveId;
import com.google.android.gms.drive.metadata.internal.MetadataBundle;

// Referenced classes of package com.google.android.gms.drive.internal:
//            i

public class CreateFileIntentSenderRequest
    implements SafeParcelable
{

    public static final android.os.Parcelable.Creator CREATOR = new i();
    final String HV;
    final DriveId HX;
    final MetadataBundle IA;
    final Integer IB;
    final int qX;
    final int xJ;

    CreateFileIntentSenderRequest(int j, MetadataBundle metadatabundle, int k, String s, DriveId driveid, Integer integer)
    {
        xJ = j;
        IA = metadatabundle;
        qX = k;
        HV = s;
        HX = driveid;
        IB = integer;
    }

    public CreateFileIntentSenderRequest(MetadataBundle metadatabundle, int j, String s, DriveId driveid, int k)
    {
        this(1, metadatabundle, j, s, driveid, Integer.valueOf(k));
    }

    public int describeContents()
    {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int j)
    {
        i.a(this, parcel, j);
    }

}
