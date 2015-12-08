// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.drive.realtime.internal.event;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.a;
import com.google.android.gms.common.internal.safeparcel.b;

// Referenced classes of package com.google.android.gms.drive.realtime.internal.event:
//            TextInsertedDetails

public class f
    implements android.os.Parcelable.Creator
{

    public f()
    {
    }

    static void a(TextInsertedDetails textinserteddetails, Parcel parcel, int i)
    {
        i = b.H(parcel);
        b.c(parcel, 1, textinserteddetails.CK);
        b.c(parcel, 2, textinserteddetails.mIndex);
        b.c(parcel, 3, textinserteddetails.Ti);
        b.H(parcel, i);
    }

    public TextInsertedDetails bl(Parcel parcel)
    {
        int k = 0;
        int l = com.google.android.gms.common.internal.safeparcel.a.G(parcel);
        int j = 0;
        int i = 0;
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
                throw new com.google.android.gms.common.internal.safeparcel.a.a((new StringBuilder()).append("Overread allowed size end=").append(l).toString(), parcel);
            } else
            {
                return new TextInsertedDetails(i, j, k);
            }
        } while (true);
    }

    public TextInsertedDetails[] cB(int i)
    {
        return new TextInsertedDetails[i];
    }

    public Object createFromParcel(Parcel parcel)
    {
        return bl(parcel);
    }

    public Object[] newArray(int i)
    {
        return cB(i);
    }
}
