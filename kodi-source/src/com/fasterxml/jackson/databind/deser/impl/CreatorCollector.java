// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fasterxml.jackson.databind.deser.impl;

import com.fasterxml.jackson.databind.BeanDescription;
import com.fasterxml.jackson.databind.DeserializationConfig;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.deser.CreatorProperty;
import com.fasterxml.jackson.databind.deser.ValueInstantiator;
import com.fasterxml.jackson.databind.deser.std.StdValueInstantiator;
import com.fasterxml.jackson.databind.introspect.AnnotatedMember;
import com.fasterxml.jackson.databind.introspect.AnnotatedParameter;
import com.fasterxml.jackson.databind.introspect.AnnotatedWithParams;
import com.fasterxml.jackson.databind.type.TypeBindings;
import com.fasterxml.jackson.databind.util.ClassUtil;
import java.io.IOException;
import java.io.Serializable;
import java.lang.reflect.Member;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public class CreatorCollector
{
    protected static final class Vanilla extends ValueInstantiator
        implements Serializable
    {

        private final int _type;

        public boolean canCreateUsingDefault()
        {
            return true;
        }

        public boolean canInstantiate()
        {
            return true;
        }

        public Object createUsingDefault(DeserializationContext deserializationcontext)
            throws IOException
        {
            switch (_type)
            {
            default:
                throw new IllegalStateException((new StringBuilder()).append("Unknown type ").append(_type).toString());

            case 1: // '\001'
                return new ArrayList();

            case 2: // '\002'
                return new LinkedHashMap();

            case 3: // '\003'
                return new HashMap();
            }
        }

        public String getValueTypeDesc()
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


    protected static final String TYPE_DESCS[] = {
        "default", "String", "int", "long", "double", "boolean", "delegate", "property-based"
    };
    protected final BeanDescription _beanDesc;
    protected final boolean _canFixAccess;
    protected final AnnotatedWithParams _creators[] = new AnnotatedWithParams[8];
    protected CreatorProperty _delegateArgs[];
    protected int _explicitCreators;
    protected boolean _hasNonDefaultCreator;
    protected AnnotatedParameter _incompleteParameter;
    protected CreatorProperty _propertyBasedArgs[];

    public CreatorCollector(BeanDescription beandescription, boolean flag)
    {
        _explicitCreators = 0;
        _hasNonDefaultCreator = false;
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

    public void addBooleanCreator(AnnotatedWithParams annotatedwithparams, boolean flag)
    {
        verifyNonDup(annotatedwithparams, 5, flag);
    }

    public void addDelegatingCreator(AnnotatedWithParams annotatedwithparams, boolean flag, CreatorProperty acreatorproperty[])
    {
        verifyNonDup(annotatedwithparams, 6, flag);
        _delegateArgs = acreatorproperty;
    }

    public void addDoubleCreator(AnnotatedWithParams annotatedwithparams, boolean flag)
    {
        verifyNonDup(annotatedwithparams, 4, flag);
    }

    public void addIntCreator(AnnotatedWithParams annotatedwithparams, boolean flag)
    {
        verifyNonDup(annotatedwithparams, 2, flag);
    }

    public void addLongCreator(AnnotatedWithParams annotatedwithparams, boolean flag)
    {
        verifyNonDup(annotatedwithparams, 3, flag);
    }

    public void addPropertyCreator(AnnotatedWithParams annotatedwithparams, boolean flag, CreatorProperty acreatorproperty[])
    {
        int i;
        int j;
        verifyNonDup(annotatedwithparams, 7, flag);
        if (acreatorproperty.length <= 1)
        {
            break MISSING_BLOCK_LABEL_146;
        }
        annotatedwithparams = new HashMap();
        i = 0;
        j = acreatorproperty.length;
_L2:
        String s;
        if (i >= j)
        {
            break MISSING_BLOCK_LABEL_146;
        }
        s = acreatorproperty[i].getName();
        if (s.length() != 0 || acreatorproperty[i].getInjectableValueId() == null)
        {
            break; /* Loop/switch isn't completed */
        }
_L4:
        i++;
        Integer integer;
        if (true) goto _L2; else goto _L1
_L1:
        if ((integer = (Integer)annotatedwithparams.put(s, Integer.valueOf(i))) == null) goto _L4; else goto _L3
_L3:
        throw new IllegalArgumentException((new StringBuilder()).append("Duplicate creator property \"").append(s).append("\" (index ").append(integer).append(" vs ").append(i).append(")").toString());
        _propertyBasedArgs = acreatorproperty;
        return;
    }

    public void addStringCreator(AnnotatedWithParams annotatedwithparams, boolean flag)
    {
        verifyNonDup(annotatedwithparams, 1, flag);
    }

    public ValueInstantiator constructValueInstantiator(DeserializationConfig deserializationconfig)
    {
        JavaType javatype;
        JavaType javatype1;
        Class class1;
        boolean flag;
        if (!_hasNonDefaultCreator)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        if (!flag && _creators[6] != null) goto _L2; else goto _L1
_L1:
        javatype = null;
_L5:
        javatype1 = _beanDesc.getType();
        int i;
        int j;
        boolean flag1;
        int k;
        if (!_hasNonDefaultCreator)
        {
            i = 1;
        } else
        {
            i = 0;
        }
        if (!(flag & i))
        {
            break MISSING_BLOCK_LABEL_224;
        }
        class1 = javatype1.getRawClass();
        if (class1 == java/util/Collection || class1 == java/util/List || class1 == java/util/ArrayList)
        {
            return new Vanilla(1);
        }
        break MISSING_BLOCK_LABEL_185;
_L2:
        flag1 = false;
        j = ((flag1) ? 1 : 0);
        if (_delegateArgs == null) goto _L4; else goto _L3
_L3:
        i = 0;
        k = _delegateArgs.length;
_L6:
        j = ((flag1) ? 1 : 0);
        if (i < k)
        {
            if (_delegateArgs[i] != null)
            {
                break MISSING_BLOCK_LABEL_170;
            }
            j = i;
        }
_L4:
        javatype = _beanDesc.bindingsForBeanType().resolveType(_creators[6].getGenericParameterType(j));
          goto _L5
        i++;
          goto _L6
        if (class1 == java/util/Map || class1 == java/util/LinkedHashMap)
        {
            return new Vanilla(2);
        }
        if (class1 == java/util/HashMap)
        {
            return new Vanilla(3);
        }
        deserializationconfig = new StdValueInstantiator(deserializationconfig, javatype1);
        deserializationconfig.configureFromObjectSettings(_creators[0], _creators[6], javatype, _delegateArgs, _creators[7], _propertyBasedArgs);
        deserializationconfig.configureFromStringCreator(_creators[1]);
        deserializationconfig.configureFromIntCreator(_creators[2]);
        deserializationconfig.configureFromLongCreator(_creators[3]);
        deserializationconfig.configureFromDoubleCreator(_creators[4]);
        deserializationconfig.configureFromBooleanCreator(_creators[5]);
        deserializationconfig.configureIncompleteParameter(_incompleteParameter);
        return deserializationconfig;
    }

    public boolean hasDefaultCreator()
    {
        boolean flag = false;
        if (_creators[0] != null)
        {
            flag = true;
        }
        return flag;
    }

    public void setDefaultCreator(AnnotatedWithParams annotatedwithparams)
    {
        _creators[0] = (AnnotatedWithParams)_fixAccess(annotatedwithparams);
    }

    protected void verifyNonDup(AnnotatedWithParams annotatedwithparams, int i, boolean flag)
    {
        AnnotatedWithParams annotatedwithparams1;
        boolean flag1;
        int j;
        flag1 = true;
        j = 1 << i;
        _hasNonDefaultCreator = true;
        annotatedwithparams1 = _creators[i];
        if (annotatedwithparams1 == null) goto _L2; else goto _L1
_L1:
        if ((_explicitCreators & j) == 0) goto _L4; else goto _L3
_L3:
        if (flag) goto _L6; else goto _L5
_L5:
        return;
_L6:
        flag1 = true;
_L8:
        Class class1;
        Class class2;
        if (!flag1 || annotatedwithparams1.getClass() != annotatedwithparams.getClass())
        {
            break; /* Loop/switch isn't completed */
        }
        class1 = annotatedwithparams1.getRawParameterType(0);
        class2 = annotatedwithparams.getRawParameterType(0);
        if (class1 == class2)
        {
            throw new IllegalArgumentException((new StringBuilder()).append("Conflicting ").append(TYPE_DESCS[i]).append(" creators: already had explicitly marked ").append(annotatedwithparams1).append(", encountered ").append(annotatedwithparams).toString());
        }
        continue; /* Loop/switch isn't completed */
_L4:
        if (flag)
        {
            flag1 = false;
        }
        if (true) goto _L8; else goto _L7
_L7:
        if (class2.isAssignableFrom(class1)) goto _L5; else goto _L2
_L2:
        if (flag)
        {
            _explicitCreators = _explicitCreators | j;
        }
        _creators[i] = (AnnotatedWithParams)_fixAccess(annotatedwithparams);
        return;
    }

}
