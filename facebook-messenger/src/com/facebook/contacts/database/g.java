// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.contacts.database;

import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteStatement;
import com.facebook.contacts.data.a;
import com.facebook.contacts.models.Contact;
import com.facebook.contacts.models.e;
import com.facebook.user.User;
import com.facebook.user.n;
import com.facebook.user.o;
import com.google.common.a.es;

public class g
{

    public static final String a;
    private static final Class b = com/facebook/contacts/database/g;
    private static final es e = es.a("c.data");
    private final a c;
    private final e d;

    public g(a a1, e e1)
    {
        c = a1;
        d = e1;
    }

    public static SQLiteStatement a(SQLiteDatabase sqlitedatabase)
    {
        return sqlitedatabase.compileStatement("insert into contacts_indexed_data(contact_internal_id, type, indexed_data) values ((select internal_id from contacts where contact_id = ?), ?, ?)");
    }

    public User a(Contact contact)
    {
        o o1 = new o();
        if (contact.getProfileFbid() != null)
        {
            o1.a(n.FACEBOOK, contact.getProfileFbid());
        } else
        {
            o1.a(n.FACEBOOK_CONTACT, contact.getContactId());
        }
        o1.a(contact.getName()).c(contact.getBigPictureUrl()).b(contact.getSmallPictureUrl()).a(d.a(contact)).b(d.b(contact)).a(contact.getCommunicationRank()).a(contact.getIsMobilePushable());
        return o1.x();
    }

    public User a(String s)
    {
        return a(c.b(s));
    }

    static 
    {
        String s = (new StringBuilder()).append("contacts_indexed_data AS idx1 INNER JOIN (").append("SELECT contact_internal_id FROM contacts_indexed_data WHERE type='can_message'").append(") AS idx2 ON idx1.contact_internal_id = idx2.contact_internal_id").toString();
        a = (new StringBuilder()).append("(").append(s).append(") AS idx INNER JOIN ").append("contacts").append(" AS c ").append("ON idx.contact_internal_id = c.internal_id").toString();
    }
}
