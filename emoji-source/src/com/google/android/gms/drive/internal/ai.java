// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.drive.internal;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.a;
import com.google.android.gms.common.internal.safeparcel.b;
import com.google.android.gms.drive.DriveId;

// Referenced classes of package com.google.android.gms.drive.internal:
//            OnDriveIdResponse

public class ai
    implements android.os.Parcelable.Creator
{

    public ai()
    {
    }

    static void a(OnDriveIdResponse ondriveidresponse, Parcel parcel, int i)
    {
        int j = b.C(parcel);
        b.c(parcel, 1, ondriveidresponse.xM);
        b.a(parcel, 2, ondriveidresponse.Iu, i, false);
        b.G(parcel, j);
    }

    public OnDriveIdResponse aj(Parcel parcel)
    {
        int j = com.google.android.gms.common.internal.safeparcel.a.B(parcel);
        int i = 0;
        DriveId driveid = null;
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
                }
            } else
            if (parcel.dataPosition() != j)
            {
                throw new com.google.android.gms.common.internal.safeparcel.a.a((new StringBuilder()).append("Overread allowed size end=").append(j).toString(), parcel);
            } else
            {
                return new OnDriveIdResponse(i, driveid);
            }
        } while (true);
    }

    public OnDriveIdResponse[] bf(int i)
    {
        return new OnDriveIdResponse[i];
    }

    public Object createFromParcel(Parcel parcel)
    {
        return aj(parcel);
    }

    public Object[] newArray(int i)
    {
        return bf(i);
    }
}
