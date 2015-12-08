// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.os.Parcel;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.internal.ValidateAccountRequest;
import com.google.android.gms.common.internal.safeparcel.zza;

public final class brs
    implements android.os.Parcelable.Creator
{

    public brs()
    {
    }

    public static void a(ValidateAccountRequest validateaccountrequest, Parcel parcel, int i)
    {
        int j = brp.a(parcel, 20293);
        brp.b(parcel, 1, validateaccountrequest.a);
        brp.b(parcel, 2, validateaccountrequest.b);
        brp.a(parcel, 3, validateaccountrequest.c);
        brp.a(parcel, 4, validateaccountrequest.d, i);
        brp.a(parcel, 5, validateaccountrequest.e);
        brp.a(parcel, 6, validateaccountrequest.f);
        brp.b(parcel, j);
    }

    public final Object createFromParcel(Parcel parcel)
    {
        int i = 0;
        String s = null;
        int k = zza.a(parcel);
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
                    zza.b(parcel, l);
                    break;

                case 1: // '\001'
                    j = zza.e(parcel, l);
                    break;

                case 2: // '\002'
                    i = zza.e(parcel, l);
                    break;

                case 3: // '\003'
                    ibinder = zza.i(parcel, l);
                    break;

                case 4: // '\004'
                    ascope = (Scope[])zza.b(parcel, l, Scope.CREATOR);
                    break;

                case 5: // '\005'
                    bundle = zza.j(parcel, l);
                    break;

                case 6: // '\006'
                    s = zza.h(parcel, l);
                    break;
                }
            } else
            if (parcel.dataPosition() != k)
            {
                throw new com.google.android.gms.common.internal.safeparcel.zza.zza((new StringBuilder("Overread allowed size end=")).append(k).toString(), parcel);
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
