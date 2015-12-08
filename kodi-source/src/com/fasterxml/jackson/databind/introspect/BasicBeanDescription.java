// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fasterxml.jackson.databind.introspect;

import com.fasterxml.jackson.databind.AnnotationIntrospector;
import com.fasterxml.jackson.databind.BeanDescription;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.cfg.HandlerInstantiator;
import com.fasterxml.jackson.databind.cfg.MapperConfig;
import com.fasterxml.jackson.databind.type.TypeBindings;
import com.fasterxml.jackson.databind.util.Annotations;
import com.fasterxml.jackson.databind.util.ClassUtil;
import com.fasterxml.jackson.databind.util.Converter;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

// Referenced classes of package com.fasterxml.jackson.databind.introspect:
//            POJOPropertiesCollector, AnnotatedMember, AnnotatedMethod, BeanPropertyDefinition, 
//            AnnotatedClass, AnnotatedConstructor, ObjectIdInfo

public class BasicBeanDescription extends BeanDescription
{

    protected final AnnotationIntrospector _annotationIntrospector;
    protected AnnotatedMember _anyGetter;
    protected AnnotatedMethod _anySetterMethod;
    protected TypeBindings _bindings;
    protected final AnnotatedClass _classInfo;
    protected final MapperConfig _config;
    protected Set _ignoredPropertyNames;
    protected Map _injectables;
    protected AnnotatedMethod _jsonValueMethod;
    protected ObjectIdInfo _objectIdInfo;
    protected final List _properties;

    protected BasicBeanDescription(MapperConfig mapperconfig, JavaType javatype, AnnotatedClass annotatedclass, List list)
    {
        super(javatype);
        _config = mapperconfig;
        if (mapperconfig == null)
        {
            mapperconfig = null;
        } else
        {
            mapperconfig = mapperconfig.getAnnotationIntrospector();
        }
        _annotationIntrospector = mapperconfig;
        _classInfo = annotatedclass;
        _properties = list;
    }

    protected BasicBeanDescription(POJOPropertiesCollector pojopropertiescollector)
    {
        this(pojopropertiescollector.getConfig(), pojopropertiescollector.getType(), pojopropertiescollector.getClassDef(), pojopropertiescollector.getProperties());
        _objectIdInfo = pojopropertiescollector.getObjectIdInfo();
    }

    public static BasicBeanDescription forDeserialization(POJOPropertiesCollector pojopropertiescollector)
    {
        BasicBeanDescription basicbeandescription = new BasicBeanDescription(pojopropertiescollector);
        basicbeandescription._anySetterMethod = pojopropertiescollector.getAnySetterMethod();
        basicbeandescription._ignoredPropertyNames = pojopropertiescollector.getIgnoredPropertyNames();
        basicbeandescription._injectables = pojopropertiescollector.getInjectables();
        basicbeandescription._jsonValueMethod = pojopropertiescollector.getJsonValueMethod();
        return basicbeandescription;
    }

    public static BasicBeanDescription forOtherUse(MapperConfig mapperconfig, JavaType javatype, AnnotatedClass annotatedclass)
    {
        return new BasicBeanDescription(mapperconfig, javatype, annotatedclass, Collections.emptyList());
    }

    public static BasicBeanDescription forSerialization(POJOPropertiesCollector pojopropertiescollector)
    {
        BasicBeanDescription basicbeandescription = new BasicBeanDescription(pojopropertiescollector);
        basicbeandescription._jsonValueMethod = pojopropertiescollector.getJsonValueMethod();
        basicbeandescription._anyGetter = pojopropertiescollector.getAnyGetter();
        return basicbeandescription;
    }

    public Converter _createConverter(Object obj)
    {
        Object obj1 = null;
        if (obj == null)
        {
            return null;
        }
        if (obj instanceof Converter)
        {
            return (Converter)obj;
        }
        if (!(obj instanceof Class))
        {
            throw new IllegalStateException((new StringBuilder()).append("AnnotationIntrospector returned Converter definition of type ").append(obj.getClass().getName()).append("; expected type Converter or Class<Converter> instead").toString());
        }
        Class class1 = (Class)obj;
        if (class1 == com/fasterxml/jackson/databind/util/Converter$None || ClassUtil.isBogusClass(class1))
        {
            return null;
        }
        if (!com/fasterxml/jackson/databind/util/Converter.isAssignableFrom(class1))
        {
            throw new IllegalStateException((new StringBuilder()).append("AnnotationIntrospector returned Class ").append(class1.getName()).append("; expected Class<Converter>").toString());
        }
        obj = _config.getHandlerInstantiator();
        if (obj == null)
        {
            obj = obj1;
        } else
        {
            obj = ((HandlerInstantiator) (obj)).converterInstance(_config, _classInfo, class1);
        }
        obj1 = obj;
        if (obj == null)
        {
            obj1 = (Converter)ClassUtil.createInstance(class1, _config.canOverrideAccessModifiers());
        }
        return ((Converter) (obj1));
    }

