// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.debug.logcat.raw;


final class  extends Enum
{

    private static final KILLED $VALUES[];
    public static final KILLED BORN;
    public static final KILLED KILLED;
    public static final KILLED RUNNING;

    public static  valueOf(String s)
    {
        return ()Enum.valueOf(com/facebook/debug/logcat/raw/LogcatProcess$State, s);
    }

    public static [] values()
    {
        return ([])$VALUES.clone();
    }

    static 
    {
        BORN = new <init>("BORN", 0);
        RUNNING = new <init>("RUNNING", 1);
        KILLED = new <init>("KILLED", 2);
        $VALUES = (new .VALUES[] {
            BORN, RUNNING, KILLED
        });
    }

    private (String s, int i)
    {
        super(s, i);
    }
}
