// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fasterxml.jackson.databind.deser.std;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.BeanProperty;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JsonDeserializer;
import com.fasterxml.jackson.databind.JsonMappingException;
import java.io.IOException;
import java.text.DateFormat;
import java.util.Date;

// Referenced classes of package com.fasterxml.jackson.databind.deser.std:
//            DateDeserializers

public static class izer extends izer
{

    public volatile JsonDeserializer createContextual(DeserializationContext deserializationcontext, BeanProperty beanproperty)
        throws JsonMappingException
    {
        return super.createContextual(deserializationcontext, beanproperty);
    }

    public volatile Object deserialize(JsonParser jsonparser, DeserializationContext deserializationcontext)
        throws IOException, JsonProcessingException
    {
        return deserialize(jsonparser, deserializationcontext);
    }

    public Date deserialize(JsonParser jsonparser, DeserializationContext deserializationcontext)
        throws IOException, JsonProcessingException
    {
        return _parseDate(jsonparser, deserializationcontext);
    }

    protected volatile izer withDateFormat(DateFormat dateformat, String s)
    {
        return withDateFormat(dateformat, s);
    }

    protected withDateFormat withDateFormat(DateFormat dateformat, String s)
    {
        return new <init>(this, dateformat, s);
    }

    public izer()
    {
        super(java/util/Date);
    }

    public izer(izer izer, DateFormat dateformat, String s)
    {
        super(izer, dateformat, s);
    }
}