    public TypeBindings bindingsForBeanType()
    {
        if (_bindings == null)
        {
            _bindings = new TypeBindings(_config.getTypeFactory(), _type);
        }
        return _bindings;
    }

    public AnnotatedMember findAnyGetter()
        throws IllegalArgumentException
    {
        if (_anyGetter != null && !java/util/Map.isAssignableFrom(_anyGetter.getRawType()))
        {
            throw new IllegalArgumentException((new StringBuilder()).append("Invalid 'any-getter' annotation on method ").append(_anyGetter.getName()).append("(): return type is not instance of java.util.Map").toString());
        } else
        {
            return _anyGetter;
        }
    }

    public AnnotatedMethod findAnySetter()
        throws IllegalArgumentException
    {
        if (_anySetterMethod != null)
        {
            Class class1 = _anySetterMethod.getRawParameterType(0);
            if (class1 != java/lang/String && class1 != java/lang/Object)
            {
                throw new IllegalArgumentException((new StringBuilder()).append("Invalid 'any-setter' annotation on method ").append(_anySetterMethod.getName()).append("(): first argument not of type String or Object, but ").append(class1.getName()).toString());
            }
        }
        return _anySetterMethod;
    }

    public Map findBackReferenceProperties()
    {
        HashMap hashmap = null;
        for (Iterator iterator = _properties.iterator(); iterator.hasNext();)
        {
            AnnotatedMember annotatedmember = ((BeanPropertyDefinition)iterator.next()).getMutator();
            if (annotatedmember != null)
            {
                Object obj = _annotationIntrospector.findReferenceType(annotatedmember);
                if (obj != null && ((com.fasterxml.jackson.databind.AnnotationIntrospector.ReferenceProperty) (obj)).isBackReference())
                {
                    HashMap hashmap1 = hashmap;
                    if (hashmap == null)
                    {
                        hashmap1 = new HashMap();
                    }
                    obj = ((com.fasterxml.jackson.databind.AnnotationIntrospector.ReferenceProperty) (obj)).getName();
                    hashmap = hashmap1;
                    if (hashmap1.put(obj, annotatedmember) != null)
                    {
                        throw new IllegalArgumentException((new StringBuilder()).append("Multiple back-reference properties with name '").append(((String) (obj))).append("'").toString());
                    }
                }
            }
        }

        return hashmap;
    }

    public AnnotatedConstructor findDefaultConstructor()
    {
        return _classInfo.getDefaultConstructor();
    }

    public Converter findDeserializationConverter()
    {
        if (_annotationIntrospector == null)
        {
            return null;
        } else
        {
            return _createConverter(_annotationIntrospector.findDeserializationConverter(_classInfo));
        }
    }

    public com.fasterxml.jackson.annotation.JsonFormat.Value findExpectedFormat(com.fasterxml.jackson.annotation.JsonFormat.Value value)
    {
        if (_annotationIntrospector != null)
        {
            com.fasterxml.jackson.annotation.JsonFormat.Value value1 = _annotationIntrospector.findFormat(_classInfo);
            if (value1 != null)
            {
                return value1;
            }
        }
        return value;
    }

    public transient Method findFactoryMethod(Class aclass[])
    {
        Iterator iterator = _classInfo.getStaticMethods().iterator();
        do
        {
            if (!iterator.hasNext())
            {
                break;
            }
            AnnotatedMethod annotatedmethod = (AnnotatedMethod)iterator.next();
            if (isFactoryMethod(annotatedmethod))
            {
                Class class1 = annotatedmethod.getRawParameterType(0);
                int j = aclass.length;
                int i = 0;
                while (i < j) 
                {
                    if (class1.isAssignableFrom(aclass[i]))
                    {
                        return annotatedmethod.getAnnotated();
                    }
                    i++;
                }
            }
        } while (true);
        return null;
    }

    public Map findInjectables()
    {
        return _injectables;
    }

    public AnnotatedMethod findJsonValueMethod()
    {
        return _jsonValueMethod;
    }

    public AnnotatedMethod findMethod(String s, Class aclass[])
    {
        return _classInfo.findMethod(s, aclass);
    }

    public Class findPOJOBuilder()
    {
        if (_annotationIntrospector == null)
        {
            return null;
        } else
        {
            return _annotationIntrospector.findPOJOBuilder(_classInfo);
        }
    }

    public com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder.Value findPOJOBuilderConfig()
    {
        if (_annotationIntrospector == null)
        {
            return null;
        } else
        {
            return _annotationIntrospector.findPOJOBuilderConfig(_classInfo);
        }
    }

    public List findProperties()
    {
        return _properties;
    }

    public Converter findSerializationConverter()
    {
        if (_annotationIntrospector == null)
        {
            return null;
        } else
        {
            return _createConverter(_annotationIntrospector.findSerializationConverter(_classInfo));
        }
    }

