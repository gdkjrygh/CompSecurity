// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.orca.g;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.net.Uri;
import com.facebook.common.w.k;
import com.facebook.common.w.n;
import com.facebook.d.d.f;
import com.facebook.d.d.j;
import com.facebook.debug.d.e;
import com.facebook.fbservice.c.b;
import com.facebook.messages.model.threads.Message;
import com.facebook.messages.model.threads.SendError;
import com.facebook.orca.server.FetchMoreMessagesResult;
import com.facebook.orca.server.FetchThreadResult;
import com.facebook.orca.threads.FolderName;
import com.facebook.orca.threads.MessagesCollection;
import com.facebook.orca.threads.ThreadParticipant;
import com.facebook.orca.threads.ThreadSummary;
import com.facebook.orca.threads.v;
import com.facebook.user.UserKey;
import com.google.common.a.es;
import com.google.common.a.ik;
import com.google.common.a.kl;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Set;

// Referenced classes of package com.facebook.orca.g:
//            aa, p, r, o, 
//            a, w, f, q, 
//            g, i, j, e, 
//            y

class h
{

    private static final String m[] = {
        "thread_id", "thread_fbid", "action_id", "refetch_action_id", "last_visible_action_id", "name", "participants", "former_participants", "object_participants", "senders", 
        "single_recipient_thread", "single_recipient_user_key", "snippet", "snippet_sender", "admin_snippet", "timestamp_ms", "unread", "pic_hash", "can_reply_to", "pic", 
        "is_subscribed", "last_fetch_time_ms", "folder", "draft"
    };
    private static final String n[] = {
        "msg_id"
    };
    private static final String o[] = {
        "thread_id", "msg_id", "action_id", "subject", "text", "sender", "timestamp_ms", "timestamp_sent_ms", "msg_type", "affected_users", 
        "mms_attachments", "attachments", "shares", "coordinates", "offline_threading_id", "source", "is_non_authoritative", "pending_send_media_attachment", "handled_internally_time", "pending_shares", 
        "pending_attachment_fbid", "client_tags", "send_error"
    };
    private final aa a;
    private final y b;
    private final com.facebook.orca.g.j c;
    private final r d;
    private final a e;
    private final w f;
    private final com.facebook.orca.g.f g;
    private final q h;
    private final o i;
    private final g j;
    private final p k;
    private final com.facebook.orca.g.e l;

    h(aa aa1, y y, com.facebook.orca.g.j j1, r r1, a a1, w w1, com.facebook.orca.g.f f1, 
            q q1, o o1, g g1, p p1, com.facebook.orca.g.e e1)
    {
        a = aa1;
        b = y;
        c = j1;
        d = r1;
        e = a1;
        f = w1;
        g = f1;
        h = q1;
        i = o1;
        j = g1;
        k = p1;
        l = e1;
    }

    private String a(UserKey userkey)
    {
        Object obj1;
        Object obj = null;
        obj1 = a.e();
        userkey = userkey.c();
        obj1 = ((SQLiteDatabase) (obj1)).query("threads", new String[] {
            "thread_id"
        }, "single_recipient_user_key=?", new String[] {
            userkey
        }, null, null, null);
        userkey = obj;
        if (((Cursor) (obj1)).moveToNext())
        {
            userkey = ((Cursor) (obj1)).getString(0);
        }
        ((Cursor) (obj1)).close();
        return userkey;
        userkey;
        ((Cursor) (obj1)).close();
        throw userkey;
    }

