// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.kik.android;

import android.content.SharedPreferences;
import com.kik.g.f;
import com.kik.g.p;
import com.kik.m.e;
import com.kik.sdkutils.ab;
import com.mixpanel.android.mpmetrics.v;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.io.UnsupportedEncodingException;
import java.math.BigInteger;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.UUID;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import kik.a.d.aa;
import kik.a.e.w;
import kik.a.j.m;
import kik.a.z;
import kik.android.util.bx;
import org.c.b;
import org.c.c;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

// Referenced classes of package com.kik.android:
//            b, d, e, f, 
//            c, g

public class com.kik.android.a
{
    private static final class a
        implements Serializable
    {

        private List a;

        public final List a()
        {
            return a;
        }

        public a()
        {
            a = new ArrayList();
        }
    }

    private static final class b
    {

        Set a;
        int b;

        public b(int i1)
        {
            b = i1;
            a = new HashSet();
        }
    }

    private static final class c
        implements Serializable
    {

        Set a;
        int b;
    }

    private static final class d
    {

        List a;

        public final List a()
        {
            ArrayList arraylist = new ArrayList();
            for (Iterator iterator = a.iterator(); iterator.hasNext(); arraylist.add(((b)iterator.next()).a)) { }
            return arraylist;
        }

        public d()
        {
            a = new ArrayList();
        }
    }

    private final class e extends f
    {

        final com.kik.android.a a;
        private boolean e;
        private final long f = 30000L;
        private f g;
        private ScheduledFuture h;

        public final void a()
        {
            String s1 = d();
            String s2 = (new StringBuilder()).append(s1).append(e()).toString();
            com.kik.android.a.a(a).remove((new StringBuilder()).append(d()).append(e()).toString());
            synchronized (com.kik.android.a.g(a))
            {
                if (h != null && !e)
                {
                    e = true;
                    com.kik.android.a.g(a).remove(s2);
                    g.a(f());
                    g.b();
                    h.cancel(false);
                    h = null;
                }
            }
            return;
            exception;
            map;
            JVM INSTR monitorexit ;
            throw exception;
        }

        public final void b()
        {
            if (h == null) goto _L2; else goto _L1
_L1:
            return;
_L2:
            e e1;
            String s1 = d();
            String s2 = (new StringBuilder()).append(s1).append(e()).toString();
            h = com.kik.android.a.h(a).schedule(new com.kik.android.g(this), f, TimeUnit.MILLISECONDS);
            synchronized (com.kik.android.a.g(a))
            {
                e1 = (e)com.kik.android.a.g(a).get(s2);
                com.kik.android.a.g(a).put(s2, this);
            }
            if (e1 == null || e1 == this) goto _L1; else goto _L3
_L3:
            e1.c();
            return;
            exception;
            map;
            JVM INSTR monitorexit ;
            throw exception;
        }

        public final void c()
        {
            if (h != null)
            {
                h.cancel(false);
                h = null;
            }
        }

        protected e(f f1)
        {
            a = com.kik.android.a.this;
            super(f1.d(), f1.e());
            b = f1.b;
            g = f1;
        }
    }

    public abstract class f
    {

        private String a;
        protected JSONObject b;
        protected boolean c;
        final com.kik.android.a d;
        private String e;

        public final f a(String s1)
        {
            try
            {
                int i1 = b.optInt(s1, 0);
                b.put(s1, i1 + 1);
            }
            // Misplaced declaration of an exception variable
            catch (String s1)
            {
                return this;
            }
            return this;
        }

        public final f a(String s1, double d1)
        {
            try
            {
                b.put(s1, d1);
            }
            // Misplaced declaration of an exception variable
            catch (String s1)
            {
                return this;
            }
            return this;
        }

        public final f a(String s1, long l1)
        {
            try
            {
                b.put(s1, l1);
            }
            // Misplaced declaration of an exception variable
            catch (String s1)
            {
                return this;
            }
            return this;
        }

        public final f a(String s1, Object obj)
        {
            try
            {
                b.put(s1, obj);
            }
            // Misplaced declaration of an exception variable
            catch (String s1)
            {
                return this;
            }
            return this;
        }

