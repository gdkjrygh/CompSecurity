// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.ads.internal.formats;

import com.google.android.gms.ads.internal.util.client.b;
import com.google.android.gms.internal.bk;
import com.google.android.gms.internal.ij;
import java.util.Arrays;
import java.util.List;

// Referenced classes of package com.google.android.gms.ads.internal.formats:
//            h, a

public final class f extends com.google.android.gms.internal.bs.a
    implements h.a
{

    private final a a;
    private final String b;
    private final ij c;
    private final ij d;
    private final Object e = new Object();
    private h f;

    public f(String s, ij ij1, ij ij2, a a1)
    {
        b = s;
        c = ij1;
        d = ij2;
        a = a1;
    }

    public final String a(String s)
    {
        return (String)d.get(s);
    }

    public final List a()
    {
        boolean flag = false;
        String as[] = new String[c.size() + d.size()];
        int i1 = 0;
        int i = 0;
        int j1;
        int k1;
        do
        {
            j1 = ((flag) ? 1 : 0);
            k1 = i;
            if (i1 >= c.size())
            {
                break;
            }
            as[i] = (String)c.b(i1);
            i++;
            i1++;
        } while (true);
        while (j1 < d.size()) 
        {
            as[k1] = (String)d.b(j1);
            j1++;
            k1++;
        }
        return Arrays.asList(as);
    }

    public final void a(h h1)
    {
        synchronized (e)
        {
            f = h1;
        }
        return;
        h1;
        obj;
        JVM INSTR monitorexit ;
        throw h1;
    }

    public final bk b(String s)
    {
        return (bk)c.get(s);
    }

    public final void b()
    {
label0:
        {
            synchronized (e)
            {
                if (f != null)
                {
                    break label0;
                }
                com.google.android.gms.ads.internal.util.client.b.a("Attempt to perform recordImpression before ad initialized.");
            }
            return;
        }
        f.a();
        obj;
        JVM INSTR monitorexit ;
        return;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
    }

    public final void c(String s)
    {
label0:
        {
            synchronized (e)
            {
                if (f != null)
                {
                    break label0;
                }
                com.google.android.gms.ads.internal.util.client.b.a("Attempt to call performClick before ad initialized.");
            }
            return;
        }
        f.a(s);
        obj;
        JVM INSTR monitorexit ;
        return;
        s;
        obj;
        JVM INSTR monitorexit ;
        throw s;
    }

    public final String j()
    {
        return "3";
    }

    public final String k()
    {
        return b;
    }

    public final a l()
    {
        return a;
    }
}
