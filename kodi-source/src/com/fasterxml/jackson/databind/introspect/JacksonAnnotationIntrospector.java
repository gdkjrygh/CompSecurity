// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fasterxml.jackson.databind.introspect;

import com.fasterxml.jackson.annotation.JacksonAnnotationsInside;
import com.fasterxml.jackson.annotation.JacksonInject;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonAutoDetect;
import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonFilter;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.JsonIdentityReference;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonIgnoreType;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonRawValue;
import com.fasterxml.jackson.annotation.JsonRootName;
import com.fasterxml.jackson.annotation.JsonSetter;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeId;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonUnwrapped;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.annotation.JsonView;
import com.fasterxml.jackson.databind.AnnotationIntrospector;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.PropertyMetadata;
import com.fasterxml.jackson.databind.PropertyName;
import com.fasterxml.jackson.databind.annotation.JsonAppend;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonNaming;
import com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.fasterxml.jackson.databind.annotation.JsonTypeIdResolver;
import com.fasterxml.jackson.databind.annotation.JsonTypeResolver;
import com.fasterxml.jackson.databind.annotation.JsonValueInstantiator;
import com.fasterxml.jackson.databind.cfg.HandlerInstantiator;
import com.fasterxml.jackson.databind.cfg.MapperConfig;
import com.fasterxml.jackson.databind.jsontype.NamedType;
import com.fasterxml.jackson.databind.jsontype.TypeIdResolver;
import com.fasterxml.jackson.databind.jsontype.TypeResolverBuilder;
import com.fasterxml.jackson.databind.jsontype.impl.StdTypeResolverBuilder;
import com.fasterxml.jackson.databind.ser.BeanPropertyWriter;
import com.fasterxml.jackson.databind.ser.VirtualBeanPropertyWriter;
import com.fasterxml.jackson.databind.ser.impl.AttributePropertyWriter;
import com.fasterxml.jackson.databind.ser.std.RawSerializer;
import com.fasterxml.jackson.databind.util.ClassUtil;
import com.fasterxml.jackson.databind.util.NameTransformer;
import com.fasterxml.jackson.databind.util.SimpleBeanPropertyDefinition;
import java.io.Serializable;
import java.lang.annotation.Annotation;
import java.util.ArrayList;
import java.util.List;

// Referenced classes of package com.fasterxml.jackson.databind.introspect:
//            VirtualAnnotatedMember, AnnotatedClass, VisibilityChecker, AnnotatedMethod, 
//            AnnotatedMember, ObjectIdInfo, Annotated

