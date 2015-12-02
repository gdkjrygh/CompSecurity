// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.contacts.data;

import android.database.Cursor;
import android.database.sqlite.SQLiteQueryBuilder;
import android.net.Uri;

// Referenced classes of package com.facebook.contacts.data:
//            w, FbContactsContentProvider, b, s

class t
    implements w
{

    final FbContactsContentProvider a;

    private t(FbContactsContentProvider fbcontactscontentprovider)
    {
        a = fbcontactscontentprovider;
        super();
    }

    t(FbContactsContentProvider fbcontactscontentprovider, s s)
    {
        this(fbcontactscontentprovider);
    }

    public Cursor a(Uri uri, String as[], String s, String as1[], String s1)
    {
        uri = new SQLiteQueryBuilder();
        uri.setTables(a.a("contacts", as, s, s1));
        uri.setProjectionMap(FbContactsContentProvider.b());
        return uri.query(FbContactsContentProvider.a(a).e(), as, s, as1, null, null, s1);
    }
}
