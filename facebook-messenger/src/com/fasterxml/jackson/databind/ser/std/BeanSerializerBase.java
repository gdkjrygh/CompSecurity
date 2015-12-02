// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fasterxml.jackson.databind.ser.std;

import com.fasterxml.jackson.annotation.ObjectIdGenerator;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.databind.AnnotationIntrospector;
import com.fasterxml.jackson.databind.BeanProperty;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.JsonSerializer;
import com.fasterxml.jackson.databind.SerializerProvider;
import com.fasterxml.jackson.databind.introspect.AnnotatedMember;
import com.fasterxml.jackson.databind.introspect.ObjectIdInfo;
import com.fasterxml.jackson.databind.jsonschema.JsonSchema;
import com.fasterxml.jackson.databind.jsonschema.JsonSerializableSchema;
import com.fasterxml.jackson.databind.jsonschema.SchemaAware;
import com.fasterxml.jackson.databind.jsontype.TypeSerializer;
import com.fasterxml.jackson.databind.node.ObjectNode;
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
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashSet;

// Referenced classes of package com.fasterxml.jackson.databind.ser.std:
//            StdSerializer

public abstract class BeanSerializerBase extends StdSerializer
    implements SchemaAware, ContextualSerializer, ResolvableSerializer
{

    protected static final BeanPropertyWriter NO_PROPS[] = new BeanPropertyWriter[0];
    protected final AnyGetterWriter _anyGetterWriter;
    protected final BeanPropertyWriter _filteredProps[];
    protected final ObjectIdWriter _objectIdWriter;
    protected final Object _propertyFilterId;
    protected final BeanPropertyWriter _props[];
    protected final AnnotatedMember _typeId;

    protected BeanSerializerBase(JavaType javatype, BeanSerializerBuilder beanserializerbuilder, BeanPropertyWriter abeanpropertywriter[], BeanPropertyWriter abeanpropertywriter1[])
    {
        super(javatype);
        _props = abeanpropertywriter;
        _filteredProps = abeanpropertywriter1;
        if (beanserializerbuilder == null)
        {
            _typeId = null;
            _anyGetterWriter = null;
            _propertyFilterId = null;
            _objectIdWriter = null;
            return;
        } else
        {
            _typeId = beanserializerbuilder.getTypeId();
            _anyGetterWriter = beanserializerbuilder.getAnyGetter();
            _propertyFilterId = beanserializerbuilder.getFilterId();
            _objectIdWriter = beanserializerbuilder.getObjectIdWriter();
            return;
        }
    }

    protected BeanSerializerBase(BeanSerializerBase beanserializerbase)
    {
        this(beanserializerbase, beanserializerbase._props, beanserializerbase._filteredProps);
    }

    protected BeanSerializerBase(BeanSerializerBase beanserializerbase, ObjectIdWriter objectidwriter)
    {
        super(beanserializerbase._handledType);
        _props = beanserializerbase._props;
        _filteredProps = beanserializerbase._filteredProps;
        _typeId = beanserializerbase._typeId;
        _anyGetterWriter = beanserializerbase._anyGetterWriter;
        _objectIdWriter = objectidwriter;
        _propertyFilterId = beanserializerbase._propertyFilterId;
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

    protected abstract BeanSerializerBase asArraySerializer();

    public JsonSerializer createContextual(SerializerProvider serializerprovider, BeanProperty beanproperty)
    {
        String as[];
        Object obj;
        Object obj1;
        AnnotationIntrospector annotationintrospector;
        ObjectIdInfo objectidinfo;
        Object obj2;
        int i;
        as = null;
        obj = _objectIdWriter;
        annotationintrospector = serializerprovider.getAnnotationIntrospector();
        int j;
        if (beanproperty == null || annotationintrospector == null)
        {
            obj1 = null;
        } else
        {
            obj1 = beanproperty.getMember();
        }
        if (beanproperty == null || annotationintrospector == null) goto _L2; else goto _L1
_L1:
        as = annotationintrospector.findPropertiesToIgnore(((com.fasterxml.jackson.databind.introspect.Annotated) (obj1)));
        objectidinfo = annotationintrospector.findObjectIdInfo(((com.fasterxml.jackson.databind.introspect.Annotated) (obj1)));
        if (objectidinfo == null) goto _L2; else goto _L3
_L3:
        obj = objectidinfo.getGeneratorType();
        obj2 = serializerprovider.constructType(((Type) (obj)));
        obj2 = serializerprovider.getTypeFactory().findTypeParameters(((JavaType) (obj2)), com/fasterxml/jackson/annotation/ObjectIdGenerator)[0];
        if (obj != com/fasterxml/jackson/annotation/ObjectIdGenerators$PropertyGenerator) goto _L5; else goto _L4
_L4:
        obj2 = objectidinfo.getPropertyName();
        j = _props.length;
        i = 0;
_L8:
        if (i == j)
        {
            throw new IllegalArgumentException((new StringBuilder()).append("Invalid Object Id definition for ").append(_handledType.getName()).append(": can not find property with name '").append(((String) (obj2))).append("'").toString());
        }
        obj = _props[i];
        if (!((String) (obj2)).equals(((BeanPropertyWriter) (obj)).getName())) goto _L7; else goto _L6
_L6:
        if (i > 0)
        {
            System.arraycopy(_props, 0, _props, 1, i);
            _props[0] = ((BeanPropertyWriter) (obj));
            if (_filteredProps != null)
            {
                obj2 = _filteredProps[i];
                System.arraycopy(_filteredProps, 0, _filteredProps, 1, i);
                _filteredProps[0] = ((BeanPropertyWriter) (obj2));
            }
        }
        obj = ObjectIdWriter.construct(((BeanPropertyWriter) (obj)).getType(), null, new PropertyBasedObjectIdGenerator(objectidinfo, ((BeanPropertyWriter) (obj))));
_L2:
        if (obj == null)
        {
            break MISSING_BLOCK_LABEL_421;
        }
        serializerprovider = ((ObjectIdWriter) (obj)).withSerializer(serializerprovider.findValueSerializer(((ObjectIdWriter) (obj)).idType, beanproperty));
        if (serializerprovider == _objectIdWriter)
        {
            break MISSING_BLOCK_LABEL_421;
        }
        beanproperty = withObjectIdWriter(serializerprovider);
_L9:
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
        if (obj1 != null)
        {
            com.fasterxml.jackson.annotation.JsonFormat.Value value = annotationintrospector.findFormat(((AnnotatedMember) (obj1)));
            beanproperty = serializerprovider;
            if (value != null)
            {
                beanproperty = serializerprovider;
                if (value.getShape() == com.fasterxml.jackson.annotation.JsonFormat.Shape.ARRAY)
                {
                    beanproperty = serializerprovider.asArraySerializer();
                }
            }
        }
        return beanproperty;
_L7:
        i++;
          goto _L8
_L5:
        obj = serializerprovider.objectIdGeneratorInstance(((com.fasterxml.jackson.databind.introspect.Annotated) (obj1)), objectidinfo);
        obj = ObjectIdWriter.construct(((JavaType) (obj2)), objectidinfo.getPropertyName(), ((ObjectIdGenerator) (obj)));
          goto _L2
        beanproperty = this;
          goto _L9
    }

    protected BeanPropertyFilter findFilter(SerializerProvider serializerprovider)
    {
        Object obj = _propertyFilterId;
        serializerprovider = serializerprovider.getFilterProvider();
        if (serializerprovider == null)
        {
            throw new JsonMappingException((new StringBuilder()).append("Can not resolve BeanPropertyFilter with id '").append(obj).append("'; no FilterProvider configured").toString());
        } else
        {
            return serializerprovider.findFilter(obj);
        }
    }

    public JsonNode getSchema(SerializerProvider serializerprovider, Type type)
    {
        ObjectNode objectnode = createSchemaNode("object", true);
        type = (JsonSerializableSchema)_handledType.getAnnotation(com/fasterxml/jackson/databind/jsonschema/JsonSerializableSchema);
        if (type != null)
        {
            type = type.id();
            if (type != null && type.length() > 0)
            {
                objectnode.put("id", type);
            }
        }
        ObjectNode objectnode1 = objectnode.objectNode();
        int i = 0;
        while (i < _props.length) 
        {
            BeanPropertyWriter beanpropertywriter = _props[i];
            type = beanpropertywriter.getSerializationType();
            Object obj;
            JsonSerializer jsonserializer;
            if (type == null)
            {
                type = beanpropertywriter.getGenericPropertyType();
            } else
            {
                type = type.getRawClass();
            }
            jsonserializer = beanpropertywriter.getSerializer();
            obj = jsonserializer;
            if (jsonserializer == null)
            {
                Class class1 = beanpropertywriter.getRawSerializationType();
                obj = class1;
                if (class1 == null)
                {
                    obj = beanpropertywriter.getPropertyType();
                }
                obj = serializerprovider.findValueSerializer(((Class) (obj)), beanpropertywriter);
            }
            if (obj instanceof SchemaAware)
            {
                type = ((SchemaAware)obj).getSchema(serializerprovider, type);
            } else
            {
                type = JsonSchema.getDefaultSchemaNode();
            }
            objectnode1.put(beanpropertywriter.getName(), type);
            i++;
        }
        objectnode.put("properties", objectnode1);
        return objectnode;
    }

    public void resolve(SerializerProvider serializerprovider)
    {
        BeanPropertyWriter beanpropertywriter2;
        int i;
        int j;
        JsonSerializer jsonserializer;
        BeanPropertyWriter beanpropertywriter1;
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
            break MISSING_BLOCK_LABEL_265;
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
                    beanpropertywriter1 = _filteredProps[j];
                    if (beanpropertywriter1 != null)
                    {
                        beanpropertywriter1.assignNullSerializer(jsonserializer);
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
label0:
        {
            JavaType javatype = beanpropertywriter2.getSerializationType();
            obj = javatype;
            if (javatype != null)
            {
                break label0;
            }
            javatype = serializerprovider.constructType(beanpropertywriter2.getGenericPropertyType());
            obj = javatype;
            if (javatype.isFinal())
            {
                break label0;
            }
            if (javatype.isContainerType() || javatype.containedTypeCount() > 0)
            {
                beanpropertywriter2.setNonTrivialBaseType(javatype);
            }
        }
        continue; /* Loop/switch isn't completed */
        JsonSerializer jsonserializer1 = serializerprovider.findValueSerializer(((JavaType) (obj)), beanpropertywriter2);
        Object obj1 = jsonserializer1;
        if (((JavaType) (obj)).isContainerType())
        {
            obj = (TypeSerializer)((JavaType) (obj)).getContentType().getTypeHandler();
            obj1 = jsonserializer1;
            if (obj != null)
            {
                obj1 = jsonserializer1;
                if (jsonserializer1 instanceof ContainerSerializer)
                {
                    obj1 = ((ContainerSerializer)jsonserializer1).withValueTypeSerializer(((TypeSerializer) (obj)));
                }
            }
        }
        beanpropertywriter2.assignSerializer(((JsonSerializer) (obj1)));
        if (j < i)
        {
            BeanPropertyWriter beanpropertywriter = _filteredProps[j];
            if (beanpropertywriter != null)
            {
                beanpropertywriter.assignSerializer(((JsonSerializer) (obj1)));
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

    public abstract void serialize(Object obj, JsonGenerator jsongenerator, SerializerProvider serializerprovider);

    protected void serializeFields(Object obj, JsonGenerator jsongenerator, SerializerProvider serializerprovider)
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
            serializerprovider = new JsonMappingException("Infinite recursion (StackOverflowError)");
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
            break MISSING_BLOCK_LABEL_226;
        }
        j = i;
        k = i;
        beanpropertyfilter.serializeAsField(obj, jsongenerator, serializerprovider, beanpropertywriter);
        break MISSING_BLOCK_LABEL_226;
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
            serializerprovider = new JsonMappingException("Infinite recursion (StackOverflowError)");
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

    protected abstract BeanSerializerBase withIgnorals(String as[]);

    public abstract BeanSerializerBase withObjectIdWriter(ObjectIdWriter objectidwriter);

}
