// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fasterxml.jackson.databind.deser.std;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.databind.BeanProperty;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JsonDeserializer;
import java.sql.Timestamp;
import java.text.DateFormat;
import java.util.Date;

public class <init> extends <init>
{

    public volatile JsonDeserializer createContextual(DeserializationContext deserializationcontext, BeanProperty beanproperty)
    {
        return super.createContextual(deserializationcontext, beanproperty);
    }

    public volatile Object deserialize(JsonParser jsonparser, DeserializationContext deserializationcontext)
    {
        return deserialize(jsonparser, deserializationcontext);
    }

    public Timestamp deserialize(JsonParser jsonparser, DeserializationContext deserializationcontext)
    {
        return new Timestamp(_parseDate(jsonparser, deserializationcontext).getTime());
    }

    protected volatile _parseDate withDateFormat(DateFormat dateformat, String s)
    {
        return withDateFormat(dateformat, s);
    }

    protected withDateFormat withDateFormat(DateFormat dateformat, String s)
    {
        return new <init>(this, dateformat, s);
    }

    public ()
    {
        super(java/sql/Timestamp);
    }

    public <init>(<init> <init>1, DateFormat dateformat, String s)
    {
        super(<init>1, dateformat, s);
    }
}
