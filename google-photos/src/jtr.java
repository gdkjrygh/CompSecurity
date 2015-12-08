// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.accounts.Account;
import android.os.Parcel;

public final class jtr
    implements android.os.Parcelable.Creator
{

    public jtr()
    {
    }

    public static com.google.android.gms.appdatasearch.GetRecentContextCall.Request a(Parcel parcel)
    {
        String s = null;
        boolean flag = false;
        int j = b.b(parcel);
        boolean flag1 = false;
        boolean flag2 = false;
        Account account = null;
        int i = 0;
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
                    account = (Account)b.a(parcel, k, Account.CREATOR);
                    break;

                case 1000: 
                    i = b.e(parcel, k);
                    break;

                case 2: // '\002'
                    flag2 = b.c(parcel, k);
                    break;

                case 3: // '\003'
                    flag1 = b.c(parcel, k);
                    break;

                case 4: // '\004'
                    flag = b.c(parcel, k);
                    break;

                case 5: // '\005'
                    s = b.i(parcel, k);
                    break;
                }
            } else
            if (parcel.dataPosition() != j)
            {
                throw new ao((new StringBuilder("Overread allowed size end=")).append(j).toString(), parcel);
            } else
            {
                return new com.google.android.gms.appdatasearch.GetRecentContextCall.Request(i, account, flag2, flag1, flag, s);
            }
        } while (true);
    }

    public static void a(com.google.android.gms.appdatasearch.GetRecentContextCall.Request request, Parcel parcel, int i)
    {
        int j = b.q(parcel, 20293);
        b.a(parcel, 1, request.b, i, false);
        b.c(parcel, 1000, request.a);
        b.a(parcel, 2, request.c);
        b.a(parcel, 3, request.d);
        b.a(parcel, 4, request.e);
        b.a(parcel, 5, request.f, false);
        b.r(parcel, j);
    }

    public final Object createFromParcel(Parcel parcel)
    {
        return a(parcel);
    }

    public final Object[] newArray(int i)
    {
        return new com.google.android.gms.appdatasearch.GetRecentContextCall.Request[i];
    }
}
