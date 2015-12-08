// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fasterxml.jackson.databind.deser.std;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.util.TokenBuffer;
import java.io.IOException;

// Referenced classes of package com.fasterxml.jackson.databind.deser.std:
//            StdScalarDeserializer

public class TokenBufferDeserializer extends StdScalarDeserializer
{

    public TokenBufferDeserializer()
    {
        super(com/fasterxml/jackson/databind/util/TokenBuffer);
    }

    protected TokenBuffer createBufferInstance(JsonParser jsonparser)
    {
        return new TokenBuffer(jsonparser);
    }

    public TokenBuffer deserialize(JsonParser jsonparser, DeserializationContext deserializationcontext)
        throws IOException
    {
        return createBufferInstance(jsonparser).deserialize(jsonparser, deserializationcontext);
    }

    public volatile Object deserialize(JsonParser jsonparser, DeserializationContext deserializationcontext)
        throws IOException, JsonProcessingException
    {
        return deserialize(jsonparser, deserializationcontext);
    }
}
