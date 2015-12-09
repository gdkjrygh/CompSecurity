// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.drive.query.internal;

import android.os.Parcel;
import com.google.android.gms.drive.metadata.MetadataField;
import com.google.android.gms.drive.metadata.internal.MetadataBundle;

// Referenced classes of package com.google.android.gms.drive.query.internal:
//            AbstractFilter, FieldOnlyFilterCreator, FilterUtilities, FilterVisitor

public class FieldOnlyFilter extends AbstractFilter
{

    public static final android.os.Parcelable.Creator CREATOR = new FieldOnlyFilterCreator();
    private final MetadataField mField;
    final MetadataBundle mValue;
    final int mVersionCode;

    FieldOnlyFilter(int i, MetadataBundle metadatabundle)
    {
        mVersionCode = i;
        mValue = metadatabundle;
        mField = FilterUtilities.getOnlyFieldOrThrow(metadatabundle);
    }

    public int describeContents()
    {
        return 0;
    }

    public final Object visit(FilterVisitor filtervisitor)
    {
        return filtervisitor.fieldOnly(mField);
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        FieldOnlyFilterCreator.writeToParcel(this, parcel, i);
    }

}
