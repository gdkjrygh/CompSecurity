// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.common.server.response;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.server.converter.ConverterWrapper;

public final class FieldCreator
    implements android.os.Parcelable.Creator
{

    public FieldCreator()
    {
    }

    static void writeToParcel(FastJsonResponse.Field field, Parcel parcel, int i)
    {
        int j = SafeParcelWriter.beginVariableData(parcel, 20293);
        SafeParcelWriter.writeInt(parcel, 1, field.mVersionCode);
        SafeParcelWriter.writeInt(parcel, 2, field.getTypeIn());
        SafeParcelWriter.writeBoolean(parcel, 3, field.isTypeInArray());
        SafeParcelWriter.writeInt(parcel, 4, field.getTypeOut());
        SafeParcelWriter.writeBoolean(parcel, 5, field.isTypeOutArray());
        SafeParcelWriter.writeString(parcel, 6, field.getOutputFieldName(), false);
        SafeParcelWriter.writeInt(parcel, 7, field.getSafeParcelableFieldId());
        SafeParcelWriter.writeString(parcel, 8, field.getConcreteTypeName(), false);
        if (field.mConverter == null)
        {
            field = null;
        } else
        {
            field = ConverterWrapper.wrap(field.mConverter);
        }
        SafeParcelWriter.writeParcelable(parcel, 9, field, i, false);
        SafeParcelWriter.finishVariableData(parcel, j);
    }

    public final volatile Object createFromParcel(Parcel parcel)
    {
        ConverterWrapper converterwrapper = null;
        int i = 0;
        int i1 = SafeParcelReader.validateObjectHeader(parcel);
        String s = null;
        String s1 = null;
        boolean flag = false;
        int j = 0;
        boolean flag1 = false;
        int k = 0;
        int l = 0;
        do
        {
            if (parcel.dataPosition() < i1)
            {
                int j1 = parcel.readInt();
                switch (0xffff & j1)
                {
                default:
                    SafeParcelReader.skipUnknownField(parcel, j1);
                    break;

                case 1: // '\001'
                    l = SafeParcelReader.readInt(parcel, j1);
                    break;

                case 2: // '\002'
                    k = SafeParcelReader.readInt(parcel, j1);
                    break;

                case 3: // '\003'
                    flag1 = SafeParcelReader.readBoolean(parcel, j1);
                    break;

                case 4: // '\004'
                    j = SafeParcelReader.readInt(parcel, j1);
                    break;

                case 5: // '\005'
                    flag = SafeParcelReader.readBoolean(parcel, j1);
                    break;

                case 6: // '\006'
                    s1 = SafeParcelReader.createString(parcel, j1);
                    break;

                case 7: // '\007'
                    i = SafeParcelReader.readInt(parcel, j1);
                    break;

                case 8: // '\b'
                    s = SafeParcelReader.createString(parcel, j1);
                    break;

                case 9: // '\t'
                    converterwrapper = (ConverterWrapper)SafeParcelReader.createParcelable(parcel, j1, ConverterWrapper.CREATOR);
                    break;
                }
            } else
            if (parcel.dataPosition() != i1)
            {
                throw new com.google.android.gms.common.internal.safeparcel.SafeParcelReader.ParseException((new StringBuilder("Overread allowed size end=")).append(i1).toString(), parcel);
            } else
            {
                return new FastJsonResponse.Field(l, k, flag1, j, flag, s1, i, s, converterwrapper);
            }
        } while (true);
    }

    public final volatile Object[] newArray(int i)
    {
        return new FastJsonResponse.Field[i];
    }
}
