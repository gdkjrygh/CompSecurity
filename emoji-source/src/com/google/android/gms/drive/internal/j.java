// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.drive.internal;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.a;
import com.google.android.gms.common.internal.safeparcel.b;
import com.google.android.gms.drive.Contents;
import com.google.android.gms.drive.DriveId;
import com.google.android.gms.drive.metadata.internal.MetadataBundle;

// Referenced classes of package com.google.android.gms.drive.internal:
//            CreateFileRequest

public class j
    implements android.os.Parcelable.Creator
{

    public j()
    {
    }

    static void a(CreateFileRequest createfilerequest, Parcel parcel, int i)
    {
        int k = b.C(parcel);
        b.c(parcel, 1, createfilerequest.xM);
        b.a(parcel, 2, createfilerequest.IG, i, false);
        b.a(parcel, 3, createfilerequest.IE, i, false);
        b.a(parcel, 4, createfilerequest.Iw, i, false);
        b.a(parcel, 5, createfilerequest.IF, false);
        b.a(parcel, 6, createfilerequest.IH);
        b.a(parcel, 7, createfilerequest.Iy, false);
        b.G(parcel, k);
    }

    public CreateFileRequest Y(Parcel parcel)
    {
        boolean flag = false;
        String s = null;
        int k = com.google.android.gms.common.internal.safeparcel.a.B(parcel);
        Integer integer = null;
        Contents contents = null;
        MetadataBundle metadatabundle = null;
        DriveId driveid = null;
        int i = 0;
        do
        {
            if (parcel.dataPosition() < k)
            {
                int l = com.google.android.gms.common.internal.safeparcel.a.A(parcel);
                switch (com.google.android.gms.common.internal.safeparcel.a.ar(l))
                {
                default:
                    com.google.android.gms.common.internal.safeparcel.a.b(parcel, l);
                    break;

                case 1: // '\001'
                    i = com.google.android.gms.common.internal.safeparcel.a.g(parcel, l);
                    break;

                case 2: // '\002'
                    driveid = (DriveId)com.google.android.gms.common.internal.safeparcel.a.a(parcel, l, DriveId.CREATOR);
                    break;

                case 3: // '\003'
                    metadatabundle = (MetadataBundle)com.google.android.gms.common.internal.safeparcel.a.a(parcel, l, MetadataBundle.CREATOR);
                    break;

                case 4: // '\004'
                    contents = (Contents)com.google.android.gms.common.internal.safeparcel.a.a(parcel, l, Contents.CREATOR);
                    break;

                case 5: // '\005'
                    integer = com.google.android.gms.common.internal.safeparcel.a.h(parcel, l);
                    break;

                case 6: // '\006'
                    flag = com.google.android.gms.common.internal.safeparcel.a.c(parcel, l);
                    break;

                case 7: // '\007'
                    s = com.google.android.gms.common.internal.safeparcel.a.o(parcel, l);
                    break;
                }
            } else
            if (parcel.dataPosition() != k)
            {
                throw new com.google.android.gms.common.internal.safeparcel.a.a((new StringBuilder()).append("Overread allowed size end=").append(k).toString(), parcel);
            } else
            {
                return new CreateFileRequest(i, driveid, metadatabundle, contents, integer, flag, s);
            }
        } while (true);
    }

    public CreateFileRequest[] aU(int i)
    {
        return new CreateFileRequest[i];
    }

    public Object createFromParcel(Parcel parcel)
    {
        return Y(parcel);
    }

    public Object[] newArray(int i)
    {
        return aU(i);
    }
}
