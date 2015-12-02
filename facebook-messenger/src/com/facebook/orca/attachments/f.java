// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.orca.attachments;


public final class f extends Enum
{

    private static final f $VALUES[];
    public static final f LANDSCAPE;
    public static final f PORTRAIT;
    public static final f SQUARE;
    public static final f UNKNOWN;

    private f(String s, int i)
    {
        super(s, i);
    }

    public static f valueOf(String s)
    {
        return (f)Enum.valueOf(com/facebook/orca/attachments/f, s);
    }

    public static f[] values()
    {
        return (f[])$VALUES.clone();
    }

    static 
    {
        LANDSCAPE = new f("LANDSCAPE", 0);
        PORTRAIT = new f("PORTRAIT", 1);
        SQUARE = new f("SQUARE", 2);
        UNKNOWN = new f("UNKNOWN", 3);
        $VALUES = (new f[] {
            LANDSCAPE, PORTRAIT, SQUARE, UNKNOWN
        });
    }
}
