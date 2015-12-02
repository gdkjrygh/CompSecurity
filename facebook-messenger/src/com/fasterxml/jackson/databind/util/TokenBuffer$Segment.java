// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fasterxml.jackson.databind.util;

import com.fasterxml.jackson.core.JsonToken;

public final class 
{

    public static final int TOKENS_PER_SEGMENT = 16;
    private static final JsonToken TOKEN_TYPES_BY_INDEX[];
    protected TOKEN_TYPES_BY_INDEX _next;
    protected long _tokenTypes;
    protected final Object _tokens[] = new Object[16];

    private void set(int i, int j, Object obj)
    {
        _tokens[i] = obj;
        long l1 = j;
        long l = l1;
        if (i > 0)
        {
            l = l1 << (i << 2);
        }
        _tokenTypes = l | _tokenTypes;
    }

    public _tokenTypes append(int i, JsonToken jsontoken)
    {
        if (i < 16)
        {
            set(i, jsontoken);
            return null;
        } else
        {
            _next = new <init>();
            _next.set(0, jsontoken);
            return _next;
        }
    }

    public _next append(int i, JsonToken jsontoken, Object obj)
    {
        if (i < 16)
        {
            set(i, jsontoken, obj);
            return null;
        } else
        {
            _next = new <init>();
            _next.set(0, jsontoken, obj);
            return _next;
        }
    }

    public _next appendRaw(int i, int j, Object obj)
    {
        if (i < 16)
        {
            set(i, j, obj);
            return null;
        } else
        {
            _next = new <init>();
            _next.set(0, j, obj);
            return _next;
        }
    }

    public Object get(int i)
    {
        return _tokens[i];
    }

    public _tokens next()
    {
        return _next;
    }

    public int rawType(int i)
    {
        long l1 = _tokenTypes;
        long l = l1;
        if (i > 0)
        {
            l = l1 >> (i << 2);
        }
        return (int)l & 0xf;
    }

    public void set(int i, JsonToken jsontoken)
    {
        long l1 = jsontoken.ordinal();
        long l = l1;
        if (i > 0)
        {
            l = l1 << (i << 2);
        }
        _tokenTypes = l | _tokenTypes;
    }

    public void set(int i, JsonToken jsontoken, Object obj)
    {
        _tokens[i] = obj;
        long l1 = jsontoken.ordinal();
        long l = l1;
        if (i > 0)
        {
            l = l1 << (i << 2);
        }
        _tokenTypes = l | _tokenTypes;
    }

    public JsonToken type(int i)
    {
        long l1 = _tokenTypes;
        long l = l1;
        if (i > 0)
        {
            l = l1 >> (i << 2);
        }
        i = (int)l;
        return TOKEN_TYPES_BY_INDEX[i & 0xf];
    }

    static 
    {
        TOKEN_TYPES_BY_INDEX = new JsonToken[16];
        JsonToken ajsontoken[] = JsonToken.values();
        System.arraycopy(ajsontoken, 1, TOKEN_TYPES_BY_INDEX, 1, Math.min(15, ajsontoken.length - 1));
    }

    public ()
    {
    }
}
