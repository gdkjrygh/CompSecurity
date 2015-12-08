// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.microsoft.advertising.android;

import android.os.Handler;
import android.text.TextUtils;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;

// Referenced classes of package com.microsoft.advertising.android:
//            av, am, af, n, 
//            ae, ai, d, x, 
//            br, t

final class ad
    implements n.a
{
    public static interface a
    {

        public abstract void a(n.b b1);
    }


    private final ai a;
    private final ExecutorService b;
    private Map c;

    public ad(ExecutorService executorservice, ai ai1)
    {
        c = new HashMap();
        b = executorservice;
        a = ai1;
    }

    public final void a()
    {
        this;
        JVM INSTR monitorenter ;
        Iterator iterator = c.entrySet().iterator();
_L2:
        if (iterator.hasNext())
        {
            break MISSING_BLOCK_LABEL_29;
        }
        this;
        JVM INSTR monitorexit ;
        return;
        ((Future)((java.util.Map.Entry)iterator.next()).getValue()).cancel(true);
        iterator.remove();
        if (true) goto _L2; else goto _L1
_L1:
        Exception exception;
        exception;
        this;
        JVM INSTR monitorexit ;
        throw exception;
    }

    public final void a(Handler handler, String s, d d1)
    {
        if (s == null || s.equals(""))
        {
            av.d("adFetching", "Incorrect URL. Failed to fetch image");
            return;
        } else
        {
            b.submit(new am(handler, s, d1));
            return;
        }
    }

    public final void a(a a1, t t, ai ai1)
    {
        av.a("adFetching", "startLoadAd()");
        if (!af.a(new Object[] {
    a1
}))
        {
            return;
        }
        a();
        a1 = new n(this, t, ai1, a1);
        ai1.a(null, ae.d);
        t = b.submit(a1);
        this;
        JVM INSTR monitorenter ;
        c.put(a1, t);
        this;
        JVM INSTR monitorexit ;
        return;
        a1;
        this;
        JVM INSTR monitorexit ;
        throw a1;
    }

    public final void a(d d1)
    {
        if (d1 == null)
        {
            return;
        }
        Iterator iterator = d1.b().iterator();
        do
        {
            if (!iterator.hasNext())
            {
                d1.b().clear();
                return;
            }
            a((String)iterator.next());
        } while (true);
    }

    public final void a(n n1, n.b b1)
    {
        af.a(new Object[] {
            n1, b1
        });
        this;
        JVM INSTR monitorenter ;
        if (c.containsKey(n1))
        {
            c.remove(n1);
        }
        this;
        JVM INSTR monitorexit ;
        if (af.a(new Object[] {
    n1.b()
}))
        {
            n1.b().a(b1);
        }
        return;
        n1;
        this;
        JVM INSTR monitorexit ;
        throw n1;
    }

    public final void a(String s)
    {
        if (s == null || s.equals(""))
        {
            av.d("adFetching", "Incorrect URL. Failed to send beacon for impression tracking");
            return;
        } else
        {
            b.submit(new x(s, a));
            return;
        }
    }

    public final void a(String s, br.a a1)
    {
        if (TextUtils.isEmpty(s))
        {
            av.c("adFetching", "Incorrect URL. Failed to send request");
            return;
        } else
        {
            b.submit(new br(s, a1));
            return;
        }
    }
}
