// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.os.Parcel;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.internal.ResolveAccountResponse;

public final class kcv
    implements android.os.Parcelable.Creator
{

    public kcv()
    {
    }

    public static void a(ResolveAccountResponse resolveaccountresponse, Parcel parcel, int i)
    {
        int j = b.q(parcel, 20293);
        b.c(parcel, 1, resolveaccountresponse.a);
        b.a(parcel, 2, resolveaccountresponse.b, false);
        b.a(parcel, 3, resolveaccountresponse.c, i, false);
        b.a(parcel, 4, resolveaccountresponse.d);
        b.a(parcel, 5, resolveaccountresponse.e);
        b.r(parcel, j);
    }

    public final Object createFromParcel(Parcel parcel)
    {
        ConnectionResult connectionresult = null;
        boolean flag = false;
        int j = b.b(parcel);
        boolean flag1 = false;
        android.os.IBinder ibinder = null;
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
                    i = b.e(parcel, k);
                    break;

                case 2: // '\002'
                    ibinder = b.j(parcel, k);
                    break;

                case 3: // '\003'
                    connectionresult = (ConnectionResult)b.a(parcel, k, ConnectionResult.CREATOR);
                    break;

                case 4: // '\004'
                    flag1 = b.c(parcel, k);
                    break;

                case 5: // '\005'
                    flag = b.c(parcel, k);
                    break;
                }
            } else
            if (parcel.dataPosition() != j)
            {
                throw new ao((new StringBuilder("Overread allowed size end=")).append(j).toString(), parcel);
            } else
            {
                return new ResolveAccountResponse(i, ibinder, connectionresult, flag1, flag);
            }
        } while (true);
    }

    public final Object[] newArray(int i)
    {
        return new ResolveAccountResponse[i];
    }
}
