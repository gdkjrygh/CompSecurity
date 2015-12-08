// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fasterxml.jackson.databind.ser.std;

import com.fasterxml.jackson.annotation.ObjectIdGenerator;
import com.fasterxml.jackson.core.JsonGenerationException;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.databind.AnnotationIntrospector;
import com.fasterxml.jackson.databind.BeanDescription;
import com.fasterxml.jackson.databind.BeanProperty;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.JsonSerializer;
import com.fasterxml.jackson.databind.SerializerProvider;
import com.fasterxml.jackson.databind.introspect.AnnotatedMember;
import com.fasterxml.jackson.databind.introspect.ObjectIdInfo;
import com.fasterxml.jackson.databind.jsontype.TypeSerializer;
import com.fasterxml.jackson.databind.ser.AnyGetterWriter;
import com.fasterxml.jackson.databind.ser.BeanPropertyFilter;
import com.fasterxml.jackson.databind.ser.BeanPropertyWriter;
import com.fasterxml.jackson.databind.ser.BeanSerializerBuilder;
import com.fasterxml.jackson.databind.ser.ContainerSerializer;
import com.fasterxml.jackson.databind.ser.ContextualSerializer;
import com.fasterxml.jackson.databind.ser.FilterProvider;
import com.fasterxml.jackson.databind.ser.ResolvableSerializer;
import com.fasterxml.jackson.databind.ser.impl.ObjectIdWriter;
import com.fasterxml.jackson.databind.ser.impl.PropertyBasedObjectIdGenerator;
import com.fasterxml.jackson.databind.ser.impl.WritableObjectId;
import com.fasterxml.jackson.databind.type.TypeFactory;
import com.fasterxml.jackson.databind.util.ArrayBuilders;
import com.fasterxml.jackson.databind.util.NameTransformer;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashSet;

// Referenced classes of package com.fasterxml.jackson.databind.ser.std:
//            StdSerializer

