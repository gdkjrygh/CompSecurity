// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fasterxml.jackson.databind.util;

import com.fasterxml.jackson.core.JsonToken;
import java.util.TreeMap;

public final class 
{

    private static final JsonToken TOKEN_TYPES_BY_INDEX[];
    protected TreeMap _nativeIds;
    protected TOKEN_TYPES_BY_INDEX _next;
    protected long _tokenTypes;
    protected final Object _tokens[] = new Object[16];

    private final int _objectIdIndex(int i)
    {
        return i + i + 1;
    }

    private final int _typeIdIndex(int i)
    {
        return i + i;
    }

    private final void assignNativeIds(int i, Object obj, Object obj1)
    {
        if (_nativeIds == null)
        {
            _nativeIds = new TreeMap();
        }
        if (obj != null)
        {
            _nativeIds.put(Integer.valueOf(_objectIdIndex(i)), obj);
        }
        if (obj1 != null)
        {
            _nativeIds.put(Integer.valueOf(_typeIdIndex(i)), obj1);
        }
    }

    private void set(int i, JsonToken jsontoken)
    {
        long l1 = jsontoken.ordinal();
        long l = l1;
        if (i > 0)
        {
            l = l1 << (i << 2);
        }
        _tokenTypes = l | _tokenTypes;
    }

    private void set(int i, JsonToken jsontoken, Object obj)
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

    private void set(int i, JsonToken jsontoken, Object obj, Object obj1)
    {
        long l1 = jsontoken.ordinal();
        long l = l1;
        if (i > 0)
        {
            l = l1 << (i << 2);
        }
        _tokenTypes = l | _tokenTypes;
        assignNativeIds(i, obj, obj1);
    }

    private void set(int i, JsonToken jsontoken, Object obj, Object obj1, Object obj2)
    {
        _tokens[i] = obj;
        long l1 = jsontoken.ordinal();
        long l = l1;
        if (i > 0)
        {
            l = l1 << (i << 2);
        }
        _tokenTypes = l | _tokenTypes;
        assignNativeIds(i, obj1, obj2);
    }

    public final assignNativeIds append(int i, JsonToken jsontoken)
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

    public final _next append(int i, JsonToken jsontoken, Object obj)
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

    public final _next append(int i, JsonToken jsontoken, Object obj, Object obj1)
    {
        if (i < 16)
        {
            set(i, jsontoken, obj, obj1);
            return null;
        } else
        {
            _next = new <init>();
            _next.set(0, jsontoken, obj, obj1);
            return _next;
        }
    }

    public final _next append(int i, JsonToken jsontoken, Object obj, Object obj1, Object obj2)
    {
        if (i < 16)
        {
            set(i, jsontoken, obj, obj1, obj2);
            return null;
        } else
        {
            _next = new <init>();
            _next.set(0, jsontoken, obj, obj1, obj2);
            return _next;
        }
    }

    public final Object findObjectId(int i)
    {
        if (_nativeIds == null)
        {
            return null;
        } else
        {
            return _nativeIds.get(Integer.valueOf(_objectIdIndex(i)));
        }
    }

    public final Object findTypeId(int i)
    {
        if (_nativeIds == null)
        {
            return null;
        } else
        {
            return _nativeIds.get(Integer.valueOf(_typeIdIndex(i)));
        }
    }

    public final Object get(int i)
    {
        return _tokens[i];
    }

    public final boolean hasIds()
    {
        return _nativeIds != null;
    }

    public final _nativeIds next()
    {
        return _next;
    }

    public final JsonToken type(int i)
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
