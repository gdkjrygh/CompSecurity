// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.util.Arrays;
import java.util.List;

public final class bhe extends ccl
    implements bhh
{

    private final bgz a;
    private final String b;
    private final cnm c;
    private final cnm d;
    private final Object e = new Object();
    private bhg f;

    public bhe(String s, cnm cnm1, cnm cnm2, bgz bgz)
    {
        b = s;
        c = cnm1;
        d = cnm2;
        a = bgz;
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

    public final void a(bhg bhg1)
    {
        synchronized (e)
        {
            f = bhg1;
        }
        return;
        bhg1;
        obj;
        JVM INSTR monitorexit ;
        throw bhg1;
    }

    public final cbs b(String s)
    {
        return (cbs)c.get(s);
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
                bka.b("Attempt to perform recordImpression before ad initialized.");
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
                bka.b("Attempt to call performClick before ad initialized.");
            }
            return;
        }
        f.a(s, null, null);
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

    public final bgz l()
    {
        return a;
    }
}
