// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.contacts.data;

import android.content.ContentValues;
import android.content.UriMatcher;
import android.database.Cursor;
import android.net.Uri;
import com.facebook.c.r;
import com.facebook.common.w.n;
import com.facebook.d.b.a;
import com.facebook.debug.d.e;
import com.facebook.debug.log.b;
import com.facebook.inject.t;
import com.google.common.a.ev;
import com.google.common.a.ew;
import com.google.common.a.fi;
import com.google.common.a.kl;
import com.google.common.base.CharMatcher;
import java.util.Iterator;
import java.util.Set;

// Referenced classes of package com.facebook.contacts.data:
//            ad, w, b, x, 
//            t, u, v

public class FbContactsContentProvider extends r
{

    private static final Class a = com/facebook/contacts/data/FbContactsContentProvider;
    private static final ev b = ev.k().b("_id", "internal_id").b("fbid", "fbid").b("type", "type").b("communication_rank", "communication_rank").b("sort_name_key", "sort_name_key").b("data", "data").b();
    private static final ev c = ev.k().b("fbid", "fbid").b("display_order", "display_order").b();
    private static final ev d;
    private static final CharMatcher e = CharMatcher.anyOf("0123456789+");
    private com.facebook.contacts.data.b f;
    private com.facebook.user.a.n g;
    private x h;
    private UriMatcher i;
    private com.facebook.contacts.data.t j;
    private u k;
    private v l;

    public FbContactsContentProvider()
    {
    }

    static com.facebook.contacts.data.b a(FbContactsContentProvider fbcontactscontentprovider)
    {
        return fbcontactscontentprovider.f;
    }

    private void a(String s, String s1, StringBuilder stringbuilder, StringBuilder stringbuilder1)
    {
        if ("_id".equals(s1))
        {
            return;
        }
        if ("data".equals(s1))
        {
            stringbuilder.append(", c.data AS data");
            return;
        }
        if ("fbid".equals(s1))
        {
            a(stringbuilder, "fbid");
            a(stringbuilder1, s, "fbid", "profile_fbid");
            return;
        }
        if ("type".equals(s1))
        {
            a(stringbuilder, "type");
            a(stringbuilder1, s, "type", "contact_profile_type");
            return;
        }
        if ("communication_rank".equals(s1))
        {
            a(stringbuilder, "communication_rank");
            a(stringbuilder1, s, "communication_rank", "communication_rank");
            return;
        }
        if ("sort_name_key".equals(s1))
        {
            a(stringbuilder, "sort_name_key");
            a(stringbuilder1, s, "sort_name_key", "sort_name_key");
            return;
        } else
        {
            throw new IllegalArgumentException((new StringBuilder()).append("Unknown field: ").append(s1).toString());
        }
    }

    private void a(StringBuilder stringbuilder, String s)
    {
        stringbuilder.append(", idx_").append(s).append(".indexed_data AS ").append(s);
    }

    private void a(StringBuilder stringbuilder, String s, String s1, String s2)
    {
        stringbuilder.append(s).append(" contacts_indexed_data AS idx_").append(s1).append(" ON (").append("idx_").append(s1).append(".contact_internal_id = c.internal_id ").append("AND idx_").append(s1).append(".type = '").append(s2).append("') ");
    }

    static x b(FbContactsContentProvider fbcontactscontentprovider)
    {
        return fbcontactscontentprovider.h;
    }

    static ev b()
    {
        return b;
    }

    static com.facebook.user.a.n c(FbContactsContentProvider fbcontactscontentprovider)
    {
        return fbcontactscontentprovider.g;
    }

    static ev c()
    {
        return c;
    }

    static ev d()
    {
        return d;
    }

    static CharMatcher e()
    {
        return e;
    }

    protected int a(Uri uri, ContentValues contentvalues, String s, String as[])
    {
        return 0;
    }

    protected int a(Uri uri, String s, String as[])
    {
        return 0;
    }

