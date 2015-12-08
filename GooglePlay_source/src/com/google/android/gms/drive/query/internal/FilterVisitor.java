// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.drive.query.internal;

import com.google.android.gms.drive.metadata.CollectionMetadataField;
import com.google.android.gms.drive.metadata.MetadataField;
import java.util.List;

// Referenced classes of package com.google.android.gms.drive.query.internal:
//            Operator

public interface FilterVisitor
{

    public abstract Object comparison(Operator operator, MetadataField metadatafield, Object obj);

    public abstract Object contains(CollectionMetadataField collectionmetadatafield, Object obj);

    public abstract Object fieldOnly(MetadataField metadatafield);

    public abstract Object fullTextSearch(String s);

    public abstract Object has(MetadataField metadatafield, Object obj);

    public abstract Object logicalOp(Operator operator, List list);

    public abstract Object matchAll();

    public abstract Object not(Object obj);

    public abstract Object ownedByMe();
}
