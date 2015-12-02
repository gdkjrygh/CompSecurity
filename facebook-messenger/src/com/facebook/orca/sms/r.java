// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.orca.sms;

import android.content.ContentResolver;
import android.content.ContentUris;
import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import android_src.c.d;
import android_src.mms.c;
import android_src.mms.e.e;
import android_src.mms.e.j;
import android_src.mms.e.s;
import android_src.mms.e.t;
import android_src.mms.e.z;
import com.facebook.common.w.k;
import com.facebook.common.w.n;
import com.facebook.messages.model.threads.Message;
import com.facebook.messages.model.threads.ParticipantInfo;
import com.facebook.orca.threads.m;
import com.facebook.ui.media.attachments.MediaResource;
import com.facebook.ui.media.attachments.a;
import com.facebook.ui.media.attachments.f;
import com.facebook.ui.media.attachments.g;
import com.google.common.a.es;
import com.google.common.a.et;
import com.google.common.a.ex;
import com.google.common.a.ey;
import com.google.common.a.hq;
import com.google.common.b.b;
import com.google.common.base.Joiner;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

// Referenced classes of package com.facebook.orca.sms:
//            s, bk, bn, bh, 
//            f, c, b

class r
{

    private static final Class a = com/facebook/orca/sms/r;
    private static final Uri b = Uri.parse("content://mms/part");
    private final Context c;
    private final bk d;
    private final com.facebook.ui.media.b.a e;

    r(Context context, bk bk1, com.facebook.ui.media.b.a a1)
    {
        c = context;
        d = bk1;
        e = a1;
    }

    private j a(Message message)
    {
        j j1 = new j();
        int l1 = Math.max(android_src.mms.c.j(), android_src.mms.c.i());
        int i1 = android_src.mms.c.b();
        int l = message.B().size();
        Object obj = message.B().iterator();
        int i = 1;
        i1 -= 5000;
        while (((Iterator) (obj)).hasNext()) 
        {
            byte abyte0[] = (MediaResource)((Iterator) (obj)).next();
            int k1 = i1 / l;
            if (abyte0.c().equals(g.PHOTO))
            {
                s s1 = new s();
                abyte0 = new a(c, abyte0);
                abyte0 = e.a(abyte0, l1, l1, k1);
                k1 = abyte0.length;
                s1.a(abyte0);
                s1.e("image/jpeg".getBytes());
                s1.c((new StringBuilder()).append("IMG_").append(k1).append("_").append(i).append(".jpg").toString().getBytes());
                s1.b((new StringBuilder()).append("IMG_").append(k1).append("_").append(i).toString().getBytes());
                j1.a(s1);
                k1 = i1 - k1;
            } else
            {
                k1 = i1;
                if (!abyte0.c().equals(g.AUDIO))
                {
                    k1 = i1;
                    if (abyte0.c().equals(g.VIDEO))
                    {
                        k1 = i1;
                    }
                }
            }
            i++;
            l--;
            i1 = k1;
        }
        if (!n.a(message.k()))
        {
            j1.a(a(message.k(), i));
        }
        obj = android_src.mms.d.a.a(j1);
        message = new ByteArrayOutputStream();
        android_src.mms.a.b.a.c.a(((org.a.a.b.f) (obj)), message);
        obj = new s();
        ((s) (obj)).b("smil".getBytes());
        ((s) (obj)).c("smil.xml".getBytes());
        ((s) (obj)).e("application/smil".getBytes());
        ((s) (obj)).a(message.toByteArray());
        j1.a(0, ((s) (obj)));
        return j1;
    }

    private s a(String s1, int i)
    {
        s s2 = new s();
        s2.a(106);
        s2.e("text/plain".getBytes());
        s2.c((new StringBuilder()).append("text_").append(i).append(".txt").toString().getBytes());
        s2.b((new StringBuilder()).append("text_").append(i).toString().getBytes());
        s2.a(s1.getBytes());
        return s2;
    }

    private z a(Set set)
    {
        ArrayList arraylist = hq.a();
        set = set.iterator();
        do
        {
            if (!set.hasNext())
            {
                break;
            }
            String s1 = android_src.mms.f.a.b((String)set.next());
            if (!n.a(s1))
            {
                arraylist.add(s1);
            }
        } while (true);
        Object aobj[] = (String[])arraylist.toArray(new String[arraylist.size()]);
        set = new z();
        aobj = android_src.mms.e.e.a(((String []) (aobj)));
        if (aobj != null)
        {
            set.a(((e []) (aobj)));
        }
        set.a(System.currentTimeMillis() / 1000L);
        return set;
    }

