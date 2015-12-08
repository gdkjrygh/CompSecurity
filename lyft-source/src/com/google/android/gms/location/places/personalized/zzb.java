// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.location.places.personalized;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.zza;

// Referenced classes of package com.google.android.gms.location.places.personalized:
//            HereContent

public class zzb
    implements android.os.Parcelable.Creator
{

    public zzb()
    {
    }

    static void a(HereContent herecontent, Parcel parcel, int i)
    {
        i = com.google.android.gms.common.internal.safeparcel.zzb.a(parcel);
        com.google.android.gms.common.internal.safeparcel.zzb.a(parcel, 1, herecontent.a(), false);
        com.google.android.gms.common.internal.safeparcel.zzb.a(parcel, 1000, herecontent.a);
        com.google.android.gms.common.internal.safeparcel.zzb.c(parcel, 2, herecontent.b(), false);
        com.google.android.gms.common.internal.safeparcel.zzb.a(parcel, i);
    }

    public HereContent a(Parcel parcel)
    {
        java.util.ArrayList arraylist = null;
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
                    s = zza.m(parcel, k);
                    break;

                case 1000: 
                    i = zza.f(parcel, k);
                    break;

                case 2: // '\002'
                    arraylist = zza.c(parcel, k, HereContent.Action.CREATOR);
                    break;
                }
            } else
            if (parcel.dataPosition() != j)
            {
                throw new com.google.android.gms.common.internal.safeparcel.zza.zza((new StringBuilder()).append("Overread allowed size end=").append(j).toString(), parcel);
            } else
            {
                return new HereContent(i, s, arraylist);
            }
        } while (true);
    }

    public HereContent[] a(int i)
    {
        return new HereContent[i];
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
