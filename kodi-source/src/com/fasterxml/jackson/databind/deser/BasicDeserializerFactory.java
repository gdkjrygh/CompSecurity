// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fasterxml.jackson.databind.deser;

import com.fasterxml.jackson.core.JsonLocation;
import com.fasterxml.jackson.databind.AbstractTypeResolver;
import com.fasterxml.jackson.databind.AnnotationIntrospector;
import com.fasterxml.jackson.databind.BeanDescription;
import com.fasterxml.jackson.databind.DeserializationConfig;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.JsonDeserializer;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.KeyDeserializer;
import com.fasterxml.jackson.databind.PropertyMetadata;
import com.fasterxml.jackson.databind.PropertyName;
import com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig;
import com.fasterxml.jackson.databind.cfg.HandlerInstantiator;
import com.fasterxml.jackson.databind.deser.impl.CreatorCollector;
import com.fasterxml.jackson.databind.deser.std.ArrayBlockingQueueDeserializer;
import com.fasterxml.jackson.databind.deser.std.AtomicReferenceDeserializer;
import com.fasterxml.jackson.databind.deser.std.CollectionDeserializer;
import com.fasterxml.jackson.databind.deser.std.DateDeserializers;
import com.fasterxml.jackson.databind.deser.std.EnumDeserializer;
import com.fasterxml.jackson.databind.deser.std.EnumMapDeserializer;
import com.fasterxml.jackson.databind.deser.std.EnumSetDeserializer;
import com.fasterxml.jackson.databind.deser.std.JdkDeserializers;
import com.fasterxml.jackson.databind.deser.std.JsonLocationInstantiator;
import com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer;
import com.fasterxml.jackson.databind.deser.std.MapDeserializer;
import com.fasterxml.jackson.databind.deser.std.MapEntryDeserializer;
import com.fasterxml.jackson.databind.deser.std.NumberDeserializers;
import com.fasterxml.jackson.databind.deser.std.ObjectArrayDeserializer;
import com.fasterxml.jackson.databind.deser.std.PrimitiveArrayDeserializers;
import com.fasterxml.jackson.databind.deser.std.StdKeyDeserializers;
import com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer;
import com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer;
import com.fasterxml.jackson.databind.deser.std.StringDeserializer;
import com.fasterxml.jackson.databind.deser.std.TokenBufferDeserializer;
import com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer;
import com.fasterxml.jackson.databind.ext.OptionalHandlerFactory;
import com.fasterxml.jackson.databind.introspect.Annotated;
import com.fasterxml.jackson.databind.introspect.AnnotatedConstructor;
import com.fasterxml.jackson.databind.introspect.AnnotatedMember;
import com.fasterxml.jackson.databind.introspect.AnnotatedMethod;
import com.fasterxml.jackson.databind.introspect.AnnotatedParameter;
import com.fasterxml.jackson.databind.introspect.AnnotatedWithParams;
import com.fasterxml.jackson.databind.introspect.BeanPropertyDefinition;
import com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder;
import com.fasterxml.jackson.databind.introspect.VisibilityChecker;
import com.fasterxml.jackson.databind.jsontype.SubtypeResolver;
import com.fasterxml.jackson.databind.jsontype.TypeDeserializer;
import com.fasterxml.jackson.databind.jsontype.TypeResolverBuilder;
import com.fasterxml.jackson.databind.type.ArrayType;
import com.fasterxml.jackson.databind.type.CollectionLikeType;
import com.fasterxml.jackson.databind.type.CollectionType;
import com.fasterxml.jackson.databind.type.MapLikeType;
import com.fasterxml.jackson.databind.type.MapType;
import com.fasterxml.jackson.databind.type.TypeFactory;
import com.fasterxml.jackson.databind.util.ClassUtil;
import com.fasterxml.jackson.databind.util.EnumResolver;
import com.fasterxml.jackson.databind.util.TokenBuffer;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.EnumMap;
import java.util.EnumSet;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.NavigableMap;
import java.util.Queue;
import java.util.Set;
import java.util.SortedMap;
import java.util.SortedSet;
import java.util.TreeMap;
import java.util.TreeSet;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
import java.util.concurrent.ConcurrentNavigableMap;
import java.util.concurrent.ConcurrentSkipListMap;
import java.util.concurrent.atomic.AtomicReference;

// Referenced classes of package com.fasterxml.jackson.databind.deser:
//            DeserializerFactory, CreatorProperty, Deserializers, ValueInstantiator, 
//            BeanDeserializerModifier, AbstractDeserializer, KeyDeserializers, ValueInstantiators

