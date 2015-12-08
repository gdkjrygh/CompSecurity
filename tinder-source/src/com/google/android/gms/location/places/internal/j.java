// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.location.places.internal;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.a;
import com.google.android.gms.common.internal.safeparcel.zza;

public final class j
    implements android.os.Parcelable.Creator
{

    public j()
    {
    }

    static void a(AutocompletePredictionEntity.SubstringEntity substringentity, Parcel parcel)
    {
        int i = com.google.android.gms.common.internal.safeparcel.a.a(parcel, 20293);
        com.google.android.gms.common.internal.safeparcel.a.b(parcel, 1, substringentity.b);
        com.google.android.gms.common.internal.safeparcel.a.b(parcel, 1000, substringentity.a);
        com.google.android.gms.common.internal.safeparcel.a.b(parcel, 2, substringentity.c);
        com.google.android.gms.common.internal.safeparcel.a.b(parcel, i);
    }

    public final Object createFromParcel(Parcel parcel)
    {
        int l = 0;
        int i1 = zza.a(parcel);
        int k = 0;
        int i = 0;
        do
        {
            if (parcel.dataPosition() < i1)
            {
                int j1 = parcel.readInt();
                switch (0xffff & j1)
                {
                default:
                    zza.b(parcel, j1);
                    break;

                case 1: // '\001'
                    k = zza.e(parcel, j1);
                    break;

                case 1000: 
                    i = zza.e(parcel, j1);
                    break;

                case 2: // '\002'
                    l = zza.e(parcel, j1);
                    break;
                }
            } else
            if (parcel.dataPosition() != i1)
            {
                throw new com.google.android.gms.common.internal.safeparcel.zza.zza((new StringBuilder("Overread allowed size end=")).append(i1).toString(), parcel);
            } else
            {
                return new AutocompletePredictionEntity.SubstringEntity(i, k, l);
            }
        } while (true);
    }

    public final Object[] newArray(int i)
    {
        return new AutocompletePredictionEntity.SubstringEntity[i];
    }
}
