// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.common.server.converter;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;

// Referenced classes of package com.google.android.gms.common.server.converter:
//            ConverterWrapper, StringToIntConverter

public final class ConverterWrapperCreator
    implements android.os.Parcelable.Creator
{

    public ConverterWrapperCreator()
    {
    }

    static void writeToParcel(ConverterWrapper converterwrapper, Parcel parcel, int i)
    {
        int j = SafeParcelWriter.beginVariableData(parcel, 20293);
        SafeParcelWriter.writeInt(parcel, 1, converterwrapper.mVersionCode);
        SafeParcelWriter.writeParcelable(parcel, 2, converterwrapper.mStringToIntConverter, i, false);
        SafeParcelWriter.finishVariableData(parcel, j);
    }

    public final volatile Object createFromParcel(Parcel parcel)
    {
        int j = SafeParcelReader.validateObjectHeader(parcel);
        int i = 0;
        StringToIntConverter stringtointconverter = null;
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
                    stringtointconverter = (StringToIntConverter)SafeParcelReader.createParcelable(parcel, k, StringToIntConverter.CREATOR);
                    break;
                }
            } else
            if (parcel.dataPosition() != j)
            {
                throw new com.google.android.gms.common.internal.safeparcel.SafeParcelReader.ParseException((new StringBuilder("Overread allowed size end=")).append(j).toString(), parcel);
            } else
            {
                return new ConverterWrapper(i, stringtointconverter);
            }
        } while (true);
    }

    public final volatile Object[] newArray(int i)
    {
        return new ConverterWrapper[i];
    }
}
