// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.orca.p;

import android.content.ContentResolver;
import android.database.Cursor;
import android.net.Uri;
import com.facebook.debug.d.e;
import com.facebook.user.Name;
import com.facebook.user.User;
import com.facebook.user.UserPhoneNumber;
import com.facebook.user.i;
import com.facebook.user.j;
import com.facebook.user.n;
import com.facebook.user.o;
import com.google.common.a.hq;
import com.google.common.base.Objects;
import java.util.List;

public class a
{

    protected Cursor a;
    private final ContentResolver b;
    private final i c;
    private o d;

    public a(ContentResolver contentresolver, i k)
    {
        b = contentresolver;
        c = k;
    }

    private UserPhoneNumber a(String s, int k)
    {
        e e1 = e.a("parseSmsAddress", "parseSmsAddress");
        j j1 = c.a(s);
        s = null;
        if (j1.a())
        {
            s = j1.a(k);
        }
        e1.a();
        return s;
    }

    private void b(String s)
    {
        a = b.query(android.provider.ContactsContract.CommonDataKinds.Phone.CONTENT_URI, new String[] {
            "contact_id", "display_name", "data1", "data2"
        }, "contact_id = ?", new String[] {
            s
        }, "contact_id");
    }

    private String c(String s)
    {
        Cursor cursor;
        Object obj = null;
        if (s == null)
        {
            return null;
        }
        s = Uri.withAppendedPath(android.provider.ContactsContract.PhoneLookup.CONTENT_FILTER_URI, Uri.encode(s));
        cursor = b.query(s, new String[] {
            "_id"
        }, null, null, null);
        s = obj;
        if (cursor.moveToNext())
        {
            s = cursor.getString(0);
        }
        cursor.close();
        return s;
        s;
        cursor.close();
        throw s;
    }

    public void a()
    {
        if (a != null)
        {
            a.close();
            a = null;
        }
    }

    public void a(String s)
    {
        s = c(s);
        if (s != null)
        {
            b(s);
            return;
        } else
        {
            a = null;
            return;
        }
    }

    public User b()
    {
        if (a != null) goto _L2; else goto _L1
_L1:
        return null;
_L2:
        do
        {
            if (!a.moveToNext())
            {
                continue; /* Loop/switch isn't completed */
            }
            long l = a.getLong(0);
            String s1 = a.getString(1);
            String s = a.getString(2);
            int k = a.getInt(3);
            Object obj1 = Long.toString(l);
            User user;
            if (d == null)
            {
                d = new o();
                d.a(n.ADDRESS_BOOK, ((String) (obj1)));
                user = null;
            } else
            if (!Objects.equal(obj1, d.b()))
            {
                user = d.x();
                d = new o();
                d.a(n.ADDRESS_BOOK, ((String) (obj1)));
            } else
            {
                user = null;
            }
            if (d.h() == null)
            {
                d.a(new Name(null, null, s1));
            }
            if (d.i() == null)
            {
                String s2 = Uri.withAppendedPath(android.provider.ContactsContract.Contacts.CONTENT_URI, ((String) (obj1))).toString();
                d.b(s2);
                d.c(s2);
            }
            obj1 = a(s, k);
            if (obj1 != null)
            {
                List list = d.d();
                Object obj = list;
                if (list == null)
                {
                    obj = hq.a();
                    d.b(((List) (obj)));
                }
                if (!((List) (obj)).contains(obj1))
                {
                    ((List) (obj)).add(obj1);
                }
            }
        } while (user == null);
        return user;
        if (d == null) goto _L1; else goto _L3
_L3:
        user = d.x();
        d = null;
        return user;
    }
}
