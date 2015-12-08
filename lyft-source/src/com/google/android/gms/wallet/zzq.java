// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.wallet;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.zza;
import com.google.android.gms.common.internal.safeparcel.zzb;

// Referenced classes of package com.google.android.gms.wallet:
//            ProxyCard

public class zzq
    implements android.os.Parcelable.Creator
{

    public zzq()
    {
    }

    static void a(ProxyCard proxycard, Parcel parcel, int i)
    {
        i = zzb.a(parcel);
        zzb.a(parcel, 1, proxycard.a());
        zzb.a(parcel, 2, proxycard.a, false);
        zzb.a(parcel, 3, proxycard.b, false);
        zzb.a(parcel, 4, proxycard.c);
        zzb.a(parcel, 5, proxycard.d);
        zzb.a(parcel, i);
    }

    public ProxyCard a(Parcel parcel)
    {
        String s = null;
        int i = 0;
        int l = zza.b(parcel);
        int j = 0;
        String s1 = null;
        int k = 0;
        do
        {
            if (parcel.dataPosition() < l)
            {
                int i1 = zza.a(parcel);
                switch (zza.a(i1))
                {
                default:
                    zza.b(parcel, i1);
                    break;

                case 1: // '\001'
                    k = zza.f(parcel, i1);
                    break;

                case 2: // '\002'
                    s1 = zza.m(parcel, i1);
                    break;

                case 3: // '\003'
                    s = zza.m(parcel, i1);
                    break;

                case 4: // '\004'
                    j = zza.f(parcel, i1);
                    break;

                case 5: // '\005'
                    i = zza.f(parcel, i1);
                    break;
                }
            } else
            if (parcel.dataPosition() != l)
            {
                throw new com.google.android.gms.common.internal.safeparcel.zza.zza((new StringBuilder()).append("Overread allowed size end=").append(l).toString(), parcel);
            } else
            {
                return new ProxyCard(k, s1, s, j, i);
            }
        } while (true);
    }

    public ProxyCard[] a(int i)
    {
        return new ProxyCard[i];
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
