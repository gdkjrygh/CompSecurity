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
//            CloseContentsAndUpdateMetadataRequest

public class e
    implements android.os.Parcelable.Creator
{

    public e()
    {
    }

    static void a(CloseContentsAndUpdateMetadataRequest closecontentsandupdatemetadatarequest, Parcel parcel, int i)
    {
        int j = b.C(parcel);
        b.c(parcel, 1, closecontentsandupdatemetadatarequest.xM);
        b.a(parcel, 2, closecontentsandupdatemetadatarequest.Iu, i, false);
        b.a(parcel, 3, closecontentsandupdatemetadatarequest.Iv, i, false);
        b.a(parcel, 4, closecontentsandupdatemetadatarequest.Iw, i, false);
        b.a(parcel, 5, closecontentsandupdatemetadatarequest.Ix);
        b.a(parcel, 6, closecontentsandupdatemetadatarequest.Iy, false);
        b.G(parcel, j);
    }

    public CloseContentsAndUpdateMetadataRequest U(Parcel parcel)
    {
        boolean flag = false;
        String s = null;
        int j = com.google.android.gms.common.internal.safeparcel.a.B(parcel);
        Contents contents = null;
        MetadataBundle metadatabundle = null;
        DriveId driveid = null;
        int i = 0;
        do
        {
            if (parcel.dataPosition() < j)
            {
                int k = com.google.android.gms.common.internal.safeparcel.a.A(parcel);
                switch (com.google.android.gms.common.internal.safeparcel.a.ar(k))
                {
                default:
                    com.google.android.gms.common.internal.safeparcel.a.b(parcel, k);
                    break;

                case 1: // '\001'
                    i = com.google.android.gms.common.internal.safeparcel.a.g(parcel, k);
                    break;

                case 2: // '\002'
                    driveid = (DriveId)com.google.android.gms.common.internal.safeparcel.a.a(parcel, k, DriveId.CREATOR);
                    break;

                case 3: // '\003'
                    metadatabundle = (MetadataBundle)com.google.android.gms.common.internal.safeparcel.a.a(parcel, k, MetadataBundle.CREATOR);
                    break;

                case 4: // '\004'
                    contents = (Contents)com.google.android.gms.common.internal.safeparcel.a.a(parcel, k, Contents.CREATOR);
                    break;

                case 5: // '\005'
                    flag = com.google.android.gms.common.internal.safeparcel.a.c(parcel, k);
                    break;

                case 6: // '\006'
                    s = com.google.android.gms.common.internal.safeparcel.a.o(parcel, k);
                    break;
                }
            } else
            if (parcel.dataPosition() != j)
            {
                throw new com.google.android.gms.common.internal.safeparcel.a.a((new StringBuilder()).append("Overread allowed size end=").append(j).toString(), parcel);
            } else
            {
                return new CloseContentsAndUpdateMetadataRequest(i, driveid, metadatabundle, contents, flag, s);
            }
        } while (true);
    }

    public CloseContentsAndUpdateMetadataRequest[] aP(int i)
    {
        return new CloseContentsAndUpdateMetadataRequest[i];
    }

    public Object createFromParcel(Parcel parcel)
    {
        return U(parcel);
    }

    public Object[] newArray(int i)
    {
        return aP(i);
    }
}
