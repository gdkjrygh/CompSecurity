// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fasterxml.jackson.databind.deser.impl;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.deser.SettableBeanProperty;
import com.fasterxml.jackson.databind.util.TokenBuffer;
import java.util.HashMap;

// Referenced classes of package com.fasterxml.jackson.databind.deser.impl:
//            PropertyBasedCreator, PropertyValueBuffer

public class ExternalTypeHandler
{

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

    protected final Object _deserialize(JsonParser jsonparser, DeserializationContext deserializationcontext, int i)
    {
        TokenBuffer tokenbuffer = new TokenBuffer(jsonparser.getCodec());
        tokenbuffer.writeStartArray();
        tokenbuffer.writeString(_typeIds[i]);
        JsonParser jsonparser1 = _tokens[i].asParser(jsonparser);
        jsonparser1.nextToken();
        tokenbuffer.copyCurrentStructure(jsonparser1);
        tokenbuffer.writeEndArray();
        jsonparser = tokenbuffer.asParser(jsonparser);
        jsonparser.nextToken();
        return _properties[i].getProperty().deserialize(jsonparser, deserializationcontext);
    }

    protected final void _deserializeAndSet(JsonParser jsonparser, DeserializationContext deserializationcontext, Object obj, int i)
    {
        TokenBuffer tokenbuffer = new TokenBuffer(jsonparser.getCodec());
        tokenbuffer.writeStartArray();
        tokenbuffer.writeString(_typeIds[i]);
        JsonParser jsonparser1 = _tokens[i].asParser(jsonparser);
        jsonparser1.nextToken();
        tokenbuffer.copyCurrentStructure(jsonparser1);
        tokenbuffer.writeEndArray();
        jsonparser = tokenbuffer.asParser(jsonparser);
        jsonparser.nextToken();
        _properties[i].getProperty().deserializeAndSet(jsonparser, deserializationcontext, obj);
    }

    public Object complete(JsonParser jsonparser, DeserializationContext deserializationcontext, PropertyValueBuffer propertyvaluebuffer, PropertyBasedCreator propertybasedcreator)
    {
        Object aobj[];
        int i;
        boolean flag;
        int l;
        flag = false;
        l = _properties.length;
        aobj = new Object[l];
        i = 0;
_L2:
        if (i >= l)
        {
            break MISSING_BLOCK_LABEL_171;
        }
        if (_typeIds[i] != null)
        {
            break MISSING_BLOCK_LABEL_89;
        }
        if (_tokens[i] != null)
        {
            break; /* Loop/switch isn't completed */
        }
_L3:
        i++;
        if (true) goto _L2; else goto _L1
_L1:
        throw deserializationcontext.mappingException((new StringBuilder()).append("Missing external type id property '").append(_properties[i].getTypePropertyName()).toString());
        if (_tokens[i] == null)
        {
            jsonparser = _properties[i].getProperty();
            throw deserializationcontext.mappingException((new StringBuilder()).append("Missing property '").append(jsonparser.getName()).append("' for external type id '").append(_properties[i].getTypePropertyName()).toString());
        }
        aobj[i] = _deserialize(jsonparser, deserializationcontext, i);
          goto _L3
        for (int j = 0; j < l; j++)
        {
            jsonparser = _properties[j].getProperty();
            if (propertybasedcreator.findCreatorProperty(jsonparser.getName()) != null)
            {
                propertyvaluebuffer.assignParameter(jsonparser.getPropertyIndex(), aobj[j]);
            }
        }

        jsonparser = ((JsonParser) (propertybasedcreator.build(deserializationcontext, propertyvaluebuffer)));
        for (int k = ((flag) ? 1 : 0); k < l; k++)
        {
            deserializationcontext = _properties[k].getProperty();
            if (propertybasedcreator.findCreatorProperty(deserializationcontext.getName()) == null)
            {
                deserializationcontext.set(jsonparser, aobj[k]);
            }
        }

        return jsonparser;
    }

    public Object complete(JsonParser jsonparser, DeserializationContext deserializationcontext, Object obj)
    {
        int i;
        int j;
        i = 0;
        j = _properties.length;
_L2:
        if (i >= j)
        {
            break MISSING_BLOCK_LABEL_157;
        }
        if (_typeIds[i] != null)
        {
            break MISSING_BLOCK_LABEL_79;
        }
        if (_tokens[i] != null)
        {
            break; /* Loop/switch isn't completed */
        }
_L3:
        i++;
        if (true) goto _L2; else goto _L1
_L1:
        throw deserializationcontext.mappingException((new StringBuilder()).append("Missing external type id property '").append(_properties[i].getTypePropertyName()).toString());
        if (_tokens[i] == null)
        {
            jsonparser = _properties[i].getProperty();
            throw deserializationcontext.mappingException((new StringBuilder()).append("Missing property '").append(jsonparser.getName()).append("' for external type id '").append(_properties[i].getTypePropertyName()).toString());
        }
        _deserializeAndSet(jsonparser, deserializationcontext, obj, i);
          goto _L3
        return obj;
    }

    public boolean handlePropertyValue(JsonParser jsonparser, DeserializationContext deserializationcontext, String s, Object obj)
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
            _deserializeAndSet(jsonparser, deserializationcontext, obj, i);
            _typeIds[i] = null;
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
        _typeIds[i] = jsonparser.getText();
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
            _deserializeAndSet(jsonparser, deserializationcontext, obj, i);
            _typeIds[i] = null;
            _tokens[i] = null;
        }
        return true;
    }

    public ExternalTypeHandler start()
    {
        return new ExternalTypeHandler(this);
    }

    private class ExtTypedProperty
    {

        private final SettableBeanProperty _property;
        private final String _typePropertyName;

        public SettableBeanProperty getProperty()
        {
            return _property;
        }

        public String getTypePropertyName()
        {
            return _typePropertyName;
        }

        public boolean hasTypePropertyName(String s)
        {
            return s.equals(_typePropertyName);
        }

        public ExtTypedProperty(SettableBeanProperty settablebeanproperty, String s)
        {
            _property = settablebeanproperty;
            _typePropertyName = s;
        }
    }

}
