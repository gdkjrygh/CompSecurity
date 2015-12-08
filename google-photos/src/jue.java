// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.accounts.Account;
import android.os.Parcel;
import com.google.android.gms.auth.AccountChangeEventsRequest;

public final class jue
    implements android.os.Parcelable.Creator
{

    public jue()
    {
    }

    public static void a(AccountChangeEventsRequest accountchangeeventsrequest, Parcel parcel, int i)
    {
        int j = b.q(parcel, 20293);
        b.c(parcel, 1, accountchangeeventsrequest.a);
        b.c(parcel, 2, accountchangeeventsrequest.b);
        b.a(parcel, 3, accountchangeeventsrequest.c, false);
        b.a(parcel, 4, accountchangeeventsrequest.d, i, false);
        b.r(parcel, j);
    }

    public final Object createFromParcel(Parcel parcel)
    {
        Account account = null;
        int k = b.b(parcel);
        int j = 0;
        int i = 0;
        String s = null;
        do
        {
            if (parcel.dataPosition() < k)
            {
                int l = parcel.readInt();
                switch (0xffff & l)
                {
                default:
                    b.b(parcel, l);
                    break;

                case 1: // '\001'
                    i = b.e(parcel, l);
                    break;

                case 2: // '\002'
                    j = b.e(parcel, l);
                    break;

                case 3: // '\003'
                    s = b.i(parcel, l);
                    break;

                case 4: // '\004'
                    account = (Account)b.a(parcel, l, Account.CREATOR);
                    break;
                }
            } else
            if (parcel.dataPosition() != k)
            {
                throw new ao((new StringBuilder("Overread allowed size end=")).append(k).toString(), parcel);
            } else
            {
                return new AccountChangeEventsRequest(i, j, s, account);
            }
        } while (true);
    }

    public final Object[] newArray(int i)
    {
        return new AccountChangeEventsRequest[i];
    }
}
