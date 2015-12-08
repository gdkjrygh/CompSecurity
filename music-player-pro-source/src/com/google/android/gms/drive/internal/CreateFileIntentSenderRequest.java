// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.drive.internal;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.drive.DriveId;
import com.google.android.gms.drive.metadata.internal.MetadataBundle;

// Referenced classes of package com.google.android.gms.drive.internal:
//            j

public class CreateFileIntentSenderRequest
    implements SafeParcelable
{

    public static final android.os.Parcelable.Creator CREATOR = new j();
    final int CK;
    final String OH;
    final DriveId OJ;
    final MetadataBundle Px;
    final Integer Py;
    final int ve;

    CreateFileIntentSenderRequest(int i, MetadataBundle metadatabundle, int k, String s, DriveId driveid, Integer integer)
    {
        CK = i;
        Px = metadatabundle;
        ve = k;
        OH = s;
        OJ = driveid;
        Py = integer;
    }

    public CreateFileIntentSenderRequest(MetadataBundle metadatabundle, int i, String s, DriveId driveid, int k)
    {
        this(1, metadatabundle, i, s, driveid, Integer.valueOf(k));
    }

    public int describeContents()
    {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        j.a(this, parcel, i);
    }

}
