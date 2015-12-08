// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fasterxml.jackson.core;


public final class JsonEncoding extends Enum
{

    public static final JsonEncoding a;
    public static final JsonEncoding b;
    public static final JsonEncoding c;
    public static final JsonEncoding d;
    public static final JsonEncoding e;
    private static final JsonEncoding f[];
    protected final boolean _bigEndian;
    protected final String _javaName;

    private JsonEncoding(String s, int i, String s1, boolean flag)
    {
        super(s, i);
        _javaName = s1;
        _bigEndian = flag;
    }

    public static JsonEncoding valueOf(String s)
    {
        return (JsonEncoding)Enum.valueOf(com/fasterxml/jackson/core/JsonEncoding, s);
    }

    public static JsonEncoding[] values()
    {
        return (JsonEncoding[])f.clone();
    }

    public String a()
    {
        return _javaName;
    }

    public boolean b()
    {
        return _bigEndian;
    }

    static 
    {
        a = new JsonEncoding("UTF8", 0, "UTF-8", false);
        b = new JsonEncoding("UTF16_BE", 1, "UTF-16BE", true);
        c = new JsonEncoding("UTF16_LE", 2, "UTF-16LE", false);
        d = new JsonEncoding("UTF32_BE", 3, "UTF-32BE", true);
        e = new JsonEncoding("UTF32_LE", 4, "UTF-32LE", false);
        f = (new JsonEncoding[] {
            a, b, c, d, e
        });
    }
}
