// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.yume.android.bsp;

import android.os.Handler;
import android.os.Message;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import org.apache.http.HttpEntity;
import org.apache.http.HttpResponse;
import org.apache.http.StatusLine;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.entity.StringEntity;
import org.apache.http.message.BasicHeader;
import org.apache.http.params.HttpConnectionParams;
import org.apache.http.protocol.HttpContext;
import org.json.JSONObject;

// Referenced classes of package com.yume.android.bsp:
//            p, b, h, g

final class f
    implements Runnable
{

    private static int t[];
    private p a;
    private String b;
    private JSONObject c;
    private String d;
    private g e;
    private long f;
    private String g;
    private int h;
    private int i;
    private boolean j;
    private boolean k;
    private HttpClient l;
    private HttpContext m;
    private Handler n;
    private HttpGet o;
    private HttpPost p;
    private Thread q;
    private int r;
    private String s;

    public f(String s1)
    {
        a = com.yume.android.bsp.p.a();
        b = null;
        c = null;
        d = null;
        e = null;
        f = 0L;
        g = null;
        h = 0;
        i = 0;
        j = false;
        k = false;
        m = null;
        o = null;
        p = null;
        q = null;
        s = null;
        b = s1;
    }

    private void a(int i1, String s1)
    {
        if (n != null)
        {
            g = s1;
            n.sendMessage(Message.obtain(n, i1, this));
        }
    }

    private void a(HttpEntity httpentity)
        throws IllegalStateException, IOException
    {
        Object obj;
        obj = "";
        f = httpentity.getContentLength();
        a.a((new StringBuilder("Response Content-Length: ")).append(f).toString());
        if (f <= 0x7fffffffL) goto _L2; else goto _L1
_L1:
        a.b((new StringBuilder("HTTP Content too large to be buffered in memory: Length: ")).append(f).toString());
        httpentity = ((HttpEntity) (obj));
_L3:
        String s1;
        String s2;
        if (httpentity == "")
        {
            a(1, null);
            return;
        } else
        {
            a(2, ((String) (httpentity)));
            return;
        }
_L2:
        obj = new BufferedReader(new InputStreamReader(httpentity.getContent()));
        httpentity = new StringBuffer("");
        s1 = System.getProperty("line.separator");
_L4:
label0:
        {
            s2 = ((BufferedReader) (obj)).readLine();
            if (s2 != null)
            {
                break label0;
            }
            httpentity = httpentity.toString();
            ((BufferedReader) (obj)).close();
        }
          goto _L3
        httpentity.append((new StringBuilder(String.valueOf(s2))).append(s1).toString());
          goto _L4
    }

    private void i()
    {
        org.apache.http.params.HttpParams httpparams;
        int i1;
        i1 = i * 1000;
        httpparams = null;
        if (p == null) goto _L2; else goto _L1
_L1:
        httpparams = p.getParams();
_L4:
        if (httpparams != null)
        {
            HttpConnectionParams.setConnectionTimeout(httpparams, i1 << 1);
            HttpConnectionParams.setSoTimeout(httpparams, i1);
        }
        return;
_L2:
        if (o != null)
        {
            httpparams = o.getParams();
        }
        if (true) goto _L4; else goto _L3
_L3:
    }

    private void j()
    {
        if (s != null)
        {
            if (p != null)
            {
                p.setHeader("User-Agent", s);
            } else
            if (o != null)
            {
                o.setHeader("User-Agent", s);
                return;
            }
        }
    }

    private void k()
    {
        if (o != null)
        {
            o.abort();
            q.interrupt();
            try
            {
                q.join();
                return;
            }
            catch (InterruptedException interruptedexception)
            {
                return;
            }
        } else
        {
            com.yume.android.bsp.b.a().b(this);
            return;
        }
    }

    private void l()
    {
        if (p != null)
        {
            p.abort();
            q.interrupt();
            try
            {
                q.join();
                return;
            }
            catch (InterruptedException interruptedexception)
            {
                return;
            }
        } else
        {
            com.yume.android.bsp.b.a().b(this);
            return;
        }
    }

    private static int[] m()
    {
        int ai[] = t;
        if (ai != null)
        {
            return ai;
        }
        ai = new int[com.yume.android.bsp.h.values().length];
        try
        {
            ai[h.a.ordinal()] = 1;
        }
        catch (NoSuchFieldError nosuchfielderror2) { }
        try
        {
            ai[h.b.ordinal()] = 2;
        }
        catch (NoSuchFieldError nosuchfielderror1) { }
        try
        {
            ai[h.c.ordinal()] = 3;
        }
        catch (NoSuchFieldError nosuchfielderror) { }
        t = ai;
        return ai;
    }

    public final void a(int i1)
    {
        r = i1;
    }

    public final void a(Handler handler)
    {
        n = handler;
    }

    public final void a(g g1)
    {
        e = g1;
    }

    public final void a(String s1)
    {
        d = s1;
    }

    public final void a(Thread thread)
    {
        q = thread;
    }

    public final void a(HttpClient httpclient)
    {
        l = httpclient;
    }

    public final void a(HttpContext httpcontext)
    {
        m = httpcontext;
    }

    public final void a(JSONObject jsonobject)
    {
        c = jsonobject;
    }

    public final boolean a()
    {
        com.yume.android.bsp.b.a().a(this);
        return true;
    }

    public final void b()
    {
        if ((e.a == h.b || e.a == h.c) && !k)
        {
            k = true;
            if (o != null)
            {
                k();
                return;
            }
            if (p != null)
            {
                l();
                return;
            }
        }
    }

    public final void b(int i1)
    {
        i = i1;
    }

    public final void b(String s1)
    {
        s = s1;
    }

    public final void c()
    {
        if ((e.a == h.b || e.a == h.c) && !j)
        {
            j = true;
            if (o != null)
            {
                k();
                return;
            }
            if (p != null)
            {
                l();
                return;
            }
        }
    }

    public final int d()
    {
        return r;
    }

    public final g e()
    {
        return e;
    }

    public final long f()
    {
        return f;
    }

    public final String g()
    {
        return g;
    }

    public final int h()
    {
        return h;
    }

    public final void run()
    {
        Object obj1;
        boolean flag1;
        flag1 = false;
        obj1 = null;
        if (j)
        {
            j = false;
        }
        if (n != null)
        {
            n.sendMessage(Message.obtain(n, 0));
        }
        m()[e.a.ordinal()];
        JVM INSTR tableswitch 2 3: default 76
    //                   2 77
    //                   3 389;
           goto _L1 _L2 _L3
_L1:
        return;
_L2:
        boolean flag = flag1;
        if (c == null) goto _L5; else goto _L4
_L4:
        flag = flag1;
        if (d != null)
        {
            flag = true;
        }
_L5:
        if (!flag) goto _L7; else goto _L6
_L6:
        p = new HttpPost(b);
        StringEntity stringentity = new StringEntity(c.toString());
        stringentity.setContentEncoding(new BasicHeader("Content-Type", d));
        p.setEntity(stringentity);
_L14:
        j();
        i();
        if (!flag) goto _L9; else goto _L8
_L8:
        Object obj = l.execute(p, m);
_L18:
        if (n == null) goto _L11; else goto _L10
_L10:
        obj1 = ((HttpResponse) (obj)).getStatusLine();
        h = ((StatusLine) (obj1)).getStatusCode();
        ((StatusLine) (obj1)).getReasonPhrase();
        if (h != 200) goto _L13; else goto _L12
_L12:
        a(((HttpResponse) (obj)).getEntity());
_L11:
        obj1 = ((HttpResponse) (obj)).getEntity();
        if (obj1 == null)
        {
            break MISSING_BLOCK_LABEL_262;
        }
        ((HttpEntity) (obj1)).consumeContent();
_L16:
        com.yume.android.bsp.b.a().c(this);
        return;
_L7:
        o = new HttpGet(b);
          goto _L14
        obj1;
        obj = null;
_L19:
        a.b((new StringBuilder("Playlist Exception: ")).append(((Exception) (obj1)).toString()).toString());
        a(1, null);
        if (obj == null) goto _L16; else goto _L15
_L15:
        if (((HttpResponse) (obj)).getEntity() == null) goto _L16; else goto _L17
_L17:
        ((HttpResponse) (obj)).getEntity().consumeContent();
          goto _L16
        obj;
          goto _L16
_L9:
        obj = l.execute(o, m);
          goto _L18
_L13:
        a(1, null);
          goto _L11
        obj1;
          goto _L19
_L3:
        obj = obj1;
        o = new HttpGet(b);
        obj = obj1;
        j();
        obj = obj1;
        i();
        obj = obj1;
        obj1 = l.execute(o, m);
        obj = obj1;
        if (n == null) goto _L21; else goto _L20
_L20:
        obj = obj1;
        Object obj2 = ((HttpResponse) (obj1)).getStatusLine();
        obj = obj1;
        h = ((StatusLine) (obj2)).getStatusCode();
        obj = obj1;
        ((StatusLine) (obj2)).getReasonPhrase();
        obj = obj1;
        if (h != 200) goto _L23; else goto _L22
_L22:
        obj = obj1;
        n.sendMessage(Message.obtain(n, 2, this));
_L21:
        obj = obj1;
        obj2 = ((HttpResponse) (obj1)).getEntity();
        if (obj2 == null) goto _L16; else goto _L24
_L24:
        obj = obj1;
        ((HttpEntity) (obj2)).consumeContent();
          goto _L16
        obj1;
        a.b((new StringBuilder("Tracker Exception: ")).append(((Exception) (obj1)).toString()).toString());
        if (n != null)
        {
            n.sendMessage(Message.obtain(n, 1, this));
        }
        if (obj == null) goto _L16; else goto _L25
_L25:
        if (((HttpResponse) (obj)).getEntity() == null) goto _L16; else goto _L26
_L26:
        ((HttpResponse) (obj)).getEntity().consumeContent();
          goto _L16
        obj;
          goto _L16
_L23:
        obj = obj1;
        if (h <= 200) goto _L28; else goto _L27
_L27:
        obj = obj1;
        if (h >= 300) goto _L28; else goto _L29
_L29:
        obj = obj1;
        n.sendMessage(Message.obtain(n, 2, this));
          goto _L21
_L28:
        obj = obj1;
        n.sendMessage(Message.obtain(n, 1, this));
          goto _L21
    }
}
