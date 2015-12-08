// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.inject.internal;

import com.google.inject.TypeLiteral;
import com.google.inject.spi.TypeConverter;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

// Referenced classes of package com.google.inject.internal:
//            TypeConverterBindingProcessor

class val.wrapperType
    implements TypeConverter
{

    final TypeConverterBindingProcessor this$0;
    final Method val$parser;
    final Class val$wrapperType;

    public Object convert(String s, TypeLiteral typeliteral)
    {
        try
        {
            s = ((String) (val$parser.invoke(null, new Object[] {
                s
            })));
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            throw new AssertionError(s);
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            throw new RuntimeException(s.getTargetException().getMessage());
        }
        return s;
    }

    public String toString()
    {
        return (new StringBuilder()).append("TypeConverter<").append(val$wrapperType.getSimpleName()).append(">").toString();
    }

    ()
    {
        this$0 = final_typeconverterbindingprocessor;
        val$parser = method;
        val$wrapperType = Class.this;
        super();
    }
}