    public com.fasterxml.jackson.annotation.JsonInclude.Include findSerializationInclusion(com.fasterxml.jackson.annotation.JsonInclude.Include include)
    {
        if (_annotationIntrospector == null)
        {
            return include;
        } else
        {
            return _annotationIntrospector.findSerializationInclusion(_classInfo, include);
        }
    }

    public com.fasterxml.jackson.annotation.JsonInclude.Include findSerializationInclusionForContent(com.fasterxml.jackson.annotation.JsonInclude.Include include)
    {
        if (_annotationIntrospector == null)
        {
            return include;
        } else
        {
            return _annotationIntrospector.findSerializationInclusionForContent(_classInfo, include);
        }
    }

    public transient Constructor findSingleArgConstructor(Class aclass[])
    {
        Iterator iterator = _classInfo.getConstructors().iterator();
        do
        {
            if (!iterator.hasNext())
            {
                break;
            }
            AnnotatedConstructor annotatedconstructor = (AnnotatedConstructor)iterator.next();
            if (annotatedconstructor.getParameterCount() == 1)
            {
                Class class1 = annotatedconstructor.getRawParameterType(0);
                int j = aclass.length;
                int i = 0;
                while (i < j) 
                {
                    if (aclass[i] == class1)
                    {
                        return annotatedconstructor.getAnnotated();
                    }
                    i++;
                }
            }
        } while (true);
        return null;
    }

    public Annotations getClassAnnotations()
    {
        return _classInfo.getAnnotations();
    }

    public AnnotatedClass getClassInfo()
    {
        return _classInfo;
    }

    public List getConstructors()
    {
        return _classInfo.getConstructors();
    }

    public List getFactoryMethods()
    {
        Object obj = _classInfo.getStaticMethods();
        if (((List) (obj)).isEmpty())
        {
            return ((List) (obj));
        }
        ArrayList arraylist = new ArrayList();
        obj = ((List) (obj)).iterator();
        do
        {
            if (!((Iterator) (obj)).hasNext())
            {
                break;
            }
            AnnotatedMethod annotatedmethod = (AnnotatedMethod)((Iterator) (obj)).next();
            if (isFactoryMethod(annotatedmethod))
            {
                arraylist.add(annotatedmethod);
            }
        } while (true);
        return arraylist;
    }

    public Set getIgnoredPropertyNames()
    {
        if (_ignoredPropertyNames == null)
        {
            return Collections.emptySet();
        } else
        {
            return _ignoredPropertyNames;
        }
    }

    public ObjectIdInfo getObjectIdInfo()
    {
        return _objectIdInfo;
    }

    public boolean hasKnownClassAnnotations()
    {
        return _classInfo.hasAnnotations();
    }

    public Object instantiateBean(boolean flag)
    {
        Object obj = _classInfo.getDefaultConstructor();
        if (obj == null)
        {
            return null;
        }
        if (flag)
        {
            ((AnnotatedConstructor) (obj)).fixAccess();
        }
        try
        {
            obj = ((AnnotatedConstructor) (obj)).getAnnotated().newInstance(new Object[0]);
        }
        catch (Object obj1)
        {
            for (; ((Throwable) (obj1)).getCause() != null; obj1 = ((Throwable) (obj1)).getCause()) { }
            if (obj1 instanceof Error)
            {
                throw (Error)obj1;
            }
            if (obj1 instanceof RuntimeException)
            {
                throw (RuntimeException)obj1;
            } else
            {
                throw new IllegalArgumentException((new StringBuilder()).append("Failed to instantiate bean of type ").append(_classInfo.getAnnotated().getName()).append(": (").append(obj1.getClass().getName()).append(") ").append(((Throwable) (obj1)).getMessage()).toString(), ((Throwable) (obj1)));
            }
        }
        return obj;
    }

    protected boolean isFactoryMethod(AnnotatedMethod annotatedmethod)
    {
        Class class1 = annotatedmethod.getRawReturnType();
        if (getBeanClass().isAssignableFrom(class1))
        {
            if (_annotationIntrospector.hasCreatorAnnotation(annotatedmethod))
            {
                return true;
            }
            String s = annotatedmethod.getName();
            if ("valueOf".equals(s))
            {
                return true;
            }
            if ("fromString".equals(s) && 1 == annotatedmethod.getParameterCount())
            {
                annotatedmethod = annotatedmethod.getRawParameterType(0);
                if (annotatedmethod == java/lang/String || java/lang/CharSequence.isAssignableFrom(annotatedmethod))
                {
                    return true;
                }
            }
        }
        return false;
    }

    public boolean removeProperty(String s)
    {
        for (Iterator iterator = _properties.iterator(); iterator.hasNext();)
        {
            if (((BeanPropertyDefinition)iterator.next()).getName().equals(s))
            {
                iterator.remove();
                return true;
            }
        }

        return false;
    }

    public JavaType resolveType(Type type)
    {
        if (type == null)
        {
            return null;
        } else
        {
            return bindingsForBeanType().resolveType(type);
        }
    }
}
