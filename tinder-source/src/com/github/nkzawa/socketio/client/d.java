// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.github.nkzawa.socketio.client;

import com.github.nkzawa.b.a;
import com.github.nkzawa.engineio.client.Socket;
import com.github.nkzawa.socketio.a.b;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.Set;
import java.util.logging.Logger;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

// Referenced classes of package com.github.nkzawa.socketio.client:
//            Manager, a, c

public class d extends a
{

    protected static Map b = new Socket._cls1();
    private static final Logger e = Logger.getLogger(com/github/nkzawa/socketio/client/d.getName());
    String c;
    public volatile boolean d;
    private int f;
    private String g;
    private Manager h;
    private Map i;
    private Queue j;
    private final Queue k = new LinkedList();
    private final Queue l = new LinkedList();

    public d(Manager manager, String s)
    {
        i = new HashMap();
        h = manager;
        g = s;
    }

    static a a(d d1, String s, Object aobj[])
    {
        return d1.a.a(s, aobj);
    }

    static JSONArray a(JSONArray jsonarray, int i1)
    {
        return b(jsonarray, i1);
    }

    private void a(b b1)
    {
        b1.c = g;
        h.a(b1);
    }

    static void a(d d1)
    {
        e.fine("transport is open - connecting");
        if (!"/".equals(d1.g))
        {
            d1.a(new b(0));
        }
    }

    static void a(d d1, b b1)
    {
        if (!d1.g.equals(b1.c)) goto _L2; else goto _L1
_L1:
        b1.a;
        JVM INSTR tableswitch 0 6: default 60
    //                   0 61
    //                   1 186
    //                   2 162
    //                   3 174
    //                   4 219
    //                   5 168
    //                   6 180;
           goto _L2 _L3 _L4 _L5 _L6 _L7 _L8 _L9
_L2:
        return;
_L3:
        d1.d = true;
        d1.a("connect", new Object[0]);
        do
        {
            b1 = (List)d1.k.poll();
            if (b1 == null)
            {
                break;
            }
            d1.a.a((String)b1.get(0), b1.toArray());
        } while (true);
        d1.k.clear();
        do
        {
            b1 = (b)d1.l.poll();
            if (b1 != null)
            {
                d1.a(b1);
            } else
            {
                d1.l.clear();
                return;
            }
        } while (true);
_L5:
        d1.b(b1);
        return;
_L8:
        d1.b(b1);
        return;
_L6:
        d1.c(b1);
        return;
_L9:
        d1.c(b1);
        return;
_L4:
        e.fine(String.format("server disconnect (%s)", new Object[] {
            d1.g
        }));
        d1.c();
        d1.a("io server disconnect");
        return;
_L7:
        d1.a("error", new Object[] {
            b1.d
        });
        return;
    }

    static void a(d d1, String s)
    {
        d1.a(s);
    }

    private void a(String s)
    {
        e.fine(String.format("close (%s)", new Object[] {
            s
        }));
        d = false;
        c = null;
        a("disconnect", new Object[] {
            s
        });
    }

    private static Object[] a(JSONArray jsonarray)
    {
        int j1 = jsonarray.length();
        Object aobj[] = new Object[j1];
        int i1 = 0;
        while (i1 < j1) 
        {
            Object obj;
            Object obj1;
            try
            {
                obj = jsonarray.get(i1);
            }
            catch (JSONException jsonexception)
            {
                jsonexception = null;
            }
            obj1 = obj;
            if (obj == JSONObject.NULL)
            {
                obj1 = null;
            }
            aobj[i1] = obj1;
            i1++;
        }
        return aobj;
    }

    static Logger b()
    {
        return e;
    }

    private static JSONArray b(JSONArray jsonarray, int i1)
    {
        JSONArray jsonarray1 = new JSONArray();
        int j1 = 0;
        while (j1 < jsonarray.length()) 
        {
            if (j1 != i1)
            {
                Object obj;
                try
                {
                    obj = jsonarray.get(j1);
                }
                catch (JSONException jsonexception)
                {
                    jsonexception = null;
                }
                jsonarray1.put(obj);
            }
            j1++;
        }
        return jsonarray1;
    }

