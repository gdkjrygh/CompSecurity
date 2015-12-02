// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.orca.g;

import android.content.ContentValues;
import android.database.Cursor;
import android.database.SQLException;
import android.database.sqlite.SQLiteDatabase;
import android.net.Uri;
import com.facebook.common.w.k;
import com.facebook.common.w.m;
import com.facebook.d.d.f;
import com.facebook.debug.log.b;
import com.facebook.messages.model.threads.Message;
import com.facebook.messages.model.threads.ParticipantInfo;
import com.facebook.messages.model.threads.SendError;
import com.facebook.messages.model.threads.c;
import com.facebook.messages.model.threads.e;
import com.facebook.orca.compose.MessageDraft;
import com.facebook.orca.server.DeleteMessagesParams;
import com.facebook.orca.server.DeleteThreadParams;
import com.facebook.orca.server.DeliveredReceiptParams;
import com.facebook.orca.server.FetchGroupThreadsParams;
import com.facebook.orca.server.FetchGroupThreadsResult;
import com.facebook.orca.server.FetchMoreMessagesResult;
import com.facebook.orca.server.FetchMoreThreadsResult;
import com.facebook.orca.server.FetchThreadListResult;
import com.facebook.orca.server.FetchThreadResult;
import com.facebook.orca.server.MarkThreadParams;
import com.facebook.orca.server.NewMessageResult;
import com.facebook.orca.server.ReadReceiptParams;
import com.facebook.orca.server.ai;
import com.facebook.orca.server.j;
import com.facebook.orca.threads.FolderCounts;
import com.facebook.orca.threads.FolderName;
import com.facebook.orca.threads.MessagesCollection;
import com.facebook.orca.threads.ThreadParticipant;
import com.facebook.orca.threads.ThreadSummary;
import com.facebook.orca.threads.ThreadsCollection;
import com.facebook.orca.threads.i;
import com.facebook.orca.threads.p;
import com.facebook.orca.threads.v;
import com.facebook.orca.threads.x;
import com.facebook.user.User;
import com.facebook.user.UserKey;
import com.google.common.a.es;
import com.google.common.a.ev;
import com.google.common.a.fi;
import com.google.common.a.hq;
import com.google.common.a.ik;
import com.google.common.a.kl;
import com.google.common.base.Objects;
import java.io.IOException;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import javax.inject.a;

// Referenced classes of package com.facebook.orca.g:
//            aa, s, y, l, 
//            o, w, k, r, 
//            g, h, a, f, 
//            q

class n
{

    private final Class a = com/facebook/orca/g/n;
    private final aa b;
    private final y c;
    private final h d;
    private final com.facebook.orca.g.k e;
    private final r f;
    private final com.facebook.orca.g.a g;
    private final w h;
    private final com.facebook.orca.g.f i;
    private final q j;
    private final o k;
    private final g l;
    private final i m;
    private final a n;
    private final x o;

    n(aa aa1, y y1, h h1, com.facebook.orca.g.k k1, r r1, com.facebook.orca.g.a a1, w w1, 
            com.facebook.orca.g.f f1, q q1, o o1, g g1, i i1, a a2, x x1)
    {
        b = aa1;
        c = y1;
        d = h1;
        e = k1;
        f = r1;
        g = a1;
        h = w1;
        i = f1;
        j = q1;
        k = o1;
        l = g1;
        m = i1;
        n = a2;
        o = x1;
    }

    private ContentValues a(FolderName foldername, ThreadSummary threadsummary)
    {
        ContentValues contentvalues = new ContentValues();
        contentvalues.put("folder", foldername.b());
        contentvalues.put("thread_id", threadsummary.a());
        contentvalues.put("timestamp_ms", Long.valueOf(threadsummary.l()));
        return contentvalues;
    }

    private ThreadParticipant a(ThreadParticipant threadparticipant, boolean flag, long l1, String s1)
    {
        p p1 = new p();
        p1.a(threadparticipant);
        if (flag)
        {
            p1.a(l1);
        } else
        {
            p1.b(s1);
        }
        return p1.f();
    }

    private ThreadSummary a(ThreadSummary threadsummary, ThreadSummary threadsummary1)
    {
        threadsummary1 = threadsummary1.z();
        if (threadsummary1 == null)
        {
            return threadsummary;
        } else
        {
            threadsummary = (new v()).a(threadsummary);
            threadsummary.a(threadsummary1);
            return threadsummary.z();
        }
    }

    private Map a(Set set)
    {
        SQLiteDatabase sqlitedatabase = b.e();
        Map map = c(set);
        sqlitedatabase.delete("messages", (new StringBuilder()).append("msg_id IN ").append(com.facebook.common.w.k.b(set)).toString(), null);
        return map;
    }

    private void a(Message message, boolean flag)
    {
        a(new MessagesCollection(message.e(), es.a(message), false), flag);
    }

    private void a(FolderName foldername)
    {
        SQLiteDatabase sqlitedatabase;
        sqlitedatabase = b.e();
        sqlitedatabase.beginTransaction();
        sqlitedatabase.delete("folders", "folder=?", new String[] {
            foldername.b()
        });
        c.c(com.facebook.orca.g.s.b);
        sqlitedatabase.setTransactionSuccessful();
        sqlitedatabase.endTransaction();
        return;
        foldername;
        com.facebook.debug.log.b.d(a, "SQLException", foldername);
        throw foldername;
        foldername;
        sqlitedatabase.endTransaction();
        throw foldername;
    }

