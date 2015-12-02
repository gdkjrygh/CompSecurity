// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fasterxml.jackson.databind.deser.std;

import com.fasterxml.jackson.databind.DeserializationContext;

// Referenced classes of package com.fasterxml.jackson.databind.deser.std:
//            StdKeyDeserializer

final class  extends StdKeyDeserializer
{

    public Byte _parse(String s, DeserializationContext deserializationcontext)
    {
        int i = _parseInt(s);
        if (i < -128 || i > 255)
        {
            throw deserializationcontext.weirdKeyException(_keyClass, s, "overflow, value can not be represented as 8-bit value");
        } else
        {
            return Byte.valueOf((byte)i);
        }
    }

    public volatile Object _parse(String s, DeserializationContext deserializationcontext)
    {
        return _parse(s, deserializationcontext);
    }

    ()
    {
        super(java/lang/Byte);
    }
}
