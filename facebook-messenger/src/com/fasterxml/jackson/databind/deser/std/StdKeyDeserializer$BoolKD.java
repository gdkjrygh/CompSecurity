// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fasterxml.jackson.databind.deser.std;

import com.fasterxml.jackson.databind.DeserializationContext;

// Referenced classes of package com.fasterxml.jackson.databind.deser.std:
//            StdKeyDeserializer

final class  extends StdKeyDeserializer
{

    public Boolean _parse(String s, DeserializationContext deserializationcontext)
    {
        if ("true".equals(s))
        {
            return Boolean.TRUE;
        }
        if ("false".equals(s))
        {
            return Boolean.FALSE;
        } else
        {
            throw deserializationcontext.weirdKeyException(_keyClass, s, "value not 'true' or 'false'");
        }
    }

    public volatile Object _parse(String s, DeserializationContext deserializationcontext)
    {
        return _parse(s, deserializationcontext);
    }

    ()
    {
        super(java/lang/Boolean);
    }
}
