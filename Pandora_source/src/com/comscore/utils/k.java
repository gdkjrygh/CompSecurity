// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.comscore.utils;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import javax.net.ssl.SSLException;
import org.apache.http.HttpResponse;
import org.apache.http.StatusLine;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.entity.StringEntity;
import org.apache.http.util.EntityUtils;
import p.aq.b;
import p.as.c;
import p.as.d;
import p.aw.a;

// Referenced classes of package com.comscore.utils:
//            j, h, e, c, 
//            p, o, n, q, 
//            l, t

public class k
{

    protected final b a;
    private int b;
    private int c;
    private int d;
    private long e;
    private long f;
    private String g;
    private final String h;
    private ArrayList i;
    private String j;
    private int k;
    private long l;
    private long m;

    public k(b b1)
    {
        this(b1, "cs_cache_");
    }

    protected k(b b1, String s)
    {
        g = null;
        i = null;
        j = null;
        k = 0;
        l = 0L;
        m = 0L;
        a = b1;
        h = s;
        a(2000);
        b(100);
        c(10);
        d(30);
        e(31);
        k();
    }

    private void a(String s, boolean flag)
    {
        if (s != null)
        {
            if (flag)
            {
                c(s);
            }
            com.comscore.utils.j.a(a, s);
            i.remove(s);
        }
    }

    private boolean a(long l1)
    {
        long l2 = com.comscore.utils.h.a();
        return f * 24L * 60L * 60L * 1000L - (l2 - l1) <= 0L;
    }

    private boolean a(String s, String s1)
    {
        HttpClient httpclient;
        httpclient = com.comscore.utils.e.a();
        s1 = new HttpPost(s1);
        int i1;
        s = new StringEntity(s, "UTF-8");
        s.setContentType("text/xml");
        s1.setHeader("User-Agent", System.getProperty("http.agent"));
        s1.setEntity(s);
        com.comscore.utils.c.a(this, "Sending POST request");
        s = httpclient.execute(s1);
        i1 = s.getStatusLine().getStatusCode();
        com.comscore.utils.c.a(this, (new StringBuilder()).append("Response:").append(i1).toString());
        com.comscore.utils.c.a(this, "Cache flushed");
        s = EntityUtils.toString(s.getEntity());
        if (i1 != 200)
        {
            break MISSING_BLOCK_LABEL_167;
        }
        boolean flag;
        if (!p.f(s))
        {
            break MISSING_BLOCK_LABEL_167;
        }
        flag = s.startsWith("OK");
        if (flag)
        {
            return true;
        }
        break MISSING_BLOCK_LABEL_167;
        s;
        com.comscore.utils.c.b(this, s.getMessage());
        a.a(o.e, true);
        e();
_L2:
        return false;
        s;
        com.comscore.utils.c.b(this, (new StringBuilder()).append("Exception in flush:").append(s.getLocalizedMessage()).toString());
        com.comscore.utils.c.a(s);
        if (true) goto _L2; else goto _L1
_L1:
    }

    private static String[] a(String as[], int i1, int j1)
    {
        if (i1 > j1)
        {
            throw new IllegalArgumentException();
        }
        int k1 = as.length;
        if (i1 < 0 || i1 > k1)
        {
            throw new ArrayIndexOutOfBoundsException();
        } else
        {
            j1 -= i1;
            k1 = Math.min(j1, k1 - i1);
            String as1[] = new String[j1];
            System.arraycopy(as, i1, as1, 0, k1);
            return as1;
        }
    }

    private void c(String s)
    {
        n n1 = a.r();
        if (n1.a(s).booleanValue())
        {
            f(Integer.valueOf(n1.b(s)).intValue());
        }
    }

    private void d(String s)
    {
        com.comscore.utils.c.a(this, "Creating new cache batch file");
        String s1 = (new StringBuilder()).append(h).append(com.comscore.utils.q.a(s, "ns_ts")).toString();
        com.comscore.utils.j.a(a, s1, 0, s);
        if (i == null)
        {
            i = new ArrayList();
        }
        i.add(s1);
        i();
    }

