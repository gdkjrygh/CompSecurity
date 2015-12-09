// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.accounts.Account;
import android.os.Parcel;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.internal.GetServiceRequest;
import com.google.android.gms.common.internal.safeparcel.zza;

public final class bsb
    implements android.os.Parcelable.Creator
{

    public bsb()
    {
    }

    public static void a(GetServiceRequest getservicerequest, Parcel parcel, int i)
    {
        int j = brp.a(parcel, 20293);
        brp.b(parcel, 1, getservicerequest.a);
        brp.b(parcel, 2, getservicerequest.b);
        brp.b(parcel, 3, getservicerequest.c);
        brp.a(parcel, 4, getservicerequest.d);
        brp.a(parcel, 5, getservicerequest.e);
        brp.a(parcel, 6, getservicerequest.f, i);
        brp.a(parcel, 7, getservicerequest.g);
        brp.a(parcel, 8, getservicerequest.h, i);
        brp.b(parcel, j);
    }

    public final Object createFromParcel(Parcel parcel)
    {
        int i = 0;
        Account account = null;
        int l = zza.a(parcel);
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
                    zza.b(parcel, i1);
                    break;

                case 1: // '\001'
                    k = zza.e(parcel, i1);
                    break;

                case 2: // '\002'
                    j = zza.e(parcel, i1);
                    break;

                case 3: // '\003'
                    i = zza.e(parcel, i1);
                    break;

                case 4: // '\004'
                    s = zza.h(parcel, i1);
                    break;

                case 5: // '\005'
                    ibinder = zza.i(parcel, i1);
                    break;

                case 6: // '\006'
                    ascope = (Scope[])zza.b(parcel, i1, Scope.CREATOR);
                    break;

                case 7: // '\007'
                    bundle = zza.j(parcel, i1);
                    break;

                case 8: // '\b'
                    account = (Account)zza.a(parcel, i1, Account.CREATOR);
                    break;
                }
            } else
            if (parcel.dataPosition() != l)
            {
                throw new com.google.android.gms.common.internal.safeparcel.zza.zza((new StringBuilder("Overread allowed size end=")).append(l).toString(), parcel);
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
