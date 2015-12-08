// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.common;

import android.app.PendingIntent;
import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.zza;

// Referenced classes of package com.google.android.gms.common:
//            ConnectionResult

public class zzb
    implements android.os.Parcelable.Creator
{

    public zzb()
    {
    }

    static void a(ConnectionResult connectionresult, Parcel parcel, int i)
    {
        int j = com.google.android.gms.common.internal.safeparcel.zzb.a(parcel);
        com.google.android.gms.common.internal.safeparcel.zzb.a(parcel, 1, connectionresult.b);
        com.google.android.gms.common.internal.safeparcel.zzb.a(parcel, 2, connectionresult.c());
        com.google.android.gms.common.internal.safeparcel.zzb.a(parcel, 3, connectionresult.d(), i, false);
        com.google.android.gms.common.internal.safeparcel.zzb.a(parcel, j);
    }

    public ConnectionResult a(Parcel parcel)
    {
        int j = 0;
        int k = zza.b(parcel);
        PendingIntent pendingintent = null;
        int i = 0;
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
                    i = zza.f(parcel, l);
                    break;

                case 2: // '\002'
                    j = zza.f(parcel, l);
                    break;

                case 3: // '\003'
                    pendingintent = (PendingIntent)zza.a(parcel, l, PendingIntent.CREATOR);
                    break;
                }
            } else
            if (parcel.dataPosition() != k)
            {
                throw new com.google.android.gms.common.internal.safeparcel.zza.zza((new StringBuilder()).append("Overread allowed size end=").append(k).toString(), parcel);
            } else
            {
                return new ConnectionResult(i, j, pendingintent);
            }
        } while (true);
    }

    public ConnectionResult[] a(int i)
    {
        return new ConnectionResult[i];
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
