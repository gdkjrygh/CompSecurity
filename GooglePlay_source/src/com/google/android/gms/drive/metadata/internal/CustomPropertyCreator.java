// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.drive.metadata.internal;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.drive.metadata.CustomPropertyKey;

// Referenced classes of package com.google.android.gms.drive.metadata.internal:
//            CustomProperty

public final class CustomPropertyCreator
    implements android.os.Parcelable.Creator
{

    public CustomPropertyCreator()
    {
    }

    static void writeToParcel(CustomProperty customproperty, Parcel parcel, int i)
    {
        int j = SafeParcelWriter.beginVariableData(parcel, 20293);
        SafeParcelWriter.writeInt(parcel, 1, customproperty.mVersionCode);
        SafeParcelWriter.writeParcelable(parcel, 2, customproperty.mKey, i, false);
        SafeParcelWriter.writeString(parcel, 3, customproperty.mValue, false);
        SafeParcelWriter.finishVariableData(parcel, j);
    }

    public final volatile Object createFromParcel(Parcel parcel)
    {
        int j = SafeParcelReader.validateObjectHeader(parcel);
        CustomPropertyKey custompropertykey = null;
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
                    custompropertykey = (CustomPropertyKey)SafeParcelReader.createParcelable(parcel, k, CustomPropertyKey.CREATOR);
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
                return new CustomProperty(i, custompropertykey, s);
            }
        } while (true);
    }

    public final volatile Object[] newArray(int i)
    {
        return new CustomProperty[i];
    }
}
