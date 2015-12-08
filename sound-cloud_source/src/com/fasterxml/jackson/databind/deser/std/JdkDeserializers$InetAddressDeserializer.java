// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fasterxml.jackson.databind.deser.std;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.DeserializationContext;
import java.io.IOException;
import java.net.InetAddress;

// Referenced classes of package com.fasterxml.jackson.databind.deser.std:
//            FromStringDeserializer, JdkDeserializers

protected static class  extends FromStringDeserializer
{

    protected volatile Object _deserialize(String s, DeserializationContext deserializationcontext)
        throws IOException, JsonProcessingException
    {
        return _deserialize(s, deserializationcontext);
    }

    protected InetAddress _deserialize(String s, DeserializationContext deserializationcontext)
        throws IOException
    {
        return InetAddress.getByName(s);
    }

    public ()
    {
        super(java/net/InetAddress);
    }
}
