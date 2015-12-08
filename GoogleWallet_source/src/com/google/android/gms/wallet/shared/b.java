// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.wallet.shared;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.a;

// Referenced classes of package com.google.android.gms.wallet.shared:
//            BrokerAndRelationships

public final class b
    implements android.os.Parcelable.Creator
{

    public b()
    {
    }

    static void a(BrokerAndRelationships brokerandrelationships, Parcel parcel, int i)
    {
        i = com.google.android.gms.common.internal.safeparcel.b.bU(parcel);
        com.google.android.gms.common.internal.safeparcel.b.c(parcel, 1, brokerandrelationships.getVersionCode());
        com.google.android.gms.common.internal.safeparcel.b.a(parcel, 2, brokerandrelationships.aVy, false);
        com.google.android.gms.common.internal.safeparcel.b.a(parcel, 3, brokerandrelationships.aVz, false);
        com.google.android.gms.common.internal.safeparcel.b.J(parcel, i);
    }

    private static BrokerAndRelationships ir(Parcel parcel)
    {
        String as[] = null;
        int j = com.google.android.gms.common.internal.safeparcel.a.bT(parcel);
        int i = 0;
        String s = null;
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
                    s = com.google.android.gms.common.internal.safeparcel.a.p(parcel, k);
                    break;

                case 3: // '\003'
                    as = com.google.android.gms.common.internal.safeparcel.a.B(parcel, k);
                    break;
                }
            } else
            if (parcel.dataPosition() != j)
            {
                throw new com.google.android.gms.common.internal.safeparcel.a.a((new StringBuilder("Overread allowed size end=")).append(j).toString(), parcel);
            } else
            {
                return new BrokerAndRelationships(i, s, as);
            }
        } while (true);
    }

    private static BrokerAndRelationships[] lq(int i)
    {
        return new BrokerAndRelationships[i];
    }

    public final Object createFromParcel(Parcel parcel)
    {
        return ir(parcel);
    }

    public final Object[] newArray(int i)
    {
        return lq(i);
    }
}