    protected Cursor a(Uri uri, String as[], String s, String as1[], String s1)
    {
        e e1 = com.facebook.debug.d.e.a("FbContactsContentProvider.doQuery");
        i.match(uri);
        JVM INSTR tableswitch 1 3: default 165
    //                   1 97
    //                   2 147
    //                   3 156;
           goto _L1 _L2 _L3 _L4
_L4:
        break MISSING_BLOCK_LABEL_156;
_L1:
        throw new IllegalArgumentException((new StringBuilder()).append("Unknown URL ").append(uri).toString());
        uri;
        long l1 = e1.a();
        com.facebook.debug.log.b.b(a, "FbContactsContentProvider.doQuery took %d ms", new Object[] {
            Long.valueOf(l1)
        });
        throw uri;
_L2:
        Object obj = j;
_L5:
        uri = ((w) (obj)).a(uri, as, s, as1, s1);
        long l2 = e1.a();
        com.facebook.debug.log.b.b(a, "FbContactsContentProvider.doQuery took %d ms", new Object[] {
            Long.valueOf(l2)
        });
        return uri;
_L3:
        obj = k;
          goto _L5
        obj = l;
          goto _L5
    }

    protected Uri a(Uri uri, ContentValues contentvalues)
    {
        return null;
    }

    protected String a(Uri uri)
    {
        return null;
    }

    String a(String s, String as[], String s1, String s2)
    {
        as = kl.a(as);
        java.util.HashSet hashset = kl.a();
        s1 = n.a(s1);
        s2 = n.a(s2);
        Iterator iterator = b.i_().iterator();
        do
        {
            if (!iterator.hasNext())
            {
                break;
            }
            String s3 = (String)iterator.next();
            if (s1.contains(s3))
            {
                hashset.add(s3);
            } else
            if (s2.contains(s3))
            {
                as.add(s3);
            }
        } while (true);
        as.removeAll(hashset);
        s1 = new StringBuilder();
        s2 = new StringBuilder();
        s1.append("c.internal_id AS _id");
        s2.append((new StringBuilder()).append(s).append(" AS c ").toString());
        for (s = hashset.iterator(); s.hasNext(); a("INNER JOIN", (String)s.next(), ((StringBuilder) (s1)), ((StringBuilder) (s2)))) { }
        for (s = as.iterator(); s.hasNext(); a("LEFT OUTER JOIN", (String)s.next(), ((StringBuilder) (s1)), ((StringBuilder) (s2)))) { }
        return (new StringBuilder()).append("(SELECT ").append(s1.toString()).append(" FROM ").append(s2.toString()).append(")").toString();
    }

    protected void a()
    {
        this;
        JVM INSTR monitorenter ;
        e e1 = com.facebook.debug.d.e.a("ContactsContentProvider.onInitialize");
        t t1 = t.a(getContext());
        ((a)t1.a(com/facebook/d/b/a)).b("contacts");
        f = (com.facebook.contacts.data.b)t1.a(com/facebook/contacts/data/b);
        g = (com.facebook.user.a.n)t1.a(com/facebook/user/a/n);
        h = (x)t1.a(com/facebook/contacts/data/x);
        i = new UriMatcher(-1);
        i.addURI(h.a, "contacts_with_fbids", 1);
        i.addURI(h.a, "favorites", 2);
        i.addURI(h.a, "search", 3);
        i.addURI(h.a, "search/", 3);
        i.addURI(h.a, "search/*", 3);
        i.addURI(h.a, "search/*/*", 3);
        j = new com.facebook.contacts.data.t(this, null);
        k = new u(this, null);
        l = new v(this, null);
        e1.a();
        this;
        JVM INSTR monitorexit ;
        return;
        Exception exception;
        exception;
        throw exception;
    }

    static 
    {
        d = ev.k().b(ad.PHONE_LOCAL, "phone_local").b(ad.PHONE_NATIONAL, "phone_national").b(ad.PHONE_E164, "phone_e164").b();
    }
}
