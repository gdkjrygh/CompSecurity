// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.contacts.f;


public final class b extends Enum
{

    private static final b $VALUES[];
    public static final b BIG;
    public static final b HUGE;
    public static final b SMALL;

    private b(String s, int i)
    {
        super(s, i);
    }

    public static b valueOf(String s)
    {
        return (b)Enum.valueOf(com/facebook/contacts/f/b, s);
    }

    public static b[] values()
    {
        return (b[])$VALUES.clone();
    }

    static 
    {
        SMALL = new b("SMALL", 0);
        BIG = new b("BIG", 1);
        HUGE = new b("HUGE", 2);
        $VALUES = (new b[] {
            SMALL, BIG, HUGE
        });
    }
}
