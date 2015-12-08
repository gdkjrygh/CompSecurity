// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.kik.cards.web.plugin;

import com.kik.cards.web.ax;
import com.kik.g.e;
import com.kik.g.f;
import com.kik.g.i;
import com.kik.g.k;
import com.kik.m.a;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kik.android.util.DeviceUtils;
import kik.android.util.bx;
import kik.android.util.cq;
import org.c.b;
import org.c.c;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

// Referenced classes of package com.kik.cards.web.plugin:
//            d, j, g, c, 
//            f, i, b

public final class h
{
    private final class a
        implements com.kik.cards.web.plugin.b
    {

        final h a;

        public final void a(String s, JSONObject jsonobject)
        {
            if (com.kik.cards.web.plugin.h.a(a) != null)
            {
                com.kik.cards.web.plugin.h.e().a("async callback: {} method: {}", jsonobject.toString(), s);
                com.kik.cards.web.plugin.h.a(a).a(s, new String[] {
                    jsonobject.toString()
                });
                return;
            } else
            {
                com.kik.cards.web.plugin.h.e().c("Error firing event {}, no invoker", jsonobject.toString());
                return;
            }
        }

        private a()
        {
            a = h.this;
            super();
        }

        a(byte byte0)
        {
            this();
        }
    }

    private final class b extends i
    {

        final String a;
        final h b;

        public final void a(com.kik.cards.web.plugin.f f1)
        {
            if (com.kik.cards.web.plugin.h.a(b) != null)
            {
                com.kik.cards.web.plugin.h.e().a("Firing event: {}", f1.b());
                com.kik.cards.web.plugin.h.a(b).a(a, new String[] {
                    f1.b(), f1.a().toString()
                });
                return;
            } else
            {
                com.kik.cards.web.plugin.h.e().c("Error firing event {}, no invoker", f1.b());
                return;
            }
        }

        public final volatile void a(Object obj, Object obj1)
        {
            a((com.kik.cards.web.plugin.f)obj1);
        }

        public b(String s)
        {
            b = h.this;
            super();
            a = s;
        }
    }

    private static final class c
    {

        private Method a;
        private d b;
        private String c;
        private boolean d;

        public final Method a()
        {
            return a;
        }

        public final String b()
        {
            return c;
        }

        public final d c()
        {
            return b;
        }

        public final boolean d()
        {
            return d;
        }

        public final String e()
        {
            return String.format("%s.%s", new Object[] {
                b.f(), c
            });
        }

        public c(Method method, d d1, String s)
        {
            a = method;
            b = d1;
            c = s;
            d = false;
        }

        public c(Method method, d d1, String s, byte byte0)
        {
            this(method, d1, s);
            d = true;
        }
    }


    private static final org.c.b l = org.c.c.a("CardsWebPluginReg");
    Map a;
    private k b;
    private Map c;
    private Map d;
    private Map e;
    private ax f;
    private f g;
    private com.kik.m.a h;
    private String i;
    private boolean j;
    private com.kik.cards.web.plugin.b k;
    private kik.a.f.k m;

    public h(com.kik.m.a a1, String s, kik.a.f.k k1)
    {
        a = new HashMap();
        b = new k(this);
        c = new HashMap();
        d = new HashMap();
        e = new HashMap();
        f = null;
        g = new f();
        k = new a((byte)0);
        h = a1;
        i = s;
        m = k1;
    }

    static ax a(h h1)
    {
        return h1.f;
    }

    private d a(String s)
    {
        Object obj;
        obj = (d)c.remove(s);
        if (obj == null)
        {
            break MISSING_BLOCK_LABEL_173;
        }
        s = (List)e.remove(s);
        if (s != null)
        {
            b b1;
            for (s = s.iterator(); s.hasNext(); g.b(((d) (obj)).i(), b1))
            {
                b1 = (b)s.next();
            }

        }
        s = d;
        s;
        JVM INSTR monitorenter ;
        Iterator iterator = d.entrySet().iterator();
        do
        {
            if (!iterator.hasNext())
            {
                break;
            }
            if (((String)((java.util.Map.Entry)iterator.next()).getKey()).startsWith((new StringBuilder()).append(((d) (obj)).f()).append(".").toString()))
            {
                iterator.remove();
            }
        } while (true);
        break MISSING_BLOCK_LABEL_167;
        obj;
        s;
        JVM INSTR monitorexit ;
        throw obj;
        s;
        JVM INSTR monitorexit ;
        ((d) (obj)).f_();
        return ((d) (obj));
    }

