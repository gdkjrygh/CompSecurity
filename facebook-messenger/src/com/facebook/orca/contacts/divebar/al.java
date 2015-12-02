// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.orca.contacts.divebar;


public final class al extends Enum
{

    private static final al $VALUES[];
    public static final al FAVORITE_FRIENDS;
    public static final al MOBILE_FRIENDS;
    public static final al ONLINE_FRIENDS;
    public static final al OTHER_CONTACTS;
    public static final al TOP_FRIENDS;
    public static final al TOP_GROUPS;

    private al(String s, int i)
    {
        super(s, i);
    }

    public static al valueOf(String s)
    {
        return (al)Enum.valueOf(com/facebook/orca/contacts/divebar/al, s);
    }

    public static al[] values()
    {
        return (al[])$VALUES.clone();
    }

    static 
    {
        FAVORITE_FRIENDS = new al("FAVORITE_FRIENDS", 0);
        TOP_FRIENDS = new al("TOP_FRIENDS", 1);
        ONLINE_FRIENDS = new al("ONLINE_FRIENDS", 2);
        MOBILE_FRIENDS = new al("MOBILE_FRIENDS", 3);
        OTHER_CONTACTS = new al("OTHER_CONTACTS", 4);
        TOP_GROUPS = new al("TOP_GROUPS", 5);
        $VALUES = (new al[] {
            FAVORITE_FRIENDS, TOP_FRIENDS, ONLINE_FRIENDS, MOBILE_FRIENDS, OTHER_CONTACTS, TOP_GROUPS
        });
    }
}