        public final f a(String s1, boolean flag)
        {
            try
            {
                b.put(s1, flag);
            }
            // Misplaced declaration of an exception variable
            catch (String s1)
            {
                return this;
            }
            return this;
        }

        public final f a(String s1, Object aobj[])
        {
            JSONArray jsonarray = new JSONArray();
            int j1 = aobj.length;
            for (int i1 = 0; i1 < j1; i1++)
            {
                jsonarray.put(aobj[i1]);
            }

            try
            {
                b.put(s1, jsonarray);
            }
            // Misplaced declaration of an exception variable
            catch (String s1)
            {
                return this;
            }
            return this;
        }

        protected final void a(JSONObject jsonobject)
        {
            b = jsonobject;
        }

        public final f b(String s1)
        {
            try
            {
                if (!b.has(s1))
                {
                    b.put(s1, false);
                }
            }
            // Misplaced declaration of an exception variable
            catch (String s1)
            {
                return this;
            }
            return this;
        }

        public final f b(String s1, long l1)
        {
            try
            {
                if (!b.has(s1))
                {
                    b.put(s1, l1);
                }
            }
            // Misplaced declaration of an exception variable
            catch (String s1)
            {
                return this;
            }
            return this;
        }

        public final f b(String s1, Object obj)
        {
            try
            {
                if (!b.has(s1))
                {
                    b.put(s1, obj);
                }
            }
            // Misplaced declaration of an exception variable
            catch (String s1)
            {
                return this;
            }
            return this;
        }

        public abstract void b();

        public final String d()
        {
            return a;
        }

        public final String e()
        {
            return e;
        }

        public final JSONObject f()
        {
            return b;
        }

        public final f g()
        {
            c = true;
            return this;
        }

        public String toString()
        {
            return (new StringBuilder()).append(a).append(" -> ").append(b.toString()).toString();
        }

        protected f(String s1, String s2)
        {
            d = com.kik.android.a.this;
            super();
            a = s1;
            e = s2;
            b = new JSONObject();
        }
    }

    private final class g extends f
    {

        final com.kik.android.a a;

        public final void b()
        {
            com.kik.android.a.e();
            (new StringBuilder("Event ")).append(toString());
            com.kik.android.a.a(a).remove((new StringBuilder()).append(d()).append(e()).toString());
            if (com.kik.android.a.b(a))
            {
                com.kik.android.a.c(a).add(this);
            } else
            {
                com.kik.android.a.d(a).a(d(), f());
                com.kik.android.a.d(a).a();
            }
            if (c)
            {
                com.kik.android.a.f(a).a(this, com.kik.android.a.e(a));
            }
        }

        protected g(String s1, String s2)
        {
            a = com.kik.android.a.this;
            super(s1, s2);
        }
    }

    private final class h extends f
    {

        final com.kik.android.a a;

        public final void b()
        {
            com.kik.android.a.e();
            (new StringBuilder("Event (Unsampled) ")).append(toString());
            com.kik.android.a.a(a).remove((new StringBuilder()).append(d()).append(e()).toString());
            if (c)
            {
                com.kik.android.a.f(a).a(this, com.kik.android.a.e(a));
            }
        }

        protected h(String s1, String s2)
        {
            a = com.kik.android.a.this;
            super(s1, s2);
        }
    }


    public static final String a[] = {
        "Wi-Fi Only", "Wi-Fi and Cellular", "Never"
    };
    public static final String b[] = {
        "Wi-Fi Only", "Wi-Fi and Cellular", "Never Play Videos Automatically"
    };
    private static final org.c.b c = org.c.c.a(com/kik/android/a);
    private final m d;
    private final kik.a.e.f e;
    private final com.kik.g.f f;
    private final w g;
    private v h;
    private com.kik.c.b i;
    private boolean j;
    private double k;
    private ScheduledExecutorService l;
    private boolean m;
    private List n;
    private SharedPreferences o;
    private ScheduledExecutorService p;
    private Map q;
    private Map r;
    private Map s;
    private Map t;
    private JSONObject u;
    private Map v;
    private kik.a.e.v w;
    private boolean x;
    private boolean y;
    private boolean z;

