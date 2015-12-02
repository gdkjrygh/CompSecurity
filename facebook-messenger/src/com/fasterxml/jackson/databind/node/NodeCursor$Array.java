// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fasterxml.jackson.databind.node;

import com.fasterxml.jackson.core.JsonStreamContext;
import com.fasterxml.jackson.core.JsonToken;
import com.fasterxml.jackson.databind.JsonNode;
import java.util.Iterator;

// Referenced classes of package com.fasterxml.jackson.databind.node:
//            NodeCursor, ContainerNode

public final class _contents extends NodeCursor
{

    protected Iterator _contents;
    protected JsonNode _currentNode;

    public boolean currentHasChildren()
    {
        return ((ContainerNode)currentNode()).size() > 0;
    }

    public JsonNode currentNode()
    {
        return _currentNode;
    }

    public JsonToken endToken()
    {
        return JsonToken.END_ARRAY;
    }

    public volatile JsonStreamContext getParent()
    {
        return super.getParent();
    }

    public JsonToken nextToken()
    {
        if (!_contents.hasNext())
        {
            _currentNode = null;
            return null;
        } else
        {
            _currentNode = (JsonNode)_contents.next();
            return _currentNode.asToken();
        }
    }

    public JsonToken nextValue()
    {
        return nextToken();
    }

    public (JsonNode jsonnode, NodeCursor nodecursor)
    {
        super(1, nodecursor);
        _contents = jsonnode.elements();
    }
}
