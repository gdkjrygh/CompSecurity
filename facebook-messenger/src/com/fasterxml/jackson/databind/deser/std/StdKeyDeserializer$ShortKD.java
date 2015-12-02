// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fasterxml.jackson.databind.deser.std;

import com.fasterxml.jackson.databind.DeserializationContext;

// Referenced classes of package com.fasterxml.jackson.databind.deser.std:
//            StdKeyDeserializer

final class I extends StdKeyDeserializer
{

    public volatile Object _parse(String s, DeserializationContext deserializationcontext)
    {
        return _parse(s, deserializationcontext);
    }

    public Short _parse(String s, DeserializationContext deserializationcontext)
    {
        int i = _parseInt(s);
        if (i < -32768 || i > 32767)
        {
            throw deserializationcontext.weirdKeyException(_keyClass, s, "overflow, value can not be represented as 16-bit value");
        } else
        {
            return Short.valueOf((short)i);
        }
    }

    I()
    {
        super(java/lang/Integer);
    }
}
