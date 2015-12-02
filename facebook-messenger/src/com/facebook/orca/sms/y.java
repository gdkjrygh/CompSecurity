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
import android_src.c.j;
import com.facebook.common.w.k;
import com.facebook.common.w.n;
import com.facebook.messages.model.threads.Message;
import com.facebook.messages.model.threads.ParticipantInfo;
import com.facebook.orca.threads.FolderCounts;
import com.facebook.orca.threads.FolderName;
import com.facebook.orca.threads.MessagesCollection;
import com.facebook.orca.threads.ThreadSummary;
import com.facebook.orca.threads.ThreadsCollection;
import com.facebook.orca.threads.m;
import com.facebook.orca.threads.p;
import com.facebook.orca.threads.r;
import com.facebook.orca.threads.v;
import com.facebook.prefs.shared.d;
import com.facebook.user.User;
import com.google.common.a.em;
import com.google.common.a.es;
import com.google.common.a.et;
import com.google.common.a.ex;
import com.google.common.a.ey;
import com.google.common.a.fi;
import com.google.common.a.gg;
import com.google.common.a.hq;
import com.google.common.a.ik;
import com.google.common.a.jr;
import com.google.common.a.kl;
import com.google.common.base.Preconditions;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import javax.inject.a;

// Referenced classes of package com.facebook.orca.sms:
//            f, r, bk, bn, 
//            c, d, e, b, 
//            a

public class y
{

    private static final Class a = com/facebook/orca/sms/y;
    private static String k[] = {
        "COUNT(*) AS num_threads", "SUM(read) AS read_count", "MAX(date) AS latest_message_time"
    };
    private final Context b;
    private final bn c;
    private final com.facebook.orca.sms.r d;
    private final com.facebook.orca.sms.a e;
    private final bk f;
    private final d g;
    private final r h;
    private final a i;
    private final a j;

    public y(Context context, bn bn1, com.facebook.orca.sms.r r1, com.facebook.orca.sms.a a1, bk bk1, d d1, r r2, 
            a a2, a a3)
    {
        b = context;
        c = bn1;
        d = r1;
        e = a1;
        f = bk1;
        g = d1;
        h = r2;
        i = a2;
        j = a3;
    }

    private transient es a(int l, es aes[])
    {
        et et1;
        int ai[];
        int l1;
        if (aes.length == 0)
        {
            return es.d();
        }
        et1 = es.e();
        l1 = 0;
        ai = new int[aes.length];
        for (int i1 = 0; i1 < aes.length; i1++)
        {
            l1 += aes[i1].size();
            ai[i1] = 0;
        }

          goto _L1
_L2:
        Message message;
        int k1;
        int i2;
        et1.b(message);
        ai[k1] = ai[k1] + 1;
        i2++;
_L3:
        if ((i2 < l || l == -1) && i2 < l1)
        {
            message = null;
            k1 = -1;
            int j1 = 0;
            while (j1 < aes.length) 
            {
                Message message1;
                if (ai[j1] < aes[j1].size())
                {
                    message1 = (Message)aes[j1].get(ai[j1]);
                } else
                {
                    message1 = null;
                }
                if (message == null || message1 != null && message1.f() > message.f())
                {
                    message = message1;
                    k1 = j1;
                }
                j1++;
            }
        } else
        {
            return et1.b();
        }
        if (true) goto _L2; else goto _L1
_L1:
        i2 = 0;
          goto _L3
    }

    private es a(es es1, es es2)
    {
        et et1 = es.e();
        int l = 0;
        do
        {
            for (int i1 = 0; i1 < es1.size() || l < es2.size();)
            {
                if (i1 == es1.size())
                {
                    et1.b(es2.get(l));
                    l++;
                } else
                if (l == es2.size())
                {
                    et1.b(es1.get(i1));
                    i1++;
                } else
                {
                    f f1 = (f)es1.get(i1);
                    int k1;
                    if (((f)es2.get(l)).c() < f1.c())
                    {
                        et1.b(es1.get(i1));
                        int j1 = i1 + 1;
                        i1 = l;
                        l = j1;
                    } else
                    {
                        et1.b(es2.get(l));
                        int l1 = l + 1;
                        l = i1;
                        i1 = l1;
                    }
                    k1 = l;
                    l = i1;
                    i1 = k1;
                }
            }

            return et1.b();
        } while (true);
    }

