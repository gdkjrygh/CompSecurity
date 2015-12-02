// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fasterxml.jackson.databind.deser.std;

import com.fasterxml.jackson.databind.DeserializationContext;

// Referenced classes of package com.fasterxml.jackson.databind.deser.std:
//            StdKeyDeserializer

final class  extends StdKeyDeserializer
{

    public Long _parse(String s, DeserializationContext deserializationcontext)
    {
        return Long.valueOf(_parseLong(s));
    }

    public volatile Object _parse(String s, DeserializationContext deserializationcontext)
    {
        return _parse(s, deserializationcontext);
    }

    ()
    {
        super(java/lang/Long);
    }
}