    private j a(String s, String s1)
    {
        b b1 = null;
        List list = (List)e.get(s);
        if (list != null)
        {
            Iterator iterator = list.iterator();
            do
            {
                if (!iterator.hasNext())
                {
                    break;
                }
                b b2 = (b)iterator.next();
                if (s1.equals(b2.a))
                {
                    b1 = b2;
                }
            } while (true);
            if (b1 != null)
            {
                list.remove(b1);
                g.b(((d)c.get(s)).i(), b1);
                return new j();
            } else
            {
                return new j(404);
            }
        } else
        {
            return new j(400);
        }
    }

    private j a(JSONObject jsonobject, String s)
    {
        d d1;
        j j1;
        d1 = (d)c.get(jsonobject.get("name"));
        if (d1 == null)
        {
            l.b("Plugin not found: {}", jsonobject.get("name"));
            return new j(404);
        }
        if (!d1.a(s))
        {
            l.b("Plugin access forbidden: {}", d1.f());
            return new j(403);
        }
        j1 = new j();
        j1.b().put("version", d1.g());
        j1.b().put("name", d1.f());
        ArrayList arraylist = new ArrayList();
        s = d1.getClass().getMethods();
        int k1 = s.length;
        int i1 = 0;
        while (i1 < k1) 
        {
            Method method = s[i1];
            if (method.getAnnotation(com/kik/cards/web/plugin/g) != null)
            {
                arraylist.add(new c(method, d1, method.getName()));
            } else
            if (method.getAnnotation(com/kik/cards/web/plugin/c) != null)
            {
                arraylist.add(new c(method, d1, method.getName(), (byte)0));
            }
            i1++;
        }
        s = new JSONArray();
        for (Iterator iterator = arraylist.iterator(); iterator.hasNext();)
        {
            c c1 = (c)iterator.next();
            s.put(c1.b());
            synchronized (d)
            {
                d.put(c1.e(), c1);
            }
        }

        break MISSING_BLOCK_LABEL_325;
        jsonobject;
        map;
        JVM INSTR monitorexit ;
        throw jsonobject;
        j1.b().put("functions", s);
        jsonobject = jsonobject.optString("eventCallback");
        if (jsonobject != null && jsonobject.length() > 0)
        {
            b b1 = new b(jsonobject);
            s = (List)e.get(d1.f());
            jsonobject = s;
            if (s == null)
            {
                jsonobject = new ArrayList();
                e.put(d1.f(), jsonobject);
            }
            jsonobject.add(b1);
            g.a(d1.i(), b1);
            for (jsonobject = d1.h().iterator(); jsonobject.hasNext(); b1.a((com.kik.cards.web.plugin.f)jsonobject.next())) { }
        }
        l.a("Success requesting plugin: {}", d1.f());
        return j1;
    }

    static com.kik.cards.web.plugin.b b(h h1)
    {
        return h1.k;
    }

    static org.c.b e()
    {
        return l;
    }

    private j f()
    {
        JSONObject jsonobject = new JSONObject();
        try
        {
            String s = h.a();
            String s1 = h.c();
            String s2 = h.d();
            String s3 = h.e();
            String s4 = h.f();
            String s5 = m.i();
            jsonobject.put("version", s);
            jsonobject.put("feature", s1);
            jsonobject.put("buildDate", s2);
            jsonobject.put("machineName", s3);
            jsonobject.put("commit", s4);
            jsonobject.put("metricsUrl", cq.a(s5));
        }
        catch (Exception exception)
        {
            l.b((new StringBuilder("Error generating requestVersion result: ")).append(exception.getMessage()).toString());
            return new j(500);
        }
        return new j(jsonobject);
    }

    public final e a()
    {
        return b.a();
    }