    private void a(FolderName foldername, ThreadsCollection threadscollection)
    {
        SQLiteDatabase sqlitedatabase = b.e();
        for (Iterator iterator = threadscollection.b().iterator(); iterator.hasNext(); sqlitedatabase.replaceOrThrow("folders", "", a(foldername, (ThreadSummary)iterator.next()))) { }
        if (threadscollection.c())
        {
            threadscollection = new ContentValues();
            threadscollection.put("folder", foldername.b());
            threadscollection.put("thread_id", com.facebook.orca.g.l.a(foldername));
            threadscollection.put("timestamp_ms", Integer.valueOf(0));
            sqlitedatabase.replaceOrThrow("folders", "", threadscollection);
        }
    }

    private void a(FolderName foldername, String s1)
    {
        b.e().delete("folders", "folder=? AND thread_id=?", new String[] {
            foldername.b(), s1
        });
    }

    private void a(MessagesCollection messagescollection)
    {
        a(messagescollection, false);
    }

    private void a(MessagesCollection messagescollection, boolean flag)
    {
        SQLiteDatabase sqlitedatabase;
        sqlitedatabase = b.e();
        sqlitedatabase.beginTransaction();
        Object obj;
        Object obj1;
        Object obj2;
        Object obj3;
        Object obj5;
        Object obj6;
        obj = kl.a();
        obj1 = kl.a();
        obj5 = kl.a();
        obj2 = kl.a();
        obj6 = kl.a();
        obj3 = messagescollection.b().iterator();
_L3:
        Object obj4;
        if (!((Iterator) (obj3)).hasNext())
        {
            break MISSING_BLOCK_LABEL_181;
        }
        obj4 = (Message)((Iterator) (obj3)).next();
        ((Set) (obj6)).add(((Message) (obj4)).d());
        if (((Message) (obj4)).y())
        {
            ((Set) (obj)).add(((Message) (obj4)).d());
        }
        if (!((Message) (obj4)).x()) goto _L2; else goto _L1
_L1:
        ((Set) (obj1)).add(((Message) (obj4)).w());
        if (c(((Message) (obj4))))
        {
            ((Set) (obj5)).add(((Message) (obj4)).w());
        }
          goto _L3
        messagescollection;
        sqlitedatabase.endTransaction();
        throw messagescollection;
_L2:
        if (!c(((Message) (obj4)))) goto _L3; else goto _L4
_L4:
        ((Set) (obj2)).add(((Message) (obj4)).d());
          goto _L3
        Set set;
        Iterator iterator;
        obj2 = c(((Set) (obj2)));
        ((Set) (obj5)).addAll(((Map) (obj2)).values());
        obj3 = d(((Set) (obj5)));
        obj4 = e(((Set) (obj5)));
        obj5 = f(((Set) (obj5)));
        obj6 = b(((Set) (obj6)));
        if (!((Set) (obj1)).isEmpty())
        {
            obj1 = (new StringBuilder()).append("offline_threading_id IN ").append(com.facebook.common.w.k.b(((Iterable) (obj1)))).toString();
            com.facebook.debug.log.b.a(a, "Deleting messsages WHERE %s", new Object[] {
                obj1
            });
            sqlitedatabase.delete("messages", ((String) (obj1)), null);
        }
        set = g(((Set) (obj)));
        iterator = messagescollection.b().iterator();
_L8:
        if (!iterator.hasNext()) goto _L6; else goto _L5
_L5:
        boolean flag1;
        obj = (Message)iterator.next();
        flag1 = ((Map) (obj4)).containsKey(((Message) (obj)).w());
        if (!flag1)
        {
            break MISSING_BLOCK_LABEL_404;
        }
        obj1 = k.a((String)((Map) (obj4)).get(((Message) (obj)).w()));
        obj1 = (new e()).a(((Message) (obj))).e(((List) (obj1))).B();
        obj = obj1;
_L9:
        flag1 = ((Map) (obj5)).containsKey(((Message) (obj)).w());
        if (!flag1)
        {
            break MISSING_BLOCK_LABEL_747;
        }
        obj1 = h.a((String)((Map) (obj5)).get(((Message) (obj)).w()));
        obj1 = (new e()).a(((Message) (obj))).f(((List) (obj1))).B();
_L10:
        if (set.contains(((Message) (obj1)).d())) goto _L8; else goto _L7
_L7:
        obj = obj1;
        if (((Message) (obj1)).x())
        {
            break MISSING_BLOCK_LABEL_544;
        }
        obj = obj1;
        if (((Map) (obj2)).containsKey(((Message) (obj1)).d()))
        {
            obj = (new e()).a(((Message) (obj1))).e((String)((Map) (obj2)).get(((Message) (obj1)).d())).B();
        }
        obj1 = obj;
        if (((Message) (obj)).h() != 0L)
        {
            break MISSING_BLOCK_LABEL_619;
        }
        obj1 = obj;
        if (!((Message) (obj)).x())
        {
            break MISSING_BLOCK_LABEL_619;
        }
        obj1 = obj;
        if (((Map) (obj3)).containsKey(((Message) (obj)).w()))
        {
            obj1 = (new e()).a(((Message) (obj))).b(((Long)((Map) (obj3)).get(((Message) (obj)).w())).longValue()).B();
        }
        obj = obj1;
        if (((Map) (obj6)).containsKey(((Message) (obj1)).d()))
        {
            obj = (new e()).a(((Message) (obj1))).d(((Long)((Map) (obj6)).get(((Message) (obj1)).d())).longValue()).B();
        }
        b(((Message) (obj)), flag);
          goto _L8
        obj1;
        com.facebook.debug.log.b.a(a, "Preserving of the prior pendingSetnAttachment failed");
          goto _L9
        obj1;
        com.facebook.debug.log.b.a(a, "Preserving of the prior pendingSendShares failed");
        break MISSING_BLOCK_LABEL_747;
_L6:
        if (messagescollection.d())
        {
            b(g(messagescollection.a()), flag);
        }
        sqlitedatabase.setTransactionSuccessful();
        sqlitedatabase.endTransaction();
        return;
        obj1 = obj;
          goto _L10
    }

