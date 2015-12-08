// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.wallet;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.a;
import com.google.android.gms.common.internal.safeparcel.b;

// Referenced classes of package com.google.android.gms.wallet:
//            NotifyTransactionStatusRequest

public class i
    implements android.os.Parcelable.Creator
{

    public i()
    {
    }

    static void a(NotifyTransactionStatusRequest notifytransactionstatusrequest, Parcel parcel, int j)
    {
        j = b.k(parcel);
        b.c(parcel, 1, notifytransactionstatusrequest.iM);
        b.a(parcel, 2, notifytransactionstatusrequest.tH, false);
        b.c(parcel, 3, notifytransactionstatusrequest.status);
        b.a(parcel, 4, notifytransactionstatusrequest.uj, false);
        b.C(parcel, j);
    }

    public NotifyTransactionStatusRequest V(Parcel parcel)
    {
        String s1 = null;
        int k = 0;
        int l = com.google.android.gms.common.internal.safeparcel.a.j(parcel);
        String s = null;
        int j = 0;
        do
        {
            if (parcel.dataPosition() < l)
            {
                int i1 = com.google.android.gms.common.internal.safeparcel.a.i(parcel);
                switch (com.google.android.gms.common.internal.safeparcel.a.y(i1))
                {
                default:
                    com.google.android.gms.common.internal.safeparcel.a.b(parcel, i1);
                    break;

                case 1: // '\001'
                    j = com.google.android.gms.common.internal.safeparcel.a.f(parcel, i1);
                    break;

                case 2: // '\002'
                    s = com.google.android.gms.common.internal.safeparcel.a.l(parcel, i1);
                    break;

                case 3: // '\003'
                    k = com.google.android.gms.common.internal.safeparcel.a.f(parcel, i1);
                    break;

                case 4: // '\004'
                    s1 = com.google.android.gms.common.internal.safeparcel.a.l(parcel, i1);
                    break;
                }
            } else
            if (parcel.dataPosition() != l)
            {
                throw new com.google.android.gms.common.internal.safeparcel.a.a((new StringBuilder()).append("Overread allowed size end=").append(l).toString(), parcel);
            } else
            {
                return new NotifyTransactionStatusRequest(j, s, k, s1);
            }
        } while (true);
    }

    public NotifyTransactionStatusRequest[] aA(int j)
    {
        return new NotifyTransactionStatusRequest[j];
    }

    public Object createFromParcel(Parcel parcel)
    {
        return V(parcel);
    }

    public Object[] newArray(int j)
    {
        return aA(j);
    }
}
