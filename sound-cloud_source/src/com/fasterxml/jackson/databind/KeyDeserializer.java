// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fasterxml.jackson.databind;

import com.fasterxml.jackson.core.JsonProcessingException;
import java.io.IOException;

// Referenced classes of package com.fasterxml.jackson.databind:
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
