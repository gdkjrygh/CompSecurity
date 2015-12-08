// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.drive.events;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.b;
import com.google.android.gms.drive.DriveId;

// Referenced classes of package com.google.android.gms.drive.events:
//            ChangeEvent

public class a
    implements android.os.Parcelable.Creator
{

    public a()
    {
    }

    static void a(ChangeEvent changeevent, Parcel parcel, int i)
    {
        int j = b.p(parcel);
        b.c(parcel, 1, changeevent.xH);
        b.a(parcel, 2, changeevent.Ew, i, false);
        b.c(parcel, 3, changeevent.ER);
        b.F(parcel, j);
    }

    public ChangeEvent A(Parcel parcel)
    {
        int i = 0;
        int k = com.google.android.gms.common.internal.safeparcel.a.o(parcel);
        DriveId driveid = null;
        int j = 0;
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
                    i = com.google.android.gms.common.internal.safeparcel.a.g(parcel, l);
                    break;
                }
            } else
            if (parcel.dataPosition() != k)
            {
                throw new com.google.android.gms.common.internal.safeparcel.a((new StringBuilder()).append("Overread allowed size end=").append(k).toString(), parcel);
            } else
            {
                return new ChangeEvent(j, driveid, i);
            }
        } while (true);
    }

    public ChangeEvent[] ae(int i)
    {
        return new ChangeEvent[i];
    }

    public Object createFromParcel(Parcel parcel)
    {
        return A(parcel);
    }

    public Object[] newArray(int i)
    {
        return ae(i);
    }
}
