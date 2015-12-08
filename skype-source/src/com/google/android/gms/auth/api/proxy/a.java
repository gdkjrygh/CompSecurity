// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.auth.api.proxy;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.b;

// Referenced classes of package com.google.android.gms.auth.api.proxy:
//            ProxyGrpcRequest

public final class a
    implements android.os.Parcelable.Creator
{

    public a()
    {
    }

    static void a(ProxyGrpcRequest proxygrpcrequest, Parcel parcel)
    {
        int i = b.a(parcel);
        b.a(parcel, 1, proxygrpcrequest.b);
        b.a(parcel, 1000, proxygrpcrequest.a);
        b.a(parcel, 2, proxygrpcrequest.c);
        b.a(parcel, 3, proxygrpcrequest.d);
        b.a(parcel, 4, proxygrpcrequest.e);
        b.a(parcel, 5, proxygrpcrequest.f);
        b.a(parcel, i);
    }

    public final Object createFromParcel(Parcel parcel)
    {
        int i = 0;
        String s = null;
        int k = com.google.android.gms.common.internal.safeparcel.a.a(parcel);
        long l1 = 0L;
        byte abyte0[] = null;
        String s1 = null;
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
                    s1 = com.google.android.gms.common.internal.safeparcel.a.l(parcel, l);
                    break;

                case 1000: 
                    j = com.google.android.gms.common.internal.safeparcel.a.f(parcel, l);
                    break;

                case 2: // '\002'
                    i = com.google.android.gms.common.internal.safeparcel.a.f(parcel, l);
                    break;

                case 3: // '\003'
                    l1 = com.google.android.gms.common.internal.safeparcel.a.g(parcel, l);
                    break;

                case 4: // '\004'
                    abyte0 = com.google.android.gms.common.internal.safeparcel.a.o(parcel, l);
                    break;

                case 5: // '\005'
                    s = com.google.android.gms.common.internal.safeparcel.a.l(parcel, l);
                    break;
                }
            } else
            if (parcel.dataPosition() != k)
            {
                throw new com.google.android.gms.common.internal.safeparcel.a((new StringBuilder("Overread allowed size end=")).append(k).toString(), parcel);
            } else
            {
                return new ProxyGrpcRequest(j, s1, i, l1, abyte0, s);
            }
        } while (true);
    }

    public final Object[] newArray(int i)
    {
        return new ProxyGrpcRequest[i];
    }
}