    public com.kik.android.a(v v1, m m1, kik.a.e.f f1, kik.a.e.v v2, w w1, SharedPreferences sharedpreferences, com.kik.c.b b1)
    {
        k = 0.10000000000000001D;
        l = Executors.newSingleThreadScheduledExecutor();
        h = v1;
        s = new HashMap();
        t = new HashMap();
        o = sharedpreferences;
        p = Executors.newSingleThreadScheduledExecutor();
        q = new HashMap();
        r = new HashMap();
        m = false;
        n = new ArrayList();
        u = new JSONObject();
        v = new HashMap();
        d = m1;
        e = f1;
        w = v2;
        g = w1;
        i = b1;
        f = new com.kik.g.f();
        f.a(e.b(), new com.kik.android.b(this));
        f();
        v1 = o.getString("Mixpanel.SuperProperties", "{}");
        u = new JSONObject(v1);
        synchronized (u)
        {
            h.a(u);
        }
_L2:
        h();
        j();
        return;
        m1;
        v1;
        JVM INSTR monitorexit ;
        try
        {
            throw m1;
        }
        // Misplaced declaration of an exception variable
        catch (v v1)
        {
            c.b("Failed to load super properties for mixpanel", v1);
        }
        if (true) goto _L2; else goto _L1
_L1:
    }

    static Map a(com.kik.android.a a1)
    {
        return a1.r;
    }

    static void a(com.kik.android.a a1, String s1)
    {
        a1.d(s1);
    }

    static void a(com.kik.android.a a1, boolean flag)
    {
        a1.b(flag);
    }

    private void a(boolean flag, boolean flag1)
    {
label0:
        {
            synchronized (u)
            {
                z = z | flag1;
                if (z)
                {
                    break label0;
                }
            }
            return;
        }
        if (flag)
        {
            break MISSING_BLOCK_LABEL_65;
        }
        l.schedule(new com.kik.android.d(this), 1000L, TimeUnit.MILLISECONDS);
        jsonobject;
        JVM INSTR monitorexit ;
        return;
        exception;
        jsonobject;
        JVM INSTR monitorexit ;
        throw exception;
        o.edit().putString("Mixpanel.SuperProperties", u.toString()).commit();
        z = false;
        jsonobject;
        JVM INSTR monitorexit ;
    }

    private com.kik.android.a b(String s1, long l1)
    {
        synchronized (u)
        {
            if (c())
            {
                h.a((new JSONObject()).put(s1, l1));
            }
            u.put(s1, l1);
        }
        try
        {
            a(false, true);
        }
        catch (JSONException jsonexception) { }
        b(s1, Long.valueOf(l1));
        return this;
        exception;
        jsonobject;
        JVM INSTR monitorexit ;
        throw exception;
    }

    private void b(String s1, Object obj)
    {
        StringBuilder stringbuilder = new StringBuilder("Super Property ");
        String s2;
        if (c())
        {
            s2 = "";
        } else
        {
            s2 = "(Unsampled) ";
        }
        stringbuilder.append(s2).append(s1).append(" -> ").append(obj);
    }

    private void b(boolean flag)
    {
        o.getBoolean("Mixpanel.IsFirstAccount", true);
        o.contains("Mixpanel.IsFirstAccount");
        c("Is First Account", flag);
        o.edit().putBoolean("Mixpanel.IsFirstAccount", flag).commit();
    }

