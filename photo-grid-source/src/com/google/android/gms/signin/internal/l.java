// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.signin.internal;

import android.accounts.Account;
import android.os.Parcel;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.internal.safeparcel.a;
import com.google.android.gms.common.internal.safeparcel.b;
import com.google.android.gms.common.internal.safeparcel.c;

// Referenced classes of package com.google.android.gms.signin.internal:
//            RecordConsentRequest

public final class l
    implements android.os.Parcelable.Creator
{

    public l()
    {
    }

    static void a(RecordConsentRequest recordconsentrequest, Parcel parcel, int i)
    {
        int j = c.a(parcel);
        c.a(parcel, 1, recordconsentrequest.a);
        c.a(parcel, 2, recordconsentrequest.a(), i, false);
        c.a(parcel, 3, recordconsentrequest.b(), i);
        c.a(parcel, 4, recordconsentrequest.c(), false);
        c.a(parcel, j);
    }

    public final Object createFromParcel(Parcel parcel)
    {
        int j = com.google.android.gms.common.internal.safeparcel.a.a(parcel);
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
                    com.google.android.gms.common.internal.safeparcel.a.b(parcel, k);
                    break;

                case 1: // '\001'
                    i = com.google.android.gms.common.internal.safeparcel.a.d(parcel, k);
                    break;

                case 2: // '\002'
                    account = (Account)com.google.android.gms.common.internal.safeparcel.a.a(parcel, k, Account.CREATOR);
                    break;

                case 3: // '\003'
                    ascope = (Scope[])com.google.android.gms.common.internal.safeparcel.a.b(parcel, k, Scope.CREATOR);
                    break;

                case 4: // '\004'
                    s = com.google.android.gms.common.internal.safeparcel.a.j(parcel, k);
                    break;
                }
            } else
            if (parcel.dataPosition() != j)
            {
                throw new b((new StringBuilder("Overread allowed size end=")).append(j).toString(), parcel);
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
