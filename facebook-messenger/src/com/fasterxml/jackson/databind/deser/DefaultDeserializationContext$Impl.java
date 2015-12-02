// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fasterxml.jackson.databind.deser;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.databind.DeserializationConfig;
import com.fasterxml.jackson.databind.InjectableValues;

// Referenced classes of package com.fasterxml.jackson.databind.deser:
//            DefaultDeserializationContext, DeserializerFactory

public final class > extends DefaultDeserializationContext
{

    public DefaultDeserializationContext createInstance(DeserializationConfig deserializationconfig, JsonParser jsonparser, InjectableValues injectablevalues)
    {
        return new <init>(this, deserializationconfig, jsonparser, injectablevalues);
    }

    public DefaultDeserializationContext with(DeserializerFactory deserializerfactory)
    {
        return new <init>(this, deserializerfactory);
    }

    protected ( , DeserializationConfig deserializationconfig, JsonParser jsonparser, InjectableValues injectablevalues)
    {
        super(, deserializationconfig, jsonparser, injectablevalues);
    }

    protected >(> >, DeserializerFactory deserializerfactory)
    {
        super(>, deserializerfactory);
    }

    public >(DeserializerFactory deserializerfactory)
    {
        super(deserializerfactory, null);
    }
}
