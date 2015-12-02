// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.codehaus.jackson.map;

import java.io.IOException;
import org.codehaus.jackson.JsonProcessingException;

// Referenced classes of package org.codehaus.jackson.map:
//            DeserializationContext

public abstract class KeyDeserializer
{
    public static abstract class None extends KeyDeserializer
    {

        public None()
        {
        }
    }


    public KeyDeserializer()
    {
    }

    public abstract Object deserializeKey(String s, DeserializationContext deserializationcontext)
        throws IOException, JsonProcessingException;
}
