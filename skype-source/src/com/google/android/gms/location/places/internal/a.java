// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.location.places.internal;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.b;

// Referenced classes of package com.google.android.gms.location.places.internal:
//            AutocompletePredictionEntity

public final class a
    implements android.os.Parcelable.Creator
{

    public a()
    {
    }

    static void a(AutocompletePredictionEntity autocompletepredictionentity, Parcel parcel)
    {
        int i = b.a(parcel);
        b.a(parcel, 1, autocompletepredictionentity.b);
        b.a(parcel, 1000, autocompletepredictionentity.a);
        b.a(parcel, 2, autocompletepredictionentity.c);
        b.a(parcel, 3, autocompletepredictionentity.d);
        b.c(parcel, 4, autocompletepredictionentity.e);
        b.a(parcel, 5, autocompletepredictionentity.f);
        b.a(parcel, i);
    }

    public final Object createFromParcel(Parcel parcel)
    {
        int i = 0;
        java.util.ArrayList arraylist = null;
        int k = com.google.android.gms.common.internal.safeparcel.a.a(parcel);
        java.util.ArrayList arraylist1 = null;
        String s = null;
        String s1 = null;
        int j = 0;
        do
        {
            if (parcel.dataPosition() < k)
            {
                int l = parcel.readInt();
                switch (0xffff & l)
                {
                default:
                    com.google.android.gms.common.internal.safeparcel.a.b(parcel, l);
                    break;

                case 1: // '\001'
                    s1 = com.google.android.gms.common.internal.safeparcel.a.l(parcel, l);
                    break;

                case 1000: 
                    j = com.google.android.gms.common.internal.safeparcel.a.f(parcel, l);
                    break;

                case 2: // '\002'
                    s = com.google.android.gms.common.internal.safeparcel.a.l(parcel, l);
                    break;

                case 3: // '\003'
                    arraylist1 = com.google.android.gms.common.internal.safeparcel.a.s(parcel, l);
                    break;

                case 4: // '\004'
                    arraylist = com.google.android.gms.common.internal.safeparcel.a.c(parcel, l, AutocompletePredictionEntity.SubstringEntity.CREATOR);
                    break;

                case 5: // '\005'
                    i = com.google.android.gms.common.internal.safeparcel.a.f(parcel, l);
                    break;
                }
            } else
            if (parcel.dataPosition() != k)
            {
                throw new com.google.android.gms.common.internal.safeparcel.a((new StringBuilder("Overread allowed size end=")).append(k).toString(), parcel);
            } else
            {
                return new AutocompletePredictionEntity(j, s1, s, arraylist1, arraylist, i);
            }
        } while (true);
    }

    public final Object[] newArray(int i)
    {
        return new AutocompletePredictionEntity[i];
    }
}
