// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.m4b.maps.bo;

import com.google.android.m4b.maps.ak.c;
import com.google.android.m4b.maps.y.h;
import java.util.Arrays;

// Referenced classes of package com.google.android.m4b.maps.bo:
//            g

public final class f
{

    public g a;
    public float b;
    public int c;
    public g d;
    public boolean e;
    public c f;
    public boolean g;
    public float h;
    public boolean i;
    public float j;
    private float k;

    public f()
    {
        b();
    }

    public f(g g1, float f1, int l)
    {
        a(g1, f1, l);
    }

    private void b()
    {
        a = null;
        b = 0.0F;
        c = -1;
        d = null;
        k = 0.0F;
        e = false;
        f = null;
        g = false;
        h = 0.0F;
        i = false;
        j = 1.0F;
    }

    public final void a(f f1)
    {
        if (f1 == null)
        {
            b();
            return;
        }
        a(f1.a, f1.b, f1.c);
        g g1;
        if (f1.d == null)
        {
            g1 = null;
        } else
        {
            g1 = new g(f1.d);
        }
        d = g1;
        k = f1.k;
        e = f1.e;
        f = f1.f;
        g = f1.g;
        h = f1.h;
        i = f1.i;
        j = f1.j;
    }

    public final void a(g g1, float f1, int l)
    {
        if (g1 == null)
        {
            g1 = null;
        } else
        {
            g1 = new g(g1);
        }
        a = g1;
        b = f1;
        c = l;
    }

    public final boolean a()
    {
        return a != null;
    }

    public final boolean equals(Object obj)
    {
        if (this != obj)
        {
            if (obj == null)
            {
                return false;
            }
            if (getClass() != obj.getClass())
            {
                return false;
            }
            obj = (f)obj;
            if (!com.google.android.m4b.maps.y.h.a(a, ((f) (obj)).a) || b != ((f) (obj)).b || c != ((f) (obj)).c || !com.google.android.m4b.maps.y.h.a(d, ((f) (obj)).d) || k != ((f) (obj)).k || e != ((f) (obj)).e || !com.google.android.m4b.maps.y.h.a(f, ((f) (obj)).f) || g != ((f) (obj)).g || h != ((f) (obj)).h || i != ((f) (obj)).i || j != ((f) (obj)).j)
            {
                return false;
            }
        }
        return true;
    }

    public final int hashCode()
    {
        return Arrays.hashCode(new Object[] {
            a, Float.valueOf(b), Integer.valueOf(c), Float.valueOf(k), Boolean.valueOf(e), f, Boolean.valueOf(g), Float.valueOf(h), Boolean.valueOf(i), Float.valueOf(j)
        });
    }

    public final String toString()
    {
        com.google.android.m4b.maps.y.h.a a1 = com.google.android.m4b.maps.y.h.a(this);
        a1.a("@", a.f());
        a1.a("Accuracy", c);
        if (d != null)
        {
            a1.a("Accuracy point", d.f());
        }
        a1.a("Accuracy emphasis", k);
        a1.a("Use bearing", e);
        if (e)
        {
            a1.a("Bearing", b);
        }
        a1.a("Brightness", j);
        a1.a("Height", h);
        a1.a("Level", f);
        a1.a("Stale", i);
        return a1.toString();
    }
}
