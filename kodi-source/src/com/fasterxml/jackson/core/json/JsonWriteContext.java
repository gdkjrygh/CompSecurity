// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fasterxml.jackson.core.json;

import com.fasterxml.jackson.core.JsonGenerationException;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.core.JsonStreamContext;

// Referenced classes of package com.fasterxml.jackson.core.json:
//            DupDetector

public class JsonWriteContext extends JsonStreamContext
{

    protected JsonWriteContext _child;
    protected String _currentName;
    protected Object _currentValue;
    protected DupDetector _dups;
    protected boolean _gotName;
    protected final JsonWriteContext _parent;

    protected JsonWriteContext(int i, JsonWriteContext jsonwritecontext, DupDetector dupdetector)
    {
        _child = null;
        _type = i;
        _parent = jsonwritecontext;
        _dups = dupdetector;
        _index = -1;
    }

    private final void _checkDup(DupDetector dupdetector, String s)
        throws JsonProcessingException
    {
        if (dupdetector.isDup(s))
        {
            throw new JsonGenerationException((new StringBuilder()).append("Duplicate field '").append(s).append("'").toString());
        } else
        {
            return;
        }
    }

    public static JsonWriteContext createRootContext(DupDetector dupdetector)
    {
        return new JsonWriteContext(0, null, dupdetector);
    }

    protected void appendDesc(StringBuilder stringbuilder)
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

    public JsonWriteContext createChildArrayContext()
    {
        Object obj = _child;
        if (obj == null)
        {
            if (_dups == null)
            {
                obj = null;
            } else
            {
                obj = _dups.child();
            }
            obj = new JsonWriteContext(1, this, ((DupDetector) (obj)));
            _child = ((JsonWriteContext) (obj));
            return ((JsonWriteContext) (obj));
        } else
        {
            return ((JsonWriteContext) (obj)).reset(1);
        }
    }

    public JsonWriteContext createChildObjectContext()
    {
        Object obj = _child;
        if (obj == null)
        {
            if (_dups == null)
            {
                obj = null;
            } else
            {
                obj = _dups.child();
            }
            obj = new JsonWriteContext(2, this, ((DupDetector) (obj)));
            _child = ((JsonWriteContext) (obj));
            return ((JsonWriteContext) (obj));
        } else
        {
            return ((JsonWriteContext) (obj)).reset(2);
        }
    }

    public final JsonWriteContext getParent()
    {
        return _parent;
    }

    protected JsonWriteContext reset(int i)
    {
        _type = i;
        _index = -1;
        _currentName = null;
        _gotName = false;
        _currentValue = null;
        if (_dups != null)
        {
            _dups.reset();
        }
        return this;
    }

    public void setCurrentValue(Object obj)
    {
        _currentValue = obj;
    }

    public String toString()
    {
        StringBuilder stringbuilder = new StringBuilder(64);
        appendDesc(stringbuilder);
        return stringbuilder.toString();
    }

    public int writeFieldName(String s)
        throws JsonProcessingException
    {
        byte byte0 = 1;
        if (_gotName)
        {
            byte0 = 4;
        } else
        {
            _gotName = true;
            _currentName = s;
            if (_dups != null)
            {
                _checkDup(_dups, s);
            }
            if (_index < 0)
            {
                return 0;
            }
        }
        return byte0;
    }
}
