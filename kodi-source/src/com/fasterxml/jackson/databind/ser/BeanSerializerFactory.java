// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fasterxml.jackson.databind.ser;

import com.fasterxml.jackson.annotation.ObjectIdGenerator;
import com.fasterxml.jackson.databind.AnnotationIntrospector;
import com.fasterxml.jackson.databind.BeanDescription;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.JsonMappingException;
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
//            BasicSerializerFactory, PropertyBuilder, ResolvableSerializer, Serializers, 
//            BeanSerializerModifier, BeanSerializerBuilder, AnyGetterWriter, BeanPropertyWriter

public class BeanSerializerFactory extends BasicSerializerFactory
    implements Serializable
{

    public static final BeanSerializerFactory instance = new BeanSerializerFactory(null);

    protected BeanSerializerFactory(SerializerFactoryConfig serializerfactoryconfig)
    {
        super(serializerfactoryconfig);
    }

    protected BeanPropertyWriter _constructWriter(SerializerProvider serializerprovider, BeanPropertyDefinition beanpropertydefinition, TypeBindings typebindings, PropertyBuilder propertybuilder, boolean flag, AnnotatedMember annotatedmember)
        throws JsonMappingException
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
        throws JsonMappingException
    {
        JsonSerializer jsonserializer2;
        SerializationConfig serializationconfig;
        boolean flag1;
label0:
        {
            jsonserializer2 = findSerializerByAnnotations(serializerprovider, javatype, beandescription);
            if (jsonserializer2 != null)
            {
                return jsonserializer2;
            }
            serializationconfig = serializerprovider.getConfig();
            if (javatype.isContainerType())
            {
                flag1 = flag;
                if (!flag)
                {
                    flag1 = usesStaticTyping(serializationconfig, beandescription, null);
                }
                JsonSerializer jsonserializer = buildContainerSerializer(serializerprovider, javatype, beandescription, flag1);
                jsonserializer2 = jsonserializer;
                if (jsonserializer != null)
                {
                    return jsonserializer;
                }
                break label0;
            }
            Iterator iterator = customSerializers().iterator();
            JsonSerializer jsonserializer1;
            do
            {
                flag1 = flag;
                if (!iterator.hasNext())
                {
                    break label0;
                }
                jsonserializer1 = ((Serializers)iterator.next()).findSerializer(serializationconfig, javatype, beandescription);
                jsonserializer2 = jsonserializer1;
            } while (jsonserializer1 == null);
            flag1 = flag;
            jsonserializer2 = jsonserializer1;
        }
        Object obj = jsonserializer2;
        if (jsonserializer2 == null)
        {
            JsonSerializer jsonserializer3 = findSerializerByLookup(javatype, serializationconfig, beandescription, flag1);
            obj = jsonserializer3;
            if (jsonserializer3 == null)
            {
                JsonSerializer jsonserializer4 = findSerializerByPrimaryType(serializerprovider, javatype, beandescription, flag1);
                obj = jsonserializer4;
                if (jsonserializer4 == null)
                {
                    JsonSerializer jsonserializer5 = findBeanSerializer(serializerprovider, javatype, beandescription);
                    obj = jsonserializer5;
                    if (jsonserializer5 == null)
                    {
                        javatype = findSerializerByAddonType(serializationconfig, javatype, beandescription, flag1);
                        obj = javatype;
                        if (javatype == null)
                        {
                            obj = serializerprovider.getUnknownTypeSerializer(beandescription.getBeanClass());
                        }
                    }
                }
            }
        }
        serializerprovider = ((SerializerProvider) (obj));
        if (obj != null)
        {
            serializerprovider = ((SerializerProvider) (obj));
            if (_factoryConfig.hasSerializerModifiers())
            {
                javatype = _factoryConfig.serializerModifiers().iterator();
                do
                {
                    serializerprovider = ((SerializerProvider) (obj));
                    if (!javatype.hasNext())
                    {
                        break;
                    }
                    obj = ((BeanSerializerModifier)javatype.next()).modifySerializer(serializationconfig, beandescription, ((JsonSerializer) (obj)));
                } while (true);
            }
        }
        return serializerprovider;
    }

    protected JsonSerializer constructBeanSerializer(SerializerProvider serializerprovider, BeanDescription beandescription)
        throws JsonMappingException
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
            serializerprovider.getAnnotationIntrospector().findAndAddVirtualProperties(serializationconfig, beandescription.getClassInfo(), ((List) (obj)));
            obj2 = obj;
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
            }
            obj = filterBeanProperties(serializationconfig, beandescription, ((List) (obj2)));
            obj2 = obj;
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
            }
            ((BeanSerializerBuilder) (obj1)).setObjectIdWriter(constructObjectIdHandler(serializerprovider, beandescription, ((List) (obj2))));
            ((BeanSerializerBuilder) (obj1)).setProperties(((List) (obj2)));
            ((BeanSerializerBuilder) (obj1)).setFilterId(findFilterId(serializationconfig, beandescription));
            obj2 = beandescription.findAnyGetter();
            if (obj2 != null)
            {
                if (serializationconfig.canOverrideAccessModifiers())
                {
                    ((AnnotatedMember) (obj2)).fixAccess();
                }
                JavaType javatype1 = ((AnnotatedMember) (obj2)).getType(beandescription.bindingsForBeanType());
                boolean flag = serializationconfig.isEnabled(MapperFeature.USE_STATIC_TYPING);
                JavaType javatype = javatype1.getContentType();
                TypeSerializer typeserializer = createTypeSerializer(serializationconfig, javatype);
                obj = findSerializerFromAnnotation(serializerprovider, ((com.fasterxml.jackson.databind.introspect.Annotated) (obj2)));
                serializerprovider = ((SerializerProvider) (obj));
                if (obj == null)
                {
                    serializerprovider = MapSerializer.construct(null, javatype1, flag, typeserializer, null, null, null);
                }
                ((BeanSerializerBuilder) (obj1)).setAnyGetter(new AnyGetterWriter(new com.fasterxml.jackson.databind.BeanProperty.Std(new PropertyName(((AnnotatedMember) (obj2)).getName()), javatype, null, beandescription.getClassAnnotations(), ((AnnotatedMember) (obj2)), PropertyMetadata.STD_OPTIONAL), ((AnnotatedMember) (obj2)), serializerprovider));
            }
            processViews(serializationconfig, ((BeanSerializerBuilder) (obj1)));
            obj = obj1;
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
        throws JsonMappingException
    {
        ObjectIdInfo objectidinfo = beandescription.getObjectIdInfo();
        if (objectidinfo == null)
        {
            return null;
        }
        Object obj = objectidinfo.getGeneratorType();
        if (obj == com/fasterxml/jackson/annotation/ObjectIdGenerators$PropertyGenerator)
        {
            obj = objectidinfo.getPropertyName().getSimpleName();
            int i = 0;
            int j = list.size();
            do
            {
                if (i == j)
                {
                    throw new IllegalArgumentException((new StringBuilder()).append("Invalid Object Id definition for ").append(beandescription.getBeanClass().getName()).append(": can not find property with name '").append(((String) (obj))).append("'").toString());
                }
                serializerprovider = (BeanPropertyWriter)list.get(i);
                if (((String) (obj)).equals(serializerprovider.getName()))
                {
                    if (i > 0)
                    {
                        list.remove(i);
                        list.add(0, serializerprovider);
                    }
                    beandescription = serializerprovider.getType();
                    serializerprovider = new PropertyBasedObjectIdGenerator(objectidinfo, serializerprovider);
                    return ObjectIdWriter.construct(beandescription, (PropertyName)null, serializerprovider, objectidinfo.getAlwaysAsId());
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
        throws JsonMappingException
    {
        BeanDescription beandescription;
        Object obj;
        SerializationConfig serializationconfig;
        JavaType javatype2;
        serializationconfig = serializerprovider.getConfig();
        beandescription = serializationconfig.introspect(javatype);
        obj = findSerializerFromAnnotation(serializerprovider, beandescription.getClassInfo());
        if (obj != null)
        {
            return ((JsonSerializer) (obj));
        }
        javatype2 = modifyTypeByAnnotation(serializationconfig, beandescription.getClassInfo(), javatype);
        if (javatype2 != javatype) goto _L2; else goto _L1
_L1:
        boolean flag = false;
_L4:
        Converter converter;
        converter = beandescription.findSerializationConverter();
        if (converter == null)
        {
            return _createSerializer2(serializerprovider, javatype2, beandescription, flag);
        }
        break; /* Loop/switch isn't completed */
_L2:
        boolean flag1 = true;
        flag = flag1;
        if (!javatype2.hasRawClass(javatype.getRawClass()))
        {
            beandescription = serializationconfig.introspect(javatype2);
            flag = flag1;
        }
        if (true) goto _L4; else goto _L3
_L3:
        JavaType javatype1 = converter.getOutputType(serializerprovider.getTypeFactory());
        javatype = ((JavaType) (obj));
        if (!javatype1.hasRawClass(javatype2.getRawClass()))
        {
            beandescription = serializationconfig.introspect(javatype1);
            javatype = findSerializerFromAnnotation(serializerprovider, beandescription.getClassInfo());
        }
        obj = javatype;
        if (javatype == null)
        {
            obj = _createSerializer2(serializerprovider, javatype1, beandescription, true);
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
        throws JsonMappingException
    {
        SerializationConfig serializationconfig;
        Object obj;
        obj = beandescription.findProperties();
        serializationconfig = serializerprovider.getConfig();
        removeIgnorableTypes(serializationconfig, beandescription, ((List) (obj)));
        if (serializationconfig.isEnabled(MapperFeature.REQUIRE_SETTERS_FOR_GETTERS))
        {
            removeSetterlessGetters(serializationconfig, beandescription, ((List) (obj)));
        }
        if (!((List) (obj)).isEmpty()) goto _L2; else goto _L1
_L1:
        beandescription = null;
_L4:
        return beandescription;
_L2:
        boolean flag = usesStaticTyping(serializationconfig, beandescription, null);
        PropertyBuilder propertybuilder = constructPropertyBuilder(serializationconfig, beandescription);
        ArrayList arraylist = new ArrayList(((List) (obj)).size());
        TypeBindings typebindings = beandescription.bindingsForBeanType();
        obj = ((List) (obj)).iterator();
        do
        {
            beandescription = arraylist;
            if (!((Iterator) (obj)).hasNext())
            {
                continue;
            }
            beandescription = (BeanPropertyDefinition)((Iterator) (obj)).next();
            AnnotatedMember annotatedmember = beandescription.getAccessor();
            if (beandescription.isTypeId())
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
                com.fasterxml.jackson.databind.AnnotationIntrospector.ReferenceProperty referenceproperty = beandescription.findReferenceType();
                if (referenceproperty == null || !referenceproperty.isBackReference())
                {
                    if (annotatedmember instanceof AnnotatedMethod)
                    {
                        arraylist.add(_constructWriter(serializerprovider, beandescription, typebindings, propertybuilder, flag, (AnnotatedMethod)annotatedmember));
                    } else
                    {
                        arraylist.add(_constructWriter(serializerprovider, beandescription, typebindings, propertybuilder, flag, (AnnotatedField)annotatedmember));
                    }
                }
            }
        } while (true);
        if (true) goto _L4; else goto _L3
_L3:
    }

    public JsonSerializer findBeanSerializer(SerializerProvider serializerprovider, JavaType javatype, BeanDescription beandescription)
        throws JsonMappingException
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
        throws JsonMappingException
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
        throws JsonMappingException
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
        List list = beanserializerbuilder.getProperties();
        boolean flag = serializationconfig.isEnabled(MapperFeature.DEFAULT_VIEW_INCLUSION);
        int l = list.size();
        int j = 0;
        serializationconfig = new BeanPropertyWriter[l];
        int i = 0;
        while (i < l) 
        {
            BeanPropertyWriter beanpropertywriter = (BeanPropertyWriter)list.get(i);
            Class aclass[] = beanpropertywriter.getViews();
            int k;
            if (aclass == null)
            {
                k = j;
                if (flag)
                {
                    serializationconfig[i] = beanpropertywriter;
                    k = j;
                }
            } else
            {
                k = j + 1;
                serializationconfig[i] = constructFilteredBeanWriter(beanpropertywriter, aclass);
            }
            i++;
            j = k;
        }
        if (flag && j == 0)
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
