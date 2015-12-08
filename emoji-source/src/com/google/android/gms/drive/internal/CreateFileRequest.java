// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.drive.internal;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.drive.Contents;
import com.google.android.gms.drive.DriveId;
import com.google.android.gms.drive.metadata.internal.MetadataBundle;
import com.google.android.gms.internal.hm;

// Referenced classes of package com.google.android.gms.drive.internal:
//            j

public class CreateFileRequest
    implements SafeParcelable
{

    public static final android.os.Parcelable.Creator CREATOR = new j();
    final MetadataBundle IE;
    final Integer IF;
    final DriveId IG;
    final boolean IH;
    final Contents Iw;
    final String Iy;
    final int xM;

    CreateFileRequest(int i, DriveId driveid, MetadataBundle metadatabundle, Contents contents, Integer integer, boolean flag, String s)
    {
        xM = i;
        IG = (DriveId)hm.f(driveid);
        IE = (MetadataBundle)hm.f(metadatabundle);
        if (integer == null || integer.intValue() == 0)
        {
            Iw = (Contents)hm.f(contents);
        } else
        {
            Iw = null;
        }
        IF = integer;
        IH = flag;
        Iy = s;
    }

    public CreateFileRequest(DriveId driveid, MetadataBundle metadatabundle, Contents contents, int i, boolean flag, String s)
    {
        this(2, driveid, metadatabundle, contents, Integer.valueOf(i), flag, s);
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
