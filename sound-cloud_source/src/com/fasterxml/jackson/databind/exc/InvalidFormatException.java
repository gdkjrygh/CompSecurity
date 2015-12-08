// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fasterxml.jackson.databind.exc;

import com.fasterxml.jackson.core.JsonLocation;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.databind.JsonMappingException;

public class InvalidFormatException extends JsonMappingException
{

    protected final Class _targetType;
    protected final Object _value;

    public InvalidFormatException(String s, JsonLocation jsonlocation, Object obj, Class class1)
    {
        super(s, jsonlocation);
        _value = obj;
        _targetType = class1;
    }

    public static InvalidFormatException from(JsonParser jsonparser, String s, Object obj, Class class1)
    {
        return new InvalidFormatException(s, jsonparser.getTokenLocation(), obj, class1);
    }
}
