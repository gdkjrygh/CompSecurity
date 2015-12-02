// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fasterxml.jackson.databind.introspect;

import com.fasterxml.jackson.annotation.JacksonAnnotation;
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
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonIgnoreType;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import com.fasterxml.jackson.annotation.JsonProperty;
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
import com.fasterxml.jackson.core.Version;
import com.fasterxml.jackson.databind.AnnotationIntrospector;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.fasterxml.jackson.databind.annotation.JsonTypeIdResolver;
import com.fasterxml.jackson.databind.annotation.JsonTypeResolver;
import com.fasterxml.jackson.databind.annotation.JsonValueInstantiator;
import com.fasterxml.jackson.databind.annotation.NoClass;
import com.fasterxml.jackson.databind.cfg.DatabindVersion;
import com.fasterxml.jackson.databind.cfg.MapperConfig;
import com.fasterxml.jackson.databind.jsontype.NamedType;
import com.fasterxml.jackson.databind.jsontype.TypeIdResolver;
import com.fasterxml.jackson.databind.jsontype.TypeResolverBuilder;
import com.fasterxml.jackson.databind.jsontype.impl.StdTypeResolverBuilder;
import com.fasterxml.jackson.databind.ser.std.RawSerializer;
import com.fasterxml.jackson.databind.util.NameTransformer;
import java.lang.annotation.Annotation;
import java.util.ArrayList;
import java.util.List;

// Referenced classes of package com.fasterxml.jackson.databind.introspect:
//            Annotated, AnnotatedClass, VisibilityChecker, AnnotatedField, 
//            AnnotatedMethod, AnnotatedParameter, AnnotatedMember, ObjectIdInfo

public class JacksonAnnotationIntrospector extends AnnotationIntrospector
{

    public JacksonAnnotationIntrospector()
    {
    }

    protected StdTypeResolverBuilder _constructNoTypeResolverBuilder()
    {
        return StdTypeResolverBuilder.noTypeInfoBuilder();
    }

    protected StdTypeResolverBuilder _constructStdTypeResolverBuilder()
    {
        return new StdTypeResolverBuilder();
    }

    protected TypeResolverBuilder _findTypeResolver(MapperConfig mapperconfig, Annotated annotated, JavaType javatype)
    {
        Object obj1 = null;
        JsonTypeInfo jsontypeinfo = (JsonTypeInfo)annotated.getAnnotation(com/fasterxml/jackson/annotation/JsonTypeInfo);
        Object obj = (JsonTypeResolver)annotated.getAnnotation(com/fasterxml/jackson/databind/annotation/JsonTypeResolver);
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
        jsontypeidresolver = (JsonTypeIdResolver)annotated.getAnnotation(com/fasterxml/jackson/databind/annotation/JsonTypeIdResolver);
        if (jsontypeidresolver == null)
        {
            mapperconfig = obj1;
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
            mapperconfig = annotated.defaultImpl(javatype);
        }
        return mapperconfig.typeIdVisibility(jsontypeinfo.visible());
    }

    protected boolean _isIgnorable(Annotated annotated)
    {
        annotated = (JsonIgnore)annotated.getAnnotation(com/fasterxml/jackson/annotation/JsonIgnore);
        return annotated != null && annotated.value();
    }

