// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.contacts.models.a;

import com.google.common.a.es;

public final class a extends Enum
{

    private static final a $VALUES[];
    public static es ALL_TYPES;
    public static es CONNECTIONS_TYPES;
    public static es FACEBOOK_FRIENDS_TYPES;
    public static es MESSAGABLE_TYPES;
    public static final a PAGE;
    public static es PAGES_TYPES;
    public static final a UNMATCHED;
    public static final a USER;

    private a(String s, int i)
    {
        super(s, i);
    }

    public static a valueOf(String s)
    {
        return (a)Enum.valueOf(com/facebook/contacts/models/a/a, s);
    }

    public static a[] values()
    {
        return (a[])$VALUES.clone();
    }

    static 
    {
        USER = new a("USER", 0);
        UNMATCHED = new a("UNMATCHED", 1);
        PAGE = new a("PAGE", 2);
        $VALUES = (new a[] {
            USER, UNMATCHED, PAGE
        });
        ALL_TYPES = es.a(USER, UNMATCHED, PAGE);
        CONNECTIONS_TYPES = es.a(USER, PAGE);
        MESSAGABLE_TYPES = es.a(USER, UNMATCHED);
        FACEBOOK_FRIENDS_TYPES = es.a(USER);
        PAGES_TYPES = es.a(PAGE);
    }
}
