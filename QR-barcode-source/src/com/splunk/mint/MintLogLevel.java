// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.splunk.mint;


public final class MintLogLevel extends Enum
{

    private static final MintLogLevel $VALUES[];
    public static final MintLogLevel Debug;
    public static final MintLogLevel Error;
    public static final MintLogLevel Info;
    public static final MintLogLevel Verbose;
    public static final MintLogLevel Warning;

    private MintLogLevel(String s, int i)
    {
        super(s, i);
    }

    public static MintLogLevel valueOf(String s)
    {
        return (MintLogLevel)Enum.valueOf(com/splunk/mint/MintLogLevel, s);
    }

    public static MintLogLevel[] values()
    {
        return (MintLogLevel[])$VALUES.clone();
    }

    static 
    {
        Verbose = new MintLogLevel("Verbose", 0);
        Debug = new MintLogLevel("Debug", 1);
        Info = new MintLogLevel("Info", 2);
        Warning = new MintLogLevel("Warning", 3);
        Error = new MintLogLevel("Error", 4);
        $VALUES = (new MintLogLevel[] {
            Verbose, Debug, Info, Warning, Error
        });
    }
}
