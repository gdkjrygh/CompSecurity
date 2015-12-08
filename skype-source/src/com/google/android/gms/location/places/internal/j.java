// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.location.places.internal;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.a;
import com.google.android.gms.common.internal.safeparcel.b;

public final class j
    implements android.os.Parcelable.Creator
{

    public j()
    {
    }

    static void a(AutocompletePredictionEntity.SubstringEntity substringentity, Parcel parcel)
    {
        int i = b.a(parcel);
        b.a(parcel, 1, substringentity.b);
        b.a(parcel, 1000, substringentity.a);
        b.a(parcel, 2, substringentity.c);
        b.a(parcel, i);
    }

    public final Object createFromParcel(Parcel parcel)
    {
        int l = 0;
        int i1 = com.google.android.gms.common.internal.safeparcel.a.a(parcel);
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
                    com.google.android.gms.common.internal.safeparcel.a.b(parcel, j1);
                    break;

                case 1: // '\001'
                    k = com.google.android.gms.common.internal.safeparcel.a.f(parcel, j1);
                    break;

                case 1000: 
                    i = com.google.android.gms.common.internal.safeparcel.a.f(parcel, j1);
                    break;

                case 2: // '\002'
                    l = com.google.android.gms.common.internal.safeparcel.a.f(parcel, j1);
                    break;
                }
            } else
            if (parcel.dataPosition() != i1)
            {
                throw new com.google.android.gms.common.internal.safeparcel.a.a((new StringBuilder("Overread allowed size end=")).append(i1).toString(), parcel);
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