    private LinkedHashMap a(j j1, String s, int i1)
    {
        e e1;
        SQLiteDatabase sqlitedatabase;
        e1 = com.facebook.debug.d.e.a("DbFetchThreadHandler.doMessagesQuery");
        sqlitedatabase = a.e();
        sqlitedatabase.beginTransaction();
        LinkedHashMap linkedhashmap;
        java.util.HashSet hashset;
        linkedhashmap = ik.b();
        hashset = kl.a();
        String s1 = j1.a();
        j1 = j1.b();
        j1 = sqlitedatabase.query("messages", n, s1, j1, null, null, s, Integer.toString(i1));
_L1:
        Message message;
        do
        {
            if (!j1.moveToNext())
            {
                break MISSING_BLOCK_LABEL_139;
            }
            s = j1.getString(0);
            message = k.a(s);
            linkedhashmap.put(s, message);
        } while (message != null);
        hashset.add(s);
          goto _L1
        s;
        j1.close();
        throw s;
        j1;
        sqlitedatabase.endTransaction();
        e1.a();
        throw j1;
        j1.close();
        j1 = (new StringBuilder()).append("msg_id IN ").append(com.facebook.common.w.k.b(hashset)).toString();
        j1 = sqlitedatabase.query("messages", o, j1, null, null, null, null);
        int k1;
        int l1;
        int i2;
        int j2;
        int k2;
        int l2;
        int i3;
        int j3;
        int k3;
        int l3;
        int i4;
        int j4;
        int k4;
        int l4;
        int i5;
        int j5;
        int k5;
        int l5;
        int i6;
        int j6;
        int k6;
        int l6;
        i1 = j1.getColumnIndex("thread_id");
        k1 = j1.getColumnIndex("msg_id");
        l1 = j1.getColumnIndex("action_id");
        i2 = j1.getColumnIndex("subject");
        j2 = j1.getColumnIndex("text");
        k2 = j1.getColumnIndex("sender");
        l2 = j1.getColumnIndex("timestamp_ms");
        i3 = j1.getColumnIndex("timestamp_sent_ms");
        j3 = j1.getColumnIndex("msg_type");
        k3 = j1.getColumnIndex("affected_users");
        l3 = j1.getColumnIndex("mms_attachments");
        i4 = j1.getColumnIndex("attachments");
        j4 = j1.getColumnIndex("shares");
        k4 = j1.getColumnIndex("coordinates");
        l4 = j1.getColumnIndex("client_tags");
        i5 = j1.getColumnIndex("offline_threading_id");
        j5 = j1.getColumnIndex("source");
        k5 = j1.getColumnIndex("is_non_authoritative");
        l5 = j1.getColumnIndex("pending_send_media_attachment");
        i6 = j1.getColumnIndex("handled_internally_time");
        j6 = j1.getColumnIndex("pending_shares");
        k6 = j1.getColumnIndex("pending_attachment_fbid");
        l6 = j1.getColumnIndex("send_error");
_L2:
        if (!j1.moveToNext())
        {
            break MISSING_BLOCK_LABEL_809;
        }
        s = j1.getString(k1);
        long l7;
        boolean flag;
        if (!j1.isNull(k5) && j1.getInt(k5) != 0)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        l7 = j1.getLong(i6);
        s = (new com.facebook.messages.model.threads.e()).a(s).b(j1.getString(i1)).c(j1.getLong(l1)).c(j1.getString(i2)).d(j1.getString(j2)).a(d.a(j1.getString(k2))).a(j1.getLong(l2)).b(j1.getLong(i3)).a(j1.getInt(j3)).d(d.b(j1.getString(k3))).a(i.a(j1.getString(l3))).b(e.a(j1.getString(i4))).c(f.a(j1.getString(j4))).a(g.a(j1.getString(k4))).a(h.a(j1.getString(l4))).e(j1.getString(i5)).f(j1.getString(j5)).a(flag).e(i.a(j1.getString(l5))).d(l7).f(f.a(j1.getString(j6))).g(j1.getString(k6)).a(SendError.a(j1.getString(l6))).B();
        linkedhashmap.put(s.d(), s);
        k.a(s);
          goto _L2
        s;
        j1.close();
        throw s;
        j1.close();
        sqlitedatabase.setTransactionSuccessful();
        sqlitedatabase.endTransaction();
        e1.a();
        return linkedhashmap;
    }

    private LinkedHashMap b(String s, long l1, long l2, int i1)
    {
        f f1 = com.facebook.d.d.e.a();
        f1.a(com.facebook.d.d.e.a("thread_id", s));
        if (l1 != -1L)
        {
            f1.a(com.facebook.d.d.e.d("timestamp_ms", Long.toString(l1)));
        }
        if (l2 != -1L)
        {
            f1.a(com.facebook.d.d.e.b("timestamp_ms", Long.toString(l2)));
        }
        return a(f1, "timestamp_ms DESC", i1);
    }

