// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.common.server.response;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.a;
import com.google.android.gms.common.internal.safeparcel.b;

// Referenced classes of package com.google.android.gms.common.server.response:
//            SafeParcelResponse, FieldMappingDictionary

public final class e
    implements android.os.Parcelable.Creator
{

    public e()
    {
    }

    static void a(SafeParcelResponse safeparcelresponse, Parcel parcel, int i)
    {
        int j = b.a(parcel);
        b.a(parcel, 1, safeparcelresponse.d());
        b.a(parcel, safeparcelresponse.e());
        b.a(parcel, 3, safeparcelresponse.f(), i);
        b.a(parcel, j);
    }

    public final Object createFromParcel(Parcel parcel)
    {
        FieldMappingDictionary fieldmappingdictionary = null;
        int j = com.google.android.gms.common.internal.safeparcel.a.a(parcel);
        int i = 0;
        Parcel parcel1 = null;
        do
        {
            if (parcel.dataPosition() < j)
            {
                int k = parcel.readInt();
                switch (0xffff & k)
                {
                default:
                    com.google.android.gms.common.internal.safeparcel.a.b(parcel, k);
                    break;

                case 1: // '\001'
                    i = com.google.android.gms.common.internal.safeparcel.a.f(parcel, k);
                    break;

                case 2: // '\002'
                    parcel1 = com.google.android.gms.common.internal.safeparcel.a.u(parcel, k);
                    break;

                case 3: // '\003'
                    fieldmappingdictionary = (FieldMappingDictionary)com.google.android.gms.common.internal.safeparcel.a.a(parcel, k, FieldMappingDictionary.CREATOR);
                    break;
                }
            } else
            if (parcel.dataPosition() != j)
            {
                throw new com.google.android.gms.common.internal.safeparcel.a.a((new StringBuilder("Overread allowed size end=")).append(j).toString(), parcel);
            } else
            {
                return new SafeParcelResponse(i, parcel1, fieldmappingdictionary);
            }
        } while (true);
    }

    public final Object[] newArray(int i)
    {
        return new SafeParcelResponse[i];
    }
}
