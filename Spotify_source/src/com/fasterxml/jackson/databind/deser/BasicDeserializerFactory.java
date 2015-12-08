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
import com.fasterxml.jackson.databind.deser.std.CollectionDeserializer;
import com.fasterxml.jackson.databind.deser.std.DateDeserializers;
import com.fasterxml.jackson.databind.deser.std.EnumDeserializer;
import com.fasterxml.jackson.databind.deser.std.EnumMapDeserializer;
import com.fasterxml.jackson.databind.deser.std.EnumSetDeserializer;
import com.fasterxml.jackson.databind.deser.std.JdkDeserializers;
import com.fasterxml.jackson.databind.deser.std.JsonLocationInstantiator;
import com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer;
import com.fasterxml.jackson.databind.deser.std.MapDeserializer;
import com.fasterxml.jackson.databind.deser.std.NumberDeserializers;
import com.fasterxml.jackson.databind.deser.std.ObjectArrayDeserializer;
import com.fasterxml.jackson.databind.deser.std.PrimitiveArrayDeserializers;
import com.fasterxml.jackson.databind.deser.std.StdKeyDeserializers;
import com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer;
import com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer;
import com.fasterxml.jackson.databind.deser.std.StringDeserializer;
import com.fasterxml.jackson.databind.deser.std.TokenBufferDeserializer;
import com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer;
import com.fasterxml.jackson.databind.introspect.Annotated;
import com.fasterxml.jackson.databind.introspect.AnnotatedConstructor;
import com.fasterxml.jackson.databind.introspect.AnnotatedMember;
import com.fasterxml.jackson.databind.introspect.AnnotatedMethod;
import com.fasterxml.jackson.databind.introspect.AnnotatedParameter;
import com.fasterxml.jackson.databind.introspect.BeanPropertyDefinition;
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
import java.io.PrintStream;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.EnumMap;
import java.util.EnumSet;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
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

// Referenced classes of package com.fasterxml.jackson.databind.deser:
//            DeserializerFactory, CreatorProperty, Deserializers, ValueInstantiator, 
//            BeanDeserializerModifier, AbstractDeserializer, KeyDeserializers, ValueInstantiators

