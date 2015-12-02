// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.orca.sms;

import android.content.ContentResolver;
import android.content.Context;
import android.database.Cursor;
import com.facebook.common.w.k;
import com.facebook.d.d.j;
import com.facebook.messages.model.threads.Message;
import com.facebook.messages.model.threads.ParticipantInfo;
import com.facebook.messages.model.threads.c;
import com.facebook.messages.model.threads.e;
import com.facebook.o;
import com.facebook.orca.threads.m;
import com.facebook.user.User;
import com.facebook.user.n;
import com.google.common.a.es;
import com.google.common.a.et;
import com.google.common.base.Preconditions;
import java.util.Iterator;
import java.util.List;

// Referenced classes of package com.facebook.orca.sms:
//            bk, b

public class a
{

    private static final Class a = com/facebook/orca/sms/a;
    private static final String b[] = {
        "_id", "date", "number", "type"
    };
    private Context c;
    private bk d;

    public a(Context context, bk bk1)
    {
        c = context;
        d = bk1;
    }

    private Message a(Cursor cursor, String s)
    {
        ParticipantInfo participantinfo = null;
        String s1 = m.d(cursor.getLong(cursor.getColumnIndex("_id")));
        Object obj = cursor.getString(cursor.getColumnIndex("number"));
        obj = d.a(((String) (obj)));
        int i = cursor.getInt(cursor.getColumnIndex("type"));
        if (i == 1 || i == 3)
        {
            participantinfo = d.a(((User) (obj)));
            long l;
            if (i == 1)
            {
                obj = c.getString(o.call_log_incoming, new Object[] {
                    participantinfo.d()
                });
                i = 100;
            } else
            if (i == 3)
            {
                obj = c.getString(o.call_log_missed, new Object[] {
                    participantinfo.d()
                });
                i = 101;
            } else
            {
                obj = null;
                i = 0;
            }
        } else
        if (i == 2)
        {
            participantinfo = d.a();
            i = 102;
            obj = d.a(((User) (obj)));
            obj = c.getString(o.call_log_outgoing, new Object[] {
                ((ParticipantInfo) (obj)).d()
            });
        } else
        {
            i = 0;
            obj = null;
        }
        l = cursor.getLong(cursor.getColumnIndex("date"));
        return (new e()).a(s1).b(s).d(((String) (obj))).a(i).a(participantinfo).a(l).c(0xf4240L * l).a(false).f("call log").a(c.CALL_LOG).B();
    }

    es a(b b1, es es1)
    {
        et et1;
        et1 = es.e();
        Object obj1 = es1.iterator();
        es1 = null;
        while (((Iterator) (obj1)).hasNext()) 
        {
            Object obj = (User)((Iterator) (obj1)).next();
            boolean flag;
            if (((User) (obj)).a() == n.PHONE_NUMBER)
            {
                flag = true;
            } else
            {
                flag = false;
            }
            Preconditions.checkArgument(flag, "Expecting User of type PHONE_NUMBER, was given User of type %s", new Object[] {
                ((User) (obj)).a()
            });
            obj = com.facebook.d.d.e.a((new StringBuilder()).append("PHONE_NUMBERS_EQUAL(number, ").append(((User) (obj)).b()).append(", 1)").toString());
            if (es1 == null)
            {
                es1 = ((es) (obj));
            } else
            {
                es1 = com.facebook.d.d.e.b(new j[] {
                    es1, obj
                });
            }
        }
        String s;
        String as[];
        String s1;
        long l;
        if (b1.c() != null)
        {
            l = b1.c().longValue();
        } else
        {
            l = b1.d().longValue();
        }
        obj1 = com.facebook.d.d.e.a(new j[] {
            com.facebook.d.d.e.c("date", Long.toString(l)), es1
        });
        s1 = (new StringBuilder()).append(" LIMIT ").append(b1.b() + 1).toString();
        b1 = c.getContentResolver();
        es1 = android.provider.CallLog.Calls.CONTENT_URI;
        s = ((j) (obj1)).a();
        as = ((j) (obj1)).b();
        s1 = (new StringBuilder()).append("date DESC").append(s1).toString();
        b1 = b1.query(es1, new String[] {
            "_id"
        }, s, as, s1);
        while (b1.moveToNext()) 
        {
            et1.b(Long.valueOf(b1.getLong(b1.getColumnIndex("_id"))));
        }
        break MISSING_BLOCK_LABEL_321;
        es1;
        b1.close();
        throw es1;
        b1.close();
        return et1.b();
    }

    es a(List list, String s)
    {
        et et1;
        if (list.isEmpty())
        {
            return es.d();
        }
        et1 = es.e();
        list = c.getContentResolver().query(android.provider.CallLog.Calls.CONTENT_URI, b, (new StringBuilder()).append("_id IN ").append(k.a(list)).toString(), null, "date DESC");
        while (list.moveToNext()) 
        {
            et1.b(a(((Cursor) (list)), s));
        }
        break MISSING_BLOCK_LABEL_92;
        s;
        list.close();
        throw s;
        list.close();
        return et1.b();
    }

}
