// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.wallet;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.a;
import com.google.android.gms.common.internal.safeparcel.b;

// Referenced classes of package com.google.android.gms.wallet:
//            MaskedWalletRequest, Cart

public class h
    implements android.os.Parcelable.Creator
{

    public h()
    {
    }

    static void a(MaskedWalletRequest maskedwalletrequest, Parcel parcel, int i)
    {
        int j = b.k(parcel);
        b.c(parcel, 1, maskedwalletrequest.getVersionCode());
        b.a(parcel, 2, maskedwalletrequest.tI, false);
        b.a(parcel, 3, maskedwalletrequest.ub);
        b.a(parcel, 4, maskedwalletrequest.uc);
        b.a(parcel, 5, maskedwalletrequest.ud);
        b.a(parcel, 6, maskedwalletrequest.ue, false);
        b.a(parcel, 7, maskedwalletrequest.tE, false);
        b.a(parcel, 8, maskedwalletrequest.uf, false);
        b.a(parcel, 9, maskedwalletrequest.tO, i, false);
        b.a(parcel, 10, maskedwalletrequest.ug);
        b.a(parcel, 11, maskedwalletrequest.uh);
        b.C(parcel, j);
    }

    public MaskedWalletRequest U(Parcel parcel)
    {
        Cart cart = null;
        boolean flag = false;
        int j = com.google.android.gms.common.internal.safeparcel.a.j(parcel);
        boolean flag1 = false;
        String s = null;
        String s1 = null;
        String s2 = null;
        boolean flag2 = false;
        boolean flag3 = false;
        boolean flag4 = false;
        String s3 = null;
        int i = 0;
        do
        {
            if (parcel.dataPosition() < j)
            {
                int k = com.google.android.gms.common.internal.safeparcel.a.i(parcel);
                switch (com.google.android.gms.common.internal.safeparcel.a.y(k))
                {
                default:
                    com.google.android.gms.common.internal.safeparcel.a.b(parcel, k);
                    break;

                case 1: // '\001'
                    i = com.google.android.gms.common.internal.safeparcel.a.f(parcel, k);
                    break;

                case 2: // '\002'
                    s3 = com.google.android.gms.common.internal.safeparcel.a.l(parcel, k);
                    break;

                case 3: // '\003'
                    flag4 = com.google.android.gms.common.internal.safeparcel.a.c(parcel, k);
                    break;

                case 4: // '\004'
                    flag3 = com.google.android.gms.common.internal.safeparcel.a.c(parcel, k);
                    break;

                case 5: // '\005'
                    flag2 = com.google.android.gms.common.internal.safeparcel.a.c(parcel, k);
                    break;

                case 6: // '\006'
                    s2 = com.google.android.gms.common.internal.safeparcel.a.l(parcel, k);
                    break;

                case 7: // '\007'
                    s1 = com.google.android.gms.common.internal.safeparcel.a.l(parcel, k);
                    break;

                case 8: // '\b'
                    s = com.google.android.gms.common.internal.safeparcel.a.l(parcel, k);
                    break;

                case 9: // '\t'
                    cart = (Cart)com.google.android.gms.common.internal.safeparcel.a.a(parcel, k, Cart.CREATOR);
                    break;

                case 10: // '\n'
                    flag1 = com.google.android.gms.common.internal.safeparcel.a.c(parcel, k);
                    break;

                case 11: // '\013'
                    flag = com.google.android.gms.common.internal.safeparcel.a.c(parcel, k);
                    break;
                }
            } else
            if (parcel.dataPosition() != j)
            {
                throw new com.google.android.gms.common.internal.safeparcel.a.a((new StringBuilder()).append("Overread allowed size end=").append(j).toString(), parcel);
            } else
            {
                return new MaskedWalletRequest(i, s3, flag4, flag3, flag2, s2, s1, s, cart, flag1, flag);
            }
        } while (true);
    }

    public MaskedWalletRequest[] az(int i)
    {
        return new MaskedWalletRequest[i];
    }

    public Object createFromParcel(Parcel parcel)
    {
        return U(parcel);
    }

    public Object[] newArray(int i)
    {
        return az(i);
    }
}
