// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.android.volley;

import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.Collections;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

// Referenced classes of package com.android.volley:
//            c, d, l, a, 
//            o, g, m, r

public abstract class k
    implements Comparable
{
    public static final class a extends Enum
    {

        public static final a a;
        public static final a b;
        public static final a c;
        public static final a d;
        private static final a e[];

        public static a valueOf(String s1)
        {
            return (a)Enum.valueOf(com/android/volley/k$a, s1);
        }

        public static a[] values()
        {
            return (a[])e.clone();
        }

        static 
        {
            a = new a("LOW", 0);
            b = new a("NORMAL", 1);
            c = new a("HIGH", 2);
            d = new a("IMMEDIATE", 3);
            e = (new a[] {
                a, b, c, d
            });
        }

        private a(String s1, int i1)
        {
            super(s1, i1);
        }
    }


    private static long p;
    private final s.a a;
    private final int b;
    private final String c;
    private String d;
    private String e;
    private final int f;
    private m.a g;
    private Integer h;
    private l i;
    private boolean j;
    private boolean k;
    private boolean l;
    private o m;
    private b.a n;
    private Object o;

    public k(int i1, String s1, m.a a1)
    {
        s.a a2;
        if (s.a.a)
        {
            a2 = new s.a();
        } else
        {
            a2 = null;
        }
        a = a2;
        j = true;
        k = false;
        l = false;
        n = null;
        b = i1;
        c = s1;
        e = a(i1, s1);
        g = a1;
        a(new c());
        f = d(s1);
    }

    private static String a(int i1, String s1)
    {
        s1 = (new StringBuilder()).append("Request:").append(i1).append(":").append(s1).append(":").append(System.currentTimeMillis()).append(":");
        long l1 = p;
        p = 1L + l1;
        return com.android.volley.d.a(s1.append(l1).toString());
    }

    private byte[] a(Map map, String s1)
    {
        StringBuilder stringbuilder;
        stringbuilder = new StringBuilder();
        try
        {
            for (map = map.entrySet().iterator(); map.hasNext(); stringbuilder.append('&'))
            {
                java.util.Map.Entry entry = (java.util.Map.Entry)map.next();
                stringbuilder.append(URLEncoder.encode((String)entry.getKey(), s1));
                stringbuilder.append('=');
                stringbuilder.append(URLEncoder.encode((String)entry.getValue(), s1));
            }

        }
        // Misplaced declaration of an exception variable
        catch (Map map)
        {
            throw new RuntimeException((new StringBuilder()).append("Encoding not supported: ").append(s1).toString(), map);
        }
        map = stringbuilder.toString().getBytes(s1);
        return map;
    }

    static s.a b(k k1)
    {
        return k1.a;
    }

    private static int d(String s1)
    {
        if (!TextUtils.isEmpty(s1))
        {
            s1 = Uri.parse(s1);
            if (s1 != null)
            {
                s1 = s1.getHost();
                if (s1 != null)
                {
                    return s1.hashCode();
                }
            }
        }
        return 0;
    }

    public int a()
    {
        return b;
    }

    public int a(k k1)
    {
        a a1 = u();
        a a2 = k1.u();
        if (a1 == a2)
        {
            return h.intValue() - k1.h.intValue();
        } else
        {
            return a2.ordinal() - a1.ordinal();
        }
    }

    public final k a(int i1)
    {
        h = Integer.valueOf(i1);
        return this;
    }

    public k a(b.a a1)
    {
        n = a1;
        return this;
    }

    public k a(l l1)
    {
        i = l1;
        return this;
    }

    public k a(o o1)
    {
        m = o1;
        return this;
    }

    public k a(Object obj)
    {
        o = obj;
        return this;
    }

    protected abstract m a(g g1);

    protected r a(r r1)
    {
        return r1;
    }

    public void a(String s1)
    {
        if (s.a.a)
        {
            a.a(s1, Thread.currentThread().getId());
        }
    }

    public Object b()
    {
        return o;
    }

    public void b(r r1)
    {
        if (g != null)
        {
            g.a(r1);
        }
    }

    protected abstract void b(Object obj);

    void b(String s1)
    {
        long l1;
label0:
        {
            if (i != null)
            {
                i.b(this);
                d();
            }
            if (s.a.a)
            {
                l1 = Thread.currentThread().getId();
                if (Looper.myLooper() == Looper.getMainLooper())
                {
                    break label0;
                }
                (new Handler(Looper.getMainLooper())).post(new Request._cls1(s1, l1));
            }
            return;
        }
        a.a(s1, l1);
        a.a(toString());
    }

    public int c()
    {
        return f;
    }

    public void c(String s1)
    {
        d = s1;
    }

    public int compareTo(Object obj)
    {
        return a((k)obj);
    }

    protected void d()
    {
        g = null;
    }

    public String e()
    {
        if (d != null)
        {
            return d;
        } else
        {
            return c;
        }
    }

    public String f()
    {
        return c;
    }

    public String g()
    {
        return (new StringBuilder()).append(b).append(":").append(c).toString();
    }

    public b.a h()
    {
        return n;
    }

    public void i()
    {
        k = true;
    }

    public boolean j()
    {
        return k;
    }

    public Map k()
        throws com.android.volley.a
    {
        return Collections.emptyMap();
    }

    protected Map l()
        throws com.android.volley.a
    {
        return p();
    }

    protected String m()
    {
        return q();
    }

    public String n()
    {
        return r();
    }

    public byte[] o()
        throws com.android.volley.a
    {
        Map map = l();
        if (map != null && map.size() > 0)
        {
            return a(map, m());
        } else
        {
            return null;
        }
    }

    protected Map p()
        throws com.android.volley.a
    {
        return null;
    }

    protected String q()
    {
        return "UTF-8";
    }

    public String r()
    {
        return (new StringBuilder()).append("application/x-www-form-urlencoded; charset=").append(q()).toString();
    }

    public byte[] s()
        throws com.android.volley.a
    {
        Map map = p();
        if (map != null && map.size() > 0)
        {
            return a(map, q());
        } else
        {
            return null;
        }
    }

    public final boolean t()
    {
        return j;
    }

    public String toString()
    {
        String s2 = (new StringBuilder()).append("0x").append(Integer.toHexString(c())).toString();
        StringBuilder stringbuilder = new StringBuilder();
        String s1;
        if (k)
        {
            s1 = "[X] ";
        } else
        {
            s1 = "[ ] ";
        }
        return stringbuilder.append(s1).append(e()).append(" ").append(s2).append(" ").append(u()).append(" ").append(h).toString();
    }

    public a u()
    {
        return a.b;
    }

    public final int v()
    {
        return m.a();
    }

    public o w()
    {
        return m;
    }

    public void x()
    {
        l = true;
    }

    public boolean y()
    {
        return l;
    }

    // Unreferenced inner class com/android/volley/Request$1

/* anonymous class */
    class Request._cls1
        implements Runnable
    {

        final String a;
        final long b;
        final k c;

        public void run()
        {
            k.b(c).a(a, b);
            k.b(c).a(((Object)this).toString());
        }

            
            {
                c = k.this;
                a = s1;
                b = l1;
                super();
            }
    }

}
