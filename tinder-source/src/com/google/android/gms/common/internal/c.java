// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.common.internal;

import android.os.Parcel;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.internal.safeparcel.a;
import com.google.android.gms.common.internal.safeparcel.zza;

// Referenced classes of package com.google.android.gms.common.internal:
//            ValidateAccountRequest

public final class c
    implements android.os.Parcelable.Creator
{

    public c()
    {
    }

    static void a(ValidateAccountRequest validateaccountrequest, Parcel parcel, int i)
    {
        int j = com.google.android.gms.common.internal.safeparcel.a.a(parcel, 20293);
        com.google.android.gms.common.internal.safeparcel.a.b(parcel, 1, validateaccountrequest.a);
        com.google.android.gms.common.internal.safeparcel.a.b(parcel, 2, validateaccountrequest.b);
        com.google.android.gms.common.internal.safeparcel.a.a(parcel, 3, validateaccountrequest.c);
        com.google.android.gms.common.internal.safeparcel.a.a(parcel, 4, validateaccountrequest.d, i);
        com.google.android.gms.common.internal.safeparcel.a.a(parcel, 5, validateaccountrequest.e);
        com.google.android.gms.common.internal.safeparcel.a.a(parcel, 6, validateaccountrequest.f);
        com.google.android.gms.common.internal.safeparcel.a.b(parcel, j);
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
                    ibinder = zza.m(parcel, l);
                    break;

                case 4: // '\004'
                    ascope = (Scope[])zza.b(parcel, l, Scope.CREATOR);
                    break;

                case 5: // '\005'
                    bundle = zza.n(parcel, l);
                    break;

                case 6: // '\006'
                    s = zza.l(parcel, l);
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
