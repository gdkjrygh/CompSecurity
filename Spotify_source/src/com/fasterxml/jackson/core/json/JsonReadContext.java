// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fasterxml.jackson.core.json;

import com.fasterxml.jackson.core.JsonLocation;
import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.core.JsonStreamContext;
import com.fasterxml.jackson.core.io.CharTypes;

// Referenced classes of package com.fasterxml.jackson.core.json:
//            DupDetector

public final class JsonReadContext extends JsonStreamContext
{

    protected JsonReadContext _child;
    protected int _columnNr;
    protected String _currentName;
    protected final DupDetector _dups;
    protected int _lineNr;
    protected final JsonReadContext _parent;

    public JsonReadContext(JsonReadContext jsonreadcontext, DupDetector dupdetector, int i, int j, int k)
    {
        _child = null;
        _parent = jsonreadcontext;
        _dups = dupdetector;
        _type = i;
        _lineNr = j;
        _columnNr = k;
        _index = -1;
    }

    private void _checkDup(DupDetector dupdetector, String s)
    {
        if (dupdetector.isDup(s))
        {
            throw new JsonParseException((new StringBuilder("Duplicate field '")).append(s).append("'").toString(), dupdetector.findLocation());
        } else
        {
            return;
        }
    }

    public static JsonReadContext createRootContext(DupDetector dupdetector)
    {
        return new JsonReadContext(null, dupdetector, 0, 1, 0);
    }

    public final JsonReadContext createChildArrayContext(int i, int j)
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
            obj = new JsonReadContext(this, ((DupDetector) (obj)), 1, i, j);
            _child = ((JsonReadContext) (obj));
            return ((JsonReadContext) (obj));
        } else
        {
            ((JsonReadContext) (obj)).reset(1, i, j);
            return ((JsonReadContext) (obj));
        }
    }

    public final JsonReadContext createChildObjectContext(int i, int j)
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
            obj = new JsonReadContext(this, ((DupDetector) (obj)), 2, i, j);
            _child = ((JsonReadContext) (obj));
            return ((JsonReadContext) (obj));
        } else
        {
            ((JsonReadContext) (obj)).reset(2, i, j);
            return ((JsonReadContext) (obj));
        }
    }

    public final boolean expectComma()
    {
        int i = _index + 1;
        _index = i;
        return _type != 0 && i > 0;
    }

    public final String getCurrentName()
    {
        return _currentName;
    }

    public final JsonReadContext getParent()
    {
        return _parent;
    }

    public final JsonLocation getStartLocation(Object obj)
    {
        return new JsonLocation(obj, -1L, _lineNr, _columnNr);
    }

    protected final void reset(int i, int j, int k)
    {
        _type = i;
        _index = -1;
        _lineNr = j;
        _columnNr = k;
        _currentName = null;
        if (_dups != null)
        {
            _dups.reset();
        }
    }

    public final void setCurrentName(String s)
    {
        _currentName = s;
        if (_dups != null)
        {
            _checkDup(_dups, s);
        }
    }

    public final String toString()
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
