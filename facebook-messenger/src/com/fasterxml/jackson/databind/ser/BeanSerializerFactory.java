// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fasterxml.jackson.databind.ser;

import com.fasterxml.jackson.annotation.ObjectIdGenerator;
import com.fasterxml.jackson.databind.AnnotationIntrospector;
import com.fasterxml.jackson.databind.BeanDescription;
import com.fasterxml.jackson.databind.BeanProperty;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.JsonSerializer;
import com.fasterxml.jackson.databind.MapperFeature;
import com.fasterxml.jackson.databind.SerializationConfig;
import com.fasterxml.jackson.databind.SerializerProvider;
import com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig;
import com.fasterxml.jackson.databind.introspect.AnnotatedField;
import com.fasterxml.jackson.databind.introspect.AnnotatedMember;
import com.fasterxml.jackson.databind.introspect.AnnotatedMethod;
import com.fasterxml.jackson.databind.introspect.BeanPropertyDefinition;
import com.fasterxml.jackson.databind.introspect.ObjectIdInfo;
import com.fasterxml.jackson.databind.jsontype.SubtypeResolver;
import com.fasterxml.jackson.databind.jsontype.TypeResolverBuilder;
import com.fasterxml.jackson.databind.jsontype.TypeSerializer;
import com.fasterxml.jackson.databind.ser.impl.FilteredBeanPropertyWriter;
import com.fasterxml.jackson.databind.ser.impl.ObjectIdWriter;
import com.fasterxml.jackson.databind.ser.impl.PropertyBasedObjectIdGenerator;
import com.fasterxml.jackson.databind.ser.std.MapSerializer;
import com.fasterxml.jackson.databind.type.TypeBindings;
import com.fasterxml.jackson.databind.type.TypeFactory;
import com.fasterxml.jackson.databind.util.ArrayBuilders;
import com.fasterxml.jackson.databind.util.ClassUtil;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

// Referenced classes of package com.fasterxml.jackson.databind.ser:
//            BasicSerializerFactory, PropertyBuilder, ResolvableSerializer, ContextualSerializer, 
//            BeanSerializerModifier, BeanSerializerBuilder, AnyGetterWriter, BeanPropertyWriter, 
//            Serializers, SerializerFactory

public class BeanSerializerFactory extends BasicSerializerFactory
{

    public static final BeanSerializerFactory instance = new BeanSerializerFactory(null);

    protected BeanSerializerFactory(SerializerFactoryConfig serializerfactoryconfig)
    {
        super(serializerfactoryconfig);
    }

    protected BeanPropertyWriter _constructWriter(SerializerProvider serializerprovider, BeanPropertyDefinition beanpropertydefinition, TypeBindings typebindings, PropertyBuilder propertybuilder, boolean flag, AnnotatedMember annotatedmember)
    {
        Object obj = beanpropertydefinition.getName();
        if (serializerprovider.canOverrideAccessModifiers())
        {
            annotatedmember.fixAccess();
        }
        JavaType javatype = annotatedmember.getType(typebindings);
        com.fasterxml.jackson.databind.BeanProperty.Std std = new com.fasterxml.jackson.databind.BeanProperty.Std(((String) (obj)), javatype, propertybuilder.getClassAnnotations(), annotatedmember);
        typebindings = findSerializerFromAnnotation(serializerprovider, annotatedmember);
        if (typebindings instanceof ResolvableSerializer)
        {
            ((ResolvableSerializer)typebindings).resolve(serializerprovider);
        }
        if (typebindings instanceof ContextualSerializer)
        {
            typebindings = ((ContextualSerializer)typebindings).createContextual(serializerprovider, std);
        }
        obj = null;
        if (ClassUtil.isCollectionMapOrArray(javatype.getRawClass()))
        {
            obj = findPropertyContentTypeSerializer(javatype, serializerprovider.getConfig(), annotatedmember);
        }
        return propertybuilder.buildWriter(beanpropertydefinition, javatype, typebindings, findPropertyTypeSerializer(javatype, serializerprovider.getConfig(), annotatedmember, std), ((TypeSerializer) (obj)), annotatedmember, flag);
    }

