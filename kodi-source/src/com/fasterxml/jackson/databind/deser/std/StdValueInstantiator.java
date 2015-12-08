// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fasterxml.jackson.databind.deser.std;

import com.fasterxml.jackson.databind.DeserializationConfig;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.deser.CreatorProperty;
import com.fasterxml.jackson.databind.deser.SettableBeanProperty;
import com.fasterxml.jackson.databind.deser.ValueInstantiator;
import com.fasterxml.jackson.databind.introspect.AnnotatedParameter;
import com.fasterxml.jackson.databind.introspect.AnnotatedWithParams;
import java.io.IOException;
import java.io.Serializable;

public class StdValueInstantiator extends ValueInstantiator
    implements Serializable
{

    protected CreatorProperty _constructorArguments[];
    protected AnnotatedWithParams _defaultCreator;
    protected CreatorProperty _delegateArguments[];
    protected AnnotatedWithParams _delegateCreator;
    protected JavaType _delegateType;
    protected AnnotatedWithParams _fromBooleanCreator;
    protected AnnotatedWithParams _fromDoubleCreator;
    protected AnnotatedWithParams _fromIntCreator;
    protected AnnotatedWithParams _fromLongCreator;
    protected AnnotatedWithParams _fromStringCreator;
    protected AnnotatedParameter _incompleteParameter;
    protected final String _valueTypeDesc;
    protected AnnotatedWithParams _withArgsCreator;

    public StdValueInstantiator(DeserializationConfig deserializationconfig, JavaType javatype)
    {
        if (javatype == null)
        {
            deserializationconfig = "UNKNOWN TYPE";
        } else
        {
            deserializationconfig = javatype.toString();
        }
        _valueTypeDesc = deserializationconfig;
    }

    public boolean canCreateFromBoolean()
    {
        return _fromBooleanCreator != null;
    }

    public boolean canCreateFromDouble()
    {
        return _fromDoubleCreator != null;
    }

    public boolean canCreateFromInt()
    {
        return _fromIntCreator != null;
    }

    public boolean canCreateFromLong()
    {
        return _fromLongCreator != null;
    }

    public boolean canCreateFromObjectWith()
    {
        return _withArgsCreator != null;
    }

    public boolean canCreateFromString()
    {
        return _fromStringCreator != null;
    }

    public boolean canCreateUsingDefault()
    {
        return _defaultCreator != null;
    }

    public boolean canCreateUsingDelegate()
    {
        return _delegateType != null;
    }

    public void configureFromBooleanCreator(AnnotatedWithParams annotatedwithparams)
    {
        _fromBooleanCreator = annotatedwithparams;
    }

    public void configureFromDoubleCreator(AnnotatedWithParams annotatedwithparams)
    {
        _fromDoubleCreator = annotatedwithparams;
    }

    public void configureFromIntCreator(AnnotatedWithParams annotatedwithparams)
    {
        _fromIntCreator = annotatedwithparams;
    }

    public void configureFromLongCreator(AnnotatedWithParams annotatedwithparams)
    {
        _fromLongCreator = annotatedwithparams;
    }

    public void configureFromObjectSettings(AnnotatedWithParams annotatedwithparams, AnnotatedWithParams annotatedwithparams1, JavaType javatype, CreatorProperty acreatorproperty[], AnnotatedWithParams annotatedwithparams2, CreatorProperty acreatorproperty1[])
    {
        _defaultCreator = annotatedwithparams;
        _delegateCreator = annotatedwithparams1;
        _delegateType = javatype;
        _delegateArguments = acreatorproperty;
        _withArgsCreator = annotatedwithparams2;
        _constructorArguments = acreatorproperty1;
    }

    public void configureFromStringCreator(AnnotatedWithParams annotatedwithparams)
    {
        _fromStringCreator = annotatedwithparams;
    }

    public void configureIncompleteParameter(AnnotatedParameter annotatedparameter)
    {
        _incompleteParameter = annotatedparameter;
    }

    public Object createFromBoolean(DeserializationContext deserializationcontext, boolean flag)
        throws IOException
    {
label0:
        {
            try
            {
                if (_fromBooleanCreator == null)
                {
                    break label0;
                }
                deserializationcontext = ((DeserializationContext) (_fromBooleanCreator.call1(Boolean.valueOf(flag))));
            }
            // Misplaced declaration of an exception variable
            catch (DeserializationContext deserializationcontext)
            {
                throw wrapException(deserializationcontext);
            }
            // Misplaced declaration of an exception variable
            catch (DeserializationContext deserializationcontext)
            {
                throw wrapException(deserializationcontext);
            }
            return deserializationcontext;
        }
        throw deserializationcontext.mappingException((new StringBuilder()).append("Can not instantiate value of type ").append(getValueTypeDesc()).append(" from Boolean value (").append(flag).append("); no single-boolean/Boolean-arg constructor/factory method").toString());
    }

    public Object createFromDouble(DeserializationContext deserializationcontext, double d)
        throws IOException
    {
label0:
        {
            try
            {
                if (_fromDoubleCreator == null)
                {
                    break label0;
                }
                deserializationcontext = ((DeserializationContext) (_fromDoubleCreator.call1(Double.valueOf(d))));
            }
            // Misplaced declaration of an exception variable
            catch (DeserializationContext deserializationcontext)
            {
                throw wrapException(deserializationcontext);
            }
            // Misplaced declaration of an exception variable
            catch (DeserializationContext deserializationcontext)
            {
                throw wrapException(deserializationcontext);
            }
            return deserializationcontext;
        }
        throw deserializationcontext.mappingException((new StringBuilder()).append("Can not instantiate value of type ").append(getValueTypeDesc()).append(" from Floating-point number (").append(d).append("); no one-double/Double-arg constructor/factory method").toString());
    }

    public Object createFromInt(DeserializationContext deserializationcontext, int i)
        throws IOException
    {
label0:
        {
            try
            {
                if (_fromIntCreator != null)
                {
                    return _fromIntCreator.call1(Integer.valueOf(i));
                }
                if (_fromLongCreator == null)
                {
                    break label0;
                }
                deserializationcontext = ((DeserializationContext) (_fromLongCreator.call1(Long.valueOf(i))));
            }
            // Misplaced declaration of an exception variable
            catch (DeserializationContext deserializationcontext)
            {
                throw wrapException(deserializationcontext);
            }
            // Misplaced declaration of an exception variable
            catch (DeserializationContext deserializationcontext)
            {
                throw wrapException(deserializationcontext);
            }
            return deserializationcontext;
        }
        throw deserializationcontext.mappingException((new StringBuilder()).append("Can not instantiate value of type ").append(getValueTypeDesc()).append(" from Integral number (").append(i).append("); no single-int-arg constructor/factory method").toString());
    }

    public Object createFromLong(DeserializationContext deserializationcontext, long l)
        throws IOException
    {
label0:
        {
            try
            {
                if (_fromLongCreator == null)
                {
                    break label0;
                }
                deserializationcontext = ((DeserializationContext) (_fromLongCreator.call1(Long.valueOf(l))));
            }
            // Misplaced declaration of an exception variable
            catch (DeserializationContext deserializationcontext)
            {
                throw wrapException(deserializationcontext);
            }
            // Misplaced declaration of an exception variable
            catch (DeserializationContext deserializationcontext)
            {
                throw wrapException(deserializationcontext);
            }
            return deserializationcontext;
        }
        throw deserializationcontext.mappingException((new StringBuilder()).append("Can not instantiate value of type ").append(getValueTypeDesc()).append(" from Long integral number (").append(l).append("); no single-long-arg constructor/factory method").toString());
    }

    public Object createFromObjectWith(DeserializationContext deserializationcontext, Object aobj[])
        throws IOException
    {
        if (_withArgsCreator == null)
        {
            throw new IllegalStateException((new StringBuilder()).append("No with-args constructor for ").append(getValueTypeDesc()).toString());
        }
        try
        {
            deserializationcontext = ((DeserializationContext) (_withArgsCreator.call(aobj)));
        }
        // Misplaced declaration of an exception variable
        catch (DeserializationContext deserializationcontext)
        {
            throw wrapException(deserializationcontext);
        }
        // Misplaced declaration of an exception variable
        catch (DeserializationContext deserializationcontext)
        {
            throw wrapException(deserializationcontext);
        }
        return deserializationcontext;
    }

    public Object createFromString(DeserializationContext deserializationcontext, String s)
        throws IOException
    {
        if (_fromStringCreator != null)
        {
            try
            {
                deserializationcontext = ((DeserializationContext) (_fromStringCreator.call1(s)));
            }
            // Misplaced declaration of an exception variable
            catch (DeserializationContext deserializationcontext)
            {
                throw wrapException(deserializationcontext);
            }
            // Misplaced declaration of an exception variable
            catch (DeserializationContext deserializationcontext)
            {
                throw wrapException(deserializationcontext);
            }
            return deserializationcontext;
        } else
        {
            return _createFromStringFallbacks(deserializationcontext, s);
        }
    }

    public Object createUsingDefault(DeserializationContext deserializationcontext)
        throws IOException
    {
        if (_defaultCreator == null)
        {
            throw new IllegalStateException((new StringBuilder()).append("No default constructor for ").append(getValueTypeDesc()).toString());
        }
        try
        {
            deserializationcontext = ((DeserializationContext) (_defaultCreator.call()));
        }
        // Misplaced declaration of an exception variable
        catch (DeserializationContext deserializationcontext)
        {
            throw wrapException(deserializationcontext);
        }
        // Misplaced declaration of an exception variable
        catch (DeserializationContext deserializationcontext)
        {
            throw wrapException(deserializationcontext);
        }
        return deserializationcontext;
    }

    public Object createUsingDelegate(DeserializationContext deserializationcontext, Object obj)
        throws IOException
    {
        int i;
        if (_delegateCreator == null)
        {
            throw new IllegalStateException((new StringBuilder()).append("No delegate constructor for ").append(getValueTypeDesc()).toString());
        }
        Object aobj[];
        CreatorProperty creatorproperty;
        int j;
        try
        {
            if (_delegateArguments == null)
            {
                return _delegateCreator.call1(obj);
            }
            j = _delegateArguments.length;
            aobj = new Object[j];
        }
        // Misplaced declaration of an exception variable
        catch (DeserializationContext deserializationcontext)
        {
            throw wrapException(deserializationcontext);
        }
        // Misplaced declaration of an exception variable
        catch (DeserializationContext deserializationcontext)
        {
            throw wrapException(deserializationcontext);
        }
        i = 0;
_L2:
        if (i >= j)
        {
            break MISSING_BLOCK_LABEL_124;
        }
        creatorproperty = _delegateArguments[i];
        if (creatorproperty == null)
        {
            aobj[i] = obj;
            break MISSING_BLOCK_LABEL_142;
        }
        aobj[i] = deserializationcontext.findInjectableValue(creatorproperty.getInjectableValueId(), creatorproperty, null);
        break MISSING_BLOCK_LABEL_142;
        deserializationcontext = ((DeserializationContext) (_delegateCreator.call(aobj)));
        return deserializationcontext;
        i++;
        if (true) goto _L2; else goto _L1
_L1:
    }

    public AnnotatedWithParams getDefaultCreator()
    {
        return _defaultCreator;
    }

    public AnnotatedWithParams getDelegateCreator()
    {
        return _delegateCreator;
    }

    public JavaType getDelegateType(DeserializationConfig deserializationconfig)
    {
        return _delegateType;
    }

    public SettableBeanProperty[] getFromObjectArguments(DeserializationConfig deserializationconfig)
    {
        return _constructorArguments;
    }

    public AnnotatedParameter getIncompleteParameter()
    {
        return _incompleteParameter;
    }

    public String getValueTypeDesc()
    {
        return _valueTypeDesc;
    }

    protected JsonMappingException wrapException(Throwable throwable)
    {
        for (; throwable.getCause() != null; throwable = throwable.getCause()) { }
        if (throwable instanceof JsonMappingException)
        {
            return (JsonMappingException)throwable;
        } else
        {
            return new JsonMappingException((new StringBuilder()).append("Instantiation of ").append(getValueTypeDesc()).append(" value failed: ").append(throwable.getMessage()).toString(), throwable);
        }
    }
}
