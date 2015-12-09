// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.drive.query.internal;

import android.os.Parcel;
import com.google.android.gms.drive.metadata.MetadataField;
import com.google.android.gms.drive.metadata.SearchableMetadataField;
import com.google.android.gms.drive.metadata.internal.MetadataBundle;

// Referenced classes of package com.google.android.gms.drive.query.internal:
//            AbstractFilter, ComparisonFilterCreator, FilterUtilities, FilterVisitor, 
//            Operator

public class ComparisonFilter extends AbstractFilter
{

    public static final ComparisonFilterCreator CREATOR = new ComparisonFilterCreator();
    final MetadataField mField;
    final Operator mOperator;
    final MetadataBundle mValue;
    final int mVersionCode;

    ComparisonFilter(int i, Operator operator, MetadataBundle metadatabundle)
    {
        mVersionCode = i;
        mOperator = operator;
        mValue = metadatabundle;
        mField = FilterUtilities.getOnlyFieldOrThrow(metadatabundle);
    }

    public ComparisonFilter(Operator operator, SearchableMetadataField searchablemetadatafield, Object obj)
    {
        this(1, operator, MetadataBundle.of(searchablemetadatafield, obj));
    }

    public int describeContents()
    {
        return 0;
    }

    public final Object visit(FilterVisitor filtervisitor)
    {
        return filtervisitor.comparison(mOperator, mField, mValue.get(mField));
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        ComparisonFilterCreator.writeToParcel(this, parcel, i);
    }

}
