// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fasterxml.jackson.databind.deser.std;

import com.fasterxml.jackson.databind.DeserializationConfig;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.introspect.AnnotatedMethod;
import com.fasterxml.jackson.databind.util.ClassUtil;
import com.fasterxml.jackson.databind.util.EnumResolver;

// Referenced classes of package com.fasterxml.jackson.databind.deser.std:
//            StdKeyDeserializer

final class _factory extends StdKeyDeserializer
{

    private static final long serialVersionUID = 1L;
    protected final AnnotatedMethod _factory;
    protected final EnumResolver _resolver;

    public final Object _parse(String s, DeserializationContext deserializationcontext)
    {
        if (_factory == null) goto _L2; else goto _L1
_L1:
        Object obj = _factory.call1(s);
_L4:
        return obj;
        obj;
        ClassUtil.unwrapAndThrowAsIAE(((Throwable) (obj)));
_L2:
        Enum enum = _resolver.findEnum(s);
        obj = enum;
        if (enum == null)
        {
            obj = enum;
            if (!deserializationcontext.getConfig().isEnabled(DeserializationFeature.READ_UNKNOWN_ENUM_VALUES_AS_NULL))
            {
                throw deserializationcontext.weirdKeyException(_keyClass, s, "not one of values for Enum class");
            }
        }
        if (true) goto _L4; else goto _L3
_L3:
    }

    protected (EnumResolver enumresolver, AnnotatedMethod annotatedmethod)
    {
        super(-1, enumresolver.getEnumClass());
        _resolver = enumresolver;
        _factory = annotatedmethod;
    }
}
