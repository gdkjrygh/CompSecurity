// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.location.places.internal;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.zza;

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
        int i = com.google.android.gms.common.internal.safeparcel.a.a(parcel, 20293);
        com.google.android.gms.common.internal.safeparcel.a.a(parcel, 1, autocompletepredictionentity.b);
        com.google.android.gms.common.internal.safeparcel.a.b(parcel, 1000, autocompletepredictionentity.a);
        com.google.android.gms.common.internal.safeparcel.a.a(parcel, 2, autocompletepredictionentity.c);
        com.google.android.gms.common.internal.safeparcel.a.a(parcel, 3, autocompletepredictionentity.d);
        com.google.android.gms.common.internal.safeparcel.a.c(parcel, 4, autocompletepredictionentity.e);
        com.google.android.gms.common.internal.safeparcel.a.b(parcel, 5, autocompletepredictionentity.f);
        com.google.android.gms.common.internal.safeparcel.a.a(parcel, 6, autocompletepredictionentity.g);
        com.google.android.gms.common.internal.safeparcel.a.c(parcel, 7, autocompletepredictionentity.h);
        com.google.android.gms.common.internal.safeparcel.a.a(parcel, 8, autocompletepredictionentity.i);
        com.google.android.gms.common.internal.safeparcel.a.c(parcel, 9, autocompletepredictionentity.j);
        com.google.android.gms.common.internal.safeparcel.a.b(parcel, i);
    }

    public final Object createFromParcel(Parcel parcel)
    {
        int i = 0;
        java.util.ArrayList arraylist = null;
        int k = zza.a(parcel);
        String s = null;
        java.util.ArrayList arraylist1 = null;
        String s1 = null;
        java.util.ArrayList arraylist2 = null;
        String s2 = null;
        java.util.ArrayList arraylist3 = null;
        String s3 = null;
        int j = 0;
        do
        {
            if (parcel.dataPosition() < k)
            {
                int l = parcel.readInt();
                switch (0xffff & l)
                {
                default:
                    zza.b(parcel, l);
                    break;

                case 1: // '\001'
                    s2 = zza.l(parcel, l);
                    break;

                case 1000: 
                    j = zza.e(parcel, l);
                    break;

                case 2: // '\002'
                    s3 = zza.l(parcel, l);
                    break;

                case 3: // '\003'
                    arraylist3 = zza.s(parcel, l);
                    break;

                case 4: // '\004'
                    arraylist2 = zza.c(parcel, l, AutocompletePredictionEntity.SubstringEntity.CREATOR);
                    break;

                case 5: // '\005'
                    i = zza.e(parcel, l);
                    break;

                case 6: // '\006'
                    s1 = zza.l(parcel, l);
                    break;

                case 7: // '\007'
                    arraylist1 = zza.c(parcel, l, AutocompletePredictionEntity.SubstringEntity.CREATOR);
                    break;

                case 8: // '\b'
                    s = zza.l(parcel, l);
                    break;

                case 9: // '\t'
                    arraylist = zza.c(parcel, l, AutocompletePredictionEntity.SubstringEntity.CREATOR);
                    break;
                }
            } else
            if (parcel.dataPosition() != k)
            {
                throw new com.google.android.gms.common.internal.safeparcel.zza.zza((new StringBuilder("Overread allowed size end=")).append(k).toString(), parcel);
            } else
            {
                return new AutocompletePredictionEntity(j, s3, arraylist3, i, s2, arraylist2, s1, arraylist1, s, arraylist);
            }
        } while (true);
    }

    public final Object[] newArray(int i)
    {
        return new AutocompletePredictionEntity[i];
    }
}
