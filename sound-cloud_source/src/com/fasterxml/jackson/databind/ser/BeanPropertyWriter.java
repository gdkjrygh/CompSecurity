// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fasterxml.jackson.databind.ser;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.io.SerializedString;
import com.fasterxml.jackson.databind.BeanProperty;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.JsonSerializer;
import com.fasterxml.jackson.databind.SerializerProvider;
import com.fasterxml.jackson.databind.introspect.AnnotatedField;
import com.fasterxml.jackson.databind.introspect.AnnotatedMember;
import com.fasterxml.jackson.databind.introspect.AnnotatedMethod;
import com.fasterxml.jackson.databind.introspect.BeanPropertyDefinition;
import com.fasterxml.jackson.databind.jsontype.TypeSerializer;
import com.fasterxml.jackson.databind.ser.impl.PropertySerializerMap;
import com.fasterxml.jackson.databind.ser.impl.UnwrappingBeanPropertyWriter;
import com.fasterxml.jackson.databind.util.Annotations;
import com.fasterxml.jackson.databind.util.NameTransformer;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Type;
import java.util.HashMap;

public class BeanPropertyWriter
    implements BeanProperty
{

    public static final Object MARKER_FOR_EMPTY = new Object();
    protected final Method _accessorMethod;
    protected final JavaType _cfgSerializationType;
    protected final Annotations _contextAnnotations;
    protected final JavaType _declaredType;
    public PropertySerializerMap _dynamicSerializers;
    protected final Field _field;
    protected final Class _includeInViews[];
    protected HashMap _internalSettings;
    protected final AnnotatedMember _member;
    public final SerializedString _name;
    public JavaType _nonTrivialBaseType;
    protected JsonSerializer _nullSerializer;
    public JsonSerializer _serializer;
    protected final boolean _suppressNulls;
    public final Object _suppressableValue;
    public TypeSerializer _typeSerializer;

    public BeanPropertyWriter(BeanPropertyDefinition beanpropertydefinition, AnnotatedMember annotatedmember, Annotations annotations, JavaType javatype, JsonSerializer jsonserializer, TypeSerializer typeserializer, JavaType javatype1, 
            boolean flag, Object obj)
    {
        _member = annotatedmember;
        _contextAnnotations = annotations;
        _name = new SerializedString(beanpropertydefinition.getName());
        _declaredType = javatype;
        _serializer = jsonserializer;
        if (jsonserializer == null)
        {
            annotations = PropertySerializerMap.emptyMap();
        } else
        {
            annotations = null;
        }
        _dynamicSerializers = annotations;
        _typeSerializer = typeserializer;
        _cfgSerializationType = javatype1;
        if (annotatedmember instanceof AnnotatedField)
        {
            _accessorMethod = null;
            _field = (Field)annotatedmember.getMember();
        } else
        if (annotatedmember instanceof AnnotatedMethod)
        {
            _accessorMethod = (Method)annotatedmember.getMember();
            _field = null;
        } else
        {
            throw new IllegalArgumentException((new StringBuilder("Can not pass member of type ")).append(annotatedmember.getClass().getName()).toString());
        }
        _suppressNulls = flag;
        _suppressableValue = obj;
        _includeInViews = beanpropertydefinition.findViews();
        _nullSerializer = null;
    }

    public BeanPropertyWriter(BeanPropertyWriter beanpropertywriter)
    {
        this(beanpropertywriter, beanpropertywriter._name);
    }

    public BeanPropertyWriter(BeanPropertyWriter beanpropertywriter, SerializedString serializedstring)
    {
        _name = serializedstring;
        _member = beanpropertywriter._member;
        _contextAnnotations = beanpropertywriter._contextAnnotations;
        _declaredType = beanpropertywriter._declaredType;
        _accessorMethod = beanpropertywriter._accessorMethod;
        _field = beanpropertywriter._field;
        _serializer = beanpropertywriter._serializer;
        _nullSerializer = beanpropertywriter._nullSerializer;
        if (beanpropertywriter._internalSettings != null)
        {
            _internalSettings = new HashMap(beanpropertywriter._internalSettings);
        }
        _cfgSerializationType = beanpropertywriter._cfgSerializationType;
        _dynamicSerializers = beanpropertywriter._dynamicSerializers;
        _suppressNulls = beanpropertywriter._suppressNulls;
        _suppressableValue = beanpropertywriter._suppressableValue;
        _includeInViews = beanpropertywriter._includeInViews;
        _typeSerializer = beanpropertywriter._typeSerializer;
        _nonTrivialBaseType = beanpropertywriter._nonTrivialBaseType;
    }

    public JsonSerializer _findAndAddDynamic(PropertySerializerMap propertyserializermap, Class class1, SerializerProvider serializerprovider)
        throws JsonMappingException
    {
        if (_nonTrivialBaseType != null)
        {
            class1 = propertyserializermap.findAndAddSerializer(serializerprovider.constructSpecializedType(_nonTrivialBaseType, class1), serializerprovider, this);
        } else
        {
            class1 = propertyserializermap.findAndAddSerializer(class1, serializerprovider, this);
        }
        if (propertyserializermap != ((com.fasterxml.jackson.databind.ser.impl.PropertySerializerMap.SerializerAndMapResult) (class1)).map)
        {
            _dynamicSerializers = ((com.fasterxml.jackson.databind.ser.impl.PropertySerializerMap.SerializerAndMapResult) (class1)).map;
        }
        return ((com.fasterxml.jackson.databind.ser.impl.PropertySerializerMap.SerializerAndMapResult) (class1)).serializer;
    }

    public void _handleSelfReference(Object obj, JsonSerializer jsonserializer)
        throws JsonMappingException
    {
        if (jsonserializer.usesObjectId())
        {
            return;
        } else
        {
            throw new JsonMappingException("Direct self-reference leading to cycle");
        }
    }

    public void assignNullSerializer(JsonSerializer jsonserializer)
    {
        if (_nullSerializer != null && _nullSerializer != jsonserializer)
        {
            throw new IllegalStateException("Can not override null serializer");
        } else
        {
            _nullSerializer = jsonserializer;
            return;
        }
    }

    public void assignSerializer(JsonSerializer jsonserializer)
    {
        if (_serializer != null && _serializer != jsonserializer)
        {
            throw new IllegalStateException("Can not override serializer");
        } else
        {
            _serializer = jsonserializer;
            return;
        }
    }

    public final Object get(Object obj)
        throws Exception
    {
        if (_accessorMethod != null)
        {
            return _accessorMethod.invoke(obj, new Object[0]);
        } else
        {
            return _field.get(obj);
        }
    }

    public Type getGenericPropertyType()
    {
        if (_accessorMethod != null)
        {
            return _accessorMethod.getGenericReturnType();
        } else
        {
            return _field.getGenericType();
        }
    }

    public AnnotatedMember getMember()
    {
        return _member;
    }

    public String getName()
    {
        return _name.getValue();
    }

    public JavaType getSerializationType()
    {
        return _cfgSerializationType;
    }

    public JavaType getType()
    {
        return _declaredType;
    }

    public Class[] getViews()
    {
        return _includeInViews;
    }

    public boolean hasNullSerializer()
    {
        return _nullSerializer != null;
    }

    public boolean hasSerializer()
    {
        return _serializer != null;
    }

    public BeanPropertyWriter rename(NameTransformer nametransformer)
    {
        nametransformer = nametransformer.transform(_name.getValue());
        if (nametransformer.equals(_name.toString()))
        {
            return this;
        } else
        {
            return new BeanPropertyWriter(this, new SerializedString(nametransformer));
        }
    }

    public void serializeAsColumn(Object obj, JsonGenerator jsongenerator, SerializerProvider serializerprovider)
        throws Exception
    {
        Object obj1 = get(obj);
        JsonSerializer jsonserializer;
        JsonSerializer jsonserializer1;
        if (obj1 == null)
        {
            if (_nullSerializer != null)
            {
                _nullSerializer.serialize(null, jsongenerator, serializerprovider);
            } else
            {
                jsongenerator.writeNull();
            }
        }
        jsonserializer1 = _serializer;
        jsonserializer = jsonserializer1;
        if (jsonserializer1 == null)
        {
            Class class1 = obj1.getClass();
            PropertySerializerMap propertyserializermap = _dynamicSerializers;
            JsonSerializer jsonserializer2 = propertyserializermap.serializerFor(class1);
            jsonserializer = jsonserializer2;
            if (jsonserializer2 == null)
            {
                jsonserializer = _findAndAddDynamic(propertyserializermap, class1, serializerprovider);
            }
        }
        if (_suppressableValue != null)
        {
            if (MARKER_FOR_EMPTY == _suppressableValue)
            {
                if (jsonserializer.isEmpty(obj1))
                {
                    serializeAsPlaceholder(obj, jsongenerator, serializerprovider);
                    return;
                }
            } else
            if (_suppressableValue.equals(obj1))
            {
                serializeAsPlaceholder(obj, jsongenerator, serializerprovider);
                return;
            }
        }
        if (obj1 == obj)
        {
            _handleSelfReference(obj, jsonserializer);
        }
        if (_typeSerializer == null)
        {
            jsonserializer.serialize(obj1, jsongenerator, serializerprovider);
            return;
        } else
        {
            jsonserializer.serializeWithType(obj1, jsongenerator, serializerprovider, _typeSerializer);
            return;
        }
    }

    public void serializeAsField(Object obj, JsonGenerator jsongenerator, SerializerProvider serializerprovider)
        throws Exception
    {
        Object obj1 = get(obj);
        if (obj1 != null) goto _L2; else goto _L1
_L1:
        if (_nullSerializer != null)
        {
            jsongenerator.writeFieldName(_name);
            _nullSerializer.serialize(null, jsongenerator, serializerprovider);
        }
_L4:
        return;
_L2:
        JsonSerializer jsonserializer;
        JsonSerializer jsonserializer1 = _serializer;
        jsonserializer = jsonserializer1;
        if (jsonserializer1 == null)
        {
            Class class1 = obj1.getClass();
            PropertySerializerMap propertyserializermap = _dynamicSerializers;
            JsonSerializer jsonserializer2 = propertyserializermap.serializerFor(class1);
            jsonserializer = jsonserializer2;
            if (jsonserializer2 == null)
            {
                jsonserializer = _findAndAddDynamic(propertyserializermap, class1, serializerprovider);
            }
        }
        if (_suppressableValue == null)
        {
            break; /* Loop/switch isn't completed */
        }
        if (MARKER_FOR_EMPTY != _suppressableValue)
        {
            break MISSING_BLOCK_LABEL_160;
        }
        if (jsonserializer.isEmpty(obj1)) goto _L4; else goto _L3
_L3:
        if (obj1 == obj)
        {
            _handleSelfReference(obj, jsonserializer);
        }
        jsongenerator.writeFieldName(_name);
        if (_typeSerializer == null)
        {
            jsonserializer.serialize(obj1, jsongenerator, serializerprovider);
            return;
        } else
        {
            jsonserializer.serializeWithType(obj1, jsongenerator, serializerprovider, _typeSerializer);
            return;
        }
        if (_suppressableValue.equals(obj1))
        {
            return;
        }
          goto _L3
    }

    public void serializeAsPlaceholder(Object obj, JsonGenerator jsongenerator, SerializerProvider serializerprovider)
        throws Exception
    {
        if (_nullSerializer != null)
        {
            _nullSerializer.serialize(null, jsongenerator, serializerprovider);
            return;
        } else
        {
            jsongenerator.writeNull();
            return;
        }
    }

    public void setNonTrivialBaseType(JavaType javatype)
    {
        _nonTrivialBaseType = javatype;
    }

    public String toString()
    {
        StringBuilder stringbuilder = new StringBuilder(40);
        stringbuilder.append("property '").append(getName()).append("' (");
        if (_accessorMethod != null)
        {
            stringbuilder.append("via method ").append(_accessorMethod.getDeclaringClass().getName()).append("#").append(_accessorMethod.getName());
        } else
        {
            stringbuilder.append("field \"").append(_field.getDeclaringClass().getName()).append("#").append(_field.getName());
        }
        if (_serializer == null)
        {
            stringbuilder.append(", no static serializer");
        } else
        {
            stringbuilder.append((new StringBuilder(", static serializer of type ")).append(_serializer.getClass().getName()).toString());
        }
        stringbuilder.append(')');
        return stringbuilder.toString();
    }

    public BeanPropertyWriter unwrappingWriter(NameTransformer nametransformer)
    {
        return new UnwrappingBeanPropertyWriter(this, nametransformer);
    }

    public boolean willSuppressNulls()
    {
        return _suppressNulls;
    }

}
