// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package p.k;

import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import android.text.TextUtils;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.Collections;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

// Referenced classes of package p.k:
//            d, m, t, a, 
//            p, i, n, s

public abstract class l
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
            return (a)Enum.valueOf(p/k/l$a, s1);
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


    private final t.a a;
    private final int b;
    private final String c;
    private String d;
    private final int e;
    private final n.a f;
    private Integer g;
    private m h;
    private boolean i;
    private boolean j;
    private boolean k;
    private long l;
    private p m;
    private b.a n;

    public l(int i1, String s1, n.a a1)
    {
        t.a a2;
        if (t.a.a)
        {
            a2 = new t.a();
        } else
        {
            a2 = null;
        }
        a = a2;
        i = true;
        j = false;
        k = false;
        l = 0L;
        n = null;
        b = i1;
        c = s1;
        f = a1;
        a(new d());
        e = d(s1);
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

    static t.a b(l l1)
    {
        return l1.a;
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

    public int a(l l1)
    {
        a a1 = s();
        a a2 = l1.s();
        if (a1 == a2)
        {
            return g.intValue() - l1.g.intValue();
        } else
        {
            return a2.ordinal() - a1.ordinal();
        }
    }

    public final l a(int i1)
    {
        g = Integer.valueOf(i1);
        return this;
    }

    public l a(b.a a1)
    {
        n = a1;
        return this;
    }

    public l a(m m1)
    {
        h = m1;
        return this;
    }

    public l a(p p1)
    {
        m = p1;
        return this;
    }

    protected abstract n a(i i1);

    protected s a(s s1)
    {
        return s1;
    }

    protected abstract void a(Object obj);

    public void a(String s1)
    {
        if (t.a.a)
        {
            a.a(s1, Thread.currentThread().getId());
        } else
        if (l == 0L)
        {
            l = SystemClock.elapsedRealtime();
            return;
        }
    }

    public int b()
    {
        return e;
    }

    void b(String s1)
    {
        if (h != null)
        {
            h.b(this);
        }
        if (!t.a.a) goto _L2; else goto _L1
_L1:
        long l1 = Thread.currentThread().getId();
        if (Looper.myLooper() == Looper.getMainLooper()) goto _L4; else goto _L3
_L3:
        (new Handler(Looper.getMainLooper())).post(new Runnable(s1, l1) {

            final String a;
            final long b;
            final l c;

            public void run()
            {
                l.b(c).a(a, b);
                l.b(c).a(((Object)this).toString());
            }

            
            {
                c = l.this;
                a = s1;
                b = l2;
                super();
            }
        });
_L6:
        return;
_L4:
        a.a(s1, l1);
        a.a(toString());
        return;
_L2:
        long l2 = SystemClock.elapsedRealtime() - l;
        if (l2 >= 3000L)
        {
            p.k.t.b("%d ms: %s", new Object[] {
                Long.valueOf(l2), toString()
            });
            return;
        }
        if (true) goto _L6; else goto _L5
_L5:
    }

    public void b(s s1)
    {
        if (f != null)
        {
            f.a(s1);
        }
    }

    public String c()
    {
        if (d != null)
        {
            return d;
        } else
        {
            return c;
        }
    }

    public void c(String s1)
    {
        d = s1;
    }

    public int compareTo(Object obj)
    {
        return a((l)obj);
    }

    public String d()
    {
        return c;
    }

    public String e()
    {
        return c();
    }

    public b.a f()
    {
        return n;
    }

    public void g()
    {
        j = true;
    }

    public boolean h()
    {
        return j;
    }

    public Map i()
        throws p.k.a
    {
        return Collections.emptyMap();
    }

    protected Map j()
        throws p.k.a
    {
        return n();
    }

    protected String k()
    {
        return o();
    }

    public String l()
    {
        return p();
    }

    public byte[] m()
        throws p.k.a
    {
        Map map = j();
        if (map != null && map.size() > 0)
        {
            return a(map, k());
        } else
        {
            return null;
        }
    }

    protected Map n()
        throws p.k.a
    {
        return null;
    }

    protected String o()
    {
        return "UTF-8";
    }

    public String p()
    {
        return (new StringBuilder()).append("application/x-www-form-urlencoded; charset=").append(o()).toString();
    }

    public byte[] q()
        throws p.k.a
    {
        Map map = n();
        if (map != null && map.size() > 0)
        {
            return a(map, o());
        } else
        {
            return null;
        }
    }

    public final boolean r()
    {
        return i;
    }

    public a s()
    {
        return a.b;
    }

    public final int t()
    {
        return m.a();
    }

    public String toString()
    {
        String s2 = (new StringBuilder()).append("0x").append(Integer.toHexString(b())).toString();
        StringBuilder stringbuilder = new StringBuilder();
        String s1;
        if (j)
        {
            s1 = "[X] ";
        } else
        {
            s1 = "[ ] ";
        }
        return stringbuilder.append(s1).append(c()).append(" ").append(s2).append(" ").append(s()).append(" ").append(g).toString();
    }

    public p u()
    {
        return m;
    }

    public void v()
    {
        k = true;
    }

    public boolean w()
    {
        return k;
    }
}