public abstract class BasicDeserializerFactory extends DeserializerFactory
    implements Serializable
{

    private static final Class CLASS_CHAR_BUFFER = java/lang/CharSequence;
    private static final Class CLASS_ITERABLE = java/lang/Iterable;
    private static final Class CLASS_MAP_ENTRY = java/util/Map$Entry;
    private static final Class CLASS_OBJECT = java/lang/Object;
    private static final Class CLASS_STRING = java/lang/String;
    protected static final PropertyName UNWRAPPED_CREATOR_PARAM_NAME = new PropertyName("@JsonUnwrapped");
    static final HashMap _collectionFallbacks;
    static final HashMap _mapFallbacks;
    protected final DeserializerFactoryConfig _factoryConfig;

    protected BasicDeserializerFactory(DeserializerFactoryConfig deserializerfactoryconfig)
    {
        _factoryConfig = deserializerfactoryconfig;
    }

    private KeyDeserializer _createEnumKeyDeserializer(DeserializationContext deserializationcontext, JavaType javatype)
        throws JsonMappingException
    {
        DeserializationConfig deserializationconfig = deserializationcontext.getConfig();
        Object obj = deserializationconfig.introspect(javatype);
        deserializationcontext = findDeserializerFromAnnotation(deserializationcontext, ((BeanDescription) (obj)).getClassInfo());
        if (deserializationcontext != null)
        {
            return StdKeyDeserializers.constructDelegatingKeyDeserializer(deserializationconfig, javatype, deserializationcontext);
        }
        deserializationcontext = javatype.getRawClass();
        JsonDeserializer jsondeserializer = _findCustomEnumDeserializer(deserializationcontext, deserializationconfig, ((BeanDescription) (obj)));
        if (jsondeserializer != null)
        {
            return StdKeyDeserializers.constructDelegatingKeyDeserializer(deserializationconfig, javatype, jsondeserializer);
        }
        javatype = constructEnumResolver(deserializationcontext, deserializationconfig, ((BeanDescription) (obj)).findJsonValueMethod());
        for (obj = ((BeanDescription) (obj)).getFactoryMethods().iterator(); ((Iterator) (obj)).hasNext();)
        {
            AnnotatedMethod annotatedmethod = (AnnotatedMethod)((Iterator) (obj)).next();
            if (deserializationconfig.getAnnotationIntrospector().hasCreatorAnnotation(annotatedmethod))
            {
                if (annotatedmethod.getParameterCount() == 1 && annotatedmethod.getRawReturnType().isAssignableFrom(deserializationcontext))
                {
                    if (annotatedmethod.getGenericParameterType(0) != java/lang/String)
                    {
                        throw new IllegalArgumentException((new StringBuilder()).append("Parameter #0 type for factory method (").append(annotatedmethod).append(") not suitable, must be java.lang.String").toString());
                    }
                    if (deserializationconfig.canOverrideAccessModifiers())
                    {
                        ClassUtil.checkAndFixAccess(annotatedmethod.getMember());
                    }
                    return StdKeyDeserializers.constructEnumKeyDeserializer(javatype, annotatedmethod);
                } else
                {
                    throw new IllegalArgumentException((new StringBuilder()).append("Unsuitable method (").append(annotatedmethod).append(") decorated with @JsonCreator (for Enum type ").append(deserializationcontext.getName()).append(")").toString());
                }
            }
        }

        return StdKeyDeserializers.constructEnumKeyDeserializer(javatype);
    }

    private ValueInstantiator _findStdValueInstantiator(DeserializationConfig deserializationconfig, BeanDescription beandescription)
        throws JsonMappingException
    {
        if (beandescription.getBeanClass() == com/fasterxml/jackson/core/JsonLocation)
        {
            return new JsonLocationInstantiator();
        } else
        {
            return null;
        }
    }

    private JavaType _mapAbstractType2(DeserializationConfig deserializationconfig, JavaType javatype)
        throws JsonMappingException
    {
label0:
        {
            Class class1 = javatype.getRawClass();
            if (!_factoryConfig.hasAbstractTypeResolvers())
            {
                break label0;
            }
            Iterator iterator = _factoryConfig.abstractTypeResolvers().iterator();
            JavaType javatype1;
            do
            {
                if (!iterator.hasNext())
                {
                    break label0;
                }
                javatype1 = ((AbstractTypeResolver)iterator.next()).findTypeMapping(deserializationconfig, javatype);
            } while (javatype1 == null || javatype1.getRawClass() == class1);
            return javatype1;
        }
        return null;
    }

    protected void _addDeserializerConstructors(DeserializationContext deserializationcontext, BeanDescription beandescription, VisibilityChecker visibilitychecker, AnnotationIntrospector annotationintrospector, CreatorCollector creatorcollector, Map map)
        throws JsonMappingException
    {
        AnnotatedConstructor annotatedconstructor = beandescription.findDefaultConstructor();
        if (annotatedconstructor != null && (!creatorcollector.hasDefaultCreator() || annotationintrospector.hasCreatorAnnotation(annotatedconstructor)))
        {
            creatorcollector.setDefaultCreator(annotatedconstructor);
        }
        Iterator iterator = beandescription.getConstructors().iterator();
        do
        {
            if (!iterator.hasNext())
            {
                break;
            }
            AnnotatedConstructor annotatedconstructor1 = (AnnotatedConstructor)iterator.next();
            boolean flag = annotationintrospector.hasCreatorAnnotation(annotatedconstructor1);
            BeanPropertyDefinition abeanpropertydefinition[] = (BeanPropertyDefinition[])map.get(annotatedconstructor1);
            int i2 = annotatedconstructor1.getParameterCount();
            if (i2 == 1)
            {
                Object obj;
                if (abeanpropertydefinition == null)
                {
                    obj = null;
                } else
                {
                    obj = abeanpropertydefinition[0];
                }
                if (_checkIfCreatorPropertyBased(annotationintrospector, annotatedconstructor1, ((BeanPropertyDefinition) (obj))))
                {
                    AnnotatedParameter annotatedparameter;
                    if (obj == null)
                    {
                        obj = null;
                    } else
                    {
                        obj = ((BeanPropertyDefinition) (obj)).getFullName();
                    }
                    annotatedparameter = annotatedconstructor1.getParameter(0);
                    creatorcollector.addPropertyCreator(annotatedconstructor1, flag, new CreatorProperty[] {
                        constructCreatorProperty(deserializationcontext, beandescription, ((PropertyName) (obj)), 0, annotatedparameter, annotationintrospector.findInjectableValueId(annotatedparameter))
                    });
                } else
                {
                    _handleSingleArgumentConstructor(deserializationcontext, beandescription, visibilitychecker, annotationintrospector, creatorcollector, annotatedconstructor1, flag, visibilitychecker.isCreatorVisible(annotatedconstructor1));
                    if (obj != null)
                    {
                        ((POJOPropertyBuilder)obj).removeConstructors();
                    }
                }
                continue;
            }
            Object obj1 = null;
            CreatorProperty acreatorproperty[] = new CreatorProperty[i2];
            int j1 = 0;
            int l = 0;
            int k = 0;
            int i1 = 0;
            while (i1 < i2) 
            {
                AnnotatedParameter annotatedparameter1 = annotatedconstructor1.getParameter(i1);
                Object obj2;
                PropertyName propertyname;
                Object obj3;
                int i;
                int k1;
                int l1;
                if (abeanpropertydefinition == null)
                {
                    obj2 = null;
                } else
                {
                    obj2 = abeanpropertydefinition[i1];
                }
                obj3 = annotationintrospector.findInjectableValueId(annotatedparameter1);
                if (obj2 == null)
                {
                    propertyname = null;
                } else
                {
                    propertyname = ((BeanPropertyDefinition) (obj2)).getFullName();
                }
                if (obj2 != null && ((BeanPropertyDefinition) (obj2)).isExplicitlyNamed())
                {
                    i = j1 + 1;
                    acreatorproperty[i1] = constructCreatorProperty(deserializationcontext, beandescription, propertyname, i1, annotatedparameter1, obj3);
                    obj2 = obj1;
                    l1 = k;
                    k1 = l;
                } else
                if (obj3 != null)
                {
                    l1 = k + 1;
                    acreatorproperty[i1] = constructCreatorProperty(deserializationcontext, beandescription, propertyname, i1, annotatedparameter1, obj3);
                    i = j1;
                    k1 = l;
                    obj2 = obj1;
                } else
                if (annotationintrospector.findUnwrappingNameTransformer(annotatedparameter1) != null)
                {
                    acreatorproperty[i1] = constructCreatorProperty(deserializationcontext, beandescription, UNWRAPPED_CREATOR_PARAM_NAME, i1, annotatedparameter1, null);
                    i = j1 + 1;
                    k1 = l;
                    l1 = k;
                    obj2 = obj1;
                } else
                if (flag && propertyname != null && !propertyname.isEmpty())
                {
                    k1 = l + 1;
                    acreatorproperty[i1] = constructCreatorProperty(deserializationcontext, beandescription, propertyname, i1, annotatedparameter1, obj3);
                    i = j1;
                    l1 = k;
                    obj2 = obj1;
                } else
                {
                    i = j1;
                    k1 = l;
                    l1 = k;
                    obj2 = obj1;
                    if (obj1 == null)
                    {
                        obj2 = annotatedparameter1;
                        i = j1;
                        k1 = l;
                        l1 = k;
                    }
                }
                i1++;
                j1 = i;
                l = k1;
                k = l1;
                obj1 = obj2;
            }
            if (flag || j1 > 0 || k > 0)
            {
                if (j1 + l + k == i2)
                {
                    creatorcollector.addPropertyCreator(annotatedconstructor1, flag, acreatorproperty);
                } else
                if (j1 == 0 && k + 1 == i2)
                {
                    creatorcollector.addDelegatingCreator(annotatedconstructor1, flag, acreatorproperty);
                } else
                {
                    int j = ((AnnotatedParameter) (obj1)).getIndex();
                    if (j == 0 && ClassUtil.isNonStaticInnerClass(annotatedconstructor1.getDeclaringClass()))
                    {
                        throw new IllegalArgumentException((new StringBuilder()).append("Non-static inner classes like ").append(annotatedconstructor1.getDeclaringClass().getName()).append(" can not use @JsonCreator for constructors").toString());
                    } else
                    {
                        throw new IllegalArgumentException((new StringBuilder()).append("Argument #").append(j).append(" of constructor ").append(annotatedconstructor1).append(" has no property name annotation; must have name when multiple-parameter constructor annotated as Creator").toString());
                    }
                }
            }
        } while (true);
    }

    protected void _addDeserializerFactoryMethods(DeserializationContext deserializationcontext, BeanDescription beandescription, VisibilityChecker visibilitychecker, AnnotationIntrospector annotationintrospector, CreatorCollector creatorcollector, Map map)
        throws JsonMappingException
    {
        DeserializationConfig deserializationconfig = deserializationcontext.getConfig();
        Iterator iterator = beandescription.getFactoryMethods().iterator();
        do
        {
            if (!iterator.hasNext())
            {
                break;
            }
            AnnotatedMethod annotatedmethod = (AnnotatedMethod)iterator.next();
            boolean flag = annotationintrospector.hasCreatorAnnotation(annotatedmethod);
            int l1 = annotatedmethod.getParameterCount();
            if (l1 == 0)
            {
                if (flag)
                {
                    creatorcollector.setDefaultCreator(annotatedmethod);
                }
                continue;
            }
            BeanPropertyDefinition abeanpropertydefinition[] = (BeanPropertyDefinition[])map.get(annotatedmethod);
            if (l1 == 1)
            {
                BeanPropertyDefinition beanpropertydefinition;
                if (abeanpropertydefinition == null)
                {
                    beanpropertydefinition = null;
                } else
                {
                    beanpropertydefinition = abeanpropertydefinition[0];
                }
                if (!_checkIfCreatorPropertyBased(annotationintrospector, annotatedmethod, beanpropertydefinition))
                {
                    _handleSingleArgumentFactory(deserializationconfig, beandescription, visibilitychecker, annotationintrospector, creatorcollector, annotatedmethod, flag);
                    continue;
                }
            } else
            if (!flag)
            {
                continue;
            }
            Object obj = null;
            CreatorProperty acreatorproperty[] = new CreatorProperty[l1];
            int i1 = 0;
            int l = 0;
            int j = 0;
            int k = 0;
            while (k < l1) 
            {
                AnnotatedParameter annotatedparameter = annotatedmethod.getParameter(k);
                Object obj1;
                PropertyName propertyname;
                Object obj2;
                int i;
                int j1;
                int k1;
                if (abeanpropertydefinition == null)
                {
                    obj1 = null;
                } else
                {
                    obj1 = abeanpropertydefinition[k];
                }
                obj2 = annotationintrospector.findInjectableValueId(annotatedparameter);
                if (obj1 == null)
                {
                    propertyname = null;
                } else
                {
                    propertyname = ((BeanPropertyDefinition) (obj1)).getFullName();
                }
                if (obj1 != null && ((BeanPropertyDefinition) (obj1)).isExplicitlyNamed())
                {
                    j1 = l + 1;
                    acreatorproperty[k] = constructCreatorProperty(deserializationcontext, beandescription, propertyname, k, annotatedparameter, obj2);
                    obj1 = obj;
                    k1 = j;
                    i = i1;
                } else
                if (obj2 != null)
                {
                    k1 = j + 1;
                    acreatorproperty[k] = constructCreatorProperty(deserializationcontext, beandescription, propertyname, k, annotatedparameter, obj2);
                    j1 = l;
                    i = i1;
                    obj1 = obj;
                } else
                if (annotationintrospector.findUnwrappingNameTransformer(annotatedparameter) != null)
                {
                    acreatorproperty[k] = constructCreatorProperty(deserializationcontext, beandescription, UNWRAPPED_CREATOR_PARAM_NAME, k, annotatedparameter, null);
                    i = i1 + 1;
                    j1 = l;
                    k1 = j;
                    obj1 = obj;
                } else
                if (flag && propertyname != null && !propertyname.isEmpty())
                {
                    i = i1 + 1;
                    acreatorproperty[k] = constructCreatorProperty(deserializationcontext, beandescription, propertyname, k, annotatedparameter, obj2);
                    j1 = l;
                    k1 = j;
                    obj1 = obj;
                } else
                {
                    j1 = l;
                    i = i1;
                    k1 = j;
                    obj1 = obj;
                    if (obj == null)
                    {
                        obj1 = annotatedparameter;
                        j1 = l;
                        i = i1;
                        k1 = j;
                    }
                }
                k++;
                l = j1;
                i1 = i;
                j = k1;
                obj = obj1;
            }
            if (flag || l > 0 || j > 0)
            {
                if (l + i1 + j == l1)
                {
                    creatorcollector.addPropertyCreator(annotatedmethod, flag, acreatorproperty);
                } else
                if (l == 0 && j + 1 == l1)
                {
                    creatorcollector.addDelegatingCreator(annotatedmethod, flag, acreatorproperty);
                } else
                {
                    throw new IllegalArgumentException((new StringBuilder()).append("Argument #").append(((AnnotatedParameter) (obj)).getIndex()).append(" of factory method ").append(annotatedmethod).append(" has no property name annotation; must have name when multiple-parameter constructor annotated as Creator").toString());
                }
            }
        } while (true);
    }

    protected boolean _checkIfCreatorPropertyBased(AnnotationIntrospector annotationintrospector, AnnotatedWithParams annotatedwithparams, BeanPropertyDefinition beanpropertydefinition)
    {
        com.fasterxml.jackson.annotation.JsonCreator.Mode mode = annotationintrospector.findCreatorBinding(annotatedwithparams);
        if (mode != com.fasterxml.jackson.annotation.JsonCreator.Mode.PROPERTIES) goto _L2; else goto _L1
_L1:
        return true;
_L2:
        if (mode == com.fasterxml.jackson.annotation.JsonCreator.Mode.DELEGATING)
        {
            return false;
        }
        if (beanpropertydefinition != null && beanpropertydefinition.isExplicitlyNamed() || annotationintrospector.findInjectableValueId(annotatedwithparams.getParameter(0)) != null) goto _L1; else goto _L3
_L3:
        if (beanpropertydefinition == null)
        {
            break; /* Loop/switch isn't completed */
        }
        annotationintrospector = beanpropertydefinition.getName();
        if (annotationintrospector != null && !annotationintrospector.isEmpty() && beanpropertydefinition.couldSerialize()) goto _L1; else goto _L4
_L4:
        return false;
    }

    protected ValueInstantiator _constructDefaultValueInstantiator(DeserializationContext deserializationcontext, BeanDescription beandescription)
        throws JsonMappingException
    {
        CreatorCollector creatorcollector = new CreatorCollector(beandescription, deserializationcontext.canOverrideAccessModifiers());
        AnnotationIntrospector annotationintrospector = deserializationcontext.getAnnotationIntrospector();
        DeserializationConfig deserializationconfig = deserializationcontext.getConfig();
        VisibilityChecker visibilitychecker = deserializationconfig.getDefaultVisibilityChecker();
        visibilitychecker = annotationintrospector.findAutoDetectVisibility(beandescription.getClassInfo(), visibilitychecker);
        Map map = _findCreatorsFromProperties(deserializationcontext, beandescription);
        _addDeserializerFactoryMethods(deserializationcontext, beandescription, visibilitychecker, annotationintrospector, creatorcollector, map);
        if (beandescription.getType().isConcrete())
        {
            _addDeserializerConstructors(deserializationcontext, beandescription, visibilitychecker, annotationintrospector, creatorcollector, map);
        }
        return creatorcollector.constructValueInstantiator(deserializationconfig);
    }

    protected Map _findCreatorsFromProperties(DeserializationContext deserializationcontext, BeanDescription beandescription)
        throws JsonMappingException
    {
        Iterator iterator;
        deserializationcontext = Collections.emptyMap();
        iterator = beandescription.findProperties().iterator();
        beandescription = deserializationcontext;
_L2:
        BeanPropertyDefinition beanpropertydefinition;
        Iterator iterator1;
        if (!iterator.hasNext())
        {
            break MISSING_BLOCK_LABEL_223;
        }
        beanpropertydefinition = (BeanPropertyDefinition)iterator.next();
        iterator1 = beanpropertydefinition.getConstructorParameters();
        deserializationcontext = beandescription;
_L5:
        beandescription = deserializationcontext;
        if (!iterator1.hasNext()) goto _L2; else goto _L1
_L1:
        BeanPropertyDefinition abeanpropertydefinition[];
        AnnotatedWithParams annotatedwithparams;
        int i;
        beandescription = (AnnotatedParameter)iterator1.next();
        annotatedwithparams = beandescription.getOwner();
        abeanpropertydefinition = (BeanPropertyDefinition[])deserializationcontext.get(annotatedwithparams);
        i = beandescription.getIndex();
        if (abeanpropertydefinition != null) goto _L4; else goto _L3
_L3:
        beandescription = deserializationcontext;
        if (deserializationcontext.isEmpty())
        {
            beandescription = new LinkedHashMap();
        }
        abeanpropertydefinition = new BeanPropertyDefinition[annotatedwithparams.getParameterCount()];
        beandescription.put(annotatedwithparams, abeanpropertydefinition);
        deserializationcontext = beandescription;
        beandescription = abeanpropertydefinition;
_L7:
        beandescription[i] = beanpropertydefinition;
          goto _L5
_L4:
        beandescription = abeanpropertydefinition;
        if (abeanpropertydefinition[i] == null) goto _L7; else goto _L6
_L6:
        throw new IllegalStateException((new StringBuilder()).append("Conflict: parameter #").append(i).append(" of ").append(annotatedwithparams).append(" bound to more than one property; ").append(abeanpropertydefinition[i]).append(" vs ").append(beanpropertydefinition).toString());
        return beandescription;
    }

    protected JsonDeserializer _findCustomArrayDeserializer(ArrayType arraytype, DeserializationConfig deserializationconfig, BeanDescription beandescription, TypeDeserializer typedeserializer, JsonDeserializer jsondeserializer)
        throws JsonMappingException
    {
        for (Iterator iterator = _factoryConfig.deserializers().iterator(); iterator.hasNext();)
        {
            JsonDeserializer jsondeserializer1 = ((Deserializers)iterator.next()).findArrayDeserializer(arraytype, deserializationconfig, beandescription, typedeserializer, jsondeserializer);
            if (jsondeserializer1 != null)
            {
                return jsondeserializer1;
            }
        }

        return null;
    }

    protected JsonDeserializer _findCustomBeanDeserializer(JavaType javatype, DeserializationConfig deserializationconfig, BeanDescription beandescription)
        throws JsonMappingException
    {
        for (Iterator iterator = _factoryConfig.deserializers().iterator(); iterator.hasNext();)
        {
            JsonDeserializer jsondeserializer = ((Deserializers)iterator.next()).findBeanDeserializer(javatype, deserializationconfig, beandescription);
            if (jsondeserializer != null)
            {
                return jsondeserializer;
            }
        }

        return null;
    }

    protected JsonDeserializer _findCustomCollectionDeserializer(CollectionType collectiontype, DeserializationConfig deserializationconfig, BeanDescription beandescription, TypeDeserializer typedeserializer, JsonDeserializer jsondeserializer)
        throws JsonMappingException
    {
        for (Iterator iterator = _factoryConfig.deserializers().iterator(); iterator.hasNext();)
        {
            JsonDeserializer jsondeserializer1 = ((Deserializers)iterator.next()).findCollectionDeserializer(collectiontype, deserializationconfig, beandescription, typedeserializer, jsondeserializer);
            if (jsondeserializer1 != null)
            {
                return jsondeserializer1;
            }
        }

        return null;
    }

    protected JsonDeserializer _findCustomCollectionLikeDeserializer(CollectionLikeType collectionliketype, DeserializationConfig deserializationconfig, BeanDescription beandescription, TypeDeserializer typedeserializer, JsonDeserializer jsondeserializer)
        throws JsonMappingException
    {
        for (Iterator iterator = _factoryConfig.deserializers().iterator(); iterator.hasNext();)
        {
            JsonDeserializer jsondeserializer1 = ((Deserializers)iterator.next()).findCollectionLikeDeserializer(collectionliketype, deserializationconfig, beandescription, typedeserializer, jsondeserializer);
            if (jsondeserializer1 != null)
            {
                return jsondeserializer1;
            }
        }

        return null;
    }

    protected JsonDeserializer _findCustomEnumDeserializer(Class class1, DeserializationConfig deserializationconfig, BeanDescription beandescription)
        throws JsonMappingException
    {
        for (Iterator iterator = _factoryConfig.deserializers().iterator(); iterator.hasNext();)
        {
            JsonDeserializer jsondeserializer = ((Deserializers)iterator.next()).findEnumDeserializer(class1, deserializationconfig, beandescription);
            if (jsondeserializer != null)
            {
                return jsondeserializer;
            }
        }

        return null;
    }

    protected JsonDeserializer _findCustomMapDeserializer(MapType maptype, DeserializationConfig deserializationconfig, BeanDescription beandescription, KeyDeserializer keydeserializer, TypeDeserializer typedeserializer, JsonDeserializer jsondeserializer)
        throws JsonMappingException
    {
        for (Iterator iterator = _factoryConfig.deserializers().iterator(); iterator.hasNext();)
        {
            JsonDeserializer jsondeserializer1 = ((Deserializers)iterator.next()).findMapDeserializer(maptype, deserializationconfig, beandescription, keydeserializer, typedeserializer, jsondeserializer);
            if (jsondeserializer1 != null)
            {
                return jsondeserializer1;
            }
        }

        return null;
    }

    protected JsonDeserializer _findCustomMapLikeDeserializer(MapLikeType mapliketype, DeserializationConfig deserializationconfig, BeanDescription beandescription, KeyDeserializer keydeserializer, TypeDeserializer typedeserializer, JsonDeserializer jsondeserializer)
        throws JsonMappingException
    {
        for (Iterator iterator = _factoryConfig.deserializers().iterator(); iterator.hasNext();)
        {
            JsonDeserializer jsondeserializer1 = ((Deserializers)iterator.next()).findMapLikeDeserializer(mapliketype, deserializationconfig, beandescription, keydeserializer, typedeserializer, jsondeserializer);
            if (jsondeserializer1 != null)
            {
                return jsondeserializer1;
            }
        }

        return null;
    }

    protected JsonDeserializer _findCustomTreeNodeDeserializer(Class class1, DeserializationConfig deserializationconfig, BeanDescription beandescription)
        throws JsonMappingException
    {
        for (Iterator iterator = _factoryConfig.deserializers().iterator(); iterator.hasNext();)
        {
            JsonDeserializer jsondeserializer = ((Deserializers)iterator.next()).findTreeNodeDeserializer(class1, deserializationconfig, beandescription);
            if (jsondeserializer != null)
            {
                return jsondeserializer;
            }
        }

        return null;
    }

    protected boolean _handleSingleArgumentConstructor(DeserializationContext deserializationcontext, BeanDescription beandescription, VisibilityChecker visibilitychecker, AnnotationIntrospector annotationintrospector, CreatorCollector creatorcollector, AnnotatedConstructor annotatedconstructor, boolean flag, 
            boolean flag1)
        throws JsonMappingException
    {
        deserializationcontext = annotatedconstructor.getRawParameterType(0);
        if (deserializationcontext != java/lang/String && deserializationcontext != java/lang/CharSequence) goto _L2; else goto _L1
_L1:
        if (flag || flag1)
        {
            creatorcollector.addStringCreator(annotatedconstructor, flag);
        }
_L4:
        return true;
_L2:
        if (deserializationcontext != Integer.TYPE && deserializationcontext != java/lang/Integer)
        {
            break; /* Loop/switch isn't completed */
        }
        if (flag || flag1)
        {
            creatorcollector.addIntCreator(annotatedconstructor, flag);
            return true;
        }
        if (true) goto _L4; else goto _L3
_L3:
        if (deserializationcontext != Long.TYPE && deserializationcontext != java/lang/Long)
        {
            break; /* Loop/switch isn't completed */
        }
        if (flag || flag1)
        {
            creatorcollector.addLongCreator(annotatedconstructor, flag);
            return true;
        }
        if (true) goto _L4; else goto _L5
_L5:
        if (deserializationcontext != Double.TYPE && deserializationcontext != java/lang/Double)
        {
            break; /* Loop/switch isn't completed */
        }
        if (flag || flag1)
        {
            creatorcollector.addDoubleCreator(annotatedconstructor, flag);
            return true;
        }
        if (true) goto _L4; else goto _L6
_L6:
        if (deserializationcontext == Boolean.TYPE || deserializationcontext == java/lang/Boolean)
        {
            if (flag || flag1)
            {
                creatorcollector.addBooleanCreator(annotatedconstructor, flag);
                return true;
            }
        } else
        if (flag)
        {
            creatorcollector.addDelegatingCreator(annotatedconstructor, flag, null);
            return true;
        } else
        {
            return false;
        }
        if (true) goto _L4; else goto _L7
_L7:
    }

    protected boolean _handleSingleArgumentFactory(DeserializationConfig deserializationconfig, BeanDescription beandescription, VisibilityChecker visibilitychecker, AnnotationIntrospector annotationintrospector, CreatorCollector creatorcollector, AnnotatedMethod annotatedmethod, boolean flag)
        throws JsonMappingException
    {
        deserializationconfig = annotatedmethod.getRawParameterType(0);
        if (deserializationconfig != java/lang/String && deserializationconfig != java/lang/CharSequence) goto _L2; else goto _L1
_L1:
        if (flag || visibilitychecker.isCreatorVisible(annotatedmethod))
        {
            creatorcollector.addStringCreator(annotatedmethod, flag);
        }
_L4:
        return true;
_L2:
        if (deserializationconfig != Integer.TYPE && deserializationconfig != java/lang/Integer)
        {
            break; /* Loop/switch isn't completed */
        }
        if (flag || visibilitychecker.isCreatorVisible(annotatedmethod))
        {
            creatorcollector.addIntCreator(annotatedmethod, flag);
            return true;
        }
        if (true) goto _L4; else goto _L3
_L3:
        if (deserializationconfig != Long.TYPE && deserializationconfig != java/lang/Long)
        {
            break; /* Loop/switch isn't completed */
        }
        if (flag || visibilitychecker.isCreatorVisible(annotatedmethod))
        {
            creatorcollector.addLongCreator(annotatedmethod, flag);
            return true;
        }
        if (true) goto _L4; else goto _L5
_L5:
        if (deserializationconfig != Double.TYPE && deserializationconfig != java/lang/Double)
        {
            break; /* Loop/switch isn't completed */
        }
        if (flag || visibilitychecker.isCreatorVisible(annotatedmethod))
        {
            creatorcollector.addDoubleCreator(annotatedmethod, flag);
            return true;
        }
        if (true) goto _L4; else goto _L6
_L6:
        if (deserializationconfig == Boolean.TYPE || deserializationconfig == java/lang/Boolean)
        {
            if (flag || visibilitychecker.isCreatorVisible(annotatedmethod))
            {
                creatorcollector.addBooleanCreator(annotatedmethod, flag);
                return true;
            }
        } else
        if (flag)
        {
            creatorcollector.addDelegatingCreator(annotatedmethod, flag, null);
            return true;
        } else
        {
            return false;
        }
        if (true) goto _L4; else goto _L7
_L7:
    }

    protected CollectionType _mapAbstractCollectionType(JavaType javatype, DeserializationConfig deserializationconfig)
    {
        Class class1 = javatype.getRawClass();
        class1 = (Class)_collectionFallbacks.get(class1.getName());
        if (class1 == null)
        {
            return null;
        } else
        {
            return (CollectionType)deserializationconfig.constructSpecializedType(javatype, class1);
        }
    }

    public ValueInstantiator _valueInstantiatorInstance(DeserializationConfig deserializationconfig, Annotated annotated, Object obj)
        throws JsonMappingException
    {
        if (obj == null)
        {
            return null;
        }
        if (obj instanceof ValueInstantiator)
        {
            return (ValueInstantiator)obj;
        }
        if (!(obj instanceof Class))
        {
            throw new IllegalStateException((new StringBuilder()).append("AnnotationIntrospector returned key deserializer definition of type ").append(obj.getClass().getName()).append("; expected type KeyDeserializer or Class<KeyDeserializer> instead").toString());
        }
        obj = (Class)obj;
        if (ClassUtil.isBogusClass(((Class) (obj))))
        {
            return null;
        }
        if (!com/fasterxml/jackson/databind/deser/ValueInstantiator.isAssignableFrom(((Class) (obj))))
        {
            throw new IllegalStateException((new StringBuilder()).append("AnnotationIntrospector returned Class ").append(((Class) (obj)).getName()).append("; expected Class<ValueInstantiator>").toString());
        }
        HandlerInstantiator handlerinstantiator = deserializationconfig.getHandlerInstantiator();
        if (handlerinstantiator != null)
        {
            annotated = handlerinstantiator.valueInstantiatorInstance(deserializationconfig, annotated, ((Class) (obj)));
            if (annotated != null)
            {
                return annotated;
            }
        }
        return (ValueInstantiator)ClassUtil.createInstance(((Class) (obj)), deserializationconfig.canOverrideAccessModifiers());
    }

    protected CreatorProperty constructCreatorProperty(DeserializationContext deserializationcontext, BeanDescription beandescription, PropertyName propertyname, int i, AnnotatedParameter annotatedparameter, Object obj)
        throws JsonMappingException
    {
        DeserializationConfig deserializationconfig = deserializationcontext.getConfig();
        Object obj2 = deserializationcontext.getAnnotationIntrospector();
        Object obj1;
        Object obj3;
        Object obj4;
        Object obj5;
        JavaType javatype;
        if (obj2 == null)
        {
            obj1 = PropertyMetadata.STD_REQUIRED_OR_OPTIONAL;
        } else
        {
            obj1 = ((AnnotationIntrospector) (obj2)).hasRequiredMarker(annotatedparameter);
            boolean flag;
            if (obj1 != null && ((Boolean) (obj1)).booleanValue())
            {
                flag = true;
            } else
            {
                flag = false;
            }
            obj1 = PropertyMetadata.construct(flag, ((AnnotationIntrospector) (obj2)).findPropertyDescription(annotatedparameter), ((AnnotationIntrospector) (obj2)).findPropertyIndex(annotatedparameter), ((AnnotationIntrospector) (obj2)).findPropertyDefaultValue(annotatedparameter));
        }
        obj5 = deserializationconfig.getTypeFactory().constructType(annotatedparameter.getParameterType(), beandescription.bindingsForBeanType());
        obj3 = new com.fasterxml.jackson.databind.BeanProperty.Std(propertyname, ((JavaType) (obj5)), ((AnnotationIntrospector) (obj2)).findWrapperName(annotatedparameter), beandescription.getClassAnnotations(), annotatedparameter, ((PropertyMetadata) (obj1)));
        obj4 = resolveType(deserializationcontext, beandescription, ((JavaType) (obj5)), annotatedparameter);
        obj2 = obj3;
        if (obj4 != obj5)
        {
            obj2 = ((com.fasterxml.jackson.databind.BeanProperty.Std) (obj3)).withType(((JavaType) (obj4)));
        }
        obj5 = findDeserializerFromAnnotation(deserializationcontext, annotatedparameter);
        javatype = modifyTypeByAnnotation(deserializationcontext, annotatedparameter, ((JavaType) (obj4)));
        obj4 = (TypeDeserializer)javatype.getTypeHandler();
        obj3 = obj4;
        if (obj4 == null)
        {
            obj3 = findTypeDeserializer(deserializationconfig, javatype);
        }
        propertyname = new CreatorProperty(propertyname, javatype, ((com.fasterxml.jackson.databind.BeanProperty.Std) (obj2)).getWrapperName(), ((TypeDeserializer) (obj3)), beandescription.getClassAnnotations(), annotatedparameter, i, obj, ((PropertyMetadata) (obj1)));
        beandescription = propertyname;
        if (obj5 != null)
        {
            beandescription = propertyname.withValueDeserializer(deserializationcontext.handlePrimaryContextualization(((JsonDeserializer) (obj5)), propertyname, javatype));
        }
        return beandescription;
    }

    protected EnumResolver constructEnumResolver(Class class1, DeserializationConfig deserializationconfig, AnnotatedMethod annotatedmethod)
    {
        if (annotatedmethod != null)
        {
            annotatedmethod = annotatedmethod.getAnnotated();
            if (deserializationconfig.canOverrideAccessModifiers())
            {
                ClassUtil.checkAndFixAccess(annotatedmethod);
            }
            return EnumResolver.constructUnsafeUsingMethod(class1, annotatedmethod);
        }
        if (deserializationconfig.isEnabled(DeserializationFeature.READ_ENUMS_USING_TO_STRING))
        {
            return EnumResolver.constructUnsafeUsingToString(class1);
        } else
        {
            return EnumResolver.constructUnsafe(class1, deserializationconfig.getAnnotationIntrospector());
        }
    }

    public JsonDeserializer createArrayDeserializer(DeserializationContext deserializationcontext, ArrayType arraytype, BeanDescription beandescription)
        throws JsonMappingException
    {
        DeserializationConfig deserializationconfig = deserializationcontext.getConfig();
        JavaType javatype = arraytype.getContentType();
        JsonDeserializer jsondeserializer1 = (JsonDeserializer)javatype.getValueHandler();
        deserializationcontext = (TypeDeserializer)javatype.getTypeHandler();
        Object obj = deserializationcontext;
        if (deserializationcontext == null)
        {
            obj = findTypeDeserializer(deserializationconfig, javatype);
        }
        JsonDeserializer jsondeserializer = _findCustomArrayDeserializer(arraytype, deserializationconfig, beandescription, ((TypeDeserializer) (obj)), jsondeserializer1);
        deserializationcontext = jsondeserializer;
        if (jsondeserializer == null)
        {
            if (jsondeserializer1 == null)
            {
                deserializationcontext = javatype.getRawClass();
                if (javatype.isPrimitive())
                {
                    return PrimitiveArrayDeserializers.forType(deserializationcontext);
                }
                if (deserializationcontext == java/lang/String)
                {
                    return StringArrayDeserializer.instance;
                }
            }
            deserializationcontext = new ObjectArrayDeserializer(arraytype, jsondeserializer1, ((TypeDeserializer) (obj)));
        }
        obj = deserializationcontext;
        if (_factoryConfig.hasDeserializerModifiers())
        {
            Iterator iterator = _factoryConfig.deserializerModifiers().iterator();
            do
            {
                obj = deserializationcontext;
                if (!iterator.hasNext())
                {
                    break;
                }
                deserializationcontext = ((BeanDeserializerModifier)iterator.next()).modifyArrayDeserializer(deserializationconfig, arraytype, beandescription, deserializationcontext);
            } while (true);
        }
        return ((JsonDeserializer) (obj));
    }

    public JsonDeserializer createCollectionDeserializer(DeserializationContext deserializationcontext, CollectionType collectiontype, BeanDescription beandescription)
        throws JsonMappingException
    {
label0:
        {
            Object obj;
            CollectionType collectiontype1;
            BeanDescription beandescription1;
            TypeDeserializer typedeserializer;
            CollectionType collectiontype2;
            BeanDescription beandescription2;
            DeserializationConfig deserializationconfig;
            JavaType javatype;
            JsonDeserializer jsondeserializer;
label1:
            {
                javatype = collectiontype.getContentType();
                jsondeserializer = (JsonDeserializer)javatype.getValueHandler();
                deserializationconfig = deserializationcontext.getConfig();
                obj = (TypeDeserializer)javatype.getTypeHandler();
                typedeserializer = ((TypeDeserializer) (obj));
                if (obj == null)
                {
                    typedeserializer = findTypeDeserializer(deserializationconfig, javatype);
                }
                obj = _findCustomCollectionDeserializer(collectiontype, deserializationconfig, beandescription, typedeserializer, jsondeserializer);
                Object obj1 = obj;
                if (obj == null)
                {
                    Class class1 = collectiontype.getRawClass();
                    obj1 = obj;
                    if (jsondeserializer == null)
                    {
                        obj1 = obj;
                        if (java/util/EnumSet.isAssignableFrom(class1))
                        {
                            obj1 = new EnumSetDeserializer(javatype, null);
                        }
                    }
                }
                obj = obj1;
                collectiontype2 = collectiontype;
                beandescription2 = beandescription;
                if (obj1 != null)
                {
                    break label0;
                }
                Object obj2;
                if (!collectiontype.isInterface())
                {
                    obj2 = obj1;
                    collectiontype1 = collectiontype;
                    beandescription1 = beandescription;
                    if (!collectiontype.isAbstract())
                    {
                        break label1;
                    }
                }
                collectiontype1 = _mapAbstractCollectionType(collectiontype, deserializationconfig);
                if (collectiontype1 == null)
                {
                    if (collectiontype.getTypeHandler() == null)
                    {
                        throw new IllegalArgumentException((new StringBuilder()).append("Can not find a deserializer for non-concrete Collection type ").append(collectiontype).toString());
                    }
                    obj2 = AbstractDeserializer.constructForNonPOJO(beandescription);
                    beandescription1 = beandescription;
                    collectiontype1 = collectiontype;
                } else
                {
                    beandescription1 = deserializationconfig.introspectForCreation(collectiontype1);
                    obj2 = obj1;
                }
            }
            obj = obj2;
            collectiontype2 = collectiontype1;
            beandescription2 = beandescription1;
            if (obj2 == null)
            {
                deserializationcontext = findValueInstantiator(deserializationcontext, beandescription1);
                if (!deserializationcontext.canCreateUsingDefault() && collectiontype1.getRawClass() == java/util/concurrent/ArrayBlockingQueue)
                {
                    return new ArrayBlockingQueueDeserializer(collectiontype1, jsondeserializer, typedeserializer, deserializationcontext, null);
                }
                if (javatype.getRawClass() == java/lang/String)
                {
                    obj = new StringCollectionDeserializer(collectiontype1, jsondeserializer, deserializationcontext);
                    beandescription2 = beandescription1;
                    collectiontype2 = collectiontype1;
                } else
                {
                    obj = new CollectionDeserializer(collectiontype1, jsondeserializer, typedeserializer, deserializationcontext);
                    collectiontype2 = collectiontype1;
                    beandescription2 = beandescription1;
                }
            }
        }
        deserializationcontext = ((DeserializationContext) (obj));
        if (_factoryConfig.hasDeserializerModifiers())
        {
            collectiontype = _factoryConfig.deserializerModifiers().iterator();
            do
            {
                deserializationcontext = ((DeserializationContext) (obj));
                if (!collectiontype.hasNext())
                {
                    break;
                }
                obj = ((BeanDeserializerModifier)collectiontype.next()).modifyCollectionDeserializer(deserializationconfig, collectiontype2, beandescription2, ((JsonDeserializer) (obj)));
            } while (true);
        }
        return deserializationcontext;
    }

    public JsonDeserializer createCollectionLikeDeserializer(DeserializationContext deserializationcontext, CollectionLikeType collectionliketype, BeanDescription beandescription)
        throws JsonMappingException
    {
        JavaType javatype = collectionliketype.getContentType();
        JsonDeserializer jsondeserializer = (JsonDeserializer)javatype.getValueHandler();
        DeserializationConfig deserializationconfig = deserializationcontext.getConfig();
        Object obj = (TypeDeserializer)javatype.getTypeHandler();
        deserializationcontext = ((DeserializationContext) (obj));
        if (obj == null)
        {
            deserializationcontext = findTypeDeserializer(deserializationconfig, javatype);
        }
        deserializationcontext = _findCustomCollectionLikeDeserializer(collectionliketype, deserializationconfig, beandescription, deserializationcontext, jsondeserializer);
        obj = deserializationcontext;
        if (deserializationcontext != null)
        {
            obj = deserializationcontext;
            if (_factoryConfig.hasDeserializerModifiers())
            {
                Iterator iterator = _factoryConfig.deserializerModifiers().iterator();
                do
                {
                    obj = deserializationcontext;
                    if (!iterator.hasNext())
                    {
                        break;
                    }
                    deserializationcontext = ((BeanDeserializerModifier)iterator.next()).modifyCollectionLikeDeserializer(deserializationconfig, collectionliketype, beandescription, deserializationcontext);
                } while (true);
            }
        }
        return ((JsonDeserializer) (obj));
    }

    public JsonDeserializer createEnumDeserializer(DeserializationContext deserializationcontext, JavaType javatype, BeanDescription beandescription)
        throws JsonMappingException
    {
label0:
        {
            Object obj1;
            Class class1;
label1:
            {
                DeserializationConfig deserializationconfig = deserializationcontext.getConfig();
                class1 = javatype.getRawClass();
                JsonDeserializer jsondeserializer = _findCustomEnumDeserializer(class1, deserializationconfig, beandescription);
                Object obj = jsondeserializer;
                if (jsondeserializer == null)
                {
                    obj = beandescription.getFactoryMethods().iterator();
                    do
                    {
                        obj1 = jsondeserializer;
                        if (!((Iterator) (obj)).hasNext())
                        {
                            break;
                        }
                        obj1 = (AnnotatedMethod)((Iterator) (obj)).next();
                        if (!deserializationcontext.getAnnotationIntrospector().hasCreatorAnnotation(((Annotated) (obj1))))
                        {
                            continue;
                        }
                        if (((AnnotatedMethod) (obj1)).getParameterCount() != 1 || !((AnnotatedMethod) (obj1)).getRawReturnType().isAssignableFrom(class1))
                        {
                            break label1;
                        }
                        obj1 = EnumDeserializer.deserializerForCreator(deserializationconfig, class1, ((AnnotatedMethod) (obj1)));
                        break;
                    } while (true);
                    obj = obj1;
                    if (obj1 == null)
                    {
                        obj = new EnumDeserializer(constructEnumResolver(class1, deserializationconfig, beandescription.findJsonValueMethod()));
                    }
                }
                deserializationcontext = ((DeserializationContext) (obj));
                if (_factoryConfig.hasDeserializerModifiers())
                {
                    obj1 = _factoryConfig.deserializerModifiers().iterator();
                    do
                    {
                        deserializationcontext = ((DeserializationContext) (obj));
                        if (!((Iterator) (obj1)).hasNext())
                        {
                            break;
                        }
                        obj = ((BeanDeserializerModifier)((Iterator) (obj1)).next()).modifyEnumDeserializer(deserializationconfig, javatype, beandescription, ((JsonDeserializer) (obj)));
                    } while (true);
                }
                break label0;
            }
            throw new IllegalArgumentException((new StringBuilder()).append("Unsuitable method (").append(obj1).append(") decorated with @JsonCreator (for Enum type ").append(class1.getName()).append(")").toString());
        }
        return deserializationcontext;
    }

    public KeyDeserializer createKeyDeserializer(DeserializationContext deserializationcontext, JavaType javatype)
        throws JsonMappingException
    {
        KeyDeserializer keydeserializer;
        DeserializationConfig deserializationconfig;
label0:
        {
            deserializationconfig = deserializationcontext.getConfig();
            keydeserializer = null;
            KeyDeserializer keydeserializer1 = null;
            if (!_factoryConfig.hasKeyDeserializers())
            {
                break label0;
            }
            BeanDescription beandescription = deserializationconfig.introspectClassAnnotations(javatype.getRawClass());
            Iterator iterator1 = _factoryConfig.keyDeserializers().iterator();
            keydeserializer = keydeserializer1;
            do
            {
                if (!iterator1.hasNext())
                {
                    break label0;
                }
                keydeserializer1 = ((KeyDeserializers)iterator1.next()).findKeyDeserializer(javatype, deserializationconfig, beandescription);
                keydeserializer = keydeserializer1;
            } while (keydeserializer1 == null);
            keydeserializer = keydeserializer1;
        }
        KeyDeserializer keydeserializer2 = keydeserializer;
        if (keydeserializer == null)
        {
            if (javatype.isEnumType())
            {
                return _createEnumKeyDeserializer(deserializationcontext, javatype);
            }
            keydeserializer2 = StdKeyDeserializers.findStringBasedKeyDeserializer(deserializationconfig, javatype);
        }
        deserializationcontext = keydeserializer2;
        if (keydeserializer2 != null)
        {
            deserializationcontext = keydeserializer2;
            if (_factoryConfig.hasDeserializerModifiers())
            {
                Iterator iterator = _factoryConfig.deserializerModifiers().iterator();
                do
                {
                    deserializationcontext = keydeserializer2;
                    if (!iterator.hasNext())
                    {
                        break;
                    }
                    keydeserializer2 = ((BeanDeserializerModifier)iterator.next()).modifyKeyDeserializer(deserializationconfig, javatype, keydeserializer2);
                } while (true);
            }
        }
        return deserializationcontext;
    }

    public JsonDeserializer createMapDeserializer(DeserializationContext deserializationcontext, MapType maptype, BeanDescription beandescription)
        throws JsonMappingException
    {
label0:
        {
label1:
            {
                DeserializationConfig deserializationconfig = deserializationcontext.getConfig();
                Object obj2 = maptype.getKeyType();
                Object obj1 = maptype.getContentType();
                JsonDeserializer jsondeserializer = (JsonDeserializer)((JavaType) (obj1)).getValueHandler();
                KeyDeserializer keydeserializer = (KeyDeserializer)((JavaType) (obj2)).getValueHandler();
                Object obj = (TypeDeserializer)((JavaType) (obj1)).getTypeHandler();
                TypeDeserializer typedeserializer = ((TypeDeserializer) (obj));
                if (obj == null)
                {
                    typedeserializer = findTypeDeserializer(deserializationconfig, ((JavaType) (obj1)));
                }
                obj1 = _findCustomMapDeserializer(maptype, deserializationconfig, beandescription, keydeserializer, typedeserializer, jsondeserializer);
                obj = obj1;
                MapType maptype2 = maptype;
                BeanDescription beandescription1 = beandescription;
                if (obj1 != null)
                {
                    break label0;
                }
                Class class1 = maptype.getRawClass();
                if (java/util/EnumMap.isAssignableFrom(class1))
                {
                    obj = ((JavaType) (obj2)).getRawClass();
                    if (obj == null || !((Class) (obj)).isEnum())
                    {
                        throw new IllegalArgumentException("Can not construct EnumMap; generic (key) type not available");
                    }
                    obj1 = new EnumMapDeserializer(maptype, null, jsondeserializer, typedeserializer);
                }
                obj = obj1;
                maptype2 = maptype;
                beandescription1 = beandescription;
                if (obj1 != null)
                {
                    break label0;
                }
                MapType maptype1;
                Object obj3;
                if (!maptype.isInterface())
                {
                    obj3 = obj1;
                    maptype1 = maptype;
                    obj2 = beandescription;
                    if (!maptype.isAbstract())
                    {
                        break label1;
                    }
                }
                obj = (Class)_mapFallbacks.get(class1.getName());
                if (obj != null)
                {
                    maptype1 = (MapType)deserializationconfig.constructSpecializedType(maptype, ((Class) (obj)));
                    obj2 = deserializationconfig.introspectForCreation(maptype1);
                    obj3 = obj1;
                } else
                {
                    if (maptype.getTypeHandler() == null)
                    {
                        throw new IllegalArgumentException((new StringBuilder()).append("Can not find a deserializer for non-concrete Map type ").append(maptype).toString());
                    }
                    obj3 = AbstractDeserializer.constructForNonPOJO(beandescription);
                    maptype1 = maptype;
                    obj2 = beandescription;
                }
            }
            obj = obj3;
            maptype2 = maptype1;
            beandescription1 = ((BeanDescription) (obj2));
            if (obj3 == null)
            {
                obj = new MapDeserializer(maptype1, findValueInstantiator(deserializationcontext, ((BeanDescription) (obj2))), keydeserializer, jsondeserializer, typedeserializer);
                ((MapDeserializer) (obj)).setIgnorableProperties(deserializationconfig.getAnnotationIntrospector().findPropertiesToIgnore(((BeanDescription) (obj2)).getClassInfo()));
                beandescription1 = ((BeanDescription) (obj2));
                maptype2 = maptype1;
            }
        }
        deserializationcontext = ((DeserializationContext) (obj));
        if (_factoryConfig.hasDeserializerModifiers())
        {
            maptype = _factoryConfig.deserializerModifiers().iterator();
            do
            {
                deserializationcontext = ((DeserializationContext) (obj));
                if (!maptype.hasNext())
                {
                    break;
                }
                obj = ((BeanDeserializerModifier)maptype.next()).modifyMapDeserializer(deserializationconfig, maptype2, beandescription1, ((JsonDeserializer) (obj)));
            } while (true);
        }
        return deserializationcontext;
    }

    public JsonDeserializer createMapLikeDeserializer(DeserializationContext deserializationcontext, MapLikeType mapliketype, BeanDescription beandescription)
        throws JsonMappingException
    {
        Object obj = mapliketype.getKeyType();
        JavaType javatype = mapliketype.getContentType();
        DeserializationConfig deserializationconfig = deserializationcontext.getConfig();
        JsonDeserializer jsondeserializer = (JsonDeserializer)javatype.getValueHandler();
        KeyDeserializer keydeserializer = (KeyDeserializer)((JavaType) (obj)).getValueHandler();
        obj = (TypeDeserializer)javatype.getTypeHandler();
        deserializationcontext = ((DeserializationContext) (obj));
        if (obj == null)
        {
            deserializationcontext = findTypeDeserializer(deserializationconfig, javatype);
        }
        deserializationcontext = _findCustomMapLikeDeserializer(mapliketype, deserializationconfig, beandescription, keydeserializer, deserializationcontext, jsondeserializer);
        obj = deserializationcontext;
        if (deserializationcontext != null)
        {
            obj = deserializationcontext;
            if (_factoryConfig.hasDeserializerModifiers())
            {
                Iterator iterator = _factoryConfig.deserializerModifiers().iterator();
                do
                {
                    obj = deserializationcontext;
                    if (!iterator.hasNext())
                    {
                        break;
                    }
                    deserializationcontext = ((BeanDeserializerModifier)iterator.next()).modifyMapLikeDeserializer(deserializationconfig, mapliketype, beandescription, deserializationcontext);
                } while (true);
            }
        }
        return ((JsonDeserializer) (obj));
    }

    public JsonDeserializer createTreeDeserializer(DeserializationConfig deserializationconfig, JavaType javatype, BeanDescription beandescription)
        throws JsonMappingException
    {
        javatype = javatype.getRawClass();
        deserializationconfig = _findCustomTreeNodeDeserializer(javatype, deserializationconfig, beandescription);
        if (deserializationconfig != null)
        {
            return deserializationconfig;
        } else
        {
            return JsonNodeDeserializer.getDeserializer(javatype);
        }
    }

    public JsonDeserializer findDefaultDeserializer(DeserializationContext deserializationcontext, JavaType javatype, BeanDescription beandescription)
        throws JsonMappingException
    {
        Object obj1 = javatype.getRawClass();
        if (obj1 != CLASS_OBJECT) goto _L2; else goto _L1
_L1:
        Object obj = new UntypedObjectDeserializer();
_L4:
        return ((JsonDeserializer) (obj));
_L2:
        JsonDeserializer jsondeserializer;
        String s;
        if (obj1 == CLASS_STRING || obj1 == CLASS_CHAR_BUFFER)
        {
            return StringDeserializer.instance;
        }
        if (obj1 == CLASS_ITERABLE)
        {
            obj = deserializationcontext.getTypeFactory();
            javatype = ((TypeFactory) (obj)).findTypeParameters(javatype, CLASS_ITERABLE);
            if (javatype == null || javatype.length != 1)
            {
                javatype = TypeFactory.unknownType();
            } else
            {
                javatype = javatype[0];
            }
            return createCollectionDeserializer(deserializationcontext, ((TypeFactory) (obj)).constructCollectionType(java/util/Collection, javatype), beandescription);
        }
        if (obj1 == CLASS_MAP_ENTRY)
        {
            obj1 = deserializationcontext.getConfig();
            beandescription = deserializationcontext.getTypeFactory().findTypeParameters(javatype, CLASS_MAP_ENTRY);
            TypeDeserializer typedeserializer;
            if (beandescription == null || beandescription.length != 2)
            {
                beandescription = TypeFactory.unknownType();
                deserializationcontext = beandescription;
            } else
            {
                deserializationcontext = beandescription[0];
                beandescription = beandescription[1];
            }
            typedeserializer = (TypeDeserializer)beandescription.getTypeHandler();
            obj = typedeserializer;
            if (typedeserializer == null)
            {
                obj = findTypeDeserializer(((DeserializationConfig) (obj1)), beandescription);
            }
            beandescription = (JsonDeserializer)beandescription.getValueHandler();
            return new MapEntryDeserializer(javatype, (KeyDeserializer)deserializationcontext.getValueHandler(), beandescription, ((TypeDeserializer) (obj)));
        }
        s = ((Class) (obj1)).getName();
        if (!((Class) (obj1)).isPrimitive() && !s.startsWith("java."))
        {
            break; /* Loop/switch isn't completed */
        }
        obj = NumberDeserializers.find(((Class) (obj1)), s);
        jsondeserializer = ((JsonDeserializer) (obj));
        if (obj == null)
        {
            jsondeserializer = DateDeserializers.find(((Class) (obj1)), s);
        }
        obj = jsondeserializer;
        if (jsondeserializer != null) goto _L4; else goto _L3
_L3:
        if (obj1 == com/fasterxml/jackson/databind/util/TokenBuffer)
        {
            return new TokenBufferDeserializer();
        }
        if (java/util/concurrent/atomic/AtomicReference.isAssignableFrom(((Class) (obj1))))
        {
            javatype = deserializationcontext.getTypeFactory().findTypeParameters(javatype, java/util/concurrent/atomic/AtomicReference);
            if (javatype == null || javatype.length < 1)
            {
                javatype = TypeFactory.unknownType();
            } else
            {
                javatype = javatype[0];
            }
            return new AtomicReferenceDeserializer(javatype, findTypeDeserializer(deserializationcontext.getConfig(), javatype), findDeserializerFromAnnotation(deserializationcontext, deserializationcontext.getConfig().introspectClassAnnotations(javatype).getClassInfo()));
        }
        deserializationcontext = findOptionalStdDeserializer(deserializationcontext, javatype, beandescription);
        obj = deserializationcontext;
        if (deserializationcontext == null)
        {
            return JdkDeserializers.find(((Class) (obj1)), s);
        }
        if (true) goto _L4; else goto _L5
_L5:
    }

    protected JsonDeserializer findDeserializerFromAnnotation(DeserializationContext deserializationcontext, Annotated annotated)
        throws JsonMappingException
    {
        Object obj = deserializationcontext.getAnnotationIntrospector().findDeserializer(annotated);
        if (obj == null)
        {
            return null;
        } else
        {
            return deserializationcontext.deserializerInstance(annotated, obj);
        }
    }

    protected JsonDeserializer findOptionalStdDeserializer(DeserializationContext deserializationcontext, JavaType javatype, BeanDescription beandescription)
        throws JsonMappingException
    {
        return OptionalHandlerFactory.instance.findDeserializer(javatype, deserializationcontext.getConfig(), beandescription);
    }

    public TypeDeserializer findPropertyContentTypeDeserializer(DeserializationConfig deserializationconfig, JavaType javatype, AnnotatedMember annotatedmember)
        throws JsonMappingException
    {
        AnnotationIntrospector annotationintrospector = deserializationconfig.getAnnotationIntrospector();
        TypeResolverBuilder typeresolverbuilder = annotationintrospector.findPropertyContentTypeResolver(deserializationconfig, annotatedmember, javatype);
        javatype = javatype.getContentType();
        if (typeresolverbuilder == null)
        {
            return findTypeDeserializer(deserializationconfig, javatype);
        } else
        {
            return typeresolverbuilder.buildTypeDeserializer(deserializationconfig, javatype, deserializationconfig.getSubtypeResolver().collectAndResolveSubtypes(annotatedmember, deserializationconfig, annotationintrospector, javatype));
        }
    }

    public TypeDeserializer findPropertyTypeDeserializer(DeserializationConfig deserializationconfig, JavaType javatype, AnnotatedMember annotatedmember)
        throws JsonMappingException
    {
        AnnotationIntrospector annotationintrospector = deserializationconfig.getAnnotationIntrospector();
        TypeResolverBuilder typeresolverbuilder = annotationintrospector.findPropertyTypeResolver(deserializationconfig, annotatedmember, javatype);
        if (typeresolverbuilder == null)
        {
            return findTypeDeserializer(deserializationconfig, javatype);
        } else
        {
            return typeresolverbuilder.buildTypeDeserializer(deserializationconfig, javatype, deserializationconfig.getSubtypeResolver().collectAndResolveSubtypes(annotatedmember, deserializationconfig, annotationintrospector, javatype));
        }
    }

    public TypeDeserializer findTypeDeserializer(DeserializationConfig deserializationconfig, JavaType javatype)
        throws JsonMappingException
    {
        Object obj1 = deserializationconfig.introspectClassAnnotations(javatype.getRawClass()).getClassInfo();
        AnnotationIntrospector annotationintrospector = deserializationconfig.getAnnotationIntrospector();
        Object obj = annotationintrospector.findTypeResolver(deserializationconfig, ((com.fasterxml.jackson.databind.introspect.AnnotatedClass) (obj1)), javatype);
        Collection collection = null;
        if (obj == null)
        {
            obj1 = deserializationconfig.getDefaultTyper(javatype);
            obj = obj1;
            if (obj1 == null)
            {
                return null;
            }
        } else
        {
            collection = deserializationconfig.getSubtypeResolver().collectAndResolveSubtypes(((com.fasterxml.jackson.databind.introspect.AnnotatedClass) (obj1)), deserializationconfig, annotationintrospector);
        }
        obj1 = obj;
        if (((TypeResolverBuilder) (obj)).getDefaultImpl() == null)
        {
            obj1 = obj;
            if (javatype.isAbstract())
            {
                JavaType javatype1 = mapAbstractType(deserializationconfig, javatype);
                obj1 = obj;
                if (javatype1 != null)
                {
                    obj1 = obj;
                    if (javatype1.getRawClass() != javatype.getRawClass())
                    {
                        obj1 = ((TypeResolverBuilder) (obj)).defaultImpl(javatype1.getRawClass());
                    }
                }
            }
        }
        return ((TypeResolverBuilder) (obj1)).buildTypeDeserializer(deserializationconfig, javatype, collection);
    }

    public ValueInstantiator findValueInstantiator(DeserializationContext deserializationcontext, BeanDescription beandescription)
        throws JsonMappingException
    {
label0:
        {
            DeserializationConfig deserializationconfig = deserializationcontext.getConfig();
            Object obj1 = null;
            Object obj = beandescription.getClassInfo();
            Object obj2 = deserializationcontext.getAnnotationIntrospector().findValueInstantiator(((com.fasterxml.jackson.databind.introspect.AnnotatedClass) (obj)));
            if (obj2 != null)
            {
                obj1 = _valueInstantiatorInstance(deserializationconfig, ((Annotated) (obj)), obj2);
            }
            obj = obj1;
            if (obj1 == null)
            {
                obj1 = _findStdValueInstantiator(deserializationconfig, beandescription);
                obj = obj1;
                if (obj1 == null)
                {
                    obj = _constructDefaultValueInstantiator(deserializationcontext, beandescription);
                }
            }
            deserializationcontext = ((DeserializationContext) (obj));
            if (!_factoryConfig.hasValueInstantiators())
            {
                break label0;
            }
            obj1 = _factoryConfig.valueInstantiators().iterator();
            do
            {
                deserializationcontext = ((DeserializationContext) (obj));
                if (!((Iterator) (obj1)).hasNext())
                {
                    break label0;
                }
                obj2 = (ValueInstantiators)((Iterator) (obj1)).next();
                deserializationcontext = ((ValueInstantiators) (obj2)).findValueInstantiator(deserializationconfig, beandescription, ((ValueInstantiator) (obj)));
                obj = deserializationcontext;
            } while (deserializationcontext != null);
            throw new JsonMappingException((new StringBuilder()).append("Broken registered ValueInstantiators (of type ").append(obj2.getClass().getName()).append("): returned null ValueInstantiator").toString());
        }
        if (deserializationcontext.getIncompleteParameter() != null)
        {
            deserializationcontext = deserializationcontext.getIncompleteParameter();
            beandescription = deserializationcontext.getOwner();
            throw new IllegalArgumentException((new StringBuilder()).append("Argument #").append(deserializationcontext.getIndex()).append(" of constructor ").append(beandescription).append(" has no property name annotation; must have name when multiple-parameter constructor annotated as Creator").toString());
        } else
        {
            return deserializationcontext;
        }
    }

    public JavaType mapAbstractType(DeserializationConfig deserializationconfig, JavaType javatype)
        throws JsonMappingException
    {
        do
        {
            JavaType javatype1 = _mapAbstractType2(deserializationconfig, javatype);
            if (javatype1 == null)
            {
                return javatype;
            }
            Class class1 = javatype.getRawClass();
            Class class2 = javatype1.getRawClass();
            if (class1 == class2 || !class1.isAssignableFrom(class2))
            {
                throw new IllegalArgumentException((new StringBuilder()).append("Invalid abstract type resolution from ").append(javatype).append(" to ").append(javatype1).append(": latter is not a subtype of former").toString());
            }
            javatype = javatype1;
        } while (true);
    }

    protected JavaType modifyTypeByAnnotation(DeserializationContext deserializationcontext, Annotated annotated, JavaType javatype)
        throws JsonMappingException
    {
        AnnotationIntrospector annotationintrospector = deserializationcontext.getAnnotationIntrospector();
        Object obj1 = annotationintrospector.findDeserializationType(annotated, javatype);
        Object obj = javatype;
        if (obj1 != null)
        {
            try
            {
                obj = javatype.narrowBy(((Class) (obj1)));
            }
            // Misplaced declaration of an exception variable
            catch (DeserializationContext deserializationcontext)
            {
                throw new JsonMappingException((new StringBuilder()).append("Failed to narrow type ").append(javatype).append(" with concrete-type annotation (value ").append(((Class) (obj1)).getName()).append("), method '").append(annotated.getName()).append("': ").append(deserializationcontext.getMessage()).toString(), null, deserializationcontext);
            }
        }
        javatype = ((JavaType) (obj));
        if (((JavaType) (obj)).isContainerType())
        {
            javatype = annotationintrospector.findDeserializationKeyType(annotated, ((JavaType) (obj)).getKeyType());
            obj1 = obj;
            if (javatype != null)
            {
                if (!(obj instanceof MapLikeType))
                {
                    throw new JsonMappingException((new StringBuilder()).append("Illegal key-type annotation: type ").append(obj).append(" is not a Map(-like) type").toString());
                }
                try
                {
                    obj1 = ((MapLikeType)obj).narrowKey(javatype);
                }
                // Misplaced declaration of an exception variable
                catch (DeserializationContext deserializationcontext)
                {
                    throw new JsonMappingException((new StringBuilder()).append("Failed to narrow key type ").append(obj).append(" with key-type annotation (").append(javatype.getName()).append("): ").append(deserializationcontext.getMessage()).toString(), null, deserializationcontext);
                }
            }
            obj = ((JavaType) (obj1)).getKeyType();
            javatype = ((JavaType) (obj1));
            if (obj != null)
            {
                javatype = ((JavaType) (obj1));
                if (((JavaType) (obj)).getValueHandler() == null)
                {
                    obj = deserializationcontext.keyDeserializerInstance(annotated, annotationintrospector.findKeyDeserializer(annotated));
                    javatype = ((JavaType) (obj1));
                    if (obj != null)
                    {
                        javatype = ((MapLikeType)obj1).withKeyValueHandler(obj);
                        javatype.getKeyType();
                    }
                }
            }
            obj1 = annotationintrospector.findDeserializationContentType(annotated, javatype.getContentType());
            obj = javatype;
            if (obj1 != null)
            {
                try
                {
                    obj = javatype.narrowContentsBy(((Class) (obj1)));
                }
                // Misplaced declaration of an exception variable
                catch (DeserializationContext deserializationcontext)
                {
                    throw new JsonMappingException((new StringBuilder()).append("Failed to narrow content type ").append(javatype).append(" with content-type annotation (").append(((Class) (obj1)).getName()).append("): ").append(deserializationcontext.getMessage()).toString(), null, deserializationcontext);
                }
            }
            javatype = ((JavaType) (obj));
            if (((JavaType) (obj)).getContentType().getValueHandler() == null)
            {
                deserializationcontext = deserializationcontext.deserializerInstance(annotated, annotationintrospector.findContentDeserializer(annotated));
                javatype = ((JavaType) (obj));
                if (deserializationcontext != null)
                {
                    javatype = ((JavaType) (obj)).withContentValueHandler(deserializationcontext);
                }
            }
        }
        return javatype;
    }

    protected JavaType resolveType(DeserializationContext deserializationcontext, BeanDescription beandescription, JavaType javatype, AnnotatedMember annotatedmember)
        throws JsonMappingException
    {
        beandescription = javatype;
        if (javatype.isContainerType())
        {
            Object obj = deserializationcontext.getAnnotationIntrospector();
            beandescription = javatype;
            if (javatype.getKeyType() != null)
            {
                KeyDeserializer keydeserializer = deserializationcontext.keyDeserializerInstance(annotatedmember, ((AnnotationIntrospector) (obj)).findKeyDeserializer(annotatedmember));
                beandescription = javatype;
                if (keydeserializer != null)
                {
                    beandescription = ((MapLikeType)javatype).withKeyValueHandler(keydeserializer);
                    beandescription.getKeyType();
                }
            }
            obj = deserializationcontext.deserializerInstance(annotatedmember, ((AnnotationIntrospector) (obj)).findContentDeserializer(annotatedmember));
            javatype = beandescription;
            if (obj != null)
            {
                javatype = beandescription.withContentValueHandler(obj);
            }
            beandescription = javatype;
            if (annotatedmember instanceof AnnotatedMember)
            {
                TypeDeserializer typedeserializer = findPropertyContentTypeDeserializer(deserializationcontext.getConfig(), javatype, annotatedmember);
                beandescription = javatype;
                if (typedeserializer != null)
                {
                    beandescription = javatype.withContentTypeHandler(typedeserializer);
                }
            }
        }
        if (annotatedmember instanceof AnnotatedMember)
        {
            deserializationcontext = findPropertyTypeDeserializer(deserializationcontext.getConfig(), beandescription, annotatedmember);
        } else
        {
            deserializationcontext = findTypeDeserializer(deserializationcontext.getConfig(), beandescription);
        }
        javatype = beandescription;
        if (deserializationcontext != null)
        {
            javatype = beandescription.withTypeHandler(deserializationcontext);
        }
        return javatype;
    }

    static 
    {
        _mapFallbacks = new HashMap();
        _mapFallbacks.put(java/util/Map.getName(), java/util/LinkedHashMap);
        _mapFallbacks.put(java/util/concurrent/ConcurrentMap.getName(), java/util/concurrent/ConcurrentHashMap);
        _mapFallbacks.put(java/util/SortedMap.getName(), java/util/TreeMap);
        _mapFallbacks.put(java/util/NavigableMap.getName(), java/util/TreeMap);
        _mapFallbacks.put(java/util/concurrent/ConcurrentNavigableMap.getName(), java/util/concurrent/ConcurrentSkipListMap);
        _collectionFallbacks = new HashMap();
        _collectionFallbacks.put(java/util/Collection.getName(), java/util/ArrayList);
        _collectionFallbacks.put(java/util/List.getName(), java/util/ArrayList);
        _collectionFallbacks.put(java/util/Set.getName(), java/util/HashSet);
        _collectionFallbacks.put(java/util/SortedSet.getName(), java/util/TreeSet);
        _collectionFallbacks.put(java/util/Queue.getName(), java/util/LinkedList);
        _collectionFallbacks.put("java.util.Deque", java/util/LinkedList);
        _collectionFallbacks.put("java.util.NavigableSet", java/util/TreeSet);
    }
}
