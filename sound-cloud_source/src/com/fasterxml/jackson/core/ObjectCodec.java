// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fasterxml.jackson.core;

import java.io.IOException;

// Referenced classes of package com.fasterxml.jackson.core:
//            JsonProcessingException, JsonFactory, JsonGenerator

public abstract class ObjectCodec
{

    public ObjectCodec()
    {
    }

    public JsonFactory getFactory()
    {
        return getJsonFactory();
    }

    public abstract JsonFactory getJsonFactory();

    public abstract void writeValue(JsonGenerator jsongenerator, Object obj)
        throws IOException, JsonProcessingException;
}
