// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.drive.internal;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.a;
import com.google.android.gms.common.internal.safeparcel.b;
import com.google.android.gms.drive.DriveId;

// Referenced classes of package com.google.android.gms.drive.internal:
//            TrashResourceRequest

public class am
    implements android.os.Parcelable.Creator
{

    public am()
    {
    }

    static void a(TrashResourceRequest trashresourcerequest, Parcel parcel, int i)
    {
        int j = b.p(parcel);
        b.c(parcel, 1, trashresourcerequest.xH);
        b.a(parcel, 2, trashresourcerequest.EV, i, false);
        b.F(parcel, j);
    }

    public TrashResourceRequest Z(Parcel parcel)
    {
        int j = com.google.android.gms.common.internal.safeparcel.a.o(parcel);
        int i = 0;
        DriveId driveid = null;
        do
        {
            if (parcel.dataPosition() < j)
            {
                int k = com.google.android.gms.common.internal.safeparcel.a.n(parcel);
                switch (com.google.android.gms.common.internal.safeparcel.a.R(k))
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
                return new TrashResourceRequest(i, driveid);
            }
        } while (true);
    }

    public TrashResourceRequest[] aD(int i)
    {
        return new TrashResourceRequest[i];
    }

    public Object createFromParcel(Parcel parcel)
    {
        return Z(parcel);
    }

    public Object[] newArray(int i)
    {
        return aD(i);
    }
}
