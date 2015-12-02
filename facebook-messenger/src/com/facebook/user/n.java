// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.user;


public final class n extends Enum
{

    private static final n $VALUES[];
    public static final n ADDRESS_BOOK;
    public static final n EMAIL;
    public static final n FACEBOOK;
    public static final n FACEBOOK_CONTACT;
    public static final n FACEBOOK_OBJECT;
    public static final n PHONE_NUMBER;

    private n(String s, int i)
    {
        super(s, i);
    }

    public static n valueOf(String s)
    {
        return (n)Enum.valueOf(com/facebook/user/n, s);
    }

    public static n[] values()
    {
        return (n[])$VALUES.clone();
    }

    static 
    {
        FACEBOOK = new n("FACEBOOK", 0);
        ADDRESS_BOOK = new n("ADDRESS_BOOK", 1);
        PHONE_NUMBER = new n("PHONE_NUMBER", 2);
        FACEBOOK_OBJECT = new n("FACEBOOK_OBJECT", 3);
        EMAIL = new n("EMAIL", 4);
        FACEBOOK_CONTACT = new n("FACEBOOK_CONTACT", 5);
        $VALUES = (new n[] {
            FACEBOOK, ADDRESS_BOOK, PHONE_NUMBER, FACEBOOK_OBJECT, EMAIL, FACEBOOK_CONTACT
        });
    }
}
