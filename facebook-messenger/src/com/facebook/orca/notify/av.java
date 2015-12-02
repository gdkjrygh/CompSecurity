// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.orca.notify;

import android.content.ContentResolver;
import android.content.Context;
import android.content.IntentFilter;
import android.database.Cursor;
import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import com.facebook.analytics.cn;
import com.facebook.base.broadcast.q;
import com.facebook.common.w.n;
import com.facebook.debug.log.b;
import com.facebook.i.a.a.f;
import com.facebook.messages.ipc.peer.d;
import com.facebook.messages.ipc.peer.e;
import com.facebook.messages.model.threads.Message;
import com.facebook.orca.push.a;
import com.facebook.orca.threads.FolderCounts;
import com.facebook.push.c2dm.y;
import com.facebook.push.g;
import com.fasterxml.jackson.databind.node.JsonNodeFactory;
import com.fasterxml.jackson.databind.node.ObjectNode;
import com.google.common.a.ik;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

// Referenced classes of package com.facebook.orca.notify:
//            aw, az, ba, bh, 
//            c, am, ai, w, 
//            aq, ap, as, aj, 
//            ay, bg, bf, bd, 
//            be, ax, bc, bb, 
//            ao, bi

public class av
{

    private static final Class a = com/facebook/orca/notify/av;
    private final Context b;
    private final as c;
    private final com.facebook.common.v.a d;
    private final Set e;
    private final com.facebook.common.executors.a f;
    private final com.facebook.auth.b.b g;
    private final Handler h = new Handler(Looper.getMainLooper());
    private final String i;
    private final cn j;
    private final javax.inject.a k;
    private final y l;
    private final f m;
    private final com.facebook.i.a.a.a n = new aw(this);
    private final com.facebook.i.a.a.a o = new az(this);
    private final Map p = ik.a();
    private volatile long q;
    private volatile FolderCounts r;

    public av(Context context, as as1, com.facebook.common.v.a a1, Set set, com.facebook.common.executors.a a2, com.facebook.auth.b.b b1, String s, 
            cn cn1, javax.inject.a a3, y y1, f f1)
    {
        b = context;
        c = as1;
        d = a1;
        e = set;
        f = a2;
        g = b1;
        i = s;
        j = cn1;
        k = a3;
        l = y1;
        m = f1;
        m.a(Uri.parse("peer://msg_notification_unread_count/clear_thread"), n);
        m.a(d.p, o);
        as1 = new IntentFilter();
        as1.addAction("com.facebook.orca.login.AuthStateMachineMonitor.LOGIN_COMPLETE");
        (new ba(this, context, as1)).a();
    }

    private bh a(String s, String s1)
    {
        boolean flag;
        boolean flag1;
        boolean flag2;
        flag2 = false;
        flag = false;
        flag1 = false;
        com.facebook.debug.log.b.b(a, (new StringBuilder()).append("Checking other FB apps to see how they handle notifications for thread ").append(s1).toString());
        ObjectNode objectnode = new ObjectNode(JsonNodeFactory.instance);
        objectnode.put("userId", s);
        objectnode.put("threadId", s1);
        s1 = b.getContentResolver().query(Uri.parse(i), null, objectnode.toString(), null, null);
        if (s1 == null) goto _L2; else goto _L1
_L1:
        flag1 = false;
        flag = false;
_L4:
        int i1;
        if (!s1.moveToNext())
        {
            break; /* Loop/switch isn't completed */
        }
        i1 = s1.getInt(0);
        if (i1 > 0)
        {
            i1 = 1;
        } else
        {
            i1 = 0;
        }
        flag = i1 | flag;
        if (s1.getColumnCount() < 2)
        {
            continue; /* Loop/switch isn't completed */
        }
        i1 = s1.getInt(1);
        if (i1 > 0)
        {
            i1 = 1;
        } else
        {
            i1 = 0;
        }
        flag1 |= i1;
        if (true) goto _L4; else goto _L3
_L3:
        s1.close();
_L11:
        return new bh(flag, flag1, null);
        s;
_L9:
        s1.close();
        throw s;
        s;
_L8:
        com.facebook.debug.log.b.a(a, "Caught security exception checking orca pref");
        continue; /* Loop/switch isn't completed */
        s;
        flag2 = false;
        flag1 = flag;
        flag = flag2;
_L6:
        com.facebook.debug.log.b.b(a, "Caught exception checking orca pref", s);
        continue; /* Loop/switch isn't completed */
        s;
        continue; /* Loop/switch isn't completed */
        s;
        if (true) goto _L6; else goto _L5
_L5:
        s;
        flag = false;
        flag1 = flag2;
        continue; /* Loop/switch isn't completed */
        s;
        if (true) goto _L8; else goto _L7
_L7:
        s;
        if (true) goto _L9; else goto _L2
_L2:
        flag = false;
        if (true) goto _L11; else goto _L10
_L10:
    }

