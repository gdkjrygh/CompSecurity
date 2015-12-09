// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fasterxml.jackson.core;


public final class JsonToken extends Enum
{

    public static final JsonToken a;
    public static final JsonToken b;
    public static final JsonToken c;
    public static final JsonToken d;
    public static final JsonToken e;
    public static final JsonToken f;
    public static final JsonToken g;
    public static final JsonToken h;
    public static final JsonToken i;
    public static final JsonToken j;
    public static final JsonToken k;
    public static final JsonToken l;
    public static final JsonToken m;
    private static final JsonToken n[];
    final String _serialized;
    final byte _serializedBytes[];
    final char _serializedChars[];

    private JsonToken(String s, int i1, String s1)
    {
        super(s, i1);
        if (s1 == null)
        {
            _serialized = null;
            _serializedChars = null;
            _serializedBytes = null;
        } else
        {
            _serialized = s1;
            _serializedChars = s1.toCharArray();
            int j1 = _serializedChars.length;
            _serializedBytes = new byte[j1];
            i1 = 0;
            while (i1 < j1) 
            {
                _serializedBytes[i1] = (byte)_serializedChars[i1];
                i1++;
            }
        }
    }

    public static JsonToken valueOf(String s)
    {
        return (JsonToken)Enum.valueOf(com/fasterxml/jackson/core/JsonToken, s);
    }

    public static JsonToken[] values()
    {
        return (JsonToken[])n.clone();
    }

    public String a()
    {
        return _serialized;
    }

    public char[] b()
    {
        return _serializedChars;
    }

    public byte[] c()
    {
        return _serializedBytes;
    }

    public boolean d()
    {
        return this == i || this == j;
    }

    public boolean e()
    {
        return ordinal() >= g.ordinal();
    }

    static 
    {
        a = new JsonToken("NOT_AVAILABLE", 0, null);
        b = new JsonToken("START_OBJECT", 1, "{");
        c = new JsonToken("END_OBJECT", 2, "}");
        d = new JsonToken("START_ARRAY", 3, "[");
        e = new JsonToken("END_ARRAY", 4, "]");
        f = new JsonToken("FIELD_NAME", 5, null);
        g = new JsonToken("VALUE_EMBEDDED_OBJECT", 6, null);
        h = new JsonToken("VALUE_STRING", 7, null);
        i = new JsonToken("VALUE_NUMBER_INT", 8, null);
        j = new JsonToken("VALUE_NUMBER_FLOAT", 9, null);
        k = new JsonToken("VALUE_TRUE", 10, "true");
        l = new JsonToken("VALUE_FALSE", 11, "false");
        m = new JsonToken("VALUE_NULL", 12, "null");
        n = (new JsonToken[] {
            a, b, c, d, e, f, g, h, i, j, 
            k, l, m
        });
    }
}
