// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fasterxml.jackson.databind.deser.std;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.databind.DeserializationContext;
import java.util.concurrent.atomic.AtomicBoolean;

// Referenced classes of package com.fasterxml.jackson.databind.deser.std:
//            StdScalarDeserializer

public class AtomicBooleanDeserializer extends StdScalarDeserializer
{

    private static final long serialVersionUID = 1L;

    public AtomicBooleanDeserializer()
    {
        super(java/util/concurrent/atomic/AtomicBoolean);
    }

    public volatile Object deserialize(JsonParser jsonparser, DeserializationContext deserializationcontext)
    {
        return deserialize(jsonparser, deserializationcontext);
    }

    public AtomicBoolean deserialize(JsonParser jsonparser, DeserializationContext deserializationcontext)
    {
        return new AtomicBoolean(_parseBooleanPrimitive(jsonparser, deserializationcontext));
    }
}
