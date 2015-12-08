// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fasterxml.jackson.core.json;

import com.fasterxml.jackson.core.JsonLocation;
import com.fasterxml.jackson.core.JsonStreamContext;
import com.fasterxml.jackson.core.io.CharTypes;

public final class JsonReadContext extends JsonStreamContext
{

    protected JsonReadContext _child;
    protected int _columnNr;
    protected String _currentName;
    protected int _lineNr;
    protected final JsonReadContext _parent;

    public JsonReadContext(JsonReadContext jsonreadcontext, int i, int j, int k)
    {
        _child = null;
        _type = i;
        _parent = jsonreadcontext;
        _lineNr = j;
        _columnNr = k;
        _index = -1;
    }

    public static JsonReadContext createRootContext()
    {
        return new JsonReadContext(null, 0, 1, 0);
    }

    public static JsonReadContext createRootContext(int i, int j)
    {
        return new JsonReadContext(null, 0, i, j);
    }

    public JsonReadContext createChildArrayContext(int i, int j)
    {
        JsonReadContext jsonreadcontext = _child;
        if (jsonreadcontext == null)
        {
            jsonreadcontext = new JsonReadContext(this, 1, i, j);
            _child = jsonreadcontext;
            return jsonreadcontext;
        } else
        {
            jsonreadcontext.reset(1, i, j);
            return jsonreadcontext;
        }
    }

    public JsonReadContext createChildObjectContext(int i, int j)
    {
        JsonReadContext jsonreadcontext = _child;
        if (jsonreadcontext == null)
        {
            jsonreadcontext = new JsonReadContext(this, 2, i, j);
            _child = jsonreadcontext;
            return jsonreadcontext;
        } else
        {
            jsonreadcontext.reset(2, i, j);
            return jsonreadcontext;
        }
    }

    public boolean expectComma()
    {
        int i = _index + 1;
        _index = i;
        return _type != 0 && i > 0;
    }

    public String getCurrentName()
    {
        return _currentName;
    }

    public volatile JsonStreamContext getParent()
    {
        return getParent();
    }

    public JsonReadContext getParent()
    {
        return _parent;
    }

    public JsonLocation getStartLocation(Object obj)
    {
        return new JsonLocation(obj, -1L, _lineNr, _columnNr);
    }

    protected void reset(int i, int j, int k)
    {
        _type = i;
        _index = -1;
        _lineNr = j;
        _columnNr = k;
        _currentName = null;
    }

    public void setCurrentName(String s)
    {
        _currentName = s;
    }

    public String toString()
    {
        StringBuilder stringbuilder = new StringBuilder(64);
        _type;
        JVM INSTR tableswitch 0 2: default 40
    //                   0 45
    //                   1 55
    //                   2 81;
           goto _L1 _L2 _L3 _L4
_L1:
        return stringbuilder.toString();
_L2:
        stringbuilder.append("/");
        continue; /* Loop/switch isn't completed */
_L3:
        stringbuilder.append('[');
        stringbuilder.append(getCurrentIndex());
        stringbuilder.append(']');
        continue; /* Loop/switch isn't completed */
_L4:
        stringbuilder.append('{');
        if (_currentName != null)
        {
            stringbuilder.append('"');
            CharTypes.appendQuoted(stringbuilder, _currentName);
            stringbuilder.append('"');
        } else
        {
            stringbuilder.append('?');
        }
        stringbuilder.append('}');
        if (true) goto _L1; else goto _L5
_L5:
    }
}
