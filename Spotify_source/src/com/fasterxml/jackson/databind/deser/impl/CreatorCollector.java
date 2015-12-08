// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fasterxml.jackson.databind.deser.impl;

import com.fasterxml.jackson.databind.BeanDescription;
import com.fasterxml.jackson.databind.DeserializationConfig;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.deser.CreatorProperty;
import com.fasterxml.jackson.databind.deser.ValueInstantiator;
import com.fasterxml.jackson.databind.deser.std.StdValueInstantiator;
import com.fasterxml.jackson.databind.introspect.AnnotatedMember;
import com.fasterxml.jackson.databind.introspect.AnnotatedParameter;
import com.fasterxml.jackson.databind.introspect.AnnotatedWithParams;
import com.fasterxml.jackson.databind.type.TypeBindings;
import com.fasterxml.jackson.databind.util.ClassUtil;
import java.lang.reflect.Member;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public class CreatorCollector
{

    protected final BeanDescription _beanDesc;
    protected AnnotatedWithParams _booleanCreator;
    protected final boolean _canFixAccess;
    protected AnnotatedWithParams _defaultConstructor;
    protected CreatorProperty _delegateArgs[];
    protected AnnotatedWithParams _delegateCreator;
    protected AnnotatedWithParams _doubleCreator;
    protected AnnotatedParameter _incompleteParameter;
    protected AnnotatedWithParams _intCreator;
    protected AnnotatedWithParams _longCreator;
    protected CreatorProperty _propertyBasedArgs[];
    protected AnnotatedWithParams _propertyBasedCreator;
    protected AnnotatedWithParams _stringCreator;

    public CreatorCollector(BeanDescription beandescription, boolean flag)
    {
        _propertyBasedArgs = null;
        _beanDesc = beandescription;
        _canFixAccess = flag;
    }

    private AnnotatedMember _fixAccess(AnnotatedMember annotatedmember)
    {
        if (annotatedmember != null && _canFixAccess)
        {
            ClassUtil.checkAndFixAccess((Member)annotatedmember.getAnnotated());
        }
        return annotatedmember;
    }

    public void addBooleanCreator(AnnotatedWithParams annotatedwithparams)
    {
        _booleanCreator = verifyNonDup(annotatedwithparams, _booleanCreator, "boolean");
    }

    public void addDelegatingCreator(AnnotatedWithParams annotatedwithparams, CreatorProperty acreatorproperty[])
    {
        _delegateCreator = verifyNonDup(annotatedwithparams, _delegateCreator, "delegate");
        _delegateArgs = acreatorproperty;
    }

    public void addDoubleCreator(AnnotatedWithParams annotatedwithparams)
    {
        _doubleCreator = verifyNonDup(annotatedwithparams, _doubleCreator, "double");
    }

    public void addIncompeteParameter(AnnotatedParameter annotatedparameter)
    {
        if (_incompleteParameter == null)
        {
            _incompleteParameter = annotatedparameter;
        }
    }

    public void addIntCreator(AnnotatedWithParams annotatedwithparams)
    {
        _intCreator = verifyNonDup(annotatedwithparams, _intCreator, "int");
    }

    public void addLongCreator(AnnotatedWithParams annotatedwithparams)
    {
        _longCreator = verifyNonDup(annotatedwithparams, _longCreator, "long");
    }

    public void addPropertyCreator(AnnotatedWithParams annotatedwithparams, CreatorProperty acreatorproperty[])
    {
        _propertyBasedCreator = verifyNonDup(annotatedwithparams, _propertyBasedCreator, "property-based");
        if (acreatorproperty.length > 1)
        {
            annotatedwithparams = new HashMap();
            int j = acreatorproperty.length;
            for (int i = 0; i < j; i++)
            {
                String s = acreatorproperty[i].getName();
                if (s.length() == 0 && acreatorproperty[i].getInjectableValueId() != null)
                {
                    continue;
                }
                Integer integer = (Integer)annotatedwithparams.put(s, Integer.valueOf(i));
                if (integer != null)
                {
                    throw new IllegalArgumentException((new StringBuilder("Duplicate creator property \"")).append(s).append("\" (index ").append(integer).append(" vs ").append(i).append(")").toString());
                }
            }

        }
        _propertyBasedArgs = acreatorproperty;
    }

    public void addStringCreator(AnnotatedWithParams annotatedwithparams)
    {
        _stringCreator = verifyNonDup(annotatedwithparams, _stringCreator, "String");
    }

    public ValueInstantiator constructValueInstantiator(DeserializationConfig deserializationconfig)
    {
        JavaType javatype;
        int i;
        boolean flag1 = false;
        boolean flag;
        if (_delegateCreator == null)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        if (flag)
        {
            javatype = null;
            break MISSING_BLOCK_LABEL_20;
        }
        if (_delegateArgs == null)
        {
            break MISSING_BLOCK_LABEL_337;
        }
        j = _delegateArgs.length;
        i = 0;
_L4:
        if (i >= j)
        {
            break MISSING_BLOCK_LABEL_337;
        }
        if (_delegateArgs[i] != null) goto _L2; else goto _L1
_L1:
        javatype = _beanDesc.bindingsForBeanType().resolveType(_delegateCreator.getGenericParameterType(i));
          goto _L3
_L2:
        i++;
          goto _L4
_L3:
        JavaType javatype1 = _beanDesc.getType();
        i = ((flag1) ? 1 : 0);
        if (_propertyBasedCreator == null)
        {
            i = ((flag1) ? 1 : 0);
            if (_delegateCreator == null)
            {
                i = ((flag1) ? 1 : 0);
                if (_stringCreator == null)
                {
                    i = ((flag1) ? 1 : 0);
                    if (_longCreator == null)
                    {
                        i = ((flag1) ? 1 : 0);
                        if (_doubleCreator == null)
                        {
                            i = ((flag1) ? 1 : 0);
                            if (_booleanCreator == null)
                            {
                                i = 1;
                            }
                        }
                    }
                }
            }
        }
        if (flag & i)
        {
            Class class1 = javatype1.getRawClass();
            int j;
            if (class1 == java/util/Collection || class1 == java/util/List || class1 == java/util/ArrayList)
            {
                return new Vanilla(1);
            }
            if (class1 == java/util/Map || class1 == java/util/LinkedHashMap)
            {
                return new Vanilla(2);
            }
            if (class1 == java/util/HashMap)
            {
                return new Vanilla(3);
            }
        }
        deserializationconfig = new StdValueInstantiator(deserializationconfig, javatype1);
        deserializationconfig.configureFromObjectSettings(_defaultConstructor, _delegateCreator, javatype, _delegateArgs, _propertyBasedCreator, _propertyBasedArgs);
        deserializationconfig.configureFromStringCreator(_stringCreator);
        deserializationconfig.configureFromIntCreator(_intCreator);
        deserializationconfig.configureFromLongCreator(_longCreator);
        deserializationconfig.configureFromDoubleCreator(_doubleCreator);
        deserializationconfig.configureFromBooleanCreator(_booleanCreator);
        deserializationconfig.configureIncompleteParameter(_incompleteParameter);
        return deserializationconfig;
        i = 0;
          goto _L1
    }

    public boolean hasDefaultCreator()
    {
        return _defaultConstructor != null;
    }

    public void setDefaultCreator(AnnotatedWithParams annotatedwithparams)
    {
        _defaultConstructor = (AnnotatedWithParams)_fixAccess(annotatedwithparams);
    }

    protected AnnotatedWithParams verifyNonDup(AnnotatedWithParams annotatedwithparams, AnnotatedWithParams annotatedwithparams1, String s)
    {
        if (annotatedwithparams1 != null && annotatedwithparams1.getClass() == annotatedwithparams.getClass())
        {
            throw new IllegalArgumentException((new StringBuilder("Conflicting ")).append(s).append(" creators: already had ").append(annotatedwithparams1).append(", encountered ").append(annotatedwithparams).toString());
        } else
        {
            return (AnnotatedWithParams)_fixAccess(annotatedwithparams);
        }
    }

    private class Vanilla extends ValueInstantiator
        implements Serializable
    {

        private static final long serialVersionUID = 1L;
        private final int _type;

        public final boolean canCreateUsingDefault()
        {
            return true;
        }

        public final boolean canInstantiate()
        {
            return true;
        }

        public final Object createUsingDefault(DeserializationContext deserializationcontext)
        {
            switch (_type)
            {
            default:
                throw new IllegalStateException((new StringBuilder("Unknown type ")).append(_type).toString());

            case 1: // '\001'
                return new ArrayList();

            case 2: // '\002'
                return new LinkedHashMap();

            case 3: // '\003'
                return new HashMap();
            }
        }

        public final String getValueTypeDesc()
        {
            switch (_type)
            {
            default:
                return java/lang/Object.getName();

            case 1: // '\001'
                return java/util/ArrayList.getName();

            case 2: // '\002'
                return java/util/LinkedHashMap.getName();

            case 3: // '\003'
                return java/util/HashMap.getName();
            }
        }

        public Vanilla(int i)
        {
            _type = i;
        }
    }

}
