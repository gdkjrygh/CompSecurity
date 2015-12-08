// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.auth;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.a;
import com.google.android.gms.common.internal.safeparcel.b;

// Referenced classes of package com.google.android.gms.auth:
//            AccountChangeEventsRequest

public class AccountChangeEventsRequestCreator
    implements android.os.Parcelable.Creator
{

    public static final int CONTENT_DESCRIPTION = 0;

    public AccountChangeEventsRequestCreator()
    {
    }

    static void a(AccountChangeEventsRequest accountchangeeventsrequest, Parcel parcel, int i)
    {
        i = b.H(parcel);
        b.c(parcel, 1, accountchangeeventsrequest.Ef);
        b.c(parcel, 2, accountchangeeventsrequest.Ei);
        b.a(parcel, 3, accountchangeeventsrequest.DZ, false);
        b.H(parcel, i);
    }

    public AccountChangeEventsRequest createFromParcel(Parcel parcel)
    {
        int j = 0;
        int k = com.google.android.gms.common.internal.safeparcel.a.G(parcel);
        String s = null;
        int i = 0;
        do
        {
            if (parcel.dataPosition() < k)
            {
                int l = com.google.android.gms.common.internal.safeparcel.a.F(parcel);
                switch (com.google.android.gms.common.internal.safeparcel.a.aH(l))
                {
                default:
                    com.google.android.gms.common.internal.safeparcel.a.b(parcel, l);
                    break;

                case 1: // '\001'
                    i = com.google.android.gms.common.internal.safeparcel.a.g(parcel, l);
                    break;

                case 2: // '\002'
                    j = com.google.android.gms.common.internal.safeparcel.a.g(parcel, l);
                    break;

                case 3: // '\003'
                    s = com.google.android.gms.common.internal.safeparcel.a.o(parcel, l);
                    break;
                }
            } else
            if (parcel.dataPosition() != k)
            {
                throw new com.google.android.gms.common.internal.safeparcel.a.a((new StringBuilder()).append("Overread allowed size end=").append(k).toString(), parcel);
            } else
            {
                return new AccountChangeEventsRequest(i, j, s);
            }
        } while (true);
    }

    public volatile Object createFromParcel(Parcel parcel)
    {
        return createFromParcel(parcel);
    }

    public AccountChangeEventsRequest[] newArray(int i)
    {
        return new AccountChangeEventsRequest[i];
    }

    public volatile Object[] newArray(int i)
    {
        return newArray(i);
    }
}