    private void a(ThreadSummary threadsummary)
    {
        SQLiteDatabase sqlitedatabase = b.e();
        FolderName foldername = threadsummary.y();
        ContentValues contentvalues = a(foldername, threadsummary);
        long l1 = e.a(foldername);
        if (threadsummary.l() >= l1)
        {
            sqlitedatabase.replaceOrThrow("folders", "", contentvalues);
            return;
        } else
        {
            sqlitedatabase.delete("folders", "thread_id=?", new String[] {
                threadsummary.a()
            });
            return;
        }
    }

    private void a(ThreadSummary threadsummary, long l1)
    {
        threadsummary = b(threadsummary);
        ContentValues contentvalues = new ContentValues();
        contentvalues.put("thread_id", threadsummary.a());
        contentvalues.put("thread_fbid", threadsummary.b());
        contentvalues.put("action_id", Long.valueOf(threadsummary.c()));
        contentvalues.put("refetch_action_id", Long.valueOf(threadsummary.d()));
        contentvalues.put("last_visible_action_id", Long.valueOf(threadsummary.e()));
        if (threadsummary.f())
        {
            contentvalues.put("name", threadsummary.g());
        }
        if (threadsummary.r())
        {
            contentvalues.put("pic_hash", threadsummary.q());
        }
        if (threadsummary.t())
        {
            contentvalues.put("pic", threadsummary.s().toString());
        }
        contentvalues.put("participants", f.b(threadsummary.j()));
        contentvalues.put("former_participants", f.b(threadsummary.B()));
        contentvalues.put("object_participants", f.a(threadsummary.k()));
        contentvalues.put("senders", f.a(threadsummary.m()));
        int i1;
        if (threadsummary.h())
        {
            i1 = 1;
        } else
        {
            i1 = 0;
        }
        contentvalues.put("single_recipient_thread", Integer.valueOf(i1));
        if (threadsummary.h())
        {
            contentvalues.put("single_recipient_user_key", threadsummary.i().c());
        }
        contentvalues.put("snippet", threadsummary.n());
        contentvalues.put("snippet_sender", f.a(threadsummary.p()));
        contentvalues.put("admin_snippet", threadsummary.o());
        contentvalues.put("timestamp_ms", Long.valueOf(threadsummary.l()));
        contentvalues.put("last_fetch_time_ms", Long.valueOf(l1));
        contentvalues.put("unread", Boolean.valueOf(threadsummary.u()));
        contentvalues.put("can_reply_to", Boolean.valueOf(threadsummary.v()));
        contentvalues.put("is_subscribed", Boolean.valueOf(threadsummary.w()));
        contentvalues.put("folder", threadsummary.y().b());
        contentvalues.put("draft", l.a(threadsummary.z()));
        b.e().replaceOrThrow("threads", "", contentvalues);
    }

    private void a(es es1, long l1)
    {
        a(es1, l1, false);
    }

    private void a(es es1, long l1, boolean flag)
    {
        es1 = es1.iterator();
        do
        {
            if (!es1.hasNext())
            {
                break;
            }
            ThreadSummary threadsummary = (ThreadSummary)es1.next();
            a(threadsummary, l1);
            if (flag)
            {
                Object obj = d.a(threadsummary.a(), 0);
                if (((FetchThreadResult) (obj)).e() != com.facebook.fbservice.c.b.NO_DATA)
                {
                    obj = ((FetchThreadResult) (obj)).a();
                    if (threadsummary.d() > ((ThreadSummary) (obj)).d())
                    {
                        f(threadsummary.a());
                    }
                }
            }
        } while (true);
    }

    private void a(String s1)
    {
        SQLiteDatabase sqlitedatabase;
        sqlitedatabase = b.e();
        sqlitedatabase.beginTransaction();
        ContentValues contentvalues = new ContentValues();
        contentvalues.put("thread_id", s1);
        sqlitedatabase.insert("archived_sms_mms_threads", "", contentvalues);
        sqlitedatabase.setTransactionSuccessful();
        sqlitedatabase.endTransaction();
        return;
        s1;
        com.facebook.debug.log.b.d(a, "SQLException", s1);
        throw s1;
        s1;
        sqlitedatabase.endTransaction();
        throw s1;
    }

    private void a(String s1, long l1)
    {
        SQLiteDatabase sqlitedatabase = b.e();
        ContentValues contentvalues = new ContentValues();
        contentvalues.put("handled_internally_time", Long.valueOf(l1));
        sqlitedatabase.update("messages", contentvalues, "msg_id = ?", new String[] {
            s1
        });
    }

    private void a(String s1, UserKey userkey, boolean flag, long l1, String s2)
    {
        SQLiteDatabase sqlitedatabase = b.e();
        Object obj = d.a(s1, 0);
        if (((FetchThreadResult) (obj)).e() == com.facebook.fbservice.c.b.NO_DATA)
        {
            return;
        }
        java.util.ArrayList arraylist = hq.a();
        for (obj = ((FetchThreadResult) (obj)).a().j().iterator(); ((Iterator) (obj)).hasNext();)
        {
            ThreadParticipant threadparticipant = (ThreadParticipant)((Iterator) (obj)).next();
            if (threadparticipant.d().equals(userkey))
            {
                arraylist.add(a(threadparticipant, flag, l1, s2));
            } else
            {
                arraylist.add(threadparticipant);
            }
        }

        userkey = new ContentValues();
        userkey.put("participants", f.b(arraylist));
        sqlitedatabase.update("threads", userkey, "thread_id=?", new String[] {
            s1
        });
    }

    private ThreadSummary b(ThreadSummary threadsummary)
    {
        Object obj = d.a(threadsummary.a(), 0);
        if (((FetchThreadResult) (obj)).e() == com.facebook.fbservice.c.b.NO_DATA)
        {
            return threadsummary;
        } else
        {
            obj = ((FetchThreadResult) (obj)).a();
            return a(b(threadsummary, ((ThreadSummary) (obj))), ((ThreadSummary) (obj)));
        }
    }

