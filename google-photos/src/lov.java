// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.accounts.Account;
import android.os.Parcel;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.signin.internal.RecordConsentRequest;

public final class lov
    implements android.os.Parcelable.Creator
{

    public lov()
    {
    }

    public static void a(RecordConsentRequest recordconsentrequest, Parcel parcel, int i)
    {
        int j = b.q(parcel, 20293);
        b.c(parcel, 1, recordconsentrequest.a);
        b.a(parcel, 2, recordconsentrequest.b, i, false);
        b.a(parcel, 3, recordconsentrequest.c, i, false);
        b.a(parcel, 4, recordconsentrequest.d, false);
        b.r(parcel, j);
    }

    public final Object createFromParcel(Parcel parcel)
    {
        int j = b.b(parcel);
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
                    b.b(parcel, k);
                    break;

                case 1: // '\001'
                    i = b.e(parcel, k);
                    break;

                case 2: // '\002'
                    account = (Account)b.a(parcel, k, Account.CREATOR);
                    break;

                case 3: // '\003'
                    ascope = (Scope[])b.b(parcel, k, Scope.CREATOR);
                    break;

                case 4: // '\004'
                    s = b.i(parcel, k);
                    break;
                }
            } else
            if (parcel.dataPosition() != j)
            {
                throw new ao((new StringBuilder("Overread allowed size end=")).append(j).toString(), parcel);
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
