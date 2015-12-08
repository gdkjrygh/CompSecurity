// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fasterxml.jackson.databind.deser;

import com.fasterxml.jackson.annotation.ObjectIdGenerator;
import com.fasterxml.jackson.databind.AbstractTypeResolver;
import com.fasterxml.jackson.databind.AnnotationIntrospector;
import com.fasterxml.jackson.databind.BeanDescription;
import com.fasterxml.jackson.databind.DeserializationConfig;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.JsonDeserializer;
import com.fasterxml.jackson.databind.MapperFeature;
import com.fasterxml.jackson.databind.PropertyMetadata;
import com.fasterxml.jackson.databind.PropertyName;
import com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig;
import com.fasterxml.jackson.databind.deser.impl.FieldProperty;
import com.fasterxml.jackson.databind.deser.impl.MethodProperty;
import com.fasterxml.jackson.databind.deser.impl.ObjectIdReader;
import com.fasterxml.jackson.databind.deser.impl.PropertyBasedObjectIdGenerator;
import com.fasterxml.jackson.databind.deser.impl.SetterlessProperty;
import com.fasterxml.jackson.databind.deser.std.AtomicReferenceDeserializer;
import com.fasterxml.jackson.databind.deser.std.ThrowableDeserializer;
import com.fasterxml.jackson.databind.ext.OptionalHandlerFactory;
import com.fasterxml.jackson.databind.introspect.AnnotatedField;
import com.fasterxml.jackson.databind.introspect.AnnotatedMember;
import com.fasterxml.jackson.databind.introspect.AnnotatedMethod;
import com.fasterxml.jackson.databind.introspect.BeanPropertyDefinition;
import com.fasterxml.jackson.databind.introspect.ObjectIdInfo;
import com.fasterxml.jackson.databind.jsontype.TypeDeserializer;
import com.fasterxml.jackson.databind.type.TypeBindings;
import com.fasterxml.jackson.databind.type.TypeFactory;
import com.fasterxml.jackson.databind.util.ArrayBuilders;
import com.fasterxml.jackson.databind.util.ClassUtil;
import com.fasterxml.jackson.databind.util.SimpleBeanPropertyDefinition;
import java.io.Serializable;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.atomic.AtomicReference;

// Referenced classes of package com.fasterxml.jackson.databind.deser:
//            BasicDeserializerFactory, Deserializers, BeanDeserializerBuilder, ValueInstantiator, 
//            BeanDeserializerModifier, SettableBeanProperty, CreatorProperty, BeanDeserializer, 
//            SettableAnyProperty

