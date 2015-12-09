// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.drive.query.internal;

import android.os.Parcel;
import com.google.android.gms.drive.metadata.MetadataField;
import com.google.android.gms.drive.metadata.SearchableMetadataField;
import com.google.android.gms.drive.metadata.internal.MetadataBundle;

// Referenced classes of package com.google.android.gms.drive.query.internal:
//            AbstractFilter, HasFilterCreator, FilterUtilities, FilterVisitor

public class HasFilter extends AbstractFilter
{

    public static final HasFilterCreator CREATOR = new HasFilterCreator();
    final MetadataField mField;
    final MetadataBundle mValue;
    final int mVersionCode;

    HasFilter(int i, MetadataBundle metadatabundle)
    {
        mVersionCode = i;
        mValue = metadatabundle;
        mField = FilterUtilities.getOnlyFieldOrThrow(metadatabundle);
    }

    public HasFilter(SearchableMetadataField searchablemetadatafield, Object obj)
    {
        this(1, MetadataBundle.of(searchablemetadatafield, obj));
    }

    public int describeContents()
    {
        return 0;
    }

    public final Object visit(FilterVisitor filtervisitor)
    {
        return filtervisitor.has(mField, mValue.get(mField));
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        HasFilterCreator.writeToParcel(this, parcel, i);
    }

}
