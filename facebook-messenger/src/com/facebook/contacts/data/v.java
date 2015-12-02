// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.contacts.data;

import android.database.Cursor;
import android.database.sqlite.SQLiteQueryBuilder;
import android.net.Uri;
import com.facebook.base.e;
import com.facebook.base.g;
import com.facebook.common.w.k;
import com.facebook.common.w.n;
import com.google.common.a.ev;
import com.google.common.a.fi;
import com.google.common.a.hq;
import com.google.common.base.CharMatcher;
import com.google.common.base.Joiner;
import java.util.Iterator;
import java.util.List;

// Referenced classes of package com.facebook.contacts.data:
//            w, ab, ad, FbContactsContentProvider, 
//            x, ac, b, s

class v
    implements w
{

    final FbContactsContentProvider a;

    private v(FbContactsContentProvider fbcontactscontentprovider)
    {
        a = fbcontactscontentprovider;
        super();
    }

    v(FbContactsContentProvider fbcontactscontentprovider, s s)
    {
        this(fbcontactscontentprovider);
    }

    private String a(ab ab1)
    {
        if (n.c(ab1.a))
        {
            return "contacts";
        }
        java.util.ArrayList arraylist = hq.a();
        if (ab1.b.contains(ad.NAME))
        {
            String s = FbContactsContentProvider.c(a).a(ab1.a);
            if (s.length() > 0)
            {
                StringBuilder stringbuilder = new StringBuilder();
                stringbuilder.append("SELECT DISTINCT c.internal_id FROM contacts AS c ");
                stringbuilder.append("JOIN contacts_indexed_data AS idx ON (");
                stringbuilder.append("idx.contact_internal_id = c.internal_id AND ");
                stringbuilder.append("idx.type = 'name' AND idx.indexed_data GLOB '");
                stringbuilder.append(s);
                stringbuilder.append("*') ");
                arraylist.add(stringbuilder.toString());
            }
        }
        java.util.ArrayList arraylist1 = hq.a();
        Iterator iterator = ab1.b.iterator();
        do
        {
            if (!iterator.hasNext())
            {
                break;
            }
            Object obj = (ad)iterator.next();
            obj = (String)FbContactsContentProvider.d().get(obj);
            if (obj != null)
            {
                arraylist1.add(obj);
            }
        } while (true);
        if (!arraylist1.isEmpty())
        {
            ab1 = com.facebook.contacts.data.FbContactsContentProvider.e().retainFrom(e.a(ab1.a, g.NFKC));
            if (ab1.length() > 0)
            {
                StringBuilder stringbuilder1 = new StringBuilder();
                stringbuilder1.append("SELECT DISTINCT c.internal_id FROM contacts AS c ");
                stringbuilder1.append("JOIN contacts_indexed_data AS idx ON (");
                stringbuilder1.append("idx.contact_internal_id = c.internal_id AND ");
                stringbuilder1.append("idx.type IN ");
                stringbuilder1.append(k.b(arraylist1));
                stringbuilder1.append(" AND idx.indexed_data GLOB '");
                stringbuilder1.append(ab1);
                stringbuilder1.append("*') ");
                arraylist.add(stringbuilder1.toString());
            }
        }
        ab1 = new StringBuilder();
        ab1.append("SELECT internal_id, contact_id, data ");
        ab1.append("FROM contacts WHERE internal_id IN (");
        ab1.append(Joiner.on(" UNION ").join(arraylist));
        ab1.append(")");
        return ab1.toString();
    }

    public Cursor a(Uri uri, String as[], String s, String as1[], String s1)
    {
        uri = a(FbContactsContentProvider.b(a).e.a(uri));
        SQLiteQueryBuilder sqlitequerybuilder = new SQLiteQueryBuilder();
        sqlitequerybuilder.setTables(a.a((new StringBuilder()).append("(").append(uri).append(")").toString(), as, s, s1));
        sqlitequerybuilder.setProjectionMap(FbContactsContentProvider.b());
        return sqlitequerybuilder.query(FbContactsContentProvider.a(a).e(), as, s, as1, null, null, s1);
    }
}