    private Message a(Cursor cursor, ex ex1)
    {
        String s1;
        String s2;
        String s3;
        Object obj;
        int i;
        long l;
        long l1;
        l1 = cursor.getLong(cursor.getColumnIndex("thread_id"));
        l = cursor.getLong(cursor.getColumnIndex("_id"));
        s1 = cursor.getString(cursor.getColumnIndex("sub"));
        s2 = m.a(l1);
        s3 = m.c(l);
        l1 = cursor.getLong(cursor.getColumnIndex("date")) * 1000L;
        Object obj1 = ex1.e(Long.valueOf(l));
        obj = hq.a();
        ex1 = hq.a();
        obj1 = ((Collection) (obj1)).iterator();
        do
        {
            if (!((Iterator) (obj1)).hasNext())
            {
                break;
            }
            com.facebook.orca.sms.s s4 = (com.facebook.orca.sms.s)((Iterator) (obj1)).next();
            if (s4.b != null)
            {
                ex1.add(s4.b);
            } else
            if (!n.a(s4.a))
            {
                ((List) (obj)).add(s4.a);
            }
        } while (true);
        obj = Joiner.on("\n\n").join(((Iterable) (obj)));
        i = cursor.getInt(cursor.getColumnIndex("msg_box"));
        cursor = null;
        if (i != 2) goto _L2; else goto _L1
_L1:
        cursor = d.a();
_L4:
        return (new com.facebook.messages.model.threads.e()).a(s3).b(s2).a(0).c(s1).d(((String) (obj))).a(l1).c(0xf4240L * l1).a(cursor).a(ex1).a(false).f("mms").a(com.facebook.messages.model.threads.c.MMS).B();
_L2:
        if (i == 1)
        {
            cursor = c(l);
        }
        if (true) goto _L4; else goto _L3
_L3:
    }

    static String a(String s1)
    {
        if (n.a(s1))
        {
            return com.facebook.common.w.m.a("SELECT MAX(date)*1000 AS normalized_date, thread_id AS thread_id, MAX(_id) AS _id FROM pdu WHERE %1$s GROUP BY thread_id", new Object[] {
                "m_type IN (128, 132) AND msg_box IN (1, 2)"
            });
        } else
        {
            return com.facebook.common.w.m.a("SELECT MAX(date)*1000 AS normalized_date, thread_id AS thread_id, MAX(_id) AS _id FROM pdu WHERE %1$s GROUP BY thread_id", new Object[] {
                (new StringBuilder()).append("m_type IN (128, 132) AND msg_box IN (1, 2) AND ").append(s1).toString()
            });
        }
    }

    private String a(String s1, String s2)
    {
        s1 = Uri.parse((new StringBuilder()).append("content://mms/part/").append(s1).toString());
        InputStream inputstream = c.getContentResolver().openInputStream(s1);
        s1 = com.google.common.b.b.a(new InputStreamReader(inputstream, s2));
        inputstream.close();
        return s1;
        s1;
        try
        {
            inputstream.close();
            throw s1;
        }
        // Misplaced declaration of an exception variable
        catch (String s2)
        {
            s1 = "";
        }
_L2:
        com.facebook.debug.log.b.e(a, "Opening MMS Part input stream failed", s2);
        return s1;
        s2;
        if (true) goto _L2; else goto _L1
_L1:
    }

    private String a(String s1, String s2, int i)
    {
        if (s2 == null)
        {
            s2 = "";
        } else
        {
            s2 = (new StringBuilder()).append(s2).append(" AND ").toString();
        }
        return (new StringBuilder()).append("_id IN (SELECT mms._id FROM (").append(a(s1)).append(") mms ").append("LEFT JOIN ").append("(").append(com.facebook.orca.sms.bn.a(s1)).append(") sms ").append("ON sms.thread_id=mms.thread_id ").append("WHERE ").append(s2).append("(sms.normalized_date<mms.normalized_date OR sms.normalized_date IS NULL) ").append("ORDER BY mms.normalized_date DESC ").append("LIMIT ").append(i).append(")").toString();
    }

    private void a(z z1)
    {
        z1.b(0x93a80L);
        z1.c(129);
        z1.d(129);
        z1.e(129);
    }

