// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.codehaus.jackson.map.ser;

import java.util.List;
import org.codehaus.jackson.map.JsonSerializer;
import org.codehaus.jackson.map.SerializationConfig;
import org.codehaus.jackson.map.introspect.BasicBeanDescription;

// Referenced classes of package org.codehaus.jackson.map.ser:
//            BeanSerializerBuilder

public abstract class BeanSerializerModifier
{

    public BeanSerializerModifier()
    {
    }

    public List changeProperties(SerializationConfig serializationconfig, BasicBeanDescription basicbeandescription, List list)
    {
        return list;
    }

    public JsonSerializer modifySerializer(SerializationConfig serializationconfig, BasicBeanDescription basicbeandescription, JsonSerializer jsonserializer)
    {
        return jsonserializer;
    }

    public List orderProperties(SerializationConfig serializationconfig, BasicBeanDescription basicbeandescription, List list)
    {
        return list;
    }

    public BeanSerializerBuilder updateBuilder(SerializationConfig serializationconfig, BasicBeanDescription basicbeandescription, BeanSerializerBuilder beanserializerbuilder)
    {
        return beanserializerbuilder;
    }
}
