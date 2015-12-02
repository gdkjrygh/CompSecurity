// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.contacts.server;


public final class aj extends Enum
{

    private static final aj $VALUES[];
    public static final aj EMAIL;
    public static final aj EMAIL_PUBLIC_HASH;
    public static final aj NAME;
    public static final aj PHONE;
    public static final aj PHONE_PUBLIC_HASH;

    private aj(String s, int i)
    {
        super(s, i);
    }

    public static aj valueOf(String s)
    {
        return (aj)Enum.valueOf(com/facebook/contacts/server/aj, s);
    }

    public static aj[] values()
    {
        return (aj[])$VALUES.clone();
    }

    static 
    {
        NAME = new aj("NAME", 0);
        EMAIL = new aj("EMAIL", 1);
        PHONE = new aj("PHONE", 2);
        EMAIL_PUBLIC_HASH = new aj("EMAIL_PUBLIC_HASH", 3);
        PHONE_PUBLIC_HASH = new aj("PHONE_PUBLIC_HASH", 4);
        $VALUES = (new aj[] {
            NAME, EMAIL, PHONE, EMAIL_PUBLIC_HASH, PHONE_PUBLIC_HASH
        });
    }
}
