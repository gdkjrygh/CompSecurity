// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fasterxml.jackson.databind.deser.std;

import com.fasterxml.jackson.core.JsonLocation;
import com.fasterxml.jackson.databind.DeserializationConfig;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.deser.CreatorProperty;
import com.fasterxml.jackson.databind.deser.SettableBeanProperty;
import com.fasterxml.jackson.databind.deser.ValueInstantiator;

// Referenced classes of package com.fasterxml.jackson.databind.deser.std:
//            JacksonDeserializers

public static class  extends ValueInstantiator
{

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
        com.fasterxml.jackson.databind.JavaType javatype = deserializationconfig.constructType(Integer.TYPE);
        com.fasterxml.jackson.databind.JavaType javatype1 = deserializationconfig.constructType(Long.TYPE);
        return (new CreatorProperty[] {
            new CreatorProperty("sourceRef", deserializationconfig.constructType(java/lang/Object), null, null, null, 0, null), new CreatorProperty("byteOffset", javatype1, null, null, null, 1, null), new CreatorProperty("charOffset", javatype1, null, null, null, 2, null), new CreatorProperty("lineNr", javatype, null, null, null, 3, null), new CreatorProperty("columnNr", javatype, null, null, null, 4, null)
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

    public ()
    {
    }
}