    private c a(Message message)
    {
        Map map = p;
        map;
        JVM INSTR monitorenter ;
        c c2 = (c)p.get(message.d());
        c c1;
        c1 = c2;
        if (c2 != null)
        {
            break MISSING_BLOCK_LABEL_58;
        }
        c1 = c2;
        if (message.w() != null)
        {
            c1 = (c)p.get(message.w());
        }
        c2 = c1;
        if (c1 != null)
        {
            break MISSING_BLOCK_LABEL_72;
        }
        c2 = new c();
        p.put(message.d(), c2);
        if (message.w() != null)
        {
            p.put(message.w(), c2);
        }
        c2.a(System.currentTimeMillis());
        c2.a(false);
        c2.b(false);
        map;
        JVM INSTR monitorexit ;
        return c2;
        message;
        map;
        JVM INSTR monitorexit ;
        throw message;
    }

    private void a(Message message, g g1, String s)
    {
        j.a(message.d(), message.e(), g1.toString(), s);
    }

    private void a(ai ai1)
    {
        for (Iterator iterator = e.iterator(); iterator.hasNext(); ((am)iterator.next()).a(ai1)) { }
        Iterator iterator1 = e.iterator();
        do
        {
            am am1;
label0:
            {
                if (iterator1.hasNext())
                {
                    am1 = (am)iterator1.next();
                    if (!ai1.f())
                    {
                        break label0;
                    }
                }
                return;
            }
            am1.b(ai1);
        } while (true);
    }

    static void a(av av1)
    {
        av1.d();
    }

    static void a(av av1, ai ai1)
    {
        av1.a(ai1);
    }

    static void a(av av1, ao ao)
    {
        av1.b(ao);
    }

    static void a(av av1, bi bi)
    {
        av1.b(bi);
    }

    static void a(av av1, w w1)
    {
        av1.b(w1);
    }

    static void a(av av1, a a1)
    {
        av1.b(a1);
    }

    static void a(av av1, String s, Message message, g g1)
    {
        av1.b(s, message, g1);
    }

    private void a(g g1, String s, Map map)
    {
        g1 = (new StringBuilder()).append("messaging_push_notif_").append(g1).toString();
        j.a(g1, s, map, null, null);
    }

    private void b(ao ao)
    {
        a(ao);
    }

    static void b(av av1)
    {
        av1.g();
    }

    private void b(bi bi)
    {
        a(bi);
    }

    private void b(w w1)
    {
        HashMap hashmap = ik.a();
        hashmap.put("type", String.valueOf(10004));
        if (!f())
        {
            a(w1.d(), "notifications_disabled", hashmap);
            return;
        }
        a(w1);
        if (w1.e())
        {
            a(w1.d(), "user_alerted_", hashmap);
            return;
        } else
        {
            a(w1.d(), "user_not_alerted_", hashmap);
            return;
        }
    }

    private void b(a a1)
    {
        HashMap hashmap = new HashMap();
        hashmap.put("type", String.valueOf(10003));
        if (!g.b())
        {
            a(a1.e(), "logged_out_user", hashmap);
            return;
        }
        if (!f())
        {
            a(a1.e(), "notifications_disabled", hashmap);
            return;
        }
        a(a1);
        if (a1.f())
        {
            a(a1.e(), "user_alerted_", hashmap);
            return;
        } else
        {
            a(a1.e(), "user_not_alerted_", hashmap);
            return;
        }
    }

