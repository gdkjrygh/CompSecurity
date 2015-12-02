// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.codehaus.jackson.map.deser;

import java.lang.reflect.Constructor;
import org.codehaus.jackson.map.JsonDeserializer;
import org.codehaus.jackson.map.KeyDeserializer;
import org.codehaus.jackson.map.TypeDeserializer;
import org.codehaus.jackson.type.JavaType;

// Referenced classes of package org.codehaus.jackson.map.deser:
//            ValueInstantiator

public class MapDeserializer extends org.codehaus.jackson.map.deser.std.MapDeserializer
{

    protected MapDeserializer(MapDeserializer mapdeserializer)
    {
        super(mapdeserializer);
    }

    public MapDeserializer(JavaType javatype, Constructor constructor, KeyDeserializer keydeserializer, JsonDeserializer jsondeserializer, TypeDeserializer typedeserializer)
    {
        super(javatype, constructor, keydeserializer, jsondeserializer, typedeserializer);
    }

    public MapDeserializer(JavaType javatype, ValueInstantiator valueinstantiator, KeyDeserializer keydeserializer, JsonDeserializer jsondeserializer, TypeDeserializer typedeserializer)
    {
        super(javatype, valueinstantiator, keydeserializer, jsondeserializer, typedeserializer);
    }
}
