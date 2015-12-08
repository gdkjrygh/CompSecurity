// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.wallet.firstparty;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.a;

// Referenced classes of package com.google.android.gms.wallet.firstparty:
//            GetInstrumentsResponse

public final class b
    implements android.os.Parcelable.Creator
{

    public b()
    {
    }

    static void a(GetInstrumentsResponse getinstrumentsresponse, Parcel parcel, int i)
    {
        i = com.google.android.gms.common.internal.safeparcel.b.bU(parcel);
        com.google.android.gms.common.internal.safeparcel.b.c(parcel, 1, getinstrumentsresponse.getVersionCode());
        com.google.android.gms.common.internal.safeparcel.b.a(parcel, 2, getinstrumentsresponse.aUC, false);
        com.google.android.gms.common.internal.safeparcel.b.a(parcel, 3, getinstrumentsresponse.aUD, false);
        com.google.android.gms.common.internal.safeparcel.b.J(parcel, i);
    }

    private static GetInstrumentsResponse im(Parcel parcel)
    {
        byte abyte0[][] = null;
        int j = com.google.android.gms.common.internal.safeparcel.a.bT(parcel);
        int i = 0;
        String as[] = null;
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
                    as = com.google.android.gms.common.internal.safeparcel.a.B(parcel, k);
                    break;

                case 3: // '\003'
                    abyte0 = com.google.android.gms.common.internal.safeparcel.a.t(parcel, k);
                    break;
                }
            } else
            if (parcel.dataPosition() != j)
            {
                throw new com.google.android.gms.common.internal.safeparcel.a.a((new StringBuilder("Overread allowed size end=")).append(j).toString(), parcel);
            } else
            {
                return new GetInstrumentsResponse(i, as, abyte0);
            }
        } while (true);
    }

    private static GetInstrumentsResponse[] lh(int i)
    {
        return new GetInstrumentsResponse[i];
    }

    public final Object createFromParcel(Parcel parcel)
    {
        return im(parcel);
    }

    public final Object[] newArray(int i)
    {
        return lh(i);
    }
}
