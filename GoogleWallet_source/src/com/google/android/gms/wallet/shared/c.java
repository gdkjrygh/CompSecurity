// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.wallet.shared;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.a;
import com.google.android.gms.common.internal.safeparcel.b;

// Referenced classes of package com.google.android.gms.wallet.shared:
//            BuyFlowConfig, ApplicationParameters

public final class c
    implements android.os.Parcelable.Creator
{

    public c()
    {
    }

    static void a(BuyFlowConfig buyflowconfig, Parcel parcel, int i)
    {
        int j = b.bU(parcel);
        b.c(parcel, 1, buyflowconfig.mVersionCode);
        b.a(parcel, 2, buyflowconfig.aVB, false);
        b.a(parcel, 3, buyflowconfig.aVC, i, false);
        b.a(parcel, 4, buyflowconfig.aVD, false);
        b.a(parcel, 5, buyflowconfig.aVE, false);
        b.a(parcel, 6, buyflowconfig.aVF, false);
        b.J(parcel, j);
    }

    private static BuyFlowConfig is(Parcel parcel)
    {
        String s = null;
        int j = com.google.android.gms.common.internal.safeparcel.a.bT(parcel);
        int i = 0;
        String s1 = null;
        String s2 = null;
        ApplicationParameters applicationparameters = null;
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
                    applicationparameters = (ApplicationParameters)com.google.android.gms.common.internal.safeparcel.a.a(parcel, k, ApplicationParameters.CREATOR);
                    break;

                case 4: // '\004'
                    s2 = com.google.android.gms.common.internal.safeparcel.a.p(parcel, k);
                    break;

                case 5: // '\005'
                    s1 = com.google.android.gms.common.internal.safeparcel.a.p(parcel, k);
                    break;

                case 6: // '\006'
                    s = com.google.android.gms.common.internal.safeparcel.a.p(parcel, k);
                    break;
                }
            } else
            if (parcel.dataPosition() != j)
            {
                throw new com.google.android.gms.common.internal.safeparcel.a.a((new StringBuilder("Overread allowed size end=")).append(j).toString(), parcel);
            } else
            {
                return new BuyFlowConfig(i, s3, applicationparameters, s2, s1, s);
            }
        } while (true);
    }

    private static BuyFlowConfig[] lr(int i)
    {
        return new BuyFlowConfig[i];
    }

    public final Object createFromParcel(Parcel parcel)
    {
        return is(parcel);
    }

    public final Object[] newArray(int i)
    {
        return lr(i);
    }
}
