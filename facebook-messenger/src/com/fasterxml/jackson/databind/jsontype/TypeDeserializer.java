// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fasterxml.jackson.databind.jsontype;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.databind.BeanProperty;
import com.fasterxml.jackson.databind.DeserializationContext;

// Referenced classes of package com.fasterxml.jackson.databind.jsontype:
//            TypeIdResolver

public abstract class TypeDeserializer
{

    public TypeDeserializer()
    {
    }

    public abstract Object deserializeTypedFromAny(JsonParser jsonparser, DeserializationContext deserializationcontext);

    public abstract Object deserializeTypedFromArray(JsonParser jsonparser, DeserializationContext deserializationcontext);

    public abstract Object deserializeTypedFromObject(JsonParser jsonparser, DeserializationContext deserializationcontext);

    public abstract Object deserializeTypedFromScalar(JsonParser jsonparser, DeserializationContext deserializationcontext);

    public abstract TypeDeserializer forProperty(BeanProperty beanproperty);

    public abstract Class getDefaultImpl();

    public abstract String getPropertyName();

    public abstract TypeIdResolver getTypeIdResolver();

    public abstract com.fasterxml.jackson.annotation.JsonTypeInfo.As getTypeInclusion();
}