    private ThreadSummary b(ThreadSummary threadsummary, ThreadSummary threadsummary1)
    {
        java.util.HashMap hashmap = ik.a(threadsummary1.j().size());
        ThreadParticipant threadparticipant;
        for (threadsummary1 = threadsummary1.j().iterator(); threadsummary1.hasNext(); hashmap.put(threadparticipant.d(), threadparticipant))
        {
            threadparticipant = (ThreadParticipant)threadsummary1.next();
        }

        threadsummary = (new v()).a(threadsummary);
        threadsummary1 = hq.c(threadsummary.i().size());
        for (Iterator iterator = threadsummary.i().iterator(); iterator.hasNext();)
        {
            ThreadParticipant threadparticipant1 = (ThreadParticipant)iterator.next();
            ThreadParticipant threadparticipant2 = (ThreadParticipant)hashmap.get(threadparticipant1.d());
            if (threadparticipant2 == null)
            {
                threadsummary1.add(threadparticipant1);
            } else
            {
                p p1 = new p();
                p1.a(threadparticipant1);
                if (p1.d() < threadparticipant2.i())
                {
                    p1.a(threadparticipant2.i());
                }
                p1.b(threadparticipant2.j());
                threadsummary1.add(p1.f());
            }
        }

        threadsummary.a(threadsummary1);
        return threadsummary.z();
    }

    private Map b(Set set)
    {
        Object obj;
        obj = ik.a();
        if (set.isEmpty())
        {
            return ((Map) (obj));
        }
        SQLiteDatabase sqlitedatabase = b.e();
        set = com.facebook.common.w.m.a("msg_id IN %s and handled_internally_time > 0", new Object[] {
            com.facebook.common.w.k.b(set)
        });
        set = sqlitedatabase.query("messages", new String[] {
            "msg_id", "handled_internally_time"
        }, set, null, null, null, null);
        while (set.moveToNext()) 
        {
            ((Map) (obj)).put(set.getString(0), Long.valueOf(set.getLong(1)));
        }
        break MISSING_BLOCK_LABEL_114;
        obj;
        set.close();
        throw obj;
        set.close();
        return ((Map) (obj));
    }

    private void b(Message message)
    {
        a(new MessagesCollection(message.e(), es.a(message), false));
    }

    private void b(Message message, boolean flag)
    {
        ContentValues contentvalues = new ContentValues();
        contentvalues.put("msg_id", message.d());
        contentvalues.put("thread_id", message.e());
        contentvalues.put("action_id", Long.valueOf(message.s()));
        if (message.j() != null)
        {
            contentvalues.put("subject", message.j());
        }
        if (message.k() != null)
        {
            contentvalues.put("text", message.k());
        }
        contentvalues.put("sender", f.a(message.i()));
        contentvalues.put("timestamp_ms", Long.valueOf(message.f()));
        contentvalues.put("msg_type", Integer.valueOf(message.u()));
        contentvalues.put("affected_users", f.a(message.v()));
        contentvalues.put("mms_attachments", k.a(message.o()));
        contentvalues.put("attachments", g.a(message.p()));
        contentvalues.put("shares", h.a(message.q()));
        contentvalues.put("coordinates", i.a(message.n()));
        contentvalues.put("client_tags", j.a(message.J()));
        contentvalues.put("offline_threading_id", message.w());
        contentvalues.put("source", message.z());
        if (flag)
        {
            contentvalues.put("is_non_authoritative", Boolean.valueOf(true));
        } else
        {
            contentvalues.put("is_non_authoritative", Boolean.valueOf(message.y()));
        }
        if (message.C())
        {
            contentvalues.put("pending_send_media_attachment", k.a(message.B()));
        }
        if (message.h() != 0L)
        {
            contentvalues.put("timestamp_sent_ms", Long.valueOf(message.h()));
        }
        contentvalues.put("handled_internally_time", Long.valueOf(message.F()));
        contentvalues.put("pending_shares", h.a(message.D()));
        contentvalues.put("pending_attachment_fbid", message.E());
        contentvalues.put("send_error", message.K().a());
        b.e().replaceOrThrow("messages", "", contentvalues);
        com.facebook.debug.log.b.a(a, "Inserted message: %s", new Object[] {
            message
        });
    }

    private void b(es es1, long l1)
    {
        a(es1, l1, true);
    }

    private void b(String s1)
    {
        SQLiteDatabase sqlitedatabase;
        sqlitedatabase = b.e();
        sqlitedatabase.beginTransaction();
        sqlitedatabase.delete("archived_sms_mms_threads", "thread_id = ?", new String[] {
            s1
        });
        sqlitedatabase.setTransactionSuccessful();
        sqlitedatabase.endTransaction();
        return;
        s1;
        com.facebook.debug.log.b.d(a, "SQLException", s1);
        throw s1;
        s1;
        sqlitedatabase.endTransaction();
        throw s1;
    }

