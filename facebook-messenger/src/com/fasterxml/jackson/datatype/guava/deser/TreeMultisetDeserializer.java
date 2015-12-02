// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fasterxml.jackson.datatype.guava.deser;

import com.fasterxml.jackson.databind.JsonDeserializer;
import com.fasterxml.jackson.databind.jsontype.TypeDeserializer;
import com.fasterxml.jackson.databind.type.CollectionType;
import com.google.common.a.jf;
import com.google.common.a.mf;

// Referenced classes of package com.fasterxml.jackson.datatype.guava.deser:
//            GuavaMultisetDeserializer, GuavaCollectionDeserializer

public class TreeMultisetDeserializer extends GuavaMultisetDeserializer
{

    public TreeMultisetDeserializer(CollectionType collectiontype, TypeDeserializer typedeserializer, JsonDeserializer jsondeserializer)
    {
        super(collectiontype, typedeserializer, jsondeserializer);
    }

    protected volatile jf createMultiset()
    {
        return createMultiset();
    }

    protected mf createMultiset()
    {
        return mf.h();
    }

    public GuavaCollectionDeserializer withResolved(TypeDeserializer typedeserializer, JsonDeserializer jsondeserializer)
    {
        return new TreeMultisetDeserializer(_containerType, typedeserializer, jsondeserializer);
    }
}
