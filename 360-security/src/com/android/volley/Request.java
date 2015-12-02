// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.android.volley;

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

// Referenced classes of package com.android.volley:
//            c, j, n, AuthFailureError, 
//            m, VolleyError, i, k

public abstract class Request
    implements Comparable
{
    public static final class Priority extends Enum
    {

        public static final Priority HIGH;
        public static final Priority IMMEDIATE;
        public static final Priority LOW;
        public static final Priority NORMAL;
        private static final Priority a[];

        public static Priority valueOf(String s1)
        {
            return (Priority)Enum.valueOf(com/android/volley/Request$Priority, s1);
        }

        public static Priority[] values()
        {
            Priority apriority[] = a;
            int i1 = apriority.length;
            Priority apriority1[] = new Priority[i1];
            System.arraycopy(apriority, 0, apriority1, 0, i1);
            return apriority1;
        }

        static 
        {
            LOW = new Priority("LOW", 0);
            NORMAL = new Priority("NORMAL", 1);
            HIGH = new Priority("HIGH", 2);
            IMMEDIATE = new Priority("IMMEDIATE", 3);
            a = (new Priority[] {
                LOW, NORMAL, HIGH, IMMEDIATE
            });
        }

        private Priority(String s1, int i1)
        {
            super(s1, i1);
        }
    }


    private final n.a a;
    private final int b;
    private final String c;
    private final int d;
    private final k.a e;
    private Integer f;
    private j g;
    private boolean h;
    private boolean i;
    private boolean j;
    private long k;
    private m l;
    private a.a m;
    private Object n;

    public Request(int i1, String s1, k.a a1)
    {
        n.a a2;
        if (n.a.a)
        {
            a2 = new n.a();
        } else
        {
            a2 = null;
        }
        a = a2;
        h = true;
        i = false;
        j = false;
        k = 0L;
        m = null;
        b = i1;
        c = s1;
        e = a1;
        a(new c());
        d = c(s1);
    }

    private byte[] a(Map map, String s1)
    {
        StringBuilder stringbuilder = new StringBuilder();
        try
        {
            map = map.entrySet().iterator();
            do
            {
                if (!map.hasNext())
                {
                    return stringbuilder.toString().getBytes(s1);
                }
                java.util.Map.Entry entry = (java.util.Map.Entry)map.next();
                stringbuilder.append(URLEncoder.encode((String)entry.getKey(), s1));
                stringbuilder.append('=');
                stringbuilder.append(URLEncoder.encode((String)entry.getValue(), s1));
                stringbuilder.append('&');
            } while (true);
        }
        // Misplaced declaration of an exception variable
        catch (Map map)
        {
            throw new RuntimeException((new StringBuilder("Encoding not supported: ")).append(s1).toString(), map);
        }
    }

    static n.a b(Request request)
    {
        return request.a;
    }

    private static int c(String s1)
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

    public int a(Request request)
    {
        Priority priority = s();
        Priority priority1 = request.s();
        if (priority == priority1)
        {
            return f.intValue() - request.f.intValue();
        } else
        {
            return priority1.ordinal() - priority.ordinal();
        }
    }

    public final Request a(int i1)
    {
        f = Integer.valueOf(i1);
        return this;
    }

    public Request a(a.a a1)
    {
        m = a1;
        return this;
    }

    public Request a(j j1)
    {
        g = j1;
        return this;
    }

    public Request a(m m1)
    {
        l = m1;
        return this;
    }

    public Request a(Object obj)
    {
        n = obj;
        return this;
    }

    protected VolleyError a(VolleyError volleyerror)
    {
        return volleyerror;
    }

    protected abstract k a(i i1);

    public void a(String s1)
    {
        if (n.a.a)
        {
            a.a(s1, Thread.currentThread().getId());
        } else
        if (k == 0L)
        {
            k = SystemClock.elapsedRealtime();
            return;
        }
    }

    public Object b()
    {
        return n;
    }

    public void b(VolleyError volleyerror)
    {
        if (e != null)
        {
            e.a(volleyerror);
        }
    }

    protected abstract void b(Object obj);

    void b(String s1)
    {
        if (g != null)
        {
            g.b(this);
        }
        if (!n.a.a) goto _L2; else goto _L1
_L1:
        long l1 = Thread.currentThread().getId();
        if (Looper.myLooper() == Looper.getMainLooper()) goto _L4; else goto _L3
_L3:
        (new Handler(Looper.getMainLooper())).post(new Runnable(s1, l1) {

            final Request a;
            private final String b;
            private final long c;

            public void run()
            {
                Request.b(a).a(b, c);
                Request.b(a).a(((Object)this).toString());
            }

            
            {
                a = Request.this;
                b = s1;
                c = l1;
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
        long l2 = SystemClock.elapsedRealtime() - k;
        if (l2 >= 3000L)
        {
            com.android.volley.n.b("%d ms: %s", new Object[] {
                Long.valueOf(l2), toString()
            });
            return;
        }
        if (true) goto _L6; else goto _L5
_L5:
    }

    public int c()
    {
        return d;
    }

    public int compareTo(Object obj)
    {
        return a((Request)obj);
    }

    public String d()
    {
        return c;
    }

    public String e()
    {
        return d();
    }

    public a.a f()
    {
        return m;
    }

    public void g()
    {
        i = true;
    }

    public boolean h()
    {
        return i;
    }

    public Map i()
        throws AuthFailureError
    {
        return Collections.emptyMap();
    }

    protected Map j()
        throws AuthFailureError
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
        throws AuthFailureError
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
        throws AuthFailureError
    {
        return null;
    }

    protected String o()
    {
        return "UTF-8";
    }

    public String p()
    {
        return (new StringBuilder("application/x-www-form-urlencoded; charset=")).append(o()).toString();
    }

    public byte[] q()
        throws AuthFailureError
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
        return h;
    }

    public Priority s()
    {
        return Priority.NORMAL;
    }

    public final int t()
    {
        return l.a();
    }

    public String toString()
    {
        String s2 = (new StringBuilder("0x")).append(Integer.toHexString(c())).toString();
        String s1;
        if (i)
        {
            s1 = "[X] ";
        } else
        {
            s1 = "[ ] ";
        }
        return (new StringBuilder(String.valueOf(s1))).append(d()).append(" ").append(s2).append(" ").append(s()).append(" ").append(f).toString();
    }

    public m u()
    {
        return l;
    }

    public void v()
    {
        j = true;
    }

    public boolean w()
    {
        return j;
    }
}