    private int e(String s)
    {
label0:
        {
            n n1 = a.r();
            int i1 = 0;
            if (s != null)
            {
                if (!n1.a(s).booleanValue())
                {
                    break label0;
                }
                i1 = Integer.valueOf(n1.b(s)).intValue();
            }
            return i1;
        }
        return com.comscore.utils.j.a(a.P(), s).length;
    }

    private void f(int i1)
    {
        n n1 = a.r();
        int j1 = i1;
        if (n1.a("CACHE_DROPPED_MEASUREMENTS").booleanValue())
        {
            j1 = i1 + Integer.valueOf(n1.b("CACHE_DROPPED_MEASUREMENTS")).intValue();
        }
        n1.a("CACHE_DROPPED_MEASUREMENTS", String.valueOf(j1));
    }

    private String[] f(String s)
    {
        String as[];
        boolean flag;
        int i1;
        as = com.comscore.utils.j.a(a.P(), s);
        flag = false;
        i1 = 0;
_L2:
        boolean flag1;
        flag1 = flag;
        if (i1 >= as.length)
        {
            break MISSING_BLOCK_LABEL_106;
        }
        flag1 = flag;
        long l1 = Long.parseLong(com.comscore.utils.q.a(as[i1], "ns_ts"));
        flag1 = flag;
        if (!a(l1))
        {
            flag = true;
        } else
        {
            flag = false;
        }
        flag1 = flag;
        if (!flag)
        {
            break MISSING_BLOCK_LABEL_156;
        }
        flag1 = flag;
        com.comscore.utils.c.a(this, (new StringBuilder()).append("Valid timestamp found: ").append(l1).toString());
        flag1 = flag;
        NumberFormatException numberformatexception;
        if (!flag1)
        {
            com.comscore.utils.c.a(this, (new StringBuilder()).append("All events in the file ").append(s).append(" are expired").toString());
            a(s, true);
            return null;
        } else
        {
            f(i1);
            return a(as, i1, as.length);
        }
        numberformatexception;
        i1++;
        flag = flag1;
        if (true) goto _L2; else goto _L1
_L1:
    }

    private long g(String s)
    {
        return Long.valueOf(s.substring(h.length())).longValue();
    }

    private boolean h()
    {
label0:
        {
            long l1;
label1:
            {
                if (!j().booleanValue() || d() || a.ac() == null)
                {
                    break label0;
                }
                if (k >= d)
                {
                    l1 = e * 1000L * 60L - (com.comscore.utils.h.a() - m);
                    if (l1 > 0L)
                    {
                        break label1;
                    }
                    k = 0;
                    m = 0L;
                }
                return true;
            }
            com.comscore.utils.c.a(this, (new StringBuilder()).append("Max flushes in a row (").append(d).append(") reached. Waiting ").append((double)l1 / 1000D / 60D).append(" minutes").toString());
        }
        return false;
    }

    private void i()
    {
        l = 0L;
        if (j != null)
        {
            j = null;
        }
    }

    private Boolean j()
    {
        android.content.Context context = a.P();
        if (com.comscore.utils.e.b())
        {
            return Boolean.valueOf(true);
        }
        if (!com.comscore.utils.l.a(context, "android.permission.ACCESS_NETWORK_STATE").booleanValue())
        {
            return Boolean.valueOf(true);
        }
        if (com.comscore.utils.e.b(context))
        {
            return Boolean.valueOf(true);
        }
        if (com.comscore.utils.e.c(context))
        {
            return Boolean.valueOf(true);
        } else
        {
            return Boolean.valueOf(false);
        }
    }