    private void b(String s1, long l1)
    {
        SQLiteDatabase sqlitedatabase;
        sqlitedatabase = b.e();
        sqlitedatabase.beginTransaction();
        Object obj;
        obj = com.facebook.d.d.e.a();
        ((f) (obj)).a(com.facebook.d.d.e.a("thread_id", s1));
        ((f) (obj)).a(com.facebook.d.d.e.a("msg_type", Integer.toString(900)));
        s1 = ik.b();
        String s2 = ((f) (obj)).a();
        String as[] = ((f) (obj)).b();
        as = sqlitedatabase.query("messages", new String[] {
            "msg_id", "timestamp_ms"
        }, s2, as, null, null, "timestamp_ms");
        while (as.moveToNext()) 
        {
            s1.put(as.getString(0), Long.valueOf(as.getLong(1)));
        }
        break MISSING_BLOCK_LABEL_152;
        s1;
        as.close();
        throw s1;
        s1;
        sqlitedatabase.endTransaction();
        throw s1;
        as.close();
        if (s1.isEmpty())
        {
            break MISSING_BLOCK_LABEL_294;
        }
        s1 = s1.entrySet().iterator();
        l1++;
_L1:
        if (!s1.hasNext())
        {
            break MISSING_BLOCK_LABEL_294;
        }
        as = (java.util.Map.Entry)s1.next();
        if (((Long)as.getValue()).longValue() >= l1)
        {
            break MISSING_BLOCK_LABEL_275;
        }
        ContentValues contentvalues = new ContentValues();
        contentvalues.put("timestamp_ms", Long.valueOf(l1));
        sqlitedatabase.update("messages", contentvalues, "msg_id=?", new String[] {
            (String)as.getKey()
        });
        l1++;
          goto _L1
        l1 = ((Long)as.getValue()).longValue() + 1L;
          goto _L1
        sqlitedatabase.setTransactionSuccessful();
        sqlitedatabase.endTransaction();
        return;
    }

    private Map c(Set set)
    {
        Object obj;
        obj = ev.j();
        if (set.isEmpty())
        {
            break MISSING_BLOCK_LABEL_132;
        }
        obj = ik.a();
        set = (new StringBuilder()).append("msg_id IN ").append(com.facebook.common.w.k.b(set)).toString();
        set = b.e().query("messages", new String[] {
            "msg_id", "offline_threading_id"
        }, set, null, null, null, null);
        break MISSING_BLOCK_LABEL_74;
        obj;
        set.close();
        throw obj;
        do
        {
            if (!set.moveToNext())
            {
                break;
            }
            if (!set.isNull(1))
            {
                ((Map) (obj)).put(set.getString(0), set.getString(1));
            }
        } while (true);
        set.close();
        return ((Map) (obj));
    }

    private void c(String s1)
    {
        SQLiteDatabase sqlitedatabase;
        sqlitedatabase = b.e();
        sqlitedatabase.beginTransaction();
        ContentValues contentvalues = new ContentValues();
        contentvalues.put("thread_id", s1);
        sqlitedatabase.insert("unread_mms_sms_threads", "", contentvalues);
        sqlitedatabase.setTransactionSuccessful();
        sqlitedatabase.endTransaction();
        return;
        s1;
        com.facebook.debug.log.b.d(a, "SQLException", s1);
        throw s1;
        s1;
        sqlitedatabase.endTransaction();
        throw s1;
    }

    private boolean c(Message message)
    {
        message = message.i();
        User user = (User)n.b();
        return user != null && Objects.equal(user.c(), message.e());
    }

    private Map d(Set set)
    {
        Object obj;
        obj = ev.j();
        if (set.isEmpty())
        {
            return ((Map) (obj));
        }
        obj = ik.a();
        set = (new StringBuilder()).append("offline_threading_id IN ").append(com.facebook.common.w.k.b(set)).toString();
        set = b.e().query("messages", new String[] {
            "offline_threading_id", "timestamp_sent_ms"
        }, set, null, null, null, null);
        break MISSING_BLOCK_LABEL_77;
        obj;
        set.close();
        throw obj;
        do
        {
            if (!set.moveToNext())
            {
                break;
            }
            if (!set.isNull(1))
            {
                ((Map) (obj)).put(set.getString(0), Long.valueOf(set.getLong(1)));
            }
        } while (true);
        set.close();
        return ((Map) (obj));
    }

    private void d(String s1)
    {
        SQLiteDatabase sqlitedatabase;
        sqlitedatabase = b.e();
        sqlitedatabase.beginTransaction();
        sqlitedatabase.delete("unread_mms_sms_threads", "thread_id = ?", new String[] {
            s1
        });
        sqlitedatabase.setTransactionSuccessful();
        sqlitedatabase.endTransaction();
        return;
        s1;
        com.facebook.debug.log.b.d(a, "SQLException", s1);
        throw s1;
        s1;
        sqlitedatabase.endTransaction();
        throw s1;
    }

    private Map e(Set set)
    {
        ev.j();
        set = (new StringBuilder()).append("pending_send_media_attachment NOT NULL AND offline_threading_id IN ").append(com.facebook.common.w.k.b(set)).toString();
        set = b.e().query("messages", new String[] {
            "offline_threading_id", "pending_send_media_attachment"
        }, set, null, null, null, null);
        Object obj;
        obj = ik.a();
        for (; set.moveToNext(); ((Map) (obj)).put(set.getString(0), set.getString(1))) { }
        break MISSING_BLOCK_LABEL_108;
        obj;
        set.close();
        throw obj;
        set.close();
        return ((Map) (obj));
    }

    private void e(String s1)
    {
        SQLiteDatabase sqlitedatabase;
        sqlitedatabase = b.e();
        sqlitedatabase.beginTransaction();
        sqlitedatabase.delete("folders", "thread_id=?", new String[] {
            s1
        });
        sqlitedatabase.delete("threads", "thread_id=?", new String[] {
            s1
        });
        sqlitedatabase.delete("messages", "thread_id=?", new String[] {
            s1
        });
        sqlitedatabase.delete("archived_sms_mms_threads", "thread_id=?", new String[] {
            s1
        });
        c.b(com.facebook.orca.g.s.a(s1));
        sqlitedatabase.setTransactionSuccessful();
        sqlitedatabase.endTransaction();
        return;
        s1;
        com.facebook.debug.log.b.d(a, "SQLException", s1);
        throw s1;
        s1;
        sqlitedatabase.endTransaction();
        throw s1;
    }

