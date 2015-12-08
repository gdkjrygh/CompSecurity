// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fasterxml.jackson.databind.deser.std;

import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JsonMappingException;
import java.util.Date;

// Referenced classes of package com.fasterxml.jackson.databind.deser.std:
//            StdKeyDeserializer

static final class  extends StdKeyDeserializer
{

    public final Object _parse(String s, DeserializationContext deserializationcontext)
        throws IllegalArgumentException, JsonMappingException
    {
        return deserializationcontext.parseDate(s);
    }

    protected ()
    {
        super(java/util/Date);
    }
}
