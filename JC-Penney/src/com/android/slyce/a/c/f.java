// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.android.slyce.a.c;

import android.net.Uri;
import com.android.slyce.a.ag;
import com.android.slyce.a.am;
import com.android.slyce.a.c.b.a;
import com.android.slyce.a.g;
import com.android.slyce.a.r;
import java.net.URL;
import java.util.ArrayList;
import java.util.Iterator;

// Referenced classes of package com.android.slyce.a.c:
//            x, r, a, k, 
//            u, av, i

class f extends x
{

    final i d;
    final u e;
    final a f;
    final com.android.slyce.a.c.r g;
    final int h;
    final com.android.slyce.a.c.a i;

    f(com.android.slyce.a.c.a a1, u u1, i j, u u2, a a2, com.android.slyce.a.c.r r1, int l)
    {
        i = a1;
        d = j;
        e = u2;
        f = a2;
        g = r1;
        h = l;
        super(u1);
    }

    public void a(am am)
    {
        g.d = am;
        am = i.a;
        am;
        JVM INSTR monitorenter ;
        for (Iterator iterator = i.a.iterator(); iterator.hasNext(); ((k)iterator.next()).a(g)) { }
        break MISSING_BLOCK_LABEL_64;
        Exception exception;
        exception;
        am;
        JVM INSTR monitorexit ;
        throw exception;
        am;
        JVM INSTR monitorexit ;
        super.a(g.d);
        am = this.j;
        int j = m();
        if (j != 301 && j != 302 && j != 307 || !e.f())
        {
            break MISSING_BLOCK_LABEL_360;
        }
        String s1 = am.a("Location");
        Uri uri;
        try
        {
            uri = Uri.parse(s1);
        }
        // Misplaced declaration of an exception variable
        catch (am am)
        {
            com.android.slyce.a.c.a.a(i, d, am, this, e, f);
            return;
        }
        am = uri;
        if (uri.getScheme() == null)
        {
            am = Uri.parse((new URL(new URL(e.d().toString()), s1)).toString());
        }
        String s;
        if (e.c().equals("HEAD"))
        {
            s = "HEAD";
        } else
        {
            s = "GET";
        }
        am = new u(am, s);
        am.g = e.g;
        am.f = e.f;
        am.e = e.e;
        am.c = e.c;
        am.d = e.d;
        com.android.slyce.a.c.a.b(am);
        com.android.slyce.a.c.a.a(e, am, "User-Agent");
        com.android.slyce.a.c.a.a(e, am, "Range");
        e.a("Redirecting");
        am.a("Redirected");
        com.android.slyce.a.c.a.b(i, am, h + 1, d, f);
        a(((com.android.slyce.a.a.e) (new com.android.slyce.a.a.f())));
        return;
        e.b((new StringBuilder()).append("Final (post cache response) headers:\n").append(toString()).toString());
        com.android.slyce.a.c.a.a(i, d, null, this, e, f);
        return;
    }

    protected void a(Exception exception)
    {
        if (exception != null)
        {
            e.a("exception during response", exception);
        }
        if (!d.isCancelled()) goto _L2; else goto _L1
_L1:
        return;
_L2:
        Object obj;
        if (!(exception instanceof g))
        {
            break; /* Loop/switch isn't completed */
        }
        e.a("SSL Exception", exception);
        obj = (g)exception;
        e.a(((g) (obj)));
        if (((g) (obj)).a()) goto _L1; else goto _L3
_L3:
        obj = a_();
        if (obj == null) goto _L1; else goto _L4
_L4:
        super.a(exception);
        if ((!((ag) (obj)).i() || exception != null) && b_() == null && exception != null)
        {
            com.android.slyce.a.c.a.a(i, d, exception, null, e, f);
        }
        g.k = exception;
        exception = i.a;
        exception;
        JVM INSTR monitorenter ;
        for (Iterator iterator = i.a.iterator(); iterator.hasNext(); ((k)iterator.next()).a(g)) { }
        break MISSING_BLOCK_LABEL_185;
        Exception exception1;
        exception1;
        exception;
        JVM INSTR monitorexit ;
        throw exception1;
        exception;
        JVM INSTR monitorexit ;
    }

    protected void b()
    {
        super.b();
        if (d.isCancelled())
        {
            return;
        }
        if (d.c != null)
        {
            i.e.a(d.b);
        }
        e.b((new StringBuilder()).append("Received headers:\n").append(toString()).toString());
        ArrayList arraylist = i.a;
        arraylist;
        JVM INSTR monitorenter ;
        for (Iterator iterator = i.a.iterator(); iterator.hasNext(); ((k)iterator.next()).a(g)) { }
        break MISSING_BLOCK_LABEL_127;
        Exception exception;
        exception;
        arraylist;
        JVM INSTR monitorexit ;
        throw exception;
        arraylist;
        JVM INSTR monitorexit ;
    }

    protected void b(Exception exception)
    {
        if (exception == null) goto _L2; else goto _L1
_L1:
        com.android.slyce.a.c.a.a(i, d, exception, null, e, f);
_L4:
        return;
_L2:
        e.b("request completed");
        if (d.isCancelled()) goto _L4; else goto _L3
_L3:
        if (d.c != null && j == null)
        {
            i.e.a(d.b);
            d.b = i.e.a(d.c, com.android.slyce.a.c.a.a(e));
        }
        exception = i.a;
        exception;
        JVM INSTR monitorenter ;
        for (Iterator iterator = i.a.iterator(); iterator.hasNext(); ((k)iterator.next()).a(g)) { }
        break MISSING_BLOCK_LABEL_166;
        Exception exception1;
        exception1;
        exception;
        JVM INSTR monitorexit ;
        throw exception1;
        exception;
        JVM INSTR monitorexit ;
    }

    public ag c()
    {
        e.c("Detaching socket");
        ag ag1 = a_();
        if (ag1 == null)
        {
            return null;
        } else
        {
            ag1.a(null);
            ag1.a(null);
            ag1.b(null);
            ag1.a(null);
            a(((ag) (null)));
            return ag1;
        }
    }
}
