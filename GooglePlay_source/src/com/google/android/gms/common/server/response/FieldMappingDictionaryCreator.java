// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.common.server.response;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

// Referenced classes of package com.google.android.gms.common.server.response:
//            FieldMappingDictionary

public final class FieldMappingDictionaryCreator
    implements android.os.Parcelable.Creator
{

    public FieldMappingDictionaryCreator()
    {
    }

    static void writeToParcel$51a5452c(FieldMappingDictionary fieldmappingdictionary, Parcel parcel)
    {
        int i = SafeParcelWriter.beginVariableData(parcel, 20293);
        SafeParcelWriter.writeInt(parcel, 1, fieldmappingdictionary.mVersionCode);
        ArrayList arraylist = new ArrayList();
        String s;
        for (Iterator iterator = fieldmappingdictionary.mDictionary.keySet().iterator(); iterator.hasNext(); arraylist.add(new FieldMappingDictionary.Entry(s, (Map)fieldmappingdictionary.mDictionary.get(s))))
        {
            s = (String)iterator.next();
        }

        SafeParcelWriter.writeTypedList(parcel, 2, arraylist, false);
        SafeParcelWriter.writeString(parcel, 3, fieldmappingdictionary.mRootClassName, false);
        SafeParcelWriter.finishVariableData(parcel, i);
    }

    public final volatile Object createFromParcel(Parcel parcel)
    {
        String s = null;
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
                    arraylist = SafeParcelReader.createTypedList(parcel, k, FieldMappingDictionary.Entry.CREATOR);
                    break;

                case 3: // '\003'
                    s = SafeParcelReader.createString(parcel, k);
                    break;
                }
            } else
            if (parcel.dataPosition() != j)
            {
                throw new com.google.android.gms.common.internal.safeparcel.SafeParcelReader.ParseException((new StringBuilder("Overread allowed size end=")).append(j).toString(), parcel);
            } else
            {
                return new FieldMappingDictionary(i, arraylist, s);
            }
        } while (true);
    }

    public final volatile Object[] newArray(int i)
    {
        return new FieldMappingDictionary[i];
    }
}
