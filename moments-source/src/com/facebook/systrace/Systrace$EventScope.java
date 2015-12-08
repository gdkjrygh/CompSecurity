// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.systrace;


public final class mCode extends Enum
{

    private static final GLOBAL $VALUES[];
    public static final GLOBAL GLOBAL;
    public static final GLOBAL PROCESS;
    public static final GLOBAL THREAD;
    private final char mCode;

    public static mCode valueOf(String s)
    {
        return (mCode)Enum.valueOf(com/facebook/systrace/Systrace$EventScope, s);
    }

    public static mCode[] values()
    {
        return (mCode[])$VALUES.clone();
    }

    public final char getCode()
    {
        return mCode;
    }

    static 
    {
        THREAD = new <init>("THREAD", 0, 't');
        PROCESS = new <init>("PROCESS", 1, 'p');
        GLOBAL = new <init>("GLOBAL", 2, 'g');
        $VALUES = (new .VALUES[] {
            THREAD, PROCESS, GLOBAL
        });
    }

    private (String s, int i, char c)
    {
        super(s, i);
        mCode = c;
    }
}