    private es b(String s1)
    {
        Object obj;
        obj = es.e();
        s1 = c.getContentResolver().query(d.a, com.facebook.orca.sms.bh.e, s1, null, "date DESC");
        int i;
        int l;
        int i1;
        int j1;
        int k1;
        i = s1.getColumnIndex("thread_id");
        l = s1.getColumnIndex("_id");
        i1 = s1.getColumnIndex("date");
        j1 = s1.getColumnIndex("read");
        k1 = s1.getColumnIndex("sub");
_L1:
        String s2;
        int l1;
        long l2;
        long l3;
        long l4;
        if (!s1.moveToNext())
        {
            break MISSING_BLOCK_LABEL_189;
        }
        l2 = s1.getLong(i);
        l3 = s1.getLong(l);
        l4 = s1.getLong(i1);
        l1 = s1.getInt(j1);
        s2 = s1.getString(k1);
        boolean flag;
        if (l1 == 0)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        ((et) (obj)).b(new com.facebook.orca.sms.f(l2, l3, l4 * 1000L, flag, s2));
          goto _L1
        obj;
        s1.close();
        throw obj;
        s1.close();
        return ((et) (obj)).b();
    }

    private String b(com.facebook.orca.sms.c c1)
    {
        StringBuilder stringbuilder = new StringBuilder();
        stringbuilder.append("mms.normalized_date");
        if (c1.b() != null)
        {
            stringbuilder.append(">");
            stringbuilder.append(c1.b());
        } else
        {
            stringbuilder.append("<=");
            stringbuilder.append(c1.c());
        }
        return a(null, stringbuilder.toString(), c1.a() + 1);
    }

    private ParticipantInfo c(long l)
    {
        Object obj;
        obj = Uri.withAppendedPath(ContentUris.withAppendedId(d.a, l), "addr");
        obj = c.getContentResolver().query(((Uri) (obj)), null, "type=137", null, null);
        Object obj1;
        if (!((Cursor) (obj)).moveToNext())
        {
            break MISSING_BLOCK_LABEL_89;
        }
        obj1 = ((Cursor) (obj)).getString(((Cursor) (obj)).getColumnIndex("address"));
        obj1 = d.a(((String) (obj1)));
        obj1 = d.a(((com.facebook.user.User) (obj1)));
        ((Cursor) (obj)).close();
        return ((ParticipantInfo) (obj1));
        ((Cursor) (obj)).close();
        return null;
        Exception exception;
        exception;
        ((Cursor) (obj)).close();
        throw exception;
    }

    private String c(List list)
    {
        return a((new StringBuilder()).append("thread_id IN ").append(k.a(list)).toString(), null, list.size());
    }

    private ex d(List list)
    {
        ey ey1;
        Cursor cursor;
        ey1 = ex.j();
        list = (new StringBuilder()).append("mid IN ").append(k.a(list)).toString();
        cursor = c.getContentResolver().query(b, null, list, null, null);
_L7:
        String s1;
        String s2;
        Object obj;
        String s3;
        f f1;
        String s4;
        String s5;
        long l;
        if (!cursor.moveToNext())
        {
            break MISSING_BLOCK_LABEL_438;
        }
        l = cursor.getLong(cursor.getColumnIndex("mid"));
        obj = cursor.getString(cursor.getColumnIndex("ct"));
        s1 = cursor.getString(cursor.getColumnIndex("name"));
        s2 = cursor.getString(cursor.getColumnIndex("fn"));
        s3 = cursor.getString(cursor.getColumnIndex("_id"));
        s4 = cursor.getString(cursor.getColumnIndex("chset"));
        s5 = cursor.getString(cursor.getColumnIndex("_data"));
        list = cursor.getString(cursor.getColumnIndex("text"));
        f1 = MediaResource.a();
        if (!"text/plain".equals(obj)) goto _L2; else goto _L1
_L1:
        if (s5 == null)
        {
            break MISSING_BLOCK_LABEL_236;
        }
        list = a(s3, s4);
        list = com.facebook.orca.sms.s.a(list);
_L5:
        if (f1.b() == null) goto _L4; else goto _L3
_L3:
        obj = f1.a(Uri.parse((new StringBuilder()).append("content://mms/part/").append(s3).toString())).a(((String) (obj)));
        if (n.a(s2))
        {
            list = s1;
        } else
        {
            list = s2;
        }
        list = com.facebook.orca.sms.s.a(((f) (obj)).b(list).i());
_L4:
        if (list == null)
        {
            continue; /* Loop/switch isn't completed */
        }
        ey1.a(Long.valueOf(l), list);
        continue; /* Loop/switch isn't completed */
        list;
        cursor.close();
        throw list;
_L2:
        if (!android_src.mms.a.a().contains(obj))
        {
            break MISSING_BLOCK_LABEL_361;
        }
        f1.a(g.PHOTO);
        list = null;
          goto _L5
        if (!android_src.mms.a.b().contains(obj))
        {
            break MISSING_BLOCK_LABEL_386;
        }
        f1.a(g.AUDIO);
        list = null;
          goto _L5
        if (!android_src.mms.a.c().contains(obj))
        {
            break MISSING_BLOCK_LABEL_411;
        }
        f1.a(g.VIDEO);
        list = null;
          goto _L5
        if (android_src.mms.a.a(((String) (obj))))
        {
            f1.a(g.TEXT);
        }
        list = null;
          goto _L5
        cursor.close();
        return ey1.a();
        if (true) goto _L7; else goto _L6
_L6:
    }

