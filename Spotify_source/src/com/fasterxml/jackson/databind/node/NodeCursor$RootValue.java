// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fasterxml.jackson.databind.node;

import com.fasterxml.jackson.core.JsonToken;
import com.fasterxml.jackson.databind.JsonNode;

// Referenced classes of package com.fasterxml.jackson.databind.node:
//            NodeCursor

public final class _node extends NodeCursor
{

    protected boolean _done;
    protected JsonNode _node;

    public final boolean currentHasChildren()
    {
        return false;
    }

    public final JsonNode currentNode()
    {
        return _node;
    }

    public final JsonToken endToken()
    {
        return null;
    }

    public final JsonToken nextToken()
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

    public (JsonNode jsonnode, NodeCursor nodecursor)
    {
        super(0, nodecursor);
        _done = false;
        _node = jsonnode;
    }
}
