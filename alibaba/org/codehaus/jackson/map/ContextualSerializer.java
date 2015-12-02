// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.codehaus.jackson.map;


// Referenced classes of package org.codehaus.jackson.map:
//            JsonMappingException, SerializationConfig, BeanProperty, JsonSerializer

public interface ContextualSerializer
{

    public abstract JsonSerializer createContextual(SerializationConfig serializationconfig, BeanProperty beanproperty)
        throws JsonMappingException;
}
