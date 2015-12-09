// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import com.comscore.applications.EventType;
import com.comscore.utils.TransmissionMode;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import org.apache.http.HttpResponse;
import org.apache.http.StatusLine;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.entity.StringEntity;
import org.apache.http.util.EntityUtils;

public final class aju
{

    public int a;
    protected final aif b;
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

    public aju(aif aif1)
    {
        this(aif1, "cs_cache_");
    }

    private aju(aif aif1, String s)
    {
        g = null;
        i = null;
        j = null;
        k = 0;
        l = 0L;
        m = 0L;
        b = aif1;
        h = s;
        a(2000);
        b(100);
        a = 10;
        c(30);
        d(31);
        e();
    }

    private void a(String s, boolean flag)
    {
        if (s != null)
        {
            if (flag)
            {
                ajx ajx1 = b.b;
                if (ajx1.a(s).booleanValue())
                {
                    e(Integer.valueOf(ajx1.b(s)).intValue());
                }
            }
            ajt.a(b, s);
            i.remove(s);
        }
    }

    private boolean a(long l1)
    {
        long l2 = System.currentTimeMillis();
        return f * 24L * 60L * 60L * 1000L - (l2 - l1) <= 0L;
    }

    private boolean a(String s, String s1)
    {
        HttpClient httpclient;
        httpclient = ajp.a();
        s1 = new HttpPost(s1);
        int i1;
        s = new StringEntity(s, "UTF-8");
        s.setContentType("text/xml");
        s1.setHeader("User-Agent", System.getProperty("http.agent"));
        s1.setEntity(s);
        ajn.a(this, "Sending POST request");
        b.b.a("lastTransmission", String.valueOf(System.currentTimeMillis()));
        s = httpclient.execute(s1);
        i1 = s.getStatusLine().getStatusCode();
        ajn.a(this, (new StringBuilder("Response:")).append(i1).toString());
        ajn.a(this, "Cache flushed");
        s = EntityUtils.toString(s.getEntity());
        if (i1 != 200)
        {
            break MISSING_BLOCK_LABEL_186;
        }
        boolean flag;
        if (!ajy.f(s))
        {
            break MISSING_BLOCK_LABEL_186;
        }
        flag = s.startsWith("OK");
        if (flag)
        {
            return true;
        }
        break MISSING_BLOCK_LABEL_186;
        s;
        ajn.b(this, (new StringBuilder("Exception in flush:")).append(s.getLocalizedMessage()).toString());
        ajn.a(s);
        return false;
    }

    private void c(String s)
    {
        ajn.a(this, "Creating new cache batch file");
        String s1 = (new StringBuilder()).append(h).append(ajz.a(s, "ns_ts")).toString();
        ajt.a(b, s1, 0, s);
        if (i == null)
        {
            i = new ArrayList();
        }
        i.add(s1);
        d();
    }

    private int d(String s)
    {
label0:
        {
            ajx ajx1 = b.b;
            int i1 = 0;
            if (s != null)
            {
                if (!ajx1.a(s).booleanValue())
                {
                    break label0;
                }
                i1 = Integer.valueOf(ajx1.b(s)).intValue();
            }
            return i1;
        }
        return ajt.a(b.C, s).length;
    }

    private void d()
    {
        l = 0L;
        if (j != null)
        {
            j = null;
        }
    }

    private void e()
    {
        List list = f();
        boolean flag = false;
        int i1 = list.size();
        while (i1 > 0) 
        {
            long l1 = Long.valueOf(((String)list.get(i1 - 1)).substring(h.length())).longValue();
            if (!flag)
            {
                flag = a(l1);
            } else
            {
                ajn.a(this, (new StringBuilder("Deleting expired cache file ")).append((String)list.get(i1 - 1)).toString());
                a((String)list.get(i1 - 1), true);
            }
            i1--;
        }
    }

    private void e(int i1)
    {
        ajx ajx1 = b.b;
        int j1 = i1;
        if (ajx1.a("CACHE_DROPPED_MEASUREMENTS").booleanValue())
        {
            j1 = i1 + Integer.valueOf(ajx1.b("CACHE_DROPPED_MEASUREMENTS")).intValue();
        }
        ajx1.a("CACHE_DROPPED_MEASUREMENTS", String.valueOf(j1));
    }

