// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fasterxml.jackson.databind.ser.std;

import com.fasterxml.jackson.annotation.ObjectIdGenerator;
import com.fasterxml.jackson.core.JsonGenerationException;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.AnnotationIntrospector;
import com.fasterxml.jackson.databind.BeanDescription;
import com.fasterxml.jackson.databind.BeanProperty;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.JsonSerializer;
import com.fasterxml.jackson.databind.PropertyName;
import com.fasterxml.jackson.databind.SerializationConfig;
import com.fasterxml.jackson.databind.SerializerProvider;
import com.fasterxml.jackson.databind.introspect.AnnotatedMember;
import com.fasterxml.jackson.databind.introspect.ObjectIdInfo;
import com.fasterxml.jackson.databind.jsontype.TypeSerializer;
import com.fasterxml.jackson.databind.ser.AnyGetterWriter;
import com.fasterxml.jackson.databind.ser.BeanPropertyWriter;
import com.fasterxml.jackson.databind.ser.BeanSerializerBuilder;
import com.fasterxml.jackson.databind.ser.ContainerSerializer;
import com.fasterxml.jackson.databind.ser.ContextualSerializer;
import com.fasterxml.jackson.databind.ser.PropertyFilter;
import com.fasterxml.jackson.databind.ser.ResolvableSerializer;
import com.fasterxml.jackson.databind.ser.impl.ObjectIdWriter;
import com.fasterxml.jackson.databind.ser.impl.PropertyBasedObjectIdGenerator;
import com.fasterxml.jackson.databind.ser.impl.WritableObjectId;
import com.fasterxml.jackson.databind.type.TypeFactory;
import com.fasterxml.jackson.databind.util.ArrayBuilders;
import com.fasterxml.jackson.databind.util.Converter;
import com.fasterxml.jackson.databind.util.NameTransformer;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashSet;

// Referenced classes of package com.fasterxml.jackson.databind.ser.std:
//            StdSerializer, EnumSerializer, StdDelegatingSerializer

