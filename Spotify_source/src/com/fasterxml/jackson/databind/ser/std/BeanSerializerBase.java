// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fasterxml.jackson.databind.ser.std;

import com.fasterxml.jackson.annotation.ObjectIdGenerator;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.databind.AnnotationIntrospector;
import com.fasterxml.jackson.databind.BeanDescription;
import com.fasterxml.jackson.databind.BeanProperty;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.JsonSerializer;
import com.fasterxml.jackson.databind.PropertyName;
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
import java.util.ArrayList;
import java.util.HashSet;

// Referenced classes of package com.fasterxml.jackson.databind.ser.std:
//            StdSerializer, StdDelegatingSerializer

public abstract class BeanSerializerBase extends StdSerializer
    implements ContextualSerializer, ResolvableSerializer
{

    protected static final PropertyName NAME_FOR_OBJECT_REF = new PropertyName("#object-ref");
    public static final BeanPropertyWriter NO_PROPS[] = new BeanPropertyWriter[0];
    public final AnyGetterWriter _anyGetterWriter;
    public final BeanPropertyWriter _filteredProps[];
    public final ObjectIdWriter _objectIdWriter;
    public final Object _propertyFilterId;
    public final BeanPropertyWriter _props[];
    protected final com.fasterxml.jackson.annotation.JsonFormat.Shape _serializationShape;
    protected final AnnotatedMember _typeId;

    public BeanSerializerBase(JavaType javatype, BeanSerializerBuilder beanserializerbuilder, BeanPropertyWriter abeanpropertywriter[], BeanPropertyWriter abeanpropertywriter1[])
    {
        Object obj;
        obj = null;
        super(javatype);
        _props = abeanpropertywriter;
        _filteredProps = abeanpropertywriter1;
        if (beanserializerbuilder != null) goto _L2; else goto _L1
_L1:
        _typeId = null;
        _anyGetterWriter = null;
        _propertyFilterId = null;
        _objectIdWriter = null;
        javatype = obj;
_L4:
        _serializationShape = javatype;
        return;
_L2:
        _typeId = beanserializerbuilder.getTypeId();
        _anyGetterWriter = beanserializerbuilder.getAnyGetter();
        _propertyFilterId = beanserializerbuilder.getFilterId();
        _objectIdWriter = beanserializerbuilder.getObjectIdWriter();
        beanserializerbuilder = beanserializerbuilder.getBeanDescription().findExpectedFormat(null);
        javatype = obj;
        if (beanserializerbuilder != null)
        {
            javatype = beanserializerbuilder.getShape();
        }
        if (true) goto _L4; else goto _L3
_L3:
    }

    public BeanSerializerBase(BeanSerializerBase beanserializerbase, ObjectIdWriter objectidwriter)
    {
        this(beanserializerbase, objectidwriter, beanserializerbase._propertyFilterId);
    }

    public BeanSerializerBase(BeanSerializerBase beanserializerbase, ObjectIdWriter objectidwriter, Object obj)
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

    public BeanSerializerBase(BeanSerializerBase beanserializerbase, NameTransformer nametransformer)
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

    public BeanSerializerBase(BeanSerializerBase beanserializerbase, String as[])
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
        for (i = 0; i < j; i++)
        {
            BeanPropertyWriter beanpropertywriter = abeanpropertywriter[i];
            if (hashset.contains(beanpropertywriter.getName()))
            {
                continue;
            }
            arraylist.add(beanpropertywriter);
            if (abeanpropertywriter1 != null)
            {
                as.add(abeanpropertywriter1[i]);
            }
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

    private final String _customTypeId(Object obj)
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

    private static final BeanPropertyWriter[] rename(BeanPropertyWriter abeanpropertywriter[], NameTransformer nametransformer)
    {
        if (abeanpropertywriter == null || abeanpropertywriter.length == 0 || nametransformer == null || nametransformer == NameTransformer.NOP)
        {
            return abeanpropertywriter;
        }
        int j = abeanpropertywriter.length;
        BeanPropertyWriter abeanpropertywriter1[] = new BeanPropertyWriter[j];
        for (int i = 0; i < j; i++)
        {
            BeanPropertyWriter beanpropertywriter = abeanpropertywriter[i];
            if (beanpropertywriter != null)
            {
                abeanpropertywriter1[i] = beanpropertywriter.rename(nametransformer);
            }
        }

        return abeanpropertywriter1;
    }

    protected void _serializeObjectId(Object obj, JsonGenerator jsongenerator, SerializerProvider serializerprovider, TypeSerializer typeserializer, WritableObjectId writableobjectid)
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

    public final void _serializeWithObjectId(Object obj, JsonGenerator jsongenerator, SerializerProvider serializerprovider, TypeSerializer typeserializer)
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

    public final void _serializeWithObjectId(Object obj, JsonGenerator jsongenerator, SerializerProvider serializerprovider, boolean flag)
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

    public abstract BeanSerializerBase asArraySerializer();

    public JsonSerializer createContextual(SerializerProvider serializerprovider, BeanProperty beanproperty)
    {
        Object obj;
        Object obj1;
        Object obj2;
        String as[];
        AnnotationIntrospector annotationintrospector;
        obj1 = _objectIdWriter;
        annotationintrospector = serializerprovider.getAnnotationIntrospector();
        Object obj3;
        if (beanproperty == null || annotationintrospector == null)
        {
            obj2 = null;
        } else
        {
            obj2 = beanproperty.getMember();
        }
        if (obj2 == null)
        {
            break MISSING_BLOCK_LABEL_549;
        }
        as = annotationintrospector.findPropertiesToIgnore(((com.fasterxml.jackson.databind.introspect.Annotated) (obj2)));
        obj = annotationintrospector.findObjectIdInfo(((com.fasterxml.jackson.databind.introspect.Annotated) (obj2)));
        if (obj != null) goto _L2; else goto _L1
_L1:
        obj = obj1;
        if (obj1 != null)
        {
            obj = annotationintrospector.findObjectReferenceInfo(((com.fasterxml.jackson.databind.introspect.Annotated) (obj2)), new ObjectIdInfo(NAME_FOR_OBJECT_REF, null, null, null));
            obj = _objectIdWriter.withAlwaysAsId(((ObjectIdInfo) (obj)).getAlwaysAsId());
        }
_L9:
        obj3 = annotationintrospector.findFilterId(((com.fasterxml.jackson.databind.introspect.Annotated) (obj2)));
        Object obj4;
        int i;
        int j;
        if (obj3 != null && (_propertyFilterId == null || !obj3.equals(_propertyFilterId)))
        {
            obj1 = obj;
            obj = obj3;
        } else
        {
            obj1 = obj;
            obj = null;
        }
_L13:
        if (obj1 == null) goto _L4; else goto _L3
_L3:
        serializerprovider = ((ObjectIdWriter) (obj1)).withSerializer(serializerprovider.findValueSerializer(((ObjectIdWriter) (obj1)).idType, beanproperty));
        if (serializerprovider == _objectIdWriter) goto _L4; else goto _L5
_L5:
        beanproperty = withObjectIdWriter(serializerprovider);
_L12:
        serializerprovider = beanproperty;
        if (as != null)
        {
            serializerprovider = beanproperty;
            if (as.length != 0)
            {
                serializerprovider = beanproperty.withIgnorals(as);
            }
        }
        beanproperty = serializerprovider;
        if (obj != null)
        {
            beanproperty = serializerprovider.withFilterId(obj);
        }
        if (obj2 == null) goto _L7; else goto _L6
_L6:
        serializerprovider = annotationintrospector.findFormat(((com.fasterxml.jackson.databind.introspect.Annotated) (obj2)));
        if (serializerprovider == null) goto _L7; else goto _L8
_L8:
        serializerprovider = serializerprovider.getShape();
_L11:
        obj = serializerprovider;
        if (serializerprovider == null)
        {
            obj = _serializationShape;
        }
        if (obj == com.fasterxml.jackson.annotation.JsonFormat.Shape.ARRAY)
        {
            return beanproperty.asArraySerializer();
        } else
        {
            return beanproperty;
        }
_L2:
        obj = annotationintrospector.findObjectReferenceInfo(((com.fasterxml.jackson.databind.introspect.Annotated) (obj2)), ((ObjectIdInfo) (obj)));
        obj1 = ((ObjectIdInfo) (obj)).getGeneratorType();
        obj4 = serializerprovider.constructType(((java.lang.reflect.Type) (obj1)));
        obj4 = serializerprovider.getTypeFactory().findTypeParameters(((JavaType) (obj4)), com/fasterxml/jackson/annotation/ObjectIdGenerator)[0];
        if (obj1 != com/fasterxml/jackson/annotation/ObjectIdGenerators$PropertyGenerator)
        {
            break MISSING_BLOCK_LABEL_501;
        }
        obj4 = ((ObjectIdInfo) (obj)).getPropertyName().getSimpleName();
        j = _props.length;
        i = 0;
_L10:
label0:
        {
            if (i == j)
            {
                throw new IllegalArgumentException((new StringBuilder("Invalid Object Id definition for ")).append(_handledType.getName()).append(": can not find property with name '").append(((String) (obj4))).append("'").toString());
            }
            obj1 = _props[i];
            if (!((String) (obj4)).equals(((BeanPropertyWriter) (obj1)).getName()))
            {
                break label0;
            }
            if (i > 0)
            {
                System.arraycopy(_props, 0, _props, 1, i);
                _props[0] = ((BeanPropertyWriter) (obj1));
                if (_filteredProps != null)
                {
                    obj4 = _filteredProps[i];
                    System.arraycopy(_filteredProps, 0, _filteredProps, 1, i);
                    _filteredProps[0] = ((BeanPropertyWriter) (obj4));
                }
            }
            obj = ObjectIdWriter.construct(((BeanPropertyWriter) (obj1)).getType(), null, new PropertyBasedObjectIdGenerator(((ObjectIdInfo) (obj)), ((BeanPropertyWriter) (obj1))), ((ObjectIdInfo) (obj)).getAlwaysAsId());
        }
          goto _L9
        i++;
          goto _L10
        obj1 = serializerprovider.objectIdGeneratorInstance(((com.fasterxml.jackson.databind.introspect.Annotated) (obj2)), ((ObjectIdInfo) (obj)));
        obj = ObjectIdWriter.construct(((JavaType) (obj4)), ((ObjectIdInfo) (obj)).getPropertyName(), ((ObjectIdGenerator) (obj1)), ((ObjectIdInfo) (obj)).getAlwaysAsId());
          goto _L9
_L7:
        serializerprovider = null;
          goto _L11
_L4:
        beanproperty = this;
          goto _L12
        as = null;
        obj = null;
          goto _L13
    }

    protected JsonSerializer findConvertingSerializer(SerializerProvider serializerprovider, BeanPropertyWriter beanpropertywriter)
    {
        Object obj = serializerprovider.getAnnotationIntrospector();
        if (obj != null)
        {
            obj = ((AnnotationIntrospector) (obj)).findSerializationConverter(beanpropertywriter.getMember());
            if (obj != null)
            {
                obj = serializerprovider.converterInstance(beanpropertywriter.getMember(), obj);
                JavaType javatype = ((Converter) (obj)).getOutputType(serializerprovider.getTypeFactory());
                return new StdDelegatingSerializer(((Converter) (obj)), javatype, serializerprovider.findValueSerializer(javatype, beanpropertywriter));
            }
        }
        return null;
    }

    public void resolve(SerializerProvider serializerprovider)
    {
        Object obj;
        Object obj1;
        BeanPropertyWriter beanpropertywriter1;
        int i;
        int j;
        int k;
        if (_filteredProps == null)
        {
            i = 0;
        } else
        {
            i = _filteredProps.length;
        }
        k = _props.length;
        j = 0;
        if (j >= k)
        {
            break MISSING_BLOCK_LABEL_276;
        }
        beanpropertywriter1 = _props[j];
        if (!beanpropertywriter1.willSuppressNulls() && !beanpropertywriter1.hasNullSerializer())
        {
            obj = serializerprovider.findNullValueSerializer(beanpropertywriter1);
            if (obj != null)
            {
                beanpropertywriter1.assignNullSerializer(((JsonSerializer) (obj)));
                if (j < i)
                {
                    obj1 = _filteredProps[j];
                    if (obj1 != null)
                    {
                        ((BeanPropertyWriter) (obj1)).assignNullSerializer(((JsonSerializer) (obj)));
                    }
                }
            }
        }
        if (!beanpropertywriter1.hasSerializer())
        {
            obj1 = findConvertingSerializer(serializerprovider, beanpropertywriter1);
            obj = obj1;
            if (obj1 != null)
            {
                break MISSING_BLOCK_LABEL_243;
            }
            obj = beanpropertywriter1.getSerializationType();
            obj1 = obj;
            if (obj != null)
            {
                break; /* Loop/switch isn't completed */
            }
            obj = serializerprovider.constructType(beanpropertywriter1.getGenericPropertyType());
            obj1 = obj;
            if (((JavaType) (obj)).isFinal())
            {
                break; /* Loop/switch isn't completed */
            }
            if (((JavaType) (obj)).isContainerType() || ((JavaType) (obj)).containedTypeCount() > 0)
            {
                beanpropertywriter1.setNonTrivialBaseType(((JavaType) (obj)));
            }
        }
_L4:
        j++;
        if (true) goto _L2; else goto _L1
_L2:
        break MISSING_BLOCK_LABEL_20;
_L1:
        JsonSerializer jsonserializer = serializerprovider.findValueSerializer(((JavaType) (obj1)), beanpropertywriter1);
        obj = jsonserializer;
        if (((JavaType) (obj1)).isContainerType())
        {
            obj1 = (TypeSerializer)((JavaType) (obj1)).getContentType().getTypeHandler();
            obj = jsonserializer;
            if (obj1 != null)
            {
                obj = jsonserializer;
                if (jsonserializer instanceof ContainerSerializer)
                {
                    obj = ((ContainerSerializer)jsonserializer).withValueTypeSerializer(((TypeSerializer) (obj1)));
                }
            }
        }
        beanpropertywriter1.assignSerializer(((JsonSerializer) (obj)));
        if (j < i)
        {
            BeanPropertyWriter beanpropertywriter = _filteredProps[j];
            if (beanpropertywriter != null)
            {
                beanpropertywriter.assignSerializer(((JsonSerializer) (obj)));
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

    public void serializeFields(Object obj, JsonGenerator jsongenerator, SerializerProvider serializerprovider)
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

    public void serializeFieldsFiltered(Object obj, JsonGenerator jsongenerator, SerializerProvider serializerprovider)
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

    public abstract BeanSerializerBase withFilterId(Object obj);

    public abstract BeanSerializerBase withIgnorals(String as[]);

    public abstract BeanSerializerBase withObjectIdWriter(ObjectIdWriter objectidwriter);

}
