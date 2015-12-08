// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.drive.realtime.internal.event;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.b;

// Referenced classes of package com.google.android.gms.drive.realtime.internal.event:
//            ObjectChangedDetails

public class a
    implements android.os.Parcelable.Creator
{

    public a()
    {
    }

    static void a(ObjectChangedDetails objectchangeddetails, Parcel parcel, int i)
    {
        i = b.D(parcel);
        b.c(parcel, 1, objectchangeddetails.BR);
        b.c(parcel, 2, objectchangeddetails.Rr);
        b.c(parcel, 3, objectchangeddetails.Rs);
        b.H(parcel, i);
    }

    public ObjectChangedDetails aY(Parcel parcel)
    {
        int k = 0;
        int l = com.google.android.gms.common.internal.safeparcel.a.C(parcel);
        int j = 0;
        int i = 0;
        do
        {
            if (parcel.dataPosition() < l)
            {
                int i1 = com.google.android.gms.common.internal.safeparcel.a.B(parcel);
                switch (com.google.android.gms.common.internal.safeparcel.a.aD(i1))
                {
                default:
                    com.google.android.gms.common.internal.safeparcel.a.b(parcel, i1);
                    break;

                case 1: // '\001'
                    i = com.google.android.gms.common.internal.safeparcel.a.g(parcel, i1);
                    break;

                case 2: // '\002'
                    j = com.google.android.gms.common.internal.safeparcel.a.g(parcel, i1);
                    break;

                case 3: // '\003'
                    k = com.google.android.gms.common.internal.safeparcel.a.g(parcel, i1);
                    break;
                }
            } else
            if (parcel.dataPosition() != l)
            {
                throw new com.google.android.gms.common.internal.safeparcel.a((new StringBuilder()).append("Overread allowed size end=").append(l).toString(), parcel);
            } else
            {
                return new ObjectChangedDetails(i, j, k);
            }
        } while (true);
    }

    public ObjectChangedDetails[] cl(int i)
    {
        return new ObjectChangedDetails[i];
    }

    public Object createFromParcel(Parcel parcel)
    {
        return aY(parcel);
    }

    public Object[] newArray(int i)
    {
        return cl(i);
    }
}
