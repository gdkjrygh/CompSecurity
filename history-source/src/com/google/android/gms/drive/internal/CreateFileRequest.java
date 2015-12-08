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
import com.google.android.gms.internal.jx;

// Referenced classes of package com.google.android.gms.drive.internal:
//            k

public class CreateFileRequest
    implements SafeParcelable
{

    public static final android.os.Parcelable.Creator CREATOR = new k();
    final int CK;
    final String Oy;
    final boolean PA;
    final int PB;
    final int PC;
    final Contents Pr;
    final MetadataBundle Px;
    final Integer Py;
    final DriveId Pz;

    CreateFileRequest(int i, DriveId driveid, MetadataBundle metadatabundle, Contents contents, Integer integer, boolean flag, String s, 
            int j, int l)
    {
        if (contents != null && l != 0)
        {
            boolean flag1;
            if (contents.getRequestId() == l)
            {
                flag1 = true;
            } else
            {
                flag1 = false;
            }
            jx.b(flag1, "inconsistent contents reference");
        }
        if ((integer == null || integer.intValue() == 0) && contents == null && l == 0)
        {
            throw new IllegalArgumentException("Need a valid contents");
        } else
        {
            CK = i;
            Pz = (DriveId)jx.i(driveid);
            Px = (MetadataBundle)jx.i(metadatabundle);
            Pr = contents;
            Py = integer;
            Oy = s;
            PB = j;
            PA = flag;
            PC = l;
            return;
        }
    }

    public CreateFileRequest(DriveId driveid, MetadataBundle metadatabundle, int i, int j, ExecutionOptions executionoptions)
    {
        this(2, driveid, metadatabundle, null, Integer.valueOf(j), executionoptions.iw(), executionoptions.iv(), executionoptions.ix(), i);
    }

    public int describeContents()
    {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        k.a(this, parcel, i);
    }

}
