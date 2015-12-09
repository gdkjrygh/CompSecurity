// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.wallet;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.a;
import com.google.android.gms.common.internal.safeparcel.b;

// Referenced classes of package com.google.android.gms.wallet:
//            NotifyTransactionStatusRequest

public final class m
    implements android.os.Parcelable.Creator
{

    public m()
    {
    }

    static void a(NotifyTransactionStatusRequest notifytransactionstatusrequest, Parcel parcel, int i)
    {
        i = b.bU(parcel);
        b.c(parcel, 1, notifytransactionstatusrequest.mVersionCode);
        b.a(parcel, 2, notifytransactionstatusrequest.aTl, false);
        b.c(parcel, 3, notifytransactionstatusrequest.status);
        b.a(parcel, 4, notifytransactionstatusrequest.aUp, false);
        b.J(parcel, i);
    }

    private static NotifyTransactionStatusRequest ii(Parcel parcel)
    {
        String s1 = null;
        int j = 0;
        int k = com.google.android.gms.common.internal.safeparcel.a.bT(parcel);
        String s = null;
        int i = 0;
        do
        {
            if (parcel.dataPosition() < k)
            {
                int l = com.google.android.gms.common.internal.safeparcel.a.bS(parcel);
                switch (com.google.android.gms.common.internal.safeparcel.a.dk(l))
                {
                default:
                    com.google.android.gms.common.internal.safeparcel.a.b(parcel, l);
                    break;

                case 1: // '\001'
                    i = com.google.android.gms.common.internal.safeparcel.a.g(parcel, l);
                    break;

                case 2: // '\002'
                    s = com.google.android.gms.common.internal.safeparcel.a.p(parcel, l);
                    break;

                case 3: // '\003'
                    j = com.google.android.gms.common.internal.safeparcel.a.g(parcel, l);
                    break;

                case 4: // '\004'
                    s1 = com.google.android.gms.common.internal.safeparcel.a.p(parcel, l);
                    break;
                }
            } else
            if (parcel.dataPosition() != k)
            {
                throw new com.google.android.gms.common.internal.safeparcel.a.a((new StringBuilder("Overread allowed size end=")).append(k).toString(), parcel);
            } else
            {
                return new NotifyTransactionStatusRequest(i, s, j, s1);
            }
        } while (true);
    }

    private static NotifyTransactionStatusRequest[] ld(int i)
    {
        return new NotifyTransactionStatusRequest[i];
    }

    public final Object createFromParcel(Parcel parcel)
    {
        return ii(parcel);
    }

    public final Object[] newArray(int i)
    {
        return ld(i);
    }
}
