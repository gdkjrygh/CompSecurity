// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fasterxml.jackson.databind.deser.std;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.introspect.AnnotatedMethod;
import com.fasterxml.jackson.databind.util.ClassUtil;
import java.io.IOException;
import java.lang.reflect.Method;

// Referenced classes of package com.fasterxml.jackson.databind.deser.std:
//            StdScalarDeserializer, EnumDeserializer

protected static class _inputType extends StdScalarDeserializer
{

    protected final Class _enumClass;
    protected final Method _factory;
    protected final Class _inputType;

    public Object deserialize(JsonParser jsonparser, DeserializationContext deserializationcontext)
        throws IOException, JsonProcessingException
    {
        if (_inputType == null)
        {
            jsonparser = jsonparser.getText();
        } else
        if (_inputType == java/lang/Integer)
        {
            jsonparser = Integer.valueOf(jsonparser.getValueAsInt());
        } else
        if (_inputType == java/lang/Long)
        {
            jsonparser = Long.valueOf(jsonparser.getValueAsLong());
        } else
        {
            throw deserializationcontext.mappingException(_enumClass);
        }
        try
        {
            jsonparser = ((JsonParser) (_factory.invoke(_enumClass, new Object[] {
                jsonparser
            })));
        }
        // Misplaced declaration of an exception variable
        catch (JsonParser jsonparser)
        {
            ClassUtil.unwrapAndThrowAsIAE(jsonparser);
            return null;
        }
        return jsonparser;
    }

    public (Class class1, AnnotatedMethod annotatedmethod, Class class2)
    {
        super(java/lang/Enum);
        _enumClass = class1;
        _factory = annotatedmethod.getAnnotated();
        _inputType = class2;
    }
}
