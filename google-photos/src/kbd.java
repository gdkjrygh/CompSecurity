// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.os.Parcel;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.internal.AuthAccountRequest;

public final class kbd
    implements android.os.Parcelable.Creator
{

    public kbd()
    {
    }

    public static void a(AuthAccountRequest authaccountrequest, Parcel parcel, int i)
    {
        int j = b.q(parcel, 20293);
        b.c(parcel, 1, authaccountrequest.a);
        b.a(parcel, 2, authaccountrequest.b, false);
        b.a(parcel, 3, authaccountrequest.c, i, false);
        b.r(parcel, j);
    }

    public final Object createFromParcel(Parcel parcel)
    {
        Scope ascope[] = null;
        int j = b.b(parcel);
        int i = 0;
        android.os.IBinder ibinder = null;
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
                    ibinder = b.j(parcel, k);
                    break;

                case 3: // '\003'
                    ascope = (Scope[])b.b(parcel, k, Scope.CREATOR);
                    break;
                }
            } else
            if (parcel.dataPosition() != j)
            {
                throw new ao((new StringBuilder("Overread allowed size end=")).append(j).toString(), parcel);
            } else
            {
                return new AuthAccountRequest(i, ibinder, ascope);
            }
        } while (true);
    }

    public final Object[] newArray(int i)
    {
        return new AuthAccountRequest[i];
    }
}