public abstract class BeanSerializerBase extends StdSerializer
    implements ContextualSerializer, ResolvableSerializer
{

    protected static final PropertyName NAME_FOR_OBJECT_REF = new PropertyName("#object-ref");
    protected static final BeanPropertyWriter NO_PROPS[] = new BeanPropertyWriter[0];
    protected final AnyGetterWriter _anyGetterWriter;
    protected final BeanPropertyWriter _filteredProps[];
    protected final ObjectIdWriter _objectIdWriter;
    protected final Object _propertyFilterId;
    protected final BeanPropertyWriter _props[];
    protected final com.fasterxml.jackson.annotation.JsonFormat.Shape _serializationShape;
    protected final AnnotatedMember _typeId;

    protected BeanSerializerBase(JavaType javatype, BeanSerializerBuilder beanserializerbuilder, BeanPropertyWriter abeanpropertywriter[], BeanPropertyWriter abeanpropertywriter1[])
    {
        Object obj = null;
        super(javatype);
        _props = abeanpropertywriter;
        _filteredProps = abeanpropertywriter1;
        if (beanserializerbuilder == null)
        {
            _typeId = null;
            _anyGetterWriter = null;
            _propertyFilterId = null;
            _objectIdWriter = null;
            _serializationShape = null;
            return;
        }
        _typeId = beanserializerbuilder.getTypeId();
        _anyGetterWriter = beanserializerbuilder.getAnyGetter();
        _propertyFilterId = beanserializerbuilder.getFilterId();
        _objectIdWriter = beanserializerbuilder.getObjectIdWriter();
        javatype = beanserializerbuilder.getBeanDescription().findExpectedFormat(null);
        if (javatype == null)
        {
            javatype = obj;
        } else
        {
            javatype = javatype.getShape();
        }
        _serializationShape = javatype;
    }

    protected BeanSerializerBase(BeanSerializerBase beanserializerbase, ObjectIdWriter objectidwriter)
    {
        this(beanserializerbase, objectidwriter, beanserializerbase._propertyFilterId);
    }

    protected BeanSerializerBase(BeanSerializerBase beanserializerbase, ObjectIdWriter objectidwriter, Object obj)
    {
        super(beanserializerbase._handledType);
        _props = beanserializerbase._props;
        _filteredProps = beanserializerbase._filteredProps;
        _typeId = beanserializerbase._typeId;
        _anyGetterWriter = beanserializerbase._anyGetterWriter;
        _objectIdWriter = objectidwriter;
        _propertyFilterId = obj;
        _serializationShape = beanserializerbase._serializationShape;
    }

    protected BeanSerializerBase(BeanSerializerBase beanserializerbase, NameTransformer nametransformer)
    {
        this(beanserializerbase, rename(beanserializerbase._props, nametransformer), rename(beanserializerbase._filteredProps, nametransformer));
    }

    public BeanSerializerBase(BeanSerializerBase beanserializerbase, BeanPropertyWriter abeanpropertywriter[], BeanPropertyWriter abeanpropertywriter1[])
    {
        super(beanserializerbase._handledType);
        _props = abeanpropertywriter;
        _filteredProps = abeanpropertywriter1;
        _typeId = beanserializerbase._typeId;
        _anyGetterWriter = beanserializerbase._anyGetterWriter;
        _objectIdWriter = beanserializerbase._objectIdWriter;
        _propertyFilterId = beanserializerbase._propertyFilterId;
        _serializationShape = beanserializerbase._serializationShape;
    }

    protected BeanSerializerBase(BeanSerializerBase beanserializerbase, String as[])
    {
        Object obj = null;
        super(beanserializerbase._handledType);
        HashSet hashset = ArrayBuilders.arrayToSet(as);
        BeanPropertyWriter abeanpropertywriter[] = beanserializerbase._props;
        BeanPropertyWriter abeanpropertywriter1[] = beanserializerbase._filteredProps;
        int j = abeanpropertywriter.length;
        ArrayList arraylist = new ArrayList(j);
        int i;
        if (abeanpropertywriter1 == null)
        {
            as = null;
        } else
        {
            as = new ArrayList(j);
        }
        i = 0;
        while (i < j) 
        {
            BeanPropertyWriter beanpropertywriter = abeanpropertywriter[i];
            if (!hashset.contains(beanpropertywriter.getName()))
            {
                arraylist.add(beanpropertywriter);
                if (abeanpropertywriter1 != null)
                {
                    as.add(abeanpropertywriter1[i]);
                }
            }
            i++;
        }
        _props = (BeanPropertyWriter[])arraylist.toArray(new BeanPropertyWriter[arraylist.size()]);
        if (as == null)
        {
            as = obj;
        } else
        {
            as = (BeanPropertyWriter[])as.toArray(new BeanPropertyWriter[as.size()]);
        }
        _filteredProps = as;
        _typeId = beanserializerbase._typeId;
        _anyGetterWriter = beanserializerbase._anyGetterWriter;
        _objectIdWriter = beanserializerbase._objectIdWriter;
        _propertyFilterId = beanserializerbase._propertyFilterId;
        _serializationShape = beanserializerbase._serializationShape;
    }

    private static final BeanPropertyWriter[] rename(BeanPropertyWriter abeanpropertywriter[], NameTransformer nametransformer)
    {
        if (abeanpropertywriter != null && abeanpropertywriter.length != 0 && nametransformer != null && nametransformer != NameTransformer.NOP) goto _L2; else goto _L1
_L1:
        BeanPropertyWriter abeanpropertywriter1[] = abeanpropertywriter;
_L4:
        return abeanpropertywriter1;
_L2:
        int j = abeanpropertywriter.length;
        BeanPropertyWriter abeanpropertywriter2[] = new BeanPropertyWriter[j];
        int i = 0;
        do
        {
            abeanpropertywriter1 = abeanpropertywriter2;
            if (i >= j)
            {
                continue;
            }
            BeanPropertyWriter beanpropertywriter = abeanpropertywriter[i];
            if (beanpropertywriter != null)
            {
                abeanpropertywriter2[i] = beanpropertywriter.rename(nametransformer);
            }
            i++;
        } while (true);
        if (true) goto _L4; else goto _L3
_L3:
    }

    protected final String _customTypeId(Object obj)
    {
        obj = _typeId.getValue(obj);
        if (obj == null)
        {
            return "";
        }
        if (obj instanceof String)
        {
            return (String)obj;
        } else
        {
            return obj.toString();
        }
    }

    protected void _serializeObjectId(Object obj, JsonGenerator jsongenerator, SerializerProvider serializerprovider, TypeSerializer typeserializer, WritableObjectId writableobjectid)
        throws IOException, JsonProcessingException, JsonGenerationException
    {
        ObjectIdWriter objectidwriter = _objectIdWriter;
        String s;
        if (_typeId == null)
        {
            s = null;
        } else
        {
            s = _customTypeId(obj);
        }
        if (s == null)
        {
            typeserializer.writeTypePrefixForObject(obj, jsongenerator);
        } else
        {
            typeserializer.writeCustomTypePrefixForObject(obj, jsongenerator, s);
        }
        writableobjectid.writeAsField(jsongenerator, serializerprovider, objectidwriter);
        if (_propertyFilterId != null)
        {
            serializeFieldsFiltered(obj, jsongenerator, serializerprovider);
        } else
        {
            serializeFields(obj, jsongenerator, serializerprovider);
        }
        if (s == null)
        {
            typeserializer.writeTypeSuffixForObject(obj, jsongenerator);
            return;
        } else
        {
            typeserializer.writeCustomTypeSuffixForObject(obj, jsongenerator, s);
            return;
        }
    }

    protected final void _serializeWithObjectId(Object obj, JsonGenerator jsongenerator, SerializerProvider serializerprovider, TypeSerializer typeserializer)
        throws IOException, JsonGenerationException
    {
        ObjectIdWriter objectidwriter = _objectIdWriter;
        WritableObjectId writableobjectid = serializerprovider.findObjectId(obj, objectidwriter.generator);
        if (writableobjectid.writeAsId(jsongenerator, serializerprovider, objectidwriter))
        {
            return;
        }
        Object obj1 = writableobjectid.generateId(obj);
        if (objectidwriter.alwaysAsId)
        {
            objectidwriter.serializer.serialize(obj1, jsongenerator, serializerprovider);
            return;
        } else
        {
            _serializeObjectId(obj, jsongenerator, serializerprovider, typeserializer, writableobjectid);
            return;
        }
    }

    protected final void _serializeWithObjectId(Object obj, JsonGenerator jsongenerator, SerializerProvider serializerprovider, boolean flag)
        throws IOException, JsonGenerationException
    {
        ObjectIdWriter objectidwriter = _objectIdWriter;
        WritableObjectId writableobjectid = serializerprovider.findObjectId(obj, objectidwriter.generator);
        if (!writableobjectid.writeAsId(jsongenerator, serializerprovider, objectidwriter))
        {
            Object obj1 = writableobjectid.generateId(obj);
            if (objectidwriter.alwaysAsId)
            {
                objectidwriter.serializer.serialize(obj1, jsongenerator, serializerprovider);
                return;
            }
            if (flag)
            {
                jsongenerator.writeStartObject();
            }
            writableobjectid.writeAsField(jsongenerator, serializerprovider, objectidwriter);
            if (_propertyFilterId != null)
            {
                serializeFieldsFiltered(obj, jsongenerator, serializerprovider);
            } else
            {
                serializeFields(obj, jsongenerator, serializerprovider);
            }
            if (flag)
            {
                jsongenerator.writeEndObject();
                return;
            }
        }
    }

    protected abstract BeanSerializerBase asArraySerializer();

    public JsonSerializer createContextual(SerializerProvider serializerprovider, BeanProperty beanproperty)
        throws JsonMappingException
    {
        Object obj;
        Object obj1;
        Object obj2;
        String as[];
        AnnotationIntrospector annotationintrospector;
        annotationintrospector = serializerprovider.getAnnotationIntrospector();
        static class _cls1
        {

            static final int $SwitchMap$com$fasterxml$jackson$annotation$JsonFormat$Shape[];

            static 
            {
                $SwitchMap$com$fasterxml$jackson$annotation$JsonFormat$Shape = new int[com.fasterxml.jackson.annotation.JsonFormat.Shape.values().length];
                try
                {
                    $SwitchMap$com$fasterxml$jackson$annotation$JsonFormat$Shape[com.fasterxml.jackson.annotation.JsonFormat.Shape.STRING.ordinal()] = 1;
                }
                catch (NoSuchFieldError nosuchfielderror2) { }
                try
                {
                    $SwitchMap$com$fasterxml$jackson$annotation$JsonFormat$Shape[com.fasterxml.jackson.annotation.JsonFormat.Shape.NUMBER.ordinal()] = 2;
                }
                catch (NoSuchFieldError nosuchfielderror1) { }
                try
                {
                    $SwitchMap$com$fasterxml$jackson$annotation$JsonFormat$Shape[com.fasterxml.jackson.annotation.JsonFormat.Shape.NUMBER_INT.ordinal()] = 3;
                }
                catch (NoSuchFieldError nosuchfielderror)
                {
                    return;
                }
            }
        }

        com.fasterxml.jackson.annotation.JsonFormat.Shape shape;
        Object obj5;
        ObjectIdWriter objectidwriter;
        Object obj6;
        String as1[];
        if (beanproperty == null || annotationintrospector == null)
        {
            obj1 = null;
        } else
        {
            obj1 = beanproperty.getMember();
        }
        as = serializerprovider.getConfig();
        obj = null;
        shape = ((com.fasterxml.jackson.annotation.JsonFormat.Shape) (obj));
        if (obj1 == null) goto _L2; else goto _L1
_L1:
        obj2 = annotationintrospector.findFormat(((com.fasterxml.jackson.databind.introspect.Annotated) (obj1)));
        shape = ((com.fasterxml.jackson.annotation.JsonFormat.Shape) (obj));
        if (obj2 == null) goto _L2; else goto _L3
_L3:
        obj = ((com.fasterxml.jackson.annotation.JsonFormat.Value) (obj2)).getShape();
        shape = ((com.fasterxml.jackson.annotation.JsonFormat.Shape) (obj));
        if (obj == _serializationShape) goto _L2; else goto _L4
_L4:
        shape = ((com.fasterxml.jackson.annotation.JsonFormat.Shape) (obj));
        if (!_handledType.isEnum()) goto _L2; else goto _L5
_L5:
        _cls1..SwitchMap.com.fasterxml.jackson.annotation.JsonFormat.Shape[((com.fasterxml.jackson.annotation.JsonFormat.Shape) (obj)).ordinal()];
        JVM INSTR tableswitch 1 3: default 116
    //                   1 393
    //                   2 393
    //                   3 393;
           goto _L6 _L7 _L7 _L7
_L6:
        shape = ((com.fasterxml.jackson.annotation.JsonFormat.Shape) (obj));
_L2:
        objectidwriter = _objectIdWriter;
        as = null;
        obj6 = null;
        obj2 = obj6;
        obj5 = objectidwriter;
        if (obj1 == null) goto _L9; else goto _L8
_L8:
        as1 = annotationintrospector.findPropertiesToIgnore(((com.fasterxml.jackson.databind.introspect.Annotated) (obj1)));
        obj = annotationintrospector.findObjectIdInfo(((com.fasterxml.jackson.databind.introspect.Annotated) (obj1)));
        if (obj != null) goto _L11; else goto _L10
_L10:
        obj = objectidwriter;
        if (objectidwriter != null)
        {
            obj = annotationintrospector.findObjectReferenceInfo(((com.fasterxml.jackson.databind.introspect.Annotated) (obj1)), new ObjectIdInfo(NAME_FOR_OBJECT_REF, null, null, null));
            obj = _objectIdWriter.withAlwaysAsId(((ObjectIdInfo) (obj)).getAlwaysAsId());
        }
_L16:
        obj1 = annotationintrospector.findFilterId(((com.fasterxml.jackson.databind.introspect.Annotated) (obj1)));
        as = as1;
        obj2 = obj6;
        obj5 = obj;
        if (obj1 == null) goto _L9; else goto _L12
_L12:
        if (_propertyFilterId == null) goto _L14; else goto _L13
_L13:
        as = as1;
        obj2 = obj6;
        obj5 = obj;
        if (obj1.equals(_propertyFilterId)) goto _L9; else goto _L14
_L14:
        obj2 = obj1;
        obj5 = obj;
        as = as1;
_L9:
        obj1 = this;
        obj = obj1;
        if (obj5 != null)
        {
            serializerprovider = ((ObjectIdWriter) (obj5)).withSerializer(serializerprovider.findValueSerializer(((ObjectIdWriter) (obj5)).idType, beanproperty));
            obj = obj1;
            if (serializerprovider != _objectIdWriter)
            {
                obj = ((BeanSerializerBase) (obj1)).withObjectIdWriter(serializerprovider);
            }
        }
        beanproperty = ((BeanProperty) (obj));
        if (as != null)
        {
            beanproperty = ((BeanProperty) (obj));
            if (as.length != 0)
            {
                beanproperty = ((BeanSerializerBase) (obj)).withIgnorals(as);
            }
        }
        serializerprovider = beanproperty;
        if (obj2 != null)
        {
            serializerprovider = beanproperty.withFilterId(obj2);
        }
        beanproperty = shape;
        if (shape == null)
        {
            beanproperty = _serializationShape;
        }
        obj = serializerprovider;
        if (beanproperty == com.fasterxml.jackson.annotation.JsonFormat.Shape.ARRAY)
        {
            obj = serializerprovider.asArraySerializer();
        }
        return ((JsonSerializer) (obj));
_L7:
        obj = as.introspectClassAnnotations(_handledType);
        return serializerprovider.handlePrimaryContextualization(EnumSerializer.construct(_handledType, serializerprovider.getConfig(), ((BeanDescription) (obj)), ((com.fasterxml.jackson.annotation.JsonFormat.Value) (obj2))), beanproperty);
_L11:
        obj = annotationintrospector.findObjectReferenceInfo(((com.fasterxml.jackson.databind.introspect.Annotated) (obj1)), ((ObjectIdInfo) (obj)));
        Object obj3 = ((ObjectIdInfo) (obj)).getGeneratorType();
        Object obj4 = serializerprovider.constructType(((java.lang.reflect.Type) (obj3)));
        obj4 = serializerprovider.getTypeFactory().findTypeParameters(((JavaType) (obj4)), com/fasterxml/jackson/annotation/ObjectIdGenerator)[0];
        if (obj3 == com/fasterxml/jackson/annotation/ObjectIdGenerators$PropertyGenerator)
        {
            obj4 = ((ObjectIdInfo) (obj)).getPropertyName().getSimpleName();
            int i = 0;
            int j = _props.length;
            do
            {
                if (i == j)
                {
                    throw new IllegalArgumentException((new StringBuilder()).append("Invalid Object Id definition for ").append(_handledType.getName()).append(": can not find property with name '").append(((String) (obj4))).append("'").toString());
                }
                obj3 = _props[i];
                if (((String) (obj4)).equals(((BeanPropertyWriter) (obj3)).getName()))
                {
                    if (i > 0)
                    {
                        System.arraycopy(_props, 0, _props, 1, i);
                        _props[0] = ((BeanPropertyWriter) (obj3));
                        if (_filteredProps != null)
                        {
                            obj4 = _filteredProps[i];
                            System.arraycopy(_filteredProps, 0, _filteredProps, 1, i);
                            _filteredProps[0] = ((BeanPropertyWriter) (obj4));
                        }
                    }
                    obj4 = ((BeanPropertyWriter) (obj3)).getType();
                    obj3 = new PropertyBasedObjectIdGenerator(((ObjectIdInfo) (obj)), ((BeanPropertyWriter) (obj3)));
                    obj = ObjectIdWriter.construct(((JavaType) (obj4)), (PropertyName)null, ((ObjectIdGenerator) (obj3)), ((ObjectIdInfo) (obj)).getAlwaysAsId());
                    continue; /* Loop/switch isn't completed */
                }
                i++;
            } while (true);
        }
        obj3 = serializerprovider.objectIdGeneratorInstance(((com.fasterxml.jackson.databind.introspect.Annotated) (obj1)), ((ObjectIdInfo) (obj)));
        obj = ObjectIdWriter.construct(((JavaType) (obj4)), ((ObjectIdInfo) (obj)).getPropertyName(), ((ObjectIdGenerator) (obj3)), ((ObjectIdInfo) (obj)).getAlwaysAsId());
        if (true) goto _L16; else goto _L15
_L15:
    }

    protected JsonSerializer findConvertingSerializer(SerializerProvider serializerprovider, BeanPropertyWriter beanpropertywriter)
        throws JsonMappingException
    {
        Object obj = serializerprovider.getAnnotationIntrospector();
        if (obj != null)
        {
            AnnotatedMember annotatedmember = beanpropertywriter.getMember();
            if (annotatedmember != null)
            {
                obj = ((AnnotationIntrospector) (obj)).findSerializationConverter(annotatedmember);
                if (obj != null)
                {
                    obj = serializerprovider.converterInstance(beanpropertywriter.getMember(), obj);
                    JavaType javatype = ((Converter) (obj)).getOutputType(serializerprovider.getTypeFactory());
                    return new StdDelegatingSerializer(((Converter) (obj)), javatype, serializerprovider.findValueSerializer(javatype, beanpropertywriter));
                }
            }
        }
        return null;
    }

    public void resolve(SerializerProvider serializerprovider)
        throws JsonMappingException
    {
        BeanPropertyWriter beanpropertywriter2;
        int i;
        int j;
        JsonSerializer jsonserializer;
        BeanPropertyWriter beanpropertywriter;
        int k;
        if (_filteredProps == null)
        {
            i = 0;
        } else
        {
            i = _filteredProps.length;
        }
        j = 0;
        k = _props.length;
        if (j >= k)
        {
            break MISSING_BLOCK_LABEL_279;
        }
        beanpropertywriter2 = _props[j];
        if (!beanpropertywriter2.willSuppressNulls() && !beanpropertywriter2.hasNullSerializer())
        {
            jsonserializer = serializerprovider.findNullValueSerializer(beanpropertywriter2);
            if (jsonserializer != null)
            {
                beanpropertywriter2.assignNullSerializer(jsonserializer);
                if (j < i)
                {
                    beanpropertywriter = _filteredProps[j];
                    if (beanpropertywriter != null)
                    {
                        beanpropertywriter.assignNullSerializer(jsonserializer);
                    }
                }
            }
        }
        if (!beanpropertywriter2.hasSerializer())
        {
            break; /* Loop/switch isn't completed */
        }
_L4:
        j++;
        if (true) goto _L2; else goto _L1
_L2:
        break MISSING_BLOCK_LABEL_20;
_L1:
        Object obj;
        Object obj1;
label0:
        {
            obj1 = findConvertingSerializer(serializerprovider, beanpropertywriter2);
            obj = obj1;
            if (obj1 != null)
            {
                break MISSING_BLOCK_LABEL_246;
            }
            obj = beanpropertywriter2.getSerializationType();
            obj1 = obj;
            if (obj != null)
            {
                break label0;
            }
            obj = serializerprovider.constructType(beanpropertywriter2.getGenericPropertyType());
            obj1 = obj;
            if (((JavaType) (obj)).isFinal())
            {
                break label0;
            }
            if (((JavaType) (obj)).isContainerType() || ((JavaType) (obj)).containedTypeCount() > 0)
            {
                beanpropertywriter2.setNonTrivialBaseType(((JavaType) (obj)));
            }
        }
        continue; /* Loop/switch isn't completed */
        JsonSerializer jsonserializer1 = serializerprovider.findValueSerializer(((JavaType) (obj1)), beanpropertywriter2);
        obj = jsonserializer1;
        if (((JavaType) (obj1)).isContainerType())
        {
            obj1 = (TypeSerializer)((JavaType) (obj1)).getContentType().getTypeHandler();
            obj = jsonserializer1;
            if (obj1 != null)
            {
                obj = jsonserializer1;
                if (jsonserializer1 instanceof ContainerSerializer)
                {
                    obj = ((ContainerSerializer)jsonserializer1).withValueTypeSerializer(((TypeSerializer) (obj1)));
                }
            }
        }
        beanpropertywriter2.assignSerializer(((JsonSerializer) (obj)));
        if (j < i)
        {
            BeanPropertyWriter beanpropertywriter1 = _filteredProps[j];
            if (beanpropertywriter1 != null)
            {
                beanpropertywriter1.assignSerializer(((JsonSerializer) (obj)));
            }
        }
        if (true) goto _L4; else goto _L3
_L3:
        if (_anyGetterWriter != null)
        {
            _anyGetterWriter.resolve(serializerprovider);
        }
        return;
    }

    protected void serializeFields(Object obj, JsonGenerator jsongenerator, SerializerProvider serializerprovider)
        throws IOException, JsonGenerationException
    {
        BeanPropertyWriter abeanpropertywriter[];
        BeanPropertyWriter beanpropertywriter;
        int i;
        int j;
        int k;
        int l;
        if (_filteredProps != null && serializerprovider.getActiveView() != null)
        {
            abeanpropertywriter = _filteredProps;
        } else
        {
            abeanpropertywriter = _props;
        }
        j = 0;
        k = 0;
        i = 0;
        try
        {
            l = abeanpropertywriter.length;
        }
        catch (Exception exception)
        {
            if (j == abeanpropertywriter.length)
            {
                jsongenerator = "[anySetter]";
            } else
            {
                jsongenerator = abeanpropertywriter[j].getName();
            }
            wrapAndThrow(serializerprovider, exception, obj, jsongenerator);
            return;
        }
        // Misplaced declaration of an exception variable
        catch (JsonGenerator jsongenerator)
        {
            serializerprovider = new JsonMappingException("Infinite recursion (StackOverflowError)", jsongenerator);
            if (k == abeanpropertywriter.length)
            {
                jsongenerator = "[anySetter]";
            } else
            {
                jsongenerator = abeanpropertywriter[k].getName();
            }
            serializerprovider.prependPath(new com.fasterxml.jackson.databind.JsonMappingException.Reference(obj, jsongenerator));
            throw serializerprovider;
        }
        if (i >= l) goto _L2; else goto _L1
_L1:
        beanpropertywriter = abeanpropertywriter[i];
        if (beanpropertywriter == null)
        {
            continue; /* Loop/switch isn't completed */
        }
        j = i;
        k = i;
        beanpropertywriter.serializeAsField(obj, jsongenerator, serializerprovider);
        i++;
        break MISSING_BLOCK_LABEL_34;
_L2:
        j = i;
        k = i;
        if (_anyGetterWriter == null)
        {
            break MISSING_BLOCK_LABEL_120;
        }
        j = i;
        k = i;
        _anyGetterWriter.getAndSerialize(obj, jsongenerator, serializerprovider);
    }

    protected void serializeFieldsFiltered(Object obj, JsonGenerator jsongenerator, SerializerProvider serializerprovider)
        throws IOException, JsonGenerationException
    {
        BeanPropertyWriter abeanpropertywriter[];
        PropertyFilter propertyfilter;
        if (_filteredProps != null && serializerprovider.getActiveView() != null)
        {
            abeanpropertywriter = _filteredProps;
        } else
        {
            abeanpropertywriter = _props;
        }
        propertyfilter = findPropertyFilter(serializerprovider, _propertyFilterId, obj);
        if (propertyfilter != null) goto _L2; else goto _L1
_L1:
        serializeFields(obj, jsongenerator, serializerprovider);
_L4:
        return;
_L2:
        int i;
        int j;
        int k;
        j = 0;
        k = 0;
        i = 0;
        int l = abeanpropertywriter.length;
_L5:
        BeanPropertyWriter beanpropertywriter;
        if (i >= l)
        {
            break MISSING_BLOCK_LABEL_110;
        }
        beanpropertywriter = abeanpropertywriter[i];
        if (beanpropertywriter == null)
        {
            break MISSING_BLOCK_LABEL_234;
        }
        j = i;
        k = i;
        propertyfilter.serializeAsField(obj, jsongenerator, serializerprovider, beanpropertywriter);
        break MISSING_BLOCK_LABEL_234;
        j = i;
        k = i;
        if (_anyGetterWriter == null) goto _L4; else goto _L3
_L3:
        j = i;
        k = i;
        try
        {
            _anyGetterWriter.getAndFilter(obj, jsongenerator, serializerprovider, propertyfilter);
            return;
        }
        catch (Exception exception)
        {
            if (j == abeanpropertywriter.length)
            {
                jsongenerator = "[anySetter]";
            } else
            {
                jsongenerator = abeanpropertywriter[j].getName();
            }
            wrapAndThrow(serializerprovider, exception, obj, jsongenerator);
            return;
        }
        // Misplaced declaration of an exception variable
        catch (JsonGenerator jsongenerator)
        {
            serializerprovider = new JsonMappingException("Infinite recursion (StackOverflowError)", jsongenerator);
        }
        if (k == abeanpropertywriter.length)
        {
            jsongenerator = "[anySetter]";
        } else
        {
            jsongenerator = abeanpropertywriter[k].getName();
        }
        serializerprovider.prependPath(new com.fasterxml.jackson.databind.JsonMappingException.Reference(obj, jsongenerator));
        throw serializerprovider;
        i++;
          goto _L5
    }

    public void serializeWithType(Object obj, JsonGenerator jsongenerator, SerializerProvider serializerprovider, TypeSerializer typeserializer)
        throws IOException
    {
        if (_objectIdWriter != null)
        {
            _serializeWithObjectId(obj, jsongenerator, serializerprovider, typeserializer);
            return;
        }
        String s;
        if (_typeId == null)
        {
            s = null;
        } else
        {
            s = _customTypeId(obj);
        }
        if (s == null)
        {
            typeserializer.writeTypePrefixForObject(obj, jsongenerator);
        } else
        {
            typeserializer.writeCustomTypePrefixForObject(obj, jsongenerator, s);
        }
        if (_propertyFilterId != null)
        {
            serializeFieldsFiltered(obj, jsongenerator, serializerprovider);
        } else
        {
            serializeFields(obj, jsongenerator, serializerprovider);
        }
        if (s == null)
        {
            typeserializer.writeTypeSuffixForObject(obj, jsongenerator);
            return;
        } else
        {
            typeserializer.writeCustomTypeSuffixForObject(obj, jsongenerator, s);
            return;
        }
    }

    public boolean usesObjectId()
    {
        return _objectIdWriter != null;
    }

    protected abstract BeanSerializerBase withFilterId(Object obj);

    protected abstract BeanSerializerBase withIgnorals(String as[]);

    public abstract BeanSerializerBase withObjectIdWriter(ObjectIdWriter objectidwriter);

}
