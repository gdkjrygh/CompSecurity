// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.wallet;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.zza;
import com.google.android.gms.common.internal.safeparcel.zzb;

// Referenced classes of package com.google.android.gms.wallet:
//            InstrumentInfo

public class zzh
    implements android.os.Parcelable.Creator
{

    public zzh()
    {
    }

    static void a(InstrumentInfo instrumentinfo, Parcel parcel, int i)
    {
        i = zzb.a(parcel);
        zzb.a(parcel, 1, instrumentinfo.a());
        zzb.a(parcel, 2, instrumentinfo.b(), false);
        zzb.a(parcel, 3, instrumentinfo.c(), false);
        zzb.a(parcel, i);
    }

    public InstrumentInfo a(Parcel parcel)
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
                return new InstrumentInfo(i, s, s1);
            }
        } while (true);
    }

    public InstrumentInfo[] a(int i)
    {
        return new InstrumentInfo[i];
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
