// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fasterxml.jackson.databind.deser.impl;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.deser.SettableBeanProperty;
import com.fasterxml.jackson.databind.jsontype.TypeDeserializer;
import com.fasterxml.jackson.databind.jsontype.TypeIdResolver;
import com.fasterxml.jackson.databind.util.TokenBuffer;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;

// Referenced classes of package com.fasterxml.jackson.databind.deser.impl:
//            PropertyBasedCreator, PropertyValueBuffer

public class ExternalTypeHandler
{
    public static class Builder
    {

        private final HashMap _nameToPropertyIndex = new HashMap();
        private final ArrayList _properties = new ArrayList();

        public void addExternal(SettableBeanProperty settablebeanproperty, TypeDeserializer typedeserializer)
        {
            Integer integer = Integer.valueOf(_properties.size());
            _properties.add(new ExtTypedProperty(settablebeanproperty, typedeserializer));
            _nameToPropertyIndex.put(settablebeanproperty.getName(), integer);
            _nameToPropertyIndex.put(typedeserializer.getPropertyName(), integer);
        }

        public ExternalTypeHandler build()
        {
            return new ExternalTypeHandler((ExtTypedProperty[])_properties.toArray(new ExtTypedProperty[_properties.size()]), _nameToPropertyIndex, null, null);
        }

        public Builder()
        {
        }
    }

    private static final class ExtTypedProperty
    {

        private final SettableBeanProperty _property;
        private final TypeDeserializer _typeDeserializer;
        private final String _typePropertyName;

        public final String getDefaultTypeId()
        {
            Class class1 = _typeDeserializer.getDefaultImpl();
            if (class1 == null)
            {
                return null;
            } else
            {
                return _typeDeserializer.getTypeIdResolver().idFromValueAndType(null, class1);
            }
        }

        public final SettableBeanProperty getProperty()
        {
            return _property;
        }

        public final String getTypePropertyName()
        {
            return _typePropertyName;
        }

        public final boolean hasDefaultType()
        {
            return _typeDeserializer.getDefaultImpl() != null;
        }

        public final boolean hasTypePropertyName(String s)
        {
            return s.equals(_typePropertyName);
        }

        public ExtTypedProperty(SettableBeanProperty settablebeanproperty, TypeDeserializer typedeserializer)
        {
            _property = settablebeanproperty;
            _typeDeserializer = typedeserializer;
            _typePropertyName = typedeserializer.getPropertyName();
        }
    }


    private final HashMap _nameToPropertyIndex;
    private final ExtTypedProperty _properties[];
    private final TokenBuffer _tokens[];
    private final String _typeIds[];

    protected ExternalTypeHandler(ExternalTypeHandler externaltypehandler)
    {
        _properties = externaltypehandler._properties;
        _nameToPropertyIndex = externaltypehandler._nameToPropertyIndex;
        int i = _properties.length;
        _typeIds = new String[i];
        _tokens = new TokenBuffer[i];
    }

    protected ExternalTypeHandler(ExtTypedProperty aexttypedproperty[], HashMap hashmap, String as[], TokenBuffer atokenbuffer[])
    {
        _properties = aexttypedproperty;
        _nameToPropertyIndex = hashmap;
        _typeIds = as;
        _tokens = atokenbuffer;
    }

    protected final Object _deserialize(JsonParser jsonparser, DeserializationContext deserializationcontext, int i, String s)
        throws IOException, JsonProcessingException
    {
        TokenBuffer tokenbuffer = new TokenBuffer(jsonparser.getCodec());
        tokenbuffer.writeStartArray();
        tokenbuffer.writeString(s);
        s = _tokens[i].asParser(jsonparser);
        s.nextToken();
        tokenbuffer.copyCurrentStructure(s);
        tokenbuffer.writeEndArray();
        jsonparser = tokenbuffer.asParser(jsonparser);
        jsonparser.nextToken();
        return _properties[i].getProperty().deserialize(jsonparser, deserializationcontext);
    }

    protected final void _deserializeAndSet(JsonParser jsonparser, DeserializationContext deserializationcontext, Object obj, int i, String s)
        throws IOException, JsonProcessingException
    {
        TokenBuffer tokenbuffer = new TokenBuffer(jsonparser.getCodec());
        tokenbuffer.writeStartArray();
        tokenbuffer.writeString(s);
        s = _tokens[i].asParser(jsonparser);
        s.nextToken();
        tokenbuffer.copyCurrentStructure(s);
        tokenbuffer.writeEndArray();
        jsonparser = tokenbuffer.asParser(jsonparser);
        jsonparser.nextToken();
        _properties[i].getProperty().deserializeAndSet(jsonparser, deserializationcontext, obj);
    }

