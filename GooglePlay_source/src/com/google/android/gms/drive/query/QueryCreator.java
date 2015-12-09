// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.drive.query;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.drive.DriveSpace;
import com.google.android.gms.drive.query.internal.LogicalFilter;

// Referenced classes of package com.google.android.gms.drive.query:
//            Query, SortOrder

public final class QueryCreator
    implements android.os.Parcelable.Creator
{

    public QueryCreator()
    {
    }

    static void writeToParcel(Query query, Parcel parcel, int i)
    {
        int j = SafeParcelWriter.beginVariableData(parcel, 20293);
        SafeParcelWriter.writeInt(parcel, 1000, query.mVersionCode);
        SafeParcelWriter.writeParcelable(parcel, 1, query.mFilter, i, false);
        SafeParcelWriter.writeString(parcel, 3, query.mPageToken, false);
        SafeParcelWriter.writeParcelable(parcel, 4, query.mSortOrder, i, false);
        SafeParcelWriter.writeStringList(parcel, 5, query.mRequestedMetadataFields, false);
        SafeParcelWriter.writeBoolean(parcel, 6, query.mIncludeParents);
        SafeParcelWriter.writeTypedList(parcel, 7, query.mSpacesList, false);
        SafeParcelWriter.writeBoolean(parcel, 8, query.mIncludeUnsubscribed);
        SafeParcelWriter.finishVariableData(parcel, j);
    }

    public final volatile Object createFromParcel(Parcel parcel)
    {
        boolean flag = false;
        java.util.ArrayList arraylist = null;
        int j = SafeParcelReader.validateObjectHeader(parcel);
        boolean flag1 = false;
        java.util.ArrayList arraylist1 = null;
        SortOrder sortorder = null;
        String s = null;
        LogicalFilter logicalfilter = null;
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
                    logicalfilter = (LogicalFilter)SafeParcelReader.createParcelable(parcel, k, LogicalFilter.CREATOR);
                    break;

                case 3: // '\003'
                    s = SafeParcelReader.createString(parcel, k);
                    break;

                case 4: // '\004'
                    sortorder = (SortOrder)SafeParcelReader.createParcelable(parcel, k, SortOrder.CREATOR);
                    break;

                case 5: // '\005'
                    arraylist1 = SafeParcelReader.createStringList(parcel, k);
                    break;

                case 6: // '\006'
                    flag1 = SafeParcelReader.readBoolean(parcel, k);
                    break;

                case 7: // '\007'
                    arraylist = SafeParcelReader.createTypedList(parcel, k, DriveSpace.CREATOR);
                    break;

                case 8: // '\b'
                    flag = SafeParcelReader.readBoolean(parcel, k);
                    break;
                }
            } else
            if (parcel.dataPosition() != j)
            {
                throw new com.google.android.gms.common.internal.safeparcel.SafeParcelReader.ParseException((new StringBuilder("Overread allowed size end=")).append(j).toString(), parcel);
            } else
            {
                return new Query(i, logicalfilter, s, sortorder, arraylist1, flag1, arraylist, flag);
            }
        } while (true);
    }

    public final volatile Object[] newArray(int i)
    {
        return new Query[i];
    }
}
