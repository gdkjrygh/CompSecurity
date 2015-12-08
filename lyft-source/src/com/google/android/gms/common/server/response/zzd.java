// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.common.server.response;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.zza;
import com.google.android.gms.common.internal.safeparcel.zzb;

public class zzd
    implements android.os.Parcelable.Creator
{

    public zzd()
    {
    }

    static void a(FieldMappingDictionary.Entry entry, Parcel parcel, int i)
    {
        i = zzb.a(parcel);
        zzb.a(parcel, 1, entry.a);
        zzb.a(parcel, 2, entry.b, false);
        zzb.c(parcel, 3, entry.c, false);
        zzb.a(parcel, i);
    }

    public FieldMappingDictionary.Entry a(Parcel parcel)
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
                    i = zza.f(parcel, k);
                    break;

                case 2: // '\002'
                    s = zza.m(parcel, k);
                    break;

                case 3: // '\003'
                    arraylist = zza.c(parcel, k, FieldMappingDictionary.FieldMapPair.CREATOR);
                    break;
                }
            } else
            if (parcel.dataPosition() != j)
            {
                throw new com.google.android.gms.common.internal.safeparcel.zza.zza((new StringBuilder()).append("Overread allowed size end=").append(j).toString(), parcel);
            } else
            {
                return new FieldMappingDictionary.Entry(i, s, arraylist);
            }
        } while (true);
    }

    public FieldMappingDictionary.Entry[] a(int i)
    {
        return new FieldMappingDictionary.Entry[i];
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
