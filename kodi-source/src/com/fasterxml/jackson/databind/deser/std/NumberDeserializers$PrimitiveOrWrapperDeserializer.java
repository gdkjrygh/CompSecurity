// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fasterxml.jackson.databind.deser.std;


// Referenced classes of package com.fasterxml.jackson.databind.deser.std:
//            StdScalarDeserializer, NumberDeserializers

protected static abstract class _nullValue extends StdScalarDeserializer
{

    protected final Object _nullValue;

    public final Object getNullValue()
    {
        return _nullValue;
    }

    protected a(Class class1, Object obj)
    {
        super(class1);
        _nullValue = obj;
    }
}
