// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fasterxml.jackson.databind.ser.std;

import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.JsonSerializer;
import com.fasterxml.jackson.databind.jsontype.TypeSerializer;
import com.fasterxml.jackson.databind.ser.ContainerSerializer;
import com.fasterxml.jackson.databind.ser.impl.IndexedListSerializer;
import com.fasterxml.jackson.databind.ser.impl.IteratorSerializer;

// Referenced classes of package com.fasterxml.jackson.databind.ser.std:
//            CollectionSerializer, EnumSetSerializer, IterableSerializer

public class StdContainerSerializers
{

    public static ContainerSerializer collectionSerializer(JavaType javatype, boolean flag, TypeSerializer typeserializer, JsonSerializer jsonserializer)
    {
        return new CollectionSerializer(javatype, flag, typeserializer, null, jsonserializer);
    }

    public static JsonSerializer enumSetSerializer(JavaType javatype)
    {
        return new EnumSetSerializer(javatype, null);
    }

    public static ContainerSerializer indexedListSerializer(JavaType javatype, boolean flag, TypeSerializer typeserializer, JsonSerializer jsonserializer)
    {
        return new IndexedListSerializer(javatype, flag, typeserializer, null, jsonserializer);
    }

    public static ContainerSerializer iterableSerializer(JavaType javatype, boolean flag, TypeSerializer typeserializer)
    {
        return new IterableSerializer(javatype, flag, typeserializer, null);
    }

    public static ContainerSerializer iteratorSerializer(JavaType javatype, boolean flag, TypeSerializer typeserializer)
    {
        return new IteratorSerializer(javatype, flag, typeserializer, null);
    }
}
