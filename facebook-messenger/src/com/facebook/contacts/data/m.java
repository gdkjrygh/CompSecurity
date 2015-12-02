// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.contacts.data;

import android.content.ContentValues;
import android.database.SQLException;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteStatement;
import com.facebook.common.v.f;
import com.facebook.common.w.k;
import com.facebook.contacts.database.g;
import com.facebook.contacts.models.Contact;
import com.facebook.contacts.models.ContactDetails;
import com.facebook.contacts.models.ContactPhone;
import com.facebook.contacts.models.a.a;
import com.facebook.debug.d.e;
import com.facebook.debug.log.b;
import com.facebook.phonenumbers.NumberParseException;
import com.facebook.phonenumbers.PhoneNumberUtil;
import com.facebook.user.Name;
import com.facebook.user.User;
import com.facebook.user.a.l;
import com.facebook.user.a.n;
import com.facebook.user.ac;
import com.fasterxml.jackson.databind.node.ObjectNode;
import com.google.common.a.em;
import com.google.common.a.es;
import com.google.common.a.et;
import com.google.common.a.ex;
import com.google.common.a.fi;
import com.google.common.a.fk;
import com.google.common.base.Preconditions;
import java.io.IOException;
import java.util.Collection;
import java.util.Iterator;

// Referenced classes of package com.facebook.contacts.data:
//            a, n, b, o, 
//            i, k

public class m
{

    private static final Class a = com/facebook/contacts/data/m;
    private final com.facebook.contacts.data.b b;
    private final com.facebook.contacts.data.a c;
    private final ac d;
    private final javax.inject.a e;
    private final l f;
    private final n g;
    private final com.facebook.contacts.data.k h;
    private final PhoneNumberUtil i;
    private final com.facebook.contacts.data.a.b j;
    private final com.facebook.common.time.a k;
    private final f l;

    public m(com.facebook.contacts.data.b b1, com.facebook.contacts.data.a a1, ac ac1, javax.inject.a a2, l l1, n n1, com.facebook.contacts.data.k k1, 
            PhoneNumberUtil phonenumberutil, com.facebook.contacts.data.a.b b2, com.facebook.common.time.a a3, f f1)
    {
        b = b1;
        c = a1;
        d = ac1;
        e = a2;
        f = l1;
        g = n1;
        h = k1;
        i = phonenumberutil;
        j = b2;
        k = a3;
        l = f1;
    }

    private long a(SQLiteDatabase sqlitedatabase, Contact contact)
    {
        sqlitedatabase = sqlitedatabase.compileStatement("INSERT OR REPLACE INTO contacts (internal_id, contact_id, data) VALUES ((select internal_id from contacts where contact_id = ?), ?, ?)");
        long l1;
        sqlitedatabase.bindString(1, contact.getContactId());
        sqlitedatabase.bindString(2, contact.getContactId());
        sqlitedatabase.bindString(3, c.a(contact));
        l1 = sqlitedatabase.executeInsert();
        sqlitedatabase.close();
        return l1;
        contact;
        sqlitedatabase.close();
        throw contact;
    }

    private ContentValues a(String s, Boolean boolean1)
    {
        ContentValues contentvalues = new ContentValues(2);
        contentvalues.put("type", s);
        contentvalues.put("indexed_data", boolean1);
        return contentvalues;
    }

    private ContentValues a(String s, Float float1)
    {
        ContentValues contentvalues = new ContentValues(2);
        contentvalues.put("type", s);
        contentvalues.put("indexed_data", float1);
        return contentvalues;
    }

    private ContentValues a(String s, String s1)
    {
        ContentValues contentvalues = new ContentValues(2);
        contentvalues.put("type", s);
        contentvalues.put("indexed_data", s1);
        return contentvalues;
    }

    private void a(ContentValues contentvalues, com.facebook.phonenumbers.Phonenumber.PhoneNumber phonenumber, et et1)
    {
        Object obj = new ContentValues();
        ((ContentValues) (obj)).put("type", "phone_e164");
        ((ContentValues) (obj)).putAll(contentvalues);
        ((ContentValues) (obj)).put("indexed_data", i.format(phonenumber, com.facebook.phonenumbers.PhoneNumberUtil.PhoneNumberFormat.E164));
        et1.b(obj);
        obj = i.getNationalSignificantNumber(phonenumber);
        ContentValues contentvalues1 = new ContentValues();
        contentvalues1.put("type", "phone_national");
        contentvalues1.putAll(contentvalues);
        contentvalues1.put("indexed_data", ((String) (obj)));
        et1.b(contentvalues1);
        int i1 = i.getLengthOfGeographicalAreaCode(phonenumber);
        if (i1 > 0)
        {
            phonenumber = ((String) (obj)).substring(i1);
            obj = new ContentValues();
            ((ContentValues) (obj)).put("type", "phone_local");
            ((ContentValues) (obj)).putAll(contentvalues);
            ((ContentValues) (obj)).put("indexed_data", phonenumber);
            et1.b(obj);
        }
    }

