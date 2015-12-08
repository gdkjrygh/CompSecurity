// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.drive.internal;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.a;
import com.google.android.gms.common.internal.safeparcel.b;
import com.google.android.gms.drive.DriveId;

// Referenced classes of package com.google.android.gms.drive.internal:
//            OpenContentsRequest

public class ay
    implements android.os.Parcelable.Creator
{

    public ay()
    {
    }

    static void a(OpenContentsRequest opencontentsrequest, Parcel parcel, int i)
    {
        int j = b.H(parcel);
        b.c(parcel, 1, opencontentsrequest.CK);
        b.a(parcel, 2, opencontentsrequest.Pp, i, false);
        b.c(parcel, 3, opencontentsrequest.Oi);
        b.c(parcel, 4, opencontentsrequest.QT);
        b.H(parcel, j);
    }

    public OpenContentsRequest aD(Parcel parcel)
    {
        int i = 0;
        int l = com.google.android.gms.common.internal.safeparcel.a.G(parcel);
        DriveId driveid = null;
        int j = 0;
        int k = 0;
        do
        {
            if (parcel.dataPosition() < l)
            {
                int i1 = com.google.android.gms.common.internal.safeparcel.a.F(parcel);
                switch (com.google.android.gms.common.internal.safeparcel.a.aH(i1))
                {
                default:
                    com.google.android.gms.common.internal.safeparcel.a.b(parcel, i1);
                    break;

                case 1: // '\001'
                    k = com.google.android.gms.common.internal.safeparcel.a.g(parcel, i1);
                    break;

                case 2: // '\002'
                    driveid = (DriveId)com.google.android.gms.common.internal.safeparcel.a.a(parcel, i1, DriveId.CREATOR);
                    break;

                case 3: // '\003'
                    j = com.google.android.gms.common.internal.safeparcel.a.g(parcel, i1);
                    break;

                case 4: // '\004'
                    i = com.google.android.gms.common.internal.safeparcel.a.g(parcel, i1);
                    break;
                }
            } else
            if (parcel.dataPosition() != l)
            {
                throw new com.google.android.gms.common.internal.safeparcel.a.a((new StringBuilder()).append("Overread allowed size end=").append(l).toString(), parcel);
            } else
            {
                return new OpenContentsRequest(k, driveid, j, i);
            }
        } while (true);
    }

    public OpenContentsRequest[] bS(int i)
    {
        return new OpenContentsRequest[i];
    }

    public Object createFromParcel(Parcel parcel)
    {
        return aD(parcel);
    }

    public Object[] newArray(int i)
    {
        return bS(i);
    }
}
