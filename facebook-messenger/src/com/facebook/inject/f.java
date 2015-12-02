// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.inject;


public final class f extends Enum
{

    private static final f $VALUES[];
    public static final f EAGER;
    public static final f LESS_EAGER_ON_UI_THREAD;
    public static final f NONE;

    private f(String s, int i)
    {
        super(s, i);
    }

    public static f valueOf(String s)
    {
        return (f)Enum.valueOf(com/facebook/inject/f, s);
    }

    public static f[] values()
    {
        return (f[])$VALUES.clone();
    }

    static 
    {
        NONE = new f("NONE", 0);
        EAGER = new f("EAGER", 1);
        LESS_EAGER_ON_UI_THREAD = new f("LESS_EAGER_ON_UI_THREAD", 2);
        $VALUES = (new f[] {
            NONE, EAGER, LESS_EAGER_ON_UI_THREAD
        });
    }
}
