// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fasterxml.jackson.databind.node;


// Referenced classes of package com.fasterxml.jackson.databind.node:
//            BaseJsonNode, JsonNodeFactory, NullNode, NumericNode, 
//            TextNode

public abstract class ContainerNode extends BaseJsonNode
{

    protected final JsonNodeFactory _nodeFactory;

    protected ContainerNode(JsonNodeFactory jsonnodefactory)
    {
        _nodeFactory = jsonnodefactory;
    }

    public String asText()
    {
        return "";
    }

    public final NullNode nullNode()
    {
        return _nodeFactory.nullNode();
    }

    public final NumericNode numberNode(int i)
    {
        return _nodeFactory.numberNode(i);
    }

    public abstract int size();

    public final TextNode textNode(String s)
    {
        return _nodeFactory.textNode(s);
    }
}
