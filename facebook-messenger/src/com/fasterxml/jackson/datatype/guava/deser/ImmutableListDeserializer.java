// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fasterxml.jackson.datatype.guava.deser;

import com.fasterxml.jackson.databind.JsonDeserializer;
import com.fasterxml.jackson.databind.jsontype.TypeDeserializer;
import com.fasterxml.jackson.databind.type.CollectionType;
import com.google.common.a.eo;
import com.google.common.a.es;
import com.google.common.a.et;

// Referenced classes of package com.fasterxml.jackson.datatype.guava.deser:
//            GuavaImmutableCollectionDeserializer, GuavaCollectionDeserializer

public class ImmutableListDeserializer extends GuavaImmutableCollectionDeserializer
{

    public ImmutableListDeserializer(CollectionType collectiontype, TypeDeserializer typedeserializer, JsonDeserializer jsondeserializer)
    {
        super(collectiontype, typedeserializer, jsondeserializer);
    }

    protected volatile eo createBuilder()
    {
        return createBuilder();
    }

    protected et createBuilder()
    {
        return es.e();
    }

    public volatile GuavaCollectionDeserializer withResolved(TypeDeserializer typedeserializer, JsonDeserializer jsondeserializer)
    {
        return withResolved(typedeserializer, jsondeserializer);
    }

    public ImmutableListDeserializer withResolved(TypeDeserializer typedeserializer, JsonDeserializer jsondeserializer)
    {
        return new ImmutableListDeserializer(_containerType, typedeserializer, jsondeserializer);
    }
}
