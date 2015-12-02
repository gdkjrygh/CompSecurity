// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fasterxml.jackson.databind.deser;

import com.fasterxml.jackson.databind.BeanDescription;
import com.fasterxml.jackson.databind.DeserializationConfig;
import com.fasterxml.jackson.databind.JsonDeserializer;
import java.util.List;

// Referenced classes of package com.fasterxml.jackson.databind.deser:
//            BeanDeserializerBuilder

public abstract class BeanDeserializerModifier
{

    public BeanDeserializerModifier()
    {
    }

    public JsonDeserializer modifyDeserializer(DeserializationConfig deserializationconfig, BeanDescription beandescription, JsonDeserializer jsondeserializer)
    {
        return jsondeserializer;
    }

    public BeanDeserializerBuilder updateBuilder(DeserializationConfig deserializationconfig, BeanDescription beandescription, BeanDeserializerBuilder beandeserializerbuilder)
    {
        return beandeserializerbuilder;
    }

    public List updateProperties(DeserializationConfig deserializationconfig, BeanDescription beandescription, List list)
    {
        return list;
    }
}
