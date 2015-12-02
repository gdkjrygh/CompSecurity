// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.contacts.server;


public final class ad extends Enum
{

    private static final ad $VALUES[];
    public static final ad ADD;
    public static final ad DELETE;
    public static final ad MODIFY;

    private ad(String s, int i)
    {
        super(s, i);
    }

    public static ad valueOf(String s)
    {
        return (ad)Enum.valueOf(com/facebook/contacts/server/ad, s);
    }

    public static ad[] values()
    {
        return (ad[])$VALUES.clone();
    }

    static 
    {
        ADD = new ad("ADD", 0);
        MODIFY = new ad("MODIFY", 1);
        DELETE = new ad("DELETE", 2);
        $VALUES = (new ad[] {
            ADD, MODIFY, DELETE
        });
    }
}
