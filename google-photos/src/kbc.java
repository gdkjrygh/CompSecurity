// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.os.Parcel;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.internal.ValidateAccountRequest;

public final class kbc
    implements android.os.Parcelable.Creator
{

    public kbc()
    {
    }

    public static void a(ValidateAccountRequest validateaccountrequest, Parcel parcel, int i)
    {
        int j = b.q(parcel, 20293);
        b.c(parcel, 1, validateaccountrequest.a);
        b.c(parcel, 2, validateaccountrequest.b);
        b.a(parcel, 3, validateaccountrequest.c, false);
        b.a(parcel, 4, validateaccountrequest.d, i, false);
        b.a(parcel, 5, validateaccountrequest.e, false);
        b.a(parcel, 6, validateaccountrequest.f, false);
        b.r(parcel, j);
    }

    public final Object createFromParcel(Parcel parcel)
    {
        int i = 0;
        String s = null;
        int k = b.b(parcel);
        android.os.Bundle bundle = null;
        Scope ascope[] = null;
        android.os.IBinder ibinder = null;
        int j = 0;
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
                    j = b.e(parcel, l);
                    break;

                case 2: // '\002'
                    i = b.e(parcel, l);
                    break;

                case 3: // '\003'
                    ibinder = b.j(parcel, l);
                    break;

                case 4: // '\004'
                    ascope = (Scope[])b.b(parcel, l, Scope.CREATOR);
                    break;

                case 5: // '\005'
                    bundle = b.k(parcel, l);
                    break;

                case 6: // '\006'
                    s = b.i(parcel, l);
                    break;
                }
            } else
            if (parcel.dataPosition() != k)
            {
                throw new ao((new StringBuilder("Overread allowed size end=")).append(k).toString(), parcel);
            } else
            {
                return new ValidateAccountRequest(j, i, ibinder, ascope, bundle, s);
            }
        } while (true);
    }

    public final Object[] newArray(int i)
    {
        return new ValidateAccountRequest[i];
    }
}