    private void b(b b1)
    {
        ArrayList arraylist = new ArrayList(Arrays.asList(a((JSONArray)b1.d)));
        e.fine(String.format("emitting event %s", new Object[] {
            arraylist
        }));
        if (b1.b >= 0)
        {
            e.fine("attaching ack callback to event");
            int i1 = b1.b;
            arraylist.add(new com.github.nkzawa.socketio.client.a(new boolean[] {
                false
            }, i1, this) {

                final boolean a[];
                final int b;
                final d c;
                final d d;

                public final transient void a(Object aobj[])
                {
                    com.github.nkzawa.f.a.a(new Runnable(this, aobj) {

                        final Object a[];
                        final _cls3 b;

                        public final void run()
                        {
                            if (b.a[0])
                            {
                                return;
                            }
                            b.a[0] = true;
                            Logger logger = com.github.nkzawa.socketio.client.d.b();
                            Object obj;
                            byte byte0;
                            if (a.length != 0)
                            {
                                obj = ((Object) (a));
                            } else
                            {
                                obj = null;
                            }
                            logger.fine(String.format("sending ack %s", ((Object []) (obj))));
                            if (com.github.nkzawa.d.a.a(((Object) (a))))
                            {
                                byte0 = 6;
                            } else
                            {
                                byte0 = 3;
                            }
                            obj = new b(byte0, new JSONArray(Arrays.asList(a)));
                            obj.b = b.b;
                            com.github.nkzawa.socketio.client.d.b(b.c, ((b) (obj)));
                        }

            
            {
                b = _pcls3;
                a = aobj;
                super();
            }
                    });
                }

            
            {
                d = d.this;
                a = aflag;
                b = i1;
                c = d2;
                super();
            }
            });
        }
        if (d)
        {
            if (arraylist.size() == 0)
            {
                return;
            } else
            {
                super.a(arraylist.remove(0).toString(), arraylist.toArray());
                return;
            }
        } else
        {
            k.add(arraylist);
            return;
        }
    }

    static void b(d d1, b b1)
    {
        d1.a(b1);
    }

    static boolean b(d d1)
    {
        return d1.d;
    }

    private void c()
    {
        if (j != null)
        {
            for (Iterator iterator = j.iterator(); iterator.hasNext(); ((c.a)iterator.next()).a()) { }
            j = null;
        }
        Manager manager = h;
        manager.g.remove(this);
        if (manager.g.size() <= 0)
        {
            if (manager.d != Manager.ReadyState.c)
            {
                manager.b();
            }
            manager.e = true;
            manager.f.e = 0;
            manager.d = com.github.nkzawa.socketio.client.Manager.ReadyState.a;
            if (manager.h != null)
            {
                manager.h.b();
            }
        }
    }

    private void c(b b1)
    {
        com.github.nkzawa.socketio.client.a a1 = (com.github.nkzawa.socketio.client.a)i.remove(Integer.valueOf(b1.b));
        if (a1 != null)
        {
            e.fine(String.format("calling ack %s with %s", new Object[] {
                Integer.valueOf(b1.b), b1.d
            }));
            a1.a(a((JSONArray)b1.d));
            return;
        } else
        {
            e.fine(String.format("bad ack %s", new Object[] {
                Integer.valueOf(b1.b)
            }));
            return;
        }
    }

    static void c(d d1)
    {
        if (d1.j == null)
        {
            d1.j = d1. new Socket._cls2(d1.h);
        }
    }

    static Manager d(d d1)
    {
        return d1.h;
    }

    static int e(d d1)
    {
        return d1.f;
    }

    static Map f(d d1)
    {
        return d1.i;
    }

    static int g(d d1)
    {
        int i1 = d1.f;
        d1.f = i1 + 1;
        return i1;
    }

    static Queue h(d d1)
    {
        return d1.l;
    }

    static String i(d d1)
    {
        return d1.g;
    }

    static void j(d d1)
    {
        d1.c();
    }

    public final transient a a(String s, Object aobj[])
    {
        com.github.nkzawa.f.a.a(new Runnable(s, aobj) {

            final String a;
            final Object b[];
            final d c;

            public final void run()
            {
                if (com.github.nkzawa.socketio.client.d.b.containsKey(a))
                {
                    com.github.nkzawa.socketio.client.d.a(c, a, b);
                    return;
                }
                ArrayList arraylist = new ArrayList(b.length + 1);
                arraylist.add(a);
                arraylist.addAll(Arrays.asList(b));
                JSONArray jsonarray = new JSONArray();
                for (Iterator iterator = arraylist.iterator(); iterator.hasNext(); jsonarray.put(iterator.next())) { }
                b b1;
                byte byte0;
                if (com.github.nkzawa.d.a.a(jsonarray))
                {
                    byte0 = 5;
                } else
                {
                    byte0 = 2;
                }
                b1 = new b(byte0, jsonarray);
                if (arraylist.get(arraylist.size() - 1) instanceof com.github.nkzawa.socketio.client.a)
                {
                    com.github.nkzawa.socketio.client.d.b().fine(String.format("emitting packet with ack id %d", new Object[] {
                        Integer.valueOf(d.e(c))
                    }));
                    d.f(c).put(Integer.valueOf(d.e(c)), (com.github.nkzawa.socketio.client.a)arraylist.remove(arraylist.size() - 1));
                    b1.d = com.github.nkzawa.socketio.client.d.a(jsonarray, jsonarray.length() - 1);
                    b1.b = d.g(c);
                }
                if (com.github.nkzawa.socketio.client.d.b(c))
                {
                    com.github.nkzawa.socketio.client.d.b(c, b1);
                    return;
                } else
                {
                    d.h(c).add(b1);
                    return;
                }
            }

            
            {
                c = d.this;
                a = s;
                b = aobj;
                super();
            }
        });
        return this;
    }