    static void a(SQLiteStatement sqlitestatement, ContentValues contentvalues)
    {
        b(sqlitestatement, contentvalues);
    }

    private void a(com.facebook.contacts.data.n n1, String s, Name name)
    {
        if (name == null || name.getDisplayName() == null)
        {
            return;
        } else
        {
            fk fk1 = fi.e();
            a(name, fk1);
            String as[] = (String[])fk1.b().toArray(new String[0]);
            n1.a(s, name.getDisplayName(), as, as.length, f.a(0));
            return;
        }
    }

    private void a(Name name, fk fk1)
    {
        Preconditions.checkNotNull(name);
        Preconditions.checkNotNull(fk1);
        String as[] = new String[10];
        int j1 = f.a(as, name.f());
        for (int i1 = 0; i1 < j1; i1++)
        {
            fk1.b(as[i1]);
        }

        if (name.b())
        {
            fk1.b(name.getLastName());
        }
        if (name.a())
        {
            fk1.b(name.getFirstName());
        }
    }

    private void a(ex ex1, et et1)
    {
        java.util.Map.Entry entry;
        ContentValues contentvalues;
        for (ex1 = ex1.n().iterator(); ex1.hasNext(); a(contentvalues, (com.facebook.phonenumbers.Phonenumber.PhoneNumber)entry.getValue(), et1))
        {
            entry = (java.util.Map.Entry)ex1.next();
            contentvalues = new ContentValues();
            contentvalues.put("contact_id", (String)entry.getKey());
        }

    }

    private void a(String s, int i1)
    {
        SQLiteDatabase sqlitedatabase = b.e();
        ContentValues contentvalues = new ContentValues();
        contentvalues.put("fbid", s);
        contentvalues.put("display_order", Integer.valueOf(i1));
        sqlitedatabase.replaceOrThrow("favorite_contacts", "", contentvalues);
    }

    private void a(String s, String s1, String s2)
    {
        ContentValues contentvalues = new ContentValues();
        contentvalues.put("fbid", s);
        contentvalues.put("type", s1);
        contentvalues.put("data", s2);
        b.e().replaceOrThrow("ephemeral_data", null, contentvalues);
    }

    private static void b(SQLiteStatement sqlitestatement, ContentValues contentvalues)
    {
        sqlitestatement.bindString(1, contentvalues.getAsString("contact_id"));
        sqlitestatement.bindString(2, contentvalues.getAsString("type"));
        sqlitestatement.bindString(3, contentvalues.getAsString("indexed_data"));
        sqlitestatement.execute();
    }

    public void a(Contact contact)
    {
        a(contact, ((ContactDetails) (null)));
    }

