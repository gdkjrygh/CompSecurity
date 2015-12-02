// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.contacts.h;

import android.net.Uri;

// Referenced classes of package com.facebook.contacts.h:
//            a

public final class b extends Enum
{

    private static final b $VALUES[];
    public static final b CONTACTS_CONTENT;
    public static final b CONTACT_ID;
    public static final b FRIENDS_BIRTHDAYS;
    public static final b FRIENDS_CONTENT;
    public static final b FRIENDS_PREFIX_SEARCH;
    public static final b FRIEND_UID;
    public static final b PAGES_CONTENT;
    public static final b PAGES_SEARCH;
    public static final b PAGE_ID;
    public final String category;
    public final String uriMatcherSuffix;
    public final String uriSuffix;

    private b(String s, int i, String s1, String s2, String s3)
    {
        super(s, i);
        category = s1;
        uriSuffix = s2;
        uriMatcherSuffix = s3;
    }

    public static b valueOf(String s)
    {
        return (b)Enum.valueOf(com/facebook/contacts/h/b, s);
    }

    public static b[] values()
    {
        return (b[])$VALUES.clone();
    }

    public Uri getFullUri()
    {
        return Uri.parse((new StringBuilder()).append(a.a()).append(category).append(uriSuffix).toString());
    }

    public String getMatcherPartialUri()
    {
        return (new StringBuilder()).append(category).append(uriSuffix).append(uriMatcherSuffix).toString();
    }

    public int uriMatcherIndex()
    {
        return ordinal() + 1;
    }

    static 
    {
        CONTACTS_CONTENT = new b("CONTACTS_CONTENT", 0, "all_contacts", "", "");
        CONTACT_ID = new b("CONTACT_ID", 1, "all_contacts", "/id", "/#");
        FRIENDS_CONTENT = new b("FRIENDS_CONTENT", 2, "friends", "", "");
        FRIEND_UID = new b("FRIEND_UID", 3, "friends", "/uid", "/#");
        FRIENDS_PREFIX_SEARCH = new b("FRIENDS_PREFIX_SEARCH", 4, "friends", "/search", "/*");
        FRIENDS_BIRTHDAYS = new b("FRIENDS_BIRTHDAYS", 5, "friends", "/birthdays", "");
        PAGES_CONTENT = new b("PAGES_CONTENT", 6, "pages", "", "");
        PAGE_ID = new b("PAGE_ID", 7, "pages", "/id", "/#");
        PAGES_SEARCH = new b("PAGES_SEARCH", 8, "pages", "/search", "/*");
        $VALUES = (new b[] {
            CONTACTS_CONTENT, CONTACT_ID, FRIENDS_CONTENT, FRIEND_UID, FRIENDS_PREFIX_SEARCH, FRIENDS_BIRTHDAYS, PAGES_CONTENT, PAGE_ID, PAGES_SEARCH
        });
    }
}
