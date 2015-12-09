// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.drive.query;

import com.google.android.gms.drive.metadata.BaseMetadataField;
import com.google.android.gms.drive.metadata.CollectionMetadataField;
import com.google.android.gms.drive.metadata.MetadataField;
import com.google.android.gms.drive.query.internal.FilterVisitor;
import com.google.android.gms.drive.query.internal.Operator;
import java.util.Iterator;
import java.util.List;

public final class ToStringFilterVisitor
    implements FilterVisitor
{

    public ToStringFilterVisitor()
    {
    }

    public final volatile Object comparison(Operator operator, MetadataField metadatafield, Object obj)
    {
        return String.format("cmp(%s,%s,%s)", new Object[] {
            operator.mTag, metadatafield.getName(), obj
        });
    }

    public final volatile Object contains(CollectionMetadataField collectionmetadatafield, Object obj)
    {
        return String.format("contains(%s,%s)", new Object[] {
            ((BaseMetadataField) (collectionmetadatafield)).mFieldName, obj
        });
    }

    public final volatile Object fieldOnly(MetadataField metadatafield)
    {
        return String.format("fieldOnly(%s)", new Object[] {
            metadatafield.getName()
        });
    }

    public final volatile Object fullTextSearch(String s)
    {
        return String.format("fullTextSearch(%s)", new Object[] {
            s
        });
    }

    public final volatile Object has(MetadataField metadatafield, Object obj)
    {
        return String.format("has(%s,%s)", new Object[] {
            metadatafield.getName(), obj
        });
    }

    public final volatile Object logicalOp(Operator operator, List list)
    {
        StringBuilder stringbuilder = new StringBuilder((new StringBuilder()).append(operator.mTag).append("(").toString());
        list = list.iterator();
        for (operator = ""; list.hasNext(); operator = ",")
        {
            String s = (String)list.next();
            stringbuilder.append(operator);
            stringbuilder.append(s);
        }

        return stringbuilder.append(")").toString();
    }

    public final volatile Object matchAll()
    {
        return "all()";
    }

    public final volatile Object not(Object obj)
    {
        return String.format("not(%s)", new Object[] {
            (String)obj
        });
    }

    public final volatile Object ownedByMe()
    {
        return "ownedByMe()";
    }
}
