// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fasterxml.jackson.databind;

import com.fasterxml.jackson.databind.cfg.MapperConfig;
import com.fasterxml.jackson.databind.introspect.Annotated;
import com.fasterxml.jackson.databind.introspect.AnnotatedClass;
import com.fasterxml.jackson.databind.introspect.AnnotatedField;
import com.fasterxml.jackson.databind.introspect.AnnotatedMember;
import com.fasterxml.jackson.databind.introspect.AnnotatedMethod;
import com.fasterxml.jackson.databind.introspect.AnnotatedParameter;
import com.fasterxml.jackson.databind.introspect.NopAnnotationIntrospector;
import com.fasterxml.jackson.databind.introspect.ObjectIdInfo;
import com.fasterxml.jackson.databind.introspect.VisibilityChecker;
import com.fasterxml.jackson.databind.jsontype.TypeResolverBuilder;
import com.fasterxml.jackson.databind.util.NameTransformer;
import java.lang.annotation.Annotation;
import java.util.List;

// Referenced classes of package com.fasterxml.jackson.databind:
//            PropertyName, JavaType

public abstract class AnnotationIntrospector
{
    public static class ReferenceProperty
    {

        private final String _name;
        private final Type _type;

        public static ReferenceProperty back(String s)
        {
            return new ReferenceProperty(Type.BACK_REFERENCE, s);
        }

        public static ReferenceProperty managed(String s)
        {
            return new ReferenceProperty(Type.MANAGED_REFERENCE, s);
        }

        public String getName()
        {
            return _name;
        }

        public boolean isBackReference()
        {
            return _type == Type.BACK_REFERENCE;
        }

        public boolean isManagedReference()
        {
            return _type == Type.MANAGED_REFERENCE;
        }

        public ReferenceProperty(Type type, String s)
        {
            _type = type;
            _name = s;
        }
    }

    public static final class ReferenceProperty.Type extends Enum
    {

        private static final ReferenceProperty.Type $VALUES[];
        public static final ReferenceProperty.Type BACK_REFERENCE;
        public static final ReferenceProperty.Type MANAGED_REFERENCE;

        public static ReferenceProperty.Type valueOf(String s)
        {
            return (ReferenceProperty.Type)Enum.valueOf(com/fasterxml/jackson/databind/AnnotationIntrospector$ReferenceProperty$Type, s);
        }

        public static ReferenceProperty.Type[] values()
        {
            return (ReferenceProperty.Type[])$VALUES.clone();
        }

        static 
        {
            MANAGED_REFERENCE = new ReferenceProperty.Type("MANAGED_REFERENCE", 0);
            BACK_REFERENCE = new ReferenceProperty.Type("BACK_REFERENCE", 1);
            $VALUES = (new ReferenceProperty.Type[] {
                MANAGED_REFERENCE, BACK_REFERENCE
            });
        }

        private ReferenceProperty.Type(String s, int i)
        {
            super(s, i);
        }
    }


    public AnnotationIntrospector()
    {
    }

    public static AnnotationIntrospector nopInstance()
    {
        return NopAnnotationIntrospector.instance;
    }

    public VisibilityChecker findAutoDetectVisibility(AnnotatedClass annotatedclass, VisibilityChecker visibilitychecker)
    {
        return visibilitychecker;
    }

    public Object findContentDeserializer(Annotated annotated)
    {
        return null;
    }

    public Object findContentSerializer(Annotated annotated)
    {
        return null;
    }

    public Class findDeserializationContentType(Annotated annotated, JavaType javatype)
    {
        return null;
    }

    public Class findDeserializationKeyType(Annotated annotated, JavaType javatype)
    {
        return null;
    }

    public String findDeserializationName(AnnotatedField annotatedfield)
    {
        return null;
    }

    public String findDeserializationName(AnnotatedMethod annotatedmethod)
    {
        return null;
    }

    public String findDeserializationName(AnnotatedParameter annotatedparameter)
    {
        return null;
    }

    public Class findDeserializationType(Annotated annotated, JavaType javatype)
    {
        return null;
    }

    public Object findDeserializer(Annotated annotated)
    {
        return null;
    }

    public String findEnumValue(Enum enum)
    {
        return enum.name();
    }

    public Object findFilterId(AnnotatedClass annotatedclass)
    {
        return null;
    }

    public com.fasterxml.jackson.annotation.JsonFormat.Value findFormat(Annotated annotated)
    {
        if (annotated instanceof AnnotatedMember)
        {
            return findFormat((AnnotatedMember)annotated);
        } else
        {
            return null;
        }
    }

    public com.fasterxml.jackson.annotation.JsonFormat.Value findFormat(AnnotatedMember annotatedmember)
    {
        return null;
    }

    public Boolean findIgnoreUnknownProperties(AnnotatedClass annotatedclass)
    {
        return null;
    }

    public Object findInjectableValueId(AnnotatedMember annotatedmember)
    {
        return null;
    }

    public Object findKeyDeserializer(Annotated annotated)
    {
        return null;
    }

    public Object findKeySerializer(Annotated annotated)
    {
        return null;
    }