    private Map f(Set set)
    {
        ev.j();
        set = (new StringBuilder()).append("pending_shares NOT NULL AND offline_threading_id IN ").append(com.facebook.common.w.k.b(set)).toString();
        set = b.e().query("messages", new String[] {
            "offline_threading_id", "pending_shares"
        }, set, null, null, null, null);
        Object obj;
        obj = ik.a();
        for (; set.moveToNext(); ((Map) (obj)).put(set.getString(0), set.getString(1))) { }
        break MISSING_BLOCK_LABEL_108;
        obj;
        set.close();
        throw obj;
        set.close();
        return ((Map) (obj));
    }

    private void f(String s1)
    {
        b.e().delete("messages", "thread_id=?", new String[] {
            s1
        });
    }

    private Message g(String s1)
    {
        return (new e()).a(s1).b(s1).a(-1).a(0L).B();
    }

    private Set g(Set set)
    {
        Object obj;
        obj = fi.d();
        if (set.isEmpty())
        {
            return ((Set) (obj));
        }
        obj = kl.a();
        set = (new StringBuilder()).append("msg_id IN ").append(com.facebook.common.w.k.b(set)).toString();
        set = b.e().query("messages", new String[] {
            "msg_id"
        }, set, null, null, null, null);
        while (set.moveToNext()) 
        {
            ((Set) (obj)).add(set.getString(0));
        }
        break MISSING_BLOCK_LABEL_105;
        obj;
        set.close();
        throw obj;
        set.close();
        return ((Set) (obj));
    }

    NewMessageResult a(NewMessageResult newmessageresult)
    {
        SQLiteDatabase sqlitedatabase;
        boolean flag;
        flag = false;
        sqlitedatabase = b.e();
        sqlitedatabase.beginTransaction();
        Message message;
        String s1;
        s1 = newmessageresult.a();
        message = newmessageresult.b();
        if (message == null)
        {
            sqlitedatabase.endTransaction();
            return newmessageresult;
        }
        Object obj2;
        if (com.facebook.orca.threads.m.g(s1))
        {
            b(s1);
        }
        obj2 = d.a(message.d());
        Object obj;
        obj = obj2;
        if (obj2 != null)
        {
            break MISSING_BLOCK_LABEL_96;
        }
        obj = obj2;
        if (message.x())
        {
            obj = d.b(message.w());
        }
        if (message.h() != 0L || obj == null)
        {
            break MISSING_BLOCK_LABEL_140;
        }
        if (((Message) (obj)).h() != 0L)
        {
            message = (new e()).a(message).b(((Message) (obj)).h()).B();
        }
        c c1;
        obj2 = message.A();
        c1 = c.C2DM;
        if (obj2 == c1 && obj != null)
        {
            sqlitedatabase.endTransaction();
            return null;
        }
        if (!message.y()) goto _L2; else goto _L1
_L1:
        if (!flag) goto _L4; else goto _L3
_L3:
        a(newmessageresult.c());
_L6:
        obj = newmessageresult;
        if (c(message))
        {
            a(message.d(), System.currentTimeMillis());
            b(s1, message.f());
            obj = d.a(s1, message.f(), -1L, 100).a();
            message = d.a(message.d());
            obj = new NewMessageResult(newmessageresult.e(), s1, message, ((MessagesCollection) (obj)), newmessageresult.f());
        }
        sqlitedatabase.setTransactionSuccessful();
        sqlitedatabase.endTransaction();
        return ((NewMessageResult) (obj));
_L2:
        if (newmessageresult.c() != null)
        {
            FetchThreadResult fetchthreadresult = d.a(s1, 5);
            flag = m.c(newmessageresult.c(), fetchthreadresult.b());
        }
        continue; /* Loop/switch isn't completed */
_L4:
        a(message, true);
        Object obj1 = d.a(s1, 1);
        if (((FetchThreadResult) (obj1)).a() != null)
        {
            obj1 = o.a(((FetchThreadResult) (obj1)).a(), message);
            a(((ThreadSummary) (obj1)));
            a(((ThreadSummary) (obj1)), newmessageresult.f());
        }
        if (true) goto _L6; else goto _L5
_L5:
        newmessageresult;
        sqlitedatabase.endTransaction();
        throw newmessageresult;
        if (true) goto _L1; else goto _L7
_L7:
    }

    Map a(DeleteMessagesParams deletemessagesparams)
    {
        return a(((Set) (deletemessagesparams.b())));
    }

    void a(Message message)
    {
        b(message);
        FetchThreadResult fetchthreadresult = d.a(message.e(), 1);
        if (fetchthreadresult.a() != null)
        {
            message = o.a(fetchthreadresult.a(), message);
            a(((ThreadSummary) (message)));
            a(((ThreadSummary) (message)), fetchthreadresult.f());
        }
    }

    void a(DeleteThreadParams deletethreadparams)
    {
        e(deletethreadparams.a());
    }

    void a(DeliveredReceiptParams deliveredreceiptparams)
    {
        a(deliveredreceiptparams.b(), deliveredreceiptparams.c(), false, 0L, deliveredreceiptparams.a());
    }

