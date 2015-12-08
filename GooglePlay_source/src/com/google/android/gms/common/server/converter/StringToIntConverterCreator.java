// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.common.server.converter;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

// Referenced classes of package com.google.android.gms.common.server.converter:
//            StringToIntConverter

public final class StringToIntConverterCreator
    implements android.os.Parcelable.Creator
{

    public StringToIntConverterCreator()
    {
    }

    static void writeToParcel$dc69de4(StringToIntConverter stringtointconverter, Parcel parcel)
    {
        int i = SafeParcelWriter.beginVariableData(parcel, 20293);
        SafeParcelWriter.writeInt(parcel, 1, stringtointconverter.mVersionCode);
        ArrayList arraylist = new ArrayList();
        String s;
        for (Iterator iterator = stringtointconverter.mStringToIntMap.keySet().iterator(); iterator.hasNext(); arraylist.add(new StringToIntConverter.Entry(s, ((Integer)stringtointconverter.mStringToIntMap.get(s)).intValue())))
        {
            s = (String)iterator.next();
        }

        SafeParcelWriter.writeTypedList(parcel, 2, arraylist, false);
        SafeParcelWriter.finishVariableData(parcel, i);
    }

    public final volatile Object createFromParcel(Parcel parcel)
    {
        int j = SafeParcelReader.validateObjectHeader(parcel);
        int i = 0;
        ArrayList arraylist = null;
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
                    arraylist = SafeParcelReader.createTypedList(parcel, k, StringToIntConverter.Entry.CREATOR);
                    break;
                }
            } else
            if (parcel.dataPosition() != j)
            {
                throw new com.google.android.gms.common.internal.safeparcel.SafeParcelReader.ParseException((new StringBuilder("Overread allowed size end=")).append(j).toString(), parcel);
            } else
            {
                return new StringToIntConverter(i, arraylist);
            }
        } while (true);
    }

    public final volatile Object[] newArray(int i)
    {
        return new StringToIntConverter[i];
    }
}