    // Unreferenced inner class com/github/nkzawa/socketio/client/Socket$1

/* anonymous class */
    static final class Socket._cls1 extends HashMap
    {

            
            {
                put("connect", Integer.valueOf(1));
                put("connect_error", Integer.valueOf(1));
                put("connect_timeout", Integer.valueOf(1));
                put("disconnect", Integer.valueOf(1));
                put("error", Integer.valueOf(1));
                put("reconnect", Integer.valueOf(1));
                put("reconnect_attempt", Integer.valueOf(1));
                put("reconnect_failed", Integer.valueOf(1));
                put("reconnect_error", Integer.valueOf(1));
                put("reconnecting", Integer.valueOf(1));
            }
    }


    // Unreferenced inner class com/github/nkzawa/socketio/client/Socket$2

/* anonymous class */
    class Socket._cls2 extends LinkedList
    {

        final Manager a;
        final d b;

            
            {
                b = d.this;
                a = manager;
                super();
                add(com.github.nkzawa.socketio.client.c.a(a, "open", new Socket._cls2._cls1(this)));
                add(com.github.nkzawa.socketio.client.c.a(a, "packet", new Socket._cls2._cls2(this)));
                add(com.github.nkzawa.socketio.client.c.a(a, "close", new Socket._cls2._cls3(this)));
            }
    }


    // Unreferenced inner class com/github/nkzawa/socketio/client/Socket$2$1

/* anonymous class */
    final class Socket._cls2._cls1
        implements com.github.nkzawa.b.a.a
    {

        final Socket._cls2 a;

        public final transient void a(Object aobj[])
        {
            com.github.nkzawa.socketio.client.d.a(a.b);
        }

            
            {
                a = _pcls2;
                super();
            }
    }


    // Unreferenced inner class com/github/nkzawa/socketio/client/Socket$2$2

/* anonymous class */
    final class Socket._cls2._cls2
        implements com.github.nkzawa.b.a.a
    {

        final Socket._cls2 a;

        public final transient void a(Object aobj[])
        {
            com.github.nkzawa.socketio.client.d.a(a.b, (b)aobj[0]);
        }

            
            {
                a = _pcls2;
                super();
            }
    }


    // Unreferenced inner class com/github/nkzawa/socketio/client/Socket$2$3

/* anonymous class */
    final class Socket._cls2._cls3
        implements com.github.nkzawa.b.a.a
    {

        final Socket._cls2 a;

        public final transient void a(Object aobj[])
        {
            d d1 = a.b;
            if (aobj.length > 0)
            {
                aobj = (String)aobj[0];
            } else
            {
                aobj = null;
            }
            com.github.nkzawa.socketio.client.d.a(d1, ((String) (aobj)));
        }

            
            {
                a = _pcls2;
                super();
            }
    }


    // Unreferenced inner class com/github/nkzawa/socketio/client/d$1

/* anonymous class */
    public final class _cls1
        implements Runnable
    {

        final d a;

        public final void run()
        {
            if (!com.github.nkzawa.socketio.client.d.b(a))
            {
                d.c(a);
                d.d(a).a(null);
                if (Manager.ReadyState.c == d.d(a).d)
                {
                    com.github.nkzawa.socketio.client.d.a(a);
                    return;
                }
            }
        }

            public 
            {
                a = d.this;
                super();
            }
    }


    // Unreferenced inner class com/github/nkzawa/socketio/client/d$4

/* anonymous class */
    public final class _cls4
        implements Runnable
    {

        final d a;

        public final void run()
        {
            if (com.github.nkzawa.socketio.client.d.b(a))
            {
                com.github.nkzawa.socketio.client.d.b().fine(String.format("performing disconnect (%s)", new Object[] {
                    d.i(a)
                }));
                com.github.nkzawa.socketio.client.d.b(a, new b(1));
            }
            d.j(a);
            if (com.github.nkzawa.socketio.client.d.b(a))
            {
                com.github.nkzawa.socketio.client.d.a(a, "io client disconnect");
            }
        }

            public 
            {
                a = d.this;
                super();
            }
    }

}
