// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fasterxml.jackson.databind.deser.std;

import com.fasterxml.jackson.databind.DeserializationContext;
import java.lang.reflect.Constructor;

// Referenced classes of package com.fasterxml.jackson.databind.deser.std:
//            StdKeyDeserializer

static final class _ctor extends StdKeyDeserializer
{

    protected final Constructor _ctor;

    public Object _parse(String s, DeserializationContext deserializationcontext)
        throws Exception
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
