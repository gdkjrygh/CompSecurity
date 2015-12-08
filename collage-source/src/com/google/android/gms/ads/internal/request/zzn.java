// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.ads.internal.request;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.a;
import com.google.android.gms.common.internal.safeparcel.b;

// Referenced classes of package com.google.android.gms.ads.internal.request:
//            StringParcel

public class zzn
    implements android.os.Parcelable.Creator
{

    public zzn()
    {
    }

    static void zza(StringParcel stringparcel, Parcel parcel, int i)
    {
        i = b.a(parcel);
        b.a(parcel, 1, stringparcel.mVersionCode);
        b.a(parcel, 2, stringparcel.zzvx, false);
        b.a(parcel, i);
    }

    public Object createFromParcel(Parcel parcel)
    {
        return zzn(parcel);
    }

    public Object[] newArray(int i)
    {
        return zzG(i);
    }

    public StringParcel[] zzG(int i)
    {
        return new StringParcel[i];
    }

    public StringParcel zzn(Parcel parcel)
    {
        int j = a.b(parcel);
        int i = 0;
        String s = null;
        do
        {
            if (parcel.dataPosition() < j)
            {
                int k = a.a(parcel);
                switch (a.a(k))
                {
                default:
                    a.b(parcel, k);
                    break;

                case 1: // '\001'
                    i = a.d(parcel, k);
                    break;

                case 2: // '\002'
                    s = a.g(parcel, k);
                    break;
                }
            } else
            if (parcel.dataPosition() != j)
            {
                throw new com.google.android.gms.common.internal.safeparcel.a.a((new StringBuilder()).append("Overread allowed size end=").append(j).toString(), parcel);
            } else
            {
                return new StringParcel(i, s);
            }
        } while (true);
    }
}