    protected JsonSerializer constructBeanSerializer(SerializerProvider serializerprovider, BeanDescription beandescription, BeanProperty beanproperty)
    {
        if (beandescription.getBeanClass() == java/lang/Object)
        {
            throw new IllegalArgumentException("Can not create bean serializer for Object.class");
        }
        SerializationConfig serializationconfig = serializerprovider.getConfig();
        Object obj = constructBeanSerializerBuilder(beandescription);
        Object obj1 = findBeanProperties(serializerprovider, beandescription, ((BeanSerializerBuilder) (obj)));
        beanproperty = ((BeanProperty) (obj1));
        if (obj1 == null)
        {
            beanproperty = new ArrayList();
        }
        if (_factoryConfig.hasSerializerModifiers())
        {
            Iterator iterator1 = _factoryConfig.serializerModifiers().iterator();
            do
            {
                obj1 = beanproperty;
                if (!iterator1.hasNext())
                {
                    break;
                }
                beanproperty = ((BeanSerializerModifier)iterator1.next()).changeProperties(serializationconfig, beandescription, beanproperty);
            } while (true);
        } else
        {
            obj1 = beanproperty;
        }
        beanproperty = filterBeanProperties(serializationconfig, beandescription, ((List) (obj1)));
        if (_factoryConfig.hasSerializerModifiers())
        {
            Iterator iterator2 = _factoryConfig.serializerModifiers().iterator();
            do
            {
                obj1 = beanproperty;
                if (!iterator2.hasNext())
                {
                    break;
                }
                beanproperty = ((BeanSerializerModifier)iterator2.next()).orderProperties(serializationconfig, beandescription, beanproperty);
            } while (true);
        } else
        {
            obj1 = beanproperty;
        }
        ((BeanSerializerBuilder) (obj)).setObjectIdWriter(constructObjectIdHandler(serializerprovider, beandescription, ((List) (obj1))));
        ((BeanSerializerBuilder) (obj)).setProperties(((List) (obj1)));
        ((BeanSerializerBuilder) (obj)).setFilterId(findFilterId(serializationconfig, beandescription));
        serializerprovider = beandescription.findAnyGetter();
        if (serializerprovider != null)
        {
            if (serializationconfig.canOverrideAccessModifiers())
            {
                serializerprovider.fixAccess();
            }
            Object obj2 = serializerprovider.getType(beandescription.bindingsForBeanType());
            boolean flag = serializationconfig.isEnabled(MapperFeature.USE_STATIC_TYPING);
            beanproperty = ((JavaType) (obj2)).getContentType();
            obj2 = MapSerializer.construct(null, ((JavaType) (obj2)), flag, createTypeSerializer(serializationconfig, beanproperty), null, null);
            ((BeanSerializerBuilder) (obj)).setAnyGetter(new AnyGetterWriter(new com.fasterxml.jackson.databind.BeanProperty.Std(serializerprovider.getName(), beanproperty, beandescription.getClassAnnotations(), serializerprovider), serializerprovider, ((MapSerializer) (obj2))));
        }
        processViews(serializationconfig, ((BeanSerializerBuilder) (obj)));
        if (_factoryConfig.hasSerializerModifiers())
        {
            Iterator iterator = _factoryConfig.serializerModifiers().iterator();
            serializerprovider = ((SerializerProvider) (obj));
            do
            {
                beanproperty = serializerprovider;
                if (!iterator.hasNext())
                {
                    break;
                }
                serializerprovider = ((BeanSerializerModifier)iterator.next()).updateBuilder(serializationconfig, beandescription, serializerprovider);
            } while (true);
        } else
        {
            beanproperty = ((BeanProperty) (obj));
        }
        obj = beanproperty.build();
        serializerprovider = ((SerializerProvider) (obj));
        if (obj == null)
        {
            serializerprovider = ((SerializerProvider) (obj));
            if (beandescription.hasKnownClassAnnotations())
            {
                serializerprovider = beanproperty.createDummy();
            }
        }
        return serializerprovider;
    }

    protected BeanSerializerBuilder constructBeanSerializerBuilder(BeanDescription beandescription)
    {
        return new BeanSerializerBuilder(beandescription);
    }

    protected BeanPropertyWriter constructFilteredBeanWriter(BeanPropertyWriter beanpropertywriter, Class aclass[])
    {
        return FilteredBeanPropertyWriter.constructViewBased(beanpropertywriter, aclass);
    }

