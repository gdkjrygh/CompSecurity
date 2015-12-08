// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.common.server.response;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.a;
import com.google.android.gms.common.internal.safeparcel.b;
import com.google.android.gms.common.internal.safeparcel.c;

// Referenced classes of package com.google.android.gms.common.server.response:
//            SafeParcelResponse, FieldMappingDictionary

public final class f
    implements android.os.Parcelable.Creator
{

    public f()
    {
    }

    static void a(SafeParcelResponse safeparcelresponse, Parcel parcel, int i)
    {
        int j = c.a(parcel);
        c.a(parcel, 1, safeparcelresponse.d());
        c.a(parcel, safeparcelresponse.e());
        c.a(parcel, 3, safeparcelresponse.f(), i, false);
        c.a(parcel, j);
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
                    i = com.google.android.gms.common.internal.safeparcel.a.d(parcel, k);
                    break;

                case 2: // '\002'
                    parcel1 = com.google.android.gms.common.internal.safeparcel.a.r(parcel, k);
                    break;

                case 3: // '\003'
                    fieldmappingdictionary = (FieldMappingDictionary)com.google.android.gms.common.internal.safeparcel.a.a(parcel, k, FieldMappingDictionary.CREATOR);
                    break;
                }
            } else
            if (parcel.dataPosition() != j)
            {
                throw new b((new StringBuilder("Overread allowed size end=")).append(j).toString(), parcel);
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
