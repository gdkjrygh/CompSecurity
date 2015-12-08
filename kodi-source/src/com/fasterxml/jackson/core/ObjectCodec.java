// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fasterxml.jackson.core;

import java.io.IOException;

// Referenced classes of package com.fasterxml.jackson.core:
//            TreeCodec, JsonProcessingException, JsonFactory, JsonGenerator

public abstract class ObjectCodec extends TreeCodec
{

    protected ObjectCodec()
    {
    }

    public JsonFactory getFactory()
    {
        return getJsonFactory();
    }

    public JsonFactory getJsonFactory()
    {
        return getFactory();
    }

    public abstract void writeValue(JsonGenerator jsongenerator, Object obj)
        throws IOException, JsonProcessingException;
}
