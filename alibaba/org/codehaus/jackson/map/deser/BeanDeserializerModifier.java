// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.codehaus.jackson.map.deser;

import org.codehaus.jackson.map.DeserializationConfig;
import org.codehaus.jackson.map.JsonDeserializer;
import org.codehaus.jackson.map.introspect.BasicBeanDescription;

// Referenced classes of package org.codehaus.jackson.map.deser:
//            BeanDeserializerBuilder

public abstract class BeanDeserializerModifier
{

    public BeanDeserializerModifier()
    {
    }

    public JsonDeserializer modifyDeserializer(DeserializationConfig deserializationconfig, BasicBeanDescription basicbeandescription, JsonDeserializer jsondeserializer)
    {
        return jsondeserializer;
    }

    public BeanDeserializerBuilder updateBuilder(DeserializationConfig deserializationconfig, BasicBeanDescription basicbeandescription, BeanDeserializerBuilder beandeserializerbuilder)
    {
        return beandeserializerbuilder;
    }
}
