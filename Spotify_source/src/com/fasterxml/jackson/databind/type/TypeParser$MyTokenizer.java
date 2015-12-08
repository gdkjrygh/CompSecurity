// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fasterxml.jackson.databind.type;

import java.util.StringTokenizer;

final class _input extends StringTokenizer
{

    protected int _index;
    protected final String _input;
    protected String _pushbackToken;

    public final String getAllInput()
    {
        return _input;
    }

    public final String getRemainingInput()
    {
        return _input.substring(_index);
    }

    public final boolean hasMoreTokens()
    {
        return _pushbackToken != null || super.hasMoreTokens();
    }

    public final String nextToken()
    {
        String s;
        if (_pushbackToken != null)
        {
            s = _pushbackToken;
            _pushbackToken = null;
        } else
        {
            s = super.nextToken();
        }
        _index = _index + s.length();
        return s;
    }

    public final void pushBack(String s)
    {
        _pushbackToken = s;
        _index = _index - s.length();
    }

    public (String s)
    {
        super(s, "<,>", true);
        _input = s;
    }
}
