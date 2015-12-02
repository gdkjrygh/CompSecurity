// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fasterxml.jackson.databind.node;

import com.fasterxml.jackson.core.JsonToken;
import com.fasterxml.jackson.databind.JsonNode;
import java.math.BigDecimal;
import java.util.List;

// Referenced classes of package com.fasterxml.jackson.databind.node:
//            BaseJsonNode, JsonNodeFactory, POJONode, ArrayNode, 
//            BinaryNode, BooleanNode, ObjectNode, NullNode, 
//            NumericNode, TextNode

public abstract class ContainerNode extends BaseJsonNode
{

    protected final JsonNodeFactory _nodeFactory;

    protected ContainerNode(JsonNodeFactory jsonnodefactory)
    {
        _nodeFactory = jsonnodefactory;
    }

    public final POJONode POJONode(Object obj)
    {
        return _nodeFactory.POJONode(obj);
    }

    public final ArrayNode arrayNode()
    {
        return _nodeFactory.arrayNode();
    }

    public String asText()
    {
        return "";
    }

    public abstract JsonToken asToken();

    public final BinaryNode binaryNode(byte abyte0[])
    {
        return _nodeFactory.binaryNode(abyte0);
    }

    public final BinaryNode binaryNode(byte abyte0[], int i, int j)
    {
        return _nodeFactory.binaryNode(abyte0, i, j);
    }

    public final BooleanNode booleanNode(boolean flag)
    {
        return _nodeFactory.booleanNode(flag);
    }

    public volatile JsonNode findParent(String s)
    {
        return findParent(s);
    }

    public abstract ObjectNode findParent(String s);

    public abstract List findParents(String s, List list);

    public abstract JsonNode findValue(String s);

    public abstract List findValues(String s, List list);

    public abstract List findValuesAsText(String s, List list);

    public abstract JsonNode get(int i);

    public abstract JsonNode get(String s);

    public boolean isContainerNode()
    {
        return true;
    }

    public final NullNode nullNode()
    {
        return _nodeFactory.nullNode();
    }

    public final NumericNode numberNode(byte byte0)
    {
        return _nodeFactory.numberNode(byte0);
    }

    public final NumericNode numberNode(double d)
    {
        return _nodeFactory.numberNode(d);
    }

    public final NumericNode numberNode(float f)
    {
        return _nodeFactory.numberNode(f);
    }

    public final NumericNode numberNode(int i)
    {
        return _nodeFactory.numberNode(i);
    }

    public final NumericNode numberNode(long l)
    {
        return _nodeFactory.numberNode(l);
    }

    public final NumericNode numberNode(BigDecimal bigdecimal)
    {
        return _nodeFactory.numberNode(bigdecimal);
    }

    public final NumericNode numberNode(short word0)
    {
        return _nodeFactory.numberNode(word0);
    }

    public final ObjectNode objectNode()
    {
        return _nodeFactory.objectNode();
    }

    public abstract ContainerNode removeAll();

    public abstract int size();

    public final TextNode textNode(String s)
    {
        return _nodeFactory.textNode(s);
    }
}
