// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.auth;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.zzb;

// Referenced classes of package com.google.android.gms.auth:
//            AccountChangeEvent

public class zza
    implements android.os.Parcelable.Creator
{

    public zza()
    {
    }

    static void a(AccountChangeEvent accountchangeevent, Parcel parcel, int i)
    {
        i = zzb.a(parcel);
        zzb.a(parcel, 1, accountchangeevent.a);
        zzb.a(parcel, 2, accountchangeevent.b);
        zzb.a(parcel, 3, accountchangeevent.c, false);
        zzb.a(parcel, 4, accountchangeevent.d);
        zzb.a(parcel, 5, accountchangeevent.e);
        zzb.a(parcel, 6, accountchangeevent.f, false);
        zzb.a(parcel, i);
    }

    public AccountChangeEvent a(Parcel parcel)
    {
        String s = null;
        int i = 0;
        int l = com.google.android.gms.common.internal.safeparcel.zza.b(parcel);
        long l1 = 0L;
        int j = 0;
        String s1 = null;
        int k = 0;
        do
        {
            if (parcel.dataPosition() < l)
            {
                int i1 = com.google.android.gms.common.internal.safeparcel.zza.a(parcel);
                switch (com.google.android.gms.common.internal.safeparcel.zza.a(i1))
                {
                default:
                    com.google.android.gms.common.internal.safeparcel.zza.b(parcel, i1);
                    break;

                case 1: // '\001'
                    k = com.google.android.gms.common.internal.safeparcel.zza.f(parcel, i1);
                    break;

                case 2: // '\002'
                    l1 = com.google.android.gms.common.internal.safeparcel.zza.h(parcel, i1);
                    break;

                case 3: // '\003'
                    s1 = com.google.android.gms.common.internal.safeparcel.zza.m(parcel, i1);
                    break;

                case 4: // '\004'
                    j = com.google.android.gms.common.internal.safeparcel.zza.f(parcel, i1);
                    break;

                case 5: // '\005'
                    i = com.google.android.gms.common.internal.safeparcel.zza.f(parcel, i1);
                    break;

                case 6: // '\006'
                    s = com.google.android.gms.common.internal.safeparcel.zza.m(parcel, i1);
                    break;
                }
            } else
            if (parcel.dataPosition() != l)
            {
                throw new com.google.android.gms.common.internal.safeparcel.zza((new StringBuilder()).append("Overread allowed size end=").append(l).toString(), parcel);
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