    protected ObjectIdWriter constructObjectIdHandler(SerializerProvider serializerprovider, BeanDescription beandescription, List list)
    {
        ObjectIdInfo objectidinfo = beandescription.getObjectIdInfo();
        if (objectidinfo == null)
        {
            return null;
        }
        Object obj = objectidinfo.getGeneratorType();
        if (obj == com/fasterxml/jackson/annotation/ObjectIdGenerators$PropertyGenerator)
        {
            serializerprovider = objectidinfo.getPropertyName();
            int j = list.size();
            int i = 0;
            do
            {
                if (i == j)
                {
                    throw new IllegalArgumentException((new StringBuilder()).append("Invalid Object Id definition for ").append(beandescription.getBeanClass().getName()).append(": can not find property with name '").append(serializerprovider).append("'").toString());
                }
                obj = (BeanPropertyWriter)list.get(i);
                if (serializerprovider.equals(((BeanPropertyWriter) (obj)).getName()))
                {
                    if (i > 0)
                    {
                        list.remove(i);
                        list.add(0, obj);
                    }
                    return ObjectIdWriter.construct(((BeanPropertyWriter) (obj)).getType(), null, new PropertyBasedObjectIdGenerator(objectidinfo, ((BeanPropertyWriter) (obj))));
                }
                i++;
            } while (true);
        } else
        {
            list = serializerprovider.constructType(((java.lang.reflect.Type) (obj)));
            list = serializerprovider.getTypeFactory().findTypeParameters(list, com/fasterxml/jackson/annotation/ObjectIdGenerator)[0];
            serializerprovider = serializerprovider.objectIdGeneratorInstance(beandescription.getClassInfo(), objectidinfo);
            return ObjectIdWriter.construct(list, objectidinfo.getPropertyName(), serializerprovider);
        }
    }

    protected PropertyBuilder constructPropertyBuilder(SerializationConfig serializationconfig, BeanDescription beandescription)
    {
        return new PropertyBuilder(serializationconfig, beandescription);
    }

    public JsonSerializer createSerializer(SerializerProvider serializerprovider, JavaType javatype, BeanProperty beanproperty)
    {
        SerializationConfig serializationconfig = serializerprovider.getConfig();
        BeanDescription beandescription = serializationconfig.introspect(javatype);
        Object obj = findSerializerFromAnnotation(serializerprovider, beandescription.getClassInfo());
        if (obj == null)
        {
            JavaType javatype1 = modifyTypeByAnnotation(serializationconfig, beandescription.getClassInfo(), javatype);
            JsonSerializer jsonserializer1;
            boolean flag;
            if (javatype1 == javatype)
            {
                flag = false;
            } else
            if (javatype1.getRawClass() != javatype.getRawClass())
            {
                beandescription = serializationconfig.introspect(javatype1);
                flag = true;
            } else
            {
                flag = true;
            }
            for (obj = _factoryConfig.serializers().iterator(); ((Iterator) (obj)).hasNext();)
            {
                JsonSerializer jsonserializer = ((Serializers)((Iterator) (obj)).next()).findSerializer(serializationconfig, javatype1, beandescription);
                if (jsonserializer != null)
                {
                    return jsonserializer;
                }
            }

            jsonserializer1 = findSerializerByAnnotations(serializerprovider, javatype1, beandescription);
            obj = jsonserializer1;
            if (jsonserializer1 == null)
            {
                if (javatype.isContainerType())
                {
                    if (!flag)
                    {
                        flag = usesStaticTyping(serializationconfig, beandescription, null, beanproperty);
                    }
                    return buildContainerSerializer(serializerprovider, javatype1, beandescription, beanproperty, flag);
                }
                javatype = findSerializerByLookup(javatype1, serializationconfig, beandescription, flag);
                obj = javatype;
                if (javatype == null)
                {
                    javatype = findSerializerByPrimaryType(serializerprovider, javatype1, beandescription, flag);
                    obj = javatype;
                    if (javatype == null)
                    {
                        serializerprovider = findBeanSerializer(serializerprovider, javatype1, beandescription, beanproperty);
                        obj = serializerprovider;
                        if (serializerprovider == null)
                        {
                            return findSerializerByAddonType(serializationconfig, javatype1, beandescription, flag);
                        }
                    }
                }
            }
        }
        return ((JsonSerializer) (obj));
    }

    protected Iterable customSerializers()
    {
        return _factoryConfig.serializers();
    }

    protected List filterBeanProperties(SerializationConfig serializationconfig, BeanDescription beandescription, List list)
    {
        serializationconfig = serializationconfig.getAnnotationIntrospector().findPropertiesToIgnore(beandescription.getClassInfo());
        if (serializationconfig != null && serializationconfig.length > 0)
        {
            serializationconfig = ArrayBuilders.arrayToSet(serializationconfig);
            beandescription = list.iterator();
            do
            {
                if (!beandescription.hasNext())
                {
                    break;
                }
                if (serializationconfig.contains(((BeanPropertyWriter)beandescription.next()).getName()))
                {
                    beandescription.remove();
                }
            } while (true);
        }
        return list;
    }

