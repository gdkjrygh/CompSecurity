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
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

// Referenced classes of package com.fasterxml.jackson.databind.node:
//            ContainerNode, JsonNodeType, BaseJsonNode, JsonNodeFactory

public class ArrayNode extends ContainerNode
{

    private final List _children = new ArrayList();

    public ArrayNode(JsonNodeFactory jsonnodefactory)
    {
        super(jsonnodefactory);
    }

    protected ArrayNode _add(JsonNode jsonnode)
    {
        _children.add(jsonnode);
        return this;
    }

    public ArrayNode add(JsonNode jsonnode)
    {
        Object obj = jsonnode;
        if (jsonnode == null)
        {
            obj = nullNode();
        }
        _add(((JsonNode) (obj)));
        return this;
    }

    public ArrayNode add(String s)
    {
        if (s == null)
        {
            return addNull();
        } else
        {
            return _add(textNode(s));
        }
    }

    public ArrayNode addNull()
    {
        _add(nullNode());
        return this;
    }

    public Iterator elements()
    {
        return _children.iterator();
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
                if (obj instanceof ArrayNode)
                {
                    return _children.equals(((ArrayNode)obj)._children);
                }
            }
        }
        return flag;
    }

    public JsonNode get(String s)
    {
        return null;
    }

    public JsonNodeType getNodeType()
    {
        return JsonNodeType.ARRAY;
    }

    public int hashCode()
    {
        return _children.hashCode();
    }

    public void serialize(JsonGenerator jsongenerator, SerializerProvider serializerprovider)
        throws IOException, JsonProcessingException
    {
        List list = _children;
        int j = list.size();
        jsongenerator.writeStartArray(j);
        for (int i = 0; i < j; i++)
        {
            ((BaseJsonNode)list.get(i)).serialize(jsongenerator, serializerprovider);
        }

        jsongenerator.writeEndArray();
    }

    public void serializeWithType(JsonGenerator jsongenerator, SerializerProvider serializerprovider, TypeSerializer typeserializer)
        throws IOException, JsonProcessingException
    {
        typeserializer.writeTypePrefixForArray(this, jsongenerator);
        for (Iterator iterator = _children.iterator(); iterator.hasNext(); ((BaseJsonNode)(JsonNode)iterator.next()).serialize(jsongenerator, serializerprovider)) { }
        typeserializer.writeTypeSuffixForArray(this, jsongenerator);
    }

    public int size()
    {
        return _children.size();
    }

    public String toString()
    {
        StringBuilder stringbuilder = new StringBuilder((size() << 4) + 16);
        stringbuilder.append('[');
        int i = 0;
        for (int j = _children.size(); i < j; i++)
        {
            if (i > 0)
            {
                stringbuilder.append(',');
            }
            stringbuilder.append(((JsonNode)_children.get(i)).toString());
        }

        stringbuilder.append(']');
        return stringbuilder.toString();
    }
}
