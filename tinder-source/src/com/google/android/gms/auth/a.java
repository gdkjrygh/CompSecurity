// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.auth;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.zza;

// Referenced classes of package com.google.android.gms.auth:
//            AccountChangeEvent

public final class a
    implements android.os.Parcelable.Creator
{

    public a()
    {
    }

    static void a(AccountChangeEvent accountchangeevent, Parcel parcel)
    {
        int i = com.google.android.gms.common.internal.safeparcel.a.a(parcel, 20293);
        com.google.android.gms.common.internal.safeparcel.a.b(parcel, 1, accountchangeevent.a);
        com.google.android.gms.common.internal.safeparcel.a.a(parcel, 2, accountchangeevent.b);
        com.google.android.gms.common.internal.safeparcel.a.a(parcel, 3, accountchangeevent.c);
        com.google.android.gms.common.internal.safeparcel.a.b(parcel, 4, accountchangeevent.d);
        com.google.android.gms.common.internal.safeparcel.a.b(parcel, 5, accountchangeevent.e);
        com.google.android.gms.common.internal.safeparcel.a.a(parcel, 6, accountchangeevent.f);
        com.google.android.gms.common.internal.safeparcel.a.b(parcel, i);
    }

    public final Object createFromParcel(Parcel parcel)
    {
        String s = null;
        int i = 0;
        int l = zza.a(parcel);
        long l1 = 0L;
        int j = 0;
        String s1 = null;
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
                    l1 = zza.f(parcel, i1);
                    break;

                case 3: // '\003'
                    s1 = zza.l(parcel, i1);
                    break;

                case 4: // '\004'
                    j = zza.e(parcel, i1);
                    break;

                case 5: // '\005'
                    i = zza.e(parcel, i1);
                    break;

                case 6: // '\006'
                    s = zza.l(parcel, i1);
                    break;
                }
            } else
            if (parcel.dataPosition() != l)
            {
                throw new com.google.android.gms.common.internal.safeparcel.zza.zza((new StringBuilder("Overread allowed size end=")).append(l).toString(), parcel);
            } else
            {
                return new AccountChangeEvent(k, l1, s1, j, i, s);
            }
        } while (true);
    }

    public final Object[] newArray(int i)
    {
        return new AccountChangeEvent[i];
    }
}
