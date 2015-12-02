// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.debug.d;


final class d extends Enum
{

    private static final d $VALUES[];
    public static final d COMMENT;
    public static final d START;
    public static final d STOP;

    private d(String s, int i)
    {
        super(s, i);
    }

    public static d valueOf(String s)
    {
        return (d)Enum.valueOf(com/facebook/debug/d/d, s);
    }

    public static d[] values()
    {
        return (d[])$VALUES.clone();
    }

    static 
    {
        START = new d("START", 0);
        STOP = new d("STOP", 1);
        COMMENT = new d("COMMENT", 2);
        $VALUES = (new d[] {
            START, STOP, COMMENT
        });
    }
}