    private void b(boolean flag, boolean flag1)
    {
label0:
        {
            synchronized (v)
            {
                x = x | flag1;
                if (x)
                {
                    break label0;
                }
            }
            return;
        }
        if (flag)
        {
            break MISSING_BLOCK_LABEL_65;
        }
        l.schedule(new com.kik.android.e(this), 1000L, TimeUnit.MILLISECONDS);
        map;
        JVM INSTR monitorexit ;
        return;
        exception;
        map;
        JVM INSTR monitorexit ;
        throw exception;
        Object obj = new ByteArrayOutputStream();
        Object obj1;
        obj1 = new DataOutputStream(((java.io.OutputStream) (obj)));
        ((DataOutputStream) (obj1)).writeInt(v.size());
        for (Iterator iterator = v.keySet().iterator(); iterator.hasNext();)
        {
            Object obj2 = (String)iterator.next();
            d d1 = (d)v.get(obj2);
            ((DataOutputStream) (obj1)).writeUTF(((String) (obj2)));
            ((DataOutputStream) (obj1)).writeInt(d1.a.size());
            obj2 = d1.a.iterator();
            while (((Iterator) (obj2)).hasNext()) 
            {
                Object obj3 = (b)((Iterator) (obj2)).next();
                ((DataOutputStream) (obj1)).writeInt(((b) (obj3)).b);
                ((DataOutputStream) (obj1)).writeInt(((b) (obj3)).a.size());
                obj3 = ((b) (obj3)).a.iterator();
                while (((Iterator) (obj3)).hasNext()) 
                {
                    ((DataOutputStream) (obj1)).writeInt(((Integer)((Iterator) (obj3)).next()).intValue());
                }
            }
        }

          goto _L1
        obj1;
        ((IOException) (obj1)).printStackTrace();
_L2:
        obj = com.kik.m.e.a(((ByteArrayOutputStream) (obj)).toByteArray());
        o.edit().putString("Mixpanel.PeriodDataNew", ((String) (obj)).toString()).commit();
_L3:
        x = false;
        map;
        JVM INSTR monitorexit ;
        return;
_L1:
        ((DataOutputStream) (obj1)).flush();
          goto _L2
        OutOfMemoryError outofmemoryerror;
        outofmemoryerror;
        bx.a(outofmemoryerror);
          goto _L3
    }

    static boolean b(com.kik.android.a a1)
    {
        return a1.m;
    }

    private static boolean b(String s1, double d1)
    {
        boolean flag = true;
        long l1;
        try
        {
            s1 = (new BigInteger(1, MessageDigest.getInstance("SHA-1").digest(s1.getBytes("UTF-8")))).toString(16);
            l1 = Long.valueOf(s1.substring(s1.length() - 8, s1.length()), 16).longValue();
        }
        // Misplaced declaration of an exception variable
        catch (String s1)
        {
            return false;
        }
        // Misplaced declaration of an exception variable
        catch (String s1)
        {
            return false;
        }
        if ((double)(l1 % 0x5f5e100L) > 1000000D * d1)
        {
            flag = false;
        }
        return flag;
    }

    static List c(com.kik.android.a a1)
    {
        return a1.n;
    }

    private void c(boolean flag, boolean flag1)
    {
        Map map = s;
        map;
        JVM INSTR monitorenter ;
label0:
        {
            y = y | flag1;
            if (y)
            {
                break label0;
            }
            return;
        }
        if (flag)
        {
            break MISSING_BLOCK_LABEL_65;
        }
        l.schedule(new com.kik.android.f(this), 1000L, TimeUnit.MILLISECONDS);
        map;
        JVM INSTR monitorexit ;
        Exception exception;
        return;
        map;
        JVM INSTR monitorexit ;
        throw exception;
        Object obj;
        try
        {
            obj = new JSONObject();
            java.util.Map.Entry entry;
            for (Iterator iterator = s.entrySet().iterator(); iterator.hasNext(); ((JSONObject) (obj)).put((String)entry.getKey(), new JSONArray((Collection)entry.getValue())))
            {
                entry = (java.util.Map.Entry)iterator.next();
            }

            break MISSING_BLOCK_LABEL_171;
        }
        // Misplaced declaration of an exception variable
        catch (Object obj) { }
        finally { }
        c.b("Failed to save datapoints for mixpanel", ((Throwable) (obj)));
_L1:
        y = false;
        map;
        JVM INSTR monitorexit ;
        return;
        o.edit().putString("Mixpanel.Datapoints", ((JSONObject) (obj)).toString()).commit();
          goto _L1
    }

    static v d(com.kik.android.a a1)
    {
        return a1.h;
    }

    private void d(String s1)
    {
        o.edit().putString("Mixpanel.UserId", s1).commit();
    }

    private com.kik.android.a e(String s1)
    {
        synchronized (u)
        {
            if (c())
            {
                h.b(s1);
            }
            u.remove(s1);
        }
        a(false, true);
        return this;
        s1;
        jsonobject;
        JVM INSTR monitorexit ;
        throw s1;
    }

    static org.c.b e()
    {
        return c;
    }

    static JSONObject e(com.kik.android.a a1)
    {
        return a1.u;
    }

