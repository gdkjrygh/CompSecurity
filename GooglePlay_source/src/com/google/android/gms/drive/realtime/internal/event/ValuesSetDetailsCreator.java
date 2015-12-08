// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.drive.realtime.internal.event;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;

// Referenced classes of package com.google.android.gms.drive.realtime.internal.event:
//            ValuesSetDetails

public final class ValuesSetDetailsCreator
    implements android.os.Parcelable.Creator
{

    public ValuesSetDetailsCreator()
    {
    }

    static void writeToParcel$2cd816ee(ValuesSetDetails valuessetdetails, Parcel parcel)
    {
        int i = SafeParcelWriter.beginVariableData(parcel, 20293);
        SafeParcelWriter.writeInt(parcel, 1, valuessetdetails.mVersionCode);
        SafeParcelWriter.writeInt(parcel, 2, valuessetdetails.mIndex);
        SafeParcelWriter.writeInt(parcel, 3, valuessetdetails.mValueIndex);
        SafeParcelWriter.writeInt(parcel, 4, valuessetdetails.mValueCount);
        SafeParcelWriter.finishVariableData(parcel, i);
    }

    public final volatile Object createFromParcel(Parcel parcel)
    {
        int l = 0;
        int i1 = SafeParcelReader.validateObjectHeader(parcel);
        int k = 0;
        int j = 0;
        int i = 0;
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
                    i = SafeParcelReader.readInt(parcel, j1);
                    break;

                case 2: // '\002'
                    j = SafeParcelReader.readInt(parcel, j1);
                    break;

                case 3: // '\003'
                    k = SafeParcelReader.readInt(parcel, j1);
                    break;

                case 4: // '\004'
                    l = SafeParcelReader.readInt(parcel, j1);
                    break;
                }
            } else
            if (parcel.dataPosition() != i1)
            {
                throw new com.google.android.gms.common.internal.safeparcel.SafeParcelReader.ParseException((new StringBuilder("Overread allowed size end=")).append(i1).toString(), parcel);
            } else
            {
                return new ValuesSetDetails(i, j, k, l);
            }
        } while (true);
    }

    public final volatile Object[] newArray(int i)
    {
        return new ValuesSetDetails[i];
    }
}
