// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fasterxml.jackson.datatype.guava.deser;

import com.fasterxml.jackson.databind.JsonDeserializer;
import com.fasterxml.jackson.databind.jsontype.TypeDeserializer;
import com.fasterxml.jackson.databind.type.CollectionType;
import com.google.common.a.eg;
import com.google.common.a.jf;

// Referenced classes of package com.fasterxml.jackson.datatype.guava.deser:
//            GuavaMultisetDeserializer, GuavaCollectionDeserializer

public class HashMultisetDeserializer extends GuavaMultisetDeserializer
{

    public HashMultisetDeserializer(CollectionType collectiontype, TypeDeserializer typedeserializer, JsonDeserializer jsondeserializer)
    {
        super(collectiontype, typedeserializer, jsondeserializer);
    }

    protected eg createMultiset()
    {
        return eg.h();
    }

    protected volatile jf createMultiset()
    {
        return createMultiset();
    }

    public volatile GuavaCollectionDeserializer withResolved(TypeDeserializer typedeserializer, JsonDeserializer jsondeserializer)
    {
        return withResolved(typedeserializer, jsondeserializer);
    }

    public HashMultisetDeserializer withResolved(TypeDeserializer typedeserializer, JsonDeserializer jsondeserializer)
    {
        return new HashMultisetDeserializer(_containerType, typedeserializer, jsondeserializer);
    }
}
