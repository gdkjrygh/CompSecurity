// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook;


public final class  extends Enum
{

    public static final d a;
    public static final d b;
    public static final d c;
    private static d d;
    private static final d e[];

    public static  valueOf(String s)
    {
        return ()Enum.valueOf(com/facebook/AppEventsLogger$FlushResult, s);
    }

    public static [] values()
    {
        return ([])e.clone();
    }

    static 
    {
        a = new <init>("SUCCESS", 0);
        b = new <init>("SERVER_ERROR", 1);
        c = new <init>("NO_CONNECTIVITY", 2);
        d = new <init>("UNKNOWN_ERROR", 3);
        e = (new e[] {
            a, b, c, d
        });
    }

    private (String s, int i)
    {
        super(s, i);
    }
}
