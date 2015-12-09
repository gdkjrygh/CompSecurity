// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.common.server.response;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.zzb;
import com.google.android.gms.common.server.converter.ConverterWrapper;

public class zza
    implements android.os.Parcelable.Creator
{

    public zza()
    {
    }

    static void zza(FastJsonResponse.Field field, Parcel parcel, int i)
    {
        int j = zzb.zzM(parcel);
        zzb.zzc(parcel, 1, field.getVersionCode());
        zzb.zzc(parcel, 2, field.zzmw());
        zzb.zza(parcel, 3, field.zzmC());
        zzb.zzc(parcel, 4, field.zzmx());
        zzb.zza(parcel, 5, field.zzmD());
        zzb.zza(parcel, 6, field.zzmE(), false);
        zzb.zzc(parcel, 7, field.zzmF());
        zzb.zza(parcel, 8, field.zzmH(), false);
        zzb.zza(parcel, 9, field.zzmJ(), i, false);
        zzb.zzH(parcel, j);
    }

    public Object createFromParcel(Parcel parcel)
    {
        return zzR(parcel);
    }

    public Object[] newArray(int i)
    {
        return zzbb(i);
    }

    public FastJsonResponse.Field zzR(Parcel parcel)
    {
        ConverterWrapper converterwrapper = null;
        int i = 0;
        int i1 = com.google.android.gms.common.internal.safeparcel.zza.zzL(parcel);
        String s = null;
        String s1 = null;
        boolean flag = false;
        int j = 0;
        boolean flag1 = false;
        int k = 0;
        int l = 0;
        do
        {
            if (parcel.dataPosition() < i1)
            {
                int j1 = com.google.android.gms.common.internal.safeparcel.zza.zzK(parcel);
                switch (com.google.android.gms.common.internal.safeparcel.zza.zzaV(j1))
                {
                default:
                    com.google.android.gms.common.internal.safeparcel.zza.zzb(parcel, j1);
                    break;

                case 1: // '\001'
                    l = com.google.android.gms.common.internal.safeparcel.zza.zzg(parcel, j1);
                    break;

                case 2: // '\002'
                    k = com.google.android.gms.common.internal.safeparcel.zza.zzg(parcel, j1);
                    break;

                case 3: // '\003'
                    flag1 = com.google.android.gms.common.internal.safeparcel.zza.zzc(parcel, j1);
                    break;

                case 4: // '\004'
                    j = com.google.android.gms.common.internal.safeparcel.zza.zzg(parcel, j1);
                    break;

                case 5: // '\005'
                    flag = com.google.android.gms.common.internal.safeparcel.zza.zzc(parcel, j1);
                    break;

                case 6: // '\006'
                    s1 = com.google.android.gms.common.internal.safeparcel.zza.zzo(parcel, j1);
                    break;

                case 7: // '\007'
                    i = com.google.android.gms.common.internal.safeparcel.zza.zzg(parcel, j1);
                    break;

                case 8: // '\b'
                    s = com.google.android.gms.common.internal.safeparcel.zza.zzo(parcel, j1);
                    break;

                case 9: // '\t'
                    converterwrapper = (ConverterWrapper)com.google.android.gms.common.internal.safeparcel.zza.zza(parcel, j1, ConverterWrapper.CREATOR);
                    break;
                }
            } else
            if (parcel.dataPosition() != i1)
            {
                throw new com.google.android.gms.common.internal.safeparcel.zza((new StringBuilder()).append("Overread allowed size end=").append(i1).toString(), parcel);
            } else
            {
                return new FastJsonResponse.Field(l, k, flag1, j, flag, s1, i, s, converterwrapper);
            }
        } while (true);
    }

    public FastJsonResponse.Field[] zzbb(int i)
    {
        return new FastJsonResponse.Field[i];
    }
}
