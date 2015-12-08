// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.accounts.Account;
import android.os.Parcel;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.internal.GetServiceRequest;

public final class kbn
    implements android.os.Parcelable.Creator
{

    public kbn()
    {
    }

    public static void a(GetServiceRequest getservicerequest, Parcel parcel, int i)
    {
        int j = b.q(parcel, 20293);
        b.c(parcel, 1, getservicerequest.a);
        b.c(parcel, 2, getservicerequest.b);
        b.c(parcel, 3, getservicerequest.c);
        b.a(parcel, 4, getservicerequest.d, false);
        b.a(parcel, 5, getservicerequest.e, false);
        b.a(parcel, 6, getservicerequest.f, i, false);
        b.a(parcel, 7, getservicerequest.g, false);
        b.a(parcel, 8, getservicerequest.h, i, false);
        b.r(parcel, j);
    }

    public final Object createFromParcel(Parcel parcel)
    {
        int i = 0;
        Account account = null;
        int l = b.b(parcel);
        android.os.Bundle bundle = null;
        Scope ascope[] = null;
        android.os.IBinder ibinder = null;
        String s = null;
        int j = 0;
        int k = 0;
        do
        {
            if (parcel.dataPosition() < l)
            {
                int i1 = parcel.readInt();
                switch (0xffff & i1)
                {
                default:
                    b.b(parcel, i1);
                    break;

                case 1: // '\001'
                    k = b.e(parcel, i1);
                    break;

                case 2: // '\002'
                    j = b.e(parcel, i1);
                    break;

                case 3: // '\003'
                    i = b.e(parcel, i1);
                    break;

                case 4: // '\004'
                    s = b.i(parcel, i1);
                    break;

                case 5: // '\005'
                    ibinder = b.j(parcel, i1);
                    break;

                case 6: // '\006'
                    ascope = (Scope[])b.b(parcel, i1, Scope.CREATOR);
                    break;

                case 7: // '\007'
                    bundle = b.k(parcel, i1);
                    break;

                case 8: // '\b'
                    account = (Account)b.a(parcel, i1, Account.CREATOR);
                    break;
                }
            } else
            if (parcel.dataPosition() != l)
            {
                throw new ao((new StringBuilder("Overread allowed size end=")).append(l).toString(), parcel);
            } else
            {
                return new GetServiceRequest(k, j, i, s, ibinder, ascope, bundle, account);
            }
        } while (true);
    }

    public final Object[] newArray(int i)
    {
        return new GetServiceRequest[i];
    }
}