    private void k()
    {
        List list = l();
        for (int i1 = list.size() - 1; i1 >= 0; i1--)
        {
            if (a(g((String)list.get(i1))))
            {
                com.comscore.utils.c.a(this, (new StringBuilder()).append("Deleting expired cache file ").append((String)list.get(i1)).toString());
                a((String)list.get(i1), true);
            }
        }

    }

    private List l()
    {
        if (i == null)
        {
            i = com.comscore.utils.j.a(a.P());
        }
        return i;
    }

    private String m()
    {
        if (i != null && i.size() > 0)
        {
            return (String)i.get(0);
        } else
        {
            return null;
        }
    }

    private String n()
    {
        if (i != null && i.size() > 0)
        {
            return (String)i.get(i.size() - 1);
        } else
        {
            return null;
        }
    }

    public int a()
    {
        return b;
    }

    public void a(int i1)
    {
        if (!a.aq())
        {
            return;
        } else
        {
            b = i1;
            return;
        }
    }

    public void a(String s)
    {
        this;
        JVM INSTR monitorenter ;
        boolean flag = a.aq();
        if (flag) goto _L2; else goto _L1
_L1:
        this;
        JVM INSTR monitorexit ;
        return;
_L2:
        if (a.ae() == o.e || a.ac() == null || !p.f(com.comscore.utils.q.a(s, "ns_ts"))) goto _L1; else goto _L3
_L3:
        String s1 = n();
        if (s1 == null)
        {
            break MISSING_BLOCK_LABEL_197;
        }
        if (e(s1) >= b())
        {
            break MISSING_BLOCK_LABEL_119;
        }
        s = (new StringBuilder()).append("\n").append(s).toString();
        com.comscore.utils.j.a(a, s1, 32768, s);
        i();
          goto _L1
        s;
        throw s;
        com.comscore.utils.c.a(this, "The newest cache batch file is full");
        if (l().size() >= a() / b())
        {
            com.comscore.utils.c.a(this, (new StringBuilder()).append("reached the cache max (").append(a()).append(") size").toString());
            a(m(), true);
        }
        d(s);
          goto _L1
        d(s);
          goto _L1
    }

    public void a(d d1, HashMap hashmap, boolean flag)
    {
        if (!a.aq())
        {
            return;
        } else
        {
            d1 = p.as.c.a(a, d1, hashmap, null);
            a.t().c(d1);
            a.t().b(d1);
            a(((p.at.b) (d1)), flag);
            return;
        }
    }

    public void a(p.at.b b1)
    {
        a(b1, false);
    }

    public void a(p.at.b b1, boolean flag)
    {
        if (!a.aq())
        {
            return;
        }
        if (flag)
        {
            a.s().a(new t(this, b1), true);
            return;
        } else
        {
            a(b1.a(a.ai()));
            return;
        }
    }

    public int b()
    {
        return c;
    }

    public void b(int i1)
    {
        while (!a.aq() || i1 <= 0) 
        {
            return;
        }
        c = i1;
    }

    public void b(String s)
    {
        if (!a.aq())
        {
            return;
        } else
        {
            g = s;
            return;
        }
    }

    public int c()
    {
        int j1 = e(n());
        List list = l();
        int i1 = j1;
        if (list.size() > 0)
        {
            i1 = j1 + (list.size() - 1) * b();
        }
        return i1;
    }

    public void c(int i1)
    {
        d = i1;
    }

    public void d(int i1)
    {
        if (!a.aq())
        {
            return;
        } else
        {
            e = i1;
            return;
        }
    }

    public boolean d()
    {
        return c() == 0;
    }

    public void e()
    {
        if (a.aq())
        {
            List list = l();
            int i1 = list.size();
            while (i1 > 0) 
            {
                a((String)list.get(i1 - 1), true);
                i1--;
            }
        }
    }

    public void e(int i1)
    {
        if (!a.aq())
        {
            return;
        } else
        {
            f = i1;
            return;
        }
    }

