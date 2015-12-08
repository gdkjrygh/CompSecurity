// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.drive.internal;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.drive.Contents;
import com.google.android.gms.drive.DriveId;
import com.google.android.gms.drive.metadata.internal.MetadataBundle;
import com.google.android.gms.internal.gt;

// Referenced classes of package com.google.android.gms.drive.internal:
//            s

public class CreateFileRequest
    implements SafeParcelable
{

    public static final android.os.Parcelable.Creator CREATOR = new s();
    final int a;
    final DriveId b;
    final MetadataBundle c;
    final Contents d;

    CreateFileRequest(int i, DriveId driveid, MetadataBundle metadatabundle, Contents contents)
    {
        a = i;
        b = (DriveId)gt.a(driveid);
        c = (MetadataBundle)gt.a(metadatabundle);
        d = (Contents)gt.a(contents);
    }

    public int describeContents()
    {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        s.a(this, parcel, i);
    }

}