    static com.kik.c.b f(com.kik.android.a a1)
    {
        return a1.i;
    }

    private void f()
    {
        if (kik.a.z.a(w))
        {
            d.b("enc_mixpanel_metrics", com/kik/n/a/h/a).a(new com.kik.android.c(this));
            return;
        } else
        {
            g();
            return;
        }
    }

    static Map g(com.kik.android.a a1)
    {
        return a1.q;
    }

    private void g()
    {
        String s2 = o.getString("Mixpanel.UserId", null);
        String s1 = s2;
        if (s2 == null)
        {
            s1 = UUID.randomUUID().toString().replaceAll("-", "");
            d(s1);
        }
        if (kik.a.z.a(w))
        {
            com.kik.n.a.h.a a1 = new com.kik.n.a.h.a();
            a1.a(Boolean.valueOf(o.getBoolean("Mixpanel.IsFirstAccount", true)));
            a1.a(s1);
            d.a("enc_mixpanel_metrics", null, a1, Long.valueOf(5000L));
            a(s1, true);
            return;
        }
        if (!o.contains("Mixpanel.IsFirstAccount"))
        {
            b(true);
        }
        a(s1, false);
    }

    static ScheduledExecutorService h(com.kik.android.a a1)
    {
        return a1.p;
    }

    private void h()
    {
        JSONObject jsonobject;
        Iterator iterator;
        jsonobject = new JSONObject(o.getString("Mixpanel.Datapoints", "{}"));
        iterator = jsonobject.keys();
_L3:
        String s1;
        JSONArray jsonarray;
        ArrayList arraylist;
        if (!iterator.hasNext())
        {
            break MISSING_BLOCK_LABEL_132;
        }
        s1 = (String)iterator.next();
        jsonarray = jsonobject.getJSONArray(s1);
        arraylist = new ArrayList();
        int i1 = 0;
_L2:
        if (i1 >= jsonarray.length())
        {
            break; /* Loop/switch isn't completed */
        }
        arraylist.add(Float.valueOf((float)jsonarray.getDouble(i1)));
        i1++;
        if (true) goto _L2; else goto _L1
_L1:
        s.put(s1, arraylist);
          goto _L3
        JSONException jsonexception;
        jsonexception;
        c.b("Failed to load datapoints for mixpanel", jsonexception);
    }

    private void i()
    {
        b(false, true);
    }

    static void i(com.kik.android.a a1)
    {
        a1.f();
    }

    private void j()
    {
        Object obj;
        obj = o.getString("Mixpanel.PeriodDataNew", null);
        if (obj == null)
        {
            break MISSING_BLOCK_LABEL_214;
        }
        Map map = v;
        map;
        JVM INSTR monitorenter ;
        v = new HashMap();
        int l1;
        obj = new DataInputStream(new ByteArrayInputStream(com.kik.m.e.a(((String) (obj)))));
        l1 = ((DataInputStream) (obj)).readInt();
        int i1 = 0;
_L6:
        if (i1 >= l1)
        {
            break; /* Loop/switch isn't completed */
        }
        String s1;
        d d1;
        int i2;
        s1 = ((DataInputStream) (obj)).readUTF();
        d1 = new d();
        i2 = ((DataInputStream) (obj)).readInt();
        int j1 = 0;
_L4:
        if (j1 >= i2)
        {
            break; /* Loop/switch isn't completed */
        }
        b b1;
        int j2;
        b1 = new b(((DataInputStream) (obj)).readInt());
        j2 = ((DataInputStream) (obj)).readInt();
        int k1 = 0;
_L2:
        if (k1 >= j2)
        {
            break; /* Loop/switch isn't completed */
        }
        b1.a.add(Integer.valueOf(((DataInputStream) (obj)).readInt()));
        k1++;
        if (true) goto _L2; else goto _L1
_L1:
        d1.a.add(b1);
        j1++;
        if (true) goto _L4; else goto _L3
_L3:
        v.put(s1, d1);
        i1++;
        if (true) goto _L6; else goto _L5
        Object obj1;
        obj1;
        ((IOException) (obj1)).printStackTrace();
_L5:
        map;
        JVM INSTR monitorexit ;
        return;
        obj1;
        map;
        JVM INSTR monitorexit ;
        throw obj1;
        k();
        return;
    }