    private es a(es es1, es es2, int l)
    {
        jr jr1 = gg.g(es1.h_());
        jr jr2 = gg.g(es2.h_());
        int j1 = 0;
        int i1;
        for (i1 = 0; i1 + j1 < l && (jr1.hasNext() || jr2.hasNext());)
        {
            if (!jr1.hasNext())
            {
                jr2.next();
                j1++;
            } else
            if (!jr2.hasNext())
            {
                jr1.next();
                i1++;
            } else
            if (((f)jr2.a()).c() < ((f)jr1.a()).c())
            {
                jr1.next();
                i1++;
            } else
            {
                jr2.next();
                j1++;
            }
        }

        es1 = es1.a(0, i1);
        es2 = es2.a(0, j1);
        return a(es1, d.a(es2));
    }

    private es a(List list, ex ex1)
    {
        java.util.ArrayList arraylist = hq.a();
        list = list.iterator();
        long l = 0x7fffffffffffffffL;
        do
        {
            if (!list.hasNext())
            {
                break;
            }
            f f1 = (f)list.next();
            long l2;
            boolean flag;
            if (f1.c() < l)
            {
                flag = true;
            } else
            {
                flag = false;
            }
            Preconditions.checkArgument(flag);
            l2 = f1.c();
            l = l2;
            if (ex1.e(Long.valueOf(f1.a())) != null)
            {
                arraylist.add(f1);
                l = l2;
            }
        } while (true);
        ParticipantInfo participantinfo1 = f.a();
        et et1 = es.e();
        Iterator iterator = arraylist.iterator();
        while (iterator.hasNext()) 
        {
            f f2 = (f)iterator.next();
            long l1 = f2.a();
            long l3 = f2.c() * 0xf4240L;
            Object obj = hq.a();
            User user;
            for (list = ex1.e(Long.valueOf(l1)).iterator(); list.hasNext(); ((List) (obj)).add(f.a(user)))
            {
                user = (User)list.next();
            }

            String s;
            java.util.ArrayList arraylist1;
            boolean flag1;
            if (((List) (obj)).size() == 1)
            {
                list = ((ParticipantInfo)((List) (obj)).get(0)).e();
                flag1 = true;
            } else
            {
                flag1 = false;
                list = null;
            }
            ((List) (obj)).add(participantinfo1);
            arraylist1 = hq.a();
            ParticipantInfo participantinfo;
            for (obj = ((List) (obj)).iterator(); ((Iterator) (obj)).hasNext(); arraylist1.add((new p()).a(m.a(l1)).a(participantinfo).f()))
            {
                participantinfo = (ParticipantInfo)((Iterator) (obj)).next();
            }

            obj = f2.e();
            s = f2.f();
            if (n.a(((CharSequence) (obj))))
            {
                obj = s;
            }
            et1.b((new v()).a(m.a(l1)).c(l3).a(l3).b(l3).d(f2.c()).a(arraylist1).a(flag1).a(list).d(((String) (obj))).a(f2.g()).c(true).b(f2.d()).a(FolderName.d).d(true).z());
        }
        return et1.b();
    }

    private ex a(Collection collection)
    {
        collection = b(collection);
        Object obj = c(collection.p());
        java.util.HashMap hashmap = ik.a();
        Object obj1;
        long l;
        for (obj = ((Map) (obj)).entrySet().iterator(); ((Iterator) (obj)).hasNext(); hashmap.put(Long.valueOf(l), f.a(((String) (obj1)))))
        {
            obj1 = (java.util.Map.Entry)((Iterator) (obj)).next();
            l = ((Long)((java.util.Map.Entry) (obj1)).getKey()).longValue();
            obj1 = (String)((java.util.Map.Entry) (obj1)).getValue();
        }

        obj = ex.j();
        for (Iterator iterator = collection.l().iterator(); iterator.hasNext();)
        {
            long l1 = ((Long)iterator.next()).longValue();
            Iterator iterator1 = collection.e(Long.valueOf(l1)).iterator();
            while (iterator1.hasNext()) 
            {
                long l2 = ((Long)iterator1.next()).longValue();
                if (hashmap.containsKey(Long.valueOf(l2)))
                {
                    ((ey) (obj)).a(Long.valueOf(l1), hashmap.get(Long.valueOf(l2)));
                }
            }
        }

        return ((ey) (obj)).a();
    }

