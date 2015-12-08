// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.drive.internal;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.a;
import com.google.android.gms.common.internal.safeparcel.b;
import com.google.android.gms.drive.DriveId;

// Referenced classes of package com.google.android.gms.drive.internal:
//            OpenFileIntentSenderRequest

public class ai
    implements android.os.Parcelable.Creator
{

    public ai()
    {
    }

    static void a(OpenFileIntentSenderRequest openfileintentsenderrequest, Parcel parcel, int i)
    {
        int j = b.p(parcel);
        b.c(parcel, 1, openfileintentsenderrequest.xH);
        b.a(parcel, 2, openfileintentsenderrequest.EB, false);
        b.a(parcel, 3, openfileintentsenderrequest.EQ, false);
        b.a(parcel, 4, openfileintentsenderrequest.EC, i, false);
        b.F(parcel, j);
    }

    public OpenFileIntentSenderRequest W(Parcel parcel)
    {
        DriveId driveid = null;
        int j = com.google.android.gms.common.internal.safeparcel.a.o(parcel);
        int i = 0;
        String as[] = null;
        String s = null;
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
                    s = com.google.android.gms.common.internal.safeparcel.a.n(parcel, k);
                    break;

                case 3: // '\003'
                    as = com.google.android.gms.common.internal.safeparcel.a.z(parcel, k);
                    break;

                case 4: // '\004'
                    driveid = (DriveId)com.google.android.gms.common.internal.safeparcel.a.a(parcel, k, DriveId.CREATOR);
                    break;
                }
            } else
            if (parcel.dataPosition() != j)
            {
                throw new com.google.android.gms.common.internal.safeparcel.a.a((new StringBuilder()).append("Overread allowed size end=").append(j).toString(), parcel);
            } else
            {
                return new OpenFileIntentSenderRequest(i, s, as, driveid);
            }
        } while (true);
    }

    public OpenFileIntentSenderRequest[] aA(int i)
    {
        return new OpenFileIntentSenderRequest[i];
    }

    public Object createFromParcel(Parcel parcel)
    {
        return W(parcel);
    }

    public Object[] newArray(int i)
    {
        return aA(i);
    }
}
