// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.microsoft.onlineid.sts;

import com.microsoft.onlineid.internal.k;
import java.util.Locale;

// Referenced classes of package com.microsoft.onlineid.sts:
//            r, l, p

public final class q
{

    private final r a;
    private final String b;
    private final String c;

    public q(l l1)
    {
        k.a(l1, "error");
        a = r.a(l1);
        c = l1.toString();
        b = String.format(Locale.US, "%s error caused by server error:\n%s", new Object[] {
            a.name(), c
        });
    }

    public q(p p1)
    {
        k.a(p1, "error");
        a = r.a(p1);
        c = p1.toString();
        b = String.format(Locale.US, "%s error caused by server error:\n%s", new Object[] {
            a.name(), c
        });
    }

    public final r a()
    {
        return a;
    }

    public final String b()
    {
        return b;
    }

    public final String c()
    {
        return c;
    }

    public final boolean d()
    {
        static final class _cls1
        {

            static final int a[];

            static 
            {
                a = new int[r.values().length];
                try
                {
                    a[r.z.ordinal()] = 1;
                }
                catch (NoSuchFieldError nosuchfielderror8) { }
                try
                {
                    a[r.A.ordinal()] = 2;
                }
                catch (NoSuchFieldError nosuchfielderror7) { }
                try
                {
                    a[r.b.ordinal()] = 3;
                }
                catch (NoSuchFieldError nosuchfielderror6) { }
                try
                {
                    a[r.a.ordinal()] = 4;
                }
                catch (NoSuchFieldError nosuchfielderror5) { }
                try
                {
                    a[r.n.ordinal()] = 5;
                }
                catch (NoSuchFieldError nosuchfielderror4) { }
                try
                {
                    a[r.m.ordinal()] = 6;
                }
                catch (NoSuchFieldError nosuchfielderror3) { }
                try
                {
                    a[r.p.ordinal()] = 7;
                }
                catch (NoSuchFieldError nosuchfielderror2) { }
                try
                {
                    a[r.q.ordinal()] = 8;
                }
                catch (NoSuchFieldError nosuchfielderror1) { }
                try
                {
                    a[r.h.ordinal()] = 9;
                }
                catch (NoSuchFieldError nosuchfielderror)
                {
                    return;
                }
            }
        }

        switch (_cls1.a[a.ordinal()])
        {
        default:
            return false;

        case 1: // '\001'
        case 2: // '\002'
            return true;
        }
    }

    public final boolean equals(Object obj)
    {
        if (this == obj)
        {
            return true;
        }
        if ((obj instanceof q) && obj != null)
        {
            obj = (q)obj;
            return k.a(a, ((q) (obj)).a);
        }
        if ((obj instanceof r) && obj != null)
        {
            obj = (r)obj;
            return k.a(a, obj);
        } else
        {
            return false;
        }
    }

    public final int hashCode()
    {
        return k.a(a);
    }
}
