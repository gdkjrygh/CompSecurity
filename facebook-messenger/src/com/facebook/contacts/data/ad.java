// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.contacts.data;


public final class ad extends Enum
{

    private static final ad $VALUES[];
    public static final ad NAME;
    public static final ad PHONE_E164;
    public static final ad PHONE_LOCAL;
    public static final ad PHONE_NATIONAL;

    private ad(String s, int i)
    {
        super(s, i);
    }

    public static ad valueOf(String s)
    {
        return (ad)Enum.valueOf(com/facebook/contacts/data/ad, s);
    }

    public static ad[] values()
    {
        return (ad[])$VALUES.clone();
    }

    static 
    {
        NAME = new ad("NAME", 0);
        PHONE_E164 = new ad("PHONE_E164", 1);
        PHONE_NATIONAL = new ad("PHONE_NATIONAL", 2);
        PHONE_LOCAL = new ad("PHONE_LOCAL", 3);
        $VALUES = (new ad[] {
            NAME, PHONE_E164, PHONE_NATIONAL, PHONE_LOCAL
        });
    }
}
