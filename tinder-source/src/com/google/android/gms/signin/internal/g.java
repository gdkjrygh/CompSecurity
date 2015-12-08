// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.signin.internal;

import android.accounts.Account;
import android.os.Parcel;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.internal.safeparcel.a;
import com.google.android.gms.common.internal.safeparcel.zza;

// Referenced classes of package com.google.android.gms.signin.internal:
//            RecordConsentRequest

public final class g
    implements android.os.Parcelable.Creator
{

    public g()
    {
    }

    static void a(RecordConsentRequest recordconsentrequest, Parcel parcel, int i)
    {
        int j = com.google.android.gms.common.internal.safeparcel.a.a(parcel, 20293);
        com.google.android.gms.common.internal.safeparcel.a.b(parcel, 1, recordconsentrequest.a);
        com.google.android.gms.common.internal.safeparcel.a.a(parcel, 2, recordconsentrequest.b, i);
        com.google.android.gms.common.internal.safeparcel.a.a(parcel, 3, recordconsentrequest.c, i);
        com.google.android.gms.common.internal.safeparcel.a.a(parcel, 4, recordconsentrequest.d);
        com.google.android.gms.common.internal.safeparcel.a.b(parcel, j);
    }

    public final Object createFromParcel(Parcel parcel)
    {
        int j = zza.a(parcel);
        Scope ascope[] = null;
        Account account = null;
        int i = 0;
        String s = null;
        do
        {
            if (parcel.dataPosition() < j)
            {
                int k = parcel.readInt();
                switch (0xffff & k)
                {
                default:
                    zza.b(parcel, k);
                    break;

                case 1: // '\001'
                    i = zza.e(parcel, k);
                    break;

                case 2: // '\002'
                    account = (Account)zza.a(parcel, k, Account.CREATOR);
                    break;

                case 3: // '\003'
                    ascope = (Scope[])zza.b(parcel, k, Scope.CREATOR);
                    break;

                case 4: // '\004'
                    s = zza.l(parcel, k);
                    break;
                }
            } else
            if (parcel.dataPosition() != j)
            {
                throw new com.google.android.gms.common.internal.safeparcel.zza.zza((new StringBuilder("Overread allowed size end=")).append(j).toString(), parcel);
            } else
            {
                return new RecordConsentRequest(i, account, ascope, s);
            }
        } while (true);
    }

    public final Object[] newArray(int i)
    {
        return new RecordConsentRequest[i];
    }
}