public class BeanDeserializerFactory extends BasicDeserializerFactory
    implements Serializable
{

    private static final Class INIT_CAUSE_PARAMS[] = {
        java/lang/Throwable
    };
    private static final Class NO_VIEWS[] = new Class[0];
    public static final BeanDeserializerFactory instance = new BeanDeserializerFactory(new DeserializerFactoryConfig());
    private static final long serialVersionUID = 1L;

    public BeanDeserializerFactory(DeserializerFactoryConfig deserializerfactoryconfig)
    {
        super(deserializerfactoryconfig);
    }

    protected JsonDeserializer _findCustomBeanDeserializer(JavaType javatype, DeserializationConfig deserializationconfig, BeanDescription beandescription)
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

    protected void addBeanProps(DeserializationContext deserializationcontext, BeanDescription beandescription, BeanDeserializerBuilder beandeserializerbuilder)
    {
        SettableBeanProperty asettablebeanproperty[];
        Iterator iterator1;
        boolean flag;
        asettablebeanproperty = beandeserializerbuilder.getValueInstantiator().getFromObjectArguments(deserializationcontext.getConfig());
        Object obj = deserializationcontext.getAnnotationIntrospector();
        Object obj2 = ((AnnotationIntrospector) (obj)).findIgnoreUnknownProperties(beandescription.getClassInfo());
        if (obj2 != null)
        {
            beandeserializerbuilder.setIgnoreUnknownProperties(((Boolean) (obj2)).booleanValue());
        }
        obj = ArrayBuilders.arrayToSet(((AnnotationIntrospector) (obj)).findPropertiesToIgnore(beandescription.getClassInfo()));
        for (obj2 = ((Set) (obj)).iterator(); ((Iterator) (obj2)).hasNext(); beandeserializerbuilder.addIgnorable((String)((Iterator) (obj2)).next())) { }
        obj2 = beandescription.findAnySetter();
        if (obj2 != null)
        {
            beandeserializerbuilder.setAnySetter(constructAnySetter(deserializationcontext, beandescription, ((AnnotatedMethod) (obj2))));
        }
        if (obj2 == null)
        {
            obj2 = beandescription.getIgnoredPropertyNames();
            if (obj2 != null)
            {
                for (obj2 = ((Collection) (obj2)).iterator(); ((Iterator) (obj2)).hasNext(); beandeserializerbuilder.addIgnorable((String)((Iterator) (obj2)).next())) { }
            }
        }
        if (deserializationcontext.isEnabled(MapperFeature.USE_GETTERS_AS_SETTERS) && deserializationcontext.isEnabled(MapperFeature.AUTO_DETECT_GETTERS))
        {
            flag = true;
        } else
        {
            flag = false;
        }
        obj = filterBeanProps(deserializationcontext, beandescription, beandeserializerbuilder, beandescription.findProperties(), ((Set) (obj)));
        if (_factoryConfig.hasDeserializerModifiers())
        {
            Iterator iterator = _factoryConfig.deserializerModifiers().iterator();
            do
            {
                obj2 = obj;
                if (!iterator.hasNext())
                {
                    break;
                }
                obj = ((BeanDeserializerModifier)iterator.next()).updateProperties(deserializationcontext.getConfig(), beandescription, ((List) (obj)));
            } while (true);
        } else
        {
            obj2 = obj;
        }
        iterator1 = ((List) (obj2)).iterator();
_L5:
        if (!iterator1.hasNext()) goto _L2; else goto _L1
_L1:
        Object obj1;
        Object obj3;
        obj3 = (BeanPropertyDefinition)iterator1.next();
        String s;
        int j;
        if (((BeanPropertyDefinition) (obj3)).hasSetter())
        {
            obj1 = constructSettableProperty(deserializationcontext, beandescription, ((BeanPropertyDefinition) (obj3)), ((BeanPropertyDefinition) (obj3)).getSetter().getGenericParameterType(0));
        } else
        if (((BeanPropertyDefinition) (obj3)).hasField())
        {
            obj1 = constructSettableProperty(deserializationcontext, beandescription, ((BeanPropertyDefinition) (obj3)), ((BeanPropertyDefinition) (obj3)).getField().getGenericType());
        } else
        {
            if (!flag || !((BeanPropertyDefinition) (obj3)).hasGetter())
            {
                break MISSING_BLOCK_LABEL_632;
            }
            obj1 = ((BeanPropertyDefinition) (obj3)).getGetter().getRawType();
            if (!java/util/Collection.isAssignableFrom(((Class) (obj1))) && !java/util/Map.isAssignableFrom(((Class) (obj1))))
            {
                break MISSING_BLOCK_LABEL_632;
            }
            obj1 = constructSetterlessProperty(deserializationcontext, beandescription, ((BeanPropertyDefinition) (obj3)));
        }
_L7:
        if (!((BeanPropertyDefinition) (obj3)).hasConstructorParameter()) goto _L4; else goto _L3
_L6:
        if (obj3 == null)
        {
            throw deserializationcontext.mappingException((new StringBuilder("Could not find creator property with name '")).append(s).append("' (in class ").append(beandescription.getBeanClass().getName()).append(")").toString());
        }
        Object obj4 = obj3;
        if (obj1 != null)
        {
            obj4 = ((CreatorProperty) (obj3)).withFallbackSetter(((SettableBeanProperty) (obj1)));
        }
        beandeserializerbuilder.addCreatorProperty(((SettableBeanProperty) (obj4)));
          goto _L5
_L4:
        if (obj1 != null)
        {
            Class aclass[] = ((BeanPropertyDefinition) (obj3)).findViews();
            obj3 = aclass;
            if (aclass == null)
            {
                obj3 = aclass;
                if (!deserializationcontext.isEnabled(MapperFeature.DEFAULT_VIEW_INCLUSION))
                {
                    obj3 = NO_VIEWS;
                }
            }
            ((SettableBeanProperty) (obj1)).setViews(((Class []) (obj3)));
            beandeserializerbuilder.addProperty(((SettableBeanProperty) (obj1)));
        }
          goto _L5
_L2:
        return;
_L3:
        s = ((BeanPropertyDefinition) (obj3)).getName();
        if (asettablebeanproperty != null)
        {
            j = asettablebeanproperty.length;
            for (int i = 0; i < j; i++)
            {
                obj3 = asettablebeanproperty[i];
                if (s.equals(((SettableBeanProperty) (obj3)).getName()))
                {
                    obj3 = (CreatorProperty)obj3;
                    break MISSING_BLOCK_LABEL_400;
                }
            }

        }
        obj3 = null;
          goto _L6
        obj1 = null;
          goto _L7
    }

    protected void addInjectables(DeserializationContext deserializationcontext, BeanDescription beandescription, BeanDeserializerBuilder beandeserializerbuilder)
    {
        Object obj = beandescription.findInjectables();
        if (obj != null)
        {
            boolean flag = deserializationcontext.canOverrideAccessModifiers();
            AnnotatedMember annotatedmember;
            for (deserializationcontext = ((Map) (obj)).entrySet().iterator(); deserializationcontext.hasNext(); beandeserializerbuilder.addInjectable(new PropertyName(annotatedmember.getName()), beandescription.resolveType(annotatedmember.getGenericType()), beandescription.getClassAnnotations(), annotatedmember, ((java.util.Map.Entry) (obj)).getKey()))
            {
                obj = (java.util.Map.Entry)deserializationcontext.next();
                annotatedmember = (AnnotatedMember)((java.util.Map.Entry) (obj)).getValue();
                if (flag)
                {
                    annotatedmember.fixAccess();
                }
            }

        }
    }

    protected void addObjectIdReader(DeserializationContext deserializationcontext, BeanDescription beandescription, BeanDeserializerBuilder beandeserializerbuilder)
    {
        ObjectIdInfo objectidinfo = beandescription.getObjectIdInfo();
        if (objectidinfo == null)
        {
            return;
        }
        Object obj = objectidinfo.getGeneratorType();
        com.fasterxml.jackson.annotation.ObjectIdResolver objectidresolver = deserializationcontext.objectIdResolverInstance(beandescription.getClassInfo(), objectidinfo);
        SettableBeanProperty settablebeanproperty;
        if (obj == com/fasterxml/jackson/annotation/ObjectIdGenerators$PropertyGenerator)
        {
            obj = objectidinfo.getPropertyName();
            settablebeanproperty = beandeserializerbuilder.findProperty(((PropertyName) (obj)));
            if (settablebeanproperty == null)
            {
                throw new IllegalArgumentException((new StringBuilder("Invalid Object Id definition for ")).append(beandescription.getBeanClass().getName()).append(": can not find property with name '").append(obj).append("'").toString());
            }
            beandescription = settablebeanproperty.getType();
            obj = new PropertyBasedObjectIdGenerator(objectidinfo.getScope());
        } else
        {
            obj = deserializationcontext.constructType(((Class) (obj)));
            obj = deserializationcontext.getTypeFactory().findTypeParameters(((JavaType) (obj)), com/fasterxml/jackson/annotation/ObjectIdGenerator)[0];
            settablebeanproperty = null;
            ObjectIdGenerator objectidgenerator = deserializationcontext.objectIdGeneratorInstance(beandescription.getClassInfo(), objectidinfo);
            beandescription = ((BeanDescription) (obj));
            obj = objectidgenerator;
        }
        deserializationcontext = deserializationcontext.findRootValueDeserializer(beandescription);
        beandeserializerbuilder.setObjectIdReader(ObjectIdReader.construct(beandescription, objectidinfo.getPropertyName(), ((ObjectIdGenerator) (obj)), deserializationcontext, settablebeanproperty, objectidresolver));
    }

    protected void addReferenceProperties(DeserializationContext deserializationcontext, BeanDescription beandescription, BeanDeserializerBuilder beandeserializerbuilder)
    {
        Map map = beandescription.findBackReferenceProperties();
        if (map != null)
        {
            Iterator iterator = map.entrySet().iterator();
            while (iterator.hasNext()) 
            {
                Object obj = (java.util.Map.Entry)iterator.next();
                String s = (String)((java.util.Map.Entry) (obj)).getKey();
                AnnotatedMember annotatedmember = (AnnotatedMember)((java.util.Map.Entry) (obj)).getValue();
                if (annotatedmember instanceof AnnotatedMethod)
                {
                    obj = ((AnnotatedMethod)annotatedmember).getGenericParameterType(0);
                } else
                {
                    obj = annotatedmember.getRawType();
                }
                beandeserializerbuilder.addBackReferenceProperty(s, constructSettableProperty(deserializationcontext, beandescription, SimpleBeanPropertyDefinition.construct(deserializationcontext.getConfig(), annotatedmember), ((Type) (obj))));
            }
        }
    }

    public JsonDeserializer buildBeanDeserializer(DeserializationContext deserializationcontext, JavaType javatype, BeanDescription beandescription)
    {
        ValueInstantiator valueinstantiator = findValueInstantiator(deserializationcontext, beandescription);
        Object obj = constructBeanDeserializerBuilder(deserializationcontext, beandescription);
        ((BeanDeserializerBuilder) (obj)).setValueInstantiator(valueinstantiator);
        addBeanProps(deserializationcontext, beandescription, ((BeanDeserializerBuilder) (obj)));
        addObjectIdReader(deserializationcontext, beandescription, ((BeanDeserializerBuilder) (obj)));
        addReferenceProperties(deserializationcontext, beandescription, ((BeanDeserializerBuilder) (obj)));
        addInjectables(deserializationcontext, beandescription, ((BeanDeserializerBuilder) (obj)));
        DeserializationConfig deserializationconfig = deserializationcontext.getConfig();
        if (_factoryConfig.hasDeserializerModifiers())
        {
            Iterator iterator = _factoryConfig.deserializerModifiers().iterator();
            deserializationcontext = ((DeserializationContext) (obj));
            do
            {
                obj = deserializationcontext;
                if (!iterator.hasNext())
                {
                    break;
                }
                deserializationcontext = ((BeanDeserializerModifier)iterator.next()).updateBuilder(deserializationconfig, beandescription, deserializationcontext);
            } while (true);
        }
        if (javatype.isAbstract() && !valueinstantiator.canInstantiate())
        {
            deserializationcontext = ((BeanDeserializerBuilder) (obj)).buildAbstract();
        } else
        {
            deserializationcontext = ((BeanDeserializerBuilder) (obj)).build();
        }
        if (_factoryConfig.hasDeserializerModifiers())
        {
            obj = _factoryConfig.deserializerModifiers().iterator();
            do
            {
                javatype = deserializationcontext;
                if (!((Iterator) (obj)).hasNext())
                {
                    break;
                }
                deserializationcontext = ((BeanDeserializerModifier)((Iterator) (obj)).next()).modifyDeserializer(deserializationconfig, beandescription, deserializationcontext);
            } while (true);
        } else
        {
            javatype = deserializationcontext;
        }
        return javatype;
    }

    protected JsonDeserializer buildBuilderBasedDeserializer(DeserializationContext deserializationcontext, JavaType javatype, BeanDescription beandescription)
    {
        Object obj = findValueInstantiator(deserializationcontext, beandescription);
        DeserializationConfig deserializationconfig = deserializationcontext.getConfig();
        BeanDeserializerBuilder beandeserializerbuilder = constructBeanDeserializerBuilder(deserializationcontext, beandescription);
        beandeserializerbuilder.setValueInstantiator(((ValueInstantiator) (obj)));
        addBeanProps(deserializationcontext, beandescription, beandeserializerbuilder);
        addObjectIdReader(deserializationcontext, beandescription, beandeserializerbuilder);
        addReferenceProperties(deserializationcontext, beandescription, beandeserializerbuilder);
        addInjectables(deserializationcontext, beandescription, beandeserializerbuilder);
        deserializationcontext = beandescription.findPOJOBuilderConfig();
        Object obj1;
        if (deserializationcontext == null)
        {
            obj = "build";
        } else
        {
            obj = ((com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder.Value) (deserializationcontext)).buildMethodName;
        }
        obj1 = beandescription.findMethod(((String) (obj)), null);
        if (obj1 != null && deserializationconfig.canOverrideAccessModifiers())
        {
            ClassUtil.checkAndFixAccess(((AnnotatedMethod) (obj1)).getMember());
        }
        beandeserializerbuilder.setPOJOBuilder(((AnnotatedMethod) (obj1)), deserializationcontext);
        obj1 = beandeserializerbuilder;
        if (_factoryConfig.hasDeserializerModifiers())
        {
            Iterator iterator1 = _factoryConfig.deserializerModifiers().iterator();
            deserializationcontext = beandeserializerbuilder;
            do
            {
                obj1 = deserializationcontext;
                if (!iterator1.hasNext())
                {
                    break;
                }
                deserializationcontext = ((BeanDeserializerModifier)iterator1.next()).updateBuilder(deserializationconfig, beandescription, deserializationcontext);
            } while (true);
        }
        deserializationcontext = ((BeanDeserializerBuilder) (obj1)).buildBuilderBased(javatype, ((String) (obj)));
        if (_factoryConfig.hasDeserializerModifiers())
        {
            Iterator iterator = _factoryConfig.deserializerModifiers().iterator();
            do
            {
                javatype = deserializationcontext;
                if (!iterator.hasNext())
                {
                    break;
                }
                deserializationcontext = ((BeanDeserializerModifier)iterator.next()).modifyDeserializer(deserializationconfig, beandescription, deserializationcontext);
            } while (true);
        } else
        {
            javatype = deserializationcontext;
        }
        return javatype;
    }

    public JsonDeserializer buildThrowableDeserializer(DeserializationContext deserializationcontext, JavaType javatype, BeanDescription beandescription)
    {
        DeserializationConfig deserializationconfig = deserializationcontext.getConfig();
        javatype = constructBeanDeserializerBuilder(deserializationcontext, beandescription);
        javatype.setValueInstantiator(findValueInstantiator(deserializationcontext, beandescription));
        addBeanProps(deserializationcontext, beandescription, javatype);
        AnnotatedMethod annotatedmethod = beandescription.findMethod("initCause", INIT_CAUSE_PARAMS);
        if (annotatedmethod != null)
        {
            deserializationcontext = constructSettableProperty(deserializationcontext, beandescription, SimpleBeanPropertyDefinition.construct(deserializationcontext.getConfig(), annotatedmethod, "cause"), annotatedmethod.getGenericParameterType(0));
            if (deserializationcontext != null)
            {
                javatype.addOrReplaceProperty(deserializationcontext, true);
            }
        }
        javatype.addIgnorable("localizedMessage");
        javatype.addIgnorable("suppressed");
        javatype.addIgnorable("message");
        if (_factoryConfig.hasDeserializerModifiers())
        {
            Iterator iterator = _factoryConfig.deserializerModifiers().iterator();
            deserializationcontext = javatype;
            do
            {
                javatype = deserializationcontext;
                if (!iterator.hasNext())
                {
                    break;
                }
                deserializationcontext = ((BeanDeserializerModifier)iterator.next()).updateBuilder(deserializationconfig, beandescription, deserializationcontext);
            } while (true);
        }
        javatype = javatype.build();
        deserializationcontext = javatype;
        if (javatype instanceof BeanDeserializer)
        {
            deserializationcontext = new ThrowableDeserializer((BeanDeserializer)javatype);
        }
        if (_factoryConfig.hasDeserializerModifiers())
        {
            Iterator iterator1 = _factoryConfig.deserializerModifiers().iterator();
            do
            {
                javatype = deserializationcontext;
                if (!iterator1.hasNext())
                {
                    break;
                }
                deserializationcontext = ((BeanDeserializerModifier)iterator1.next()).modifyDeserializer(deserializationconfig, beandescription, deserializationcontext);
            } while (true);
        } else
        {
            javatype = deserializationcontext;
        }
        return javatype;
    }

    protected SettableAnyProperty constructAnySetter(DeserializationContext deserializationcontext, BeanDescription beandescription, AnnotatedMethod annotatedmethod)
    {
        if (deserializationcontext.canOverrideAccessModifiers())
        {
            annotatedmethod.fixAccess();
        }
        JavaType javatype = beandescription.bindingsForBeanType().resolveType(annotatedmethod.getGenericParameterType(1));
        com.fasterxml.jackson.databind.BeanProperty.Std std = new com.fasterxml.jackson.databind.BeanProperty.Std(new PropertyName(annotatedmethod.getName()), javatype, null, beandescription.getClassAnnotations(), annotatedmethod, PropertyMetadata.STD_OPTIONAL);
        javatype = resolveType(deserializationcontext, beandescription, javatype, annotatedmethod);
        beandescription = findDeserializerFromAnnotation(deserializationcontext, annotatedmethod);
        javatype = modifyTypeByAnnotation(deserializationcontext, annotatedmethod, javatype);
        deserializationcontext = beandescription;
        if (beandescription == null)
        {
            deserializationcontext = (JsonDeserializer)javatype.getValueHandler();
        }
        return new SettableAnyProperty(std, annotatedmethod, javatype, deserializationcontext, (TypeDeserializer)javatype.getTypeHandler());
    }

    protected BeanDeserializerBuilder constructBeanDeserializerBuilder(DeserializationContext deserializationcontext, BeanDescription beandescription)
    {
        return new BeanDeserializerBuilder(beandescription, deserializationcontext.getConfig());
    }

    protected SettableBeanProperty constructSettableProperty(DeserializationContext deserializationcontext, BeanDescription beandescription, BeanPropertyDefinition beanpropertydefinition, Type type)
    {
        AnnotatedMember annotatedmember = beanpropertydefinition.getNonConstructorMutator();
        if (deserializationcontext.canOverrideAccessModifiers())
        {
            annotatedmember.fixAccess();
        }
        type = beandescription.resolveType(type);
        com.fasterxml.jackson.databind.BeanProperty.Std std = new com.fasterxml.jackson.databind.BeanProperty.Std(beanpropertydefinition.getFullName(), type, beanpropertydefinition.getWrapperName(), beandescription.getClassAnnotations(), annotatedmember, beanpropertydefinition.getMetadata());
        Object obj = resolveType(deserializationcontext, beandescription, type, annotatedmember);
        if (obj != type)
        {
            std.withType(((JavaType) (obj)));
        }
        type = findDeserializerFromAnnotation(deserializationcontext, annotatedmember);
        deserializationcontext = modifyTypeByAnnotation(deserializationcontext, annotatedmember, ((JavaType) (obj)));
        obj = (TypeDeserializer)deserializationcontext.getTypeHandler();
        if (annotatedmember instanceof AnnotatedMethod)
        {
            deserializationcontext = new MethodProperty(beanpropertydefinition, deserializationcontext, ((TypeDeserializer) (obj)), beandescription.getClassAnnotations(), (AnnotatedMethod)annotatedmember);
        } else
        {
            deserializationcontext = new FieldProperty(beanpropertydefinition, deserializationcontext, ((TypeDeserializer) (obj)), beandescription.getClassAnnotations(), (AnnotatedField)annotatedmember);
        }
        beandescription = deserializationcontext;
        if (type != null)
        {
            beandescription = deserializationcontext.withValueDeserializer(type);
        }
        deserializationcontext = beanpropertydefinition.findReferenceType();
        if (deserializationcontext != null && deserializationcontext.isManagedReference())
        {
            beandescription.setManagedReferenceName(deserializationcontext.getName());
        }
        deserializationcontext = beanpropertydefinition.findObjectIdInfo();
        if (deserializationcontext != null)
        {
            beandescription.setObjectIdInfo(deserializationcontext);
        }
        return beandescription;
    }

    protected SettableBeanProperty constructSetterlessProperty(DeserializationContext deserializationcontext, BeanDescription beandescription, BeanPropertyDefinition beanpropertydefinition)
    {
        AnnotatedMethod annotatedmethod = beanpropertydefinition.getGetter();
        if (deserializationcontext.canOverrideAccessModifiers())
        {
            annotatedmethod.fixAccess();
        }
        JavaType javatype = annotatedmethod.getType(beandescription.bindingsForBeanType());
        JsonDeserializer jsondeserializer = findDeserializerFromAnnotation(deserializationcontext, annotatedmethod);
        deserializationcontext = resolveType(deserializationcontext, beandescription, modifyTypeByAnnotation(deserializationcontext, annotatedmethod, javatype), annotatedmethod);
        beandescription = new SetterlessProperty(beanpropertydefinition, deserializationcontext, (TypeDeserializer)deserializationcontext.getTypeHandler(), beandescription.getClassAnnotations(), annotatedmethod);
        deserializationcontext = beandescription;
        if (jsondeserializer != null)
        {
            deserializationcontext = beandescription.withValueDeserializer(jsondeserializer);
        }
        return deserializationcontext;
    }

    public JsonDeserializer createBeanDeserializer(DeserializationContext deserializationcontext, JavaType javatype, BeanDescription beandescription)
    {
        Object obj1 = deserializationcontext.getConfig();
        Object obj = _findCustomBeanDeserializer(javatype, ((DeserializationConfig) (obj1)), beandescription);
        if (obj == null)
        {
            if (javatype.isThrowable())
            {
                return buildThrowableDeserializer(deserializationcontext, javatype, beandescription);
            }
            if (javatype.isAbstract())
            {
                obj = materializeAbstractType(deserializationcontext, javatype, beandescription);
                if (obj != null)
                {
                    return buildBeanDeserializer(deserializationcontext, ((JavaType) (obj)), ((DeserializationConfig) (obj1)).introspect(((JavaType) (obj))));
                }
            }
            obj1 = findStdDeserializer(deserializationcontext, javatype, beandescription);
            obj = obj1;
            if (obj1 == null)
            {
                if (!isPotentialBeanType(javatype.getRawClass()))
                {
                    return null;
                } else
                {
                    return buildBeanDeserializer(deserializationcontext, javatype, beandescription);
                }
            }
        }
        return ((JsonDeserializer) (obj));
    }

    public JsonDeserializer createBuilderBasedDeserializer(DeserializationContext deserializationcontext, JavaType javatype, BeanDescription beandescription, Class class1)
    {
        beandescription = deserializationcontext.constructType(class1);
        return buildBuilderBasedDeserializer(deserializationcontext, javatype, deserializationcontext.getConfig().introspectForBuilder(beandescription));
    }

    protected List filterBeanProps(DeserializationContext deserializationcontext, BeanDescription beandescription, BeanDeserializerBuilder beandeserializerbuilder, List list, Set set)
    {
        ArrayList arraylist;
        HashMap hashmap;
        Iterator iterator;
        arraylist = new ArrayList(Math.max(4, list.size()));
        hashmap = new HashMap();
        iterator = list.iterator();
_L7:
        BeanPropertyDefinition beanpropertydefinition;
        String s;
        if (!iterator.hasNext())
        {
            break; /* Loop/switch isn't completed */
        }
        beanpropertydefinition = (BeanPropertyDefinition)iterator.next();
        s = beanpropertydefinition.getName();
        if (set.contains(s))
        {
            continue; /* Loop/switch isn't completed */
        }
        if (beanpropertydefinition.hasConstructorParameter()) goto _L2; else goto _L1
_L1:
        list = null;
        if (!beanpropertydefinition.hasSetter()) goto _L4; else goto _L3
_L3:
        list = beanpropertydefinition.getSetter().getRawParameterType(0);
_L5:
        if (list == null || !isIgnorableType(deserializationcontext.getConfig(), beandescription, list, hashmap))
        {
            break; /* Loop/switch isn't completed */
        }
        beandeserializerbuilder.addIgnorable(s);
        continue; /* Loop/switch isn't completed */
_L4:
        if (beanpropertydefinition.hasField())
        {
            list = beanpropertydefinition.getField().getRawType();
        }
        if (true) goto _L5; else goto _L2
_L2:
        arraylist.add(beanpropertydefinition);
        if (true) goto _L7; else goto _L6
_L6:
        return arraylist;
    }

    protected JsonDeserializer findOptionalStdDeserializer(DeserializationContext deserializationcontext, JavaType javatype, BeanDescription beandescription)
    {
        return OptionalHandlerFactory.instance.findDeserializer(javatype, deserializationcontext.getConfig(), beandescription);
    }

    protected JsonDeserializer findStdDeserializer(DeserializationContext deserializationcontext, JavaType javatype, BeanDescription beandescription)
    {
        JsonDeserializer jsondeserializer = findDefaultDeserializer(deserializationcontext, javatype, beandescription);
        if (jsondeserializer != null)
        {
            return jsondeserializer;
        }
        if (java/util/concurrent/atomic/AtomicReference.isAssignableFrom(javatype.getRawClass()))
        {
            javatype = deserializationcontext.getTypeFactory().findTypeParameters(javatype, java/util/concurrent/atomic/AtomicReference);
            if (javatype == null || javatype.length <= 0)
            {
                javatype = TypeFactory.unknownType();
            } else
            {
                javatype = javatype[0];
            }
            return new AtomicReferenceDeserializer(javatype, findTypeDeserializer(deserializationcontext.getConfig(), javatype), findDeserializerFromAnnotation(deserializationcontext, deserializationcontext.getConfig().introspectClassAnnotations(javatype).getClassInfo()));
        } else
        {
            return findOptionalStdDeserializer(deserializationcontext, javatype, beandescription);
        }
    }

    protected boolean isIgnorableType(DeserializationConfig deserializationconfig, BeanDescription beandescription, Class class1, Map map)
    {
        map = (Boolean)map.get(class1);
        beandescription = map;
        if (map == null)
        {
            beandescription = deserializationconfig.introspectClassAnnotations(class1);
            deserializationconfig = deserializationconfig.getAnnotationIntrospector().isIgnorableType(beandescription.getClassInfo());
            beandescription = deserializationconfig;
            if (deserializationconfig == null)
            {
                beandescription = Boolean.FALSE;
            }
        }
        return beandescription.booleanValue();
    }

    protected boolean isPotentialBeanType(Class class1)
    {
        String s = ClassUtil.canBeABeanType(class1);
        if (s != null)
        {
            throw new IllegalArgumentException((new StringBuilder("Can not deserialize Class ")).append(class1.getName()).append(" (of type ").append(s).append(") as a Bean").toString());
        }
        if (ClassUtil.isProxyType(class1))
        {
            throw new IllegalArgumentException((new StringBuilder("Can not deserialize Proxy class ")).append(class1.getName()).append(" as a Bean").toString());
        }
        s = ClassUtil.isLocalType(class1, true);
        if (s != null)
        {
            throw new IllegalArgumentException((new StringBuilder("Can not deserialize Class ")).append(class1.getName()).append(" (of type ").append(s).append(") as a Bean").toString());
        } else
        {
            return true;
        }
    }

    protected JavaType materializeAbstractType(DeserializationContext deserializationcontext, JavaType javatype, BeanDescription beandescription)
    {
        javatype = beandescription.getType();
        for (beandescription = _factoryConfig.abstractTypeResolvers().iterator(); beandescription.hasNext();)
        {
            JavaType javatype1 = ((AbstractTypeResolver)beandescription.next()).resolveAbstractType(deserializationcontext.getConfig(), javatype);
            if (javatype1 != null)
            {
                return javatype1;
            }
        }

        return null;
    }

}
