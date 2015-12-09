// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.googlehelp;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.a;

// Referenced classes of package com.google.android.gms.googlehelp:
//            OfflineSuggestion

public final class b
    implements android.os.Parcelable.Creator
{

    public b()
    {
    }

    static void a(OfflineSuggestion offlinesuggestion, Parcel parcel, int i)
    {
        i = com.google.android.gms.common.internal.safeparcel.b.bU(parcel);
        com.google.android.gms.common.internal.safeparcel.b.c(parcel, 1, offlinesuggestion.mVersionCode);
        com.google.android.gms.common.internal.safeparcel.b.a(parcel, 2, offlinesuggestion.CB, false);
        com.google.android.gms.common.internal.safeparcel.b.a(parcel, 3, offlinesuggestion.Yv, false);
        com.google.android.gms.common.internal.safeparcel.b.a(parcel, 4, offlinesuggestion.pE, false);
        com.google.android.gms.common.internal.safeparcel.b.a(parcel, 5, offlinesuggestion.ase, false);
        com.google.android.gms.common.internal.safeparcel.b.J(parcel, i);
    }

    private static OfflineSuggestion fc(Parcel parcel)
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
                    i = com.google.android.gms.common.internal.safeparcel.a.g(parcel, k);
                    break;

                case 2: // '\002'
                    s3 = com.google.android.gms.common.internal.safeparcel.a.p(parcel, k);
                    break;

                case 3: // '\003'
                    s2 = com.google.android.gms.common.internal.safeparcel.a.p(parcel, k);
                    break;

                case 4: // '\004'
                    s1 = com.google.android.gms.common.internal.safeparcel.a.p(parcel, k);
                    break;

                case 5: // '\005'
                    s = com.google.android.gms.common.internal.safeparcel.a.p(parcel, k);
                    break;
                }
            } else
            if (parcel.dataPosition() != j)
            {
                throw new com.google.android.gms.common.internal.safeparcel.a.a((new StringBuilder("Overread allowed size end=")).append(j).toString(), parcel);
            } else
            {
                return new OfflineSuggestion(i, s3, s2, s1, s);
            }
        } while (true);
    }

    private static OfflineSuggestion[] hk(int i)
    {
        return new OfflineSuggestion[i];
    }

    public final Object createFromParcel(Parcel parcel)
    {
        return fc(parcel);
    }

    public final Object[] newArray(int i)
    {
        return hk(i);
    }
}
