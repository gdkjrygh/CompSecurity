// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.ford.syncV4.proxy.rpc.enums;


public final class TextAlignment extends Enum
{

    public static final TextAlignment a;
    private static TextAlignment b;
    private static TextAlignment c;
    private static final TextAlignment d[];

    private TextAlignment(String s, int i)
    {
        super(s, i);
    }

    public static TextAlignment valueOf(String s)
    {
        return (TextAlignment)Enum.valueOf(com/ford/syncV4/proxy/rpc/enums/TextAlignment, s);
    }

    public static TextAlignment[] values()
    {
        return (TextAlignment[])d.clone();
    }

    static 
    {
        a = new TextAlignment("LEFT_ALIGNED", 0);
        b = new TextAlignment("RIGHT_ALIGNED", 1);
        c = new TextAlignment("CENTERED", 2);
        d = (new TextAlignment[] {
            a, b, c
        });
    }
}
