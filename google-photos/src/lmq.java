// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.os.Parcel;
import com.google.android.gms.people.identity.internal.AccountToken;

public final class lmq
    implements android.os.Parcelable.Creator
{

    public lmq()
    {
    }

    public static AccountToken a(Parcel parcel)
    {
        String s1 = null;
        int j = b.b(parcel);
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
                    s = b.i(parcel, k);
                    break;

                case 1000: 
                    i = b.e(parcel, k);
                    break;

                case 2: // '\002'
                    s1 = b.i(parcel, k);
                    break;
                }
            } else
            if (parcel.dataPosition() != j)
            {
                throw new ao((new StringBuilder("Overread allowed size end=")).append(j).toString(), parcel);
            } else
            {
                return new AccountToken(i, s, s1);
            }
        } while (true);
    }

    public static void a(AccountToken accounttoken, Parcel parcel)
    {
        int i = b.q(parcel, 20293);
        b.a(parcel, 1, accounttoken.b, false);
        b.c(parcel, 1000, accounttoken.a);
        b.a(parcel, 2, accounttoken.c, false);
        b.r(parcel, i);
    }

    public final Object createFromParcel(Parcel parcel)
    {
        return a(parcel);
    }

    public final Object[] newArray(int i)
    {
        return new AccountToken[i];
    }
}
