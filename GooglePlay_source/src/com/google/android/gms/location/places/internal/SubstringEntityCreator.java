// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.location.places.internal;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;

public final class SubstringEntityCreator
    implements android.os.Parcelable.Creator
{

    public SubstringEntityCreator()
    {
    }

    static void writeToParcel$215b7c31(AutocompletePredictionEntity.SubstringEntity substringentity, Parcel parcel)
    {
        int i = SafeParcelWriter.beginVariableData(parcel, 20293);
        SafeParcelWriter.writeInt(parcel, 1, substringentity.mOffset);
        SafeParcelWriter.writeInt(parcel, 1000, substringentity.mVersionCode);
        SafeParcelWriter.writeInt(parcel, 2, substringentity.mLength);
        SafeParcelWriter.finishVariableData(parcel, i);
    }

    public final volatile Object createFromParcel(Parcel parcel)
    {
        int k = 0;
        int l = SafeParcelReader.validateObjectHeader(parcel);
        int j = 0;
        int i = 0;
        do
        {
            if (parcel.dataPosition() < l)
            {
                int i1 = parcel.readInt();
                switch (0xffff & i1)
                {
                default:
                    SafeParcelReader.skipUnknownField(parcel, i1);
                    break;

                case 1: // '\001'
                    j = SafeParcelReader.readInt(parcel, i1);
                    break;

                case 1000: 
                    i = SafeParcelReader.readInt(parcel, i1);
                    break;

                case 2: // '\002'
                    k = SafeParcelReader.readInt(parcel, i1);
                    break;
                }
            } else
            if (parcel.dataPosition() != l)
            {
                throw new com.google.android.gms.common.internal.safeparcel.SafeParcelReader.ParseException((new StringBuilder("Overread allowed size end=")).append(l).toString(), parcel);
            } else
            {
                return new AutocompletePredictionEntity.SubstringEntity(i, j, k);
            }
        } while (true);
    }

    public final volatile Object[] newArray(int i)
    {
        return new AutocompletePredictionEntity.SubstringEntity[i];
    }
}
