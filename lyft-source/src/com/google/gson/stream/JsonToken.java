// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.gson.stream;


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
    private static final JsonToken k[];

    private JsonToken(String s, int l)
    {
        super(s, l);
    }

    public static JsonToken valueOf(String s)
    {
        return (JsonToken)Enum.valueOf(com/google/gson/stream/JsonToken, s);
    }

    public static JsonToken[] values()
    {
        return (JsonToken[])k.clone();
    }

    static 
    {
        a = new JsonToken("BEGIN_ARRAY", 0);
        b = new JsonToken("END_ARRAY", 1);
        c = new JsonToken("BEGIN_OBJECT", 2);
        d = new JsonToken("END_OBJECT", 3);
        e = new JsonToken("NAME", 4);
        f = new JsonToken("STRING", 5);
        g = new JsonToken("NUMBER", 6);
        h = new JsonToken("BOOLEAN", 7);
        i = new JsonToken("NULL", 8);
        j = new JsonToken("END_DOCUMENT", 9);
        k = (new JsonToken[] {
            a, b, c, d, e, f, g, h, i, j
        });
    }
}
