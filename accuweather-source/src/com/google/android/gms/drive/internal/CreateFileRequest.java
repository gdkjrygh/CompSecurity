// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.drive.internal;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.drive.Contents;
import com.google.android.gms.drive.DriveId;
import com.google.android.gms.drive.metadata.internal.MetadataBundle;
import com.google.android.gms.internal.hn;

// Referenced classes of package com.google.android.gms.drive.internal:
//            j

public class CreateFileRequest
    implements SafeParcelable
{

    public static final android.os.Parcelable.Creator CREATOR = new j();
    final MetadataBundle IA;
    final Integer IB;
    final DriveId IC;
    final boolean IE;
    final Contents It;
    final String Iv;
    final int xJ;

    CreateFileRequest(int i, DriveId driveid, MetadataBundle metadatabundle, Contents contents, Integer integer, boolean flag, String s)
    {
        xJ = i;
        IC = (DriveId)hn.f(driveid);
        IA = (MetadataBundle)hn.f(metadatabundle);
        if (integer == null || integer.intValue() == 0)
        {
            It = (Contents)hn.f(contents);
        } else
        {
            It = null;
        }
        IB = integer;
        IE = flag;
        Iv = s;
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
