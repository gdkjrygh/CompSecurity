// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fasterxml.jackson.core.json;

import com.fasterxml.jackson.core.JsonStreamContext;

public class JsonWriteContext extends JsonStreamContext
{

    protected JsonWriteContext _child;
    protected String _currentName;
    protected final JsonWriteContext _parent;

    protected JsonWriteContext(int i, JsonWriteContext jsonwritecontext)
    {
        _child = null;
        _type = i;
        _parent = jsonwritecontext;
        _index = -1;
    }

    public static JsonWriteContext createRootContext()
    {
        return new JsonWriteContext(0, null);
    }

    private JsonWriteContext reset(int i)
    {
        _type = i;
        _index = -1;
        _currentName = null;
        return this;
    }

    protected final void appendDesc(StringBuilder stringbuilder)
    {
        if (_type == 2)
        {
            stringbuilder.append('{');
            if (_currentName != null)
            {
                stringbuilder.append('"');
                stringbuilder.append(_currentName);
                stringbuilder.append('"');
            } else
            {
                stringbuilder.append('?');
            }
            stringbuilder.append('}');
            return;
        }
        if (_type == 1)
        {
            stringbuilder.append('[');
            stringbuilder.append(getCurrentIndex());
            stringbuilder.append(']');
            return;
        } else
        {
            stringbuilder.append("/");
            return;
        }
    }

    public final JsonWriteContext createChildArrayContext()
    {
        JsonWriteContext jsonwritecontext = _child;
        if (jsonwritecontext == null)
        {
            jsonwritecontext = new JsonWriteContext(1, this);
            _child = jsonwritecontext;
            return jsonwritecontext;
        } else
        {
            return jsonwritecontext.reset(1);
        }
    }

    public final JsonWriteContext createChildObjectContext()
    {
        JsonWriteContext jsonwritecontext = _child;
        if (jsonwritecontext == null)
        {
            jsonwritecontext = new JsonWriteContext(2, this);
            _child = jsonwritecontext;
            return jsonwritecontext;
        } else
        {
            return jsonwritecontext.reset(2);
        }
    }

    public final JsonWriteContext getParent()
    {
        return _parent;
    }

    public final String toString()
    {
        StringBuilder stringbuilder = new StringBuilder(64);
        appendDesc(stringbuilder);
        return stringbuilder.toString();
    }

    public final int writeFieldName(String s)
    {
        if (_type != 2 || _currentName != null)
        {
            return 4;
        }
        _currentName = s;
        return _index >= 0 ? 1 : 0;
    }

    public final int writeValue()
    {
        if (_type == 2)
        {
            if (_currentName == null)
            {
                return 5;
            } else
            {
                _currentName = null;
                _index = _index + 1;
                return 2;
            }
        }
        if (_type == 1)
        {
            int i = _index;
            _index = _index + 1;
            return i >= 0 ? 1 : 0;
        }
        _index = _index + 1;
        return _index != 0 ? 3 : 0;
    }
}
