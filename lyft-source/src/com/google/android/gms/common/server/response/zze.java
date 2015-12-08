// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.common.server.response;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.zza;
import com.google.android.gms.common.internal.safeparcel.zzb;

// Referenced classes of package com.google.android.gms.common.server.response:
//            SafeParcelResponse, FieldMappingDictionary

public class zze
    implements android.os.Parcelable.Creator
{

    public zze()
    {
    }

    static void a(SafeParcelResponse safeparcelresponse, Parcel parcel, int i)
    {
        int j = zzb.a(parcel);
        zzb.a(parcel, 1, safeparcelresponse.d());
        zzb.a(parcel, 2, safeparcelresponse.e(), false);
        zzb.a(parcel, 3, safeparcelresponse.f(), i, false);
        zzb.a(parcel, j);
    }

    public SafeParcelResponse a(Parcel parcel)
    {
        FieldMappingDictionary fieldmappingdictionary = null;
        int j = zza.b(parcel);
        int i = 0;
        Parcel parcel1 = null;
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
                    parcel1 = zza.B(parcel, k);
                    break;

                case 3: // '\003'
                    fieldmappingdictionary = (FieldMappingDictionary)zza.a(parcel, k, FieldMappingDictionary.CREATOR);
                    break;
                }
            } else
            if (parcel.dataPosition() != j)
            {
                throw new com.google.android.gms.common.internal.safeparcel.zza.zza((new StringBuilder()).append("Overread allowed size end=").append(j).toString(), parcel);
            } else
            {
                return new SafeParcelResponse(i, parcel1, fieldmappingdictionary);
            }
        } while (true);
    }

    public SafeParcelResponse[] a(int i)
    {
        return new SafeParcelResponse[i];
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
