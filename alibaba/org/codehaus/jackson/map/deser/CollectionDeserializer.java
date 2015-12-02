// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.codehaus.jackson.map.deser;

import java.lang.reflect.Constructor;
import org.codehaus.jackson.map.JsonDeserializer;
import org.codehaus.jackson.map.TypeDeserializer;
import org.codehaus.jackson.type.JavaType;

// Referenced classes of package org.codehaus.jackson.map.deser:
//            ValueInstantiator

public class CollectionDeserializer extends org.codehaus.jackson.map.deser.std.CollectionDeserializer
{

    protected CollectionDeserializer(CollectionDeserializer collectiondeserializer)
    {
        super(collectiondeserializer);
    }

    public CollectionDeserializer(JavaType javatype, JsonDeserializer jsondeserializer, TypeDeserializer typedeserializer, Constructor constructor)
    {
        super(javatype, jsondeserializer, typedeserializer, constructor);
    }

    public CollectionDeserializer(JavaType javatype, JsonDeserializer jsondeserializer, TypeDeserializer typedeserializer, ValueInstantiator valueinstantiator)
    {
        super(javatype, jsondeserializer, typedeserializer, valueinstantiator);
    }
}
