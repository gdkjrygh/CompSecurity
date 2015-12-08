// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fasterxml.jackson.databind.exc;

import com.fasterxml.jackson.core.JsonLocation;
import com.fasterxml.jackson.databind.JsonMappingException;
import java.util.Collection;
import java.util.Iterator;

public abstract class PropertyBindingException extends JsonMappingException
{

    protected transient String _propertiesAsString;
    protected final Collection _propertyIds;
    protected final String _propertyName;
    protected final Class _referringClass;

    protected PropertyBindingException(String s, JsonLocation jsonlocation, Class class1, String s1, Collection collection)
    {
        super(s, jsonlocation);
        _referringClass = class1;
        _propertyName = s1;
        _propertyIds = collection;
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
            if (iterator.hasNext())
            {
label0:
                {
                    ((StringBuilder) (obj)).append('"');
                    ((StringBuilder) (obj)).append(String.valueOf(iterator.next()));
                    ((StringBuilder) (obj)).append('"');
                    if (((StringBuilder) (obj)).length() <= 200)
                    {
                        break label0;
                    }
                    ((StringBuilder) (obj)).append(" [truncated]");
                }
            }
            if (true)
            {
                continue;
            }
            if (iterator.hasNext())
            {
                ((StringBuilder) (obj)).append(", ");
            }
        } while (true);
        if (true) goto _L7; else goto _L6
_L6:
    }
}
