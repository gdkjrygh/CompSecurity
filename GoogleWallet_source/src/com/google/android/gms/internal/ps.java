// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.a;
import com.google.android.gms.common.internal.safeparcel.b;

// Referenced classes of package com.google.android.gms.internal:
//            pr

public final class ps
    implements android.os.Parcelable.Creator
{

    public ps()
    {
    }

    static void a(pr pr1, Parcel parcel, int i)
    {
        i = b.bU(parcel);
        b.a(parcel, 1, pr1.axw, false);
        b.c(parcel, 1000, pr1.versionCode);
        b.a(parcel, 2, pr1.localeString, false);
        b.a(parcel, 3, pr1.accountName, false);
        b.a(parcel, 4, pr1.awt, false);
        b.J(parcel, i);
    }

    public static pr fX(Parcel parcel)
    {
        String s = null;
        int j = com.google.android.gms.common.internal.safeparcel.a.bT(parcel);
        int i = 0;
        String s1 = null;
        String s2 = null;
        String s3 = null;
        do
        {
            if (parcel.dataPosition() < j)
            {
                int k = com.google.android.gms.common.internal.safeparcel.a.bS(parcel);
                switch (com.google.android.gms.common.internal.safeparcel.a.dk(k))
                {
                default:
                    com.google.android.gms.common.internal.safeparcel.a.b(parcel, k);
                    break;

                case 1: // '\001'
                    s3 = com.google.android.gms.common.internal.safeparcel.a.p(parcel, k);
                    break;

                case 1000: 
                    i = com.google.android.gms.common.internal.safeparcel.a.g(parcel, k);
                    break;

                case 2: // '\002'
                    s2 = com.google.android.gms.common.internal.safeparcel.a.p(parcel, k);
                    break;

                case 3: // '\003'
                    s1 = com.google.android.gms.common.internal.safeparcel.a.p(parcel, k);
                    break;

                case 4: // '\004'
                    s = com.google.android.gms.common.internal.safeparcel.a.p(parcel, k);
                    break;
                }
            } else
            if (parcel.dataPosition() != j)
            {
                throw new com.google.android.gms.common.internal.safeparcel.a.a((new StringBuilder("Overread allowed size end=")).append(j).toString(), parcel);
            } else
            {
                return new pr(i, s3, s2, s1, s);
            }
        } while (true);
    }

    private static pr[] is(int i)
    {
        return new pr[i];
    }

    public final Object createFromParcel(Parcel parcel)
    {
        return fX(parcel);
    }

    public final Object[] newArray(int i)
    {
        return is(i);
    }
}