public abstract class BasicDeserializerFactory extends DeserializerFactory
    implements Serializable
{

    private static final Class CLASS_CHAR_BUFFER = java/lang/CharSequence;
    private static final Class CLASS_ITERABLE = java/lang/Iterable;
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
                        throw new IllegalArgumentException((new StringBuilder("Parameter #0 type for factory method (")).append(annotatedmethod).append(") not suitable, must be java.lang.String").toString());
                    }
                    if (deserializationconfig.canOverrideAccessModifiers())
                    {
                        ClassUtil.checkAndFixAccess(annotatedmethod.getMember());
                    }
                    return StdKeyDeserializers.constructEnumKeyDeserializer(javatype, annotatedmethod);
                } else
                {
                    throw new IllegalArgumentException((new StringBuilder("Unsuitable method (")).append(annotatedmethod).append(") decorated with @JsonCreator (for Enum type ").append(deserializationcontext.getName()).append(")").toString());
                }
            }
        }

        return StdKeyDeserializers.constructEnumKeyDeserializer(javatype);
    }

    private ValueInstantiator _findStdValueInstantiator(DeserializationConfig deserializationconfig, BeanDescription beandescription)
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

    protected void _addDeserializerConstructors(DeserializationContext deserializationcontext, BeanDescription beandescription, VisibilityChecker visibilitychecker, AnnotationIntrospector annotationintrospector, CreatorCollector creatorcollector)
    {
        Object obj1;
        Object obj2;
        Iterator iterator;
        AnnotatedConstructor annotatedconstructor = beandescription.findDefaultConstructor();
        if (annotatedconstructor != null && (!creatorcollector.hasDefaultCreator() || annotationintrospector.hasCreatorAnnotation(annotatedconstructor)))
        {
            creatorcollector.setDefaultCreator(annotatedconstructor);
        }
        obj1 = null;
        obj2 = null;
        iterator = beandescription.findProperties().iterator();
_L3:
        if (!iterator.hasNext()) goto _L2; else goto _L1
_L1:
        Object obj4 = (BeanPropertyDefinition)iterator.next();
        if (((BeanPropertyDefinition) (obj4)).getConstructorParameter() != null)
        {
            AnnotatedParameter annotatedparameter = ((BeanPropertyDefinition) (obj4)).getConstructorParameter();
            Object obj = annotatedparameter.getOwner();
            if (obj instanceof AnnotatedConstructor)
            {
                Object obj3;
                Iterator iterator1;
                AnnotatedConstructor annotatedconstructor1;
                CreatorProperty acreatorproperty[];
                int i;
                int j;
                int k;
                int l;
                boolean flag;
                boolean flag1;
                if (obj2 == null)
                {
                    obj1 = (AnnotatedConstructor)obj;
                    obj = new PropertyName[((AnnotatedConstructor) (obj1)).getParameterCount()];
                } else
                {
                    obj = obj1;
                    obj1 = obj2;
                }
                obj[annotatedparameter.getIndex()] = ((BeanPropertyDefinition) (obj4)).getFullName();
                obj2 = obj1;
                obj1 = obj;
            }
        }
        if (true) goto _L3; else goto _L2
_L2:
        iterator1 = beandescription.getConstructors().iterator();
        do
        {
            if (!iterator1.hasNext())
            {
                break;
            }
            annotatedconstructor1 = (AnnotatedConstructor)iterator1.next();
            l = annotatedconstructor1.getParameterCount();
            if (annotationintrospector.hasCreatorAnnotation(annotatedconstructor1) || annotatedconstructor1 == obj2)
            {
                flag = true;
            } else
            {
                flag = false;
            }
            flag1 = visibilitychecker.isCreatorVisible(annotatedconstructor1);
            if (l == 1)
            {
                if (annotatedconstructor1 == obj2)
                {
                    obj = obj1[0];
                } else
                {
                    obj = null;
                }
                _handleSingleArgumentConstructor(deserializationcontext, beandescription, visibilitychecker, annotationintrospector, creatorcollector, annotatedconstructor1, flag, flag1, ((PropertyName) (obj)));
                continue;
            }
            if (!flag && !flag1)
            {
                continue;
            }
            obj = null;
            i = 0;
            k = 0;
            acreatorproperty = new CreatorProperty[l];
            j = 0;
            while (j < l) 
            {
                annotatedparameter = annotatedconstructor1.getParameter(j);
                obj3 = null;
                if (annotatedconstructor1 == obj2)
                {
                    obj3 = obj1[j];
                }
                obj4 = obj3;
                if (obj3 == null)
                {
                    obj4 = _findParamName(annotatedparameter, annotationintrospector);
                }
                obj3 = annotationintrospector.findInjectableValueId(annotatedparameter);
                if (obj4 != null && ((PropertyName) (obj4)).hasSimpleName())
                {
                    acreatorproperty[j] = constructCreatorProperty(deserializationcontext, beandescription, ((PropertyName) (obj4)), j, annotatedparameter, obj3);
                    i++;
                } else
                if (obj3 != null)
                {
                    k++;
                    acreatorproperty[j] = constructCreatorProperty(deserializationcontext, beandescription, ((PropertyName) (obj4)), j, annotatedparameter, obj3);
                } else
                if (annotationintrospector.findUnwrappingNameTransformer(annotatedparameter) != null)
                {
                    acreatorproperty[j] = constructCreatorProperty(deserializationcontext, beandescription, UNWRAPPED_CREATOR_PARAM_NAME, j, annotatedparameter, null);
                    i++;
                } else
                if (obj == null)
                {
                    obj = annotatedparameter;
                }
                j++;
            }
            if (flag || i > 0 || k > 0)
            {
                if (i + k == l)
                {
                    creatorcollector.addPropertyCreator(annotatedconstructor1, acreatorproperty);
                } else
                if (i == 0 && k + 1 == l)
                {
                    creatorcollector.addDelegatingCreator(annotatedconstructor1, acreatorproperty);
                } else
                {
                    creatorcollector.addIncompeteParameter(((AnnotatedParameter) (obj)));
                }
            }
        } while (true);
        return;
    }

    protected void _addDeserializerFactoryMethods(DeserializationContext deserializationcontext, BeanDescription beandescription, VisibilityChecker visibilitychecker, AnnotationIntrospector annotationintrospector, CreatorCollector creatorcollector)
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
            int j1 = annotatedmethod.getParameterCount();
            if (j1 == 0)
            {
                if (flag)
                {
                    creatorcollector.setDefaultCreator(annotatedmethod);
                }
                continue;
            }
            if (j1 == 1)
            {
                AnnotatedParameter annotatedparameter1 = annotatedmethod.getParameter(0);
                Object obj = _findParamName(annotatedparameter1, annotationintrospector);
                if (obj == null)
                {
                    obj = null;
                } else
                {
                    obj = ((PropertyName) (obj)).getSimpleName();
                }
                if (annotationintrospector.findInjectableValueId(annotatedparameter1) == null && (obj == null || ((String) (obj)).length() == 0))
                {
                    _handleSingleArgumentFactory(deserializationconfig, beandescription, visibilitychecker, annotationintrospector, creatorcollector, annotatedmethod, flag);
                    continue;
                }
            } else
            if (!annotationintrospector.hasCreatorAnnotation(annotatedmethod))
            {
                continue;
            }
            AnnotatedParameter annotatedparameter = null;
            CreatorProperty acreatorproperty[] = new CreatorProperty[j1];
            int l = 0;
            int k = 0;
            int j = 0;
            while (j < j1) 
            {
                AnnotatedParameter annotatedparameter2 = annotatedmethod.getParameter(j);
                PropertyName propertyname = _findParamName(annotatedparameter2, annotationintrospector);
                Object obj1 = annotationintrospector.findInjectableValueId(annotatedparameter2);
                int i;
                int i1;
                if (propertyname != null && propertyname.hasSimpleName())
                {
                    i = l + 1;
                    acreatorproperty[j] = constructCreatorProperty(deserializationcontext, beandescription, propertyname, j, annotatedparameter2, obj1);
                    annotatedparameter2 = annotatedparameter;
                    i1 = k;
                } else
                if (obj1 != null)
                {
                    i1 = k + 1;
                    acreatorproperty[j] = constructCreatorProperty(deserializationcontext, beandescription, propertyname, j, annotatedparameter2, obj1);
                    i = l;
                    annotatedparameter2 = annotatedparameter;
                } else
                if (annotationintrospector.findUnwrappingNameTransformer(annotatedparameter2) != null)
                {
                    acreatorproperty[j] = constructCreatorProperty(deserializationcontext, beandescription, UNWRAPPED_CREATOR_PARAM_NAME, j, annotatedparameter2, null);
                    i = l + 1;
                    i1 = k;
                    annotatedparameter2 = annotatedparameter;
                } else
                {
                    i1 = k;
                    i = l;
                    if (annotatedparameter != null)
                    {
                        i1 = k;
                        i = l;
                        annotatedparameter2 = annotatedparameter;
                    }
                }
                j++;
                annotatedparameter = annotatedparameter2;
                k = i1;
                l = i;
            }
            if (flag || l > 0 || k > 0)
            {
                if (l + k == j1)
                {
                    creatorcollector.addPropertyCreator(annotatedmethod, acreatorproperty);
                } else
                if (l == 0 && k + 1 == j1)
                {
                    creatorcollector.addDelegatingCreator(annotatedmethod, acreatorproperty);
                } else
                {
                    throw new IllegalArgumentException((new StringBuilder("Argument #")).append(annotatedparameter.getIndex()).append(" of factory method ").append(annotatedmethod).append(" has no property name annotation; must have name when multiple-parameter constructor annotated as Creator").toString());
                }
            }
        } while (true);
    }

    protected ValueInstantiator _constructDefaultValueInstantiator(DeserializationContext deserializationcontext, BeanDescription beandescription)
    {
        CreatorCollector creatorcollector = new CreatorCollector(beandescription, deserializationcontext.canOverrideAccessModifiers());
        AnnotationIntrospector annotationintrospector = deserializationcontext.getAnnotationIntrospector();
        DeserializationConfig deserializationconfig = deserializationcontext.getConfig();
        VisibilityChecker visibilitychecker = deserializationconfig.getDefaultVisibilityChecker();
        visibilitychecker = annotationintrospector.findAutoDetectVisibility(beandescription.getClassInfo(), visibilitychecker);
        _addDeserializerFactoryMethods(deserializationcontext, beandescription, visibilitychecker, annotationintrospector, creatorcollector);
        if (beandescription.getType().isConcrete())
        {
            _addDeserializerConstructors(deserializationcontext, beandescription, visibilitychecker, annotationintrospector, creatorcollector);
        }
        return creatorcollector.constructValueInstantiator(deserializationconfig);
    }

    protected JsonDeserializer _findCustomArrayDeserializer(ArrayType arraytype, DeserializationConfig deserializationconfig, BeanDescription beandescription, TypeDeserializer typedeserializer, JsonDeserializer jsondeserializer)
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

    protected JsonDeserializer _findCustomCollectionDeserializer(CollectionType collectiontype, DeserializationConfig deserializationconfig, BeanDescription beandescription, TypeDeserializer typedeserializer, JsonDeserializer jsondeserializer)
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

    protected PropertyName _findParamName(AnnotatedParameter annotatedparameter, AnnotationIntrospector annotationintrospector)
    {
        if (annotatedparameter != null && annotationintrospector != null)
        {
            PropertyName propertyname = annotationintrospector.findNameForDeserialization(annotatedparameter);
            if (propertyname != null)
            {
                return propertyname;
            }
            annotatedparameter = annotationintrospector.findImplicitPropertyName(annotatedparameter);
            if (annotatedparameter != null && !annotatedparameter.isEmpty())
            {
                return new PropertyName(annotatedparameter);
            }
        }
        return null;
    }

    protected boolean _handleSingleArgumentConstructor(DeserializationContext deserializationcontext, BeanDescription beandescription, VisibilityChecker visibilitychecker, AnnotationIntrospector annotationintrospector, CreatorCollector creatorcollector, AnnotatedConstructor annotatedconstructor, boolean flag, 
            boolean flag1, PropertyName propertyname)
    {
        AnnotatedParameter annotatedparameter = annotatedconstructor.getParameter(0);
        if (propertyname == null)
        {
            visibilitychecker = _findParamName(annotatedparameter, annotationintrospector);
        } else
        {
            visibilitychecker = propertyname;
        }
        annotationintrospector = ((AnnotationIntrospector) (annotationintrospector.findInjectableValueId(annotatedparameter)));
        if (annotationintrospector != null || visibilitychecker != null && visibilitychecker.hasSimpleName())
        {
            creatorcollector.addPropertyCreator(annotatedconstructor, new CreatorProperty[] {
                constructCreatorProperty(deserializationcontext, beandescription, visibilitychecker, 0, annotatedparameter, annotationintrospector)
            });
            return true;
        }
        deserializationcontext = annotatedconstructor.getRawParameterType(0);
        if (deserializationcontext == java/lang/String)
        {
            if (flag || flag1)
            {
                creatorcollector.addStringCreator(annotatedconstructor);
            }
            return true;
        }
        if (deserializationcontext == Integer.TYPE || deserializationcontext == java/lang/Integer)
        {
            if (flag || flag1)
            {
                creatorcollector.addIntCreator(annotatedconstructor);
            }
            return true;
        }
        if (deserializationcontext == Long.TYPE || deserializationcontext == java/lang/Long)
        {
            if (flag || flag1)
            {
                creatorcollector.addLongCreator(annotatedconstructor);
            }
            return true;
        }
        if (deserializationcontext == Double.TYPE || deserializationcontext == java/lang/Double)
        {
            if (flag || flag1)
            {
                creatorcollector.addDoubleCreator(annotatedconstructor);
            }
            return true;
        }
        if (deserializationcontext == Boolean.TYPE || deserializationcontext == java/lang/Boolean)
        {
            if (flag || flag1)
            {
                creatorcollector.addBooleanCreator(annotatedconstructor);
            }
            return true;
        }
        if (flag)
        {
            creatorcollector.addDelegatingCreator(annotatedconstructor, null);
            return true;
        } else
        {
            return false;
        }
    }

    protected boolean _handleSingleArgumentFactory(DeserializationConfig deserializationconfig, BeanDescription beandescription, VisibilityChecker visibilitychecker, AnnotationIntrospector annotationintrospector, CreatorCollector creatorcollector, AnnotatedMethod annotatedmethod, boolean flag)
    {
        deserializationconfig = annotatedmethod.getRawParameterType(0);
        if (deserializationconfig != java/lang/String) goto _L2; else goto _L1
_L1:
        if (flag || visibilitychecker.isCreatorVisible(annotatedmethod))
        {
            creatorcollector.addStringCreator(annotatedmethod);
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
            creatorcollector.addIntCreator(annotatedmethod);
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
            creatorcollector.addLongCreator(annotatedmethod);
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
            creatorcollector.addDoubleCreator(annotatedmethod);
            return true;
        }
        if (true) goto _L4; else goto _L6
_L6:
        if (deserializationconfig == Boolean.TYPE || deserializationconfig == java/lang/Boolean)
        {
            if (flag || visibilitychecker.isCreatorVisible(annotatedmethod))
            {
                creatorcollector.addBooleanCreator(annotatedmethod);
                return true;
            }
        } else
        if (annotationintrospector.hasCreatorAnnotation(annotatedmethod))
        {
            creatorcollector.addDelegatingCreator(annotatedmethod, null);
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
            throw new IllegalStateException((new StringBuilder("AnnotationIntrospector returned key deserializer definition of type ")).append(obj.getClass().getName()).append("; expected type KeyDeserializer or Class<KeyDeserializer> instead").toString());
        }
        obj = (Class)obj;
        if (ClassUtil.isBogusClass(((Class) (obj))))
        {
            return null;
        }
        if (!com/fasterxml/jackson/databind/deser/ValueInstantiator.isAssignableFrom(((Class) (obj))))
        {
            throw new IllegalStateException((new StringBuilder("AnnotationIntrospector returned Class ")).append(((Class) (obj)).getName()).append("; expected Class<ValueInstantiator>").toString());
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
    {
        DeserializationConfig deserializationconfig = deserializationcontext.getConfig();
        Object obj3 = deserializationcontext.getAnnotationIntrospector();
        Object obj1;
        Object obj2;
        PropertyMetadata propertymetadata;
        JavaType javatype;
        boolean flag;
        if (obj3 == null)
        {
            obj1 = null;
        } else
        {
            obj1 = ((AnnotationIntrospector) (obj3)).hasRequiredMarker(annotatedparameter);
        }
        if (obj1 != null && ((Boolean) (obj1)).booleanValue())
        {
            flag = true;
        } else
        {
            flag = false;
        }
        if (obj3 == null)
        {
            obj1 = null;
        } else
        {
            obj1 = ((AnnotationIntrospector) (obj3)).findPropertyDescription(annotatedparameter);
        }
        if (obj3 == null)
        {
            obj2 = null;
        } else
        {
            obj2 = ((AnnotationIntrospector) (obj3)).findPropertyIndex(annotatedparameter);
        }
        propertymetadata = PropertyMetadata.construct(flag, ((String) (obj1)), ((Integer) (obj2)));
        javatype = deserializationconfig.getTypeFactory().constructType(annotatedparameter.getParameterType(), beandescription.bindingsForBeanType());
        obj1 = new com.fasterxml.jackson.databind.BeanProperty.Std(propertyname, javatype, ((AnnotationIntrospector) (obj3)).findWrapperName(annotatedparameter), beandescription.getClassAnnotations(), annotatedparameter, propertymetadata);
        obj2 = resolveType(deserializationcontext, beandescription, javatype, annotatedparameter);
        if (obj2 != javatype)
        {
            obj1 = ((com.fasterxml.jackson.databind.BeanProperty.Std) (obj1)).withType(((JavaType) (obj2)));
        }
        obj3 = findDeserializerFromAnnotation(deserializationcontext, annotatedparameter);
        javatype = modifyTypeByAnnotation(deserializationcontext, annotatedparameter, ((JavaType) (obj2)));
        obj2 = (TypeDeserializer)javatype.getTypeHandler();
        if (obj2 == null)
        {
            obj2 = findTypeDeserializer(deserializationconfig, javatype);
        }
        propertyname = new CreatorProperty(propertyname, javatype, ((com.fasterxml.jackson.databind.BeanProperty.Std) (obj1)).getWrapperName(), ((TypeDeserializer) (obj2)), beandescription.getClassAnnotations(), annotatedparameter, i, obj, propertymetadata);
        beandescription = propertyname;
        if (obj3 != null)
        {
            beandescription = propertyname.withValueDeserializer(deserializationcontext.handlePrimaryContextualization(((JsonDeserializer) (obj3)), propertyname));
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
    {
        Object obj;
        JsonDeserializer jsondeserializer;
        DeserializationConfig deserializationconfig;
        JavaType javatype;
        JsonDeserializer jsondeserializer1;
        deserializationconfig = deserializationcontext.getConfig();
        javatype = arraytype.getContentType();
        jsondeserializer1 = (JsonDeserializer)javatype.getValueHandler();
        obj = (TypeDeserializer)javatype.getTypeHandler();
        if (obj == null)
        {
            obj = findTypeDeserializer(deserializationconfig, javatype);
        }
        jsondeserializer = _findCustomArrayDeserializer(arraytype, deserializationconfig, beandescription, ((TypeDeserializer) (obj)), jsondeserializer1);
        deserializationcontext = jsondeserializer;
        if (jsondeserializer != null) goto _L2; else goto _L1
_L1:
        if (jsondeserializer1 != null) goto _L4; else goto _L3
_L3:
        deserializationcontext = javatype.getRawClass();
        if (!javatype.isPrimitive()) goto _L6; else goto _L5
_L5:
        obj = PrimitiveArrayDeserializers.forType(deserializationcontext);
_L8:
        return ((JsonDeserializer) (obj));
_L6:
        if (deserializationcontext == java/lang/String)
        {
            return StringArrayDeserializer.instance;
        }
_L4:
        deserializationcontext = new ObjectArrayDeserializer(arraytype, jsondeserializer1, ((TypeDeserializer) (obj)));
_L2:
label0:
        {
            if (!_factoryConfig.hasDeserializerModifiers())
            {
                break label0;
            }
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
        if (true) goto _L8; else goto _L7
_L7:
        return deserializationcontext;
    }

    public JsonDeserializer createCollectionDeserializer(DeserializationContext deserializationcontext, CollectionType collectiontype, BeanDescription beandescription)
    {
        JavaType javatype = collectiontype.getContentType();
        JsonDeserializer jsondeserializer1 = (JsonDeserializer)javatype.getValueHandler();
        DeserializationConfig deserializationconfig = deserializationcontext.getConfig();
        TypeDeserializer typedeserializer = (TypeDeserializer)javatype.getTypeHandler();
        if (typedeserializer == null)
        {
            typedeserializer = findTypeDeserializer(deserializationconfig, javatype);
        }
        JsonDeserializer jsondeserializer = _findCustomCollectionDeserializer(collectiontype, deserializationconfig, beandescription, typedeserializer, jsondeserializer1);
        Object obj = jsondeserializer;
        if (jsondeserializer == null)
        {
            Class class1 = collectiontype.getRawClass();
            obj = jsondeserializer;
            if (jsondeserializer1 == null)
            {
                obj = jsondeserializer;
                if (java/util/EnumSet.isAssignableFrom(class1))
                {
                    obj = new EnumSetDeserializer(javatype, null);
                }
            }
        }
        Object obj2;
        BeanDescription beandescription1;
        if (obj == null)
        {
            Object obj1;
            if (collectiontype.isInterface() || collectiontype.isAbstract())
            {
                obj2 = _mapAbstractCollectionType(collectiontype, deserializationconfig);
                if (obj2 == null)
                {
                    if (collectiontype.getTypeHandler() == null)
                    {
                        throw new IllegalArgumentException((new StringBuilder("Can not find a deserializer for non-concrete Collection type ")).append(collectiontype).toString());
                    }
                    obj1 = AbstractDeserializer.constructForNonPOJO(beandescription);
                    obj = collectiontype;
                } else
                {
                    beandescription = deserializationconfig.introspectForCreation(((JavaType) (obj2)));
                    obj1 = obj;
                    obj = obj2;
                }
            } else
            {
                obj1 = obj;
                obj = collectiontype;
            }
            collectiontype = ((CollectionType) (obj1));
            obj2 = obj;
            beandescription1 = beandescription;
            if (obj1 == null)
            {
                deserializationcontext = findValueInstantiator(deserializationcontext, beandescription);
                if (!deserializationcontext.canCreateUsingDefault() && ((CollectionType) (obj)).getRawClass() == java/util/concurrent/ArrayBlockingQueue)
                {
                    return new ArrayBlockingQueueDeserializer(((JavaType) (obj)), jsondeserializer1, typedeserializer, deserializationcontext, null);
                }
                if (javatype.getRawClass() == java/lang/String)
                {
                    collectiontype = new StringCollectionDeserializer(((JavaType) (obj)), jsondeserializer1, deserializationcontext);
                    beandescription1 = beandescription;
                    obj2 = obj;
                } else
                {
                    collectiontype = new CollectionDeserializer(((JavaType) (obj)), jsondeserializer1, typedeserializer, deserializationcontext);
                    obj2 = obj;
                    beandescription1 = beandescription;
                }
            }
        } else
        {
            obj2 = collectiontype;
            collectiontype = ((CollectionType) (obj));
            beandescription1 = beandescription;
        }
        if (_factoryConfig.hasDeserializerModifiers())
        {
            beandescription = _factoryConfig.deserializerModifiers().iterator();
            deserializationcontext = collectiontype;
            do
            {
                collectiontype = deserializationcontext;
                if (!beandescription.hasNext())
                {
                    break;
                }
                deserializationcontext = ((BeanDeserializerModifier)beandescription.next()).modifyCollectionDeserializer(deserializationconfig, ((CollectionType) (obj2)), beandescription1, deserializationcontext);
            } while (true);
        }
        return collectiontype;
    }

    public JsonDeserializer createCollectionLikeDeserializer(DeserializationContext deserializationcontext, CollectionLikeType collectionliketype, BeanDescription beandescription)
    {
        JavaType javatype = collectionliketype.getContentType();
        Object obj = (JsonDeserializer)javatype.getValueHandler();
        DeserializationConfig deserializationconfig = deserializationcontext.getConfig();
        deserializationcontext = (TypeDeserializer)javatype.getTypeHandler();
        if (deserializationcontext == null)
        {
            deserializationcontext = findTypeDeserializer(deserializationconfig, javatype);
        }
        deserializationcontext = _findCustomCollectionLikeDeserializer(collectionliketype, deserializationconfig, beandescription, deserializationcontext, ((JsonDeserializer) (obj)));
        obj = deserializationcontext;
        if (deserializationcontext != null)
        {
            obj = deserializationcontext;
            if (_factoryConfig.hasDeserializerModifiers())
            {
                for (obj = _factoryConfig.deserializerModifiers().iterator(); ((Iterator) (obj)).hasNext();)
                {
                    deserializationcontext = ((BeanDeserializerModifier)((Iterator) (obj)).next()).modifyCollectionLikeDeserializer(deserializationconfig, collectionliketype, beandescription, deserializationcontext);
                }

                obj = deserializationcontext;
            }
        }
        return ((JsonDeserializer) (obj));
    }

    public JsonDeserializer createEnumDeserializer(DeserializationContext deserializationcontext, JavaType javatype, BeanDescription beandescription)
    {
        Object obj;
        DeserializationConfig deserializationconfig;
        Object obj1;
        deserializationconfig = deserializationcontext.getConfig();
        obj1 = javatype.getRawClass();
        obj = _findCustomEnumDeserializer(((Class) (obj1)), deserializationconfig, beandescription);
        if (obj != null) goto _L2; else goto _L1
_L1:
        Iterator iterator = beandescription.getFactoryMethods().iterator();
_L6:
        if (!iterator.hasNext()) goto _L4; else goto _L3
_L3:
        AnnotatedMethod annotatedmethod = (AnnotatedMethod)iterator.next();
        if (!deserializationcontext.getAnnotationIntrospector().hasCreatorAnnotation(annotatedmethod)) goto _L6; else goto _L5
_L5:
        if (annotatedmethod.getParameterCount() != 1 || !annotatedmethod.getRawReturnType().isAssignableFrom(((Class) (obj1)))) goto _L8; else goto _L7
_L7:
        obj = EnumDeserializer.deserializerForCreator(deserializationconfig, ((Class) (obj1)), annotatedmethod);
_L4:
        deserializationcontext = ((DeserializationContext) (obj));
        if (obj == null)
        {
            deserializationcontext = new EnumDeserializer(constructEnumResolver(((Class) (obj1)), deserializationconfig, beandescription.findJsonValueMethod()));
        }
        break MISSING_BLOCK_LABEL_134;
_L8:
        throw new IllegalArgumentException((new StringBuilder("Unsuitable method (")).append(annotatedmethod).append(") decorated with @JsonCreator (for Enum type ").append(((Class) (obj1)).getName()).append(")").toString());
_L10:
        if (_factoryConfig.hasDeserializerModifiers())
        {
            obj1 = _factoryConfig.deserializerModifiers().iterator();
            do
            {
                obj = deserializationcontext;
                if (!((Iterator) (obj1)).hasNext())
                {
                    break;
                }
                deserializationcontext = ((BeanDeserializerModifier)((Iterator) (obj1)).next()).modifyEnumDeserializer(deserializationconfig, javatype, beandescription, deserializationcontext);
            } while (true);
        } else
        {
            obj = deserializationcontext;
        }
        return ((JsonDeserializer) (obj));
_L2:
        deserializationcontext = ((DeserializationContext) (obj));
        if (true) goto _L10; else goto _L9
_L9:
    }

    public KeyDeserializer createKeyDeserializer(DeserializationContext deserializationcontext, JavaType javatype)
    {
        KeyDeserializer keydeserializer;
        KeyDeserializer keydeserializer2;
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
            Iterator iterator = _factoryConfig.keyDeserializers().iterator();
            keydeserializer = keydeserializer1;
            do
            {
                if (!iterator.hasNext())
                {
                    break label0;
                }
                keydeserializer1 = ((KeyDeserializers)iterator.next()).findKeyDeserializer(javatype, deserializationconfig, beandescription);
                keydeserializer = keydeserializer1;
            } while (keydeserializer1 == null);
            keydeserializer = keydeserializer1;
        }
        keydeserializer2 = keydeserializer;
        if (keydeserializer != null) goto _L2; else goto _L1
_L1:
        if (!javatype.isEnumType()) goto _L4; else goto _L3
_L3:
        deserializationcontext = _createEnumKeyDeserializer(deserializationcontext, javatype);
_L6:
        return deserializationcontext;
_L4:
        keydeserializer2 = StdKeyDeserializers.findStringBasedKeyDeserializer(deserializationconfig, javatype);
_L2:
        deserializationcontext = keydeserializer2;
        if (keydeserializer2 != null)
        {
            deserializationcontext = keydeserializer2;
            if (_factoryConfig.hasDeserializerModifiers())
            {
                for (deserializationcontext = _factoryConfig.deserializerModifiers().iterator(); deserializationcontext.hasNext();)
                {
                    keydeserializer2 = ((BeanDeserializerModifier)deserializationcontext.next()).modifyKeyDeserializer(deserializationconfig, javatype, keydeserializer2);
                }

                return keydeserializer2;
            }
        }
        if (true) goto _L6; else goto _L5
_L5:
    }

    public JsonDeserializer createMapDeserializer(DeserializationContext deserializationcontext, MapType maptype, BeanDescription beandescription)
    {
        Object obj;
        Object obj1;
        TypeDeserializer typedeserializer;
        Object obj2;
        DeserializationConfig deserializationconfig;
        JsonDeserializer jsondeserializer;
        KeyDeserializer keydeserializer;
        deserializationconfig = deserializationcontext.getConfig();
        obj2 = maptype.getKeyType();
        obj = maptype.getContentType();
        jsondeserializer = (JsonDeserializer)((JavaType) (obj)).getValueHandler();
        keydeserializer = (KeyDeserializer)((JavaType) (obj2)).getValueHandler();
        typedeserializer = (TypeDeserializer)((JavaType) (obj)).getTypeHandler();
        if (typedeserializer == null)
        {
            typedeserializer = findTypeDeserializer(deserializationconfig, ((JavaType) (obj)));
        }
        obj = _findCustomMapDeserializer(maptype, deserializationconfig, beandescription, keydeserializer, typedeserializer, jsondeserializer);
        obj1 = obj;
        if (obj != null) goto _L2; else goto _L1
_L1:
        Object obj3;
        obj3 = maptype.getRawClass();
        if (java/util/EnumMap.isAssignableFrom(((Class) (obj3))))
        {
            obj = ((JavaType) (obj2)).getRawClass();
            if (obj == null || !((Class) (obj)).isEnum())
            {
                throw new IllegalArgumentException("Can not construct EnumMap; generic (key) type not available");
            }
            obj = new EnumMapDeserializer(maptype, null, jsondeserializer, typedeserializer);
        }
        obj1 = obj;
        if (obj != null) goto _L2; else goto _L3
_L3:
        if (maptype.isInterface() || maptype.isAbstract())
        {
            obj1 = (Class)_mapFallbacks.get(((Class) (obj3)).getName());
            if (obj1 != null)
            {
                obj1 = (MapType)deserializationconfig.constructSpecializedType(maptype, ((Class) (obj1)));
                beandescription = deserializationconfig.introspectForCreation(((JavaType) (obj1)));
            } else
            {
                if (maptype.getTypeHandler() == null)
                {
                    throw new IllegalArgumentException((new StringBuilder("Can not find a deserializer for non-concrete Map type ")).append(maptype).toString());
                }
                obj = AbstractDeserializer.constructForNonPOJO(beandescription);
                obj1 = maptype;
            }
        } else
        {
            obj1 = maptype;
        }
        maptype = ((MapType) (obj));
        obj2 = obj1;
        obj3 = beandescription;
        if (obj == null)
        {
            maptype = new MapDeserializer(((JavaType) (obj1)), findValueInstantiator(deserializationcontext, beandescription), keydeserializer, jsondeserializer, typedeserializer);
            maptype.setIgnorableProperties(deserializationconfig.getAnnotationIntrospector().findPropertiesToIgnore(beandescription.getClassInfo()));
            obj3 = beandescription;
            obj2 = obj1;
        }
_L5:
        deserializationcontext = maptype;
        if (_factoryConfig.hasDeserializerModifiers())
        {
            beandescription = _factoryConfig.deserializerModifiers().iterator();
            do
            {
                deserializationcontext = maptype;
                if (!beandescription.hasNext())
                {
                    break;
                }
                maptype = ((BeanDeserializerModifier)beandescription.next()).modifyMapDeserializer(deserializationconfig, ((MapType) (obj2)), ((BeanDescription) (obj3)), maptype);
            } while (true);
        }
        return deserializationcontext;
_L2:
        obj2 = maptype;
        maptype = ((MapType) (obj1));
        obj3 = beandescription;
        if (true) goto _L5; else goto _L4
_L4:
    }

    public JsonDeserializer createMapLikeDeserializer(DeserializationContext deserializationcontext, MapLikeType mapliketype, BeanDescription beandescription)
    {
        Object obj1 = mapliketype.getKeyType();
        JavaType javatype = mapliketype.getContentType();
        DeserializationConfig deserializationconfig = deserializationcontext.getConfig();
        Object obj = (JsonDeserializer)javatype.getValueHandler();
        obj1 = (KeyDeserializer)((JavaType) (obj1)).getValueHandler();
        deserializationcontext = (TypeDeserializer)javatype.getTypeHandler();
        if (deserializationcontext == null)
        {
            deserializationcontext = findTypeDeserializer(deserializationconfig, javatype);
        }
        deserializationcontext = _findCustomMapLikeDeserializer(mapliketype, deserializationconfig, beandescription, ((KeyDeserializer) (obj1)), deserializationcontext, ((JsonDeserializer) (obj)));
        obj = deserializationcontext;
        if (deserializationcontext != null)
        {
            obj = deserializationcontext;
            if (_factoryConfig.hasDeserializerModifiers())
            {
                for (obj = _factoryConfig.deserializerModifiers().iterator(); ((Iterator) (obj)).hasNext();)
                {
                    deserializationcontext = ((BeanDeserializerModifier)((Iterator) (obj)).next()).modifyMapLikeDeserializer(deserializationconfig, mapliketype, beandescription, deserializationcontext);
                }

                obj = deserializationcontext;
            }
        }
        return ((JsonDeserializer) (obj));
    }

    public JsonDeserializer createTreeDeserializer(DeserializationConfig deserializationconfig, JavaType javatype, BeanDescription beandescription)
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
    {
        Object obj = javatype.getRawClass();
        if (obj != CLASS_OBJECT) goto _L2; else goto _L1
_L1:
        javatype = new UntypedObjectDeserializer();
_L4:
        return javatype;
_L2:
        if (obj == CLASS_STRING || obj == CLASS_CHAR_BUFFER)
        {
            return StringDeserializer.instance;
        }
        if (obj == CLASS_ITERABLE)
        {
            obj = deserializationcontext.getTypeFactory();
            if (javatype.containedTypeCount() > 0)
            {
                javatype = javatype.containedType(0);
            } else
            {
                javatype = TypeFactory.unknownType();
            }
            return createCollectionDeserializer(deserializationcontext, ((TypeFactory) (obj)).constructCollectionType(java/util/Collection, javatype), beandescription);
        }
        beandescription = ((Class) (obj)).getName();
        if (!((Class) (obj)).isPrimitive() && !beandescription.startsWith("java."))
        {
            break; /* Loop/switch isn't completed */
        }
        javatype = NumberDeserializers.find(((Class) (obj)), beandescription);
        deserializationcontext = javatype;
        if (javatype == null)
        {
            deserializationcontext = DateDeserializers.find(((Class) (obj)), beandescription);
        }
        javatype = deserializationcontext;
        if (deserializationcontext != null) goto _L4; else goto _L3
_L3:
        if (obj == com/fasterxml/jackson/databind/util/TokenBuffer)
        {
            return new TokenBufferDeserializer();
        } else
        {
            return JdkDeserializers.find(((Class) (obj)), beandescription);
        }
    }

    protected JsonDeserializer findDeserializerFromAnnotation(DeserializationContext deserializationcontext, Annotated annotated)
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

    public TypeDeserializer findPropertyContentTypeDeserializer(DeserializationConfig deserializationconfig, JavaType javatype, AnnotatedMember annotatedmember)
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
    {
        Collection collection = null;
        Object obj1 = deserializationconfig.introspectClassAnnotations(javatype.getRawClass()).getClassInfo();
        AnnotationIntrospector annotationintrospector = deserializationconfig.getAnnotationIntrospector();
        Object obj = annotationintrospector.findTypeResolver(deserializationconfig, ((com.fasterxml.jackson.databind.introspect.AnnotatedClass) (obj1)), javatype);
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
    {
        Object obj;
label0:
        {
            DeserializationConfig deserializationconfig = deserializationcontext.getConfig();
            Object obj1 = null;
            obj = beandescription.getClassInfo();
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
            if (!_factoryConfig.hasValueInstantiators())
            {
                break label0;
            }
            obj1 = _factoryConfig.valueInstantiators().iterator();
            deserializationcontext = ((DeserializationContext) (obj));
            do
            {
                obj = deserializationcontext;
                if (!((Iterator) (obj1)).hasNext())
                {
                    break label0;
                }
                obj2 = (ValueInstantiators)((Iterator) (obj1)).next();
                obj = ((ValueInstantiators) (obj2)).findValueInstantiator(deserializationconfig, beandescription, deserializationcontext);
                deserializationcontext = ((DeserializationContext) (obj));
            } while (obj != null);
            throw new JsonMappingException((new StringBuilder("Broken registered ValueInstantiators (of type ")).append(obj2.getClass().getName()).append("): returned null ValueInstantiator").toString());
        }
        if (((ValueInstantiator) (obj)).getIncompleteParameter() != null)
        {
            deserializationcontext = ((ValueInstantiator) (obj)).getIncompleteParameter();
            beandescription = deserializationcontext.getOwner();
            throw new IllegalArgumentException((new StringBuilder("Argument #")).append(deserializationcontext.getIndex()).append(" of constructor ").append(beandescription).append(" has no property name annotation; must have name when multiple-parameter constructor annotated as Creator").toString());
        } else
        {
            return ((ValueInstantiator) (obj));
        }
    }

    public JavaType mapAbstractType(DeserializationConfig deserializationconfig, JavaType javatype)
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
                throw new IllegalArgumentException((new StringBuilder("Invalid abstract type resolution from ")).append(javatype).append(" to ").append(javatype1).append(": latter is not a subtype of former").toString());
            }
            javatype = javatype1;
        } while (true);
    }

    protected JavaType modifyTypeByAnnotation(DeserializationContext deserializationcontext, Annotated annotated, JavaType javatype)
    {
        AnnotationIntrospector annotationintrospector = deserializationcontext.getAnnotationIntrospector();
        Object obj = annotationintrospector.findDeserializationType(annotated, javatype);
        if (obj != null)
        {
            JavaType javatype1;
            try
            {
                javatype1 = javatype.narrowBy(((Class) (obj)));
            }
            // Misplaced declaration of an exception variable
            catch (DeserializationContext deserializationcontext)
            {
                throw new JsonMappingException((new StringBuilder("Failed to narrow type ")).append(javatype).append(" with concrete-type annotation (value ").append(((Class) (obj)).getName()).append("), method '").append(annotated.getName()).append("': ").append(deserializationcontext.getMessage()).toString(), null, deserializationcontext);
            }
            javatype = javatype1;
        }
        if (javatype.isContainerType())
        {
            obj = annotationintrospector.findDeserializationKeyType(annotated, javatype.getKeyType());
            JavaType javatype2;
            if (obj != null)
            {
                if (!(javatype instanceof MapLikeType))
                {
                    throw new JsonMappingException((new StringBuilder("Illegal key-type annotation: type ")).append(javatype).append(" is not a Map(-like) type").toString());
                }
                try
                {
                    javatype2 = ((MapLikeType)javatype).narrowKey(((Class) (obj)));
                }
                // Misplaced declaration of an exception variable
                catch (DeserializationContext deserializationcontext)
                {
                    throw new JsonMappingException((new StringBuilder("Failed to narrow key type ")).append(javatype).append(" with key-type annotation (").append(((Class) (obj)).getName()).append("): ").append(deserializationcontext.getMessage()).toString(), null, deserializationcontext);
                }
            } else
            {
                javatype2 = javatype;
            }
            obj = javatype2.getKeyType();
            javatype = javatype2;
            if (obj != null)
            {
                javatype = javatype2;
                if (((JavaType) (obj)).getValueHandler() == null)
                {
                    obj = deserializationcontext.keyDeserializerInstance(annotated, annotationintrospector.findKeyDeserializer(annotated));
                    javatype = javatype2;
                    if (obj != null)
                    {
                        javatype = ((MapLikeType)javatype2).withKeyValueHandler(obj);
                        javatype.getKeyType();
                    }
                }
            }
            obj = annotationintrospector.findDeserializationContentType(annotated, javatype.getContentType());
            javatype2 = javatype;
            if (obj != null)
            {
                try
                {
                    javatype2 = javatype.narrowContentsBy(((Class) (obj)));
                }
                // Misplaced declaration of an exception variable
                catch (DeserializationContext deserializationcontext)
                {
                    throw new JsonMappingException((new StringBuilder("Failed to narrow content type ")).append(javatype).append(" with content-type annotation (").append(((Class) (obj)).getName()).append("): ").append(deserializationcontext.getMessage()).toString(), null, deserializationcontext);
                }
            }
            javatype = javatype2;
            if (javatype2.getContentType().getValueHandler() == null)
            {
                deserializationcontext = deserializationcontext.deserializerInstance(annotated, annotationintrospector.findContentDeserializer(annotated));
                javatype = javatype2;
                if (deserializationcontext != null)
                {
                    javatype = javatype2.withContentValueHandler(deserializationcontext);
                }
            }
            return javatype;
        } else
        {
            return javatype;
        }
    }

    protected JavaType resolveType(DeserializationContext deserializationcontext, BeanDescription beandescription, JavaType javatype, AnnotatedMember annotatedmember)
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
        HashMap hashmap = new HashMap();
        _mapFallbacks = hashmap;
        hashmap.put(java/util/Map.getName(), java/util/LinkedHashMap);
        _mapFallbacks.put(java/util/concurrent/ConcurrentMap.getName(), java/util/concurrent/ConcurrentHashMap);
        _mapFallbacks.put(java/util/SortedMap.getName(), java/util/TreeMap);
        _mapFallbacks.put("java.util.NavigableMap", java/util/TreeMap);
        try
        {
            _mapFallbacks.put(java/util/concurrent/ConcurrentNavigableMap.getName(), java/util/concurrent/ConcurrentSkipListMap);
        }
        catch (Throwable throwable)
        {
            System.err.println((new StringBuilder("Problems with (optional) types: ")).append(throwable).toString());
        }
        hashmap = new HashMap();
        _collectionFallbacks = hashmap;
        hashmap.put(java/util/Collection.getName(), java/util/ArrayList);
        _collectionFallbacks.put(java/util/List.getName(), java/util/ArrayList);
        _collectionFallbacks.put(java/util/Set.getName(), java/util/HashSet);
        _collectionFallbacks.put(java/util/SortedSet.getName(), java/util/TreeSet);
        _collectionFallbacks.put(java/util/Queue.getName(), java/util/LinkedList);
        _collectionFallbacks.put("java.util.Deque", java/util/LinkedList);
        _collectionFallbacks.put("java.util.NavigableSet", java/util/TreeSet);
    }
}
