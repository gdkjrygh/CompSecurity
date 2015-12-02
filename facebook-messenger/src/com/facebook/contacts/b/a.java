// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.contacts.b;

import android.content.ContentResolver;
import android.database.Cursor;
import android.net.Uri;
import android_src.c.j;
import android_src.c.l;
import com.facebook.analytics.av;
import com.facebook.analytics.cb;
import com.facebook.common.w.m;
import com.facebook.contacts.server.ContactInteractionEvent;
import com.facebook.contacts.server.c;
import com.facebook.debug.log.b;
import com.facebook.user.UserPhoneNumber;
import com.facebook.user.i;
import com.google.common.a.es;
import com.google.common.a.et;
import java.util.Iterator;

public class a
{

    private static final Class a = com/facebook/contacts/b/a;
    private final ContentResolver b;
    private final av c;

    public a(ContentResolver contentresolver, av av1)
    {
        b = contentresolver;
        c = av1;
    }

    private long a(long l1)
    {
        long l2 = l1;
        if (l1 < 0x75a956030L)
        {
            l2 = l1 * 1000L;
        }
        return l2;
    }

    private void a(UserPhoneNumber userphonenumber, int k, et et1)
    {
        et et2;
        et et3;
        Object obj;
        int i1;
        int j1;
        userphonenumber = userphonenumber.b();
        com.facebook.debug.log.b.a(a, (new StringBuilder()).append("Fetching call events for phone: ").append(userphonenumber).toString());
        et2 = es.e();
        et3 = es.e();
        obj = Uri.withAppendedPath(android.provider.CallLog.Calls.CONTENT_FILTER_URI, userphonenumber);
        obj = b.query(((Uri) (obj)), new String[] {
            "type", "date"
        }, null, null, null);
        i1 = 0;
        j1 = 0;
        int k1;
        int l1;
        k1 = ((Cursor) (obj)).getColumnIndex("type");
        l1 = ((Cursor) (obj)).getColumnIndex("date");
        com.facebook.debug.log.b.b(a, (new StringBuilder()).append("Got ").append(((Cursor) (obj)).getCount()).append(" calls for phone: ").append(userphonenumber).toString());
_L5:
        if (!((Cursor) (obj)).moveToNext() || i1 >= k || j1 >= k) goto _L2; else goto _L1
_L1:
        int i2;
        long l2;
        i2 = ((Cursor) (obj)).getInt(k1);
        l2 = ((Cursor) (obj)).getLong(l1);
        if (i2 != 2 || i1 >= k) goto _L4; else goto _L3
_L3:
        et2.b(Long.valueOf(l2));
        i1++;
          goto _L5
_L6:
        if (j1 >= k)
        {
            break; /* Loop/switch isn't completed */
        }
        et3.b(Long.valueOf(l2));
        j1++;
        break; /* Loop/switch isn't completed */
_L2:
        a(et2.b(), c.CALL_SENT, et1);
        a(et3.b(), c.CALL_RECEIVED, et1);
        ((Cursor) (obj)).close();
        return;
        userphonenumber;
        ((Cursor) (obj)).close();
        throw userphonenumber;
_L4:
        if (i2 != 1 && i2 != 3) goto _L5; else goto _L6
    }

    private void a(UserPhoneNumber userphonenumber, String s, Exception exception)
    {
        userphonenumber = i.e(userphonenumber.b());
        c.a((new cb("contact_importer_get_interaction_events_failed")).b("phone_number", userphonenumber).b("type", s).b("error", exception.getMessage()));
        com.facebook.debug.log.b.a(a, m.a("Fetching %s events failed for phone [%s] with exception: %s: ", new Object[] {
            s, userphonenumber, exception
        }));
    }

    private void a(es es1, c c1, et et1)
    {
        if (es1.size() == 0)
        {
            return;
        } else
        {
            et1.b(new ContactInteractionEvent(c1, es1.size(), es1));
            return;
        }
    }

