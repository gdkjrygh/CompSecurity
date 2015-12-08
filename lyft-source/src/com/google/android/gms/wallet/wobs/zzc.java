// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.wallet.wobs;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.zza;
import com.google.android.gms.common.internal.safeparcel.zzb;
import com.google.android.gms.internal.zzkx;

// Referenced classes of package com.google.android.gms.wallet.wobs:
//            LabelValueRow, LabelValue

public class zzc
    implements android.os.Parcelable.Creator
{

    public zzc()
    {
    }

    static void a(LabelValueRow labelvaluerow, Parcel parcel, int i)
    {
        i = zzb.a(parcel);
        zzb.a(parcel, 1, labelvaluerow.a());
        zzb.a(parcel, 2, labelvaluerow.a, false);
        zzb.a(parcel, 3, labelvaluerow.b, false);
        zzb.c(parcel, 4, labelvaluerow.c, false);
        zzb.a(parcel, i);
    }

    public LabelValueRow a(Parcel parcel)
    {
        String s1 = null;
        int j = zza.b(parcel);
        int i = 0;
        java.util.ArrayList arraylist = zzkx.a();
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

                case 4: // '\004'
                    arraylist = zza.c(parcel, k, LabelValue.CREATOR);
                    break;
                }
            } else
            if (parcel.dataPosition() != j)
            {
                throw new com.google.android.gms.common.internal.safeparcel.zza.zza((new StringBuilder()).append("Overread allowed size end=").append(j).toString(), parcel);
            } else
            {
                return new LabelValueRow(i, s, s1, arraylist);
            }
        } while (true);
    }

    public LabelValueRow[] a(int i)
    {
        return new LabelValueRow[i];
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
