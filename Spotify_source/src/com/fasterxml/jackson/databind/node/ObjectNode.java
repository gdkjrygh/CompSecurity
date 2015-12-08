// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fasterxml.jackson.databind.node;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonToken;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.SerializerProvider;
import com.fasterxml.jackson.databind.jsontype.TypeSerializer;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

// Referenced classes of package com.fasterxml.jackson.databind.node:
//            ContainerNode, JsonNodeType, BaseJsonNode, TextNode, 
//            JsonNodeFactory

public class ObjectNode extends ContainerNode
{

    protected final Map _children = new LinkedHashMap();

    public ObjectNode(JsonNodeFactory jsonnodefactory)
    {
        super(jsonnodefactory);
    }

    protected boolean _childrenEqual(ObjectNode objectnode)
    {
        return _children.equals(objectnode._children);
    }

    protected ObjectNode _put(String s, JsonNode jsonnode)
    {
        _children.put(s, jsonnode);
        return this;
    }

    public JsonToken asToken()
    {
        return JsonToken.START_OBJECT;
    }

    public Iterator elements()
    {
        return _children.values().iterator();
    }

    public boolean equals(Object obj)
    {
        boolean flag1 = false;
        boolean flag;
        if (obj == this)
        {
            flag = true;
        } else
        {
            flag = flag1;
            if (obj != null)
            {
                flag = flag1;
                if (obj instanceof ObjectNode)
                {
                    return _childrenEqual((ObjectNode)obj);
                }
            }
        }
        return flag;
    }

    public Iterator fields()
    {
        return _children.entrySet().iterator();
    }

    public JsonNode get(int i)
    {
        return null;
    }

    public JsonNode get(String s)
    {
        return (JsonNode)_children.get(s);
    }

    public JsonNodeType getNodeType()
    {
        return JsonNodeType.OBJECT;
    }

    public int hashCode()
    {
        return _children.hashCode();
    }

    public ObjectNode put(String s, int i)
    {
        return _put(s, numberNode(i));
    }

    public ObjectNode put(String s, String s1)
    {
        if (s1 == null)
        {
            s1 = nullNode();
        } else
        {
            s1 = textNode(s1);
        }
        return _put(s, s1);
    }

    public JsonNode replace(String s, JsonNode jsonnode)
    {
        Object obj = jsonnode;
        if (jsonnode == null)
        {
            obj = nullNode();
        }
        return (JsonNode)_children.put(s, obj);
    }

    public void serialize(JsonGenerator jsongenerator, SerializerProvider serializerprovider)
    {
        jsongenerator.writeStartObject();
        java.util.Map.Entry entry;
        for (Iterator iterator = _children.entrySet().iterator(); iterator.hasNext(); ((BaseJsonNode)entry.getValue()).serialize(jsongenerator, serializerprovider))
        {
            entry = (java.util.Map.Entry)iterator.next();
            jsongenerator.writeFieldName((String)entry.getKey());
        }

        jsongenerator.writeEndObject();
    }

    public void serializeWithType(JsonGenerator jsongenerator, SerializerProvider serializerprovider, TypeSerializer typeserializer)
    {
        typeserializer.writeTypePrefixForObject(this, jsongenerator);
        java.util.Map.Entry entry;
        for (Iterator iterator = _children.entrySet().iterator(); iterator.hasNext(); ((BaseJsonNode)entry.getValue()).serialize(jsongenerator, serializerprovider))
        {
            entry = (java.util.Map.Entry)iterator.next();
            jsongenerator.writeFieldName((String)entry.getKey());
        }

        typeserializer.writeTypeSuffixForObject(this, jsongenerator);
    }

    public JsonNode set(String s, JsonNode jsonnode)
    {
        Object obj = jsonnode;
        if (jsonnode == null)
        {
            obj = nullNode();
        }
        _children.put(s, obj);
        return this;
    }

    public JsonNode setAll(Map map)
    {
        java.util.Map.Entry entry;
        for (Iterator iterator = map.entrySet().iterator(); iterator.hasNext(); _children.put(entry.getKey(), map))
        {
            entry = (java.util.Map.Entry)iterator.next();
            JsonNode jsonnode = (JsonNode)entry.getValue();
            map = jsonnode;
            if (jsonnode == null)
            {
                map = nullNode();
            }
        }

        return this;
    }

    public int size()
    {
        return _children.size();
    }

    public String toString()
    {
        StringBuilder stringbuilder = new StringBuilder((size() << 4) + 32);
        stringbuilder.append("{");
        Iterator iterator = _children.entrySet().iterator();
        for (int i = 0; iterator.hasNext(); i++)
        {
            java.util.Map.Entry entry = (java.util.Map.Entry)iterator.next();
            if (i > 0)
            {
                stringbuilder.append(",");
            }
            TextNode.appendQuoted(stringbuilder, (String)entry.getKey());
            stringbuilder.append(':');
            stringbuilder.append(((JsonNode)entry.getValue()).toString());
        }

        stringbuilder.append("}");
        return stringbuilder.toString();
    }
}