    public void a(Contact contact, ContactDetails contactdetails)
    {
        Preconditions.checkNotNull(contact);
        e e1 = com.facebook.debug.d.e.a((new StringBuilder()).append("insertContactIntoDatabase (").append(contact.getContactId()).append(")").toString());
        float f1;
        Object obj;
        Object obj1;
        Object obj2;
        et et1;
        NumberParseException numberparseexception;
        boolean flag;
        long l1;
        if (contactdetails != null)
        {
            obj = new ContentValues();
            ((ContentValues) (obj)).put("contact_id", contactdetails.getContactId());
            ((ContentValues) (obj)).put("data", c.a(contactdetails));
        } else
        {
            obj = null;
        }
        et1 = es.e();
        if (contact.getCanMessage() && !contact.getIsMemorialized() || contact.getContactProfileType() == a.PAGE)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        if (!flag) goto _L2; else goto _L1
_L1:
        et1.b(a("contact_profile_type", contact.getContactProfileType().toString()));
        if (contact.getName() != null && contact.getName().getDisplayName() != null)
        {
            obj2 = contact.getName().getDisplayName().toString();
            contactdetails = "";
            obj1 = contact.getPhoneticName();
            if (obj1 != null)
            {
                contactdetails = ((Name) (obj1)).f().toString();
            }
            obj1 = contactdetails;
            if (contactdetails.length() < 1)
            {
                obj1 = obj2;
            }
            et1.b(a("sort_name_key", g.a(((String) (obj1)))));
        }
        contactdetails = contact.getProfileFbid();
        if (contactdetails != null)
        {
            et1.b(a("profile_fbid", ((String) (contactdetails))));
        }
        f1 = contact.getCommunicationRank();
        if (f1 > 0.0F)
        {
            et1.b(a("communication_rank", Float.valueOf(f1)));
        }
        contactdetails = new ContentValues();
        obj1 = contact.getPhones().iterator();
_L3:
        if (!((Iterator) (obj1)).hasNext())
        {
            break; /* Loop/switch isn't completed */
        }
        obj2 = (ContactPhone)((Iterator) (obj1)).next();
        a(((ContentValues) (contactdetails)), i.parse(((ContactPhone) (obj2)).getUniversalNumber(), null), et1);
        if (((ContactPhone) (obj2)).getIsVerified())
        {
            et1.b(a("phone_verified", ((ContactPhone) (obj2)).getUniversalNumber()));
        }
        continue; /* Loop/switch isn't completed */
        numberparseexception;
        com.facebook.debug.log.b.e(a, (new StringBuilder()).append("Error parsing invalid E.164 number: ").append(((ContactPhone) (obj2)).getUniversalNumber()).append(" Error: ").append(numberparseexception).toString());
        if (true) goto _L3; else goto _L2
_L2:
        if (j.a(contact))
        {
            et1.b(a("can_message", Boolean.valueOf(true)));
        }
        contactdetails = b.e();
        contactdetails.beginTransaction();
        l1 = a(((SQLiteDatabase) (contactdetails)), contact);
        if (obj == null)
        {
            break MISSING_BLOCK_LABEL_486;
        }
        contactdetails.replaceOrThrow("contact_details", null, ((ContentValues) (obj)));
        contactdetails.delete("contacts_indexed_data", "contact_internal_id = ?", new String[] {
            String.valueOf(l1)
        });
        if (!flag)
        {
            break MISSING_BLOCK_LABEL_578;
        }
        obj = (com.facebook.contacts.data.n)e.b();
        ((com.facebook.contacts.data.n) (obj)).a(contact.getContactId());
        a(((com.facebook.contacts.data.n) (obj)), contact.getContactId(), contact.getName());
        a(((com.facebook.contacts.data.n) (obj)), contact.getContactId(), contact.getPhoneticName());
        ((com.facebook.contacts.data.n) (obj)).a(contact.getContactId(), contact.getNameSearchTokens());
        for (contact = et1.b().iterator(); contact.hasNext(); contactdetails.insertOrThrow("contacts_indexed_data", null, ((ContentValues) (obj))))
        {
            obj = (ContentValues)contact.next();
            com.facebook.debug.log.b.a(a, (new StringBuilder()).append("Inserting data lookup: ").append(obj).toString());
            ((ContentValues) (obj)).put("contact_internal_id", Long.valueOf(l1));
        }

        break MISSING_BLOCK_LABEL_668;
        contact;
        contactdetails.endTransaction();
        throw contact;
        contactdetails.setTransactionSuccessful();
        contactdetails.endTransaction();
        e1.a();
        return;
    }

    public void a(em em1)
    {
        SQLiteDatabase sqlitedatabase;
        String s;
        if (em1.isEmpty())
        {
            return;
        }
        l.c();
        sqlitedatabase = b.e();
        em1 = (new StringBuilder()).append("contact_id IN ").append(com.facebook.common.w.k.b(em1)).toString();
        s = (new StringBuilder()).append("contact_internal_id in (select internal_id from contacts where ").append(em1).append(")").toString();
        sqlitedatabase.beginTransaction();
        sqlitedatabase.delete("contacts_indexed_data", s, null);
        sqlitedatabase.delete("contact_details", em1, null);
        sqlitedatabase.delete("contacts", em1, null);
        sqlitedatabase.setTransactionSuccessful();
        sqlitedatabase.endTransaction();
        return;
        em1;
        sqlitedatabase.endTransaction();
        throw em1;
    }