    void a(FetchGroupThreadsParams fetchgroupthreadsparams, FetchGroupThreadsResult fetchgroupthreadsresult)
    {
        SQLiteDatabase sqlitedatabase;
label0:
        {
            sqlitedatabase = b.e();
            sqlitedatabase.beginTransaction();
            try
            {
                if (fetchgroupthreadsparams.a() != j.TOP_RANKED)
                {
                    break MISSING_BLOCK_LABEL_150;
                }
                sqlitedatabase.delete("group_conversations", null, null);
                ContentValues contentvalues;
                for (fetchgroupthreadsparams = fetchgroupthreadsresult.a().b().iterator(); fetchgroupthreadsparams.hasNext(); sqlitedatabase.insertOrThrow("group_conversations", "", contentvalues))
                {
                    ThreadSummary threadsummary = (ThreadSummary)fetchgroupthreadsparams.next();
                    contentvalues = new ContentValues();
                    contentvalues.put("thread_id", threadsummary.a());
                    contentvalues.put("rank", Float.valueOf(threadsummary.e()));
                }

                break label0;
            }
            // Misplaced declaration of an exception variable
            catch (FetchGroupThreadsParams fetchgroupthreadsparams) { }
            finally
            {
                sqlitedatabase.endTransaction();
                throw fetchgroupthreadsparams;
            }
        }
        com.facebook.debug.log.b.d(a, "SQLException", fetchgroupthreadsparams);
        throw fetchgroupthreadsparams;
        c.b(com.facebook.orca.g.s.c, fetchgroupthreadsresult.f());
        b(fetchgroupthreadsresult.a().b(), fetchgroupthreadsresult.f());
        sqlitedatabase.setTransactionSuccessful();
        sqlitedatabase.endTransaction();
        return;
    }

    void a(FetchMoreMessagesResult fetchmoremessagesresult, FetchMoreMessagesResult fetchmoremessagesresult1)
    {
        SQLiteDatabase sqlitedatabase;
        sqlitedatabase = b.e();
        sqlitedatabase.beginTransaction();
        if (fetchmoremessagesresult == null)
        {
            break MISSING_BLOCK_LABEL_59;
        }
        if (fetchmoremessagesresult.e() == com.facebook.fbservice.c.b.NO_DATA || m.c(fetchmoremessagesresult.a(), fetchmoremessagesresult1.a()))
        {
            break MISSING_BLOCK_LABEL_59;
        }
        com.facebook.debug.log.b.b(a, "Performance warning - can't add more messages");
        sqlitedatabase.endTransaction();
        return;
        a(fetchmoremessagesresult1.a());
        sqlitedatabase.setTransactionSuccessful();
        sqlitedatabase.endTransaction();
        return;
        fetchmoremessagesresult;
        com.facebook.debug.log.b.d(a, "SQLException", fetchmoremessagesresult);
        throw fetchmoremessagesresult;
        fetchmoremessagesresult;
        sqlitedatabase.endTransaction();
        throw fetchmoremessagesresult;
    }

    void a(FetchMoreThreadsResult fetchmorethreadsresult)
    {
        SQLiteDatabase sqlitedatabase;
label0:
        {
            sqlitedatabase = b.e();
            sqlitedatabase.beginTransaction();
            try
            {
                long l1 = fetchmorethreadsresult.f();
                ThreadsCollection threadscollection = fetchmorethreadsresult.b();
                a(fetchmorethreadsresult.a(), fetchmorethreadsresult.b());
                for (fetchmorethreadsresult = threadscollection.b().iterator(); fetchmorethreadsresult.hasNext(); a((ThreadSummary)fetchmorethreadsresult.next(), l1)) { }
                break label0;
            }
            // Misplaced declaration of an exception variable
            catch (FetchMoreThreadsResult fetchmorethreadsresult) { }
            finally
            {
                sqlitedatabase.endTransaction();
                throw fetchmorethreadsresult;
            }
        }
        com.facebook.debug.log.b.d(a, "SQLException", fetchmorethreadsresult);
        throw fetchmorethreadsresult;
        sqlitedatabase.setTransactionSuccessful();
        sqlitedatabase.endTransaction();
        return;
    }

    void a(FetchThreadListResult fetchthreadlistresult)
    {
        SQLiteDatabase sqlitedatabase;
        sqlitedatabase = b.e();
        sqlitedatabase.beginTransaction();
        Object obj;
        long l1;
        l1 = fetchthreadlistresult.f();
        obj = fetchthreadlistresult.a();
        c.b(com.facebook.orca.g.s.a(((FolderName) (obj))), l1);
        c.b(com.facebook.orca.g.s.b(((FolderName) (obj))), fetchthreadlistresult.k());
        c.b(com.facebook.orca.g.s.c(((FolderName) (obj))), false);
        if (!fetchthreadlistresult.j()) goto _L2; else goto _L1
_L1:
        for (Iterator iterator = fetchthreadlistresult.d().iterator(); iterator.hasNext(); e((String)iterator.next())) { }
          goto _L3
_L4:
        com.facebook.debug.log.b.d(a, "SQLException", fetchthreadlistresult);
        throw fetchthreadlistresult;
_L3:
        try
        {
            for (Iterator iterator1 = fetchthreadlistresult.g().iterator(); iterator1.hasNext(); a(((FolderName) (obj)), (String)iterator1.next())) { }
            break MISSING_BLOCK_LABEL_168;
        }
        // Misplaced declaration of an exception variable
        catch (FetchThreadListResult fetchthreadlistresult) { }
        finally
        {
            sqlitedatabase.endTransaction();
            throw fetchthreadlistresult;
        }
        if (true) goto _L4; else goto _L2
_L2:
        a(((FolderName) (obj)));
        a(((FolderName) (obj)), fetchthreadlistresult.h());
        a(((FolderName) (obj)), fetchthreadlistresult.b());
        obj = fetchthreadlistresult.b();
        if (!fetchthreadlistresult.j())
        {
            break MISSING_BLOCK_LABEL_217;
        }
        b(((ThreadsCollection) (obj)).b(), l1);
_L5:
        sqlitedatabase.setTransactionSuccessful();
        sqlitedatabase.endTransaction();
        return;
        a(((ThreadsCollection) (obj)).b(), l1);
          goto _L5
    }

    void a(FetchThreadResult fetchthreadresult)
    {
        FetchThreadResult fetchthreadresult2 = d.a(fetchthreadresult.a().a(), 3);
        FetchThreadResult fetchthreadresult1 = fetchthreadresult2;
        if (fetchthreadresult2.e() == com.facebook.fbservice.c.b.NO_DATA)
        {
            fetchthreadresult1 = null;
        }
        a(fetchthreadresult1, fetchthreadresult);
    }