    private ex b(Collection collection)
    {
        ey ey1;
        if (collection.isEmpty())
        {
            return ex.c();
        }
        ey1 = ex.j();
        collection = (new StringBuilder()).append("_id IN ").append(com.facebook.common.w.k.a(collection)).toString();
        Uri uri = j.b.buildUpon().appendQueryParameter("simple", "true").build();
        collection = b.getContentResolver().query(uri, new String[] {
            "_id", "recipient_ids"
        }, collection, null, "date DESC");
        int i1;
        int j1;
        i1 = collection.getColumnIndex("_id");
        j1 = collection.getColumnIndex("recipient_ids");
_L4:
        String as[];
        int k1;
        long l1;
        if (!collection.moveToNext())
        {
            break; /* Loop/switch isn't completed */
        }
        l1 = collection.getLong(i1);
        as = collection.getString(j1).split(" ");
        k1 = as.length;
        int l = 0;
_L2:
        String s;
        if (l >= k1)
        {
            break; /* Loop/switch isn't completed */
        }
        s = as[l];
        if (!n.a(s))
        {
            ey1.a(Long.valueOf(l1), Long.valueOf(Long.parseLong(s)));
        }
        l++;
        if (true) goto _L2; else goto _L1
_L1:
        if (true) goto _L4; else goto _L3
_L3:
        collection.close();
        return ey1.a();
        Exception exception;
        exception;
        collection.close();
        throw exception;
    }

    private Map c(Collection collection)
    {
        Object obj;
        obj = ik.a();
        if (collection.isEmpty())
        {
            return ((Map) (obj));
        }
        collection = (new StringBuilder()).append("_id IN ").append(com.facebook.common.w.k.a(collection)).toString();
        Uri uri = Uri.withAppendedPath(j.a, "canonical-addresses");
        collection = b.getContentResolver().query(uri, new String[] {
            "_id", "address"
        }, collection, null, null);
        int l = collection.getColumnIndex("address");
        int i1 = collection.getColumnIndex("_id");
        for (; collection.moveToNext(); ((Map) (obj)).put(Long.valueOf(collection.getLong(i1)), collection.getString(l))) { }
        break MISSING_BLOCK_LABEL_149;
        obj;
        collection.close();
        throw obj;
        collection.close();
        return ((Map) (obj));
    }

    private es e(long l)
    {
        return es.a(a(es.a(Long.valueOf(l))).p());
    }

    com.facebook.orca.sms.d a(c c1)
    {
        Object obj;
        es es1;
        es es2;
        int l;
        boolean flag;
        if (((Boolean)i.b()).booleanValue())
        {
            es1 = c.a(c1);
            obj = d.a(c1);
        } else
        {
            es1 = c.b(c1);
            obj = es.d();
        }
        es2 = a(es1, ((es) (obj)), c1.a());
        l = es1.size();
        if (((es) (obj)).size() + l <= c1.a())
        {
            flag = true;
        } else
        {
            flag = false;
        }
        c1 = hq.a();
        for (obj = es2.iterator(); ((Iterator) (obj)).hasNext(); c1.add(Long.valueOf(((f)((Iterator) (obj)).next()).a()))) { }
        c1 = a(((Collection) (c1)));
        return new com.facebook.orca.sms.d(new ThreadsCollection(a(((List) (es2)), ((ex) (c1))), flag), es.a(c1.p()));
    }

    e a(long l)
    {
        es es1 = a(((List) (es.a(Long.valueOf(l)))));
        if (es1.size() > 0)
        {
            return (e)es1.get(0);
        } else
        {
            return new e(null, es.d());
        }
    }

    e a(String s)
    {
        return a(b(s));
    }

    FolderCounts a()
    {
        Object obj;
        obj = j.b.buildUpon().appendQueryParameter("simple", "true").build();
        obj = b.getContentResolver().query(((Uri) (obj)), k, null, null, null);
        if (!((Cursor) (obj)).moveToNext()) goto _L2; else goto _L1
_L1:
        int l;
        int i1;
        long l1;
        l = ((Cursor) (obj)).getInt(((Cursor) (obj)).getColumnIndex("num_threads"));
        i1 = ((Cursor) (obj)).getInt(((Cursor) (obj)).getColumnIndex("read_count"));
        l1 = ((Cursor) (obj)).getLong(((Cursor) (obj)).getColumnIndex("latest_message_time"));
        l -= i1;
_L4:
        ((Cursor) (obj)).close();
        long l2 = g.a(com.facebook.orca.prefs.n.e, -1L);
        Exception exception;
        int j1;
        if (l2 < l1)
        {
            j1 = 1;
        } else
        {
            j1 = 0;
        }
        return new FolderCounts(l, j1, l2, 0xf4240L * l1);
        exception;
        ((Cursor) (obj)).close();
        throw exception;
_L2:
        l1 = -1L;
        l = 0;
        if (true) goto _L4; else goto _L3
_L3:
    }

