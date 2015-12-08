// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.auth.api.proxy;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.zza;

// Referenced classes of package com.google.android.gms.auth.api.proxy:
//            ProxyRequest

public class zzb
    implements android.os.Parcelable.Creator
{

    public zzb()
    {
    }

    static void a(ProxyRequest proxyrequest, Parcel parcel, int i)
    {
        i = com.google.android.gms.common.internal.safeparcel.zzb.a(parcel);
        com.google.android.gms.common.internal.safeparcel.zzb.a(parcel, 1, proxyrequest.k, false);
        com.google.android.gms.common.internal.safeparcel.zzb.a(parcel, 1000, proxyrequest.j);
        com.google.android.gms.common.internal.safeparcel.zzb.a(parcel, 2, proxyrequest.l);
        com.google.android.gms.common.internal.safeparcel.zzb.a(parcel, 3, proxyrequest.m);
        com.google.android.gms.common.internal.safeparcel.zzb.a(parcel, 4, proxyrequest.n, false);
        com.google.android.gms.common.internal.safeparcel.zzb.a(parcel, 5, proxyrequest.o, false);
        com.google.android.gms.common.internal.safeparcel.zzb.a(parcel, i);
    }

    public ProxyRequest a(Parcel parcel)
    {
        int i = 0;
        android.os.Bundle bundle = null;
        int k = zza.b(parcel);
        long l1 = 0L;
        byte abyte0[] = null;
        String s = null;
        int j = 0;
        do
        {
            if (parcel.dataPosition() < k)
            {
                int l = zza.a(parcel);
                switch (zza.a(l))
                {
                default:
                    zza.b(parcel, l);
                    break;

                case 1: // '\001'
                    s = zza.m(parcel, l);
                    break;

                case 1000: 
                    j = zza.f(parcel, l);
                    break;

                case 2: // '\002'
                    i = zza.f(parcel, l);
                    break;

                case 3: // '\003'
                    l1 = zza.h(parcel, l);
                    break;

                case 4: // '\004'
                    abyte0 = zza.p(parcel, l);
                    break;

                case 5: // '\005'
                    bundle = zza.o(parcel, l);
                    break;
                }
            } else
            if (parcel.dataPosition() != k)
            {
                throw new com.google.android.gms.common.internal.safeparcel.zza.zza((new StringBuilder()).append("Overread allowed size end=").append(k).toString(), parcel);
            } else
            {
                return new ProxyRequest(j, s, i, l1, abyte0, bundle);
            }
        } while (true);
    }

    public ProxyRequest[] a(int i)
    {
        return new ProxyRequest[i];
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