    static void j(com.kik.android.a a1)
    {
        a1.g();
    }

    private void k()
    {
        Object obj = o.getString("Mixpanel.PeriodData", null);
        if (obj == null) goto _L2; else goto _L1
_L1:
        Map map = v;
        map;
        JVM INSTR monitorenter ;
        v = new HashMap();
        int j1;
        obj = new ObjectInputStream(new ByteArrayInputStream(com.kik.m.e.a(((String) (obj)))));
        j1 = ((ObjectInputStream) (obj)).readInt();
        int i1 = 0;
_L10:
        if (i1 >= j1) goto _L4; else goto _L3
_L3:
        String s1;
        d d1;
        Object obj2;
        s1 = ((ObjectInputStream) (obj)).readUTF();
        obj2 = (a)((ObjectInputStream) (obj)).readObject();
        d1 = new d();
        obj2 = ((a) (obj2)).a().iterator();
_L8:
        if (!((Iterator) (obj2)).hasNext()) goto _L6; else goto _L5
_L5:
        b b1;
        Object obj3 = (c)((Iterator) (obj2)).next();
        b1 = new b(((c) (obj3)).b);
        String s2;
        for (obj3 = ((c) (obj3)).a.iterator(); ((Iterator) (obj3)).hasNext(); b1.a.add(Integer.valueOf(s2.hashCode())))
        {
            s2 = (String)((Iterator) (obj3)).next();
        }

          goto _L7
        Object obj1;
        obj1;
        ((IOException) (obj1)).printStackTrace();
_L4:
        map;
        JVM INSTR monitorexit ;
_L2:
        i();
        o.edit().remove("Mixpanel.PeriodData").commit();
        return;
_L7:
        d1.a.add(b1);
          goto _L8
        obj1;
        ((ClassNotFoundException) (obj1)).printStackTrace();
          goto _L4
        obj1;
        map;
        JVM INSTR monitorexit ;
        throw obj1;
_L6:
        v.put(s1, d1);
        i1++;
        if (true) goto _L10; else goto _L9
_L9:
    }

    static void k(com.kik.android.a a1)
    {
        a1.a(true, false);
    }

    static void l(com.kik.android.a a1)
    {
        a1.b(true, false);
    }

    static void m(com.kik.android.a a1)
    {
        a1.c(true, false);
    }

    public final long a(String s1, String s2, String s3, String s4)
    {
        s1 = (new StringBuilder()).append(s1).append(s2).toString();
        s2 = (new StringBuilder()).append(s3).append(s4).toString();
        s1 = (Long)t.get(s1);
        s2 = (Long)t.get(s2);
        if (s1 == null || s2 == null)
        {
            return 0L;
        } else
        {
            return s2.longValue() - s1.longValue();
        }
    }

    public final com.kik.android.a a(String s1)
    {
        return a(s1, "", false);
    }

    public final com.kik.android.a a(String s1, double d1)
    {
        synchronized (u)
        {
            if (c())
            {
                h.a((new JSONObject()).put(s1, d1));
            }
            u.put(s1, d1);
        }
        try
        {
            a(false, true);
        }
        catch (JSONException jsonexception) { }
        b(s1, Double.valueOf(d1));
        return this;
        exception;
        jsonobject;
        JVM INSTR monitorexit ;
        throw exception;
    }

    public final com.kik.android.a a(String s1, float f1, float f2)
    {
        List list = (List)s.get(s1);
        Object obj = list;
        if (list == null)
        {
            obj = new ArrayList();
        }
        s.put(s1, obj);
        c(false, true);
        ((List) (obj)).add(Float.valueOf(f1));
        for (; ((List) (obj)).size() > 100; ((List) (obj)).remove(0)) { }
        obj = new ArrayList(((Collection) (obj)));
        Collections.sort(((List) (obj)));
        f1 = Math.min(((List) (obj)).size() - 1, (float)((List) (obj)).size() * f2);
        int i1 = (int)Math.floor(f1);
        if (i1 == ((List) (obj)).size() - 1)
        {
            f1 = ((Float)((List) (obj)).get(i1)).floatValue();
        } else
        {
            f1 -= i1;
            f2 = ((Float)((List) (obj)).get(i1)).floatValue();
            f1 = ((Float)((List) (obj)).get(i1 + 1)).floatValue() * f1 + (1.0F - f1) * f2;
        }
        a(s1, f1);
        return this;
    }

