// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.common.server.response;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.zza;
import com.google.android.gms.common.internal.safeparcel.zzb;

// Referenced classes of package com.google.android.gms.common.server.response:
//            FieldMappingDictionary

public class zzc
    implements android.os.Parcelable.Creator
{

    public zzc()
    {
    }

    static void a(FieldMappingDictionary fieldmappingdictionary, Parcel parcel, int i)
    {
        i = zzb.a(parcel);
        zzb.a(parcel, 1, fieldmappingdictionary.b());
        zzb.c(parcel, 2, fieldmappingdictionary.c(), false);
        zzb.a(parcel, 3, fieldmappingdictionary.d(), false);
        zzb.a(parcel, i);
    }

    public FieldMappingDictionary a(Parcel parcel)
    {
        String s = null;
        int j = zza.b(parcel);
        int i = 0;
        java.util.ArrayList arraylist = null;
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
                    arraylist = zza.c(parcel, k, FieldMappingDictionary.Entry.CREATOR);
                    break;

                case 3: // '\003'
                    s = zza.m(parcel, k);
                    break;
                }
            } else
            if (parcel.dataPosition() != j)
            {
                throw new com.google.android.gms.common.internal.safeparcel.zza.zza((new StringBuilder()).append("Overread allowed size end=").append(j).toString(), parcel);
            } else
            {
                return new FieldMappingDictionary(i, arraylist, s);
            }
        } while (true);
    }

    public FieldMappingDictionary[] a(int i)
    {
        return new FieldMappingDictionary[i];
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
