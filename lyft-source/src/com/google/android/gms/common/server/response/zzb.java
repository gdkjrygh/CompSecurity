// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.common.server.response;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.zza;

public class zzb
    implements android.os.Parcelable.Creator
{

    public zzb()
    {
    }

    static void a(FieldMappingDictionary.FieldMapPair fieldmappair, Parcel parcel, int i)
    {
        int j = com.google.android.gms.common.internal.safeparcel.zzb.a(parcel);
        com.google.android.gms.common.internal.safeparcel.zzb.a(parcel, 1, fieldmappair.a);
        com.google.android.gms.common.internal.safeparcel.zzb.a(parcel, 2, fieldmappair.b, false);
        com.google.android.gms.common.internal.safeparcel.zzb.a(parcel, 3, fieldmappair.c, i, false);
        com.google.android.gms.common.internal.safeparcel.zzb.a(parcel, j);
    }

    public FieldMappingDictionary.FieldMapPair a(Parcel parcel)
    {
        FastJsonResponse.Field field = null;
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
                    field = (FastJsonResponse.Field)zza.a(parcel, k, FastJsonResponse.Field.CREATOR);
                    break;
                }
            } else
            if (parcel.dataPosition() != j)
            {
                throw new com.google.android.gms.common.internal.safeparcel.zza.zza((new StringBuilder()).append("Overread allowed size end=").append(j).toString(), parcel);
            } else
            {
                return new FieldMappingDictionary.FieldMapPair(i, s, field);
            }
        } while (true);
    }

    public FieldMappingDictionary.FieldMapPair[] a(int i)
    {
        return new FieldMappingDictionary.FieldMapPair[i];
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
