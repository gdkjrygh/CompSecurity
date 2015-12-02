// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fasterxml.jackson.databind.deser.std;

import com.fasterxml.jackson.databind.DeserializationContext;
import java.lang.reflect.Method;

// Referenced classes of package com.fasterxml.jackson.databind.deser.std:
//            StdKeyDeserializer

final class _factoryMethod extends StdKeyDeserializer
{

    final Method _factoryMethod;

    public Object _parse(String s, DeserializationContext deserializationcontext)
    {
        return _factoryMethod.invoke(null, new Object[] {
            s
        });
    }

    public (Method method)
    {
        super(method.getDeclaringClass());
        _factoryMethod = method;
    }
}