public class JacksonAnnotationIntrospector extends AnnotationIntrospector
    implements Serializable
{

    public JacksonAnnotationIntrospector()
    {
    }

    private final Boolean _findSortAlpha(Annotated annotated)
    {
        annotated = (JsonPropertyOrder)_findAnnotation(annotated, com/fasterxml/jackson/annotation/JsonPropertyOrder);
        if (annotated == null)
        {
            return null;
        } else
        {
            return Boolean.valueOf(annotated.alphabetic());
        }
    }

    protected Class _classIfExplicit(Class class1)
    {
        Class class2;
label0:
        {
            if (class1 != null)
            {
                class2 = class1;
                if (!ClassUtil.isBogusClass(class1))
                {
                    break label0;
                }
            }
            class2 = null;
        }
        return class2;
    }

    protected Class _classIfExplicit(Class class1, Class class2)
    {
label0:
        {
            Class class3 = _classIfExplicit(class1);
            if (class3 != null)
            {
                class1 = class3;
                if (class3 != class2)
                {
                    break label0;
                }
            }
            class1 = null;
        }
        return class1;
    }

    protected StdTypeResolverBuilder _constructNoTypeResolverBuilder()
    {
        return StdTypeResolverBuilder.noTypeInfoBuilder();
    }

    protected StdTypeResolverBuilder _constructStdTypeResolverBuilder()
    {
        return new StdTypeResolverBuilder();
    }

    protected BeanPropertyWriter _constructVirtualProperty(com.fasterxml.jackson.databind.annotation.JsonAppend.Attr attr, MapperConfig mapperconfig, AnnotatedClass annotatedclass, JavaType javatype)
    {
        PropertyMetadata propertymetadata;
        PropertyName propertyname;
        PropertyName propertyname1;
        String s;
        if (attr.required())
        {
            propertymetadata = PropertyMetadata.STD_REQUIRED;
        } else
        {
            propertymetadata = PropertyMetadata.STD_OPTIONAL;
        }
        s = attr.value();
        propertyname1 = _propertyName(attr.propName(), attr.propNamespace());
        propertyname = propertyname1;
        if (!propertyname1.hasSimpleName())
        {
            propertyname = new PropertyName(s);
        }
        return AttributePropertyWriter.construct(s, SimpleBeanPropertyDefinition.construct(mapperconfig, new VirtualAnnotatedMember(annotatedclass, annotatedclass.getRawType(), s, javatype.getRawClass()), propertyname, propertymetadata, attr.include()), annotatedclass.getAnnotations(), javatype);
    }

    protected BeanPropertyWriter _constructVirtualProperty(com.fasterxml.jackson.databind.annotation.JsonAppend.Prop prop, MapperConfig mapperconfig, AnnotatedClass annotatedclass)
    {
        Object obj;
        JavaType javatype;
        Object obj1;
        Class class1;
        if (prop.required())
        {
            obj = PropertyMetadata.STD_REQUIRED;
        } else
        {
            obj = PropertyMetadata.STD_OPTIONAL;
        }
        obj1 = _propertyName(prop.name(), prop.namespace());
        javatype = mapperconfig.constructType(prop.type());
        obj1 = SimpleBeanPropertyDefinition.construct(mapperconfig, new VirtualAnnotatedMember(annotatedclass, annotatedclass.getRawType(), ((PropertyName) (obj1)).getSimpleName(), javatype.getRawClass()), ((PropertyName) (obj1)), ((PropertyMetadata) (obj)), prop.include());
        class1 = prop.value();
        prop = mapperconfig.getHandlerInstantiator();
        if (prop == null)
        {
            prop = null;
        } else
        {
            prop = prop.virtualPropertyWriterInstance(mapperconfig, class1);
        }
        obj = prop;
        if (prop == null)
        {
            obj = (VirtualBeanPropertyWriter)ClassUtil.createInstance(class1, mapperconfig.canOverrideAccessModifiers());
        }
        return ((VirtualBeanPropertyWriter) (obj)).withConfig(mapperconfig, annotatedclass, ((BeanPropertyDefinition) (obj1)), javatype);
    }

    protected final Object _findFilterId(Annotated annotated)
    {
        annotated = (JsonFilter)_findAnnotation(annotated, com/fasterxml/jackson/annotation/JsonFilter);
        if (annotated != null)
        {
            annotated = annotated.value();
            if (annotated.length() > 0)
            {
                return annotated;
            }
        }
        return null;
    }

    protected TypeResolverBuilder _findTypeResolver(MapperConfig mapperconfig, Annotated annotated, JavaType javatype)
    {
        JsonTypeInfo jsontypeinfo = (JsonTypeInfo)_findAnnotation(annotated, com/fasterxml/jackson/annotation/JsonTypeInfo);
        Object obj = (JsonTypeResolver)_findAnnotation(annotated, com/fasterxml/jackson/databind/annotation/JsonTypeResolver);
        JsonTypeIdResolver jsontypeidresolver;
        if (obj != null)
        {
            if (jsontypeinfo == null)
            {
                return null;
            }
            obj = mapperconfig.typeResolverBuilderInstance(annotated, ((JsonTypeResolver) (obj)).value());
        } else
        {
            if (jsontypeinfo == null)
            {
                return null;
            }
            if (jsontypeinfo.use() == com.fasterxml.jackson.annotation.JsonTypeInfo.Id.NONE)
            {
                return _constructNoTypeResolverBuilder();
            }
            obj = _constructStdTypeResolverBuilder();
        }
        jsontypeidresolver = (JsonTypeIdResolver)_findAnnotation(annotated, com/fasterxml/jackson/databind/annotation/JsonTypeIdResolver);
        if (jsontypeidresolver == null)
        {
            mapperconfig = null;
        } else
        {
            mapperconfig = mapperconfig.typeIdResolverInstance(annotated, jsontypeidresolver.value());
        }
        if (mapperconfig != null)
        {
            mapperconfig.init(javatype);
        }
        obj = ((TypeResolverBuilder) (obj)).init(jsontypeinfo.use(), mapperconfig);
        javatype = jsontypeinfo.include();
        mapperconfig = javatype;
        if (javatype == com.fasterxml.jackson.annotation.JsonTypeInfo.As.EXTERNAL_PROPERTY)
        {
            mapperconfig = javatype;
            if (annotated instanceof AnnotatedClass)
            {
                mapperconfig = com.fasterxml.jackson.annotation.JsonTypeInfo.As.PROPERTY;
            }
        }
        annotated = ((TypeResolverBuilder) (obj)).inclusion(mapperconfig).typeProperty(jsontypeinfo.property());
        javatype = jsontypeinfo.defaultImpl();
        mapperconfig = annotated;
        if (javatype != com/fasterxml/jackson/annotation/JsonTypeInfo$None)
        {
            mapperconfig = annotated;
            if (!javatype.isAnnotation())
            {
                mapperconfig = annotated.defaultImpl(javatype);
            }
        }
        return mapperconfig.typeIdVisibility(jsontypeinfo.visible());
    }

    protected boolean _isIgnorable(Annotated annotated)
    {
        annotated = (JsonIgnore)_findAnnotation(annotated, com/fasterxml/jackson/annotation/JsonIgnore);
        return annotated != null && annotated.value();
    }

    protected PropertyName _propertyName(String s, String s1)
    {
        if (s.isEmpty())
        {
            return PropertyName.USE_DEFAULT;
        }
        if (s1 == null || s1.isEmpty())
        {
            return new PropertyName(s);
        } else
        {
            return new PropertyName(s, s1);
        }
    }

    public void findAndAddVirtualProperties(MapperConfig mapperconfig, AnnotatedClass annotatedclass, List list)
    {
        JsonAppend jsonappend = (JsonAppend)_findAnnotation(annotatedclass, com/fasterxml/jackson/databind/annotation/JsonAppend);
        if (jsonappend != null)
        {
            boolean flag = jsonappend.prepend();
            Object obj = null;
            com.fasterxml.jackson.databind.annotation.JsonAppend.Attr aattr[] = jsonappend.attrs();
            int i = 0;
            int j = aattr.length;
            while (i < j) 
            {
                JavaType javatype = ((JavaType) (obj));
                if (obj == null)
                {
                    javatype = mapperconfig.constructType(java/lang/Object);
                }
                obj = _constructVirtualProperty(aattr[i], mapperconfig, annotatedclass, javatype);
                if (flag)
                {
                    list.add(i, obj);
                } else
                {
                    list.add(obj);
                }
                i++;
                obj = javatype;
            }
            com.fasterxml.jackson.databind.annotation.JsonAppend.Prop aprop[] = jsonappend.props();
            i = 0;
            j = aprop.length;
            while (i < j) 
            {
                BeanPropertyWriter beanpropertywriter = _constructVirtualProperty(aprop[i], mapperconfig, annotatedclass);
                if (flag)
                {
                    list.add(i, beanpropertywriter);
                } else
                {
                    list.add(beanpropertywriter);
                }
                i++;
            }
        }
    }

    public VisibilityChecker findAutoDetectVisibility(AnnotatedClass annotatedclass, VisibilityChecker visibilitychecker)
    {
        annotatedclass = (JsonAutoDetect)_findAnnotation(annotatedclass, com/fasterxml/jackson/annotation/JsonAutoDetect);
        if (annotatedclass == null)
        {
            return visibilitychecker;
        } else
        {
            return visibilitychecker.with(annotatedclass);
        }
    }

    public Class findContentDeserializer(Annotated annotated)
    {
        annotated = (JsonDeserialize)_findAnnotation(annotated, com/fasterxml/jackson/databind/annotation/JsonDeserialize);
        if (annotated != null)
        {
            annotated = annotated.contentUsing();
            if (annotated != com/fasterxml/jackson/databind/JsonDeserializer$None)
            {
                return annotated;
            }
        }
        return null;
    }

    public volatile Object findContentDeserializer(Annotated annotated)
    {
        return findContentDeserializer(annotated);
    }

    public Class findContentSerializer(Annotated annotated)
    {
        annotated = (JsonSerialize)_findAnnotation(annotated, com/fasterxml/jackson/databind/annotation/JsonSerialize);
        if (annotated != null)
        {
            annotated = annotated.contentUsing();
            if (annotated != com/fasterxml/jackson/databind/JsonSerializer$None)
            {
                return annotated;
            }
        }
        return null;
    }

    public volatile Object findContentSerializer(Annotated annotated)
    {
        return findContentSerializer(annotated);
    }

    public com.fasterxml.jackson.annotation.JsonCreator.Mode findCreatorBinding(Annotated annotated)
    {
        annotated = (JsonCreator)_findAnnotation(annotated, com/fasterxml/jackson/annotation/JsonCreator);
        if (annotated == null)
        {
            return null;
        } else
        {
            return annotated.mode();
        }
    }

    public Object findDeserializationContentConverter(AnnotatedMember annotatedmember)
    {
        annotatedmember = (JsonDeserialize)_findAnnotation(annotatedmember, com/fasterxml/jackson/databind/annotation/JsonDeserialize);
        if (annotatedmember == null)
        {
            return null;
        } else
        {
            return _classIfExplicit(annotatedmember.contentConverter(), com/fasterxml/jackson/databind/util/Converter$None);
        }
    }

    public Class findDeserializationContentType(Annotated annotated, JavaType javatype)
    {
        annotated = (JsonDeserialize)_findAnnotation(annotated, com/fasterxml/jackson/databind/annotation/JsonDeserialize);
        if (annotated == null)
        {
            return null;
        } else
        {
            return _classIfExplicit(annotated.contentAs());
        }
    }

    public Object findDeserializationConverter(Annotated annotated)
    {
        annotated = (JsonDeserialize)_findAnnotation(annotated, com/fasterxml/jackson/databind/annotation/JsonDeserialize);
        if (annotated == null)
        {
            return null;
        } else
        {
            return _classIfExplicit(annotated.converter(), com/fasterxml/jackson/databind/util/Converter$None);
        }
    }

    public Class findDeserializationKeyType(Annotated annotated, JavaType javatype)
    {
        annotated = (JsonDeserialize)_findAnnotation(annotated, com/fasterxml/jackson/databind/annotation/JsonDeserialize);
        if (annotated == null)
        {
            return null;
        } else
        {
            return _classIfExplicit(annotated.keyAs());
        }
    }

    public Class findDeserializationType(Annotated annotated, JavaType javatype)
    {
        annotated = (JsonDeserialize)_findAnnotation(annotated, com/fasterxml/jackson/databind/annotation/JsonDeserialize);
        if (annotated == null)
        {
            return null;
        } else
        {
            return _classIfExplicit(annotated.as());
        }
    }

    public Class findDeserializer(Annotated annotated)
    {
        annotated = (JsonDeserialize)_findAnnotation(annotated, com/fasterxml/jackson/databind/annotation/JsonDeserialize);
        if (annotated != null)
        {
            annotated = annotated.using();
            if (annotated != com/fasterxml/jackson/databind/JsonDeserializer$None)
            {
                return annotated;
            }
        }
        return null;
    }

    public volatile Object findDeserializer(Annotated annotated)
    {
        return findDeserializer(annotated);
    }

    public Object findFilterId(Annotated annotated)
    {
        return _findFilterId(annotated);
    }

    public com.fasterxml.jackson.annotation.JsonFormat.Value findFormat(Annotated annotated)
    {
        annotated = (JsonFormat)_findAnnotation(annotated, com/fasterxml/jackson/annotation/JsonFormat);
        if (annotated == null)
        {
            return null;
        } else
        {
            return new com.fasterxml.jackson.annotation.JsonFormat.Value(annotated);
        }
    }

    public Boolean findIgnoreUnknownProperties(AnnotatedClass annotatedclass)
    {
        annotatedclass = (JsonIgnoreProperties)_findAnnotation(annotatedclass, com/fasterxml/jackson/annotation/JsonIgnoreProperties);
        if (annotatedclass == null)
        {
            return null;
        } else
        {
            return Boolean.valueOf(annotatedclass.ignoreUnknown());
        }
    }

    public String findImplicitPropertyName(AnnotatedMember annotatedmember)
    {
        return null;
    }

    public Object findInjectableValueId(AnnotatedMember annotatedmember)
    {
        Object obj = (JacksonInject)_findAnnotation(annotatedmember, com/fasterxml/jackson/annotation/JacksonInject);
        if (obj == null)
        {
            obj = null;
        } else
        {
            String s = ((JacksonInject) (obj)).value();
            obj = s;
            if (s.length() == 0)
            {
                if (!(annotatedmember instanceof AnnotatedMethod))
                {
                    return annotatedmember.getRawType().getName();
                }
                AnnotatedMethod annotatedmethod = (AnnotatedMethod)annotatedmember;
                if (annotatedmethod.getParameterCount() == 0)
                {
                    return annotatedmember.getRawType().getName();
                } else
                {
                    return annotatedmethod.getRawParameterType(0).getName();
                }
            }
        }
        return obj;
    }

    public Class findKeyDeserializer(Annotated annotated)
    {
        annotated = (JsonDeserialize)_findAnnotation(annotated, com/fasterxml/jackson/databind/annotation/JsonDeserialize);
        if (annotated != null)
        {
            annotated = annotated.keyUsing();
            if (annotated != com/fasterxml/jackson/databind/KeyDeserializer$None)
            {
                return annotated;
            }
        }
        return null;
    }

    public volatile Object findKeyDeserializer(Annotated annotated)
    {
        return findKeyDeserializer(annotated);
    }

    public Class findKeySerializer(Annotated annotated)
    {
        annotated = (JsonSerialize)_findAnnotation(annotated, com/fasterxml/jackson/databind/annotation/JsonSerialize);
        if (annotated != null)
        {
            annotated = annotated.keyUsing();
            if (annotated != com/fasterxml/jackson/databind/JsonSerializer$None)
            {
                return annotated;
            }
        }
        return null;
    }

    public volatile Object findKeySerializer(Annotated annotated)
    {
        return findKeySerializer(annotated);
    }

    public PropertyName findNameForDeserialization(Annotated annotated)
    {
        JsonSetter jsonsetter = (JsonSetter)_findAnnotation(annotated, com/fasterxml/jackson/annotation/JsonSetter);
        if (jsonsetter != null)
        {
            annotated = jsonsetter.value();
        } else
        {
            JsonProperty jsonproperty = (JsonProperty)_findAnnotation(annotated, com/fasterxml/jackson/annotation/JsonProperty);
            if (jsonproperty != null)
            {
                annotated = jsonproperty.value();
            } else
            if (_hasAnnotation(annotated, com/fasterxml/jackson/databind/annotation/JsonDeserialize) || _hasAnnotation(annotated, com/fasterxml/jackson/annotation/JsonView) || _hasAnnotation(annotated, com/fasterxml/jackson/annotation/JsonUnwrapped) || _hasAnnotation(annotated, com/fasterxml/jackson/annotation/JsonBackReference) || _hasAnnotation(annotated, com/fasterxml/jackson/annotation/JsonManagedReference))
            {
                annotated = "";
            } else
            {
                return null;
            }
        }
        if (annotated.length() == 0)
        {
            return PropertyName.USE_DEFAULT;
        } else
        {
            return new PropertyName(annotated);
        }
    }

    public PropertyName findNameForSerialization(Annotated annotated)
    {
        JsonGetter jsongetter = (JsonGetter)_findAnnotation(annotated, com/fasterxml/jackson/annotation/JsonGetter);
        if (jsongetter != null)
        {
            annotated = jsongetter.value();
        } else
        {
            JsonProperty jsonproperty = (JsonProperty)_findAnnotation(annotated, com/fasterxml/jackson/annotation/JsonProperty);
            if (jsonproperty != null)
            {
                annotated = jsonproperty.value();
            } else
            if (_hasAnnotation(annotated, com/fasterxml/jackson/databind/annotation/JsonSerialize) || _hasAnnotation(annotated, com/fasterxml/jackson/annotation/JsonView))
            {
                annotated = "";
            } else
            {
                return null;
            }
        }
        if (annotated.length() == 0)
        {
            return PropertyName.USE_DEFAULT;
        } else
        {
            return new PropertyName(annotated);
        }
    }

    public Object findNamingStrategy(AnnotatedClass annotatedclass)
    {
        annotatedclass = (JsonNaming)_findAnnotation(annotatedclass, com/fasterxml/jackson/databind/annotation/JsonNaming);
        if (annotatedclass == null)
        {
            return null;
        } else
        {
            return annotatedclass.value();
        }
    }

    public Object findNullSerializer(Annotated annotated)
    {
        annotated = (JsonSerialize)_findAnnotation(annotated, com/fasterxml/jackson/databind/annotation/JsonSerialize);
        if (annotated != null)
        {
            annotated = annotated.nullsUsing();
            if (annotated != com/fasterxml/jackson/databind/JsonSerializer$None)
            {
                return annotated;
            }
        }
        return null;
    }

    public ObjectIdInfo findObjectIdInfo(Annotated annotated)
    {
        annotated = (JsonIdentityInfo)_findAnnotation(annotated, com/fasterxml/jackson/annotation/JsonIdentityInfo);
        if (annotated == null || annotated.generator() == com/fasterxml/jackson/annotation/ObjectIdGenerators$None)
        {
            return null;
        } else
        {
            return new ObjectIdInfo(new PropertyName(annotated.property()), annotated.scope(), annotated.generator(), annotated.resolver());
        }
    }

    public ObjectIdInfo findObjectReferenceInfo(Annotated annotated, ObjectIdInfo objectidinfo)
    {
        JsonIdentityReference jsonidentityreference = (JsonIdentityReference)_findAnnotation(annotated, com/fasterxml/jackson/annotation/JsonIdentityReference);
        annotated = objectidinfo;
        if (jsonidentityreference != null)
        {
            annotated = objectidinfo.withAlwaysAsId(jsonidentityreference.alwaysAsId());
        }
        return annotated;
    }

    public Class findPOJOBuilder(AnnotatedClass annotatedclass)
    {
        annotatedclass = (JsonDeserialize)_findAnnotation(annotatedclass, com/fasterxml/jackson/databind/annotation/JsonDeserialize);
        if (annotatedclass == null)
        {
            return null;
        } else
        {
            return _classIfExplicit(annotatedclass.builder());
        }
    }

    public com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder.Value findPOJOBuilderConfig(AnnotatedClass annotatedclass)
    {
        annotatedclass = (JsonPOJOBuilder)_findAnnotation(annotatedclass, com/fasterxml/jackson/databind/annotation/JsonPOJOBuilder);
        if (annotatedclass == null)
        {
            return null;
        } else
        {
            return new com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder.Value(annotatedclass);
        }
    }

    public String[] findPropertiesToIgnore(Annotated annotated)
    {
        annotated = (JsonIgnoreProperties)_findAnnotation(annotated, com/fasterxml/jackson/annotation/JsonIgnoreProperties);
        if (annotated == null)
        {
            return null;
        } else
        {
            return annotated.value();
        }
    }

    public TypeResolverBuilder findPropertyContentTypeResolver(MapperConfig mapperconfig, AnnotatedMember annotatedmember, JavaType javatype)
    {
        if (!javatype.isContainerType())
        {
            throw new IllegalArgumentException((new StringBuilder()).append("Must call method with a container type (got ").append(javatype).append(")").toString());
        } else
        {
            return _findTypeResolver(mapperconfig, annotatedmember, javatype);
        }
    }

    public String findPropertyDefaultValue(Annotated annotated)
    {
        annotated = (JsonProperty)_findAnnotation(annotated, com/fasterxml/jackson/annotation/JsonProperty);
        if (annotated == null)
        {
            return null;
        }
        String s = annotated.defaultValue();
        annotated = s;
        if (s.isEmpty())
        {
            annotated = null;
        }
        return annotated;
    }

    public String findPropertyDescription(Annotated annotated)
    {
        annotated = (JsonPropertyDescription)_findAnnotation(annotated, com/fasterxml/jackson/annotation/JsonPropertyDescription);
        if (annotated == null)
        {
            return null;
        } else
        {
            return annotated.value();
        }
    }

    public Integer findPropertyIndex(Annotated annotated)
    {
        annotated = (JsonProperty)_findAnnotation(annotated, com/fasterxml/jackson/annotation/JsonProperty);
        if (annotated != null)
        {
            int i = annotated.index();
            if (i != -1)
            {
                return Integer.valueOf(i);
            }
        }
        return null;
    }

    public TypeResolverBuilder findPropertyTypeResolver(MapperConfig mapperconfig, AnnotatedMember annotatedmember, JavaType javatype)
    {
        if (javatype.isContainerType())
        {
            return null;
        } else
        {
            return _findTypeResolver(mapperconfig, annotatedmember, javatype);
        }
    }

    public com.fasterxml.jackson.databind.AnnotationIntrospector.ReferenceProperty findReferenceType(AnnotatedMember annotatedmember)
    {
        JsonManagedReference jsonmanagedreference = (JsonManagedReference)_findAnnotation(annotatedmember, com/fasterxml/jackson/annotation/JsonManagedReference);
        if (jsonmanagedreference != null)
        {
            return com.fasterxml.jackson.databind.AnnotationIntrospector.ReferenceProperty.managed(jsonmanagedreference.value());
        }
        annotatedmember = (JsonBackReference)_findAnnotation(annotatedmember, com/fasterxml/jackson/annotation/JsonBackReference);
        if (annotatedmember != null)
        {
            return com.fasterxml.jackson.databind.AnnotationIntrospector.ReferenceProperty.back(annotatedmember.value());
        } else
        {
            return null;
        }
    }

    public PropertyName findRootName(AnnotatedClass annotatedclass)
    {
        JsonRootName jsonrootname = (JsonRootName)_findAnnotation(annotatedclass, com/fasterxml/jackson/annotation/JsonRootName);
        if (jsonrootname == null)
        {
            return null;
        }
        String s = jsonrootname.namespace();
        annotatedclass = s;
        if (s != null)
        {
            annotatedclass = s;
            if (s.length() == 0)
            {
                annotatedclass = null;
            }
        }
        return PropertyName.construct(jsonrootname.value(), annotatedclass);
    }

    public Object findSerializationContentConverter(AnnotatedMember annotatedmember)
    {
        annotatedmember = (JsonSerialize)_findAnnotation(annotatedmember, com/fasterxml/jackson/databind/annotation/JsonSerialize);
        if (annotatedmember == null)
        {
            return null;
        } else
        {
            return _classIfExplicit(annotatedmember.contentConverter(), com/fasterxml/jackson/databind/util/Converter$None);
        }
    }

    public Class findSerializationContentType(Annotated annotated, JavaType javatype)
    {
        annotated = (JsonSerialize)_findAnnotation(annotated, com/fasterxml/jackson/databind/annotation/JsonSerialize);
        if (annotated == null)
        {
            return null;
        } else
        {
            return _classIfExplicit(annotated.contentAs());
        }
    }

    public Object findSerializationConverter(Annotated annotated)
    {
        annotated = (JsonSerialize)_findAnnotation(annotated, com/fasterxml/jackson/databind/annotation/JsonSerialize);
        if (annotated == null)
        {
            return null;
        } else
        {
            return _classIfExplicit(annotated.converter(), com/fasterxml/jackson/databind/util/Converter$None);
        }
    }

    public com.fasterxml.jackson.annotation.JsonInclude.Include findSerializationInclusion(Annotated annotated, com.fasterxml.jackson.annotation.JsonInclude.Include include)
    {
        JsonInclude jsoninclude = (JsonInclude)_findAnnotation(annotated, com/fasterxml/jackson/annotation/JsonInclude);
        if (jsoninclude != null)
        {
            annotated = jsoninclude.value();
        } else
        {
            JsonSerialize jsonserialize = (JsonSerialize)_findAnnotation(annotated, com/fasterxml/jackson/databind/annotation/JsonSerialize);
            annotated = include;
            if (jsonserialize != null)
            {
                annotated = jsonserialize.include();
                static class _cls1
                {

                    static final int $SwitchMap$com$fasterxml$jackson$databind$annotation$JsonSerialize$Inclusion[];

                    static 
                    {
                        $SwitchMap$com$fasterxml$jackson$databind$annotation$JsonSerialize$Inclusion = new int[com.fasterxml.jackson.databind.annotation.JsonSerialize.Inclusion.values().length];
                        try
                        {
                            $SwitchMap$com$fasterxml$jackson$databind$annotation$JsonSerialize$Inclusion[com.fasterxml.jackson.databind.annotation.JsonSerialize.Inclusion.ALWAYS.ordinal()] = 1;
                        }
                        catch (NoSuchFieldError nosuchfielderror4) { }
                        try
                        {
                            $SwitchMap$com$fasterxml$jackson$databind$annotation$JsonSerialize$Inclusion[com.fasterxml.jackson.databind.annotation.JsonSerialize.Inclusion.NON_NULL.ordinal()] = 2;
                        }
                        catch (NoSuchFieldError nosuchfielderror3) { }
                        try
                        {
                            $SwitchMap$com$fasterxml$jackson$databind$annotation$JsonSerialize$Inclusion[com.fasterxml.jackson.databind.annotation.JsonSerialize.Inclusion.NON_DEFAULT.ordinal()] = 3;
                        }
                        catch (NoSuchFieldError nosuchfielderror2) { }
                        try
                        {
                            $SwitchMap$com$fasterxml$jackson$databind$annotation$JsonSerialize$Inclusion[com.fasterxml.jackson.databind.annotation.JsonSerialize.Inclusion.NON_EMPTY.ordinal()] = 4;
                        }
                        catch (NoSuchFieldError nosuchfielderror1) { }
                        try
                        {
                            $SwitchMap$com$fasterxml$jackson$databind$annotation$JsonSerialize$Inclusion[com.fasterxml.jackson.databind.annotation.JsonSerialize.Inclusion.DEFAULT_INCLUSION.ordinal()] = 5;
                        }
                        catch (NoSuchFieldError nosuchfielderror)
                        {
                            return;
                        }
                    }
                }

                switch (_cls1..SwitchMap.com.fasterxml.jackson.databind.annotation.JsonSerialize.Inclusion[annotated.ordinal()])
                {
                default:
                    return include;

                case 1: // '\001'
                    return com.fasterxml.jackson.annotation.JsonInclude.Include.ALWAYS;

                case 2: // '\002'
                    return com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL;

                case 3: // '\003'
                    return com.fasterxml.jackson.annotation.JsonInclude.Include.NON_DEFAULT;

                case 4: // '\004'
                    return com.fasterxml.jackson.annotation.JsonInclude.Include.NON_EMPTY;
                }
            }
        }
        return annotated;
    }

    public com.fasterxml.jackson.annotation.JsonInclude.Include findSerializationInclusionForContent(Annotated annotated, com.fasterxml.jackson.annotation.JsonInclude.Include include)
    {
        annotated = (JsonInclude)_findAnnotation(annotated, com/fasterxml/jackson/annotation/JsonInclude);
        if (annotated == null)
        {
            return include;
        } else
        {
            return annotated.content();
        }
    }

    public Class findSerializationKeyType(Annotated annotated, JavaType javatype)
    {
        annotated = (JsonSerialize)_findAnnotation(annotated, com/fasterxml/jackson/databind/annotation/JsonSerialize);
        if (annotated == null)
        {
            return null;
        } else
        {
            return _classIfExplicit(annotated.keyAs());
        }
    }

    public String[] findSerializationPropertyOrder(AnnotatedClass annotatedclass)
    {
        annotatedclass = (JsonPropertyOrder)_findAnnotation(annotatedclass, com/fasterxml/jackson/annotation/JsonPropertyOrder);
        if (annotatedclass == null)
        {
            return null;
        } else
        {
            return annotatedclass.value();
        }
    }

    public Boolean findSerializationSortAlphabetically(Annotated annotated)
    {
        return _findSortAlpha(annotated);
    }

    public Class findSerializationType(Annotated annotated)
    {
        annotated = (JsonSerialize)_findAnnotation(annotated, com/fasterxml/jackson/databind/annotation/JsonSerialize);
        if (annotated == null)
        {
            return null;
        } else
        {
            return _classIfExplicit(annotated.as());
        }
    }

    public com.fasterxml.jackson.databind.annotation.JsonSerialize.Typing findSerializationTyping(Annotated annotated)
    {
        annotated = (JsonSerialize)_findAnnotation(annotated, com/fasterxml/jackson/databind/annotation/JsonSerialize);
        if (annotated == null)
        {
            return null;
        } else
        {
            return annotated.typing();
        }
    }

    public Object findSerializer(Annotated annotated)
    {
        Object obj = (JsonSerialize)_findAnnotation(annotated, com/fasterxml/jackson/databind/annotation/JsonSerialize);
        if (obj != null)
        {
            obj = ((JsonSerialize) (obj)).using();
            if (obj != com/fasterxml/jackson/databind/JsonSerializer$None)
            {
                return obj;
            }
        }
        obj = (JsonRawValue)_findAnnotation(annotated, com/fasterxml/jackson/annotation/JsonRawValue);
        if (obj != null && ((JsonRawValue) (obj)).value())
        {
            return new RawSerializer(annotated.getRawType());
        } else
        {
            return null;
        }
    }

    public List findSubtypes(Annotated annotated)
    {
        annotated = (JsonSubTypes)_findAnnotation(annotated, com/fasterxml/jackson/annotation/JsonSubTypes);
        if (annotated != null) goto _L2; else goto _L1
_L1:
        annotated = null;
_L4:
        return annotated;
_L2:
        com.fasterxml.jackson.annotation.JsonSubTypes.Type atype[] = annotated.value();
        ArrayList arraylist = new ArrayList(atype.length);
        int j = atype.length;
        int i = 0;
        do
        {
            annotated = arraylist;
            if (i >= j)
            {
                continue;
            }
            annotated = atype[i];
            arraylist.add(new NamedType(annotated.value(), annotated.name()));
            i++;
        } while (true);
        if (true) goto _L4; else goto _L3
_L3:
    }

    public String findTypeName(AnnotatedClass annotatedclass)
    {
        annotatedclass = (JsonTypeName)_findAnnotation(annotatedclass, com/fasterxml/jackson/annotation/JsonTypeName);
        if (annotatedclass == null)
        {
            return null;
        } else
        {
            return annotatedclass.value();
        }
    }

    public TypeResolverBuilder findTypeResolver(MapperConfig mapperconfig, AnnotatedClass annotatedclass, JavaType javatype)
    {
        return _findTypeResolver(mapperconfig, annotatedclass, javatype);
    }

    public NameTransformer findUnwrappingNameTransformer(AnnotatedMember annotatedmember)
    {
        annotatedmember = (JsonUnwrapped)_findAnnotation(annotatedmember, com/fasterxml/jackson/annotation/JsonUnwrapped);
        if (annotatedmember == null || !annotatedmember.enabled())
        {
            return null;
        } else
        {
            return NameTransformer.simpleTransformer(annotatedmember.prefix(), annotatedmember.suffix());
        }
    }

    public Object findValueInstantiator(AnnotatedClass annotatedclass)
    {
        annotatedclass = (JsonValueInstantiator)_findAnnotation(annotatedclass, com/fasterxml/jackson/databind/annotation/JsonValueInstantiator);
        if (annotatedclass == null)
        {
            return null;
        } else
        {
            return annotatedclass.value();
        }
    }

    public Class[] findViews(Annotated annotated)
    {
        annotated = (JsonView)_findAnnotation(annotated, com/fasterxml/jackson/annotation/JsonView);
        if (annotated == null)
        {
            return null;
        } else
        {
            return annotated.value();
        }
    }

    public boolean hasAnyGetterAnnotation(AnnotatedMethod annotatedmethod)
    {
        return _hasAnnotation(annotatedmethod, com/fasterxml/jackson/annotation/JsonAnyGetter);
    }

    public boolean hasAnySetterAnnotation(AnnotatedMethod annotatedmethod)
    {
        return _hasAnnotation(annotatedmethod, com/fasterxml/jackson/annotation/JsonAnySetter);
    }

    public boolean hasAsValueAnnotation(AnnotatedMethod annotatedmethod)
    {
        annotatedmethod = (JsonValue)_findAnnotation(annotatedmethod, com/fasterxml/jackson/annotation/JsonValue);
        return annotatedmethod != null && annotatedmethod.value();
    }

    public boolean hasCreatorAnnotation(Annotated annotated)
    {
        annotated = (JsonCreator)_findAnnotation(annotated, com/fasterxml/jackson/annotation/JsonCreator);
        return annotated != null && annotated.mode() != com.fasterxml.jackson.annotation.JsonCreator.Mode.DISABLED;
    }

    public boolean hasIgnoreMarker(AnnotatedMember annotatedmember)
    {
        return _isIgnorable(annotatedmember);
    }

    public Boolean hasRequiredMarker(AnnotatedMember annotatedmember)
    {
        annotatedmember = (JsonProperty)_findAnnotation(annotatedmember, com/fasterxml/jackson/annotation/JsonProperty);
        if (annotatedmember != null)
        {
            return Boolean.valueOf(annotatedmember.required());
        } else
        {
            return null;
        }
    }

    public boolean isAnnotationBundle(Annotation annotation)
    {
        return annotation.annotationType().getAnnotation(com/fasterxml/jackson/annotation/JacksonAnnotationsInside) != null;
    }

    public Boolean isIgnorableType(AnnotatedClass annotatedclass)
    {
        annotatedclass = (JsonIgnoreType)_findAnnotation(annotatedclass, com/fasterxml/jackson/annotation/JsonIgnoreType);
        if (annotatedclass == null)
        {
            return null;
        } else
        {
            return Boolean.valueOf(annotatedclass.value());
        }
    }

    public Boolean isTypeId(AnnotatedMember annotatedmember)
    {
        return Boolean.valueOf(_hasAnnotation(annotatedmember, com/fasterxml/jackson/annotation/JsonTypeId));
    }
}
