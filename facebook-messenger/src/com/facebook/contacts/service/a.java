// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.contacts.service;

import android.content.ContentResolver;
import android.database.Cursor;
import android.net.Uri;
import com.facebook.contacts.models.Contact;
import com.facebook.contacts.models.ContactDetails;
import com.facebook.contacts.models.b;
import com.facebook.contacts.models.entry.PhoneEntry;
import com.facebook.contacts.server.FetchContactResult;
import com.facebook.user.UserKey;
import com.google.common.a.es;
import com.google.common.a.fi;
import com.google.common.a.fk;

public class a
{

    private final ContentResolver a;
    private final com.facebook.contacts.data.a b;

    public a(ContentResolver contentresolver, com.facebook.contacts.data.a a1)
    {
        a = contentresolver;
        b = a1;
    }

    private String a(String s, b b1)
    {
        Cursor cursor;
        Object obj = null;
        cursor = a.query(Uri.withAppendedPath(android.provider.ContactsContract.PhoneLookup.CONTENT_FILTER_URI, Uri.encode(s)), new String[] {
            "_id", "display_name", "lookup"
        }, null, null, null);
        s = obj;
        if (cursor.moveToNext())
        {
            s = cursor.getString(0);
            String s1 = cursor.getString(1);
            String s2 = cursor.getString(2);
            b1.d(s1).h(s2);
        }
        cursor.close();
        return s;
        s;
        cursor.close();
        throw s;
    }

    private void a(String s, fk fk1)
    {
        ContentResolver contentresolver = a;
        Uri uri = android.provider.ContactsContract.CommonDataKinds.Phone.CONTENT_URI;
        s = (new StringBuilder()).append("contact_id = ").append(s).toString();
        s = contentresolver.query(uri, new String[] {
            "data1", "data2"
        }, s, null, null);
        while (s.moveToNext()) 
        {
            fk1.b(new PhoneEntry(null, true, null, -1L, s.getString(0), Integer.valueOf(s.getInt(1)).intValue()));
        }
        break MISSING_BLOCK_LABEL_113;
        fk1;
        s.close();
        throw fk1;
        s.close();
        return;
    }

    public FetchContactResult a(UserKey userkey)
    {
        b b1 = new b();
        fk fk1 = fi.e();
        userkey = a(userkey.b(), b1);
        if (userkey == null)
        {
            return new FetchContactResult(com.facebook.fbservice.c.b.FROM_SERVER, System.currentTimeMillis(), Contact.a, null);
        } else
        {
            String s = Uri.withAppendedPath(android.provider.ContactsContract.Contacts.CONTENT_URI, userkey).toString();
            b1.e(s);
            b1.f(s);
            a(((String) (userkey)), fk1);
            userkey = new ContactDetails(userkey, b.a(es.a(fk1.b())), false);
            return new FetchContactResult(com.facebook.fbservice.c.b.FROM_SERVER, System.currentTimeMillis(), b1.u(), userkey);
        }
    }
}
