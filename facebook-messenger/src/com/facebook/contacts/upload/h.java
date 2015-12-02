// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.contacts.upload;


final class h extends Enum
{

    private static final h $VALUES[];
    public static final h LOCAL_CONTACT_IDS;
    public static final h REMOTE_CONTACT_IDS;

    private h(String s, int i)
    {
        super(s, i);
    }

    public static h valueOf(String s)
    {
        return (h)Enum.valueOf(com/facebook/contacts/upload/h, s);
    }

    public static h[] values()
    {
        return (h[])$VALUES.clone();
    }

    static 
    {
        LOCAL_CONTACT_IDS = new h("LOCAL_CONTACT_IDS", 0);
        REMOTE_CONTACT_IDS = new h("REMOTE_CONTACT_IDS", 1);
        $VALUES = (new h[] {
            LOCAL_CONTACT_IDS, REMOTE_CONTACT_IDS
        });
    }
}
