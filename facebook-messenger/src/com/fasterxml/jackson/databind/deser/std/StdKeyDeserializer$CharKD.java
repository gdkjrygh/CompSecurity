// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fasterxml.jackson.databind.deser.std;

import com.fasterxml.jackson.databind.DeserializationContext;

// Referenced classes of package com.fasterxml.jackson.databind.deser.std:
//            StdKeyDeserializer

final class  extends StdKeyDeserializer
{

    public Character _parse(String s, DeserializationContext deserializationcontext)
    {
        if (s.length() == 1)
        {
            return Character.valueOf(s.charAt(0));
        } else
        {
            throw deserializationcontext.weirdKeyException(_keyClass, s, "can only convert 1-character Strings");
        }
    }

    public volatile Object _parse(String s, DeserializationContext deserializationcontext)
    {
        return _parse(s, deserializationcontext);
    }

    ()
    {
        super(java/lang/Character);
    }
}
