// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fasterxml.jackson.databind.ser;

import com.fasterxml.jackson.databind.BeanDescription;
import com.fasterxml.jackson.databind.JsonSerializer;
import com.fasterxml.jackson.databind.SerializationConfig;
import java.util.List;

// Referenced classes of package com.fasterxml.jackson.databind.ser:
//            BeanSerializerBuilder

public abstract class BeanSerializerModifier
{

    public BeanSerializerModifier()
    {
    }

    public List changeProperties(SerializationConfig serializationconfig, BeanDescription beandescription, List list)
    {
        return list;
    }

    public JsonSerializer modifySerializer(SerializationConfig serializationconfig, BeanDescription beandescription, JsonSerializer jsonserializer)
    {
        return jsonserializer;
    }

    public List orderProperties(SerializationConfig serializationconfig, BeanDescription beandescription, List list)
    {
        return list;
    }

    public BeanSerializerBuilder updateBuilder(SerializationConfig serializationconfig, BeanDescription beandescription, BeanSerializerBuilder beanserializerbuilder)
    {
        return beanserializerbuilder;
    }
}
