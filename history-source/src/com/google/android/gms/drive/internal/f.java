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

public class f
    implements android.os.Parcelable.Creator
{

    public f()
    {
    }

    static void a(CloseContentsAndUpdateMetadataRequest closecontentsandupdatemetadatarequest, Parcel parcel, int i)
    {
        int j = b.H(parcel);
        b.c(parcel, 1, closecontentsandupdatemetadatarequest.CK);
        b.a(parcel, 2, closecontentsandupdatemetadatarequest.Pp, i, false);
        b.a(parcel, 3, closecontentsandupdatemetadatarequest.Pq, i, false);
        b.a(parcel, 4, closecontentsandupdatemetadatarequest.Pr, i, false);
        b.a(parcel, 5, closecontentsandupdatemetadatarequest.Oz);
        b.a(parcel, 6, closecontentsandupdatemetadatarequest.Oy, false);
        b.c(parcel, 7, closecontentsandupdatemetadatarequest.Ps);
        b.H(parcel, j);
    }

    public CloseContentsAndUpdateMetadataRequest ad(Parcel parcel)
    {
        int i = 0;
        String s = null;
        int k = com.google.android.gms.common.internal.safeparcel.a.G(parcel);
        boolean flag = false;
        Contents contents = null;
        MetadataBundle metadatabundle = null;
        DriveId driveid = null;
        int j = 0;
        do
        {
            if (parcel.dataPosition() < k)
            {
                int l = com.google.android.gms.common.internal.safeparcel.a.F(parcel);
                switch (com.google.android.gms.common.internal.safeparcel.a.aH(l))
                {
                default:
                    com.google.android.gms.common.internal.safeparcel.a.b(parcel, l);
                    break;

                case 1: // '\001'
                    j = com.google.android.gms.common.internal.safeparcel.a.g(parcel, l);
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
                    flag = com.google.android.gms.common.internal.safeparcel.a.c(parcel, l);
                    break;

                case 6: // '\006'
                    s = com.google.android.gms.common.internal.safeparcel.a.o(parcel, l);
                    break;

                case 7: // '\007'
                    i = com.google.android.gms.common.internal.safeparcel.a.g(parcel, l);
                    break;
                }
            } else
            if (parcel.dataPosition() != k)
            {
                throw new com.google.android.gms.common.internal.safeparcel.a.a((new StringBuilder()).append("Overread allowed size end=").append(k).toString(), parcel);
            } else
            {
                return new CloseContentsAndUpdateMetadataRequest(j, driveid, metadatabundle, contents, flag, s, i);
            }
        } while (true);
    }

    public CloseContentsAndUpdateMetadataRequest[] bn(int i)
    {
        return new CloseContentsAndUpdateMetadataRequest[i];
    }

    public Object createFromParcel(Parcel parcel)
    {
        return ad(parcel);
    }

    public Object[] newArray(int i)
    {
        return bn(i);
    }
}
