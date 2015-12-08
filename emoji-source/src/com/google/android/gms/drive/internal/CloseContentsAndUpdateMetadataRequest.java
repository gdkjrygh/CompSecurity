// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.drive.internal;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.drive.Contents;
import com.google.android.gms.drive.DriveId;
import com.google.android.gms.drive.metadata.internal.MetadataBundle;

// Referenced classes of package com.google.android.gms.drive.internal:
//            e

public class CloseContentsAndUpdateMetadataRequest
    implements SafeParcelable
{

    public static final android.os.Parcelable.Creator CREATOR = new e();
    final DriveId Iu;
    final MetadataBundle Iv;
    final Contents Iw;
    final boolean Ix;
    final String Iy;
    final int xM;

    CloseContentsAndUpdateMetadataRequest(int i, DriveId driveid, MetadataBundle metadatabundle, Contents contents, boolean flag, String s)
    {
        xM = i;
        Iu = driveid;
        Iv = metadatabundle;
        Iw = contents;
        Ix = flag;
        Iy = s;
    }

    public CloseContentsAndUpdateMetadataRequest(DriveId driveid, MetadataBundle metadatabundle, Contents contents, boolean flag, String s)
    {
        this(1, driveid, metadatabundle, contents, flag, s);
    }

    public int describeContents()
    {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        e.a(this, parcel, i);
    }

}
