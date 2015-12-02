// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.contacts.models.entry;


public final class d extends Enum
{

    private static final d $VALUES[];
    public static final d ADDRESS;
    public static final d DEFAULT;
    public static final d EMAIL;
    public static final d PHONE_NUMBER;

    private d(String s, int i)
    {
        super(s, i);
    }

    public static d valueOf(String s)
    {
        return (d)Enum.valueOf(com/facebook/contacts/models/entry/d, s);
    }

    public static d[] values()
    {
        return (d[])$VALUES.clone();
    }

    static 
    {
        PHONE_NUMBER = new d("PHONE_NUMBER", 0);
        EMAIL = new d("EMAIL", 1);
        ADDRESS = new d("ADDRESS", 2);
        DEFAULT = new d("DEFAULT", 3);
        $VALUES = (new d[] {
            PHONE_NUMBER, EMAIL, ADDRESS, DEFAULT
        });
    }
}
