// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.drive.events;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.a;
import com.google.android.gms.drive.DriveId;

// Referenced classes of package com.google.android.gms.drive.events:
//            ConflictEvent

public class b
    implements android.os.Parcelable.Creator
{

    public b()
    {
    }

    static void a(ConflictEvent conflictevent, Parcel parcel, int i)
    {
        int j = com.google.android.gms.common.internal.safeparcel.b.p(parcel);
        com.google.android.gms.common.internal.safeparcel.b.c(parcel, 1, conflictevent.xH);
        com.google.android.gms.common.internal.safeparcel.b.a(parcel, 2, conflictevent.Ew, i, false);
        com.google.android.gms.common.internal.safeparcel.b.F(parcel, j);
    }

    public ConflictEvent B(Parcel parcel)
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
                return new ConflictEvent(i, driveid);
            }
        } while (true);
    }

    public ConflictEvent[] af(int i)
    {
        return new ConflictEvent[i];
    }

    public Object createFromParcel(Parcel parcel)
    {
        return B(parcel);
    }

    public Object[] newArray(int i)
    {
        return af(i);
    }
}