    private void b(String s, Message message, g g1)
    {
        this;
        JVM INSTR monitorenter ;
        Object obj = l.j();
        if (!com.facebook.common.w.n.a(((CharSequence) (obj)))) goto _L2; else goto _L1
_L1:
        a(message, g1, "no_user");
_L5:
        this;
        JVM INSTR monitorexit ;
        return;
_L2:
        if (g.b()) goto _L4; else goto _L3
_L3:
        a(message, g1, "logged_out_user");
        com.facebook.debug.log.b.a(a, "Received notification while user logged out.");
          goto _L5
        s;
        throw s;
_L4:
        if (g1 == g.SMS && !((Boolean)k.b()).booleanValue()) goto _L5; else goto _L6
_L6:
        if (f())
        {
            break MISSING_BLOCK_LABEL_113;
        }
        a(message, g1, "notifications_disabled");
          goto _L5
label0:
        {
            if (c(message.e()))
            {
                break label0;
            }
            a(message, g1, "notifications_disabled_thread");
        }
          goto _L5
label1:
        {
            obj = a(((String) (obj)), message.e());
            if (!((bh) (obj)).a())
            {
                break label1;
            }
            a(message, g1, "thread_in_fg_elsewhere");
            com.facebook.debug.log.b.b(a, "Thread is in FG elsewhere, eating notification");
        }
          goto _L5
label2:
        {
            if (!((bh) (obj)).b())
            {
                break label2;
            }
            a(message, g1, "displays_in_app_notification_elsewhere");
            com.facebook.debug.log.b.b(a, "In App notification will display elsewhere, eating notification");
        }
          goto _L5
        q = System.currentTimeMillis();
        if (d.b()) goto _L8; else goto _L7
_L7:
        obj = aq.NOT_IN_APP;
_L11:
        c c1;
        boolean flag;
        c1 = a(message);
        flag = c1.n();
        if (flag)
        {
            break MISSING_BLOCK_LABEL_262;
        }
        com.facebook.messages.ipc.peer.e.b(message.e(), message.d(), m);
        a(new ap(s, message, ((aq) (obj)), g1, c1));
        if (!c1.n() || flag) goto _L10; else goto _L9
_L9:
        a(message, g1, (new StringBuilder()).append("user_alerted_").append(((aq) (obj)).toString()).toString());
_L12:
        e();
          goto _L5
_L8:
label3:
        {
            if (!d.a(10000L))
            {
                break label3;
            }
            obj = aq.IN_APP_ACTIVE_10S;
        }
          goto _L11
label4:
        {
            if (!d.a(30000L))
            {
                break label4;
            }
            obj = aq.IN_APP_ACTIVE_30S;
        }
          goto _L11
        obj = aq.IN_APP_IDLE;
          goto _L11
_L10:
        if (flag)
        {
            break MISSING_BLOCK_LABEL_418;
        }
        a(message, g1, (new StringBuilder()).append("user_not_alerted_").append(((aq) (obj)).toString()).toString());
          goto _L12
        a(message, g1, "has_recent_message");
          goto _L12
    }

    static Class c()
    {
        return a;
    }

    private boolean c(String s)
    {
        s = c.a(s);
        return c.a(s);
    }

    private void d()
    {
        for (Iterator iterator = e.iterator(); iterator.hasNext(); ((am)iterator.next()).a(aj.LOGGED_OUT)) { }
    }

    private void e()
    {
label0:
        {
            synchronized (p)
            {
                if (p.size() >= 100)
                {
                    break label0;
                }
            }
            return;
        }
        long l1 = System.currentTimeMillis();
        Iterator iterator = p.values().iterator();
        do
        {
            if (!iterator.hasNext())
            {
                break;
            }
            if (l1 - Long.valueOf(((c)iterator.next()).a()).longValue() > 0x36ee80L)
            {
                iterator.remove();
            }
        } while (true);
        break MISSING_BLOCK_LABEL_93;
        exception;
        map;
        JVM INSTR monitorexit ;
        throw exception;
        map;
        JVM INSTR monitorexit ;
    }

    private boolean f()
    {
        NotificationSetting notificationsetting = c.a();
        return c.a(notificationsetting);
    }

    private void g()
    {
        for (FolderCounts foldercounts = r; foldercounts == null || foldercounts.b() != 0;)
        {
            return;
        }

        long l1 = q + 0x1d4c0L;
        long l2 = System.currentTimeMillis();
        if (l1 <= l2)
        {
            b();
            return;
        } else
        {
            h.postDelayed(new ay(this), l1 - l2);
            return;
        }
    }

    public void a()
    {
        for (Iterator iterator = e.iterator(); iterator.hasNext(); ((am)iterator.next()).a(aj.NEW_BUILD)) { }
    }

    public void a(ao ao)
    {
        f.a(new bg(this, ao));
    }

    public void a(bi bi)
    {
        f.a(new bf(this, bi));
    }

    public void a(w w1)
    {
        f.a(new bd(this, w1));
    }

    public void a(a a1)
    {
        f.a(new be(this, a1));
    }

    public void a(FolderCounts foldercounts)
    {
        r = foldercounts;
        h.post(new ax(this));
    }

    public void a(String s)
    {
        f.a(new bc(this, s));
    }

    public void a(String s, Message message, g g1)
    {
        f.a(new bb(this, s, message, g1));
    }

    public void b()
    {
        for (Iterator iterator = e.iterator(); iterator.hasNext(); ((am)iterator.next()).a()) { }
        com.facebook.messages.ipc.peer.e.a(m);
    }

    public void b(String s)
    {
        for (Iterator iterator = e.iterator(); iterator.hasNext(); ((am)iterator.next()).a(s)) { }
        com.facebook.messages.ipc.peer.e.a(s, m);
    }

}
