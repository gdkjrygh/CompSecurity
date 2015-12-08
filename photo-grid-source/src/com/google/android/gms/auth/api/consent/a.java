// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.auth.api.consent;

import android.accounts.Account;
import android.os.Parcel;
import com.google.android.gms.auth.firstparty.shared.ScopeDetail;
import com.google.android.gms.common.internal.safeparcel.b;
import com.google.android.gms.common.internal.safeparcel.c;

// Referenced classes of package com.google.android.gms.auth.api.consent:
//            GetConsentIntentRequest

public final class a
    implements android.os.Parcelable.Creator
{

    public a()
    {
    }

    static void a(GetConsentIntentRequest getconsentintentrequest, Parcel parcel, int i)
    {
        int j = c.a(parcel);
        c.a(parcel, 1, getconsentintentrequest.a());
        c.a(parcel, 2, getconsentintentrequest.b(), false);
        c.a(parcel, 3, getconsentintentrequest.c());
        c.a(parcel, 4, getconsentintentrequest.d(), false);
        c.a(parcel, 5, getconsentintentrequest.e(), i, false);
        c.a(parcel, 6, getconsentintentrequest.a, i);
        c.a(parcel, 7, getconsentintentrequest.f());
        c.a(parcel, 8, getconsentintentrequest.g());
        c.a(parcel, j);
    }

    public final Object createFromParcel(Parcel parcel)
    {
        ScopeDetail ascopedetail[] = null;
        int i = 0;
        int l = com.google.android.gms.common.internal.safeparcel.a.a(parcel);
        boolean flag = false;
        Account account = null;
        String s = null;
        int j = 0;
        String s1 = null;
        int k = 0;
        do
        {
            if (parcel.dataPosition() < l)
            {
                int i1 = parcel.readInt();
                switch (0xffff & i1)
                {
                default:
                    com.google.android.gms.common.internal.safeparcel.a.b(parcel, i1);
                    break;

                case 1: // '\001'
                    k = com.google.android.gms.common.internal.safeparcel.a.d(parcel, i1);
                    break;

                case 2: // '\002'
                    s1 = com.google.android.gms.common.internal.safeparcel.a.j(parcel, i1);
                    break;

                case 3: // '\003'
                    j = com.google.android.gms.common.internal.safeparcel.a.d(parcel, i1);
                    break;

                case 4: // '\004'
                    s = com.google.android.gms.common.internal.safeparcel.a.j(parcel, i1);
                    break;

                case 5: // '\005'
                    account = (Account)com.google.android.gms.common.internal.safeparcel.a.a(parcel, i1, Account.CREATOR);
                    break;

                case 6: // '\006'
                    ascopedetail = (ScopeDetail[])com.google.android.gms.common.internal.safeparcel.a.b(parcel, i1, ScopeDetail.CREATOR);
                    break;

                case 7: // '\007'
                    flag = com.google.android.gms.common.internal.safeparcel.a.c(parcel, i1);
                    break;

                case 8: // '\b'
                    i = com.google.android.gms.common.internal.safeparcel.a.d(parcel, i1);
                    break;
                }
            } else
            if (parcel.dataPosition() != l)
            {
                throw new b((new StringBuilder("Overread allowed size end=")).append(l).toString(), parcel);
            } else
            {
                return new GetConsentIntentRequest(k, s1, j, s, account, ascopedetail, flag, i);
            }
        } while (true);
    }

    public final Object[] newArray(int i)
    {
        return new GetConsentIntentRequest[i];
    }
}
