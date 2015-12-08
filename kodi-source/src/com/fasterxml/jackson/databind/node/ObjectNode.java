// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fasterxml.jackson.databind.node;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.SerializerProvider;
import com.fasterxml.jackson.databind.jsontype.TypeSerializer;
import java.io.IOException;
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

    public JsonNode put(String s, JsonNode jsonnode)
    {
        Object obj = jsonnode;
        if (jsonnode == null)
        {
            obj = nullNode();
        }
        return (JsonNode)_children.put(s, obj);
    }

    public ObjectNode put(String s, int i)
    {
        return _put(s, numberNode(i));
    }

    public ObjectNode put(String s, Double double1)
    {
        if (double1 == null)
        {
            double1 = nullNode();
        } else
        {
            double1 = numberNode(double1.doubleValue());
        }
        return _put(s, double1);
    }

    public ObjectNode put(String s, Integer integer)
    {
        if (integer == null)
        {
            integer = nullNode();
        } else
        {
            integer = numberNode(integer.intValue());
        }
        return _put(s, integer);
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

    public ObjectNode put(String s, boolean flag)
    {
        return _put(s, booleanNode(flag));
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
        throws IOException, JsonProcessingException
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
        throws IOException, JsonProcessingException
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

    public int size()
    {
        return _children.size();
    }

    public String toString()
    {
        StringBuilder stringbuilder = new StringBuilder((size() << 4) + 32);
        stringbuilder.append("{");
        int i = 0;
        java.util.Map.Entry entry;
        for (Iterator iterator = _children.entrySet().iterator(); iterator.hasNext(); stringbuilder.append(((JsonNode)entry.getValue()).toString()))
        {
            entry = (java.util.Map.Entry)iterator.next();
            if (i > 0)
            {
                stringbuilder.append(",");
            }
            i++;
            TextNode.appendQuoted(stringbuilder, (String)entry.getKey());
            stringbuilder.append(':');
        }

        stringbuilder.append("}");
        return stringbuilder.toString();
    }
}
