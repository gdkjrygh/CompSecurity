// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.contacts.e;

import android.content.ContentResolver;
import android.database.Cursor;
import android.net.Uri;
import com.facebook.common.w.k;
import com.facebook.d.d.f;
import com.facebook.debug.log.b;
import com.facebook.user.Name;
import com.facebook.user.PicCropInfo;
import com.facebook.user.User;
import com.facebook.user.UserEmailAddress;
import com.facebook.user.UserKey;
import com.facebook.user.UserPhoneNumber;
import com.facebook.user.i;
import com.facebook.user.j;
import com.facebook.user.n;
import com.facebook.user.o;
import com.google.common.a.hq;
import com.google.common.base.Objects;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

// Referenced classes of package com.facebook.contacts.e:
//            f

public class e
{

    private static final String a = com/facebook/contacts/e/e.getName();
    private static final String f[] = {
        "_id"
    };
    private static final String g[] = {
        "_id", "contact_id", "deleted", "data_version", "mimetype", "is_primary", "is_super_primary", "data_version", "data1", "data2", 
        "data3", "data4", "data5", "data6", "data7", "data8", "data9"
    };
    private static final String h[] = {
        "_id"
    };
    private final ContentResolver b;
    private final i c;
    private Cursor d;
    private o e;

    public e(ContentResolver contentresolver, i l)
    {
        b = contentresolver;
        c = l;
    }

    private void a(String s)
    {
        f f1 = com.facebook.d.d.e.a();
        if (s != null)
        {
            f1.a(com.facebook.d.d.e.a(s));
        }
        f1.a(com.facebook.d.d.e.a((new StringBuilder()).append("mimetype IN ").append(k.a(new String[] {
            "vnd.android.cursor.item/name", "vnd.android.cursor.item/email_v2", "vnd.android.cursor.item/phone_v2"
        })).toString()));
        d = b.query(android.provider.ContactsContract.RawContactsEntity.CONTENT_URI, g, f1.a(), f1.b(), "contact_id");
    }

    private void a(String s, int l, List list)
    {
        s = android.provider.ContactsContract.Contacts.CONTENT_FILTER_URI.buildUpon().appendPath(s).build();
        s = b.query(s, f, null, null, null);
        while (s.moveToNext() && list.size() < l) 
        {
            list.add(Integer.valueOf(s.getInt(0)));
        }
        break MISSING_BLOCK_LABEL_77;
        list;
        s.close();
        throw list;
        s.close();
        return;
    }

    private void a(Collection collection, com.facebook.contacts.e.f f1)
    {
        for (Iterator iterator = collection.iterator(); iterator.hasNext();)
        {
            UserKey userkey = (UserKey)iterator.next();
            if (userkey.a() != n.ADDRESS_BOOK && userkey.a() != n.PHONE_NUMBER)
            {
                throw new IllegalArgumentException((new StringBuilder()).append("Cannot look up phone for user key ").append(userkey).toString());
            }
        }

        Collection collection1 = UserKey.b(collection);
        if (f1 == f.EXCLUDE)
        {
            f1 = " NOT IN ";
        } else
        {
            f1 = " IN ";
        }
        f1 = (new StringBuilder("contact_id")).append(f1).append(k.b(collection1)).toString();
        com.facebook.debug.log.b.b(a, (new StringBuilder()).append("Searching for contact IDs where: ").append(f1).toString());
        a(((String) (f1)));
        if (collection.size() != d.getCount())
        {
            com.facebook.debug.log.b.d(a, (new StringBuilder()).append("Looked for ").append(collection.size()).append(" contacts, but only found ").append(d.getCount()).toString());
        }
    }

    private void a(List list)
    {
        list = (new StringBuilder()).append("contact_id IN ").append(k.b(list)).toString();
        d = b.query(android.provider.ContactsContract.RawContactsEntity.CONTENT_URI, g, list, null, "contact_id");
    }

    private UserPhoneNumber b(String s, int l)
    {
        com.facebook.debug.d.e e1 = com.facebook.debug.d.e.a("parseSmsAddress", "parseSmsAddress");
        j j1 = c.a(s);
        UserPhoneNumber userphonenumber = null;
        if (j1.a())
        {
            userphonenumber = c.a(s, l);
        }
        e1.a();
        return userphonenumber;
    }

    private void b(String s, int l, List list)
    {
        s = android.provider.ContactsContract.PhoneLookup.CONTENT_FILTER_URI.buildUpon().appendPath(s).build();
        s = b.query(s, f, null, null, null);
        while (s.moveToNext() && list.size() < l) 
        {
            list.add(Integer.valueOf(s.getInt(0)));
        }
        break MISSING_BLOCK_LABEL_77;
        list;
        s.close();
        throw list;
        s.close();
        return;
    }

    public void a()
    {
        a(((String) (null)));
        d = b.query(android.provider.ContactsContract.RawContactsEntity.CONTENT_URI, g, null, null, "contact_id");
    }

    public void a(String s, int l)
    {
        java.util.ArrayList arraylist = hq.a();
        a(s, l, ((List) (arraylist)));
        b(s, l, arraylist);
        a(((List) (arraylist)));
    }

    public void a(Collection collection)
    {
        com.facebook.debug.d.e e1 = com.facebook.debug.d.e.a("initWithExcludedUserKeys");
        a(collection, f.EXCLUDE);
        e1.a();
    }

