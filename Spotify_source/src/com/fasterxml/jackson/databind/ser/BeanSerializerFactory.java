// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fasterxml.jackson.databind.ser;

import com.fasterxml.jackson.annotation.ObjectIdGenerator;
import com.fasterxml.jackson.databind.AnnotationIntrospector;
import com.fasterxml.jackson.databind.BeanDescription;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.JsonSerializer;
import com.fasterxml.jackson.databind.MapperFeature;
import com.fasterxml.jackson.databind.PropertyMetadata;
import com.fasterxml.jackson.databind.PropertyName;
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
import com.fasterxml.jackson.databind.ser.std.StdDelegatingSerializer;
import com.fasterxml.jackson.databind.type.TypeBindings;
import com.fasterxml.jackson.databind.type.TypeFactory;
import com.fasterxml.jackson.databind.util.ArrayBuilders;
import com.fasterxml.jackson.databind.util.ClassUtil;
import com.fasterxml.jackson.databind.util.Converter;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

// Referenced classes of package com.fasterxml.jackson.databind.ser:
//            BasicSerializerFactory, PropertyBuilder, ResolvableSerializer, BeanSerializerModifier, 
//            Serializers, BeanSerializerBuilder, AnyGetterWriter, BeanPropertyWriter

public class BeanSerializerFactory extends BasicSerializerFactory
    implements Serializable
{

    public static final BeanSerializerFactory instance = new BeanSerializerFactory(null);
    private static final long serialVersionUID = 1L;

    protected BeanSerializerFactory(SerializerFactoryConfig serializerfactoryconfig)
    {
        super(serializerfactoryconfig);
    }

    protected BeanPropertyWriter _constructWriter(SerializerProvider serializerprovider, BeanPropertyDefinition beanpropertydefinition, TypeBindings typebindings, PropertyBuilder propertybuilder, boolean flag, AnnotatedMember annotatedmember)
    {
        Object obj = beanpropertydefinition.getFullName();
        if (serializerprovider.canOverrideAccessModifiers())
        {
            annotatedmember.fixAccess();
        }
        JavaType javatype = annotatedmember.getType(typebindings);
        typebindings = new com.fasterxml.jackson.databind.BeanProperty.Std(((PropertyName) (obj)), javatype, beanpropertydefinition.getWrapperName(), propertybuilder.getClassAnnotations(), annotatedmember, beanpropertydefinition.getMetadata());
        obj = findSerializerFromAnnotation(serializerprovider, annotatedmember);
        if (obj instanceof ResolvableSerializer)
        {
            ((ResolvableSerializer)obj).resolve(serializerprovider);
        }
        obj = serializerprovider.handlePrimaryContextualization(((JsonSerializer) (obj)), typebindings);
        typebindings = null;
        if (ClassUtil.isCollectionMapOrArray(javatype.getRawClass()) || javatype.isCollectionLikeType() || javatype.isMapLikeType())
        {
            typebindings = findPropertyContentTypeSerializer(javatype, serializerprovider.getConfig(), annotatedmember);
        }
        return propertybuilder.buildWriter(serializerprovider, beanpropertydefinition, javatype, ((JsonSerializer) (obj)), findPropertyTypeSerializer(javatype, serializerprovider.getConfig(), annotatedmember), typebindings, annotatedmember, flag);
    }

    protected JsonSerializer _createSerializer2(SerializerProvider serializerprovider, JavaType javatype, BeanDescription beandescription, boolean flag)
    {
        Object obj1 = findSerializerByAnnotations(serializerprovider, javatype, beandescription);
        if (obj1 == null) goto _L2; else goto _L1
_L1:
        return ((JsonSerializer) (obj1));
_L2:
        SerializationConfig serializationconfig;
        boolean flag1;
        serializationconfig = serializerprovider.getConfig();
        if (!javatype.isContainerType())
        {
            break; /* Loop/switch isn't completed */
        }
        flag1 = flag;
        if (!flag)
        {
            flag1 = usesStaticTyping(serializationconfig, beandescription, null);
        }
        JsonSerializer jsonserializer = buildContainerSerializer(serializerprovider, javatype, beandescription, flag1);
        obj1 = jsonserializer;
        if (jsonserializer != null)
        {
            continue; /* Loop/switch isn't completed */
        }
        obj1 = jsonserializer;
_L5:
        Object obj;
        obj = obj1;
        if (obj1 == null)
        {
            obj1 = findSerializerByLookup(javatype, serializationconfig, beandescription, flag1);
            obj = obj1;
            if (obj1 == null)
            {
                obj1 = findSerializerByPrimaryType(serializerprovider, javatype, beandescription, flag1);
                obj = obj1;
                if (obj1 == null)
                {
                    serializerprovider = findBeanSerializer(serializerprovider, javatype, beandescription);
                    obj = serializerprovider;
                    if (serializerprovider == null)
                    {
                        obj = findSerializerByAddonType(serializationconfig, javatype, beandescription, flag1);
                    }
                }
            }
        }
        obj1 = obj;
        if (obj != null)
        {
            obj1 = obj;
            if (_factoryConfig.hasSerializerModifiers())
            {
                for (serializerprovider = _factoryConfig.serializerModifiers().iterator(); serializerprovider.hasNext();)
                {
                    obj = ((BeanSerializerModifier)serializerprovider.next()).modifySerializer(serializationconfig, beandescription, ((JsonSerializer) (obj)));
                }

                break MISSING_BLOCK_LABEL_283;
            }
        }
        if (true) goto _L1; else goto _L3
_L3:
        Iterator iterator = customSerializers().iterator();
_L7:
        flag1 = flag;
        if (!iterator.hasNext()) goto _L5; else goto _L4
_L4:
        obj = ((Serializers)iterator.next()).findSerializer(serializationconfig, javatype, beandescription);
        obj1 = obj;
        if (obj == null) goto _L7; else goto _L6
_L6:
        obj1 = obj;
        flag1 = flag;
          goto _L5
        return ((JsonSerializer) (obj));
    }

    protected JsonSerializer constructBeanSerializer(SerializerProvider serializerprovider, BeanDescription beandescription)
    {
        if (beandescription.getBeanClass() == java/lang/Object)
        {
            serializerprovider = serializerprovider.getUnknownTypeSerializer(java/lang/Object);
        } else
        {
            SerializationConfig serializationconfig = serializerprovider.getConfig();
            Object obj1 = constructBeanSerializerBuilder(beandescription);
            ((BeanSerializerBuilder) (obj1)).setConfig(serializationconfig);
            Object obj2 = findBeanProperties(serializerprovider, beandescription, ((BeanSerializerBuilder) (obj1)));
            Object obj = obj2;
            if (obj2 == null)
            {
                obj = new ArrayList();
            }
            if (_factoryConfig.hasSerializerModifiers())
            {
                Iterator iterator1 = _factoryConfig.serializerModifiers().iterator();
                do
                {
                    obj2 = obj;
                    if (!iterator1.hasNext())
                    {
                        break;
                    }
                    obj = ((BeanSerializerModifier)iterator1.next()).changeProperties(serializationconfig, beandescription, ((List) (obj)));
                } while (true);
            } else
            {
                obj2 = obj;
            }
            obj = filterBeanProperties(serializationconfig, beandescription, ((List) (obj2)));
            if (_factoryConfig.hasSerializerModifiers())
            {
                Iterator iterator2 = _factoryConfig.serializerModifiers().iterator();
                do
                {
                    obj2 = obj;
                    if (!iterator2.hasNext())
                    {
                        break;
                    }
                    obj = ((BeanSerializerModifier)iterator2.next()).orderProperties(serializationconfig, beandescription, ((List) (obj)));
                } while (true);
            } else
            {
                obj2 = obj;
            }
            ((BeanSerializerBuilder) (obj1)).setObjectIdWriter(constructObjectIdHandler(serializerprovider, beandescription, ((List) (obj2))));
            ((BeanSerializerBuilder) (obj1)).setProperties(((List) (obj2)));
            ((BeanSerializerBuilder) (obj1)).setFilterId(findFilterId(serializationconfig, beandescription));
            serializerprovider = beandescription.findAnyGetter();
            if (serializerprovider != null)
            {
                if (serializationconfig.canOverrideAccessModifiers())
                {
                    serializerprovider.fixAccess();
                }
                Object obj3 = serializerprovider.getType(beandescription.bindingsForBeanType());
                boolean flag = serializationconfig.isEnabled(MapperFeature.USE_STATIC_TYPING);
                obj = ((JavaType) (obj3)).getContentType();
                obj3 = MapSerializer.construct(null, ((JavaType) (obj3)), flag, createTypeSerializer(serializationconfig, ((JavaType) (obj))), null, null, null);
                ((BeanSerializerBuilder) (obj1)).setAnyGetter(new AnyGetterWriter(new com.fasterxml.jackson.databind.BeanProperty.Std(new PropertyName(serializerprovider.getName()), ((JavaType) (obj)), null, beandescription.getClassAnnotations(), serializerprovider, PropertyMetadata.STD_OPTIONAL), serializerprovider, ((MapSerializer) (obj3))));
            }
            processViews(serializationconfig, ((BeanSerializerBuilder) (obj1)));
            if (_factoryConfig.hasSerializerModifiers())
            {
                Iterator iterator = _factoryConfig.serializerModifiers().iterator();
                serializerprovider = ((SerializerProvider) (obj1));
                do
                {
                    obj = serializerprovider;
                    if (!iterator.hasNext())
                    {
                        break;
                    }
                    serializerprovider = ((BeanSerializerModifier)iterator.next()).updateBuilder(serializationconfig, beandescription, serializerprovider);
                } while (true);
            } else
            {
                obj = obj1;
            }
            obj1 = ((BeanSerializerBuilder) (obj)).build();
            serializerprovider = ((SerializerProvider) (obj1));
            if (obj1 == null)
            {
                serializerprovider = ((SerializerProvider) (obj1));
                if (beandescription.hasKnownClassAnnotations())
                {
                    return ((BeanSerializerBuilder) (obj)).createDummy();
                }
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
            serializerprovider = objectidinfo.getPropertyName().getSimpleName();
            int j = list.size();
            int i = 0;
            do
            {
                if (i == j)
                {
                    throw new IllegalArgumentException((new StringBuilder("Invalid Object Id definition for ")).append(beandescription.getBeanClass().getName()).append(": can not find property with name '").append(serializerprovider).append("'").toString());
                }
                obj = (BeanPropertyWriter)list.get(i);
                if (serializerprovider.equals(((BeanPropertyWriter) (obj)).getName()))
                {
                    if (i > 0)
                    {
                        list.remove(i);
                        list.add(0, obj);
                    }
                    return ObjectIdWriter.construct(((BeanPropertyWriter) (obj)).getType(), null, new PropertyBasedObjectIdGenerator(objectidinfo, ((BeanPropertyWriter) (obj))), objectidinfo.getAlwaysAsId());
                }
                i++;
            } while (true);
        } else
        {
            list = serializerprovider.constructType(((java.lang.reflect.Type) (obj)));
            list = serializerprovider.getTypeFactory().findTypeParameters(list, com/fasterxml/jackson/annotation/ObjectIdGenerator)[0];
            serializerprovider = serializerprovider.objectIdGeneratorInstance(beandescription.getClassInfo(), objectidinfo);
            return ObjectIdWriter.construct(list, objectidinfo.getPropertyName(), serializerprovider, objectidinfo.getAlwaysAsId());
        }
    }

    protected PropertyBuilder constructPropertyBuilder(SerializationConfig serializationconfig, BeanDescription beandescription)
    {
        return new PropertyBuilder(serializationconfig, beandescription);
    }

    public JsonSerializer createSerializer(SerializerProvider serializerprovider, JavaType javatype)
    {
        SerializationConfig serializationconfig = serializerprovider.getConfig();
        Object obj = serializationconfig.introspect(javatype);
        JsonSerializer jsonserializer = findSerializerFromAnnotation(serializerprovider, ((BeanDescription) (obj)).getClassInfo());
        if (jsonserializer != null)
        {
            return jsonserializer;
        }
        JavaType javatype2 = modifyTypeByAnnotation(serializationconfig, ((BeanDescription) (obj)).getClassInfo(), javatype);
        Converter converter;
        JavaType javatype1;
        boolean flag;
        if (javatype2 == javatype)
        {
            flag = false;
            javatype = ((JavaType) (obj));
        } else
        if (!javatype2.hasRawClass(javatype.getRawClass()))
        {
            javatype = serializationconfig.introspect(javatype2);
            flag = true;
        } else
        {
            flag = true;
            javatype = ((JavaType) (obj));
        }
        converter = javatype.findSerializationConverter();
        if (converter == null)
        {
            return _createSerializer2(serializerprovider, javatype2, javatype, flag);
        }
        javatype1 = converter.getOutputType(serializerprovider.getTypeFactory());
        if (!javatype1.hasRawClass(javatype2.getRawClass()))
        {
            javatype = serializationconfig.introspect(javatype1);
            jsonserializer = findSerializerFromAnnotation(serializerprovider, javatype.getClassInfo());
        }
        obj = jsonserializer;
        if (jsonserializer == null)
        {
            obj = _createSerializer2(serializerprovider, javatype1, javatype, true);
        }
        return new StdDelegatingSerializer(converter, javatype1, ((JsonSerializer) (obj)));
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
        boolean flag = usesStaticTyping(serializationconfig, beandescription, null);
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

    public JsonSerializer findBeanSerializer(SerializerProvider serializerprovider, JavaType javatype, BeanDescription beandescription)
    {
        if (!isPotentialBeanType(javatype.getRawClass()) && !javatype.isEnumType())
        {
            return null;
        } else
        {
            return constructBeanSerializer(serializerprovider, beandescription);
        }
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
            return javatype.buildTypeSerializer(serializationconfig, javatype1, serializationconfig.getSubtypeResolver().collectAndResolveSubtypes(annotatedmember, serializationconfig, annotationintrospector, javatype1));
        }
    }

    public TypeSerializer findPropertyTypeSerializer(JavaType javatype, SerializationConfig serializationconfig, AnnotatedMember annotatedmember)
    {
        AnnotationIntrospector annotationintrospector = serializationconfig.getAnnotationIntrospector();
        TypeResolverBuilder typeresolverbuilder = annotationintrospector.findPropertyTypeResolver(serializationconfig, annotatedmember, javatype);
        if (typeresolverbuilder == null)
        {
            return createTypeSerializer(serializationconfig, javatype);
        } else
        {
            return typeresolverbuilder.buildTypeSerializer(serializationconfig, javatype, serializationconfig.getSubtypeResolver().collectAndResolveSubtypes(annotatedmember, serializationconfig, annotationintrospector, javatype));
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

}
