// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.drive.query.internal;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;

// Referenced classes of package com.google.android.gms.drive.query.internal:
//            FilterHolder, ComparisonFilter, FieldOnlyFilter, LogicalFilter, 
//            NotFilter, InFilter, MatchAllFilter, HasFilter, 
//            FullTextSearchFilter, OwnedByMeFilter

public final class FilterHolderCreator
    implements android.os.Parcelable.Creator
{

    public FilterHolderCreator()
    {
    }

    static void writeToParcel(FilterHolder filterholder, Parcel parcel, int i)
    {
        int j = SafeParcelWriter.beginVariableData(parcel, 20293);
        SafeParcelWriter.writeParcelable(parcel, 1, filterholder.mComparisionFilter, i, false);
        SafeParcelWriter.writeInt(parcel, 1000, filterholder.mVersionCode);
        SafeParcelWriter.writeParcelable(parcel, 2, filterholder.mFieldOnlyFilter, i, false);
        SafeParcelWriter.writeParcelable(parcel, 3, filterholder.mLogicalFilter, i, false);
        SafeParcelWriter.writeParcelable(parcel, 4, filterholder.mNotFilter, i, false);
        SafeParcelWriter.writeParcelable(parcel, 5, filterholder.mContainsFilter, i, false);
        SafeParcelWriter.writeParcelable(parcel, 6, filterholder.mMatchAllFilter, i, false);
        SafeParcelWriter.writeParcelable(parcel, 7, filterholder.mHasFilter, i, false);
        SafeParcelWriter.writeParcelable(parcel, 8, filterholder.mFullTextSearchFilter, i, false);
        SafeParcelWriter.writeParcelable(parcel, 9, filterholder.mOwnedByMeFilter, i, false);
        SafeParcelWriter.finishVariableData(parcel, j);
    }

    public final volatile Object createFromParcel(Parcel parcel)
    {
        OwnedByMeFilter ownedbymefilter = null;
        int j = SafeParcelReader.validateObjectHeader(parcel);
        int i = 0;
        FullTextSearchFilter fulltextsearchfilter = null;
        HasFilter hasfilter = null;
        MatchAllFilter matchallfilter = null;
        InFilter infilter = null;
        NotFilter notfilter = null;
        LogicalFilter logicalfilter = null;
        FieldOnlyFilter fieldonlyfilter = null;
        ComparisonFilter comparisonfilter = null;
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
                    comparisonfilter = (ComparisonFilter)SafeParcelReader.createParcelable(parcel, k, ComparisonFilter.CREATOR);
                    break;

                case 1000: 
                    i = SafeParcelReader.readInt(parcel, k);
                    break;

                case 2: // '\002'
                    fieldonlyfilter = (FieldOnlyFilter)SafeParcelReader.createParcelable(parcel, k, FieldOnlyFilter.CREATOR);
                    break;

                case 3: // '\003'
                    logicalfilter = (LogicalFilter)SafeParcelReader.createParcelable(parcel, k, LogicalFilter.CREATOR);
                    break;

                case 4: // '\004'
                    notfilter = (NotFilter)SafeParcelReader.createParcelable(parcel, k, NotFilter.CREATOR);
                    break;

                case 5: // '\005'
                    infilter = (InFilter)SafeParcelReader.createParcelable(parcel, k, InFilter.CREATOR);
                    break;

                case 6: // '\006'
                    matchallfilter = (MatchAllFilter)SafeParcelReader.createParcelable(parcel, k, MatchAllFilter.CREATOR);
                    break;

                case 7: // '\007'
                    hasfilter = (HasFilter)SafeParcelReader.createParcelable(parcel, k, HasFilter.CREATOR);
                    break;

                case 8: // '\b'
                    fulltextsearchfilter = (FullTextSearchFilter)SafeParcelReader.createParcelable(parcel, k, FullTextSearchFilter.CREATOR);
                    break;

                case 9: // '\t'
                    ownedbymefilter = (OwnedByMeFilter)SafeParcelReader.createParcelable(parcel, k, OwnedByMeFilter.CREATOR);
                    break;
                }
            } else
            if (parcel.dataPosition() != j)
            {
                throw new com.google.android.gms.common.internal.safeparcel.SafeParcelReader.ParseException((new StringBuilder("Overread allowed size end=")).append(j).toString(), parcel);
            } else
            {
                return new FilterHolder(i, comparisonfilter, fieldonlyfilter, logicalfilter, notfilter, infilter, matchallfilter, hasfilter, fulltextsearchfilter, ownedbymefilter);
            }
        } while (true);
    }

    public final volatile Object[] newArray(int i)
    {
        return new FilterHolder[i];
    }
}