    MessagesCollection a(b b1)
    {
        String s = m.a(b1.a());
        if (b1.b() == 0)
        {
            return new MessagesCollection(s, es.d(), false);
        }
        es es5 = e(b1.a());
        es es1;
        es es2;
        es es3;
        es es4;
        es es6;
        es es7;
        boolean flag;
        if (((Boolean)i.b()).booleanValue())
        {
            es2 = c.a(b1);
            es1 = d.a(b1);
        } else
        {
            es2 = c.a(b1);
            es1 = es.d();
        }
        es6 = c.c(es2);
        es7 = d.b(es1);
        es3 = es.d();
        es4 = es.d();
        if (((Boolean)j.b()).booleanValue() && es5.size() == 1)
        {
            es3 = e.a(b1, es5);
            es4 = e.a(es3, s);
        }
        es4 = a(b1.b(), new es[] {
            es6, es7, es4
        });
        if (es2.size() + es1.size() + es3.size() < b1.b())
        {
            flag = true;
        } else
        {
            flag = false;
        }
        return new MessagesCollection(s, es4, flag);
    }

    es a(List list)
    {
        Object obj;
        Object obj1;
        if (((Boolean)i.b()).booleanValue())
        {
            obj1 = c.a(list);
            obj = d.a(list);
        } else
        {
            obj1 = c.b(list);
            obj = es.d();
        }
        obj = a(((es) (obj1)), ((es) (obj)), list.size());
        list = a(((Collection) (list)));
        obj1 = a(((List) (obj)), ((ex) (list)));
        obj = es.e();
        ThreadSummary threadsummary;
        for (obj1 = ((es) (obj1)).iterator(); ((Iterator) (obj1)).hasNext(); ((et) (obj)).b(new e(threadsummary, es.a(list.e(Long.valueOf(m.c(threadsummary.a())))))))
        {
            threadsummary = (ThreadSummary)((Iterator) (obj1)).next();
        }

        return ((et) (obj)).b();
    }

    public long b(String s)
    {
        s = kl.a(new String[] {
            s
        });
        return android_src.c.m.a(b, s);
    }

    public Message b(long l)
    {
        return a(com.facebook.orca.sms.b.a(l, 1, -1L)).c();
    }

    public Set b()
    {
        Object obj;
        Object obj1;
        obj = kl.a();
        obj1 = j.b.buildUpon().appendQueryParameter("simple", "true").build();
        obj1 = b.getContentResolver().query(((Uri) (obj1)), new String[] {
            "_id"
        }, "read=0", null, null);
        while (((Cursor) (obj1)).moveToNext()) 
        {
            ((Set) (obj)).add(Long.valueOf(((Cursor) (obj1)).getLong(0)));
        }
        break MISSING_BLOCK_LABEL_88;
        obj;
        ((Cursor) (obj1)).close();
        throw obj;
        ((Cursor) (obj1)).close();
        if (((Set) (obj)).size() != 0)
        {
            d.a(((Collection) (obj)));
            c.a(((Collection) (obj)));
        }
        return ((Set) (obj));
    }

    void c(long l)
    {
        Uri uri = ContentUris.withAppendedId(j.b, l);
        ContentValues contentvalues = new ContentValues();
        contentvalues.put("read", Integer.valueOf(1));
        b.getContentResolver().update(uri, contentvalues, null, null);
    }

    void c(String s)
    {
        if (m.h(s))
        {
            c.b(m.d(s));
            return;
        }
        if (m.i(s))
        {
            d.b(m.e(s));
            return;
        } else
        {
            throw new Exception("Message id is not an Mms or Sms id");
        }
    }

    void d(long l)
    {
        Uri uri = ContentUris.withAppendedId(j.b, l);
        b.getContentResolver().delete(uri, null, null);
    }

}