    void a(FetchThreadResult fetchthreadresult, FetchThreadResult fetchthreadresult1)
    {
        SQLiteDatabase sqlitedatabase;
        sqlitedatabase = b.e();
        sqlitedatabase.beginTransaction();
        ThreadSummary threadsummary;
        String s1;
        threadsummary = fetchthreadresult1.a();
        s1 = threadsummary.a();
        if (fetchthreadresult == null)
        {
            break MISSING_BLOCK_LABEL_86;
        }
        if (fetchthreadresult.e() != com.facebook.fbservice.c.b.NO_DATA && !m.c(fetchthreadresult1.b(), fetchthreadresult.b()))
        {
            com.facebook.debug.log.b.b(a, "Performance warning - deleting old messages to avoid hole");
            sqlitedatabase.delete("messages", "thread_id=?", new String[] {
                s1
            });
        }
        a(threadsummary);
        a(threadsummary, fetchthreadresult1.f());
        a(fetchthreadresult1.b());
        fetchthreadresult = fetchthreadresult1.b().b().iterator();
_L4:
        if (!fetchthreadresult.hasNext()) goto _L2; else goto _L1
_L1:
        fetchthreadresult1 = (Message)fetchthreadresult.next();
        if (!c(fetchthreadresult1)) goto _L4; else goto _L3
_L3:
        long l1 = fetchthreadresult1.f();
_L6:
        if (l1 == -1L)
        {
            break MISSING_BLOCK_LABEL_171;
        }
        b(s1, l1);
        c.b(com.facebook.orca.g.s.a(s1), threadsummary.c());
        sqlitedatabase.setTransactionSuccessful();
        sqlitedatabase.endTransaction();
        return;
        fetchthreadresult;
        com.facebook.debug.log.b.d(a, "SQLException", fetchthreadresult);
        throw fetchthreadresult;
        fetchthreadresult;
        sqlitedatabase.endTransaction();
        throw fetchthreadresult;
_L2:
        l1 = -1L;
        if (true) goto _L6; else goto _L5
_L5:
    }

    void a(MarkThreadParams markthreadparams)
    {
        SQLiteDatabase sqlitedatabase;
        String s1;
        Object obj;
        boolean flag;
        flag = true;
        s1 = markthreadparams.a();
        obj = markthreadparams.b();
        sqlitedatabase = b.e();
        sqlitedatabase.beginTransaction();
        if (obj != ai.READ) goto _L2; else goto _L1
_L1:
        obj = new ContentValues();
        if (markthreadparams.c())
        {
            flag = false;
        }
        ((ContentValues) (obj)).put("unread", Boolean.valueOf(flag));
        sqlitedatabase.update("threads", ((ContentValues) (obj)), "thread_id=?", new String[] {
            s1
        });
        if (!com.facebook.orca.threads.m.g(s1)) goto _L4; else goto _L3
_L3:
        if (!markthreadparams.c()) goto _L6; else goto _L5
_L5:
        d(s1);
_L4:
        sqlitedatabase.setTransactionSuccessful();
        sqlitedatabase.endTransaction();
        return;
_L6:
        c(s1);
          goto _L4
        markthreadparams;
        com.facebook.debug.log.b.d(a, "SQLException", markthreadparams);
        throw markthreadparams;
        markthreadparams;
        sqlitedatabase.endTransaction();
        throw markthreadparams;
_L2:
        if (obj != ai.ARCHIVED || !markthreadparams.c()) goto _L4; else goto _L7
_L7:
        if (!com.facebook.orca.threads.m.g(s1))
        {
            break MISSING_BLOCK_LABEL_176;
        }
        a(s1);
          goto _L4
        a(FolderName.b, s1);
          goto _L4
    }

    void a(ReadReceiptParams readreceiptparams)
    {
        a(readreceiptparams.b(), readreceiptparams.c(), true, readreceiptparams.a(), null);
    }

    void a(FolderName foldername, FolderCounts foldercounts)
    {
        SQLiteDatabase sqlitedatabase = b.e();
        ContentValues contentvalues = new ContentValues();
        contentvalues.put("folder", foldername.b());
        contentvalues.put("unread_count", Integer.valueOf(foldercounts.a()));
        contentvalues.put("unseen_count", Integer.valueOf(foldercounts.b()));
        contentvalues.put("last_seen_time", Long.valueOf(foldercounts.c()));
        contentvalues.put("last_action_id", Long.valueOf(foldercounts.d()));
        sqlitedatabase.replaceOrThrow("folder_counts", null, contentvalues);
    }

    void a(String s1, MessageDraft messagedraft)
    {
        SQLiteDatabase sqlitedatabase = b.e();
        ContentValues contentvalues = new ContentValues();
        contentvalues.put("draft", l.a(messagedraft));
        sqlitedatabase.update("threads", contentvalues, "thread_id=?", new String[] {
            s1
        });
    }

    void a(String s1, FetchThreadResult fetchthreadresult, FetchMoreMessagesResult fetchmoremessagesresult)
    {
        s1 = b.e();
        s1.beginTransaction();
        if (m.c(fetchthreadresult.b(), fetchmoremessagesresult.a()))
        {
            break MISSING_BLOCK_LABEL_45;
        }
        com.facebook.debug.log.b.b(a, "Performance warning - can't add more messages");
        s1.endTransaction();
        return;
        a(fetchmoremessagesresult.a());
        s1.setTransactionSuccessful();
        s1.endTransaction();
        return;
        fetchthreadresult;
        com.facebook.debug.log.b.d(a, "SQLException", fetchthreadresult);
        throw fetchthreadresult;
        fetchthreadresult;
        s1.endTransaction();
        throw fetchthreadresult;
    }
}
