// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fasterxml.jackson.databind.deser.std;

import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JsonMappingException;
import java.io.IOException;
import java.util.Locale;

// Referenced classes of package com.fasterxml.jackson.databind.deser.std:
//            StdKeyDeserializer

static final class ializer extends StdKeyDeserializer
{

    protected ializer _localeDeserializer;

    protected final volatile Object _parse(String s, DeserializationContext deserializationcontext)
        throws Exception
    {
        return _parse(s, deserializationcontext);
    }

    protected final Locale _parse(String s, DeserializationContext deserializationcontext)
        throws JsonMappingException
    {
        Locale locale;
        try
        {
            locale = _localeDeserializer._deserialize(s, deserializationcontext);
        }
        catch (IOException ioexception)
        {
            throw deserializationcontext.weirdKeyException(_keyClass, s, "unable to parse key as locale");
        }
        return locale;
    }

    ializer()
    {
        super(java/util/Locale);
        _localeDeserializer = new ializer();
    }
}
