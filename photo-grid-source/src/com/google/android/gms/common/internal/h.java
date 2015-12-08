// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.common.internal;

import android.os.Parcel;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.internal.safeparcel.a;
import com.google.android.gms.common.internal.safeparcel.b;
import com.google.android.gms.common.internal.safeparcel.c;

// Referenced classes of package com.google.android.gms.common.internal:
//            AuthAccountRequest

public final class h
    implements android.os.Parcelable.Creator
{

    public h()
    {
    }

    static void a(AuthAccountRequest authaccountrequest, Parcel parcel, int i)
    {
        int j = c.a(parcel);
        c.a(parcel, 1, authaccountrequest.a);
        c.a(parcel, 2, authaccountrequest.b);
        c.a(parcel, 3, authaccountrequest.c, i);
        c.a(parcel, j);
    }

    public final Object createFromParcel(Parcel parcel)
    {
        Scope ascope[] = null;
        int j = com.google.android.gms.common.internal.safeparcel.a.a(parcel);
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
                    com.google.android.gms.common.internal.safeparcel.a.b(parcel, k);
                    break;

                case 1: // '\001'
                    i = com.google.android.gms.common.internal.safeparcel.a.d(parcel, k);
                    break;

                case 2: // '\002'
                    ibinder = com.google.android.gms.common.internal.safeparcel.a.k(parcel, k);
                    break;

                case 3: // '\003'
                    ascope = (Scope[])com.google.android.gms.common.internal.safeparcel.a.b(parcel, k, Scope.CREATOR);
                    break;
                }
            } else
            if (parcel.dataPosition() != j)
            {
                throw new b((new StringBuilder("Overread allowed size end=")).append(j).toString(), parcel);
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
