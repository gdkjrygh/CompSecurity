// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.drive.internal;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.a;
import com.google.android.gms.common.internal.safeparcel.b;
import com.google.android.gms.drive.DriveId;
import com.google.android.gms.drive.metadata.internal.MetadataBundle;

// Referenced classes of package com.google.android.gms.drive.internal:
//            CreateFolderRequest

public class i
    implements android.os.Parcelable.Creator
{

    public i()
    {
    }

    static void a(CreateFolderRequest createfolderrequest, Parcel parcel, int j)
    {
        int k = b.p(parcel);
        b.c(parcel, 1, createfolderrequest.xH);
        b.a(parcel, 2, createfolderrequest.Fa, j, false);
        b.a(parcel, 3, createfolderrequest.EZ, j, false);
        b.F(parcel, k);
    }

    public CreateFolderRequest J(Parcel parcel)
    {
        MetadataBundle metadatabundle = null;
        int k = com.google.android.gms.common.internal.safeparcel.a.o(parcel);
        int j = 0;
        DriveId driveid = null;
        do
        {
            if (parcel.dataPosition() < k)
            {
                int l = com.google.android.gms.common.internal.safeparcel.a.n(parcel);
                switch (com.google.android.gms.common.internal.safeparcel.a.R(l))
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
                }
            } else
            if (parcel.dataPosition() != k)
            {
                throw new com.google.android.gms.common.internal.safeparcel.a.a((new StringBuilder()).append("Overread allowed size end=").append(k).toString(), parcel);
            } else
            {
                return new CreateFolderRequest(j, driveid, metadatabundle);
            }
        } while (true);
    }

    public CreateFolderRequest[] an(int j)
    {
        return new CreateFolderRequest[j];
    }

    public Object createFromParcel(Parcel parcel)
    {
        return J(parcel);
    }

    public Object[] newArray(int j)
    {
        return an(j);
    }
}
