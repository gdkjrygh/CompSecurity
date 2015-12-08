// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.wallet.firstparty;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.b;

// Referenced classes of package com.google.android.gms.wallet.firstparty:
//            GetInstrumentsRequest

public final class a
    implements android.os.Parcelable.Creator
{

    public a()
    {
    }

    static void a(GetInstrumentsRequest getinstrumentsrequest, Parcel parcel, int i)
    {
        i = b.bU(parcel);
        b.c(parcel, 1, getinstrumentsrequest.getVersionCode());
        b.a(parcel, 2, getinstrumentsrequest.aUA, false);
        b.J(parcel, i);
    }

    private static GetInstrumentsRequest il(Parcel parcel)
    {
        int j = com.google.android.gms.common.internal.safeparcel.a.bT(parcel);
        int i = 0;
        int ai[] = null;
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
                    ai = com.google.android.gms.common.internal.safeparcel.a.v(parcel, k);
                    break;
                }
            } else
            if (parcel.dataPosition() != j)
            {
                throw new com.google.android.gms.common.internal.safeparcel.a((new StringBuilder("Overread allowed size end=")).append(j).toString(), parcel);
            } else
            {
                return new GetInstrumentsRequest(i, ai);
            }
        } while (true);
    }

    private static GetInstrumentsRequest[] lg(int i)
    {
        return new GetInstrumentsRequest[i];
    }

    public final Object createFromParcel(Parcel parcel)
    {
        return il(parcel);
    }

    public final Object[] newArray(int i)
    {
        return lg(i);
    }
}