    private void b(UserPhoneNumber userphonenumber, int k, et et1)
    {
        et et2;
        et et3;
        et et4;
        Object obj;
        String s;
        int i1;
        int j1;
        int k1;
        int l1;
        s = userphonenumber.b();
        com.facebook.debug.log.b.a(a, (new StringBuilder()).append("Fetching SMS/MMS events for phone: ").append(s).toString());
        userphonenumber = es.e();
        et2 = es.e();
        et3 = es.e();
        et4 = es.e();
        obj = Uri.withAppendedPath(j.c, s);
        obj = b.query(((Uri) (obj)), new String[] {
            "transport_type", "type", "date", "msg_box"
        }, null, null, null);
        k1 = 0;
        l1 = 0;
        i1 = 0;
        j1 = 0;
        int k2;
        int l2;
        int i3;
        int j3;
        k2 = ((Cursor) (obj)).getColumnIndex("transport_type");
        l2 = ((Cursor) (obj)).getColumnIndex("type");
        i3 = ((Cursor) (obj)).getColumnIndex("date");
        j3 = ((Cursor) (obj)).getColumnIndex("msg_box");
        com.facebook.debug.log.b.b(a, (new StringBuilder()).append("Got ").append(((Cursor) (obj)).getCount()).append(" messages for phone: ").append(s).toString());
_L3:
        if (!((Cursor) (obj)).moveToNext() || k1 >= k || l1 >= k || i1 >= k || j1 >= k)
        {
            break MISSING_BLOCK_LABEL_502;
        }
        int i2;
        long l3;
        boolean flag;
        s = ((Cursor) (obj)).getString(k2);
        if (!s.equals("sms"))
        {
            break MISSING_BLOCK_LABEL_350;
        }
        i2 = ((Cursor) (obj)).getInt(l2);
        l3 = ((Cursor) (obj)).getLong(i3);
        flag = l.a(i2);
        int j2;
        if (i2 == 1)
        {
            i2 = 1;
        } else
        {
            i2 = 0;
        }
        if (!flag || k1 >= k) goto _L2; else goto _L1
_L1:
        userphonenumber.b(Long.valueOf(l3));
        k1++;
          goto _L3
_L2:
        if (!i2 || l1 >= k) goto _L3; else goto _L4
_L4:
        et2.b(Long.valueOf(l3));
        l1++;
          goto _L3
        if (!s.equals("mms"))
        {
            break MISSING_BLOCK_LABEL_463;
        }
        j2 = ((Cursor) (obj)).getInt(j3);
        l3 = a(((Cursor) (obj)).getLong(i3));
        if (j2 == 2 || j2 == 4)
        {
            i2 = 1;
        } else
        {
            i2 = 0;
        }
        break MISSING_BLOCK_LABEL_570;
        if (!i2 || i1 >= k) goto _L6; else goto _L5
_L5:
        et3.b(Long.valueOf(l3));
        i1++;
          goto _L3
_L6:
        if (j2 == 0 || j1 >= k) goto _L3; else goto _L7
_L7:
        et4.b(Long.valueOf(l3));
        j1++;
          goto _L3
        com.facebook.debug.log.b.e(a, (new StringBuilder()).append("Ignoring unrecognized type discriminator: ").append(k2).toString());
          goto _L3
        userphonenumber;
        ((Cursor) (obj)).close();
        throw userphonenumber;
        a(userphonenumber.b(), c.SMS_SENT, et1);
        a(et2.b(), c.SMS_RECEIVED, et1);
        a(et3.b(), c.MMS_SENT, et1);
        a(et4.b(), c.MMS_RECEIVED, et1);
        ((Cursor) (obj)).close();
        return;
        if (j2 == 1)
        {
            j2 = 1;
        } else
        {
            j2 = 0;
        }
        break MISSING_BLOCK_LABEL_401;
    }

    public es a(es es1, int k)
    {
        et et1 = es.e();
        for (es1 = es1.iterator(); es1.hasNext();)
        {
            UserPhoneNumber userphonenumber = (UserPhoneNumber)es1.next();
            try
            {
                a(userphonenumber, k, et1);
            }
            catch (Exception exception1)
            {
                a(userphonenumber, "call_events", exception1);
            }
            try
            {
                b(userphonenumber, k, et1);
            }
            catch (Exception exception)
            {
                a(userphonenumber, "message_events", exception);
            }
        }

        return et1.b();
    }

}
