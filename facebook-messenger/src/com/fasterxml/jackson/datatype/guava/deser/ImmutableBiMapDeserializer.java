// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fasterxml.jackson.datatype.guava.deser;

import com.fasterxml.jackson.databind.JsonDeserializer;
import com.fasterxml.jackson.databind.KeyDeserializer;
import com.fasterxml.jackson.databind.jsontype.TypeDeserializer;
import com.fasterxml.jackson.databind.type.MapType;
import com.google.common.a.ej;
import com.google.common.a.ew;

// Referenced classes of package com.fasterxml.jackson.datatype.guava.deser:
//            GuavaImmutableMapDeserializer, GuavaMapDeserializer

public class ImmutableBiMapDeserializer extends GuavaImmutableMapDeserializer
{

    public ImmutableBiMapDeserializer(MapType maptype, KeyDeserializer keydeserializer, TypeDeserializer typedeserializer, JsonDeserializer jsondeserializer)
    {
        super(maptype, keydeserializer, typedeserializer, jsondeserializer);
    }

    protected ew createBuilder()
    {
        return ej.f();
    }

    public GuavaMapDeserializer withResolved(KeyDeserializer keydeserializer, TypeDeserializer typedeserializer, JsonDeserializer jsondeserializer)
    {
        return new ImmutableBiMapDeserializer(_mapType, keydeserializer, typedeserializer, jsondeserializer);
    }
}