    public final com.kik.android.a a(String s1, int i1)
    {
        synchronized (u)
        {
            if (c())
            {
                h.a((new JSONObject()).put(s1, i1));
            }
            u.put(s1, i1);
        }
        try
        {
            a(false, true);
        }
        catch (JSONException jsonexception) { }
        b(s1, Integer.valueOf(i1));
        return this;
        exception;
        jsonobject;
        JVM INSTR monitorexit ;
        throw exception;
    }

    public final com.kik.android.a a(String s1, long l1)
    {
        synchronized (u)
        {
            if (!u.has(s1))
            {
                b(s1, l1);
            }
        }
        return this;
        s1;
        jsonobject;
        JVM INSTR monitorexit ;
        throw s1;
    }

    public final com.kik.android.a a(String s1, Object obj)
    {
        synchronized (u)
        {
            if (c())
            {
                h.a((new JSONObject()).put(s1, obj));
            }
            u.put(s1, obj);
        }
        try
        {
            a(false, true);
        }
        catch (JSONException jsonexception) { }
        b(s1, obj);
        return this;
        exception;
        jsonobject;
        JVM INSTR monitorexit ;
        throw exception;
    }

    public final com.kik.android.a a(String s1, String s2)
    {
        return a(s1, s2, false);
    }

    public final com.kik.android.a a(String s1, String s2, boolean flag)
    {
label0:
        {
            s2 = (new StringBuilder()).append(s1).append(s2).toString();
            long l1 = ab.a();
            if (t.containsKey(s2))
            {
                s1 = (Long)t.get(s2);
                if (!flag)
                {
                    break label0;
                }
            }
            s1 = Long.valueOf(l1);
        }
        t.put(s2, s1);
        return this;
    }

    public final void a()
    {
        b(false);
        s = new HashMap();
        u = new JSONObject();
        t = new HashMap();
        a(true, true);
        c(true, true);
        synchronized (u)
        {
            h.a(u);
        }
        return;
        exception;
        jsonobject;
        JVM INSTR monitorexit ;
        throw exception;
    }

    public final void a(String s1, boolean flag)
    {
        h.a(s1);
        if (j)
        {
            s1 = g.d().c;
            f f1;
            if (s1 != null)
            {
                a("Username", s1);
            } else
            {
                e("Username");
            }
        } else
        {
            e("Username");
        }
        if (flag)
        {
            m = false;
            for (s1 = n.iterator(); s1.hasNext(); f1.b())
            {
                f1 = (f)s1.next();
                f1.c = false;
            }

            n.clear();
        }
    }

    public final void a(boolean flag)
    {
        j = flag;
    }

    public final long b(String s1, String s2)
    {
        return a(s1, "", s2, "");
    }

    public final f b(String s1)
    {
        return c(s1, "");
    }

    public final com.kik.android.a b(String s1, boolean flag)
    {
        return a(s1, "", flag);
    }

    public final void b()
    {
        m = true;
    }

    public final f c(String s1)
    {
        return d(s1, "");
    }

    public final f c(String s1, String s2)
    {
        String s3 = (new StringBuilder()).append(s1).append(s2).toString();
        if (r.containsKey(s3))
        {
            return (f)r.get(s3);
        }
        if (c())
        {
            s1 = new g(s1, s2);
        } else
        {
            s1 = new h(s1, s2);
        }
        r.put(s3, s1);
        return s1;
    }

    public final com.kik.android.a c(String s1, boolean flag)
    {
        synchronized (u)
        {
            if (c())
            {
                h.a((new JSONObject()).put(s1, flag));
            }
            u.put(s1, flag);
        }
        try
        {
            a(false, true);
        }
        catch (JSONException jsonexception) { }
        b(s1, Boolean.valueOf(flag));
        return this;
        exception;
        jsonobject;
        JVM INSTR monitorexit ;
        throw exception;
    }

