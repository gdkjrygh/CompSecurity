// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fasterxml.jackson.core.util;


public class DefaultIndenter extends DefaultPrettyPrinter.NopIndenter
{

    public static final DefaultIndenter SYSTEM_LINEFEED_INSTANCE;
    public static final String SYS_LF;
    private final int charsPerLevel;
    private final String eol;
    private final char indents[];

    public DefaultIndenter()
    {
        this("  ", SYS_LF);
    }

    public DefaultIndenter(String s, String s1)
    {
        charsPerLevel = s.length();
        indents = new char[s.length() * 16];
        int j = 0;
        for (int i = 0; i < 16; i++)
        {
            s.getChars(0, s.length(), indents, j);
            j += s.length();
        }

        eol = s1;
    }

    static 
    {
        String s;
        try
        {
            s = System.getProperty("line.separator");
        }
        catch (Throwable throwable)
        {
            throwable = "\n";
        }
        SYS_LF = s;
        SYSTEM_LINEFEED_INSTANCE = new DefaultIndenter("  ", SYS_LF);
    }
}