    protected List findBeanProperties(SerializerProvider serializerprovider, BeanDescription beandescription, BeanSerializerBuilder beanserializerbuilder)
    {
        Object obj = beandescription.findProperties();
        SerializationConfig serializationconfig = serializerprovider.getConfig();
        removeIgnorableTypes(serializationconfig, beandescription, ((List) (obj)));
        if (serializationconfig.isEnabled(MapperFeature.REQUIRE_SETTERS_FOR_GETTERS))
        {
            removeSetterlessGetters(serializationconfig, beandescription, ((List) (obj)));
        }
        if (((List) (obj)).isEmpty())
        {
            return null;
        }
        boolean flag = usesStaticTyping(serializationconfig, beandescription, null, null);
        PropertyBuilder propertybuilder = constructPropertyBuilder(serializationconfig, beandescription);
        ArrayList arraylist = new ArrayList(((List) (obj)).size());
        beandescription = beandescription.bindingsForBeanType();
        obj = ((List) (obj)).iterator();
        do
        {
            if (!((Iterator) (obj)).hasNext())
            {
                break;
            }
            BeanPropertyDefinition beanpropertydefinition = (BeanPropertyDefinition)((Iterator) (obj)).next();
            AnnotatedMember annotatedmember = beanpropertydefinition.getAccessor();
            if (beanpropertydefinition.isTypeId())
            {
                if (annotatedmember != null)
                {
                    if (serializationconfig.canOverrideAccessModifiers())
                    {
                        annotatedmember.fixAccess();
                    }
                    beanserializerbuilder.setTypeId(annotatedmember);
                }
            } else
            {
                com.fasterxml.jackson.databind.AnnotationIntrospector.ReferenceProperty referenceproperty = beanpropertydefinition.findReferenceType();
                if (referenceproperty == null || !referenceproperty.isBackReference())
                {
                    if (annotatedmember instanceof AnnotatedMethod)
                    {
                        arraylist.add(_constructWriter(serializerprovider, beanpropertydefinition, beandescription, propertybuilder, flag, (AnnotatedMethod)annotatedmember));
                    } else
                    {
                        arraylist.add(_constructWriter(serializerprovider, beanpropertydefinition, beandescription, propertybuilder, flag, (AnnotatedField)annotatedmember));
                    }
                }
            }
        } while (true);
        return arraylist;
    }

    public JsonSerializer findBeanSerializer(SerializerProvider serializerprovider, JavaType javatype, BeanDescription beandescription, BeanProperty beanproperty)
    {
        if (isPotentialBeanType(javatype.getRawClass())) goto _L2; else goto _L1
_L1:
        beanproperty = null;
_L4:
        return beanproperty;
_L2:
label0:
        {
            javatype = constructBeanSerializer(serializerprovider, beandescription, beanproperty);
            if (!_factoryConfig.hasSerializerModifiers())
            {
                break label0;
            }
            Iterator iterator = _factoryConfig.serializerModifiers().iterator();
            do
            {
                beanproperty = javatype;
                if (!iterator.hasNext())
                {
                    break;
                }
                javatype = ((BeanSerializerModifier)iterator.next()).modifySerializer(serializerprovider.getConfig(), beandescription, javatype);
            } while (true);
        }
        if (true) goto _L4; else goto _L3
_L3:
        return javatype;
    }

    protected Object findFilterId(SerializationConfig serializationconfig, BeanDescription beandescription)
    {
        return serializationconfig.getAnnotationIntrospector().findFilterId(beandescription.getClassInfo());
    }

    public TypeSerializer findPropertyContentTypeSerializer(JavaType javatype, SerializationConfig serializationconfig, AnnotatedMember annotatedmember)
    {
        JavaType javatype1 = javatype.getContentType();
        AnnotationIntrospector annotationintrospector = serializationconfig.getAnnotationIntrospector();
        javatype = annotationintrospector.findPropertyContentTypeResolver(serializationconfig, annotatedmember, javatype);
        if (javatype == null)
        {
            return createTypeSerializer(serializationconfig, javatype1);
        } else
        {
            return javatype.buildTypeSerializer(serializationconfig, javatype1, serializationconfig.getSubtypeResolver().collectAndResolveSubtypes(annotatedmember, serializationconfig, annotationintrospector));
        }
    }