    public final String a(String s, String s1, String s2)
    {
        boolean flag = false;
        if (s1 == null) goto _L2; else goto _L1
_L1:
        if (!"".equals(s1)) goto _L3; else goto _L2
_L2:
        s1 = new JSONObject();
_L6:
        if (!"requestPlugin".equals(s)) goto _L5; else goto _L4
_L4:
        s1 = a(((JSONObject) (s1)), s2);
        flag = true;
_L7:
        s2 = s1;
        if (s1 == null)
        {
            s2 = new j(500);
        }
        if (!flag)
        {
            b.a(s);
            j = true;
        }
        s = new JSONObject();
        c c1;
        Method method;
        boolean flag1;
        try
        {
            s.put("status", s2.a());
            s.put("data", s2.b());
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            return "{status: 500, data: {}, wtf: true}";
        }
        return s.toString();
_L3:
        s1 = new JSONObject(s1);
          goto _L6
_L5:
label0:
        {
            if (!"requestVersion".equals(s))
            {
                break label0;
            }
            s1 = f();
        }
          goto _L7
label1:
        {
            if (!"unbindCallback".equals(s))
            {
                break label1;
            }
            s1 = a(s1.getString("name"), s1.getString("eventCallback"));
        }
          goto _L7
        c1 = (c)d.get(s);
label2:
        {
            if (c1 != null)
            {
                break label2;
            }
            try
            {
                s1 = new j(404);
            }
            // Misplaced declaration of an exception variable
            catch (String s1)
            {
                s1.printStackTrace();
                s1 = new j(400);
            }
            // Misplaced declaration of an exception variable
            catch (String s1)
            {
                s1.printStackTrace();
                s1 = new j(500);
            }
        }
          goto _L7
label3:
        {
            if (!c1.d())
            {
                break label3;
            }
            s1 = new j(405);
        }
          goto _L7
        method = c1.a();
        if (method.getParameterTypes().length != 1)
        {
            break MISSING_BLOCK_LABEL_334;
        }
        s1 = (j)method.invoke(c1.c(), new Object[] {
            s1
        });
_L8:
        s2 = c1.c();
        if (s2 == null)
        {
            break MISSING_BLOCK_LABEL_368;
        }
        flag1 = s2.b();
        flag = flag1;
          goto _L7
        s1 = (j)method.invoke(c1.c(), new Object[] {
            s1, s2
        });
          goto _L8
        flag = false;
          goto _L7
    }

    public final String a(String s, String s1, String s2, String s3)
    {
        if (s1 == null)
        {
            break MISSING_BLOCK_LABEL_14;
        }
        if (!"".equals(s1))
        {
            break MISSING_BLOCK_LABEL_103;
        }
        s1 = new JSONObject();
_L1:
        c c1 = (c)d.get(s);
        {
            if (c1 != null)
            {
                break MISSING_BLOCK_LABEL_115;
            }
            try
            {
                s1 = new j(404);
            }
            // Misplaced declaration of an exception variable
            catch (String s1)
            {
                Method method;
                if (DeviceUtils.c())
                {
                    s1.printStackTrace();
                } else
                {
                    bx.a(s1);
                }
                s1 = new j(400);
            }
            // Misplaced declaration of an exception variable
            catch (String s1)
            {
                if (DeviceUtils.c())
                {
                    s1.printStackTrace();
                } else
                {
                    bx.a(s1);
                }
                s1 = new j(500);
            }
        }
        s2 = new JSONObject();
        try
        {
            s2.put("status", s1.a());
            s2.put("data", s1.b());
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            return "{status: 500, data: {}, wtf: true}";
        }
        b.a(s);
        j = true;
        return s2.toString();
        s1 = new JSONObject(s1);
          goto _L1
label0:
        {
            if (c1.d())
            {
                break label0;
            }
            s1 = new j(405);
        }
        break MISSING_BLOCK_LABEL_53;
label1:
        {
            s2 = new com.kik.cards.web.plugin.i(this, s, s2);
            method = c1.a();
            if (method.getParameterTypes().length != 2)
            {
                break label1;
            }
            s1 = (j)method.invoke(c1.c(), new Object[] {
                s2, s1
            });
        }
        break MISSING_BLOCK_LABEL_53;
        s1 = (j)method.invoke(c1.c(), new Object[] {
            s2, s1, s3
        });
        break MISSING_BLOCK_LABEL_53;
    }

    public final void a(ax ax)
    {
        f = ax;
    }

    public final void a(d d1)
    {
        a(d1.f());
        c.put(d1.f(), d1);
    }

    public final boolean b()
    {
        return j;
    }

    public final void c()
    {
        for (Iterator iterator = (new ArrayList(c.keySet())).iterator(); iterator.hasNext(); a((String)iterator.next())) { }
        c.clear();
        e.clear();
        j = false;
        synchronized (d)
        {
            d.clear();
        }
        return;
        exception;
        map;
        JVM INSTR monitorexit ;
        throw exception;
    }

    public final boolean d()
    {
        return h.g();
    }

}
