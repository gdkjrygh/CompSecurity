// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.contacts.data;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteQueryBuilder;
import com.facebook.common.w.k;
import com.facebook.contacts.a.c;
import com.facebook.contacts.models.Contact;
import com.facebook.contacts.models.ContactDetails;
import com.facebook.contacts.server.FetchContactResult;
import com.facebook.fbservice.c.b;
import com.facebook.user.User;
import com.facebook.user.UserKey;
import com.facebook.user.ac;
import com.facebook.user.n;
import com.facebook.user.o;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.google.common.a.es;
import com.google.common.a.et;
import com.google.common.a.ex;
import com.google.common.a.ey;
import com.google.common.a.hq;
import com.google.common.base.Preconditions;
import java.io.IOException;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

// Referenced classes of package com.facebook.contacts.data:
//            b

public class l
{

    private static final Class a = com/facebook/contacts/data/l;
    private static final String f[] = {
        "data"
    };
    private static final String g[] = {
        "fb.indexed_data", "phone.indexed_data"
    };
    private static final String h[] = {
        "fbid", "data"
    };
    private final com.facebook.contacts.data.b b;
    private final ObjectMapper c;
    private final ac d;
    private final c e;

    public l(com.facebook.contacts.data.b b1, ObjectMapper objectmapper, ac ac1, c c1)
    {
        b = b1;
        c = objectmapper;
        d = ac1;
        e = c1;
    }

    private String a(UserKey userkey, String s)
    {
        Object obj = null;
        SQLiteDatabase sqlitedatabase = b.e();
        if (userkey.a() == n.FACEBOOK)
        {
            userkey = sqlitedatabase.query(s, f, "contact_id IN (SELECT cs.contact_id FROM contacts cs, contacts_indexed_data cid WHERE cid.type = ? AND cid.indexed_data = ? AND cs.internal_id = cid.contact_internal_id)", new String[] {
                "profile_fbid", userkey.b()
            }, null, null, null);
        } else
        {
            userkey = sqlitedatabase.query(s, f, "contact_id = ?", new String[] {
                userkey.b()
            }, null, null, null);
        }
        s = obj;
        if (userkey.moveToNext())
        {
            s = userkey.getString(0);
        }
        userkey.close();
        return s;
        s;
        userkey.close();
        throw s;
    }

    private Contact c(UserKey userkey)
    {
        userkey = a(userkey, "contacts");
        if (userkey == null)
        {
            return null;
        } else
        {
            return (Contact)c.readValue(userkey, com/facebook/contacts/models/Contact);
        }
    }

    private ContactDetails d(UserKey userkey)
    {
        userkey = a(userkey, "contact_details");
        if (userkey == null)
        {
            return null;
        } else
        {
            return (ContactDetails)c.readValue(userkey, com/facebook/contacts/models/ContactDetails);
        }
    }

    public FetchContactResult a(UserKey userkey)
    {
        Contact contact;
        boolean flag;
        if (userkey.a() == n.FACEBOOK || userkey.a() == n.FACEBOOK_CONTACT)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        Preconditions.checkArgument(flag);
        contact = c(userkey);
        userkey = d(userkey);
        if (contact != null && userkey != null)
        {
            return new FetchContactResult(b.FROM_CACHE_STALE, System.currentTimeMillis(), contact, userkey);
        } else
        {
            return FetchContactResult.a;
        }
    }

    public es a()
    {
        Object obj;
        et et1;
        obj = b.e().query("ephemeral_data", h, "type = ?", new String[] {
            "last_active"
        }, null, null, null);
        et1 = es.e();
        String s;
        Object obj1;
        for (; ((Cursor) (obj)).moveToNext(); et1.b((new o()).a(n.FACEBOOK, s).a(((com.facebook.user.LastActive) (obj1))).x()))
        {
            s = ((Cursor) (obj)).getString(0);
            obj1 = ((Cursor) (obj)).getString(1);
            obj1 = d.f(c.readTree(((String) (obj1))));
        }

          goto _L1
        IOException ioexception;
        ioexception;
        com.facebook.debug.log.b.e(a, "IOException", ioexception);
        ((Cursor) (obj)).close();
_L3:
        obj = et1.b();
        User user;
        for (Iterator iterator = ((es) (obj)).iterator(); iterator.hasNext(); e.a(user.c(), user.C()))
        {
            user = (User)iterator.next();
        }

        break; /* Loop/switch isn't completed */
_L1:
        ((Cursor) (obj)).close();
        if (true) goto _L3; else goto _L2
        Exception exception;
        exception;
        ((Cursor) (obj)).close();
        throw exception;
_L2:
        return ((es) (obj));
    }

    public ex a(Collection collection)
    {
        Object obj;
        if (collection == null || collection.size() == 0)
        {
            return ex.c();
        }
        obj = ex.j();
        Object obj1 = hq.a();
        java.util.ArrayList arraylist = hq.a();
        for (collection = collection.iterator(); collection.hasNext();)
        {
            UserKey userkey = (UserKey)collection.next();
            if (userkey.a() == n.FACEBOOK)
            {
                ((List) (obj1)).add(userkey.b());
            } else
            {
                arraylist.add(userkey.b());
            }
        }

        collection = new SQLiteQueryBuilder();
        collection.setTables("(SELECT type, contact_internal_id, indexed_data FROM contacts_indexed_data WHERE type = 'profile_fbid') AS fb INNER JOIN (SELECT type, contact_internal_id, indexed_data FROM contacts_indexed_data WHERE type = 'phone_verified') AS phone ON fb.contact_internal_id = phone.contact_internal_id");
        obj1 = (new StringBuilder()).append("fb.contact_internal_id IN (SELECT contact_internal_id FROM contacts_indexed_data WHERE (indexed_data IN ").append(k.b(arraylist)).append(" AND ").append("type = '").append("phone_verified").append("')").append(" OR ").append("(indexed_data IN ").append(k.b(((Iterable) (obj1)))).append(" AND ").append("type = '").append("profile_fbid").append("')").append(")").toString();
        collection = collection.query(b.e(), g, ((String) (obj1)), null, null, null, null, null);
        while (collection.moveToNext()) 
        {
            ((ey) (obj)).a(new UserKey(n.FACEBOOK, collection.getString(0)), new UserKey(n.PHONE_NUMBER, collection.getString(1)));
        }
        break MISSING_BLOCK_LABEL_292;
        obj;
        collection.close();
        throw obj;
        collection.close();
        return ((ey) (obj)).a();
    }

    public es b()
    {
        Cursor cursor;
        et et1;
        cursor = b.e().query("ephemeral_data", h, "type = ?", new String[] {
            "mobile_app_data"
        }, null, null, null);
        et1 = es.e();
        String s;
        Object obj;
        for (; cursor.moveToNext(); et1.b((new o()).a(n.FACEBOOK, s).a(((com.facebook.user.MobileAppData) (obj))).x()))
        {
            s = cursor.getString(0);
            obj = cursor.getString(1);
            obj = d.g(c.readTree(((String) (obj))));
        }

          goto _L1
        IOException ioexception;
        ioexception;
        com.facebook.debug.log.b.e(a, "IOException", ioexception);
        cursor.close();
_L3:
        return et1.b();
_L1:
        cursor.close();
        if (true) goto _L3; else goto _L2
_L2:
        Exception exception;
        exception;
        cursor.close();
        throw exception;
    }

    public ex b(UserKey userkey)
    {
        return a(es.a(userkey));
    }

}