    public Object complete(JsonParser jsonparser, DeserializationContext deserializationcontext, PropertyValueBuffer propertyvaluebuffer, PropertyBasedCreator propertybasedcreator)
        throws IOException, JsonProcessingException
    {
        Object aobj[];
        int i;
        int l;
        l = _properties.length;
        aobj = new Object[l];
        i = 0;
_L8:
        String s;
        if (i >= l)
        {
            break MISSING_BLOCK_LABEL_195;
        }
        s = _typeIds[i];
        if (s != null) goto _L2; else goto _L1
_L1:
        if (_tokens[i] == null) goto _L4; else goto _L3
_L3:
        if (!_properties[i].hasDefaultType())
        {
            throw deserializationcontext.mappingException((new StringBuilder("Missing external type id property '")).append(_properties[i].getTypePropertyName()).append("'").toString());
        }
        s = _properties[i].getDefaultTypeId();
_L6:
        aobj[i] = _deserialize(jsonparser, deserializationcontext, i, s);
_L4:
        i++;
        continue; /* Loop/switch isn't completed */
_L2:
        if (_tokens[i] != null) goto _L6; else goto _L5
_L5:
        jsonparser = _properties[i].getProperty();
        throw deserializationcontext.mappingException((new StringBuilder("Missing property '")).append(jsonparser.getName()).append("' for external type id '").append(_properties[i].getTypePropertyName()).toString());
        for (int j = 0; j < l; j++)
        {
            jsonparser = _properties[j].getProperty();
            if (propertybasedcreator.findCreatorProperty(jsonparser.getName()) != null)
            {
                propertyvaluebuffer.assignParameter(jsonparser.getCreatorIndex(), aobj[j]);
            }
        }

        jsonparser = ((JsonParser) (propertybasedcreator.build(deserializationcontext, propertyvaluebuffer)));
        for (int k = 0; k < l; k++)
        {
            deserializationcontext = _properties[k].getProperty();
            if (propertybasedcreator.findCreatorProperty(deserializationcontext.getName()) == null)
            {
                deserializationcontext.set(jsonparser, aobj[k]);
            }
        }

        return jsonparser;
        if (true) goto _L8; else goto _L7
_L7:
    }

    public Object complete(JsonParser jsonparser, DeserializationContext deserializationcontext, Object obj)
        throws IOException, JsonProcessingException
    {
        int i;
        int j;
        i = 0;
        j = _properties.length;
_L8:
        String s;
        if (i >= j)
        {
            break MISSING_BLOCK_LABEL_184;
        }
        s = _typeIds[i];
        if (s != null) goto _L2; else goto _L1
_L1:
        if (_tokens[i] == null) goto _L4; else goto _L3
_L3:
        if (!_properties[i].hasDefaultType())
        {
            throw deserializationcontext.mappingException((new StringBuilder("Missing external type id property '")).append(_properties[i].getTypePropertyName()).append("'").toString());
        }
        s = _properties[i].getDefaultTypeId();
_L6:
        _deserializeAndSet(jsonparser, deserializationcontext, obj, i, s);
_L4:
        i++;
        continue; /* Loop/switch isn't completed */
_L2:
        if (_tokens[i] != null) goto _L6; else goto _L5
_L5:
        jsonparser = _properties[i].getProperty();
        throw deserializationcontext.mappingException((new StringBuilder("Missing property '")).append(jsonparser.getName()).append("' for external type id '").append(_properties[i].getTypePropertyName()).toString());
        return obj;
        if (true) goto _L8; else goto _L7
_L7:
    }

    public boolean handlePropertyValue(JsonParser jsonparser, DeserializationContext deserializationcontext, String s, Object obj)
        throws IOException, JsonProcessingException
    {
        boolean flag1;
        int i;
        flag1 = false;
        Integer integer = (Integer)_nameToPropertyIndex.get(s);
        if (integer == null)
        {
            return false;
        }
        i = integer.intValue();
        if (!_properties[i].hasTypePropertyName(s)) goto _L2; else goto _L1
_L1:
        boolean flag;
        _typeIds[i] = jsonparser.getText();
        jsonparser.skipChildren();
        if (obj != null && _tokens[i] != null)
        {
            flag = true;
        } else
        {
            flag = false;
        }
_L4:
        if (flag)
        {
            s = _typeIds[i];
            _typeIds[i] = null;
            _deserializeAndSet(jsonparser, deserializationcontext, obj, i, s);
            _tokens[i] = null;
        }
        return true;
_L2:
        s = new TokenBuffer(jsonparser.getCodec());
        s.copyCurrentStructure(jsonparser);
        _tokens[i] = s;
        flag = flag1;
        if (obj != null)
        {
            flag = flag1;
            if (_typeIds[i] != null)
            {
                flag = true;
            }
        }
        if (true) goto _L4; else goto _L3
_L3:
    }

    public boolean handleTypePropertyValue(JsonParser jsonparser, DeserializationContext deserializationcontext, String s, Object obj)
        throws IOException, JsonProcessingException
    {
        boolean flag1 = false;
        Integer integer = (Integer)_nameToPropertyIndex.get(s);
        if (integer == null)
        {
            return false;
        }
        int i = integer.intValue();
        if (!_properties[i].hasTypePropertyName(s))
        {
            return false;
        }
        s = jsonparser.getText();
        boolean flag = flag1;
        if (obj != null)
        {
            flag = flag1;
            if (_tokens[i] != null)
            {
                flag = true;
            }
        }
        if (flag)
        {
            _deserializeAndSet(jsonparser, deserializationcontext, obj, i, s);
            _tokens[i] = null;
        } else
        {
            _typeIds[i] = s;
        }
        return true;
    }

    public ExternalTypeHandler start()
    {
        return new ExternalTypeHandler(this);
    }
}
