// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.l;

import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.support.v4.a.e;
import com.facebook.base.c;
import com.facebook.common.executors.a;
import com.facebook.common.w.q;
import com.facebook.debug.log.b;
import com.facebook.f.n;
import com.facebook.messages.model.threads.Message;
import com.facebook.messages.model.threads.ParticipantInfo;
import com.facebook.mqtt.x;
import com.facebook.prefs.shared.ae;
import com.facebook.prefs.shared.d;
import com.facebook.prefs.shared.f;
import com.facebook.push.mqtt.v;
import com.facebook.user.User;
import com.facebook.user.UserKey;
import com.fasterxml.jackson.databind.node.JsonNodeFactory;
import com.fasterxml.jackson.databind.node.ObjectNode;
import com.google.common.a.ef;
import com.google.common.a.hq;
import com.google.common.a.ik;
import com.google.common.a.iw;
import com.google.common.a.jf;
import com.google.common.d.a.i;
import com.google.common.d.a.u;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentMap;
import java.util.concurrent.Executor;

// Referenced classes of package com.facebook.l:
//            l, m, w, v, 
//            u, n, o, j, 
//            r, p, q, x, 
//            a, s

public class k
    implements c
{

    private static final Class a = com/facebook/l/k;
    private static final ae b = com.facebook.f.n.a("messenger_user_presence_active_android");
    private final v c;
    private final javax.inject.a d;
    private final javax.inject.a e;
    private final a f;
    private final u g;
    private final Executor h;
    private final d i;
    private final e j;
    private final f k = new m(this);
    private final javax.inject.a l;
    private final iw m = ef.m();
    private final ConcurrentMap n = ik.c();
    private final ConcurrentMap o = ik.c();
    private volatile boolean p;
    private final com.facebook.base.broadcast.q q;

    public k(Context context, v v1, javax.inject.a a1, javax.inject.a a2, a a3, u u1, Executor executor, 
            d d1, e e1, javax.inject.a a4)
    {
        a3.a();
        c = v1;
        d = a1;
        e = a2;
        f = a3;
        g = u1;
        h = executor;
        i = d1;
        j = e1;
        l = a4;
        v1 = new IntentFilter();
        v1.addAction("com.facebook.push.mqtt.ACTION_CHANNEL_STATE_CHANGED");
        v1.addAction("com.facebook.orca.ACTION_FRIEND_SYNC_PROGRESS");
        v1.addAction("com.facebook.orca.contacts.CONTACTS_UPLOAD_STATE_CHANGED");
        q = new l(this, context, v1);
        d1.a(k);
    }

    static void a(k k1)
    {
        k1.l();
    }

    static void a(k k1, Message message)
    {
        k1.b(message);
    }

    static void a(k k1, UserKey userkey, int i1)
    {
        k1.b(userkey, i1);
    }

    static void a(k k1, Map map, boolean flag)
    {
        k1.b(map, flag);
    }

    static boolean a(k k1, boolean flag)
    {
        k1.p = flag;
        return flag;
    }

    static void b(k k1)
    {
        k1.k();
    }

    private void b(Message message)
    {
        com.facebook.debug.log.b.a(a, "Message received: %s", new Object[] {
            message
        });
        message = message.i().e();
        w w1 = (w)o.get(message);
        if (w1 != null && w1.a)
        {
            w1.a = false;
            d(message);
        }
    }

    private void b(UserKey userkey, int i1)
    {
        boolean flag = true;
        com.facebook.debug.log.b.a(a, "User typing state changed: %d", new Object[] {
            Integer.valueOf(i1)
        });
        w w1 = c(userkey);
        if (i1 != 1)
        {
            flag = false;
        }
        w1.a = flag;
        d(userkey);
    }

    private void b(Map map, boolean flag)
    {
        com.facebook.debug.log.b.a(a, "Presence map received");
        if (flag)
        {
            for (Iterator iterator = o.values().iterator(); iterator.hasNext();)
            {
                ((w)iterator.next()).c = false;
            }

        }
        map = map.entrySet().iterator();
        while (map.hasNext()) 
        {
            java.util.Map.Entry entry = (java.util.Map.Entry)map.next();
            w w1 = c((UserKey)entry.getKey());
            boolean flag1;
            if (((Integer)entry.getValue()).intValue() == 2)
            {
                flag1 = true;
            } else
            {
                flag1 = false;
            }
            w1.c = flag1;
            d((UserKey)entry.getKey());
        }
        c(flag);
    }

    private void b(boolean flag)
    {
        com.facebook.debug.log.b.b(a, (new StringBuilder()).append("sendMusicPresenceNotification: ").append(flag).toString());
        f.a();
        if (!((Boolean)l.b()).booleanValue() || !c.d())
        {
            return;
        }
        ObjectNode objectnode = new ObjectNode(JsonNodeFactory.instance);
        if (flag)
        {
            objectnode.put("lm", true);
        } else
        {
            objectnode.putNull("lm");
        }
        c.a("/rich_presence", objectnode, x.FIRE_AND_FORGET);
        com.facebook.debug.log.b.b(a, "music presence sent!!!");
    }

    private w c(UserKey userkey)
    {
        w w1 = (w)o.get(userkey);
        Object obj = w1;
        if (w1 == null)
        {
            w w2 = new w(null);
            userkey = (w)o.putIfAbsent(userkey, w2);
            obj = userkey;
            if (userkey == null)
            {
                obj = w2;
            }
        }
        return ((w) (obj));
    }

    static void c(k k1)
    {
        k1.n();
    }

    private void c(boolean flag)
    {
        if (flag)
        {
            for (Iterator iterator = m.h().iterator(); iterator.hasNext(); d((UserKey)iterator.next())) { }
        }
        for (Iterator iterator1 = n.keySet().iterator(); iterator1.hasNext(); ((com.facebook.l.v)iterator1.next()).a()) { }
    }

    static void d(k k1)
    {
        k1.o();
    }

    private void d(UserKey userkey)
    {
        f.a();
        if (m.f(userkey))
        {
            com.facebook.l.x x1 = b(userkey);
            for (Iterator iterator = m.c(userkey).iterator(); iterator.hasNext(); ((com.facebook.l.u)iterator.next()).a(userkey, x1)) { }
        }
    }

    static void e(k k1)
    {
        k1.p();
    }

    static ae i()
    {
        return b;
    }

    static Class j()
    {
        return a;
    }

    private void k()
    {
        Intent intent = new Intent("com.facebook.orca.presence.PRESENCE_MANAGER_SETTINGS_CHANGED");
        j.a(intent);
        c(true);
    }

    private void l()
    {
        p = false;
        m();
    }

    private void m()
    {
        if (p)
        {
            return;
        } else
        {
            p = true;
            com.google.common.d.a.i.a(g.c(new com.facebook.l.n(this)), new o(this), h);
            return;
        }
    }

    private void n()
    {
        com.facebook.user.e e1;
        f.b();
        e1 = (com.facebook.user.e)d.b();
        e1.a();
_L1:
        User user = e1.c();
        if (user == null)
        {
            break MISSING_BLOCK_LABEL_85;
        }
        w w1 = c(user.c());
        Exception exception;
        boolean flag;
        if (user.x() == q.YES)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        w1.b = flag;
          goto _L1
        exception;
        e1.d();
        throw exception;
        e1.d();
        return;
    }

    private void o()
    {
        f.a();
        for (Iterator iterator = o.keySet().iterator(); iterator.hasNext(); d((UserKey)iterator.next())) { }
    }

    private void p()
    {
        com.facebook.debug.log.b.a(a, "MQTT disconnected");
        for (Iterator iterator = o.values().iterator(); iterator.hasNext();)
        {
            w w1 = (w)iterator.next();
            w1.c = false;
            w1.a = false;
        }

        for (Iterator iterator1 = m.h().iterator(); iterator1.hasNext(); d((UserKey)iterator1.next())) { }
    }

    private boolean q()
    {
        return h().shouldShowPresence();
    }

    public void a()
    {
        q.a();
    }

    public void a(com.facebook.l.v v1)
    {
        n.put(v1, Boolean.valueOf(true));
        m();
    }

    public void a(Message message)
    {
        f.b(new r(this, message));
    }

    public void a(UserKey userkey, int i1)
    {
        f.b(new p(this, userkey, i1));
    }

    public void a(UserKey userkey, com.facebook.l.u u1)
    {
        f.a();
        m.a(userkey, u1);
        m();
    }

    public void a(String s1, int i1)
    {
        f.a();
        if (!((Boolean)e.b()).booleanValue())
        {
            return;
        } else
        {
            ObjectNode objectnode = new ObjectNode(JsonNodeFactory.instance);
            objectnode.put("to", s1);
            objectnode.put("state", i1);
            c.a("/typing", objectnode, x.FIRE_AND_FORGET);
            return;
        }
    }

    public void a(Map map, boolean flag)
    {
        f.b(new com.facebook.l.q(this, map, flag));
    }

    public void a(boolean flag)
    {
        b(flag);
    }

    public boolean a(UserKey userkey)
    {
        if (!q())
        {
            return false;
        }
        userkey = (w)o.get(userkey);
        if (userkey == null)
        {
            return false;
        } else
        {
            return ((w) (userkey)).c;
        }
    }

    public com.facebook.l.x b(UserKey userkey)
    {
        if (!q())
        {
            return new com.facebook.l.x(a.NONE, false, false);
        }
        w w1 = (w)o.get(userkey);
        if (w1 == null)
        {
            return new com.facebook.l.x(a.NONE, false, false);
        }
        if (w1.c)
        {
            userkey = a.AVAILABLE;
        } else
        {
            userkey = a.NONE;
        }
        return new com.facebook.l.x(userkey, w1.b, w1.a);
    }

    public void b(com.facebook.l.v v1)
    {
        n.remove(v1);
    }

    public void b(UserKey userkey, com.facebook.l.u u1)
    {
        f.a();
        m.c(userkey, u1);
    }

    public boolean b()
    {
        if (!((Boolean)e.b()).booleanValue())
        {
            return false;
        } else
        {
            return c.d();
        }
    }

    public Collection c()
    {
        if (!q())
        {
            return Collections.emptyList();
        }
        java.util.ArrayList arraylist = hq.a();
        Iterator iterator = o.entrySet().iterator();
        do
        {
            if (!iterator.hasNext())
            {
                break;
            }
            java.util.Map.Entry entry = (java.util.Map.Entry)iterator.next();
            if (((w)entry.getValue()).c)
            {
                arraylist.add(entry.getKey());
            }
        } while (true);
        return arraylist;
    }

    public Collection d()
    {
        if (!((Boolean)e.b()).booleanValue())
        {
            return Collections.emptyList();
        }
        java.util.ArrayList arraylist = hq.a();
        Iterator iterator = o.entrySet().iterator();
        do
        {
            if (!iterator.hasNext())
            {
                break;
            }
            java.util.Map.Entry entry = (java.util.Map.Entry)iterator.next();
            if (((w)entry.getValue()).b)
            {
                arraylist.add(entry.getKey());
            }
        } while (true);
        return arraylist;
    }

    public void e()
    {
        f.b(new s(this));
    }

    public boolean f()
    {
        return ((Boolean)e.b()).booleanValue() && i.a(b, false);
    }

    public boolean g()
    {
        return f() && i.a(com.facebook.push.b.a.a, true);
    }

    public j h()
    {
        if (f())
        {
            if (g())
            {
                return j.ENABLED;
            } else
            {
                return j.DISABLED;
            }
        } else
        {
            return j.OFF;
        }
    }

}