    public VisibilityChecker findAutoDetectVisibility(AnnotatedClass annotatedclass, VisibilityChecker visibilitychecker)
    {
        annotatedclass = (JsonAutoDetect)annotatedclass.getAnnotation(com/fasterxml/jackson/annotation/JsonAutoDetect);
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
        annotated = (JsonDeserialize)annotated.getAnnotation(com/fasterxml/jackson/databind/annotation/JsonDeserialize);
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
        annotated = (JsonSerialize)annotated.getAnnotation(com/fasterxml/jackson/databind/annotation/JsonSerialize);
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

    public Class findDeserializationContentType(Annotated annotated, JavaType javatype)
    {
        annotated = (JsonDeserialize)annotated.getAnnotation(com/fasterxml/jackson/databind/annotation/JsonDeserialize);
        if (annotated != null)
        {
            annotated = annotated.contentAs();
            if (annotated != com/fasterxml/jackson/databind/annotation/NoClass)
            {
                return annotated;
            }
        }
        return null;
    }

    public Class findDeserializationKeyType(Annotated annotated, JavaType javatype)
    {
        annotated = (JsonDeserialize)annotated.getAnnotation(com/fasterxml/jackson/databind/annotation/JsonDeserialize);
        if (annotated != null)
        {
            annotated = annotated.keyAs();
            if (annotated != com/fasterxml/jackson/databind/annotation/NoClass)
            {
                return annotated;
            }
        }
        return null;
    }

    public String findDeserializationName(AnnotatedField annotatedfield)
    {
        JsonProperty jsonproperty = (JsonProperty)annotatedfield.getAnnotation(com/fasterxml/jackson/annotation/JsonProperty);
        if (jsonproperty != null)
        {
            return jsonproperty.value();
        }
        if (annotatedfield.hasAnnotation(com/fasterxml/jackson/databind/annotation/JsonDeserialize) || annotatedfield.hasAnnotation(com/fasterxml/jackson/annotation/JsonView) || annotatedfield.hasAnnotation(com/fasterxml/jackson/annotation/JsonBackReference) || annotatedfield.hasAnnotation(com/fasterxml/jackson/annotation/JsonManagedReference))
        {
            return "";
        } else
        {
            return null;
        }
    }

    public String findDeserializationName(AnnotatedMethod annotatedmethod)
    {
        Object obj = (JsonSetter)annotatedmethod.getAnnotation(com/fasterxml/jackson/annotation/JsonSetter);
        if (obj != null)
        {
            return ((JsonSetter) (obj)).value();
        }
        obj = (JsonProperty)annotatedmethod.getAnnotation(com/fasterxml/jackson/annotation/JsonProperty);
        if (obj != null)
        {
            return ((JsonProperty) (obj)).value();
        }
        if (annotatedmethod.hasAnnotation(com/fasterxml/jackson/databind/annotation/JsonDeserialize) || annotatedmethod.hasAnnotation(com/fasterxml/jackson/annotation/JsonView) || annotatedmethod.hasAnnotation(com/fasterxml/jackson/annotation/JsonBackReference) || annotatedmethod.hasAnnotation(com/fasterxml/jackson/annotation/JsonManagedReference))
        {
            return "";
        } else
        {
            return null;
        }
    }

    public String findDeserializationName(AnnotatedParameter annotatedparameter)
    {
        if (annotatedparameter != null)
        {
            annotatedparameter = (JsonProperty)annotatedparameter.getAnnotation(com/fasterxml/jackson/annotation/JsonProperty);
            if (annotatedparameter != null)
            {
                return annotatedparameter.value();
            }
        }
        return null;
    }

    public Class findDeserializationType(Annotated annotated, JavaType javatype)
    {
        annotated = (JsonDeserialize)annotated.getAnnotation(com/fasterxml/jackson/databind/annotation/JsonDeserialize);
        if (annotated != null)
        {
            annotated = annotated.as();
            if (annotated != com/fasterxml/jackson/databind/annotation/NoClass)
            {
                return annotated;
            }
        }
        return null;
    }

    public Class findDeserializer(Annotated annotated)
    {
        annotated = (JsonDeserialize)annotated.getAnnotation(com/fasterxml/jackson/databind/annotation/JsonDeserialize);
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

    public String findEnumValue(Enum enum)
    {
        return enum.name();
    }

    public Object findFilterId(AnnotatedClass annotatedclass)
    {
        annotatedclass = (JsonFilter)annotatedclass.getAnnotation(com/fasterxml/jackson/annotation/JsonFilter);
        if (annotatedclass != null)
        {
            annotatedclass = annotatedclass.value();
            if (annotatedclass.length() > 0)
            {
                return annotatedclass;
            }
        }
        return null;
    }

    public com.fasterxml.jackson.annotation.JsonFormat.Value findFormat(AnnotatedMember annotatedmember)
    {
        annotatedmember = (JsonFormat)annotatedmember.getAnnotation(com/fasterxml/jackson/annotation/JsonFormat);
        if (annotatedmember == null)
        {
            return null;
        } else
        {
            return new com.fasterxml.jackson.annotation.JsonFormat.Value(annotatedmember);
        }
    }

    public Boolean findIgnoreUnknownProperties(AnnotatedClass annotatedclass)
    {
        annotatedclass = (JsonIgnoreProperties)annotatedclass.getAnnotation(com/fasterxml/jackson/annotation/JsonIgnoreProperties);
        if (annotatedclass == null)
        {
            return null;
        } else
        {
            return Boolean.valueOf(annotatedclass.ignoreUnknown());
        }
    }

    public Object findInjectableValueId(AnnotatedMember annotatedmember)
    {
        Object obj = (JacksonInject)annotatedmember.getAnnotation(com/fasterxml/jackson/annotation/JacksonInject);
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
        annotated = (JsonDeserialize)annotated.getAnnotation(com/fasterxml/jackson/databind/annotation/JsonDeserialize);
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
        annotated = (JsonSerialize)annotated.getAnnotation(com/fasterxml/jackson/databind/annotation/JsonSerialize);
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

    public ObjectIdInfo findObjectIdInfo(Annotated annotated)
    {
        annotated = (JsonIdentityInfo)annotated.getAnnotation(com/fasterxml/jackson/annotation/JsonIdentityInfo);
        if (annotated == null || annotated.generator() == com/fasterxml/jackson/annotation/ObjectIdGenerators$None)
        {
            return null;
        } else
        {
            return new ObjectIdInfo(annotated.property(), annotated.scope(), annotated.generator());
        }
    }

    public Class findPOJOBuilder(AnnotatedClass annotatedclass)
    {
        annotatedclass = (JsonDeserialize)annotatedclass.getAnnotation(com/fasterxml/jackson/databind/annotation/JsonDeserialize);
        if (annotatedclass == null || annotatedclass.builder() == com/fasterxml/jackson/databind/annotation/NoClass)
        {
            return null;
        } else
        {
            return annotatedclass.builder();
        }
    }

    public com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder.Value findPOJOBuilderConfig(AnnotatedClass annotatedclass)
    {
        annotatedclass = (JsonPOJOBuilder)annotatedclass.getAnnotation(com/fasterxml/jackson/databind/annotation/JsonPOJOBuilder);
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
        annotated = (JsonIgnoreProperties)annotated.getAnnotation(com/fasterxml/jackson/annotation/JsonIgnoreProperties);
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
        JsonManagedReference jsonmanagedreference = (JsonManagedReference)annotatedmember.getAnnotation(com/fasterxml/jackson/annotation/JsonManagedReference);
        if (jsonmanagedreference != null)
        {
            return com.fasterxml.jackson.databind.AnnotationIntrospector.ReferenceProperty.managed(jsonmanagedreference.value());
        }
        annotatedmember = (JsonBackReference)annotatedmember.getAnnotation(com/fasterxml/jackson/annotation/JsonBackReference);
        if (annotatedmember != null)
        {
            return com.fasterxml.jackson.databind.AnnotationIntrospector.ReferenceProperty.back(annotatedmember.value());
        } else
        {
            return null;
        }
    }

    public String findRootName(AnnotatedClass annotatedclass)
    {
        annotatedclass = (JsonRootName)annotatedclass.getAnnotation(com/fasterxml/jackson/annotation/JsonRootName);
        if (annotatedclass == null)
        {
            return null;
        } else
        {
            return annotatedclass.value();
        }
    }

    public Class findSerializationContentType(Annotated annotated, JavaType javatype)
    {
        annotated = (JsonSerialize)annotated.getAnnotation(com/fasterxml/jackson/databind/annotation/JsonSerialize);
        if (annotated != null)
        {
            annotated = annotated.contentAs();
            if (annotated != com/fasterxml/jackson/databind/annotation/NoClass)
            {
                return annotated;
            }
        }
        return null;
    }

    public com.fasterxml.jackson.annotation.JsonInclude.Include findSerializationInclusion(Annotated annotated, com.fasterxml.jackson.annotation.JsonInclude.Include include)
    {
        JsonInclude jsoninclude = (JsonInclude)annotated.getAnnotation(com/fasterxml/jackson/annotation/JsonInclude);
        if (jsoninclude != null)
        {
            annotated = jsoninclude.value();
        } else
        {
            JsonSerialize jsonserialize = (JsonSerialize)annotated.getAnnotation(com/fasterxml/jackson/databind/annotation/JsonSerialize);
            annotated = include;
            if (jsonserialize != null)
            {
                annotated = jsonserialize.include();
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

    public Class findSerializationKeyType(Annotated annotated, JavaType javatype)
    {
        annotated = (JsonSerialize)annotated.getAnnotation(com/fasterxml/jackson/databind/annotation/JsonSerialize);
        if (annotated != null)
        {
            annotated = annotated.keyAs();
            if (annotated != com/fasterxml/jackson/databind/annotation/NoClass)
            {
                return annotated;
            }
        }
        return null;
    }

    public String findSerializationName(AnnotatedField annotatedfield)
    {
        JsonProperty jsonproperty = (JsonProperty)annotatedfield.getAnnotation(com/fasterxml/jackson/annotation/JsonProperty);
        if (jsonproperty != null)
        {
            return jsonproperty.value();
        }
        if (annotatedfield.hasAnnotation(com/fasterxml/jackson/databind/annotation/JsonSerialize) || annotatedfield.hasAnnotation(com/fasterxml/jackson/annotation/JsonView))
        {
            return "";
        } else
        {
            return null;
        }
    }

    public String findSerializationName(AnnotatedMethod annotatedmethod)
    {
        Object obj = (JsonGetter)annotatedmethod.getAnnotation(com/fasterxml/jackson/annotation/JsonGetter);
        if (obj != null)
        {
            return ((JsonGetter) (obj)).value();
        }
        obj = (JsonProperty)annotatedmethod.getAnnotation(com/fasterxml/jackson/annotation/JsonProperty);
        if (obj != null)
        {
            return ((JsonProperty) (obj)).value();
        }
        if (annotatedmethod.hasAnnotation(com/fasterxml/jackson/databind/annotation/JsonSerialize) || annotatedmethod.hasAnnotation(com/fasterxml/jackson/annotation/JsonView))
        {
            return "";
        } else
        {
            return null;
        }
    }

    public String[] findSerializationPropertyOrder(AnnotatedClass annotatedclass)
    {
        annotatedclass = (JsonPropertyOrder)annotatedclass.getAnnotation(com/fasterxml/jackson/annotation/JsonPropertyOrder);
        if (annotatedclass == null)
        {
            return null;
        } else
        {
            return annotatedclass.value();
        }
    }

    public Boolean findSerializationSortAlphabetically(AnnotatedClass annotatedclass)
    {
        annotatedclass = (JsonPropertyOrder)annotatedclass.getAnnotation(com/fasterxml/jackson/annotation/JsonPropertyOrder);
        if (annotatedclass == null)
        {
            return null;
        } else
        {
            return Boolean.valueOf(annotatedclass.alphabetic());
        }
    }

    public Class findSerializationType(Annotated annotated)
    {
        annotated = (JsonSerialize)annotated.getAnnotation(com/fasterxml/jackson/databind/annotation/JsonSerialize);
        if (annotated != null)
        {
            annotated = annotated.as();
            if (annotated != com/fasterxml/jackson/databind/annotation/NoClass)
            {
                return annotated;
            }
        }
        return null;
    }

    public com.fasterxml.jackson.databind.annotation.JsonSerialize.Typing findSerializationTyping(Annotated annotated)
    {
        annotated = (JsonSerialize)annotated.getAnnotation(com/fasterxml/jackson/databind/annotation/JsonSerialize);
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
        Object obj = (JsonSerialize)annotated.getAnnotation(com/fasterxml/jackson/databind/annotation/JsonSerialize);
        if (obj != null)
        {
            obj = ((JsonSerialize) (obj)).using();
            if (obj != com/fasterxml/jackson/databind/JsonSerializer$None)
            {
                return obj;
            }
        }
        obj = (JsonRawValue)annotated.getAnnotation(com/fasterxml/jackson/annotation/JsonRawValue);
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
        annotated = (JsonSubTypes)annotated.getAnnotation(com/fasterxml/jackson/annotation/JsonSubTypes);
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
        annotatedclass = (JsonTypeName)annotatedclass.getAnnotation(com/fasterxml/jackson/annotation/JsonTypeName);
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
        annotatedmember = (JsonUnwrapped)annotatedmember.getAnnotation(com/fasterxml/jackson/annotation/JsonUnwrapped);
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
        annotatedclass = (JsonValueInstantiator)annotatedclass.getAnnotation(com/fasterxml/jackson/databind/annotation/JsonValueInstantiator);
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
        annotated = (JsonView)annotated.getAnnotation(com/fasterxml/jackson/annotation/JsonView);
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
        return annotatedmethod.hasAnnotation(com/fasterxml/jackson/annotation/JsonAnyGetter);
    }

    public boolean hasAnySetterAnnotation(AnnotatedMethod annotatedmethod)
    {
        return annotatedmethod.hasAnnotation(com/fasterxml/jackson/annotation/JsonAnySetter);
    }

    public boolean hasAsValueAnnotation(AnnotatedMethod annotatedmethod)
    {
        annotatedmethod = (JsonValue)annotatedmethod.getAnnotation(com/fasterxml/jackson/annotation/JsonValue);
        return annotatedmethod != null && annotatedmethod.value();
    }

    public boolean hasCreatorAnnotation(Annotated annotated)
    {
        return annotated.hasAnnotation(com/fasterxml/jackson/annotation/JsonCreator);
    }

    public boolean hasIgnoreMarker(AnnotatedMember annotatedmember)
    {
        return _isIgnorable(annotatedmember);
    }

    public Boolean hasRequiredMarker(AnnotatedMember annotatedmember)
    {
        annotatedmember = (JsonProperty)annotatedmember.getAnnotation(com/fasterxml/jackson/annotation/JsonProperty);
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

    public boolean isHandled(Annotation annotation)
    {
        return annotation.annotationType().getAnnotation(com/fasterxml/jackson/annotation/JacksonAnnotation) != null;
    }

    public Boolean isIgnorableType(AnnotatedClass annotatedclass)
    {
        annotatedclass = (JsonIgnoreType)annotatedclass.getAnnotation(com/fasterxml/jackson/annotation/JsonIgnoreType);
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
        return Boolean.valueOf(annotatedmember.hasAnnotation(com/fasterxml/jackson/annotation/JsonTypeId));
    }

    public Version version()
    {
        return DatabindVersion.instance.version();
    }

    private class _cls1
    {

        static final int $SwitchMap$com$fasterxml$jackson$databind$annotation$JsonSerialize$Inclusion[];

        static 
        {
            $SwitchMap$com$fasterxml$jackson$databind$annotation$JsonSerialize$Inclusion = new int[com.fasterxml.jackson.databind.annotation.JsonSerialize.Inclusion.values().length];
            try
            {
                $SwitchMap$com$fasterxml$jackson$databind$annotation$JsonSerialize$Inclusion[com.fasterxml.jackson.databind.annotation.JsonSerialize.Inclusion.ALWAYS.ordinal()] = 1;
            }
            catch (NoSuchFieldError nosuchfielderror3) { }
            try
            {
                $SwitchMap$com$fasterxml$jackson$databind$annotation$JsonSerialize$Inclusion[com.fasterxml.jackson.databind.annotation.JsonSerialize.Inclusion.NON_NULL.ordinal()] = 2;
            }
            catch (NoSuchFieldError nosuchfielderror2) { }
            try
            {
                $SwitchMap$com$fasterxml$jackson$databind$annotation$JsonSerialize$Inclusion[com.fasterxml.jackson.databind.annotation.JsonSerialize.Inclusion.NON_DEFAULT.ordinal()] = 3;
            }
            catch (NoSuchFieldError nosuchfielderror1) { }
            try
            {
                $SwitchMap$com$fasterxml$jackson$databind$annotation$JsonSerialize$Inclusion[com.fasterxml.jackson.databind.annotation.JsonSerialize.Inclusion.NON_EMPTY.ordinal()] = 4;
            }
            catch (NoSuchFieldError nosuchfielderror)
            {
                return;
            }
        }
    }

}