    private String[] e(String s)
    {
        String as[];
        boolean flag;
        int k1;
        as = ajt.a(b.C, s);
        flag = false;
        k1 = 0;
_L2:
        boolean flag1;
        flag1 = flag;
        if (k1 >= as.length)
        {
            break MISSING_BLOCK_LABEL_102;
        }
        flag1 = flag;
        long l1 = Long.parseLong(ajz.a(as[k1], "ns_ts"));
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
            break MISSING_BLOCK_LABEL_149;
        }
        flag1 = flag;
        ajn.a(this, (new StringBuilder("Valid timestamp found: ")).append(l1).toString());
        flag1 = flag;
        if (!flag1)
        {
            ajn.a(this, (new StringBuilder("All events in the file ")).append(s).append(" are expired").toString());
            a(s, true);
            return null;
        }
        break; /* Loop/switch isn't completed */
        NumberFormatException numberformatexception;
        numberformatexception;
        k1++;
        flag = flag1;
        if (true) goto _L2; else goto _L1
_L1:
        e(k1);
        int j1 = as.length;
        if (k1 > j1)
        {
            throw new IllegalArgumentException();
        }
        int i1 = as.length;
        if (k1 < 0 || k1 > i1)
        {
            throw new ArrayIndexOutOfBoundsException();
        } else
        {
            j1 -= k1;
            i1 = Math.min(j1, i1 - k1);
            s = new String[j1];
            System.arraycopy(as, k1, s, 0, i1);
            return s;
        }
    }

    private List f()
    {
        if (i == null)
        {
            i = ajt.a(b.C);
        }
        return i;
    }

    private String g()
    {
        if (i != null && i.size() > 0)
        {
            return (String)i.get(i.size() - 1);
        } else
        {
            return null;
        }
    }

    public final int a()
    {
        int j1 = d(g());
        List list = f();
        int i1 = j1;
        if (list.size() > 0)
        {
            i1 = j1 + (list.size() - 1) * d;
        }
        return i1;
    }

    public final void a(int i1)
    {
        if (!b.N)
        {
            return;
        } else
        {
            c = i1;
            return;
        }
    }

    public final void a(ajg ajg1, boolean flag)
    {
        if (!b.N)
        {
            return;
        }
        if (flag)
        {
            b.e.a(new ake(this, ajg1), true);
            return;
        } else
        {
            a(ajg1.a(b.L));
            return;
        }
    }

    public final void a(EventType eventtype, HashMap hashmap)
    {
        if (!b.N)
        {
            return;
        } else
        {
            eventtype = ajd.a(b, eventtype, hashmap, null);
            b.f.c(eventtype);
            b.f.b(eventtype);
            a(((ajg) (eventtype)), true);
            return;
        }
    }

    public final void a(String s)
    {
        this;
        JVM INSTR monitorenter ;
        boolean flag = b.N;
        if (flag) goto _L2; else goto _L1
_L1:
        this;
        JVM INSTR monitorexit ;
        return;
_L2:
        if (b.K == TransmissionMode.e || b.n() == null || !ajy.f(ajz.a(s, "ns_ts"))) goto _L1; else goto _L3
_L3:
        String s1 = g();
        if (s1 == null) goto _L5; else goto _L4
_L4:
        if (d(s1) >= d)
        {
            break MISSING_BLOCK_LABEL_115;
        }
        s = (new StringBuilder("\n")).append(s).toString();
        ajt.a(b, s1, 32768, s);
        d();
          goto _L1
        s;
        throw s;
        ajn.a(this, "The newest cache batch file is full");
        if (f().size() < c / d) goto _L7; else goto _L6
_L6:
        ajn.a(this, (new StringBuilder("reached the cache max (")).append(c).append(") size").toString());
        if (i == null || i.size() <= 0)
        {
            break MISSING_BLOCK_LABEL_224;
        }
        s1 = (String)i.get(0);
_L8:
        a(s1, true);
_L7:
        c(s);
          goto _L1
_L5:
        c(s);
          goto _L1
        s1 = null;
          goto _L8
    }

    public final void b()
    {
        if (b.N)
        {
            List list = f();
            int i1 = list.size();
            while (i1 > 0) 
            {
                a((String)list.get(i1 - 1), true);
                i1--;
            }
        }
    }

    public final void b(int i1)
    {
        while (!b.N || i1 <= 0) 
        {
            return;
        }
        d = i1;
    }

    public final void b(String s)
    {
        if (!b.N)
        {
            return;
        } else
        {
            g = s;
            return;
        }
    }

    public final void c(int i1)
    {
        if (!b.N)
        {
            return;
        } else
        {
            e = i1;
            return;
        }
    }

    public final boolean c()
    {
        this;
        JVM INSTR monitorenter ;
        boolean flag1 = b.N;
        if (flag1) goto _L2; else goto _L1
_L1:
        flag1 = false;
_L16:
        this;
        JVM INSTR monitorexit ;
        return flag1;
_L2:
        ajx ajx1 = b.b;
        boolean flag2;
        flag2 = false;
        flag1 = false;
        long l1;
        e();
        l1 = e * 1000L * 60L - (System.currentTimeMillis() - l);
        if (l1 > 0L) goto _L4; else goto _L3
_L3:
        l = 0L;
_L23:
        Object obj = b.C;
        if (!ajp.b()) goto _L6; else goto _L5
_L5:
        obj = Boolean.valueOf(true);
_L30:
        if (!((Boolean) (obj)).booleanValue()) goto _L8; else goto _L7
_L7:
        Object obj1;
        String as[];
        Object obj2;
        String s;
        boolean flag;
        if (a() == 0)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        if (flag) goto _L8; else goto _L9
_L9:
        if (b.n() == null) goto _L8; else goto _L10
_L10:
        if (k < a) goto _L12; else goto _L11
_L11:
        l1 = e * 1000L * 60L - (System.currentTimeMillis() - m);
        if (l1 > 0L) goto _L14; else goto _L13
_L13:
        k = 0;
        m = 0L;
        flag = true;
_L34:
        flag1 = flag2;
        if (!flag) goto _L16; else goto _L15
_L15:
        ajn.a(this, (new StringBuilder("Cache is not empty, contains ")).append(i.size()).append(" files").toString());
        if (j != null) goto _L18; else goto _L17
_L17:
        obj1 = g();
        ajn.a(this, (new StringBuilder("reading events from the file ")).append(((String) (obj1))).toString());
        as = e(((String) (obj1)));
        if (as == null) goto _L20; else goto _L19
_L19:
        if (as.length <= 0) goto _L20; else goto _L21
_L21:
        if (!ajx1.a("CACHE_DROPPED_MEASUREMENTS").booleanValue())
        {
            break MISSING_BLOCK_LABEL_812;
        }
        obj = ajx1.b("CACHE_DROPPED_MEASUREMENTS");
_L35:
        j = ajz.a(as, ((String) (obj)));
          goto _L20
_L33:
        if (j == null || j.length() <= 0) goto _L23; else goto _L22
_L22:
        s = j;
        if (g == null) goto _L25; else goto _L24
_L24:
        obj1 = new StringBuilder(g);
_L31:
        flag = true;
        if (((StringBuilder) (obj1)).indexOf("?") != -1)
        {
            break MISSING_BLOCK_LABEL_375;
        }
        ((StringBuilder) (obj1)).append("?");
        flag = false;
        obj2 = b.n();
        if (obj2 == null)
        {
            break MISSING_BLOCK_LABEL_427;
        }
        if (((String) (obj2)).equals(""))
        {
            break MISSING_BLOCK_LABEL_427;
        }
        if (!flag)
        {
            break MISSING_BLOCK_LABEL_410;
        }
        ((StringBuilder) (obj1)).append("&");
        ((StringBuilder) (obj1)).append("c2=");
        ((StringBuilder) (obj1)).append(((String) (obj2)));
        flag = true;
        obj2 = b;
        if (((aif) (obj2)).M != null) goto _L27; else goto _L26
_L26:
        obj2 = "";
_L32:
        obj2 = ajy.a(String.format("JetportGotAMaskOfThe%sS.D_K-", new Object[] {
            obj2
        }));
        if (obj2 == null)
        {
            break MISSING_BLOCK_LABEL_502;
        }
        if (((String) (obj2)).equals(""))
        {
            break MISSING_BLOCK_LABEL_502;
        }
        if (!flag)
        {
            break MISSING_BLOCK_LABEL_488;
        }
        ((StringBuilder) (obj1)).append("&");
        ((StringBuilder) (obj1)).append("s=");
        ((StringBuilder) (obj1)).append(((String) (obj2)));
        flag1 = a(s, ((StringBuilder) (obj1)).toString().toLowerCase(new Locale("en", "US")));
        if (!flag1) goto _L29; else goto _L28
_L28:
        k = k + 1;
        a(((String) (obj)), false);
        d();
        m = System.currentTimeMillis();
        ajx1.c("CACHE_DROPPED_MEASUREMENTS");
        flag2 = flag1;
          goto _L23
        obj;
        throw obj;
_L6:
label0:
        {
            if (ajv.a(((android.content.Context) (obj)), "android.permission.ACCESS_NETWORK_STATE").booleanValue())
            {
                break label0;
            }
            obj = Boolean.valueOf(true);
        }
          goto _L30
label1:
        {
            if (!ajp.b(((android.content.Context) (obj))))
            {
                break label1;
            }
            obj = Boolean.valueOf(true);
        }
          goto _L30
label2:
        {
            if (!ajp.c(((android.content.Context) (obj))))
            {
                break label2;
            }
            obj = Boolean.valueOf(true);
        }
          goto _L30
        obj = Boolean.valueOf(false);
          goto _L30
_L14:
        ajn.a(this, (new StringBuilder("Max flushes in a row (")).append(a).append(") reached. Waiting ").append((double)l1 / 1000D / 60D).append(" minutes").toString());
          goto _L8
_L25:
        if (b.I)
        {
            obj1 = "https://udm.scorecardresearch.com/offline";
        } else
        {
            obj1 = "http://udm.scorecardresearch.com/offline";
        }
        obj1 = new StringBuilder(((String) (obj1)));
          goto _L31
_L27:
        obj2 = ((aif) (obj2)).M.a();
          goto _L32
_L29:
        l = System.currentTimeMillis();
          goto _L16
_L4:
        ajn.a(this, (new StringBuilder("Waiting ")).append((double)l1 / 1000D / 60D).append(" minutes").toString());
          goto _L16
_L18:
        obj = null;
          goto _L33
_L20:
        obj = obj1;
          goto _L33
_L8:
        flag = false;
          goto _L34
_L12:
        flag = true;
          goto _L34
        obj = "0";
          goto _L35
    }

    public final void d(int i1)
    {
        if (!b.N)
        {
            return;
        } else
        {
            f = i1;
            return;
        }
    }
}
