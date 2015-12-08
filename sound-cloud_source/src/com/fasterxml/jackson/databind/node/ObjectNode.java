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
//            ContainerNode, MissingNode, BaseJsonNode, TextNode, 
//            JsonNodeFactory

public class ObjectNode extends ContainerNode
{

    protected Map _children;

    public ObjectNode(JsonNodeFactory jsonnodefactory)
    {
        super(jsonnodefactory);
        _children = null;
    }

    private final JsonNode _put(String s, JsonNode jsonnode)
    {
        if (_children == null)
        {
            _children = _createMap();
        }
        return (JsonNode)_children.put(s, jsonnode);
    }

    protected Map _createMap()
    {
        return new LinkedHashMap();
    }

    protected boolean _customEquals(ObjectNode objectnode)
    {
        return true;
    }

    protected boolean _equals(ObjectNode objectnode)
    {
        return _stdEquals(objectnode) && _customEquals(objectnode) && objectnode._customEquals(this);
    }

    protected final boolean _stdEquals(ObjectNode objectnode)
    {
label0:
        {
            if (objectnode.size() != size())
            {
                return false;
            }
            if (_children == null)
            {
                break label0;
            }
            Iterator iterator = _children.entrySet().iterator();
            Object obj;
            Object obj1;
            do
            {
                if (!iterator.hasNext())
                {
                    break label0;
                }
                obj1 = (java.util.Map.Entry)iterator.next();
                obj = (String)((java.util.Map.Entry) (obj1)).getKey();
                obj1 = (JsonNode)((java.util.Map.Entry) (obj1)).getValue();
                obj = objectnode.get(((String) (obj)));
            } while (obj != null && ((JsonNode) (obj)).equals(obj1));
            return false;
        }
        return true;
    }

    public Iterator elements()
    {
        if (_children == null)
        {
            return ContainerNode.NoNodesIterator.instance();
        } else
        {
            return _children.values().iterator();
        }
    }

    public final boolean equals(Object obj)
    {
        boolean flag1 = false;
        if (obj != this) goto _L2; else goto _L1
_L1:
        boolean flag = true;
_L4:
        return flag;
_L2:
        flag = flag1;
        if (obj == null) goto _L4; else goto _L3
_L3:
        if (obj.getClass() == getClass())
        {
            break; /* Loop/switch isn't completed */
        }
        flag = flag1;
        if (!(obj instanceof ObjectNode)) goto _L4; else goto _L5
_L5:
        return _equals((ObjectNode)obj);
    }

    public JsonNode get(String s)
    {
        if (_children != null)
        {
            return (JsonNode)_children.get(s);
        } else
        {
            return null;
        }
    }

    public int hashCode()
    {
        if (_children == null)
        {
            return -1;
        } else
        {
            return _children.hashCode();
        }
    }

    public JsonNode path(String s)
    {
        if (_children != null)
        {
            s = (JsonNode)_children.get(s);
            if (s != null)
            {
                return s;
            }
        }
        return MissingNode.getInstance();
    }

    public JsonNode replace(String s, JsonNode jsonnode)
    {
        Object obj = jsonnode;
        if (jsonnode == null)
        {
            obj = nullNode();
        }
        return _put(s, ((JsonNode) (obj)));
    }

    public final void serialize(JsonGenerator jsongenerator, SerializerProvider serializerprovider)
        throws IOException, JsonProcessingException
    {
        jsongenerator.writeStartObject();
        if (_children != null)
        {
            java.util.Map.Entry entry;
            for (Iterator iterator = _children.entrySet().iterator(); iterator.hasNext(); ((BaseJsonNode)entry.getValue()).serialize(jsongenerator, serializerprovider))
            {
                entry = (java.util.Map.Entry)iterator.next();
                jsongenerator.writeFieldName((String)entry.getKey());
            }

        }
        jsongenerator.writeEndObject();
    }

    public void serializeWithType(JsonGenerator jsongenerator, SerializerProvider serializerprovider, TypeSerializer typeserializer)
        throws IOException, JsonProcessingException
    {
        typeserializer.writeTypePrefixForObject(this, jsongenerator);
        if (_children != null)
        {
            java.util.Map.Entry entry;
            for (Iterator iterator = _children.entrySet().iterator(); iterator.hasNext(); ((BaseJsonNode)entry.getValue()).serialize(jsongenerator, serializerprovider))
            {
                entry = (java.util.Map.Entry)iterator.next();
                jsongenerator.writeFieldName((String)entry.getKey());
            }

        }
        typeserializer.writeTypeSuffixForObject(this, jsongenerator);
    }

    public int size()
    {
        if (_children == null)
        {
            return 0;
        } else
        {
            return _children.size();
        }
    }

    public String toString()
    {
        StringBuilder stringbuilder = new StringBuilder((size() << 4) + 32);
        stringbuilder.append("{");
        if (_children != null)
        {
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

        }
        stringbuilder.append("}");
        return stringbuilder.toString();
    }
}