    private i d(String s)
    {
        SQLiteDatabase sqlitedatabase;
        Cursor cursor;
        sqlitedatabase = a.e();
        cursor = sqlitedatabase.query("threads", m, "thread_id=?", new String[] {
            s
        }, null, null, null);
        int i1;
        int j1;
        int k1;
        int l1;
        int i2;
        int j2;
        int k2;
        int l2;
        int i3;
        int j3;
        int k3;
        int l3;
        int i4;
        int j4;
        int k4;
        int l4;
        int i5;
        int j5;
        int k5;
        int l5;
        int i6;
        int j6;
        int k6;
        int l6;
        i1 = cursor.getColumnIndexOrThrow("thread_id");
        j1 = cursor.getColumnIndexOrThrow("thread_fbid");
        k1 = cursor.getColumnIndexOrThrow("action_id");
        l1 = cursor.getColumnIndexOrThrow("refetch_action_id");
        i2 = cursor.getColumnIndexOrThrow("last_visible_action_id");
        j2 = cursor.getColumnIndexOrThrow("name");
        k2 = cursor.getColumnIndexOrThrow("participants");
        l2 = cursor.getColumnIndexOrThrow("former_participants");
        i3 = cursor.getColumnIndexOrThrow("object_participants");
        j3 = cursor.getColumnIndexOrThrow("senders");
        k3 = cursor.getColumnIndexOrThrow("single_recipient_thread");
        l3 = cursor.getColumnIndexOrThrow("snippet");
        i4 = cursor.getColumnIndexOrThrow("snippet_sender");
        j4 = cursor.getColumnIndexOrThrow("admin_snippet");
        k4 = cursor.getColumnIndexOrThrow("timestamp_ms");
        l4 = cursor.getColumnIndexOrThrow("unread");
        i5 = cursor.getColumnIndexOrThrow("pic_hash");
        j5 = cursor.getColumnIndexOrThrow("can_reply_to");
        k5 = cursor.getColumnIndexOrThrow("pic");
        l5 = cursor.getColumnIndexOrThrow("single_recipient_user_key");
        i6 = cursor.getColumnIndexOrThrow("last_fetch_time_ms");
        j6 = cursor.getColumnIndexOrThrow("is_subscribed");
        k6 = cursor.getColumnIndexOrThrow("folder");
        l6 = cursor.getColumnIndexOrThrow("draft");
        if (!cursor.moveToNext()) goto _L2; else goto _L1
_L1:
        Object obj;
        obj = new v();
        ((v) (obj)).a(cursor.getString(i1));
        ((v) (obj)).b(cursor.getString(j1));
        ((v) (obj)).c(cursor.getLong(k1));
        ((v) (obj)).a(cursor.getLong(l1));
        ((v) (obj)).b(cursor.getLong(i2));
        if (!cursor.isNull(j2))
        {
            ((v) (obj)).c(cursor.getString(j2));
        }
        ((v) (obj)).a(d.c(cursor.getString(k2)));
        ((v) (obj)).b(d.c(cursor.getString(l2)));
        ((v) (obj)).c(d.b(cursor.getString(i3)));
        ((v) (obj)).d(d.b(cursor.getString(j3)));
        ((v) (obj)).a(d.a(cursor.getString(i4)));
        long l7;
        boolean flag;
        if (cursor.getInt(k3) != 0)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        ((v) (obj)).a(flag);
        ((v) (obj)).d(cursor.getString(l3));
        ((v) (obj)).e(cursor.getString(j4));
        ((v) (obj)).d(cursor.getLong(k4));
        if (cursor.getInt(l4) != 0)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        ((v) (obj)).b(flag);
        ((v) (obj)).f(com.facebook.common.w.n.b(cursor.getString(i5)));
        if (cursor.getInt(j5) != 0)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        ((v) (obj)).c(flag);
        if (!cursor.isNull(k5))
        {
            ((v) (obj)).a(Uri.parse(cursor.getString(k5)));
        }
        ((v) (obj)).a(UserKey.a(cursor.getString(l5)));
        if (cursor.getInt(j6) != 0)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        ((v) (obj)).d(flag);
        ((v) (obj)).a(FolderName.a(cursor.getString(k6)));
        ((v) (obj)).a(j.a(cursor.getString(l6)));
        l7 = cursor.getLong(i6);
_L4:
        cursor.close();
        if (obj == null)
        {
            return null;
        }
        break MISSING_BLOCK_LABEL_805;
        s;
        cursor.close();
        throw s;
        long l8 = System.currentTimeMillis();
        f f1 = com.facebook.d.d.e.a(new j[] {
            com.facebook.d.d.e.a("thread_id", s), com.facebook.d.d.e.a("msg_type", Integer.toString(901)), com.facebook.d.d.e.c("timestamp_ms", Long.toString(l8 - 0x5265c00L))
        });
        s = f1.a();
        String as[] = f1.b();
        s = sqlitedatabase.query(true, "messages", new String[] {
            "thread_id"
        }, s, as, "thread_id", null, null, null);
        if (s.moveToNext())
        {
            ((v) (obj)).e(true);
        }
        s.close();
        return new i(((v) (obj)).z(), l7);
        obj;
        s.close();
        throw obj;
_L2:
        obj = null;
        l7 = -1L;
        if (true) goto _L4; else goto _L3
_L3:
    }