    public boolean f()
    {
        boolean flag1 = false;
        boolean flag = false;
        this;
        JVM INSTR monitorenter ;
        boolean flag2 = a.aq();
        if (flag2) goto _L2; else goto _L1
_L1:
        this;
        JVM INSTR monitorexit ;
        return flag;
_L2:
        n n1;
        long l1;
        n1 = a.r();
        k();
        l1 = e * 1000L * 60L - (com.comscore.utils.h.a() - l);
        if (l1 > 0L)
        {
            break MISSING_BLOCK_LABEL_332;
        }
        l = 0L;
_L9:
        flag = flag1;
        if (!h()) goto _L1; else goto _L3
_L3:
        Object obj = null;
        com.comscore.utils.c.a(this, (new StringBuilder()).append("Cache is not empty, contains ").append(i.size()).append(" files").toString());
        if (j != null) goto _L5; else goto _L4
_L4:
        String s;
        String as[];
        s = n();
        com.comscore.utils.c.a(this, (new StringBuilder()).append("reading events from the file ").append(s).toString());
        as = f(s);
        obj = s;
        if (as == null) goto _L5; else goto _L6
_L6:
        obj = s;
        if (as.length <= 0) goto _L5; else goto _L7
_L7:
        if (!n1.a("CACHE_DROPPED_MEASUREMENTS").booleanValue())
        {
            break MISSING_BLOCK_LABEL_315;
        }
        obj = n1.b("CACHE_DROPPED_MEASUREMENTS");
_L10:
        j = com.comscore.utils.q.a(as, ((String) (obj)));
        obj = s;
_L5:
        if (j == null || j.length() <= 0) goto _L9; else goto _L8
_L8:
        flag = a(j, g());
        if (!flag)
        {
            break MISSING_BLOCK_LABEL_322;
        }
        k = k + 1;
        a(((String) (obj)), false);
        i();
        m = com.comscore.utils.h.a();
        n1.c("CACHE_DROPPED_MEASUREMENTS");
        a.r().a("lastMeasurementProcessedTimestamp", String.valueOf(System.currentTimeMillis()));
        flag1 = flag;
          goto _L9
        obj;
        throw obj;
        obj = "0";
          goto _L10
        l = com.comscore.utils.h.a();
          goto _L1
        com.comscore.utils.c.a(this, (new StringBuilder()).append("Waiting ").append((double)l1 / 1000D / 60D).append(" minutes").toString());
          goto _L1
    }

    protected String g()
    {
        Object obj;
        String s;
        boolean flag;
        boolean flag1;
        if (g != null)
        {
            obj = new StringBuilder(g);
        } else
        {
            if (a.ag())
            {
                obj = "https://udm.scorecardresearch.com/offline";
            } else
            {
                obj = "http://udm.scorecardresearch.com/offline";
            }
            obj = new StringBuilder(((String) (obj)));
        }
        if (((StringBuilder) (obj)).indexOf("?") == -1)
        {
            ((StringBuilder) (obj)).append("?");
            flag = false;
        } else
        {
            flag = true;
        }
        s = a.ac();
        flag1 = flag;
        if (s != null)
        {
            flag1 = flag;
            if (!s.equals(""))
            {
                if (flag)
                {
                    ((StringBuilder) (obj)).append("&");
                }
                ((StringBuilder) (obj)).append("c2=");
                ((StringBuilder) (obj)).append(s);
                flag1 = true;
            }
        }
        s = com.comscore.utils.p.a(String.format("JetportGotAMaskOfThe%sS.D_K-", new Object[] {
            a.W()
        }));
        if (s != null && !s.equals(""))
        {
            if (flag1)
            {
                ((StringBuilder) (obj)).append("&");
            }
            ((StringBuilder) (obj)).append("s=");
            ((StringBuilder) (obj)).append(s);
        }
        return ((StringBuilder) (obj)).toString().toLowerCase(new Locale("en", "US"));
    }
}
