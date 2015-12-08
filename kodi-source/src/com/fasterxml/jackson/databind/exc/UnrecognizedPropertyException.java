// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fasterxml.jackson.databind.exc;

import com.fasterxml.jackson.core.JsonLocation;
import com.fasterxml.jackson.core.JsonParser;
import java.util.Collection;

// Referenced classes of package com.fasterxml.jackson.databind.exc:
//            PropertyBindingException

public class UnrecognizedPropertyException extends PropertyBindingException
{

    public UnrecognizedPropertyException(String s, JsonLocation jsonlocation, Class class1, String s1, Collection collection)
    {
        super(s, jsonlocation, class1, s1, collection);
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
}