    public void a(em em1, o o1)
    {
        SQLiteDatabase sqlitedatabase;
        e e1;
        if (em1.isEmpty())
        {
            return;
        }
        e1 = com.facebook.debug.d.e.a((new StringBuilder()).append("insertContactsIntoDatabase (").append(em1.size()).append(" contacts)").toString());
        sqlitedatabase = b.e();
        sqlitedatabase.beginTransaction();
        if (o1 == o.REPLACE_ALL)
        {
            l.c();
            sqlitedatabase.delete("contacts", null, null);
            sqlitedatabase.delete("contact_details", null, null);
            sqlitedatabase.delete("contacts_indexed_data", null, null);
        }
        for (em1 = em1.iterator(); em1.hasNext(); a(((Contact) (o1))))
        {
            o1 = (Contact)em1.next();
            l.c();
        }

        break MISSING_BLOCK_LABEL_144;
        em1;
        sqlitedatabase.endTransaction();
        throw em1;
        sqlitedatabase.setTransactionSuccessful();
        sqlitedatabase.endTransaction();
        e1.a();
        return;
    }

    public void a(es es1)
    {
        SQLiteDatabase sqlitedatabase;
        sqlitedatabase = b.e();
        sqlitedatabase.beginTransaction();
        sqlitedatabase.delete("ephemeral_data", "type = ?", new String[] {
            "last_active"
        });
        User user;
        for (es1 = es1.iterator(); es1.hasNext(); a(user.b(), "last_active", d.a(user.C()).toString()))
        {
            user = (User)es1.next();
        }

        break MISSING_BLOCK_LABEL_105;
        es1;
        com.facebook.debug.log.b.e(a, "SQLException", es1);
        throw es1;
        es1;
        sqlitedatabase.endTransaction();
        throw es1;
        sqlitedatabase.setTransactionSuccessful();
        sqlitedatabase.endTransaction();
        return;
        es1;
        com.facebook.debug.log.b.e(a, "IOException", es1);
        sqlitedatabase.endTransaction();
        return;
    }

    public void a(ex ex1)
    {
        Object obj1;
        obj1 = es.e();
        a(ex1, ((et) (obj1)));
        l.c();
        ex1 = b.e();
        ex1.beginTransaction();
        Object obj = com.facebook.contacts.database.g.a(ex1);
        ContentValues contentvalues;
        for (obj1 = ((et) (obj1)).b().iterator(); ((Iterator) (obj1)).hasNext(); b(((SQLiteStatement) (obj)), contentvalues))
        {
            contentvalues = (ContentValues)((Iterator) (obj1)).next();
            com.facebook.debug.log.b.b(a, (new StringBuilder()).append("Inserting phone lookup: ").append(contentvalues).toString());
        }

        break MISSING_BLOCK_LABEL_112;
        Exception exception;
        exception;
        ((SQLiteStatement) (obj)).close();
        throw exception;
        obj;
        ex1.endTransaction();
        throw obj;
        ((SQLiteStatement) (obj)).close();
        ex1.setTransactionSuccessful();
        ex1.endTransaction();
        return;
    }

    public void a(Collection collection)
    {
        SQLiteDatabase sqlitedatabase;
        sqlitedatabase = b.e();
        sqlitedatabase.beginTransaction();
        Iterator iterator;
        sqlitedatabase.delete("favorite_contacts", null, null);
        iterator = collection.iterator();
        int i1 = 0;
_L2:
        if (!iterator.hasNext())
        {
            break; /* Loop/switch isn't completed */
        }
        a(((User)iterator.next()).b(), i1);
        i1++;
        if (true) goto _L2; else goto _L1
_L1:
        h.a(i.c, collection.size());
        h.b(i.d, k.a());
        sqlitedatabase.setTransactionSuccessful();
        sqlitedatabase.endTransaction();
        return;
        collection;
        com.facebook.debug.log.b.d(a, "SQLException", collection);
        throw collection;
        collection;
        sqlitedatabase.endTransaction();
        throw collection;
    }

    public void b(es es1)
    {
        SQLiteDatabase sqlitedatabase;
        sqlitedatabase = b.e();
        sqlitedatabase.beginTransaction();
        sqlitedatabase.delete("ephemeral_data", "type = ?", new String[] {
            "mobile_app_data"
        });
        User user;
        for (es1 = es1.iterator(); es1.hasNext(); a(user.b(), "mobile_app_data", d.a(user.D()).toString()))
        {
            user = (User)es1.next();
        }

        break MISSING_BLOCK_LABEL_105;
        es1;
        com.facebook.debug.log.b.e(a, "SQLException", es1);
        throw es1;
        es1;
        sqlitedatabase.endTransaction();
        throw es1;
        sqlitedatabase.setTransactionSuccessful();
        sqlitedatabase.endTransaction();
        return;
        es1;
        com.facebook.debug.log.b.e(a, "IOException", es1);
        sqlitedatabase.endTransaction();
        return;
    }

}
