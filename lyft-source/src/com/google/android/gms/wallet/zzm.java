// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.wallet;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.zza;
import com.google.android.gms.common.internal.safeparcel.zzb;

// Referenced classes of package com.google.android.gms.wallet:
//            NotifyTransactionStatusRequest

public class zzm
    implements android.os.Parcelable.Creator
{

    public zzm()
    {
    }

    static void a(NotifyTransactionStatusRequest notifytransactionstatusrequest, Parcel parcel, int i)
    {
        i = zzb.a(parcel);
        zzb.a(parcel, 1, notifytransactionstatusrequest.a);
        zzb.a(parcel, 2, notifytransactionstatusrequest.b, false);
        zzb.a(parcel, 3, notifytransactionstatusrequest.c);
        zzb.a(parcel, 4, notifytransactionstatusrequest.d, false);
        zzb.a(parcel, i);
    }

    public NotifyTransactionStatusRequest a(Parcel parcel)
    {
        String s1 = null;
        int j = 0;
        int k = zza.b(parcel);
        String s = null;
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
                    s = zza.m(parcel, l);
                    break;

                case 3: // '\003'
                    j = zza.f(parcel, l);
                    break;

                case 4: // '\004'
                    s1 = zza.m(parcel, l);
                    break;
                }
            } else
            if (parcel.dataPosition() != k)
            {
                throw new com.google.android.gms.common.internal.safeparcel.zza.zza((new StringBuilder()).append("Overread allowed size end=").append(k).toString(), parcel);
            } else
            {
                return new NotifyTransactionStatusRequest(i, s, j, s1);
            }
        } while (true);
    }

    public NotifyTransactionStatusRequest[] a(int i)
    {
        return new NotifyTransactionStatusRequest[i];
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
