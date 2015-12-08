// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.accounts.Account;
import android.os.Parcel;
import com.google.android.gms.location.reporting.UploadRequest;

public final class lif
    implements android.os.Parcelable.Creator
{

    public lif()
    {
    }

    public static UploadRequest a(Parcel parcel)
    {
        long l = 0L;
        String s = null;
        int j = b.b(parcel);
        int i = 0;
        long l1 = 0L;
        long l2 = 0L;
        String s1 = null;
        Account account = null;
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
                    s1 = b.i(parcel, k);
                    break;

                case 4: // '\004'
                    l2 = b.f(parcel, k);
                    break;

                case 5: // '\005'
                    l1 = b.f(parcel, k);
                    break;

                case 6: // '\006'
                    l = b.f(parcel, k);
                    break;

                case 7: // '\007'
                    s = b.i(parcel, k);
                    break;
                }
            } else
            if (parcel.dataPosition() != j)
            {
                throw new ao((new StringBuilder("Overread allowed size end=")).append(j).toString(), parcel);
            } else
            {
                return new UploadRequest(i, account, s1, l2, l1, l, s);
            }
        } while (true);
    }

    public static void a(UploadRequest uploadrequest, Parcel parcel, int i)
    {
        int j = b.q(parcel, 20293);
        b.c(parcel, 1, uploadrequest.a);
        b.a(parcel, 2, uploadrequest.b, i, false);
        b.a(parcel, 3, uploadrequest.c, false);
        b.a(parcel, 4, uploadrequest.d);
        b.a(parcel, 5, uploadrequest.e);
        b.a(parcel, 6, uploadrequest.f);
        b.a(parcel, 7, uploadrequest.g, false);
        b.r(parcel, j);
    }

    public final Object createFromParcel(Parcel parcel)
    {
        return a(parcel);
    }

    public final Object[] newArray(int i)
    {
        return new UploadRequest[i];
    }
}
