// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fasterxml.jackson.databind.exc;

import com.fasterxml.jackson.core.JsonLocation;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.databind.JsonMappingException;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;

public class UnrecognizedPropertyException extends JsonMappingException
{

    private static final int MAX_DESC_LENGTH = 200;
    private static final long serialVersionUID = 1L;
    protected transient String _propertiesAsString;
    protected final Collection _propertyIds;
    protected final Class _referringClass;
    protected final String _unrecognizedPropertyName;

    public UnrecognizedPropertyException(String s, JsonLocation jsonlocation, Class class1, String s1, Collection collection)
    {
        super(s, jsonlocation);
        _referringClass = class1;
        _unrecognizedPropertyName = s1;
        _propertyIds = collection;
    }

    public static UnrecognizedPropertyException from(JsonParser jsonparser, Object obj, String s, Collection collection)
    {
        if (obj == null)
        {
            throw new IllegalArgumentException();
        }
        Class class1;
        if (obj instanceof Class)
        {
            class1 = (Class)obj;
        } else
        {
            class1 = obj.getClass();
        }
        jsonparser = new UnrecognizedPropertyException((new StringBuilder()).append("Unrecognized field \"").append(s).append("\" (class ").append(class1.getName()).append("), not marked as ignorable").toString(), jsonparser.getCurrentLocation(), class1, s, collection);
        jsonparser.prependPath(obj, s);
        return jsonparser;
    }

    public Collection getKnownPropertyIds()
    {
        if (_propertyIds == null)
        {
            return null;
        } else
        {
            return Collections.unmodifiableCollection(_propertyIds);
        }
    }

    public String getMessageSuffix()
    {
        Object obj;
        String s;
        s = _propertiesAsString;
        obj = s;
        if (s != null) goto _L2; else goto _L1
_L1:
        obj = s;
        if (_propertyIds == null) goto _L2; else goto _L3
_L3:
        int i;
        obj = new StringBuilder(100);
        i = _propertyIds.size();
        if (i != 1) goto _L5; else goto _L4
_L4:
        ((StringBuilder) (obj)).append(" (one known property: \"");
        ((StringBuilder) (obj)).append(String.valueOf(_propertyIds.iterator().next()));
        ((StringBuilder) (obj)).append('"');
_L7:
        ((StringBuilder) (obj)).append("])");
        obj = ((StringBuilder) (obj)).toString();
        _propertiesAsString = ((String) (obj));
_L2:
        return ((String) (obj));
_L5:
        ((StringBuilder) (obj)).append(" (").append(i).append(" known properties: ");
        Iterator iterator = _propertyIds.iterator();
        do
        {
            if (!iterator.hasNext())
            {
                continue; /* Loop/switch isn't completed */
            }
            ((StringBuilder) (obj)).append(", \"");
            ((StringBuilder) (obj)).append(String.valueOf(iterator.next()));
            ((StringBuilder) (obj)).append('"');
        } while (((StringBuilder) (obj)).length() <= 200);
        ((StringBuilder) (obj)).append(" [truncated]");
        if (true) goto _L7; else goto _L6
_L6:
    }

    public Class getReferringClass()
    {
        return _referringClass;
    }

    public String getUnrecognizedPropertyName()
    {
        return _unrecognizedPropertyName;
    }
}