    public final boolean c()
    {
        String s1 = h.b();
        if (j)
        {
            return true;
        } else
        {
            return b(s1, k);
        }
    }

    public final f d(String s1, String s2)
    {
        String s3 = (new StringBuilder()).append(s1).append(s2).toString();
        if (r.containsKey(s3))
        {
            s2 = (f)r.get(s3);
            s1 = s2;
            if (!(s2 instanceof e))
            {
                s1 = new e(s2);
            }
        } else
        if (c())
        {
            s1 = new e(new g(s1, s2));
        } else
        {
            s1 = new e(new h(s1, s2));
        }
        r.put(s3, s1);
        return s1;
    }

    public final com.kik.android.a d()
    {
        Map map = q;
        map;
        JVM INSTR monitorenter ;
        e ae[];
        int j1;
        ae = new e[q.size()];
        q.values().toArray(ae);
        j1 = ae.length;
        int i1 = 0;
_L2:
        if (i1 >= j1)
        {
            break; /* Loop/switch isn't completed */
        }
        ae[i1].a();
        i1++;
        if (true) goto _L2; else goto _L1
_L1:
        if (c())
        {
            h.a();
        }
        i.a();
        map;
        JVM INSTR monitorexit ;
        return this;
        Exception exception;
        exception;
        map;
        JVM INSTR monitorexit ;
        throw exception;
    }

    public final boolean e(String s1, String s2)
    {
        e e1;
        synchronized (q)
        {
            e1 = (e)q.get((new StringBuilder()).append(s1).append(s2).toString());
            q.remove((new StringBuilder()).append(s1).append(s2).toString());
        }
        if (e1 != null)
        {
            e1.c();
            return true;
        } else
        {
            return false;
        }
        s1;
        map;
        JVM INSTR monitorexit ;
        throw s1;
    }

    public final com.kik.android.a f(String s1, String s2)
    {
        synchronized (u)
        {
            if (!u.has(s1))
            {
                a(s1, s2);
            }
        }
        return this;
        s1;
        jsonobject;
        JVM INSTR monitorexit ;
        throw s1;
    }

    public final com.kik.android.a g(String s1, String s2)
    {
        long l1 = System.currentTimeMillis();
        Map map = v;
        map;
        JVM INSTR monitorenter ;
        Object obj;
        d d1;
        int i1;
        if (!v.containsKey(s1))
        {
            v.put(s1, new d());
        }
        d1 = (d)v.get(s1);
        i1 = (int)(l1 / 0x1499700L);
        obj = d1.a.iterator();
        b b1;
        do
        {
            if (!((Iterator) (obj)).hasNext())
            {
                break MISSING_BLOCK_LABEL_191;
            }
            b1 = (b)((Iterator) (obj)).next();
        } while (b1.b != i1);
        obj = b1.a;
_L1:
        Object obj1;
        obj1 = new ArrayList();
        Iterator iterator2 = d1.a.iterator();
        do
        {
            if (!iterator2.hasNext())
            {
                break;
            }
            b b3 = (b)iterator2.next();
            if (b3.b < i1 - 28)
            {
                ((List) (obj1)).add(b3);
            }
        } while (true);
        break MISSING_BLOCK_LABEL_221;
        s1;
        map;
        JVM INSTR monitorexit ;
        throw s1;
        obj = new b(i1);
        d1.a.add(obj);
        obj = ((b) (obj)).a;
          goto _L1
        b b2;
        for (obj1 = ((List) (obj1)).iterator(); ((Iterator) (obj1)).hasNext(); d1.a.remove(b2))
        {
            b2 = (b)((Iterator) (obj1)).next();
        }

        if (s2 == null)
        {
            break MISSING_BLOCK_LABEL_286;
        }
        ((Set) (obj)).add(Integer.valueOf(s2.hashCode()));
        s2 = new HashSet();
        for (Iterator iterator = d1.a().iterator(); iterator.hasNext();)
        {
            Iterator iterator1 = ((Set)iterator.next()).iterator();
            while (iterator1.hasNext()) 
            {
                s2.add((Integer)iterator1.next());
            }
        }

        a(s1, s2.size());
        map;
        JVM INSTR monitorexit ;
        a(false, true);
        i();
        return this;
    }

}
