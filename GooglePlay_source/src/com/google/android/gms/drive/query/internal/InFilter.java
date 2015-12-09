// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.drive.query.internal;

import android.os.Parcel;
import com.google.android.gms.drive.metadata.CollectionMetadataField;
import com.google.android.gms.drive.metadata.SearchableCollectionMetadataField;
import com.google.android.gms.drive.metadata.internal.MetadataBundle;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;

// Referenced classes of package com.google.android.gms.drive.query.internal:
//            AbstractFilter, InFilterCreator, FilterUtilities, FilterVisitor

public class InFilter extends AbstractFilter
{

    public static final InFilterCreator CREATOR = new InFilterCreator();
    private final CollectionMetadataField mField;
    final MetadataBundle mValue;
    final int mVersionCode;

    InFilter(int i, MetadataBundle metadatabundle)
    {
        mVersionCode = i;
        mValue = metadatabundle;
        mField = (CollectionMetadataField)FilterUtilities.getOnlyFieldOrThrow(metadatabundle);
    }

    public InFilter(SearchableCollectionMetadataField searchablecollectionmetadatafield, Object obj)
    {
        this(1, MetadataBundle.of(searchablecollectionmetadatafield, Collections.singleton(obj)));
    }

    public int describeContents()
    {
        return 0;
    }

    public final Object visit(FilterVisitor filtervisitor)
    {
        return filtervisitor.contains(mField, ((Collection)mValue.get(mField)).iterator().next());
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        InFilterCreator.writeToParcel(this, parcel, i);
    }

}