    public Collection b()
    {
        java.util.ArrayList arraylist = hq.a();
        Cursor cursor1 = b.query(android.provider.ContactsContract.Contacts.CONTENT_STREQUENT_URI, h, null, null, null);
        if (cursor1 != null) goto _L2; else goto _L1
_L1:
        Cursor cursor = cursor1;
        com.facebook.debug.log.b.e(a, "Frequent contacts fetch returned null cursor");
_L5:
        if (cursor1 != null)
        {
            cursor1.close();
        }
_L6:
        a(arraylist, f.INCLUDE);
        return arraylist;
_L2:
        cursor = cursor1;
        if (cursor1.getCount() >= 1) goto _L4; else goto _L3
_L3:
        cursor = cursor1;
        com.facebook.debug.log.b.c(a, "Frequent contacts fetch returned no entries");
          goto _L5
        Object obj1;
        obj1;
_L11:
        cursor = cursor1;
        com.facebook.debug.log.b.e(a, (new StringBuilder()).append("Couldn't fetch frequent contacts: ").append(obj1).toString());
        if (cursor1 != null)
        {
            cursor1.close();
        }
          goto _L6
_L4:
        cursor = cursor1;
        com.facebook.debug.log.b.b(a, (new StringBuilder()).append("Frequent contacts fetch returned ").append(cursor1.getCount()).append(" rows").toString());
_L8:
        cursor = cursor1;
        if (!cursor1.moveToNext()) goto _L5; else goto _L7
_L7:
        cursor = cursor1;
        arraylist.add(new UserKey(n.ADDRESS_BOOK, cursor1.getString(0)));
          goto _L8
        obj1;
        Object obj;
        cursor1 = cursor;
        obj = obj1;
_L10:
        if (cursor1 != null)
        {
            cursor1.close();
        }
        throw obj;
        obj;
        cursor1 = null;
        if (true) goto _L10; else goto _L9
_L9:
        obj1;
        cursor1 = null;
          goto _L11
    }

    public void c()
    {
        if (d != null)
        {
            d.close();
            d = null;
        }
    }

    public int d()
    {
        int l = 0;
        boolean flag = false;
        if (d != null)
        {
            long l1 = -1L;
            d.moveToPosition(-1);
            l = ((flag) ? 1 : 0);
            do
            {
                if (!d.moveToNext())
                {
                    break;
                }
                if (d.getInt(2) == 0)
                {
                    long l2 = d.getLong(1);
                    if (l2 != l1)
                    {
                        l++;
                        l1 = l2;
                    }
                }
            } while (true);
            d.moveToPosition(-1);
        }
        return l;
    }

    public User e()
    {
        while (d.moveToNext()) 
        {
            long l2 = d.getLong(0);
            long l3 = d.getLong(1);
            int l = d.getInt(2);
            d.getInt(3);
            Object obj = d.getString(4);
            d.getInt(5);
            int l1 = d.getInt(6);
            if (l != 0)
            {
                com.facebook.debug.log.b.a(a, (new StringBuilder()).append("Skipping deleted raw contact row: ").append(l2).toString());
            } else
            {
                Object obj2 = Long.toString(l3);
                User user;
                if (e == null)
                {
                    e = new o();
                    e.a(n.ADDRESS_BOOK, ((String) (obj2)));
                    user = null;
                } else
                if (!Objects.equal(obj2, e.b()))
                {
                    user = e.x();
                    e = new o();
                    e.a(n.ADDRESS_BOOK, ((String) (obj2)));
                } else
                {
                    user = null;
                }
                if (e.k() == null)
                {
                    obj2 = PicCropInfo.a(Uri.withAppendedPath(android.provider.ContactsContract.Contacts.CONTENT_URI, e.b()).toString());
                    com.facebook.debug.log.b.b(a, (new StringBuilder()).append("Using pic crop info for contact ").append(e.b()).append(" ").append(obj2).toString());
                    e.a(((PicCropInfo) (obj2)));
                }
                if ("vnd.android.cursor.item/name".equals(obj))
                {
                    obj = d.getString(8);
                    obj = new Name(d.getString(9), d.getString(10), ((String) (obj)));
                    int i2 = ((Name) (obj)).f().length();
                    obj2 = e.h();
                    int i1;
                    if (obj2 == null)
                    {
                        i1 = 0;
                    } else
                    {
                        i1 = ((Name) (obj2)).f().length();
                    }
                    if (i2 > i1 || l1 != 0 && i2 > 0)
                    {
                        e.a(((Name) (obj)));
                    }
                } else
                if ("vnd.android.cursor.item/email_v2".equals(obj))
                {
                    String s1 = d.getString(8);
                    int j1 = d.getInt(9);
                    d.getString(10);
                    if (!com.facebook.common.w.n.a(s1))
                    {
                        List list = e.c();
                        obj = list;
                        if (list == null)
                        {
                            obj = hq.a();
                            e.a(((List) (obj)));
                        }
                        ((List) (obj)).add(new UserEmailAddress(s1, j1));
                    }
                } else
                if ("vnd.android.cursor.item/phone_v2".equals(obj))
                {
                    String s = d.getString(8);
                    int k1 = d.getInt(9);
                    d.getString(10);
                    UserPhoneNumber userphonenumber = b(s, k1);
                    if (userphonenumber != null)
                    {
                        List list1 = e.d();
                        Object obj1 = list1;
                        if (list1 == null)
                        {
                            obj1 = hq.a();
                            e.b(((List) (obj1)));
                        }
                        ((List) (obj1)).add(userphonenumber);
                    }
                }
                if (user != null)
                {
                    return user;
                }
            }
        }
        if (e != null)
        {
            user = e.x();
            e = null;
            return user;
        } else
        {
            return null;
        }
    }

}
