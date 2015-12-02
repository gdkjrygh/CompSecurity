// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fasterxml.jackson.databind.deser.std;

import com.fasterxml.jackson.databind.DeserializationContext;
import java.io.ByteArrayInputStream;
import java.io.DataInputStream;
import java.util.UUID;

// Referenced classes of package com.fasterxml.jackson.databind.deser.std:
//            FromStringDeserializer

public class  extends FromStringDeserializer
{

    protected volatile Object _deserialize(String s, DeserializationContext deserializationcontext)
    {
        return _deserialize(s, deserializationcontext);
    }

    protected UUID _deserialize(String s, DeserializationContext deserializationcontext)
    {
        return UUID.fromString(s);
    }

    protected volatile Object _deserializeEmbedded(Object obj, DeserializationContext deserializationcontext)
    {
        return _deserializeEmbedded(obj, deserializationcontext);
    }

    protected UUID _deserializeEmbedded(Object obj, DeserializationContext deserializationcontext)
    {
        if (obj instanceof byte[])
        {
            obj = (byte[])(byte[])obj;
            if (obj.length != 16)
            {
                deserializationcontext.mappingException((new StringBuilder()).append("Can only construct UUIDs from 16 byte arrays; got ").append(obj.length).append(" bytes").toString());
            }
            obj = new DataInputStream(new ByteArrayInputStream(((byte []) (obj))));
            return new UUID(((DataInputStream) (obj)).readLong(), ((DataInputStream) (obj)).readLong());
        } else
        {
            super._deserializeEmbedded(obj, deserializationcontext);
            return null;
        }
    }

    public ()
    {
        super(java/util/UUID);
    }
}
