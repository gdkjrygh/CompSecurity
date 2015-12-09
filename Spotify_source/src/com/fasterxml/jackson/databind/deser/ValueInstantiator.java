// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fasterxml.jackson.databind.deser;

import com.fasterxml.jackson.databind.DeserializationConfig;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.introspect.AnnotatedParameter;
import com.fasterxml.jackson.databind.introspect.AnnotatedWithParams;

// Referenced classes of package com.fasterxml.jackson.databind.deser:
//            SettableBeanProperty

public abstract class ValueInstantiator
{

    public ValueInstantiator()
    {
    }

    public Object _createFromStringFallbacks(DeserializationContext deserializationcontext, String s)
    {
        if (canCreateFromBoolean())
        {
            String s1 = s.trim();
            if ("true".equals(s1))
            {
                return createFromBoolean(deserializationcontext, true);
            }
            if ("false".equals(s1))
            {
                return createFromBoolean(deserializationcontext, false);
            }
        }
        if (s.length() == 0 && deserializationcontext.isEnabled(DeserializationFeature.ACCEPT_EMPTY_STRING_AS_NULL_OBJECT))
        {
            return null;
        } else
        {
            throw deserializationcontext.mappingException((new StringBuilder("Can not instantiate value of type ")).append(getValueTypeDesc()).append(" from String value ('").append(s).append("'); no single-String constructor/factory method").toString());
        }
    }

    public boolean canCreateFromBoolean()
    {
        return false;
    }

    public boolean canCreateFromDouble()
    {
        return false;
    }

    public boolean canCreateFromInt()
    {
        return false;
    }

    public boolean canCreateFromLong()
    {
        return false;
    }

    public boolean canCreateFromObjectWith()
    {
        return false;
    }

    public boolean canCreateFromString()
    {
        return false;
    }

    public boolean canCreateUsingDefault()
    {
        return getDefaultCreator() != null;
    }

    public boolean canCreateUsingDelegate()
    {
        return false;
    }

    public boolean canInstantiate()
    {
        return canCreateUsingDefault() || canCreateUsingDelegate() || canCreateFromObjectWith() || canCreateFromString() || canCreateFromInt() || canCreateFromLong() || canCreateFromDouble() || canCreateFromBoolean();
    }

    public Object createFromBoolean(DeserializationContext deserializationcontext, boolean flag)
    {
        throw deserializationcontext.mappingException((new StringBuilder("Can not instantiate value of type ")).append(getValueTypeDesc()).append(" from Boolean value (").append(flag).append(")").toString());
    }

    public Object createFromDouble(DeserializationContext deserializationcontext, double d)
    {
        throw deserializationcontext.mappingException((new StringBuilder("Can not instantiate value of type ")).append(getValueTypeDesc()).append(" from Floating-point number (").append(d).append(", double)").toString());
    }

    public Object createFromInt(DeserializationContext deserializationcontext, int i)
    {
        throw deserializationcontext.mappingException((new StringBuilder("Can not instantiate value of type ")).append(getValueTypeDesc()).append(" from Integer number (").append(i).append(", int)").toString());
    }

    public Object createFromLong(DeserializationContext deserializationcontext, long l)
    {
        throw deserializationcontext.mappingException((new StringBuilder("Can not instantiate value of type ")).append(getValueTypeDesc()).append(" from Integer number (").append(l).append(", long)").toString());
    }

    public Object createFromObjectWith(DeserializationContext deserializationcontext, Object aobj[])
    {
        throw deserializationcontext.mappingException((new StringBuilder("Can not instantiate value of type ")).append(getValueTypeDesc()).append(" with arguments").toString());
    }

    public Object createFromString(DeserializationContext deserializationcontext, String s)
    {
        return _createFromStringFallbacks(deserializationcontext, s);
    }

    public Object createUsingDefault(DeserializationContext deserializationcontext)
    {
        throw deserializationcontext.mappingException((new StringBuilder("Can not instantiate value of type ")).append(getValueTypeDesc()).append("; no default creator found").toString());
    }

    public Object createUsingDelegate(DeserializationContext deserializationcontext, Object obj)
    {
        throw deserializationcontext.mappingException((new StringBuilder("Can not instantiate value of type ")).append(getValueTypeDesc()).append(" using delegate").toString());
    }

    public AnnotatedWithParams getDefaultCreator()
    {
        return null;
    }

    public AnnotatedWithParams getDelegateCreator()
    {
        return null;
    }

    public JavaType getDelegateType(DeserializationConfig deserializationconfig)
    {
        return null;
    }

    public SettableBeanProperty[] getFromObjectArguments(DeserializationConfig deserializationconfig)
    {
        return null;
    }

    public AnnotatedParameter getIncompleteParameter()
    {
        return null;
    }

    public abstract String getValueTypeDesc();
}
