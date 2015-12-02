// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.orca.sms;

import android.content.ContentResolver;
import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import android_src.c.l;
import com.facebook.common.w.k;
import com.facebook.common.w.m;
import com.facebook.common.w.n;
import com.facebook.d.d.j;
import com.facebook.messages.model.threads.Message;
import com.facebook.messages.model.threads.SendError;
import com.facebook.messages.model.threads.c;
import com.facebook.messages.model.threads.e;
import com.google.common.a.es;
import com.google.common.a.et;
import java.util.Collection;
import java.util.List;

// Referenced classes of package com.facebook.orca.sms:
//            r, bh, bk, f, 
//            c, b

public class bn
{

    private static final Class a = com/facebook/orca/sms/bn;
    private static final String d[] = {
        Integer.toString(1)
    };
    private final Context b;
    private final bk c;

    public bn(Context context, bk bk1)
    {
        b = context;
        c = bk1;
    }

    static String a(String s)
    {
        if (n.a(s))
        {
            return m.a("SELECT MAX(date) AS normalized_date, thread_id AS thread_id, MAX(_id) AS _id FROM sms WHERE %1$s GROUP BY thread_id", new Object[] {
                "type IN (1, 2, 5)"
            });
        } else
        {
            return m.a("SELECT MAX(date) AS normalized_date, thread_id AS thread_id, MAX(_id) AS _id FROM sms WHERE %1$s GROUP BY thread_id", new Object[] {
                (new StringBuilder()).append("type IN (1, 2, 5) AND ").append(s).toString()
            });
        }
    }

    private String a(String s, String s1, int i)
    {
        if (s1 == null)
        {
            s1 = "";
        } else
        {
            s1 = (new StringBuilder()).append(s1).append(" AND ").toString();
        }
        return (new StringBuilder()).append("_id IN (SELECT sms._id FROM (").append(a(s)).append(") sms ").append("LEFT JOIN ").append("(").append(r.a(s)).append(") mms ").append("ON sms.thread_id=mms.thread_id ").append("WHERE ").append(s1).append("(mms.normalized_date<sms.normalized_date OR mms.normalized_date IS NULL) ").append("ORDER BY sms.normalized_date DESC ").append("LIMIT ").append(i + 1).append(")").toString();
    }

    private es b(String s)
    {
        et et1;
        Cursor cursor;
        et1 = es.e();
        cursor = b.getContentResolver().query(l.a, bh.b, s, null, "date DESC");
        int i;
        int i1;
        int j1;
        int k1;
        int l1;
        int i2;
        int j2;
        int k2;
        i = cursor.getColumnIndex("thread_id");
        i1 = cursor.getColumnIndex("_id");
        j1 = cursor.getColumnIndex("date");
        k1 = cursor.getColumnIndex("subject");
        l1 = cursor.getColumnIndex("body");
        i2 = cursor.getColumnIndex("address");
        j2 = cursor.getColumnIndex("type");
        k2 = cursor.getColumnIndex("read");
_L1:
        String s1;
        String s2;
        int l2;
        int i3;
        long l3;
        long l4;
        long l5;
        if (!cursor.moveToNext())
        {
            break MISSING_BLOCK_LABEL_292;
        }
        l3 = cursor.getLong(i);
        l4 = cursor.getLong(i1);
        l5 = cursor.getLong(j1);
        s1 = cursor.getString(k1);
        s2 = cursor.getString(l1);
        s = cursor.getString(i2);
        l2 = cursor.getInt(j2);
        i3 = cursor.getInt(k2);
        if (l2 != 2 && l2 != 6 && l2 != 4)
        {
            break MISSING_BLOCK_LABEL_265;
        }
        s = c.a();
_L2:
        boolean flag;
        if (i3 == 0)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        et1.b(new f(l3, l4, l5, flag, s1, s2, s));
          goto _L1
        s;
        cursor.close();
        throw s;
        s = c.a(s);
        s = c.a(s);
          goto _L2
        cursor.close();
        return et1.b();
          goto _L1
    }

    private String b(String s, String s1, int i)
    {
        if (s1 == null)
        {
            s1 = "";
        } else
        {
            s1 = (new StringBuilder()).append("WHERE ").append(s1).append(" ").toString();
        }
        return (new StringBuilder()).append("_id IN (SELECT sms._id FROM (").append(a(s)).append(") sms ").append(s1).append("ORDER BY sms.normalized_date DESC ").append("LIMIT ").append(i + 1).append(")").toString();
    }

    private String c(com.facebook.orca.sms.c c1)
    {
        StringBuilder stringbuilder = new StringBuilder();
        stringbuilder.append("sms.normalized_date");
        if (c1.b() != null)
        {
            stringbuilder.append(">");
            stringbuilder.append(c1.b());
        } else
        {
            stringbuilder.append("<=");
            stringbuilder.append(c1.c());
        }
        return a(null, stringbuilder.toString(), c1.a());
    }

    private String d(com.facebook.orca.sms.c c1)
    {
        StringBuilder stringbuilder = new StringBuilder();
        stringbuilder.append("sms.normalized_date");
        if (c1.b() != null)
        {
            stringbuilder.append(">");
            stringbuilder.append(c1.b());
        } else
        {
            stringbuilder.append("<=");
            stringbuilder.append(c1.c());
        }
        return b(null, stringbuilder.toString(), c1.a());
    }

    private String d(List list)
    {
        return a((new StringBuilder()).append("thread_id IN ").append(k.a(list)).toString(), null, list.size());
    }

    private String e(List list)
    {
        return b((new StringBuilder()).append("thread_id IN ").append(k.a(list)).toString(), null, list.size());
    }

