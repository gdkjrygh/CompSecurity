// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fasterxml.jackson.databind.deser.std;

import com.fasterxml.jackson.core.JsonLocation;
import com.fasterxml.jackson.databind.DeserializationConfig;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.PropertyMetadata;
import com.fasterxml.jackson.databind.PropertyName;
import com.fasterxml.jackson.databind.deser.CreatorProperty;
import com.fasterxml.jackson.databind.deser.SettableBeanProperty;
import com.fasterxml.jackson.databind.deser.ValueInstantiator;

public class JsonLocationInstantiator extends ValueInstantiator
{

    public JsonLocationInstantiator()
    {
    }

    private static final int _int(Object obj)
    {
        if (obj == null)
        {
            return 0;
        } else
        {
            return ((Number)obj).intValue();
        }
    }

    private static final long _long(Object obj)
    {
        if (obj == null)
        {
            return 0L;
        } else
        {
            return ((Number)obj).longValue();
        }
    }

    private static CreatorProperty creatorProp(String s, JavaType javatype, int i)
    {
        return new CreatorProperty(new PropertyName(s), javatype, null, null, null, null, i, null, PropertyMetadata.STD_REQUIRED);
    }

    public boolean canCreateFromObjectWith()
    {
        return true;
    }

    public Object createFromObjectWith(DeserializationContext deserializationcontext, Object aobj[])
    {
        return new JsonLocation(aobj[0], _long(aobj[1]), _long(aobj[2]), _int(aobj[3]), _int(aobj[4]));
    }

    public CreatorProperty[] getFromObjectArguments(DeserializationConfig deserializationconfig)
    {
        JavaType javatype = deserializationconfig.constructType(Integer.TYPE);
        JavaType javatype1 = deserializationconfig.constructType(Long.TYPE);
        return (new CreatorProperty[] {
            creatorProp("sourceRef", deserializationconfig.constructType(java/lang/Object), 0), creatorProp("byteOffset", javatype1, 1), creatorProp("charOffset", javatype1, 2), creatorProp("lineNr", javatype, 3), creatorProp("columnNr", javatype, 4)
        });
    }

    public volatile SettableBeanProperty[] getFromObjectArguments(DeserializationConfig deserializationconfig)
    {
        return getFromObjectArguments(deserializationconfig);
    }

    public String getValueTypeDesc()
    {
        return com/fasterxml/jackson/core/JsonLocation.getName();
    }
}
