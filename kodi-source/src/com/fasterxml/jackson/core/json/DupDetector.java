// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fasterxml.jackson.core.json;

import com.fasterxml.jackson.core.JsonLocation;
import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.core.JsonParser;
import java.util.HashSet;

public class DupDetector
{

    protected String _firstName;
    protected String _secondName;
    protected HashSet _seen;
    protected final Object _source;

    private DupDetector(Object obj)
    {
        _source = obj;
    }

    public static DupDetector rootDetector(JsonParser jsonparser)
    {
        return new DupDetector(jsonparser);
    }

    public DupDetector child()
    {
        return new DupDetector(_source);
    }

    public JsonLocation findLocation()
    {
        if (_source instanceof JsonParser)
        {
            return ((JsonParser)_source).getCurrentLocation();
        } else
        {
            return null;
        }
    }

    public boolean isDup(String s)
        throws JsonParseException
    {
        boolean flag1 = true;
        boolean flag;
        if (_firstName == null)
        {
            _firstName = s;
            flag = false;
        } else
        {
            flag = flag1;
            if (!s.equals(_firstName))
            {
                if (_secondName == null)
                {
                    _secondName = s;
                    return false;
                }
                flag = flag1;
                if (!s.equals(_secondName))
                {
                    if (_seen == null)
                    {
                        _seen = new HashSet(16);
                        _seen.add(_firstName);
                        _seen.add(_secondName);
                    }
                    flag = flag1;
                    if (_seen.add(s))
                    {
                        return false;
                    }
                }
            }
        }
        return flag;
    }

    public void reset()
    {
        _firstName = null;
        _secondName = null;
        _seen = null;
    }
}
