// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fasterxml.jackson.core;


public final class JsonEncoding extends Enum
{

    private static final JsonEncoding $VALUES[];
    public static final JsonEncoding UTF16_BE;
    public static final JsonEncoding UTF16_LE;
    public static final JsonEncoding UTF32_BE;
    public static final JsonEncoding UTF32_LE;
    public static final JsonEncoding UTF8;
    protected final boolean _bigEndian;
    protected final int _bits;
    protected final String _javaName;

    private JsonEncoding(String s, int i, String s1, boolean flag, int j)
    {
        super(s, i);
        _javaName = s1;
        _bigEndian = flag;
        _bits = j;
    }

    public static JsonEncoding valueOf(String s)
    {
        return (JsonEncoding)Enum.valueOf(com/fasterxml/jackson/core/JsonEncoding, s);
    }

    public static JsonEncoding[] values()
    {
        return (JsonEncoding[])$VALUES.clone();
    }

    public int bits()
    {
        return _bits;
    }

    public String getJavaName()
    {
        return _javaName;
    }

    public boolean isBigEndian()
    {
        return _bigEndian;
    }

    static 
    {
        UTF8 = new JsonEncoding("UTF8", 0, "UTF-8", false, 8);
        UTF16_BE = new JsonEncoding("UTF16_BE", 1, "UTF-16BE", true, 16);
        UTF16_LE = new JsonEncoding("UTF16_LE", 2, "UTF-16LE", false, 16);
        UTF32_BE = new JsonEncoding("UTF32_BE", 3, "UTF-32BE", true, 32);
        UTF32_LE = new JsonEncoding("UTF32_LE", 4, "UTF-32LE", false, 32);
        $VALUES = (new JsonEncoding[] {
            UTF8, UTF16_BE, UTF16_LE, UTF32_BE, UTF32_LE
        });
    }
}
