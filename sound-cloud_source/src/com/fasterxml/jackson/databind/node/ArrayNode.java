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
//            ContainerNode, MissingNode, BaseJsonNode, JsonNodeFactory

public class ArrayNode extends ContainerNode
{

    protected List _children;

    public ArrayNode(JsonNodeFactory jsonnodefactory)
    {
        super(jsonnodefactory);
    }

    private ArrayNode _add(JsonNode jsonnode)
    {
        if (_children == null)
        {
            _children = _createList();
        }
        _children.add(jsonnode);
        return this;
    }

    private boolean _sameChildren(List list)
    {
        int j = list.size();
        if (size() != j)
        {
            return false;
        }
        for (int i = 0; i < j; i++)
        {
            if (!((JsonNode)_children.get(i)).equals(list.get(i)))
            {
                return false;
            }
        }

        return true;
    }

    protected List _createList()
    {
        return new ArrayList();
    }

    protected boolean _customEquals(ArrayNode arraynode)
    {
        return true;
    }

    protected boolean _equals(ArrayNode arraynode)
    {
        return _stdEquals(arraynode) && _customEquals(arraynode) && arraynode._customEquals(this);
    }

    protected final boolean _stdEquals(ArrayNode arraynode)
    {
        if (_children == null || _children.size() == 0)
        {
            return arraynode.size() == 0;
        } else
        {
            return arraynode._sameChildren(_children);
        }
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

    public Iterator elements()
    {
        if (_children == null)
        {
            return ContainerNode.NoNodesIterator.instance();
        } else
        {
            return _children.iterator();
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
        if (!(obj instanceof ArrayNode)) goto _L4; else goto _L5
_L5:
        return _equals((ArrayNode)obj);
    }

    public JsonNode get(String s)
    {
        return null;
    }

    public int hashCode()
    {
        if (_children != null) goto _L2; else goto _L1
_L1:
        int j = 1;
_L4:
        return j;
_L2:
        int i = _children.size();
        Iterator iterator = _children.iterator();
        do
        {
            j = i;
            if (!iterator.hasNext())
            {
                continue;
            }
            JsonNode jsonnode = (JsonNode)iterator.next();
            if (jsonnode != null)
            {
                i = jsonnode.hashCode() ^ i;
            }
        } while (true);
        if (true) goto _L4; else goto _L3
_L3:
    }

    public boolean isArray()
    {
        return true;
    }

    public JsonNode path(String s)
    {
        return MissingNode.getInstance();
    }

    public final void serialize(JsonGenerator jsongenerator, SerializerProvider serializerprovider)
        throws IOException, JsonProcessingException
    {
        jsongenerator.writeStartArray();
        if (_children != null)
        {
            for (Iterator iterator = _children.iterator(); iterator.hasNext(); ((BaseJsonNode)(JsonNode)iterator.next()).serialize(jsongenerator, serializerprovider)) { }
        }
        jsongenerator.writeEndArray();
    }

    public void serializeWithType(JsonGenerator jsongenerator, SerializerProvider serializerprovider, TypeSerializer typeserializer)
        throws IOException, JsonProcessingException
    {
        typeserializer.writeTypePrefixForArray(this, jsongenerator);
        if (_children != null)
        {
            for (Iterator iterator = _children.iterator(); iterator.hasNext(); ((BaseJsonNode)(JsonNode)iterator.next()).serialize(jsongenerator, serializerprovider)) { }
        }
        typeserializer.writeTypeSuffixForArray(this, jsongenerator);
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
        StringBuilder stringbuilder = new StringBuilder((size() << 4) + 16);
        stringbuilder.append('[');
        if (_children != null)
        {
            int j = _children.size();
            for (int i = 0; i < j; i++)
            {
                if (i > 0)
                {
                    stringbuilder.append(',');
                }
                stringbuilder.append(((JsonNode)_children.get(i)).toString());
            }

        }
        stringbuilder.append(']');
        return stringbuilder.toString();
    }
}
