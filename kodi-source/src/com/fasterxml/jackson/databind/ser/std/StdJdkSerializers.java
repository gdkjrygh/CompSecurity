// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fasterxml.jackson.databind.ser.std;

import com.fasterxml.jackson.core.JsonGenerationException;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.databind.SerializerProvider;
import java.io.File;
import java.io.IOException;
import java.net.URI;
import java.net.URL;
import java.util.Collection;
import java.util.Currency;
import java.util.HashMap;
import java.util.Locale;
import java.util.UUID;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
import java.util.regex.Pattern;

// Referenced classes of package com.fasterxml.jackson.databind.ser.std:
//            ToStringSerializer, UUIDSerializer, FileSerializer, ClassSerializer, 
//            NullSerializer, StdScalarSerializer, StdSerializer

public class StdJdkSerializers
{
    public static class AtomicBooleanSerializer extends StdScalarSerializer
    {

        public volatile void serialize(Object obj, JsonGenerator jsongenerator, SerializerProvider serializerprovider)
            throws IOException, JsonGenerationException
        {
            serialize((AtomicBoolean)obj, jsongenerator, serializerprovider);
        }

        public void serialize(AtomicBoolean atomicboolean, JsonGenerator jsongenerator, SerializerProvider serializerprovider)
            throws IOException, JsonGenerationException
        {
            jsongenerator.writeBoolean(atomicboolean.get());
        }

        public AtomicBooleanSerializer()
        {
            super(java/util/concurrent/atomic/AtomicBoolean, false);
        }
    }

    public static class AtomicIntegerSerializer extends StdScalarSerializer
    {

        public volatile void serialize(Object obj, JsonGenerator jsongenerator, SerializerProvider serializerprovider)
            throws IOException, JsonGenerationException
        {
            serialize((AtomicInteger)obj, jsongenerator, serializerprovider);
        }

        public void serialize(AtomicInteger atomicinteger, JsonGenerator jsongenerator, SerializerProvider serializerprovider)
            throws IOException, JsonGenerationException
        {
            jsongenerator.writeNumber(atomicinteger.get());
        }

        public AtomicIntegerSerializer()
        {
            super(java/util/concurrent/atomic/AtomicInteger, false);
        }
    }

    public static class AtomicLongSerializer extends StdScalarSerializer
    {

        public volatile void serialize(Object obj, JsonGenerator jsongenerator, SerializerProvider serializerprovider)
            throws IOException, JsonGenerationException
        {
            serialize((AtomicLong)obj, jsongenerator, serializerprovider);
        }

        public void serialize(AtomicLong atomiclong, JsonGenerator jsongenerator, SerializerProvider serializerprovider)
            throws IOException, JsonGenerationException
        {
            jsongenerator.writeNumber(atomiclong.get());
        }

        public AtomicLongSerializer()
        {
            super(java/util/concurrent/atomic/AtomicLong, false);
        }
    }

    public static class AtomicReferenceSerializer extends StdSerializer
    {

        public volatile void serialize(Object obj, JsonGenerator jsongenerator, SerializerProvider serializerprovider)
            throws IOException, JsonGenerationException
        {
            serialize((AtomicReference)obj, jsongenerator, serializerprovider);
        }

        public void serialize(AtomicReference atomicreference, JsonGenerator jsongenerator, SerializerProvider serializerprovider)
            throws IOException, JsonGenerationException
        {
            serializerprovider.defaultSerializeValue(atomicreference.get(), jsongenerator);
        }

        public AtomicReferenceSerializer()
        {
            super(java/util/concurrent/atomic/AtomicReference, false);
        }
    }


    public static Collection all()
    {
        HashMap hashmap = new HashMap();
        ToStringSerializer tostringserializer = ToStringSerializer.instance;
        hashmap.put(java/net/URL, tostringserializer);
        hashmap.put(java/net/URI, tostringserializer);
        hashmap.put(java/util/Currency, tostringserializer);
        hashmap.put(java/util/UUID, new UUIDSerializer());
        hashmap.put(java/util/regex/Pattern, tostringserializer);
        hashmap.put(java/util/Locale, tostringserializer);
        hashmap.put(java/util/Locale, tostringserializer);
        hashmap.put(java/util/concurrent/atomic/AtomicReference, com/fasterxml/jackson/databind/ser/std/StdJdkSerializers$AtomicReferenceSerializer);
        hashmap.put(java/util/concurrent/atomic/AtomicBoolean, com/fasterxml/jackson/databind/ser/std/StdJdkSerializers$AtomicBooleanSerializer);
        hashmap.put(java/util/concurrent/atomic/AtomicInteger, com/fasterxml/jackson/databind/ser/std/StdJdkSerializers$AtomicIntegerSerializer);
        hashmap.put(java/util/concurrent/atomic/AtomicLong, com/fasterxml/jackson/databind/ser/std/StdJdkSerializers$AtomicLongSerializer);
        hashmap.put(java/io/File, com/fasterxml/jackson/databind/ser/std/FileSerializer);
        hashmap.put(java/lang/Class, com/fasterxml/jackson/databind/ser/std/ClassSerializer);
        hashmap.put(java/lang/Void, NullSerializer.instance);
        hashmap.put(Void.TYPE, NullSerializer.instance);
        return hashmap.entrySet();
    }
}
