// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.contacts.e;


final class f extends Enum
{

    private static final f $VALUES[];
    public static final f EXCLUDE;
    public static final f INCLUDE;

    private f(String s, int i)
    {
        super(s, i);
    }

    public static f valueOf(String s)
    {
        return (f)Enum.valueOf(com/facebook/contacts/e/f, s);
    }

    public static f[] values()
    {
        return (f[])$VALUES.clone();
    }

    static 
    {
        INCLUDE = new f("INCLUDE", 0);
        EXCLUDE = new f("EXCLUDE", 1);
        $VALUES = (new f[] {
            INCLUDE, EXCLUDE
        });
    }
}
