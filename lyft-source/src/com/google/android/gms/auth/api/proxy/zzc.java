// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.auth.api.proxy;

import android.app.PendingIntent;
import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.zza;
import com.google.android.gms.common.internal.safeparcel.zzb;

// Referenced classes of package com.google.android.gms.auth.api.proxy:
//            ProxyResponse

public class zzc
    implements android.os.Parcelable.Creator
{

    public zzc()
    {
    }

    static void a(ProxyResponse proxyresponse, Parcel parcel, int i)
    {
        int j = zzb.a(parcel);
        zzb.a(parcel, 1, proxyresponse.b);
        zzb.a(parcel, 1000, proxyresponse.a);
        zzb.a(parcel, 2, proxyresponse.c, i, false);
        zzb.a(parcel, 3, proxyresponse.d);
        zzb.a(parcel, 4, proxyresponse.e, false);
        zzb.a(parcel, 5, proxyresponse.f, false);
        zzb.a(parcel, j);
    }

    public ProxyResponse a(Parcel parcel)
    {
        byte abyte0[] = null;
        int i = 0;
        int l = zza.b(parcel);
        android.os.Bundle bundle = null;
        PendingIntent pendingintent = null;
        int j = 0;
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
                    j = zza.f(parcel, i1);
                    break;

                case 1000: 
                    k = zza.f(parcel, i1);
                    break;

                case 2: // '\002'
                    pendingintent = (PendingIntent)zza.a(parcel, i1, PendingIntent.CREATOR);
                    break;

                case 3: // '\003'
                    i = zza.f(parcel, i1);
                    break;

                case 4: // '\004'
                    bundle = zza.o(parcel, i1);
                    break;

                case 5: // '\005'
                    abyte0 = zza.p(parcel, i1);
                    break;
                }
            } else
            if (parcel.dataPosition() != l)
            {
                throw new com.google.android.gms.common.internal.safeparcel.zza.zza((new StringBuilder()).append("Overread allowed size end=").append(l).toString(), parcel);
            } else
            {
                return new ProxyResponse(k, j, pendingintent, i, bundle, abyte0);
            }
        } while (true);
    }

    public ProxyResponse[] a(int i)
    {
        return new ProxyResponse[i];
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
