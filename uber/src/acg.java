// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.graphics.drawable.Drawable;
import android.view.View;

public final class acg extends acn
    implements aci
{

    private final String a;
    private final Drawable b;
    private final String c;
    private final Drawable d;
    private final String e;
    private final String f;
    private final acd g;
    private final Object h = new Object();
    private ach i;

    public acg(String s, Drawable drawable, String s1, Drawable drawable1, String s2, String s3, acd acd)
    {
        a = s;
        b = drawable;
        c = s1;
        d = drawable1;
        e = s2;
        f = s3;
        g = acd;
    }

    public final aaf a(aaf aaf)
    {
label0:
        {
            synchronized (h)
            {
                if (i != null)
                {
                    break label0;
                }
                of.b("Attempt to perform wrapAndTrackView before ad initialization.");
            }
            return null;
        }
        aaf = (View)aai.a(aaf);
        aaf = aai.a(i.a(aaf));
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
        synchronized (h)
        {
            i = ach1;
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
            synchronized (h)
            {
                if (i != null)
                {
                    break label0;
                }
                of.b("Attempt to perform setAssetView before ad initialization.");
            }
            return;
        }
        i.a(s, (View)aai.a(aaf));
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

    public final String f()
    {
        return f;
    }

    public final void g()
    {
label0:
        {
            synchronized (h)
            {
                if (i != null)
                {
                    break label0;
                }
                of.b("Attempt to perform clearViewMapping before ad initialized.");
            }
            return;
        }
        i.a();
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
        return "1";
    }

    public final acd k()
    {
        return g;
    }
}
