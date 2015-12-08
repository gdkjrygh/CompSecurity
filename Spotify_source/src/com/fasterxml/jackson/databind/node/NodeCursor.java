// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fasterxml.jackson.databind.node;

import com.fasterxml.jackson.core.JsonStreamContext;
import com.fasterxml.jackson.core.JsonToken;
import com.fasterxml.jackson.databind.JsonNode;

abstract class NodeCursor extends JsonStreamContext
{

    protected String _currentName;
    protected final NodeCursor _parent;

    public NodeCursor(int i, NodeCursor nodecursor)
    {
        _type = i;
        _index = -1;
        _parent = nodecursor;
    }

    public abstract boolean currentHasChildren();

    public abstract JsonNode currentNode();

    public abstract JsonToken endToken();

    public final String getCurrentName()
    {
        return _currentName;
    }

    public final NodeCursor getParent()
    {
        return _parent;
    }

    public final NodeCursor iterateChildren()
    {
        JsonNode jsonnode = currentNode();
        if (jsonnode == null)
        {
            throw new IllegalStateException("No current node");
        }
        if (jsonnode.isArray())
        {
            return new Array(jsonnode, this);
        }
        if (jsonnode.isObject())
        {
            return new Object(jsonnode, this);
        } else
        {
            throw new IllegalStateException((new StringBuilder("Current node of type ")).append(jsonnode.getClass().getName()).toString());
        }
    }

    public abstract JsonToken nextToken();

    private class Array extends NodeCursor
    {

        protected Iterator _contents;
        protected JsonNode _currentNode;

        public final boolean currentHasChildren()
        {
            return ((ContainerNode)currentNode()).size() > 0;
        }

        public final JsonNode currentNode()
        {
            return _currentNode;
        }

        public final JsonToken endToken()
        {
            return JsonToken.END_ARRAY;
        }

        public final JsonToken nextToken()
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

        public Array(JsonNode jsonnode, NodeCursor nodecursor)
        {
            super(1, nodecursor);
            _contents = jsonnode.elements();
        }
    }


    private class Object extends NodeCursor
    {

        protected Iterator _contents;
        protected java.util.Map.Entry _current;
        protected boolean _needEntry;

        public final boolean currentHasChildren()
        {
            return ((ContainerNode)currentNode()).size() > 0;
        }

        public final JsonNode currentNode()
        {
            if (_current == null)
            {
                return null;
            } else
            {
                return (JsonNode)_current.getValue();
            }
        }

        public final JsonToken endToken()
        {
            return JsonToken.END_OBJECT;
        }

        public final JsonToken nextToken()
        {
            if (_needEntry)
            {
                if (!_contents.hasNext())
                {
                    _currentName = null;
                    _current = null;
                    return null;
                }
                _needEntry = false;
                _current = (java.util.Map.Entry)_contents.next();
                String s;
                if (_current == null)
                {
                    s = null;
                } else
                {
                    s = (String)_current.getKey();
                }
                _currentName = s;
                return JsonToken.FIELD_NAME;
            } else
            {
                _needEntry = true;
                return ((JsonNode)_current.getValue()).asToken();
            }
        }

        public Object(JsonNode jsonnode, NodeCursor nodecursor)
        {
            super(2, nodecursor);
            _contents = ((ObjectNode)jsonnode).fields();
            _needEntry = true;
        }
    }

}
