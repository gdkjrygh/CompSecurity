// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.drive.query;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.drive.query.internal.FieldWithSortOrder;

// Referenced classes of package com.google.android.gms.drive.query:
//            SortOrder

public final class SortOrderCreator
    implements android.os.Parcelable.Creator
{

    public SortOrderCreator()
    {
    }

    static void writeToParcel$4b1eb6e0(SortOrder sortorder, Parcel parcel)
    {
        int i = SafeParcelWriter.beginVariableData(parcel, 20293);
        SafeParcelWriter.writeInt(parcel, 1000, sortorder.mVersionCode);
        SafeParcelWriter.writeTypedList(parcel, 1, sortorder.mSortingFields, false);
        SafeParcelWriter.writeBoolean(parcel, 2, sortorder.mSortFolderFirst);
        SafeParcelWriter.finishVariableData(parcel, i);
    }

    public final volatile Object createFromParcel(Parcel parcel)
    {
        boolean flag = false;
        int j = SafeParcelReader.validateObjectHeader(parcel);
        java.util.ArrayList arraylist = null;
        int i = 0;
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

                case 1000: 
                    i = SafeParcelReader.readInt(parcel, k);
                    break;

                case 1: // '\001'
                    arraylist = SafeParcelReader.createTypedList(parcel, k, FieldWithSortOrder.CREATOR);
                    break;

                case 2: // '\002'
                    flag = SafeParcelReader.readBoolean(parcel, k);
                    break;
                }
            } else
            if (parcel.dataPosition() != j)
            {
                throw new com.google.android.gms.common.internal.safeparcel.SafeParcelReader.ParseException((new StringBuilder("Overread allowed size end=")).append(j).toString(), parcel);
            } else
            {
                return new SortOrder(i, arraylist, flag);
            }
        } while (true);
    }

    public final volatile Object[] newArray(int i)
    {
        return new SortOrder[i];
    }
}