    Message a(String s)
    {
        Message message = k.a(s);
        if (message != null)
        {
            return message;
        } else
        {
            return (Message)a(com.facebook.d.d.e.a("msg_id", s), null, 1).get(s);
        }
    }

    FetchMoreMessagesResult a(UserKey userkey, long l1, long l2, int i1)
    {
        userkey = a(userkey);
        if (userkey != null)
        {
            return a(((String) (userkey)), l1, l2, i1);
        } else
        {
            return FetchMoreMessagesResult.a;
        }
    }

    FetchMoreMessagesResult a(String s, long l1, long l2, int i1)
    {
        LinkedHashMap linkedhashmap = b(s, l1, l2, i1);
        boolean flag = false;
        if (linkedhashmap.containsKey(s))
        {
            flag = true;
            linkedhashmap.remove(s);
        }
        s = new MessagesCollection(s, es.a(linkedhashmap.values()), flag);
        return new FetchMoreMessagesResult(b.FROM_CACHE_UP_TO_DATE, s, -1L);
    }

    FetchThreadResult a(UserKey userkey, int i1)
    {
        userkey = a(userkey);
        if (userkey != null)
        {
            return a(((String) (userkey)), i1);
        } else
        {
            return FetchThreadResult.a;
        }
    }

    FetchThreadResult a(String s, int i1)
    {
        i j1;
        ThreadSummary threadsummary;
        Object obj1;
        es es1;
        long l2;
        l2 = -1L;
        j1 = d(s);
        if (j1 == null)
        {
            return FetchThreadResult.a;
        }
        threadsummary = j1.a;
        obj1 = b(s, -1L, -1L, i1);
        java.util.HashSet hashset = kl.a();
        for (Iterator iterator = threadsummary.j().iterator(); iterator.hasNext(); hashset.add(((ThreadParticipant)iterator.next()).d())) { }
        for (Iterator iterator1 = threadsummary.B().iterator(); iterator1.hasNext(); hashset.add(((ThreadParticipant)iterator1.next()).d())) { }
        es1 = c.a(hashset);
        if (threadsummary.e() != 0L) goto _L2; else goto _L1
_L1:
        Object obj = b.FROM_CACHE_UP_TO_DATE;
_L4:
        boolean flag = false;
        if (((LinkedHashMap) (obj1)).containsKey(s))
        {
            flag = true;
            ((LinkedHashMap) (obj1)).remove(s);
        }
        s = new MessagesCollection(threadsummary.a(), es.a(((LinkedHashMap) (obj1)).values()), flag);
        obj1 = s.b().iterator();
        if (((Iterator) (obj1)).hasNext())
        {
            obj1 = (Message)((Iterator) (obj1)).next();
            l.a(((Message) (obj1)).f());
        }
        return new FetchThreadResult(((b) (obj)), threadsummary, s, es1, null, j1.b);
_L2:
        obj = ((LinkedHashMap) (obj1)).values().iterator();
        long l1;
        do
        {
            l1 = l2;
            if (!((Iterator) (obj)).hasNext())
            {
                break;
            }
            Message message = (Message)((Iterator) (obj)).next();
            if (message.y())
            {
                continue;
            }
            l1 = message.s();
            break;
        } while (true);
        if (l1 == threadsummary.e())
        {
            obj = b.FROM_CACHE_UP_TO_DATE;
        } else
        {
            obj = b.FROM_CACHE_STALE;
        }
        if (true) goto _L4; else goto _L3
_L3:
    }

    Message b(String s)
    {
        s = a(com.facebook.d.d.e.a("offline_threading_id", s), null, 1);
        if (s.isEmpty())
        {
            return null;
        } else
        {
            return (Message)s.values().iterator().next();
        }
    }

    Message c(String s)
    {
        s = a(com.facebook.d.d.e.a(new j[] {
            com.facebook.d.d.e.a("msg_type", Integer.toString(900)), com.facebook.d.d.e.a("thread_id", s)
        }), "timestamp_sent_ms", 1);
        if (s.isEmpty())
        {
            return null;
        } else
        {
            return (Message)s.values().iterator().next();
        }
    }

}
