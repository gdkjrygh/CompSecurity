// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.drive.query.internal;

import com.google.android.gms.drive.metadata.CollectionMetadataField;
import com.google.android.gms.drive.metadata.MetadataField;
import java.util.List;

// Referenced classes of package com.google.android.gms.drive.query.internal:
//            FilterVisitor, Operator

public final class FullTextSearchDetector
    implements FilterVisitor
{

    private Boolean mHasFullTextSearch;

    public FullTextSearchDetector()
    {
        mHasFullTextSearch = Boolean.valueOf(false);
    }

    public final volatile Object comparison(Operator operator, MetadataField metadatafield, Object obj)
    {
        return mHasFullTextSearch;
    }

    public final volatile Object contains(CollectionMetadataField collectionmetadatafield, Object obj)
    {
        return mHasFullTextSearch;
    }

    public final volatile Object fieldOnly(MetadataField metadatafield)
    {
        return mHasFullTextSearch;
    }

    public final volatile Object fullTextSearch(String s)
    {
        if (!s.isEmpty())
        {
            mHasFullTextSearch = Boolean.valueOf(true);
        }
        return mHasFullTextSearch;
    }

    public final volatile Object has(MetadataField metadatafield, Object obj)
    {
        return mHasFullTextSearch;
    }

    public final volatile Object logicalOp(Operator operator, List list)
    {
        return mHasFullTextSearch;
    }

    public final volatile Object matchAll()
    {
        return mHasFullTextSearch;
    }

    public final volatile Object not(Object obj)
    {
        return mHasFullTextSearch;
    }

    public final volatile Object ownedByMe()
    {
        return mHasFullTextSearch;
    }
}
