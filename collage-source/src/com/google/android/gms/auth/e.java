// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.auth;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.a;
import com.google.android.gms.common.internal.safeparcel.b;

// Referenced classes of package com.google.android.gms.auth:
//            AccountChangeEvent

public class e
    implements android.os.Parcelable.Creator
{

    public e()
    {
    }

    static void a(AccountChangeEvent accountchangeevent, Parcel parcel, int i)
    {
        i = b.a(parcel);
        b.a(parcel, 1, accountchangeevent.a);
        b.a(parcel, 2, accountchangeevent.b);
        b.a(parcel, 3, accountchangeevent.c, false);
        b.a(parcel, 4, accountchangeevent.d);
        b.a(parcel, 5, accountchangeevent.e);
        b.a(parcel, 6, accountchangeevent.f, false);
        b.a(parcel, i);
    }

    public AccountChangeEvent a(Parcel parcel)
    {
        String s = null;
        int i = 0;
        int l = com.google.android.gms.common.internal.safeparcel.a.b(parcel);
        long l1 = 0L;
        int j = 0;
        String s1 = null;
        int k = 0;
        do
        {
            if (parcel.dataPosition() < l)
            {
                int i1 = com.google.android.gms.common.internal.safeparcel.a.a(parcel);
                switch (com.google.android.gms.common.internal.safeparcel.a.a(i1))
                {
                default:
                    com.google.android.gms.common.internal.safeparcel.a.b(parcel, i1);
                    break;

                case 1: // '\001'
                    k = com.google.android.gms.common.internal.safeparcel.a.d(parcel, i1);
                    break;

                case 2: // '\002'
                    l1 = com.google.android.gms.common.internal.safeparcel.a.e(parcel, i1);
                    break;

                case 3: // '\003'
                    s1 = com.google.android.gms.common.internal.safeparcel.a.g(parcel, i1);
                    break;

                case 4: // '\004'
                    j = com.google.android.gms.common.internal.safeparcel.a.d(parcel, i1);
                    break;

                case 5: // '\005'
                    i = com.google.android.gms.common.internal.safeparcel.a.d(parcel, i1);
                    break;

                case 6: // '\006'
                    s = com.google.android.gms.common.internal.safeparcel.a.g(parcel, i1);
                    break;
                }
            } else
            if (parcel.dataPosition() != l)
            {
                throw new com.google.android.gms.common.internal.safeparcel.a.a((new StringBuilder()).append("Overread allowed size end=").append(l).toString(), parcel);
            } else
            {
                return new AccountChangeEvent(k, l1, s1, j, i, s);
            }
        } while (true);
    }

    public AccountChangeEvent[] a(int i)
    {
        return new AccountChangeEvent[i];
    }

    public Object createFromParcel(Parcel parcel)
    {
        return a(parcel);
    }

    public Object[] newArray(int i)
    {
        return a(i);
    }
}
