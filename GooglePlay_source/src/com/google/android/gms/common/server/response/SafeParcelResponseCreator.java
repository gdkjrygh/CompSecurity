// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.common.server.response;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;

// Referenced classes of package com.google.android.gms.common.server.response:
//            SafeParcelResponse, FieldMappingDictionary

public final class SafeParcelResponseCreator
    implements android.os.Parcelable.Creator
{

    public SafeParcelResponseCreator()
    {
    }

    static void writeToParcel(SafeParcelResponse safeparcelresponse, Parcel parcel, int i)
    {
        int j;
        j = SafeParcelWriter.beginVariableData(parcel, 20293);
        SafeParcelWriter.writeInt(parcel, 1, safeparcelresponse.mVersionCode);
        SafeParcelWriter.writeParcel(parcel, 2, safeparcelresponse.getParcel(), false);
        safeparcelresponse.mCreationType;
        JVM INSTR tableswitch 0 2: default 56
    //                   0 83
    //                   1 99
    //                   2 107;
           goto _L1 _L2 _L3 _L4
_L1:
        throw new IllegalStateException((new StringBuilder("Invalid creation type: ")).append(safeparcelresponse.mCreationType).toString());
_L2:
        safeparcelresponse = null;
_L6:
        SafeParcelWriter.writeParcelable(parcel, 3, safeparcelresponse, i, false);
        SafeParcelWriter.finishVariableData(parcel, j);
        return;
_L3:
        safeparcelresponse = safeparcelresponse.mDictionary;
        continue; /* Loop/switch isn't completed */
_L4:
        safeparcelresponse = safeparcelresponse.mDictionary;
        if (true) goto _L6; else goto _L5
_L5:
    }

    public final volatile Object createFromParcel(Parcel parcel)
    {
        FieldMappingDictionary fieldmappingdictionary = null;
        int j = SafeParcelReader.validateObjectHeader(parcel);
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
                    SafeParcelReader.skipUnknownField(parcel, k);
                    break;

                case 1: // '\001'
                    i = SafeParcelReader.readInt(parcel, k);
                    break;

                case 2: // '\002'
                    parcel1 = SafeParcelReader.createParcel(parcel, k);
                    break;

                case 3: // '\003'
                    fieldmappingdictionary = (FieldMappingDictionary)SafeParcelReader.createParcelable(parcel, k, FieldMappingDictionary.CREATOR);
                    break;
                }
            } else
            if (parcel.dataPosition() != j)
            {
                throw new com.google.android.gms.common.internal.safeparcel.SafeParcelReader.ParseException((new StringBuilder("Overread allowed size end=")).append(j).toString(), parcel);
            } else
            {
                return new SafeParcelResponse(i, parcel1, fieldmappingdictionary);
            }
        } while (true);
    }

    public final volatile Object[] newArray(int i)
    {
        return new SafeParcelResponse[i];
    }
}
