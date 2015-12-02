// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fasterxml.jackson.datatype.guava.deser;

import com.fasterxml.jackson.databind.JsonDeserializer;
import com.fasterxml.jackson.databind.jsontype.TypeDeserializer;
import com.fasterxml.jackson.databind.type.CollectionType;
import com.google.common.a.eo;
import com.google.common.a.fi;

// Referenced classes of package com.fasterxml.jackson.datatype.guava.deser:
//            GuavaImmutableCollectionDeserializer, GuavaCollectionDeserializer

public class ImmutableSetDeserializer extends GuavaImmutableCollectionDeserializer
{

    public ImmutableSetDeserializer(CollectionType collectiontype, TypeDeserializer typedeserializer, JsonDeserializer jsondeserializer)
    {
        super(collectiontype, typedeserializer, jsondeserializer);
    }

    protected eo createBuilder()
    {
        return fi.e();
    }

    public volatile GuavaCollectionDeserializer withResolved(TypeDeserializer typedeserializer, JsonDeserializer jsondeserializer)
    {
        return withResolved(typedeserializer, jsondeserializer);
    }

    public ImmutableSetDeserializer withResolved(TypeDeserializer typedeserializer, JsonDeserializer jsondeserializer)
    {
        return new ImmutableSetDeserializer(_containerType, typedeserializer, jsondeserializer);
    }
}
