// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fasterxml.jackson.databind.deser.std;

import com.fasterxml.jackson.databind.DeserializationContext;
import java.lang.reflect.Constructor;

// Referenced classes of package com.fasterxml.jackson.databind.deser.std:
//            StdKeyDeserializer

final class _ctor extends StdKeyDeserializer
{

    private static final long serialVersionUID = 1L;
    protected final Constructor _ctor;

    public final Object _parse(String s, DeserializationContext deserializationcontext)
    {
        return _ctor.newInstance(new Object[] {
            s
        });
    }

    public (Constructor constructor)
    {
        super(-1, constructor.getDeclaringClass());
        _ctor = constructor;
    }
}
