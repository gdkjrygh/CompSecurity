// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.contacts.data;

import android.database.sqlite.SQLiteDatabase;
import com.facebook.d.d.d;
import com.facebook.debug.log.b;
import com.google.common.a.es;
import com.google.common.a.et;

public class c extends d
{

    public static final es a = es.e().b("phone_e164").b("phone_national").b("phone_local").b();
    private static final Class b = com/facebook/contacts/data/c;

    public c()
    {
        super("contacts", 38);
    }

    protected void a(SQLiteDatabase sqlitedatabase)
    {
        sqlitedatabase.execSQL("CREATE TABLE contacts_db_properties (key TEXT PRIMARY KEY, value TEXT)");
        sqlitedatabase.execSQL("CREATE TABLE contacts (internal_id INTEGER PRIMARY KEY AUTOINCREMENT, contact_id TEXT UNIQUE, data TEXT )");
        sqlitedatabase.execSQL("CREATE TABLE contact_details (contact_id TEXT PRIMARY KEY, data TEXT )");
        sqlitedatabase.execSQL("CREATE TABLE contacts_indexed_data (type TEXT, contact_internal_id INTEGER, indexed_data TEXT )");
        sqlitedatabase.execSQL("CREATE INDEX contacts_type_index ON contacts_indexed_data ( type, contact_internal_id );");
        sqlitedatabase.execSQL("CREATE INDEX contacts_data_index ON contacts_indexed_data ( type, indexed_data );");
        sqlitedatabase.execSQL("CREATE TABLE ephemeral_data (fbid TEXT PRIMARY KEY, type TEXT, data TEXT)");
        sqlitedatabase.execSQL("CREATE TABLE favorite_contacts (fbid TEXT PRIMARY KEY, display_order INTEGER)");
        sqlitedatabase.execSQL("CREATE INDEX favorite_contacts_order_index on favorite_contacts (display_order ASC)");
    }

    public void a(SQLiteDatabase sqlitedatabase, int i, int j)
    {
        com.facebook.debug.log.b.d(b, (new StringBuilder()).append("Upgrading part from version ").append(i).append(" to ").append(j).append(", which will destroy all old data").toString());
        sqlitedatabase.execSQL("DROP TABLE IF EXISTS contacts_db_properties");
        sqlitedatabase.execSQL("DROP TABLE IF EXISTS contacts");
        sqlitedatabase.execSQL("DROP TABLE IF EXISTS contact_summaries");
        sqlitedatabase.execSQL("DROP TABLE IF EXISTS contact_details");
        sqlitedatabase.execSQL("DROP TABLE IF EXISTS contacts_indexed_data");
        sqlitedatabase.execSQL("DROP INDEX IF EXISTS contacts_type_index");
        sqlitedatabase.execSQL("DROP INDEX IF EXISTS contacts_data_index");
        sqlitedatabase.execSQL("DROP TABLE IF EXISTS ephemeral_data");
        sqlitedatabase.execSQL("DROP TABLE IF EXISTS favorite_contacts");
        sqlitedatabase.execSQL("DROP INDEX IF EXISTS favorite_contacts_order_index");
        a(sqlitedatabase);
    }

    public void b(SQLiteDatabase sqlitedatabase)
    {
        sqlitedatabase.delete("contacts_db_properties", null, null);
        sqlitedatabase.delete("contacts", null, null);
        sqlitedatabase.delete("contact_details", null, null);
        sqlitedatabase.delete("contacts_indexed_data", null, null);
        sqlitedatabase.delete("ephemeral_data", null, null);
        sqlitedatabase.delete("favorite_contacts", null, null);
    }

}
