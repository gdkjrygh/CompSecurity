// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.auth;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.a;
import com.google.android.gms.common.internal.safeparcel.b;

// Referenced classes of package com.google.android.gms.auth:
//            AccountChangeEventsResponse, AccountChangeEvent

public class AccountChangeEventsResponseCreator
    implements android.os.Parcelable.Creator
{

    public static final int CONTENT_DESCRIPTION = 0;

    public AccountChangeEventsResponseCreator()
    {
    }

    static void a(AccountChangeEventsResponse accountchangeeventsresponse, Parcel parcel, int i)
    {
        i = b.H(parcel);
        b.c(parcel, 1, accountchangeeventsresponse.Ef);
        b.c(parcel, 2, accountchangeeventsresponse.mp, false);
        b.H(parcel, i);
    }

    public AccountChangeEventsResponse createFromParcel(Parcel parcel)
    {
        int j = com.google.android.gms.common.internal.safeparcel.a.G(parcel);
        int i = 0;
        java.util.ArrayList arraylist = null;
        do
        {
            if (parcel.dataPosition() < j)
            {
                int k = com.google.android.gms.common.internal.safeparcel.a.F(parcel);
                switch (com.google.android.gms.common.internal.safeparcel.a.aH(k))
                {
                default:
                    com.google.android.gms.common.internal.safeparcel.a.b(parcel, k);
                    break;

                case 1: // '\001'
                    i = com.google.android.gms.common.internal.safeparcel.a.g(parcel, k);
                    break;

                case 2: // '\002'
                    arraylist = com.google.android.gms.common.internal.safeparcel.a.c(parcel, k, AccountChangeEvent.CREATOR);
                    break;
                }
            } else
            if (parcel.dataPosition() != j)
            {
                throw new com.google.android.gms.common.internal.safeparcel.a.a((new StringBuilder()).append("Overread allowed size end=").append(j).toString(), parcel);
            } else
            {
                return new AccountChangeEventsResponse(i, arraylist);
            }
        } while (true);
    }

    public volatile Object createFromParcel(Parcel parcel)
    {
        return createFromParcel(parcel);
    }

    public AccountChangeEventsResponse[] newArray(int i)
    {
        return new AccountChangeEventsResponse[i];
    }

    public volatile Object[] newArray(int i)
    {
        return newArray(i);
    }
}
