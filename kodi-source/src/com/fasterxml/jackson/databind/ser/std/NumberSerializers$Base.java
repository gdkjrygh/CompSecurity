// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fasterxml.jackson.databind.ser.std;

import com.fasterxml.jackson.databind.AnnotationIntrospector;
import com.fasterxml.jackson.databind.BeanProperty;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.JsonSerializer;
import com.fasterxml.jackson.databind.SerializerProvider;
import com.fasterxml.jackson.databind.ser.ContextualSerializer;

// Referenced classes of package com.fasterxml.jackson.databind.ser.std:
//            StdScalarSerializer, NumberSerializers, ToStringSerializer

protected static abstract class _isInt extends StdScalarSerializer
    implements ContextualSerializer
{

    protected final boolean _isInt;
    protected final com.fasterxml.jackson.core.ializer.instance _numberType;
    protected final String _schemaType;

    public JsonSerializer createContextual(SerializerProvider serializerprovider, BeanProperty beanproperty)
        throws JsonMappingException
    {
        if (beanproperty == null) goto _L2; else goto _L1
_L1:
        beanproperty = beanproperty.getMember();
        if (beanproperty == null) goto _L2; else goto _L3
_L3:
        serializerprovider = serializerprovider.getAnnotationIntrospector().findFormat(beanproperty);
        if (serializerprovider == null) goto _L2; else goto _L4
_L4:
        itchMap.com.fasterxml.jackson.annotation.JsonFormat.Shape[serializerprovider.pe().l()];
        JVM INSTR tableswitch 1 1: default 56
    //                   1 58;
           goto _L2 _L5
_L2:
        return this;
_L5:
        return ToStringSerializer.instance;
    }

    protected (Class class1, com.fasterxml.jackson.core.lizers.Base base, String s)
    {
        super(class1);
        _numberType = base;
        _schemaType = s;
        boolean flag;
        if (base == com.fasterxml.jackson.core.NT || base == com.fasterxml.jackson.core.ONG || base == com.fasterxml.jackson.core.IG_INTEGER)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        _isInt = flag;
    }
}
