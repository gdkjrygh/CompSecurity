// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.common.server.response;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;

public final class FieldMapPairCreator
    implements android.os.Parcelable.Creator
{

    public FieldMapPairCreator()
    {
    }

    static void writeToParcel(FieldMappingDictionary.FieldMapPair fieldmappair, Parcel parcel, int i)
    {
        int j = SafeParcelWriter.beginVariableData(parcel, 20293);
        SafeParcelWriter.writeInt(parcel, 1, fieldmappair.versionCode);
        SafeParcelWriter.writeString(parcel, 2, fieldmappair.key, false);
        SafeParcelWriter.writeParcelable(parcel, 3, fieldmappair.value, i, false);
        SafeParcelWriter.finishVariableData(parcel, j);
    }

    public final volatile Object createFromParcel(Parcel parcel)
    {
        FastJsonResponse.Field field = null;
        int j = SafeParcelReader.validateObjectHeader(parcel);
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
                    SafeParcelReader.skipUnknownField(parcel, k);
                    break;

                case 1: // '\001'
                    i = SafeParcelReader.readInt(parcel, k);
                    break;

                case 2: // '\002'
                    s = SafeParcelReader.createString(parcel, k);
                    break;

                case 3: // '\003'
                    field = (FastJsonResponse.Field)SafeParcelReader.createParcelable(parcel, k, FastJsonResponse.Field.CREATOR);
                    break;
                }
            } else
            if (parcel.dataPosition() != j)
            {
                throw new com.google.android.gms.common.internal.safeparcel.SafeParcelReader.ParseException((new StringBuilder("Overread allowed size end=")).append(j).toString(), parcel);
            } else
            {
                return new FieldMappingDictionary.FieldMapPair(i, s, field);
            }
        } while (true);
    }

    public final volatile Object[] newArray(int i)
    {
        return new FieldMappingDictionary.FieldMapPair[i];
    }
}
