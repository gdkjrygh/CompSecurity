// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.android.slyce.a.c;

import android.net.Uri;
import com.android.slyce.a.a;
import com.android.slyce.a.a.c;
import com.android.slyce.a.ag;
import com.android.slyce.a.b.f;
import com.android.slyce.a.b.j;
import com.android.slyce.a.d.e;
import com.android.slyce.a.r;
import java.util.Hashtable;

// Referenced classes of package com.android.slyce.a.c:
//            br, aq, ao, ap, 
//            u, ar, an, l, 
//            a, aj, r, s, 
//            az, bn

public class ai extends br
{

    String e;
    int f;
    int g;
    protected com.android.slyce.a.c.a h;
    boolean i;
    String j;
    int k;
    Hashtable l;
    int m;

    public ai(com.android.slyce.a.c.a a1)
    {
        this(a1, "http", 80);
    }

    public ai(com.android.slyce.a.c.a a1, String s1, int i1)
    {
        g = 0x493e0;
        l = new Hashtable();
        m = 0x7fffffff;
        h = a1;
        e = s1;
        f = i1;
    }

    private aq a(String s1)
    {
        aq aq2 = (aq)l.get(s1);
        aq aq1 = aq2;
        if (aq2 == null)
        {
            aq1 = new aq();
            l.put(s1, aq1);
        }
        return aq1;
    }

    private void a(ag ag1)
    {
        ag1.b(new ao(this, ag1));
        ag1.a(null);
        ag1.a(new ap(this, ag1));
    }

    private void a(ag ag1, u u1)
    {
        if (ag1 == null)
        {
            return;
        }
        Uri uri = u1.d();
        u1 = a(uri, a(uri), u1.i(), u1.j());
        ar ar1 = new ar(this, ag1);
        this;
        JVM INSTR monitorenter ;
        a a1;
        a1 = a(((String) (u1))).c;
        a1.e(ar1);
        this;
        JVM INSTR monitorexit ;
        ag1.a(new an(this, a1, ar1, u1));
        return;
        ag1;
        this;
        JVM INSTR monitorexit ;
        throw ag1;
    }

    static void a(ai ai1, ag ag1)
    {
        ai1.a(ag1);
    }

    static void a(ai ai1, ag ag1, u u1)
    {
        ai1.a(ag1, u1);
    }

    static void a(ai ai1, String s1)
    {
        ai1.b(s1);
    }

    private void a(u u1)
    {
        Object obj = u1.d();
        u1 = a(((Uri) (obj)), a(((Uri) (obj))), u1.i(), u1.j());
        this;
        JVM INSTR monitorenter ;
        obj = (aq)l.get(u1);
        if (obj != null)
        {
            break MISSING_BLOCK_LABEL_45;
        }
        this;
        JVM INSTR monitorexit ;
        return;
        obj.a = ((aq) (obj)).a - 1;
        do
        {
            if (((aq) (obj)).a >= m || ((aq) (obj)).b.size() <= 0)
            {
                break;
            }
            l l1 = (l)((aq) (obj)).b.remove();
            j j1 = (j)l1.b;
            if (!j1.isCancelled())
            {
                j1.b(a(l1));
            }
        } while (true);
        break MISSING_BLOCK_LABEL_123;
        u1;
        this;
        JVM INSTR monitorexit ;
        throw u1;
        b(u1);
        this;
        JVM INSTR monitorexit ;
    }

    private void b(String s1)
    {
        aq aq1 = (aq)l.get(s1);
        if (aq1 != null) goto _L2; else goto _L1
_L1:
        return;
_L4:
        ag ag1;
        aq1.c.g();
        ag1.a(null);
        ag1.d();
_L2:
        ar ar1;
        if (aq1.c.isEmpty())
        {
            break; /* Loop/switch isn't completed */
        }
        ar1 = (ar)aq1.c.f();
        ag1 = ar1.a;
        if (ar1.b + (long)g <= System.currentTimeMillis()) goto _L4; else goto _L3
_L3:
        if (aq1.a != 0 || !aq1.b.isEmpty() || !aq1.c.isEmpty()) goto _L1; else goto _L5
_L5:
        l.remove(s1);
        return;
    }