    long a(Message message, Set set)
    {
        set = a(set);
        set.a(a(message));
        a(((z) (set)));
        set.b("personal".getBytes());
        set.a(System.currentTimeMillis() / 1000L);
        return Long.parseLong(t.a(c).a(set, android_src.c.g.a).getLastPathSegment());
    }

    Message a(long l)
    {
        es es1 = b(hq.a(new Long[] {
            Long.valueOf(l)
        }));
        if (es1.size() > 0)
        {
            return (Message)es1.get(0);
        } else
        {
            return null;
        }
    }

    es a(com.facebook.orca.sms.b b1)
    {
        et et1;
        et1 = es.e();
        Object obj;
        int i;
        if (b1.c() != null)
        {
            obj = com.facebook.d.d.e.c("date", Long.toString(b1.c().longValue() / 1000L));
        } else
        {
            obj = com.facebook.d.d.e.b("date", Long.toString(b1.d().longValue() / 1000L));
        }
        obj = com.facebook.d.d.e.a(new com.facebook.d.d.j[] {
            com.facebook.d.d.e.a("thread_id", Long.toString(b1.a())), com.facebook.d.d.e.a("m_type IN (128, 132) AND msg_box IN (1, 2)"), obj
        });
        b1 = c.getContentResolver().query(d.a, com.facebook.orca.sms.bh.d, ((com.facebook.d.d.j) (obj)).a(), ((com.facebook.d.d.j) (obj)).b(), (new StringBuilder()).append("date DESC LIMIT ").append(b1.b() + 1).toString());
        i = b1.getColumnIndex("_id");
        for (; b1.moveToNext(); et1.b(Long.valueOf(b1.getLong(i)))) { }
        break MISSING_BLOCK_LABEL_190;
        obj;
        b1.close();
        throw obj;
        b1.close();
        return et1.b();
    }

    es a(com.facebook.orca.sms.c c1)
    {
        return b(b(c1));
    }

    es a(es es1)
    {
        et et1 = es.e();
        Object obj = hq.a();
        for (Iterator iterator = es1.iterator(); iterator.hasNext(); ((List) (obj)).add(Long.valueOf(((com.facebook.orca.sms.f)iterator.next()).b()))) { }
        obj = b(((List) (obj)));
        for (int i = 0; i < es1.size(); i++)
        {
            com.facebook.orca.sms.f f1 = (com.facebook.orca.sms.f)es1.get(i);
            Message message = (Message)((es) (obj)).get(i);
            et1.b(com.facebook.orca.sms.f.a(f1, message.k(), message.i()));
        }

        return et1.b();
    }

    es a(List list)
    {
        return b(c(list));
    }

    void a(Collection collection)
    {
        ContentValues contentvalues = new ContentValues();
        contentvalues.put("read", Integer.valueOf(1));
        c.getContentResolver().update(d.a, contentvalues, (new StringBuilder()).append("thread_id IN ").append(k.a(collection)).toString(), null);
    }

    es b(List list)
    {
        Object obj;
        ex ex1;
        if (list.isEmpty())
        {
            return es.d();
        }
        obj = es.e();
        ex1 = d(list);
        list = (new StringBuilder()).append("_id IN ").append(k.a(list)).toString();
        list = c.getContentResolver().query(d.a, com.facebook.orca.sms.bh.f, list, null, null);
_L1:
        boolean flag = list.moveToNext();
        if (!flag)
        {
            break MISSING_BLOCK_LABEL_119;
        }
        ((et) (obj)).b(a(list, ex1));
          goto _L1
        android_src.mms.d d1;
        d1;
        com.facebook.debug.log.b.e(a, "Error making Mms message", d1);
          goto _L1
        obj;
        list.close();
        throw obj;
        list.close();
        return ((et) (obj)).b();
    }

    void b(long l)
    {
        Uri uri = Uri.parse((new StringBuilder()).append("content://mms/").append(l).toString());
        Uri uri1 = Uri.withAppendedPath(uri, "part");
        Uri uri2 = Uri.withAppendedPath(uri, "addr");
        c.getContentResolver().delete(uri, null, null);
        c.getContentResolver().delete(uri1, null, null);
        c.getContentResolver().delete(uri2, null, null);
    }

}
