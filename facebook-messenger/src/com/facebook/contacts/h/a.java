// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.contacts.h;

import android.content.ContentResolver;
import android.net.Uri;
import com.facebook.base.b;
import com.google.common.a.ev;
import com.google.common.a.ew;
import java.util.HashMap;
import java.util.Map;

// Referenced classes of package com.facebook.contacts.h:
//            b

public class a
{

    public static final String a = (new StringBuilder()).append(com.facebook.base.b.b()).append(".provider.ContactsConnectionsProvider").toString();
    public static final String b[] = {
        "_id", "_count", "user_id", "display_name", "sort_name", "user_image_url", "contact_type", "first_name", "last_name", "cell", 
        "other", "search_token"
    };
    public static final Map c = ev.k().b("_id", Integer.valueOf(1)).b("_count", Integer.valueOf(1)).b("user_id", Integer.valueOf(1)).b("display_name", Integer.valueOf(3)).b("sort_name", Integer.valueOf(3)).b("user_image_url", Integer.valueOf(3)).b("contact_type", Integer.valueOf(3)).b("first_name", Integer.valueOf(3)).b("last_name", Integer.valueOf(3)).b("cell", Integer.valueOf(3)).b("other", Integer.valueOf(3)).b("search_token", Integer.valueOf(3)).b();
    public static final Map d;
    public static final Uri e;
    public static final Uri f;
    public static final Uri g;
    public static final Uri h;
    public static final Uri i;
    public static final Uri j;
    public static final Uri k;
    public static final Uri l;
    private static final String m = (new StringBuilder()).append("content://").append(a).append("/").toString();

    public a()
    {
    }

    static String a()
    {
        return m;
    }

    public static void a(ContentResolver contentresolver)
    {
        com.facebook.contacts.h.b ab[] = com.facebook.contacts.h.b.values();
        int j1 = ab.length;
        for (int i1 = 0; i1 < j1; i1++)
        {
            contentresolver.notifyChange(ab[i1].getFullUri(), null);
        }

    }

    static 
    {
        int i1 = 0;
        d = new HashMap();
        for (; i1 < b.length; i1++)
        {
            d.put(b[i1], Integer.valueOf(i1));
        }

        e = b.CONTACTS_CONTENT.getFullUri();
        f = b.CONTACT_ID.getFullUri();
        g = b.FRIENDS_CONTENT.getFullUri();
        h = b.FRIEND_UID.getFullUri();
        i = b.FRIENDS_PREFIX_SEARCH.getFullUri();
        j = b.PAGES_CONTENT.getFullUri();
        k = b.PAGE_ID.getFullUri();
        l = b.PAGES_SEARCH.getFullUri();
    }
}
