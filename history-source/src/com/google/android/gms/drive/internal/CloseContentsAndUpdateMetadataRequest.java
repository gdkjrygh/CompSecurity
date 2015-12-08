// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.drive.internal;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.drive.Contents;
import com.google.android.gms.drive.DriveId;
import com.google.android.gms.drive.ExecutionOptions;
import com.google.android.gms.drive.metadata.internal.MetadataBundle;

// Referenced classes of package com.google.android.gms.drive.internal:
//            f

public class CloseContentsAndUpdateMetadataRequest
    implements SafeParcelable
{

    public static final android.os.Parcelable.Creator CREATOR = new f();
    final int CK;
    final String Oy;
    final boolean Oz;
    final DriveId Pp;
    final MetadataBundle Pq;
    final Contents Pr;
    final int Ps;

    CloseContentsAndUpdateMetadataRequest(int i, DriveId driveid, MetadataBundle metadatabundle, Contents contents, boolean flag, String s, int j)
    {
        CK = i;
        Pp = driveid;
        Pq = metadatabundle;
        Pr = contents;
        Oz = flag;
        Oy = s;
        Ps = j;
    }

    public CloseContentsAndUpdateMetadataRequest(DriveId driveid, MetadataBundle metadatabundle, Contents contents, ExecutionOptions executionoptions)
    {
        this(1, driveid, metadatabundle, contents, executionoptions.iw(), executionoptions.iv(), executionoptions.ix());
    }

    public int describeContents()
    {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        f.a(this, parcel, i);
    }

}
