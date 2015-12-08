// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.common.internal;

import android.os.Parcel;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.internal.safeparcel.a;
import com.google.android.gms.common.internal.safeparcel.b;

// Referenced classes of package com.google.android.gms.common.internal:
//            ValidateAccountRequest

public final class d
    implements android.os.Parcelable.Creator
{

    public d()
    {
    }

    static void a(ValidateAccountRequest validateaccountrequest, Parcel parcel, int i)
    {
        int j = b.a(parcel);
        b.a(parcel, 1, validateaccountrequest.a);
        b.a(parcel, 2, validateaccountrequest.a());
        b.a(parcel, 3, validateaccountrequest.b);
        b.a(parcel, 4, validateaccountrequest.b(), i);
        b.a(parcel, 5, validateaccountrequest.d());
        b.a(parcel, 6, validateaccountrequest.c());
        b.a(parcel, j);
    }

    public final Object createFromParcel(Parcel parcel)
    {
        int i = 0;
        String s = null;
        int k = com.google.android.gms.common.internal.safeparcel.a.a(parcel);
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
                    com.google.android.gms.common.internal.safeparcel.a.b(parcel, l);
                    break;

                case 1: // '\001'
                    j = com.google.android.gms.common.internal.safeparcel.a.f(parcel, l);
                    break;

                case 2: // '\002'
                    i = com.google.android.gms.common.internal.safeparcel.a.f(parcel, l);
                    break;

                case 3: // '\003'
                    ibinder = com.google.android.gms.common.internal.safeparcel.a.m(parcel, l);
                    break;

                case 4: // '\004'
                    ascope = (Scope[])com.google.android.gms.common.internal.safeparcel.a.b(parcel, l, Scope.CREATOR);
                    break;

                case 5: // '\005'
                    bundle = com.google.android.gms.common.internal.safeparcel.a.n(parcel, l);
                    break;

                case 6: // '\006'
                    s = com.google.android.gms.common.internal.safeparcel.a.l(parcel, l);
                    break;
                }
            } else
            if (parcel.dataPosition() != k)
            {
                throw new com.google.android.gms.common.internal.safeparcel.a.a((new StringBuilder("Overread allowed size end=")).append(k).toString(), parcel);
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
