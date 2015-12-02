// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fasterxml.jackson.databind.ser;

import com.fasterxml.jackson.databind.SerializationConfig;
import com.fasterxml.jackson.databind.SerializerProvider;

// Referenced classes of package com.fasterxml.jackson.databind.ser:
//            DefaultSerializerProvider, SerializerFactory

public final class > extends DefaultSerializerProvider
{

    public > createInstance(SerializationConfig serializationconfig, SerializerFactory serializerfactory)
    {
        return new <init>(this, serializationconfig, serializerfactory);
    }

    public volatile DefaultSerializerProvider createInstance(SerializationConfig serializationconfig, SerializerFactory serializerfactory)
    {
        return createInstance(serializationconfig, serializerfactory);
    }

    public ()
    {
    }

    protected (SerializerProvider serializerprovider, SerializationConfig serializationconfig, SerializerFactory serializerfactory)
    {
        super(serializerprovider, serializationconfig, serializerfactory);
    }
}
