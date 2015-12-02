// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fasterxml.jackson.datatype.guava.deser;

import com.fasterxml.jackson.databind.JsonDeserializer;
import com.fasterxml.jackson.databind.jsontype.TypeDeserializer;
import com.fasterxml.jackson.databind.type.CollectionType;
import com.google.common.a.eo;
import com.google.common.a.fe;

// Referenced classes of package com.fasterxml.jackson.datatype.guava.deser:
//            GuavaImmutableCollectionDeserializer, GuavaCollectionDeserializer

public class ImmutableMultisetDeserializer extends GuavaImmutableCollectionDeserializer
{

    public ImmutableMultisetDeserializer(CollectionType collectiontype, TypeDeserializer typedeserializer, JsonDeserializer jsondeserializer)
    {
        super(collectiontype, typedeserializer, jsondeserializer);
    }

    protected eo createBuilder()
    {
        return fe.k();
    }

    public GuavaCollectionDeserializer withResolved(TypeDeserializer typedeserializer, JsonDeserializer jsondeserializer)
    {
        return new ImmutableMultisetDeserializer(_containerType, typedeserializer, jsondeserializer);
    }
}
