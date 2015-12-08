// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.wallet.wobs;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.zza;

// Referenced classes of package com.google.android.gms.wallet.wobs:
//            LabelValue

public class zzb
    implements android.os.Parcelable.Creator
{

    public zzb()
    {
    }

    static void a(LabelValue labelvalue, Parcel parcel, int i)
    {
        i = com.google.android.gms.common.internal.safeparcel.zzb.a(parcel);
        com.google.android.gms.common.internal.safeparcel.zzb.a(parcel, 1, labelvalue.a());
        com.google.android.gms.common.internal.safeparcel.zzb.a(parcel, 2, labelvalue.a, false);
        com.google.android.gms.common.internal.safeparcel.zzb.a(parcel, 3, labelvalue.b, false);
        com.google.android.gms.common.internal.safeparcel.zzb.a(parcel, i);
    }

    public LabelValue a(Parcel parcel)
    {
        String s1 = null;
        int j = zza.b(parcel);
        int i = 0;
        String s = null;
        do
        {
            if (parcel.dataPosition() < j)
            {
                int k = zza.a(parcel);
                switch (zza.a(k))
                {
                default:
                    zza.b(parcel, k);
                    break;

                case 1: // '\001'
                    i = zza.f(parcel, k);
                    break;

                case 2: // '\002'
                    s = zza.m(parcel, k);
                    break;

                case 3: // '\003'
                    s1 = zza.m(parcel, k);
                    break;
                }
            } else
            if (parcel.dataPosition() != j)
            {
                throw new com.google.android.gms.common.internal.safeparcel.zza.zza((new StringBuilder()).append("Overread allowed size end=").append(j).toString(), parcel);
            } else
            {
                return new LabelValue(i, s, s1);
            }
        } while (true);
    }

    public LabelValue[] a(int i)
    {
        return new LabelValue[i];
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