    public TypeSerializer findPropertyTypeSerializer(JavaType javatype, SerializationConfig serializationconfig, AnnotatedMember annotatedmember, BeanProperty beanproperty)
    {
        beanproperty = serializationconfig.getAnnotationIntrospector();
        TypeResolverBuilder typeresolverbuilder = beanproperty.findPropertyTypeResolver(serializationconfig, annotatedmember, javatype);
        if (typeresolverbuilder == null)
        {
            return createTypeSerializer(serializationconfig, javatype);
        } else
        {
            return typeresolverbuilder.buildTypeSerializer(serializationconfig, javatype, serializationconfig.getSubtypeResolver().collectAndResolveSubtypes(annotatedmember, serializationconfig, beanproperty));
        }
    }

    protected boolean isPotentialBeanType(Class class1)
    {
        return ClassUtil.canBeABeanType(class1) == null && !ClassUtil.isProxyType(class1);
    }

    protected void processViews(SerializationConfig serializationconfig, BeanSerializerBuilder beanserializerbuilder)
    {
        List list;
        int i;
        int k;
        int l;
        boolean flag;
        list = beanserializerbuilder.getProperties();
        flag = serializationconfig.isEnabled(MapperFeature.DEFAULT_VIEW_INCLUSION);
        l = list.size();
        serializationconfig = new BeanPropertyWriter[l];
        k = 0;
        i = 0;
_L2:
        BeanPropertyWriter beanpropertywriter;
        Class aclass[];
        int j;
        if (k >= l)
        {
            break MISSING_BLOCK_LABEL_115;
        }
        beanpropertywriter = (BeanPropertyWriter)list.get(k);
        aclass = beanpropertywriter.getViews();
        if (aclass != null)
        {
            break; /* Loop/switch isn't completed */
        }
        j = i;
        if (!flag)
        {
            break MISSING_BLOCK_LABEL_108;
        }
        serializationconfig[k] = beanpropertywriter;
_L3:
        k++;
        if (true) goto _L2; else goto _L1
_L1:
        j = i + 1;
        serializationconfig[k] = constructFilteredBeanWriter(beanpropertywriter, aclass);
        i = j;
          goto _L3
        if (flag && i == 0)
        {
            return;
        } else
        {
            beanserializerbuilder.setFilteredProperties(serializationconfig);
            return;
        }
    }

    protected void removeIgnorableTypes(SerializationConfig serializationconfig, BeanDescription beandescription, List list)
    {
        AnnotationIntrospector annotationintrospector = serializationconfig.getAnnotationIntrospector();
        HashMap hashmap = new HashMap();
        Iterator iterator = list.iterator();
        do
        {
            if (!iterator.hasNext())
            {
                break;
            }
            beandescription = ((BeanPropertyDefinition)iterator.next()).getAccessor();
            if (beandescription == null)
            {
                iterator.remove();
            } else
            {
                Class class1 = beandescription.getRawType();
                list = (Boolean)hashmap.get(class1);
                beandescription = list;
                if (list == null)
                {
                    list = annotationintrospector.isIgnorableType(serializationconfig.introspectClassAnnotations(class1).getClassInfo());
                    beandescription = list;
                    if (list == null)
                    {
                        beandescription = Boolean.FALSE;
                    }
                    hashmap.put(class1, beandescription);
                }
                if (beandescription.booleanValue())
                {
                    iterator.remove();
                }
            }
        } while (true);
    }

    protected void removeSetterlessGetters(SerializationConfig serializationconfig, BeanDescription beandescription, List list)
    {
        serializationconfig = list.iterator();
        do
        {
            if (!serializationconfig.hasNext())
            {
                break;
            }
            beandescription = (BeanPropertyDefinition)serializationconfig.next();
            if (!beandescription.couldDeserialize() && !beandescription.isExplicitlyIncluded())
            {
                serializationconfig.remove();
            }
        } while (true);
    }

    public SerializerFactory withConfig(SerializerFactoryConfig serializerfactoryconfig)
    {
        if (_factoryConfig == serializerfactoryconfig)
        {
            return this;
        }
        if (getClass() != com/fasterxml/jackson/databind/ser/BeanSerializerFactory)
        {
            throw new IllegalStateException((new StringBuilder()).append("Subtype of BeanSerializerFactory (").append(getClass().getName()).append(") has not properly overridden method 'withAdditionalSerializers': can not instantiate subtype with ").append("additional serializer definitions").toString());
        } else
        {
            return new BeanSerializerFactory(serializerfactoryconfig);
        }
    }

}