    public int a(Uri uri)
    {
        if (uri.getScheme() == null || !uri.getScheme().equals(e))
        {
            return -1;
        }
        if (uri.getPort() == -1)
        {
            return f;
        } else
        {
            return uri.getPort();
        }
    }

    protected c a(l l1, Uri uri, int i1, boolean flag, c c1)
    {
        return c1;
    }

    public com.android.slyce.a.b.a a(l l1)
    {
        Object obj;
        int j1;
        boolean flag;
        flag = true;
        obj = l1.j.d();
        j1 = a(l1.j.d());
        if (j1 == -1)
        {
            return null;
        }
        l1.i.a("socket-owner", this);
        aq aq1 = a(a(((Uri) (obj)), j1, l1.j.i(), l1.j.j()));
        this;
        JVM INSTR monitorenter ;
        if (aq1.a < m)
        {
            break MISSING_BLOCK_LABEL_107;
        }
        obj = new j();
        aq1.b.add(l1);
        this;
        JVM INSTR monitorexit ;
        return ((com.android.slyce.a.b.a) (obj));
        l1;
        this;
        JVM INSTR monitorexit ;
        throw l1;
        aq1.a = aq1.a + 1;
_L2:
        ag ag1;
        for (; !aq1.c.isEmpty(); ag1.d())
        {
            ar ar1 = (ar)aq1.c.g();
            ag1 = ar1.a;
            if (ar1.b + (long)g >= System.currentTimeMillis())
            {
                continue; /* Loop/switch isn't completed */
            }
            ag1.a(null);
        }

        break MISSING_BLOCK_LABEL_230;
        if (!ag1.i()) goto _L2; else goto _L1
_L1:
        l1.j.c("Reusing keep-alive socket");
        l1.a.a(null, ag1);
        l1 = new j();
        l1.f();
        this;
        JVM INSTR monitorexit ;
        return l1;
        this;
        JVM INSTR monitorexit ;
        if (!i || j != null || l1.j.i() != null)
        {
            l1.j.c("Connecting socket");
            String s1;
            int i1;
            if (l1.j.i() != null)
            {
                s1 = l1.j.i();
                i1 = l1.j.j();
            } else
            if (j != null)
            {
                s1 = j;
                i1 = k;
            } else
            {
                s1 = ((Uri) (obj)).getHost();
                flag = false;
                i1 = j1;
            }
            if (flag)
            {
                l1.j.b((new StringBuilder()).append("Using proxy: ").append(s1).append(":").append(i1).toString());
            }
            return h.b().a(s1, i1, a(l1, ((Uri) (obj)), j1, flag, l1.a));
        } else
        {
            l1.j.b("Resolving domain and connecting to all available addresses");
            return (com.android.slyce.a.b.a)h.b().a(((Uri) (obj)).getHost()).b(new aj(this, l1, ((Uri) (obj)), j1));
        }
    }

    String a(Uri uri, int i1, String s1, int j1)
    {
        String s2;
        if (s1 != null)
        {
            s2 = (new StringBuilder()).append(s1).append(":").append(j1).toString();
        } else
        {
            s2 = "";
        }
        if (s1 != null)
        {
            s2 = (new StringBuilder()).append(s1).append(":").append(j1).toString();
        }
        return (new StringBuilder()).append(uri.getScheme()).append("//").append(uri.getHost()).append(":").append(i1).append("?proxy=").append(s2).toString();
    }

    public void a(com.android.slyce.a.c.r r1)
    {
        if (r1.i.a("socket-owner") != this)
        {
            return;
        }
        a(r1.e);
        if (r1.k == null && r1.e.i())
        {
            break MISSING_BLOCK_LABEL_79;
        }
        r1.j.b("closing out socket (exception)");
        r1.e.a(null);
        r1.e.d();
        a(r1.j);
        return;
        if (com.android.slyce.a.c.az.a(r1.f.e(), r1.f.b_()) && com.android.slyce.a.c.az.a(bn.b, r1.j.e()))
        {
            break MISSING_BLOCK_LABEL_157;
        }
        r1.j.b("closing out socket (not keep alive)");
        r1.e.a(null);
        r1.e.d();
        a(r1.j);
        return;
        r1.j.c("Recycling keep-alive socket");
        a(r1.e, r1.j);
        a(r1.j);
        return;
        Exception exception;
        exception;
        a(r1.j);
        throw exception;
    }
}
