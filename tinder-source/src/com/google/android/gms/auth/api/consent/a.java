// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.auth.api.consent;

import android.accounts.Account;
import android.os.Parcel;
import com.google.android.gms.auth.firstparty.shared.ScopeDetail;
import com.google.android.gms.common.internal.safeparcel.zza;

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
        int j = com.google.android.gms.common.internal.safeparcel.a.a(parcel, 20293);
        com.google.android.gms.common.internal.safeparcel.a.b(parcel, 1, getconsentintentrequest.a);
        com.google.android.gms.common.internal.safeparcel.a.a(parcel, 2, getconsentintentrequest.b);
        com.google.android.gms.common.internal.safeparcel.a.b(parcel, 3, getconsentintentrequest.c);
        com.google.android.gms.common.internal.safeparcel.a.a(parcel, 4, getconsentintentrequest.d);
        com.google.android.gms.common.internal.safeparcel.a.a(parcel, 5, getconsentintentrequest.e, i);
        com.google.android.gms.common.internal.safeparcel.a.a(parcel, 6, getconsentintentrequest.f, i);
        com.google.android.gms.common.internal.safeparcel.a.a(parcel, 7, getconsentintentrequest.g);
        com.google.android.gms.common.internal.safeparcel.a.b(parcel, 8, getconsentintentrequest.h);
        com.google.android.gms.common.internal.safeparcel.a.b(parcel, j);
    }

    public final Object createFromParcel(Parcel parcel)
    {
        ScopeDetail ascopedetail[] = null;
        int i = 0;
        int l = zza.a(parcel);
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
                    zza.b(parcel, i1);
                    break;

                case 1: // '\001'
                    k = zza.e(parcel, i1);
                    break;

                case 2: // '\002'
                    s1 = zza.l(parcel, i1);
                    break;

                case 3: // '\003'
                    j = zza.e(parcel, i1);
                    break;

                case 4: // '\004'
                    s = zza.l(parcel, i1);
                    break;

                case 5: // '\005'
                    account = (Account)zza.a(parcel, i1, Account.CREATOR);
                    break;

                case 6: // '\006'
                    ascopedetail = (ScopeDetail[])zza.b(parcel, i1, ScopeDetail.CREATOR);
                    break;

                case 7: // '\007'
                    flag = zza.c(parcel, i1);
                    break;

                case 8: // '\b'
                    i = zza.e(parcel, i1);
                    break;
                }
            } else
            if (parcel.dataPosition() != l)
            {
                throw new com.google.android.gms.common.internal.safeparcel.zza.zza((new StringBuilder("Overread allowed size end=")).append(l).toString(), parcel);
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
