// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.contacts.data;


public final class o extends Enum
{

    private static final o $VALUES[];
    public static final o INSERT;
    public static final o REPLACE_ALL;

    private o(String s, int i)
    {
        super(s, i);
    }

    public static o valueOf(String s)
    {
        return (o)Enum.valueOf(com/facebook/contacts/data/o, s);
    }

    public static o[] values()
    {
        return (o[])$VALUES.clone();
    }

    static 
    {
        REPLACE_ALL = new o("REPLACE_ALL", 0);
        INSERT = new o("INSERT", 1);
        $VALUES = (new o[] {
            REPLACE_ALL, INSERT
        });
    }
}
