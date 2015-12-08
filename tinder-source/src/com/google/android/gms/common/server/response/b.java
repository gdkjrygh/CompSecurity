// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.common.server.response;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.a;
import com.google.android.gms.common.internal.safeparcel.zza;

public final class b
    implements android.os.Parcelable.Creator
{

    public b()
    {
    }

    static void a(FieldMappingDictionary.FieldMapPair fieldmappair, Parcel parcel, int i)
    {
        int j = com.google.android.gms.common.internal.safeparcel.a.a(parcel, 20293);
        com.google.android.gms.common.internal.safeparcel.a.b(parcel, 1, fieldmappair.a);
        com.google.android.gms.common.internal.safeparcel.a.a(parcel, 2, fieldmappair.b);
        com.google.android.gms.common.internal.safeparcel.a.a(parcel, 3, fieldmappair.c, i);
        com.google.android.gms.common.internal.safeparcel.a.b(parcel, j);
    }

    public final Object createFromParcel(Parcel parcel)
    {
        FastJsonResponse.Field field = null;
        int j = zza.a(parcel);
        int i = 0;
        String s = null;
        do
        {
            if (parcel.dataPosition() < j)
            {
                int k = parcel.readInt();
                switch (0xffff & k)
                {
                default:
                    zza.b(parcel, k);
                    break;

                case 1: // '\001'
                    i = zza.e(parcel, k);
                    break;

                case 2: // '\002'
                    s = zza.l(parcel, k);
                    break;

                case 3: // '\003'
                    field = (FastJsonResponse.Field)zza.a(parcel, k, FastJsonResponse.Field.CREATOR);
                    break;
                }
            } else
            if (parcel.dataPosition() != j)
            {
                throw new com.google.android.gms.common.internal.safeparcel.zza.zza((new StringBuilder("Overread allowed size end=")).append(j).toString(), parcel);
            } else
            {
                return new FieldMappingDictionary.FieldMapPair(i, s, field);
            }
        } while (true);
    }

    public final Object[] newArray(int i)
    {
        return new FieldMappingDictionary.FieldMapPair[i];
    }
}