    public PropertyName findNameForDeserialization(Annotated annotated)
    {
label0:
        {
            PropertyName propertyname = null;
            if (annotated instanceof AnnotatedField)
            {
                annotated = findDeserializationName((AnnotatedField)annotated);
            } else
            if (annotated instanceof AnnotatedMethod)
            {
                annotated = findDeserializationName((AnnotatedMethod)annotated);
            } else
            if (annotated instanceof AnnotatedParameter)
            {
                annotated = findDeserializationName((AnnotatedParameter)annotated);
            } else
            {
                annotated = null;
            }
            if (annotated != null)
            {
                if (annotated.length() != 0)
                {
                    break label0;
                }
                propertyname = PropertyName.USE_DEFAULT;
            }
            return propertyname;
        }
        return new PropertyName(annotated);
    }

    public PropertyName findNameForSerialization(Annotated annotated)
    {
label0:
        {
            PropertyName propertyname = null;
            if (annotated instanceof AnnotatedField)
            {
                annotated = findSerializationName((AnnotatedField)annotated);
            } else
            if (annotated instanceof AnnotatedMethod)
            {
                annotated = findSerializationName((AnnotatedMethod)annotated);
            } else
            {
                annotated = null;
            }
            if (annotated != null)
            {
                if (annotated.length() != 0)
                {
                    break label0;
                }
                propertyname = PropertyName.USE_DEFAULT;
            }
            return propertyname;
        }
        return new PropertyName(annotated);
    }

    public Object findNamingStrategy(AnnotatedClass annotatedclass)
    {
        return null;
    }

    public ObjectIdInfo findObjectIdInfo(Annotated annotated)
    {
        return null;
    }

    public ObjectIdInfo findObjectReferenceInfo(Annotated annotated, ObjectIdInfo objectidinfo)
    {
        return objectidinfo;
    }

    public Class findPOJOBuilder(AnnotatedClass annotatedclass)
    {
        return null;
    }

    public com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder.Value findPOJOBuilderConfig(AnnotatedClass annotatedclass)
    {
        return null;
    }

    public String[] findPropertiesToIgnore(Annotated annotated)
    {
        return null;
    }

    public TypeResolverBuilder findPropertyContentTypeResolver(MapperConfig mapperconfig, AnnotatedMember annotatedmember, JavaType javatype)
    {
        return null;
    }

    public TypeResolverBuilder findPropertyTypeResolver(MapperConfig mapperconfig, AnnotatedMember annotatedmember, JavaType javatype)
    {
        return null;
    }

    public ReferenceProperty findReferenceType(AnnotatedMember annotatedmember)
    {
        return null;
    }

    public PropertyName findRootName(AnnotatedClass annotatedclass)
    {
        return null;
    }

    public Class findSerializationContentType(Annotated annotated, JavaType javatype)
    {
        return null;
    }

    public com.fasterxml.jackson.annotation.JsonInclude.Include findSerializationInclusion(Annotated annotated, com.fasterxml.jackson.annotation.JsonInclude.Include include)
    {
        return include;
    }

    public Class findSerializationKeyType(Annotated annotated, JavaType javatype)
    {
        return null;
    }

    public String findSerializationName(AnnotatedField annotatedfield)
    {
        return null;
    }

    public String findSerializationName(AnnotatedMethod annotatedmethod)
    {
        return null;
    }

    public String[] findSerializationPropertyOrder(AnnotatedClass annotatedclass)
    {
        return null;
    }

    public Boolean findSerializationSortAlphabetically(AnnotatedClass annotatedclass)
    {
        return null;
    }

    public Class findSerializationType(Annotated annotated)
    {
        return null;
    }

    public com.fasterxml.jackson.databind.annotation.JsonSerialize.Typing findSerializationTyping(Annotated annotated)
    {
        return null;
    }

    public Object findSerializer(Annotated annotated)
    {
        return null;
    }

    public List findSubtypes(Annotated annotated)
    {
        return null;
    }

    public String findTypeName(AnnotatedClass annotatedclass)
    {
        return null;
    }

    public TypeResolverBuilder findTypeResolver(MapperConfig mapperconfig, AnnotatedClass annotatedclass, JavaType javatype)
    {
        return null;
    }

    public NameTransformer findUnwrappingNameTransformer(AnnotatedMember annotatedmember)
    {
        return null;
    }

    public Object findValueInstantiator(AnnotatedClass annotatedclass)
    {
        return null;
    }

    public Class[] findViews(Annotated annotated)
    {
        return null;
    }

    public PropertyName findWrapperName(Annotated annotated)
    {
        return null;
    }

    public boolean hasAnyGetterAnnotation(AnnotatedMethod annotatedmethod)
    {
        return false;
    }

    public boolean hasAnySetterAnnotation(AnnotatedMethod annotatedmethod)
    {
        return false;
    }

    public boolean hasAsValueAnnotation(AnnotatedMethod annotatedmethod)
    {
        return false;
    }

    public boolean hasCreatorAnnotation(Annotated annotated)
    {
        return false;
    }

    public boolean hasIgnoreMarker(AnnotatedMember annotatedmember)
    {
        return false;
    }

    public boolean isAnnotationBundle(Annotation annotation)
    {
        return false;
    }

    public Boolean isIgnorableType(AnnotatedClass annotatedclass)
    {
        return null;
    }

    public Boolean isTypeId(AnnotatedMember annotatedmember)
    {
        return null;
    }
}
