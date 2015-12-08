// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.drive.query.internal;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.a;
import com.google.android.gms.common.internal.safeparcel.b;

// Referenced classes of package com.google.android.gms.drive.query.internal:
//            MatchAllFilter

public class i
    implements android.os.Parcelable.Creator
{

    public i()
    {
    }

    static void a(MatchAllFilter matchallfilter, Parcel parcel, int j)
    {
        j = b.C(parcel);
        b.c(parcel, 1000, matchallfilter.xM);
        b.G(parcel, j);
    }

    public MatchAllFilter aM(Parcel parcel)
    {
        int k = com.google.android.gms.common.internal.safeparcel.a.B(parcel);
        int j = 0;
        do
        {
            if (parcel.dataPosition() < k)
            {
                int l = com.google.android.gms.common.internal.safeparcel.a.A(parcel);
                switch (com.google.android.gms.common.internal.safeparcel.a.ar(l))
                {
                default:
                    com.google.android.gms.common.internal.safeparcel.a.b(parcel, l);
                    break;

                case 1000: 
                    j = com.google.android.gms.common.internal.safeparcel.a.g(parcel, l);
                    break;
                }
            } else
            if (parcel.dataPosition() != k)
            {
                throw new com.google.android.gms.common.internal.safeparcel.a.a((new StringBuilder()).append("Overread allowed size end=").append(k).toString(), parcel);
            } else
            {
                return new MatchAllFilter(j);
            }
        } while (true);
    }

    public MatchAllFilter[] bI(int j)
    {
        return new MatchAllFilter[j];
    }

    public Object createFromParcel(Parcel parcel)
    {
        return aM(parcel);
    }

    public Object[] newArray(int j)
    {
        return bI(j);
    }
}
