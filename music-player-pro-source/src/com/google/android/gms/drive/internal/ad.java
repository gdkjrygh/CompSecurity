// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.drive.internal;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.a;
import com.google.android.gms.common.internal.safeparcel.b;
import com.google.android.gms.drive.DriveId;

// Referenced classes of package com.google.android.gms.drive.internal:
//            GetMetadataRequest

public class ad
    implements android.os.Parcelable.Creator
{

    public ad()
    {
    }

    static void a(GetMetadataRequest getmetadatarequest, Parcel parcel, int i)
    {
        int j = b.H(parcel);
        b.c(parcel, 1, getmetadatarequest.CK);
        b.a(parcel, 2, getmetadatarequest.Pp, i, false);
        b.H(parcel, j);
    }

    public GetMetadataRequest an(Parcel parcel)
    {
        int j = com.google.android.gms.common.internal.safeparcel.a.G(parcel);
        int i = 0;
        DriveId driveid = null;
        do
        {
            if (parcel.dataPosition() < j)
            {
                int k = com.google.android.gms.common.internal.safeparcel.a.F(parcel);
                switch (com.google.android.gms.common.internal.safeparcel.a.aH(k))
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
                }
            } else
            if (parcel.dataPosition() != j)
            {
                throw new com.google.android.gms.common.internal.safeparcel.a.a((new StringBuilder()).append("Overread allowed size end=").append(j).toString(), parcel);
            } else
            {
                return new GetMetadataRequest(i, driveid);
            }
        } while (true);
    }

    public GetMetadataRequest[] bC(int i)
    {
        return new GetMetadataRequest[i];
    }

    public Object createFromParcel(Parcel parcel)
    {
        return an(parcel);
    }

    public Object[] newArray(int i)
    {
        return bC(i);
    }
}
