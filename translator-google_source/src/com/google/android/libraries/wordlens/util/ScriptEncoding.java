// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.libraries.wordlens.util;


public final class ScriptEncoding extends Enum
{

    public static final ScriptEncoding ASCII;
    public static final ScriptEncoding CYRILLIC;
    public static final ScriptEncoding LATIN_9;
    public static final ScriptEncoding UNKNOWN;
    public static final ScriptEncoding UTF16;
    public static final ScriptEncoding UTF32;
    public static final ScriptEncoding UTF8;
    private static final ScriptEncoding a[];

    private ScriptEncoding(String s, int i)
    {
        super(s, i);
    }

    public static ScriptEncoding valueOf(String s)
    {
        return (ScriptEncoding)Enum.valueOf(com/google/android/libraries/wordlens/util/ScriptEncoding, s);
    }

    public static ScriptEncoding[] values()
    {
        return (ScriptEncoding[])a.clone();
    }

    static 
    {
        UNKNOWN = new ScriptEncoding("UNKNOWN", 0);
        ASCII = new ScriptEncoding("ASCII", 1);
        LATIN_9 = new ScriptEncoding("LATIN_9", 2);
        CYRILLIC = new ScriptEncoding("CYRILLIC", 3);
        UTF8 = new ScriptEncoding("UTF8", 4);
        UTF16 = new ScriptEncoding("UTF16", 5);
        UTF32 = new ScriptEncoding("UTF32", 6);
        a = (new ScriptEncoding[] {
            UNKNOWN, ASCII, LATIN_9, CYRILLIC, UTF8, UTF16, UTF32
        });
    }
}
