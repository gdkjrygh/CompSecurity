// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fasterxml.jackson.databind;

import com.fasterxml.jackson.core.Version;
import com.fasterxml.jackson.core.Versioned;
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
import java.util.Collection;
import java.util.Collections;
import java.util.List;

// Referenced classes of package com.fasterxml.jackson.databind:
//            JavaType

public abstract class AnnotationIntrospector
    implements Versioned
{

    public AnnotationIntrospector()
    {
    }

    public static AnnotationIntrospector nopInstance()
    {
        return NopAnnotationIntrospector.instance;
    }

    public static AnnotationIntrospector pair(AnnotationIntrospector annotationintrospector, AnnotationIntrospector annotationintrospector1)
    {
        return annotationintrospector. new Pair(annotationintrospector1);
    }

    public Collection allIntrospectors()
    {
        return Collections.singletonList(this);
    }

    public Collection allIntrospectors(Collection collection)
    {
        collection.add(this);
        return collection;
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
        return null;
    }

    public Object findFilterId(AnnotatedClass annotatedclass)
    {
        return null;
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

    public ObjectIdInfo findObjectIdInfo(Annotated annotated)
    {
        return null;
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

    public String findRootName(AnnotatedClass annotatedclass)
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

    public Boolean hasRequiredMarker(AnnotatedMember annotatedmember)
    {
        return null;
    }

    public boolean isAnnotationBundle(Annotation annotation)
    {
        return false;
    }

    public boolean isHandled(Annotation annotation)
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

    public abstract Version version();

    private class Pair extends AnnotationIntrospector
    {

        protected final AnnotationIntrospector _primary;
        protected final AnnotationIntrospector _secondary;

        public static AnnotationIntrospector create(AnnotationIntrospector annotationintrospector, AnnotationIntrospector annotationintrospector1)
        {
            if (annotationintrospector == null)
            {
                return annotationintrospector1;
            }
            if (annotationintrospector1 == null)
            {
                return annotationintrospector;
            } else
            {
                return annotationintrospector. new Pair(annotationintrospector1);
            }
        }

        public Collection allIntrospectors()
        {
            return allIntrospectors(((Collection) (new ArrayList())));
        }

        public Collection allIntrospectors(Collection collection)
        {
            _primary.allIntrospectors(collection);
            _secondary.allIntrospectors(collection);
            return collection;
        }

        public VisibilityChecker findAutoDetectVisibility(AnnotatedClass annotatedclass, VisibilityChecker visibilitychecker)
        {
            visibilitychecker = _secondary.findAutoDetectVisibility(annotatedclass, visibilitychecker);
            return _primary.findAutoDetectVisibility(annotatedclass, visibilitychecker);
        }

        public Object findContentDeserializer(Annotated annotated)
        {
            Object obj;
label0:
            {
                Object obj1 = _primary.findContentDeserializer(annotated);
                if (obj1 != null && obj1 != com/fasterxml/jackson/databind/JsonDeserializer$None)
                {
                    obj = obj1;
                    if (obj1 != com/fasterxml/jackson/databind/annotation/NoClass)
                    {
                        break label0;
                    }
                }
                obj = _secondary.findContentDeserializer(annotated);
            }
            return obj;
        }

        public Object findContentSerializer(Annotated annotated)
        {
            Object obj;
label0:
            {
                Object obj1 = _primary.findContentSerializer(annotated);
                if (obj1 != null && obj1 != com/fasterxml/jackson/databind/JsonSerializer$None)
                {
                    obj = obj1;
                    if (obj1 != com/fasterxml/jackson/databind/annotation/NoClass)
                    {
                        break label0;
                    }
                }
                obj = _secondary.findContentSerializer(annotated);
            }
            return obj;
        }

        public Class findDeserializationContentType(Annotated annotated, JavaType javatype)
        {
            Class class2 = _primary.findDeserializationContentType(annotated, javatype);
            Class class1 = class2;
            if (class2 == null)
            {
                class1 = _secondary.findDeserializationContentType(annotated, javatype);
            }
            return class1;
        }

        public Class findDeserializationKeyType(Annotated annotated, JavaType javatype)
        {
            Class class2 = _primary.findDeserializationKeyType(annotated, javatype);
            Class class1 = class2;
            if (class2 == null)
            {
                class1 = _secondary.findDeserializationKeyType(annotated, javatype);
            }
            return class1;
        }

        public String findDeserializationName(AnnotatedField annotatedfield)
        {
            String s1 = _primary.findDeserializationName(annotatedfield);
            if (s1 != null) goto _L2; else goto _L1
_L1:
            annotatedfield = _secondary.findDeserializationName(annotatedfield);
_L4:
            return annotatedfield;
_L2:
            String s;
            if (s1.length() != 0)
            {
                break; /* Loop/switch isn't completed */
            }
            s = _secondary.findDeserializationName(annotatedfield);
            annotatedfield = s;
            if (s != null) goto _L4; else goto _L3
_L3:
            return s1;
        }

        public String findDeserializationName(AnnotatedMethod annotatedmethod)
        {
            String s1 = _primary.findDeserializationName(annotatedmethod);
            if (s1 != null) goto _L2; else goto _L1
_L1:
            annotatedmethod = _secondary.findDeserializationName(annotatedmethod);
_L4:
            return annotatedmethod;
_L2:
            String s;
            if (s1.length() != 0)
            {
                break; /* Loop/switch isn't completed */
            }
            s = _secondary.findDeserializationName(annotatedmethod);
            annotatedmethod = s;
            if (s != null) goto _L4; else goto _L3
_L3:
            return s1;
        }

        public String findDeserializationName(AnnotatedParameter annotatedparameter)
        {
            String s1 = _primary.findDeserializationName(annotatedparameter);
            String s = s1;
            if (s1 == null)
            {
                s = _secondary.findDeserializationName(annotatedparameter);
            }
            return s;
        }

        public Class findDeserializationType(Annotated annotated, JavaType javatype)
        {
            Class class2 = _primary.findDeserializationType(annotated, javatype);
            Class class1 = class2;
            if (class2 == null)
            {
                class1 = _secondary.findDeserializationType(annotated, javatype);
            }
            return class1;
        }

        public Object findDeserializer(Annotated annotated)
        {
            Object obj1 = _primary.findDeserializer(annotated);
            Object obj = obj1;
            if (obj1 == null)
            {
                obj = _secondary.findDeserializer(annotated);
            }
            return obj;
        }

        public String findEnumValue(Enum enum)
        {
            String s1 = _primary.findEnumValue(enum);
            String s = s1;
            if (s1 == null)
            {
                s = _secondary.findEnumValue(enum);
            }
            return s;
        }

        public Object findFilterId(AnnotatedClass annotatedclass)
        {
            Object obj1 = _primary.findFilterId(annotatedclass);
            Object obj = obj1;
            if (obj1 == null)
            {
                obj = _secondary.findFilterId(annotatedclass);
            }
            return obj;
        }

        public com.fasterxml.jackson.annotation.JsonFormat.Value findFormat(AnnotatedMember annotatedmember)
        {
            com.fasterxml.jackson.annotation.JsonFormat.Value value1 = _primary.findFormat(annotatedmember);
            com.fasterxml.jackson.annotation.JsonFormat.Value value = value1;
            if (value1 == null)
            {
                value = _secondary.findFormat(annotatedmember);
            }
            return value;
        }

        public Boolean findIgnoreUnknownProperties(AnnotatedClass annotatedclass)
        {
            Boolean boolean2 = _primary.findIgnoreUnknownProperties(annotatedclass);
            Boolean boolean1 = boolean2;
            if (boolean2 == null)
            {
                boolean1 = _secondary.findIgnoreUnknownProperties(annotatedclass);
            }
            return boolean1;
        }

        public Object findInjectableValueId(AnnotatedMember annotatedmember)
        {
            Object obj1 = _primary.findInjectableValueId(annotatedmember);
            Object obj = obj1;
            if (obj1 == null)
            {
                obj = _secondary.findInjectableValueId(annotatedmember);
            }
            return obj;
        }

        public Object findKeyDeserializer(Annotated annotated)
        {
            Object obj;
label0:
            {
                Object obj1 = _primary.findKeyDeserializer(annotated);
                if (obj1 != null && obj1 != com/fasterxml/jackson/databind/KeyDeserializer$None)
                {
                    obj = obj1;
                    if (obj1 != com/fasterxml/jackson/databind/annotation/NoClass)
                    {
                        break label0;
                    }
                }
                obj = _secondary.findKeyDeserializer(annotated);
            }
            return obj;
        }

        public Object findKeySerializer(Annotated annotated)
        {
            Object obj;
label0:
            {
                Object obj1 = _primary.findKeySerializer(annotated);
                if (obj1 != null && obj1 != com/fasterxml/jackson/databind/JsonSerializer$None)
                {
                    obj = obj1;
                    if (obj1 != com/fasterxml/jackson/databind/annotation/NoClass)
                    {
                        break label0;
                    }
                }
                obj = _secondary.findKeySerializer(annotated);
            }
            return obj;
        }

        public ObjectIdInfo findObjectIdInfo(Annotated annotated)
        {
            ObjectIdInfo objectidinfo1 = _primary.findObjectIdInfo(annotated);
            ObjectIdInfo objectidinfo = objectidinfo1;
            if (objectidinfo1 == null)
            {
                objectidinfo = _secondary.findObjectIdInfo(annotated);
            }
            return objectidinfo;
        }

        public Class findPOJOBuilder(AnnotatedClass annotatedclass)
        {
            Class class2 = _primary.findPOJOBuilder(annotatedclass);
            Class class1 = class2;
            if (class2 == null)
            {
                class1 = _secondary.findPOJOBuilder(annotatedclass);
            }
            return class1;
        }

        public com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder.Value findPOJOBuilderConfig(AnnotatedClass annotatedclass)
        {
            com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder.Value value1 = _primary.findPOJOBuilderConfig(annotatedclass);
            com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder.Value value = value1;
            if (value1 == null)
            {
                value = _secondary.findPOJOBuilderConfig(annotatedclass);
            }
            return value;
        }

        public String[] findPropertiesToIgnore(Annotated annotated)
        {
            String as1[] = _primary.findPropertiesToIgnore(annotated);
            String as[] = as1;
            if (as1 == null)
            {
                as = _secondary.findPropertiesToIgnore(annotated);
            }
            return as;
        }

        public TypeResolverBuilder findPropertyContentTypeResolver(MapperConfig mapperconfig, AnnotatedMember annotatedmember, JavaType javatype)
        {
            TypeResolverBuilder typeresolverbuilder1 = _primary.findPropertyContentTypeResolver(mapperconfig, annotatedmember, javatype);
            TypeResolverBuilder typeresolverbuilder = typeresolverbuilder1;
            if (typeresolverbuilder1 == null)
            {
                typeresolverbuilder = _secondary.findPropertyContentTypeResolver(mapperconfig, annotatedmember, javatype);
            }
            return typeresolverbuilder;
        }

        public TypeResolverBuilder findPropertyTypeResolver(MapperConfig mapperconfig, AnnotatedMember annotatedmember, JavaType javatype)
        {
            TypeResolverBuilder typeresolverbuilder1 = _primary.findPropertyTypeResolver(mapperconfig, annotatedmember, javatype);
            TypeResolverBuilder typeresolverbuilder = typeresolverbuilder1;
            if (typeresolverbuilder1 == null)
            {
                typeresolverbuilder = _secondary.findPropertyTypeResolver(mapperconfig, annotatedmember, javatype);
            }
            return typeresolverbuilder;
        }

        public ReferenceProperty findReferenceType(AnnotatedMember annotatedmember)
        {
            ReferenceProperty referenceproperty1 = _primary.findReferenceType(annotatedmember);
            ReferenceProperty referenceproperty = referenceproperty1;
            if (referenceproperty1 == null)
            {
                referenceproperty = _secondary.findReferenceType(annotatedmember);
            }
            return referenceproperty;
        }

        public String findRootName(AnnotatedClass annotatedclass)
        {
            String s1 = _primary.findRootName(annotatedclass);
            String s;
            if (s1 == null)
            {
                s = _secondary.findRootName(annotatedclass);
            } else
            {
                s = s1;
                if (s1.length() <= 0)
                {
                    annotatedclass = _secondary.findRootName(annotatedclass);
                    s = s1;
                    if (annotatedclass != null)
                    {
                        return annotatedclass;
                    }
                }
            }
            return s;
        }

        public Class findSerializationContentType(Annotated annotated, JavaType javatype)
        {
            Class class2 = _primary.findSerializationContentType(annotated, javatype);
            Class class1 = class2;
            if (class2 == null)
            {
                class1 = _secondary.findSerializationContentType(annotated, javatype);
            }
            return class1;
        }

        public com.fasterxml.jackson.annotation.JsonInclude.Include findSerializationInclusion(Annotated annotated, com.fasterxml.jackson.annotation.JsonInclude.Include include)
        {
            include = _secondary.findSerializationInclusion(annotated, include);
            return _primary.findSerializationInclusion(annotated, include);
        }

        public Class findSerializationKeyType(Annotated annotated, JavaType javatype)
        {
            Class class2 = _primary.findSerializationKeyType(annotated, javatype);
            Class class1 = class2;
            if (class2 == null)
            {
                class1 = _secondary.findSerializationKeyType(annotated, javatype);
            }
            return class1;
        }

        public String findSerializationName(AnnotatedField annotatedfield)
        {
            String s1 = _primary.findSerializationName(annotatedfield);
            if (s1 != null) goto _L2; else goto _L1
_L1:
            annotatedfield = _secondary.findSerializationName(annotatedfield);
_L4:
            return annotatedfield;
_L2:
            String s;
            if (s1.length() != 0)
            {
                break; /* Loop/switch isn't completed */
            }
            s = _secondary.findSerializationName(annotatedfield);
            annotatedfield = s;
            if (s != null) goto _L4; else goto _L3
_L3:
            return s1;
        }

        public String findSerializationName(AnnotatedMethod annotatedmethod)
        {
            String s1 = _primary.findSerializationName(annotatedmethod);
            if (s1 != null) goto _L2; else goto _L1
_L1:
            annotatedmethod = _secondary.findSerializationName(annotatedmethod);
_L4:
            return annotatedmethod;
_L2:
            String s;
            if (s1.length() != 0)
            {
                break; /* Loop/switch isn't completed */
            }
            s = _secondary.findSerializationName(annotatedmethod);
            annotatedmethod = s;
            if (s != null) goto _L4; else goto _L3
_L3:
            return s1;
        }

        public String[] findSerializationPropertyOrder(AnnotatedClass annotatedclass)
        {
            String as1[] = _primary.findSerializationPropertyOrder(annotatedclass);
            String as[] = as1;
            if (as1 == null)
            {
                as = _secondary.findSerializationPropertyOrder(annotatedclass);
            }
            return as;
        }

        public Boolean findSerializationSortAlphabetically(AnnotatedClass annotatedclass)
        {
            Boolean boolean2 = _primary.findSerializationSortAlphabetically(annotatedclass);
            Boolean boolean1 = boolean2;
            if (boolean2 == null)
            {
                boolean1 = _secondary.findSerializationSortAlphabetically(annotatedclass);
            }
            return boolean1;
        }

        public Class findSerializationType(Annotated annotated)
        {
            Class class2 = _primary.findSerializationType(annotated);
            Class class1 = class2;
            if (class2 == null)
            {
                class1 = _secondary.findSerializationType(annotated);
            }
            return class1;
        }

        public com.fasterxml.jackson.databind.annotation.JsonSerialize.Typing findSerializationTyping(Annotated annotated)
        {
            com.fasterxml.jackson.databind.annotation.JsonSerialize.Typing typing1 = _primary.findSerializationTyping(annotated);
            com.fasterxml.jackson.databind.annotation.JsonSerialize.Typing typing = typing1;
            if (typing1 == null)
            {
                typing = _secondary.findSerializationTyping(annotated);
            }
            return typing;
        }

        public Object findSerializer(Annotated annotated)
        {
            Object obj1 = _primary.findSerializer(annotated);
            Object obj = obj1;
            if (obj1 == null)
            {
                obj = _secondary.findSerializer(annotated);
            }
            return obj;
        }

        public List findSubtypes(Annotated annotated)
        {
            List list = _primary.findSubtypes(annotated);
            annotated = _secondary.findSubtypes(annotated);
            if (list == null || list.isEmpty())
            {
                return annotated;
            }
            if (annotated == null || annotated.isEmpty())
            {
                return list;
            } else
            {
                ArrayList arraylist = new ArrayList(list.size() + annotated.size());
                arraylist.addAll(list);
                arraylist.addAll(annotated);
                return arraylist;
            }
        }

        public String findTypeName(AnnotatedClass annotatedclass)
        {
            String s;
label0:
            {
                String s1 = _primary.findTypeName(annotatedclass);
                if (s1 != null)
                {
                    s = s1;
                    if (s1.length() != 0)
                    {
                        break label0;
                    }
                }
                s = _secondary.findTypeName(annotatedclass);
            }
            return s;
        }

        public TypeResolverBuilder findTypeResolver(MapperConfig mapperconfig, AnnotatedClass annotatedclass, JavaType javatype)
        {
            TypeResolverBuilder typeresolverbuilder1 = _primary.findTypeResolver(mapperconfig, annotatedclass, javatype);
            TypeResolverBuilder typeresolverbuilder = typeresolverbuilder1;
            if (typeresolverbuilder1 == null)
            {
                typeresolverbuilder = _secondary.findTypeResolver(mapperconfig, annotatedclass, javatype);
            }
            return typeresolverbuilder;
        }

        public NameTransformer findUnwrappingNameTransformer(AnnotatedMember annotatedmember)
        {
            NameTransformer nametransformer1 = _primary.findUnwrappingNameTransformer(annotatedmember);
            NameTransformer nametransformer = nametransformer1;
            if (nametransformer1 == null)
            {
                nametransformer = _secondary.findUnwrappingNameTransformer(annotatedmember);
            }
            return nametransformer;
        }

        public Object findValueInstantiator(AnnotatedClass annotatedclass)
        {
            Object obj1 = _primary.findValueInstantiator(annotatedclass);
            Object obj = obj1;
            if (obj1 == null)
            {
                obj = _secondary.findValueInstantiator(annotatedclass);
            }
            return obj;
        }

        public Class[] findViews(Annotated annotated)
        {
            Class aclass1[] = _primary.findViews(annotated);
            Class aclass[] = aclass1;
            if (aclass1 == null)
            {
                aclass = _secondary.findViews(annotated);
            }
            return aclass;
        }

        public boolean hasAnyGetterAnnotation(AnnotatedMethod annotatedmethod)
        {
            return _primary.hasAnyGetterAnnotation(annotatedmethod) || _secondary.hasAnyGetterAnnotation(annotatedmethod);
        }

        public boolean hasAnySetterAnnotation(AnnotatedMethod annotatedmethod)
        {
            return _primary.hasAnySetterAnnotation(annotatedmethod) || _secondary.hasAnySetterAnnotation(annotatedmethod);
        }

        public boolean hasAsValueAnnotation(AnnotatedMethod annotatedmethod)
        {
            return _primary.hasAsValueAnnotation(annotatedmethod) || _secondary.hasAsValueAnnotation(annotatedmethod);
        }

        public boolean hasCreatorAnnotation(Annotated annotated)
        {
            return _primary.hasCreatorAnnotation(annotated) || _secondary.hasCreatorAnnotation(annotated);
        }

        public boolean hasIgnoreMarker(AnnotatedMember annotatedmember)
        {
            return _primary.hasIgnoreMarker(annotatedmember) || _secondary.hasIgnoreMarker(annotatedmember);
        }

        public Boolean hasRequiredMarker(AnnotatedMember annotatedmember)
        {
            Boolean boolean2 = _primary.hasRequiredMarker(annotatedmember);
            Boolean boolean1 = boolean2;
            if (boolean2 == null)
            {
                boolean1 = _secondary.hasRequiredMarker(annotatedmember);
            }
            return boolean1;
        }

        public boolean isAnnotationBundle(Annotation annotation)
        {
            return _primary.isAnnotationBundle(annotation) || _secondary.isAnnotationBundle(annotation);
        }

        public boolean isHandled(Annotation annotation)
        {
            return _primary.isHandled(annotation) || _secondary.isHandled(annotation);
        }

        public Boolean isIgnorableType(AnnotatedClass annotatedclass)
        {
            Boolean boolean2 = _primary.isIgnorableType(annotatedclass);
            Boolean boolean1 = boolean2;
            if (boolean2 == null)
            {
                boolean1 = _secondary.isIgnorableType(annotatedclass);
            }
            return boolean1;
        }

        public Boolean isTypeId(AnnotatedMember annotatedmember)
        {
            Boolean boolean2 = _primary.isTypeId(annotatedmember);
            Boolean boolean1 = boolean2;
            if (boolean2 == null)
            {
                boolean1 = _secondary.isTypeId(annotatedmember);
            }
            return boolean1;
        }

        public Version version()
        {
            return _primary.version();
        }

        public Pair(AnnotationIntrospector annotationintrospector1)
        {
            _primary = AnnotationIntrospector.this;
            _secondary = annotationintrospector1;
        }
    }

}
