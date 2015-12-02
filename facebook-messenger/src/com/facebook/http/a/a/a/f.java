// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.http.a.a.a;


public final class f extends Enum
{

    private static final f $VALUES[];
    public static final f BROWSER_COMPATIBLE;
    public static final f STRICT;

    private f(String s, int i)
    {
        super(s, i);
    }

    public static f valueOf(String s)
    {
        return (f)Enum.valueOf(com/facebook/http/a/a/a/f, s);
    }

    public static f[] values()
    {
        return (f[])$VALUES.clone();
    }

    static 
    {
        STRICT = new f("STRICT", 0);
        BROWSER_COMPATIBLE = new f("BROWSER_COMPATIBLE", 1);
        $VALUES = (new f[] {
            STRICT, BROWSER_COMPATIBLE
        });
    }
}
