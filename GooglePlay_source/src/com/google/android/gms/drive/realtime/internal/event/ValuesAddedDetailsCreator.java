// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.drive.realtime.internal.event;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;

// Referenced classes of package com.google.android.gms.drive.realtime.internal.event:
//            ValuesAddedDetails

public final class ValuesAddedDetailsCreator
    implements android.os.Parcelable.Creator
{

    public ValuesAddedDetailsCreator()
    {
    }

    static void writeToParcel$586ed70c(ValuesAddedDetails valuesaddeddetails, Parcel parcel)
    {
        int i = SafeParcelWriter.beginVariableData(parcel, 20293);
        SafeParcelWriter.writeInt(parcel, 1, valuesaddeddetails.mVersionCode);
        SafeParcelWriter.writeInt(parcel, 2, valuesaddeddetails.mIndex);
        SafeParcelWriter.writeInt(parcel, 3, valuesaddeddetails.mValueIndex);
        SafeParcelWriter.writeInt(parcel, 4, valuesaddeddetails.mValueCount);
        SafeParcelWriter.writeString(parcel, 5, valuesaddeddetails.mMovedFromId, false);
        SafeParcelWriter.writeInt(parcel, 6, valuesaddeddetails.mMovedFromIndex);
        SafeParcelWriter.finishVariableData(parcel, i);
    }

    public final volatile Object createFromParcel(Parcel parcel)
    {
        int i = 0;
        int j1 = SafeParcelReader.validateObjectHeader(parcel);
        String s = null;
        int j = 0;
        int k = 0;
        int l = 0;
        int i1 = 0;
        do
        {
            if (parcel.dataPosition() < j1)
            {
                int k1 = parcel.readInt();
                switch (0xffff & k1)
                {
                default:
                    SafeParcelReader.skipUnknownField(parcel, k1);
                    break;

                case 1: // '\001'
                    i1 = SafeParcelReader.readInt(parcel, k1);
                    break;

                case 2: // '\002'
                    l = SafeParcelReader.readInt(parcel, k1);
                    break;

                case 3: // '\003'
                    k = SafeParcelReader.readInt(parcel, k1);
                    break;

                case 4: // '\004'
                    j = SafeParcelReader.readInt(parcel, k1);
                    break;

                case 5: // '\005'
                    s = SafeParcelReader.createString(parcel, k1);
                    break;

                case 6: // '\006'
                    i = SafeParcelReader.readInt(parcel, k1);
                    break;
                }
            } else
            if (parcel.dataPosition() != j1)
            {
                throw new com.google.android.gms.common.internal.safeparcel.SafeParcelReader.ParseException((new StringBuilder("Overread allowed size end=")).append(j1).toString(), parcel);
            } else
            {
                return new ValuesAddedDetails(i1, l, k, j, s, i);
            }
        } while (true);
    }

    public final volatile Object[] newArray(int i)
    {
        return new ValuesAddedDetails[i];
    }
}