public abstract class BeanSerializerBase extends StdSerializer
    implements ContextualSerializer, ResolvableSerializer
{

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
        super(beanserializerbase._handledType);
        _props = beanserializerbase._props;
        _filteredProps = beanserializerbase._filteredProps;
        _typeId = beanserializerbase._typeId;
        _anyGetterWriter = beanserializerbase._anyGetterWriter;
        _objectIdWriter = objectidwriter;
        _propertyFilterId = beanserializerbase._propertyFilterId;
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

    private final void _serializeWithObjectId(Object obj, JsonGenerator jsongenerator, SerializerProvider serializerprovider, TypeSerializer typeserializer)
        throws IOException, JsonGenerationException
    {
        ObjectIdWriter objectidwriter = _objectIdWriter;
        Object obj1 = serializerprovider.findObjectId(obj, objectidwriter.generator);
        Object obj2 = ((WritableObjectId) (obj1)).id;
        if (obj2 != null)
        {
            ((WritableObjectId) (obj1)).serializer.serialize(obj2, jsongenerator, serializerprovider);
            return;
        }
        obj1.serializer = objectidwriter.serializer;
        obj2 = ((WritableObjectId) (obj1)).generator.generateId(obj);
        obj1.id = obj2;
        com.fasterxml.jackson.core.io.SerializedString serializedstring;
        if (_typeId == null)
        {
            obj1 = null;
        } else
        {
            obj1 = _customTypeId(obj);
        }
        if (obj1 == null)
        {
            typeserializer.writeTypePrefixForObject(obj, jsongenerator);
        } else
        {
            typeserializer.writeCustomTypePrefixForObject(obj, jsongenerator, ((String) (obj1)));
        }
        serializedstring = objectidwriter.propertyName;
        if (serializedstring != null)
        {
            jsongenerator.writeFieldName(serializedstring);
            objectidwriter.serializer.serialize(obj2, jsongenerator, serializerprovider);
        }
        if (_propertyFilterId != null)
        {
            serializeFieldsFiltered(obj, jsongenerator, serializerprovider);
        } else
        {
            serializeFields(obj, jsongenerator, serializerprovider);
        }
        if (obj1 == null)
        {
            typeserializer.writeTypeSuffixForObject(obj, jsongenerator);
            return;
        } else
        {
            typeserializer.writeCustomTypeSuffixForObject(obj, jsongenerator, ((String) (obj1)));
            return;
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

    public abstract BeanSerializerBase asArraySerializer();

    public JsonSerializer createContextual(SerializerProvider serializerprovider, BeanProperty beanproperty)
        throws JsonMappingException
    {
        Object obj;
        Object obj1;
        Object obj2;
        AnnotationIntrospector annotationintrospector;
        Object obj4;
        Object obj3 = null;
        obj1 = _objectIdWriter;
        annotationintrospector = serializerprovider.getAnnotationIntrospector();
        if (beanproperty == null || annotationintrospector == null)
        {
            obj2 = null;
        } else
        {
            obj2 = beanproperty.getMember();
        }
        if (obj2 == null) goto _L2; else goto _L1
_L1:
        obj = annotationintrospector.findPropertiesToIgnore(((com.fasterxml.jackson.databind.introspect.Annotated) (obj2)));
        obj4 = annotationintrospector.findObjectIdInfo(((com.fasterxml.jackson.databind.introspect.Annotated) (obj2)));
        if (obj4 != null) goto _L4; else goto _L3
_L3:
        if (obj1 != null)
        {
            obj1 = annotationintrospector.findObjectReferenceInfo(((com.fasterxml.jackson.databind.introspect.Annotated) (obj2)), new ObjectIdInfo("", null, null));
            obj1 = _objectIdWriter.withAlwaysAsId(((ObjectIdInfo) (obj1)).getAlwaysAsId());
        }
_L10:
        if (obj1 == null) goto _L6; else goto _L5
_L5:
        serializerprovider = ((ObjectIdWriter) (obj1)).withSerializer(serializerprovider.findValueSerializer(((ObjectIdWriter) (obj1)).idType, beanproperty));
        if (serializerprovider == _objectIdWriter) goto _L6; else goto _L7
_L7:
        serializerprovider = withObjectIdWriter(serializerprovider);
_L8:
        beanproperty = serializerprovider;
        if (obj != null)
        {
            beanproperty = serializerprovider;
            if (obj.length != 0)
            {
                beanproperty = serializerprovider.withIgnorals(((String []) (obj)));
            }
        }
        serializerprovider = obj3;
        if (obj2 != null)
        {
            obj = annotationintrospector.findFormat(((com.fasterxml.jackson.databind.introspect.Annotated) (obj2)));
            serializerprovider = obj3;
            if (obj != null)
            {
                serializerprovider = ((com.fasterxml.jackson.annotation.JsonFormat.Value) (obj)).getShape();
            }
        }
        obj = serializerprovider;
        if (serializerprovider == null)
        {
            obj = _serializationShape;
        }
        Object obj5;
        int i;
        int j;
        if (obj == com.fasterxml.jackson.annotation.JsonFormat.Shape.ARRAY)
        {
            return beanproperty.asArraySerializer();
        } else
        {
            return beanproperty;
        }
_L4:
        obj1 = annotationintrospector.findObjectReferenceInfo(((com.fasterxml.jackson.databind.introspect.Annotated) (obj2)), ((ObjectIdInfo) (obj4)));
        obj4 = ((ObjectIdInfo) (obj1)).getGeneratorType();
        obj5 = serializerprovider.constructType(((java.lang.reflect.Type) (obj4)));
        obj5 = serializerprovider.getTypeFactory().findTypeParameters(((JavaType) (obj5)), com/fasterxml/jackson/annotation/ObjectIdGenerator)[0];
        if (obj4 == com/fasterxml/jackson/annotation/ObjectIdGenerators$PropertyGenerator)
        {
            obj5 = ((ObjectIdInfo) (obj1)).getPropertyName();
            j = _props.length;
            i = 0;
            do
            {
                if (i == j)
                {
                    throw new IllegalArgumentException((new StringBuilder("Invalid Object Id definition for ")).append(_handledType.getName()).append(": can not find property with name '").append(((String) (obj5))).append("'").toString());
                }
                obj4 = _props[i];
                if (((String) (obj5)).equals(((BeanPropertyWriter) (obj4)).getName()))
                {
                    if (i > 0)
                    {
                        System.arraycopy(_props, 0, _props, 1, i);
                        _props[0] = ((BeanPropertyWriter) (obj4));
                        if (_filteredProps != null)
                        {
                            obj5 = _filteredProps[i];
                            System.arraycopy(_filteredProps, 0, _filteredProps, 1, i);
                            _filteredProps[0] = ((BeanPropertyWriter) (obj5));
                        }
                    }
                    obj1 = ObjectIdWriter.construct(((BeanPropertyWriter) (obj4)).getType(), null, new PropertyBasedObjectIdGenerator(((ObjectIdInfo) (obj1)), ((BeanPropertyWriter) (obj4))), ((ObjectIdInfo) (obj1)).getAlwaysAsId());
                    continue; /* Loop/switch isn't completed */
                }
                i++;
            } while (true);
        }
        obj4 = serializerprovider.objectIdGeneratorInstance(((com.fasterxml.jackson.databind.introspect.Annotated) (obj2)), ((ObjectIdInfo) (obj1)));
        obj1 = ObjectIdWriter.construct(((JavaType) (obj5)), ((ObjectIdInfo) (obj1)).getPropertyName(), ((ObjectIdGenerator) (obj4)), ((ObjectIdInfo) (obj1)).getAlwaysAsId());
        continue; /* Loop/switch isn't completed */
_L6:
        serializerprovider = this;
        if (true) goto _L8; else goto _L2
_L2:
        obj = null;
        if (true) goto _L10; else goto _L9
_L9:
    }

    protected BeanPropertyFilter findFilter(SerializerProvider serializerprovider)
        throws JsonMappingException
    {
        Object obj = _propertyFilterId;
        serializerprovider = serializerprovider.getFilterProvider();
        if (serializerprovider == null)
        {
            throw new JsonMappingException((new StringBuilder("Can not resolve BeanPropertyFilter with id '")).append(obj).append("'; no FilterProvider configured").toString());
        } else
        {
            return serializerprovider.findFilter(obj);
        }
    }

    public void resolve(SerializerProvider serializerprovider)
        throws JsonMappingException
    {
        Object obj;
        BeanPropertyWriter beanpropertywriter1;
        int i;
        int j;
        Object obj1;
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
_L9:
        if (j >= k) goto _L2; else goto _L1
_L1:
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
        if (beanpropertywriter1.hasSerializer()) goto _L4; else goto _L3
_L3:
        obj1 = beanpropertywriter1.getSerializationType();
        obj = obj1;
        if (obj1 != null) goto _L6; else goto _L5
_L5:
        obj1 = serializerprovider.constructType(beanpropertywriter1.getGenericPropertyType());
        obj = obj1;
        if (((JavaType) (obj1)).isFinal()) goto _L6; else goto _L7
_L7:
        if (((JavaType) (obj1)).isContainerType() || ((JavaType) (obj1)).containedTypeCount() > 0)
        {
            beanpropertywriter1.setNonTrivialBaseType(((JavaType) (obj1)));
        }
_L4:
        j++;
        continue; /* Loop/switch isn't completed */
_L6:
        JsonSerializer jsonserializer = serializerprovider.findValueSerializer(((JavaType) (obj)), beanpropertywriter1);
        Object obj2 = jsonserializer;
        if (((JavaType) (obj)).isContainerType())
        {
            obj = (TypeSerializer)((JavaType) (obj)).getContentType().getTypeHandler();
            obj2 = jsonserializer;
            if (obj != null)
            {
                obj2 = jsonserializer;
                if (jsonserializer instanceof ContainerSerializer)
                {
                    obj2 = ((ContainerSerializer)jsonserializer).withValueTypeSerializer(((TypeSerializer) (obj)));
                }
            }
        }
        beanpropertywriter1.assignSerializer(((JsonSerializer) (obj2)));
        if (j < i)
        {
            BeanPropertyWriter beanpropertywriter = _filteredProps[j];
            if (beanpropertywriter != null)
            {
                beanpropertywriter.assignSerializer(((JsonSerializer) (obj2)));
            }
        }
        if (true) goto _L4; else goto _L2
_L2:
        if (_anyGetterWriter != null)
        {
            _anyGetterWriter.resolve(serializerprovider);
        }
        return;
        if (true) goto _L9; else goto _L8
_L8:
    }

    public void serializeFields(Object obj, JsonGenerator jsongenerator, SerializerProvider serializerprovider)
        throws IOException, JsonGenerationException
    {
        BeanPropertyWriter abeanpropertywriter[];
        BeanPropertyWriter beanpropertywriter;
        int i;
        int j;
        int k;
        int l;
        if (_filteredProps != null && serializerprovider.getSerializationView() != null)
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
        throws IOException, JsonGenerationException
    {
        BeanPropertyWriter abeanpropertywriter[];
        BeanPropertyFilter beanpropertyfilter;
        if (_filteredProps != null && serializerprovider.getSerializationView() != null)
        {
            abeanpropertywriter = _filteredProps;
        } else
        {
            abeanpropertywriter = _props;
        }
        beanpropertyfilter = findFilter(serializerprovider);
        if (beanpropertyfilter != null) goto _L2; else goto _L1
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
            break MISSING_BLOCK_LABEL_105;
        }
        beanpropertywriter = abeanpropertywriter[i];
        if (beanpropertywriter == null)
        {
            break MISSING_BLOCK_LABEL_227;
        }
        j = i;
        k = i;
        beanpropertyfilter.serializeAsField(obj, jsongenerator, serializerprovider, beanpropertywriter);
        break MISSING_BLOCK_LABEL_227;
        j = i;
        k = i;
        if (_anyGetterWriter == null) goto _L4; else goto _L3
_L3:
        j = i;
        k = i;
        try
        {
            _anyGetterWriter.getAndSerialize(obj, jsongenerator, serializerprovider);
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
        throws IOException, JsonGenerationException
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

    public abstract BeanSerializerBase withIgnorals(String as[]);

    public abstract BeanSerializerBase withObjectIdWriter(ObjectIdWriter objectidwriter);

}
