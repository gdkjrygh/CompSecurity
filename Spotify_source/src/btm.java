// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.accounts.Account;
import android.os.Parcel;
import com.google.android.gms.common.internal.ResolveAccountRequest;
import com.google.android.gms.common.internal.safeparcel.zza;

public final class btm
    implements android.os.Parcelable.Creator
{

    public btm()
    {
    }

    public static void a(ResolveAccountRequest resolveaccountrequest, Parcel parcel, int i)
    {
        int j = brp.a(parcel, 20293);
        brp.b(parcel, 1, resolveaccountrequest.a);
        brp.a(parcel, 2, resolveaccountrequest.b, i);
        brp.b(parcel, 3, resolveaccountrequest.c);
        brp.b(parcel, j);
    }

    public final Object createFromParcel(Parcel parcel)
    {
        int k = zza.a(parcel);
        Account account = null;
        int i = 0;
        int j = 0;
        do
        {
            if (parcel.dataPosition() < k)
            {
                int l = parcel.readInt();
                switch (0xffff & l)
                {
                default:
                    zza.b(parcel, l);
                    break;

                case 1: // '\001'
                    i = zza.e(parcel, l);
                    break;

                case 2: // '\002'
                    account = (Account)zza.a(parcel, l, Account.CREATOR);
                    break;

                case 3: // '\003'
                    j = zza.e(parcel, l);
                    break;
                }
            } else
            if (parcel.dataPosition() != k)
            {
                throw new com.google.android.gms.common.internal.safeparcel.zza.zza((new StringBuilder("Overread allowed size end=")).append(k).toString(), parcel);
            } else
            {
                return new ResolveAccountRequest(i, account, j);
            }
        } while (true);
    }

    public final Object[] newArray(int i)
    {
        return new ResolveAccountRequest[i];
    }
}
