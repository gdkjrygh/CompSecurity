// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.graphics.drawable.Drawable;
import android.view.View;

public final class acf extends acl
    implements aci
{

    private final String a;
    private final Drawable b;
    private final String c;
    private final Drawable d;
    private final String e;
    private final double f;
    private final String g;
    private final String h;
    private final acd i;
    private final Object j = new Object();
    private ach k;

    public acf(String s, Drawable drawable, String s1, Drawable drawable1, String s2, double d1, 
            String s3, String s4, acd acd)
    {
        a = s;
        b = drawable;
        c = s1;
        d = drawable1;
        e = s2;
        f = d1;
        g = s3;
        h = s4;
        i = acd;
    }

    public final aaf a(aaf aaf)
    {
label0:
        {
            synchronized (j)
            {
                if (k != null)
                {
                    break label0;
                }
                of.b("Attempt to perform wrapAndTrackView before ad initialization.");
            }
            return null;
        }
        aaf = (View)aai.a(aaf);
        aaf = aai.a(k.a(aaf));
        obj;
        JVM INSTR monitorexit ;
        return aaf;
        aaf;
        obj;
        JVM INSTR monitorexit ;
        throw aaf;
    }

    public final String a()
    {
        return a;
    }

    public final void a(ach ach1)
    {
        synchronized (j)
        {
            k = ach1;
        }
        return;
        ach1;
        obj;
        JVM INSTR monitorexit ;
        throw ach1;
    }

    public final void a(String s, aaf aaf)
    {
label0:
        {
            synchronized (j)
            {
                if (k != null)
                {
                    break label0;
                }
                of.b("Attempt to perform setAssetView before ad initialization.");
            }
            return;
        }
        k.a(s, (View)aai.a(aaf));
        obj;
        JVM INSTR monitorexit ;
        return;
        s;
        obj;
        JVM INSTR monitorexit ;
        throw s;
    }

    public final aaf b()
    {
        return aai.a(b);
    }

    public final String c()
    {
        return c;
    }

    public final aaf d()
    {
        return aai.a(d);
    }

    public final String e()
    {
        return e;
    }

    public final double f()
    {
        return f;
    }

    public final String g()
    {
        return g;
    }

    public final String h()
    {
        return h;
    }

    public final void i()
    {
label0:
        {
            synchronized (j)
            {
                if (k != null)
                {
                    break label0;
                }
                of.b("Attempt to perform clearViewMapping before ad initialized.");
            }
            return;
        }
        k.a();
        obj;
        JVM INSTR monitorexit ;
        return;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
    }

    public final String j()
    {
        return "2";
    }

    public final acd k()
    {
        return i;
    }
}
