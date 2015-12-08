// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.drive.internal;

import android.os.Parcel;
import com.google.android.gms.common.internal.o;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.drive.Contents;
import com.google.android.gms.drive.DriveId;
import com.google.android.gms.drive.ExecutionOptions;
import com.google.android.gms.drive.metadata.internal.MetadataBundle;

// Referenced classes of package com.google.android.gms.drive.internal:
//            j

public class CreateFileRequest
    implements SafeParcelable
{

    public static final android.os.Parcelable.Creator CREATOR = new j();
    final int BR;
    final String Nn;
    final Contents Of;
    final MetadataBundle Ol;
    final Integer Om;
    final DriveId On;
    final boolean Oo;
    final int Op;
    final int Oq;

    CreateFileRequest(int i, DriveId driveid, MetadataBundle metadatabundle, Contents contents, Integer integer, boolean flag, String s, 
            int k, int l)
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
            o.b(flag1, "inconsistent contents reference");
        }
        if ((integer == null || integer.intValue() == 0) && contents == null && l == 0)
        {
            throw new IllegalArgumentException("Need a valid contents");
        } else
        {
            BR = i;
            On = (DriveId)o.i(driveid);
            Ol = (MetadataBundle)o.i(metadatabundle);
            Of = contents;
            Om = integer;
            Nn = s;
            Op = k;
            Oo = flag;
            Oq = l;
            return;
        }
    }

    public CreateFileRequest(DriveId driveid, MetadataBundle metadatabundle, int i, int k, ExecutionOptions executionoptions)
    {
        this(2, driveid, metadatabundle, null, Integer.valueOf(k), executionoptions.hP(), executionoptions.hO(), executionoptions.hQ(), i);
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