    public long a(long l1)
    {
        Object obj;
        obj = Long.toString(l1);
        obj = b.getContentResolver().query(l.a, new String[] {
            "thread_id"
        }, "_id=?", new String[] {
            obj
        }, null);
        if (!((Cursor) (obj)).moveToNext())
        {
            break MISSING_BLOCK_LABEL_71;
        }
        l1 = ((Cursor) (obj)).getLong(((Cursor) (obj)).getColumnIndex("thread_id"));
        ((Cursor) (obj)).close();
        return l1;
        throw new Exception("Could not find SmsId by MessageId");
        Exception exception;
        exception;
        ((Cursor) (obj)).close();
        throw exception;
    }

    public long a(String s, String s1, long l1, long l2, int i)
    {
        ContentValues contentvalues = new ContentValues();
        contentvalues.put("address", s);
        contentvalues.put("date", Long.valueOf(l1));
        contentvalues.put("date_sent", Long.valueOf(l2));
        contentvalues.put("body", s1);
        contentvalues.put("type", Integer.valueOf(i));
        contentvalues.put("seen", Integer.valueOf(1));
        s1 = b.getContentResolver().insert(l.a, contentvalues);
        s = s1;
        if (s1 == null)
        {
            contentvalues.remove("date_sent");
            s = b.getContentResolver().insert(l.a, contentvalues);
        }
        return Long.parseLong(s.getLastPathSegment());
    }

    public Message a()
    {
        Cursor cursor = b.getContentResolver().query(l.a, com.facebook.orca.sms.bh.c, "type=?", d, "date DESC LIMIT 1");
        Message message;
        if (!cursor.moveToNext())
        {
            break MISSING_BLOCK_LABEL_49;
        }
        message = a(cursor);
        cursor.close();
        return message;
        cursor.close();
        return null;
        Exception exception;
        exception;
        cursor.close();
        throw exception;
    }

    Message a(Cursor cursor)
    {
        int i = cursor.getInt(cursor.getColumnIndex("type"));
        SendError senderror = SendError.a;
        Object obj = null;
        String s;
        String s1;
        String s2;
        String s3;
        long l1;
        long l2;
        if (i == 2)
        {
            obj = c.a();
            i = 0;
        } else
        if (i == 1)
        {
            obj = cursor.getString(cursor.getColumnIndex("address"));
            obj = c.a(((String) (obj)));
            obj = c.a(((com.facebook.user.User) (obj)));
            i = 0;
        } else
        if (i == 5)
        {
            obj = c.a();
            i = 901;
            senderror = SendError.g;
        } else
        {
            i = 0;
        }
        s = cursor.getString(cursor.getColumnIndex("subject"));
        s1 = cursor.getString(cursor.getColumnIndex("body"));
        l1 = cursor.getLong(cursor.getColumnIndex("thread_id"));
        l2 = cursor.getLong(cursor.getColumnIndex("_id"));
        s2 = com.facebook.orca.threads.m.a(l1);
        s3 = com.facebook.orca.threads.m.b(l2);
        l1 = cursor.getLong(cursor.getColumnIndex("date"));
        return (new e()).a(s3).b(s2).a(i).a(senderror).c(s).d(s1).a(l1).c(0xf4240L * l1).a(((com.facebook.messages.model.threads.ParticipantInfo) (obj))).a(false).f("sms").a(c.SMS).B();
    }

    es a(b b1)
    {
        et et1;
        et1 = es.e();
        Object obj;
        int i;
        if (b1.c() != null)
        {
            obj = com.facebook.d.d.e.c("date", Long.toString(b1.c().longValue()));
        } else
        {
            obj = com.facebook.d.d.e.b("date", Long.toString(b1.d().longValue()));
        }
        obj = com.facebook.d.d.e.a(new j[] {
            com.facebook.d.d.e.a("thread_id", Long.toString(b1.a())), com.facebook.d.d.e.a("type IN (1, 2, 5)"), obj
        });
        b1 = b.getContentResolver().query(l.a, bh.a, ((j) (obj)).a(), ((j) (obj)).b(), (new StringBuilder()).append("date DESC LIMIT ").append(b1.b() + 1).toString());
        i = b1.getColumnIndex("_id");
        for (; b1.moveToNext(); et1.b(Long.valueOf(b1.getLong(i)))) { }
        break MISSING_BLOCK_LABEL_178;
        obj;
        b1.close();
        throw obj;
        b1.close();
        return et1.b();
    }

    es a(com.facebook.orca.sms.c c1)
    {
        return b(c(c1));
    }

    es a(List list)
    {
        return b(d(list));
    }

    void a(Collection collection)
    {
        ContentValues contentvalues = new ContentValues();
        contentvalues.put("read", Integer.valueOf(1));
        b.getContentResolver().update(l.a, contentvalues, (new StringBuilder()).append("thread_id IN ").append(k.a(collection)).toString(), null);
    }

    es b(com.facebook.orca.sms.c c1)
    {
        return b(d(c1));
    }

    es b(List list)
    {
        return b(e(list));
    }

    void b(long l1)
    {
        String s = Long.toString(l1);
        b.getContentResolver().delete(l.a, "_id=?", new String[] {
            s
        });
    }

    es c(List list)
    {
        Object obj;
        if (list.isEmpty())
        {
            return es.d();
        }
        obj = es.e();
        list = (new StringBuilder()).append("_id IN ").append(k.a(list)).toString();
        list = b.getContentResolver().query(l.a, com.facebook.orca.sms.bh.c, list, null, "date DESC");
        while (list.moveToNext()) 
        {
            ((et) (obj)).b(a(list));
        }
        break MISSING_BLOCK_LABEL_93;
        obj;
        list.close();
        throw obj;
        list.close();
        return ((et) (obj)).b();
    }

}
