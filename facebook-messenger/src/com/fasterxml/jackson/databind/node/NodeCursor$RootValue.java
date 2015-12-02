// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fasterxml.jackson.databind.node;

import com.fasterxml.jackson.core.JsonStreamContext;
import com.fasterxml.jackson.core.JsonToken;
import com.fasterxml.jackson.databind.JsonNode;

// Referenced classes of package com.fasterxml.jackson.databind.node:
//            NodeCursor

public final class _node extends NodeCursor
{

    protected boolean _done;
    protected JsonNode _node;

    public boolean currentHasChildren()
    {
        return false;
    }

    public JsonNode currentNode()
    {
        return _node;
    }

    public JsonToken endToken()
    {
        return null;
    }

    public volatile JsonStreamContext getParent()
    {
        return super.getParent();
    }

    public JsonToken nextToken()
    {
        if (!_done)
        {
            _done = true;
            return _node.asToken();
        } else
        {
            _node = null;
            return null;
        }
    }

    public JsonToken nextValue()
    {
        return nextToken();
    }

    public void overrideCurrentName(String s)
    {
    }

    public (JsonNode jsonnode, NodeCursor nodecursor)
    {
        super(0, nodecursor);
        _done = false;
        _node = jsonnode;
    }
}
