// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fasterxml.jackson.databind.ser.std;

import com.fasterxml.jackson.databind.BeanProperty;
import com.fasterxml.jackson.databind.jsontype.TypeSerializer;

// Referenced classes of package com.fasterxml.jackson.databind.ser.std:
//            ArraySerializerBase

public abstract class _valueTypeSerializer extends ArraySerializerBase
{

    protected final TypeSerializer _valueTypeSerializer;

    protected ( , BeanProperty beanproperty, TypeSerializer typeserializer)
    {
        super(, beanproperty);
        _valueTypeSerializer = typeserializer;
    }

    protected _valueTypeSerializer(Class class1)
    {
        super(class1);
        _valueTypeSerializer = null;
    }
}
