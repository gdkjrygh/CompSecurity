// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.config.a;


public final class b extends Enum
{

    private static final b $VALUES[];
    public static final b DEVELOPMENT;
    public static final b FACEBOOK;
    public static final b PUBLIC;

    private b(String s, int i)
    {
        super(s, i);
    }

    public static b valueOf(String s)
    {
        return (b)Enum.valueOf(com/facebook/config/a/b, s);
    }

    public static b[] values()
    {
        return (b[])$VALUES.clone();
    }

    static 
    {
        PUBLIC = new b("PUBLIC", 0);
        FACEBOOK = new b("FACEBOOK", 1);
        DEVELOPMENT = new b("DEVELOPMENT", 2);
        $VALUES = (new b[] {
            PUBLIC, FACEBOOK, DEVELOPMENT
        });
    }
}
