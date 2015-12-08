// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.auth.api.proxy;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.a;
import com.google.android.gms.common.internal.safeparcel.zza;

// Referenced classes of package com.google.android.gms.auth.api.proxy:
//            ProxyRequest

public final class b
    implements android.os.Parcelable.Creator
{

    public b()
    {
    }

    static void a(ProxyRequest proxyrequest, Parcel parcel)
    {
        int i = com.google.android.gms.common.internal.safeparcel.a.a(parcel, 20293);
        com.google.android.gms.common.internal.safeparcel.a.a(parcel, 1, proxyrequest.k);
        com.google.android.gms.common.internal.safeparcel.a.b(parcel, 1000, proxyrequest.j);
        com.google.android.gms.common.internal.safeparcel.a.b(parcel, 2, proxyrequest.l);
        com.google.android.gms.common.internal.safeparcel.a.a(parcel, 3, proxyrequest.m);
        com.google.android.gms.common.internal.safeparcel.a.a(parcel, 4, proxyrequest.n);
        com.google.android.gms.common.internal.safeparcel.a.a(parcel, 5, proxyrequest.o);
        com.google.android.gms.common.internal.safeparcel.a.b(parcel, i);
    }

    public final Object createFromParcel(Parcel parcel)
    {
        int i = 0;
        android.os.Bundle bundle = null;
        int k = zza.a(parcel);
        long l1 = 0L;
        byte abyte0[] = null;
        String s = null;
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
                    s = zza.l(parcel, l);
                    break;

                case 1000: 
                    j = zza.e(parcel, l);
                    break;

                case 2: // '\002'
                    i = zza.e(parcel, l);
                    break;

                case 3: // '\003'
                    l1 = zza.f(parcel, l);
                    break;

                case 4: // '\004'
                    abyte0 = zza.o(parcel, l);
                    break;

                case 5: // '\005'
                    bundle = zza.n(parcel, l);
                    break;
                }
            } else
            if (parcel.dataPosition() != k)
            {
                throw new com.google.android.gms.common.internal.safeparcel.zza.zza((new StringBuilder("Overread allowed size end=")).append(k).toString(), parcel);
            } else
            {
                return new ProxyRequest(j, s, i, l1, abyte0, bundle);
            }
        } while (true);
    }

    public final Object[] newArray(int i)
    {
        return new ProxyRequest[i];
    }
}
