// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.m4b.maps.cc;

import com.google.android.m4b.maps.bi.b;
import com.google.android.m4b.maps.bm.d;
import com.google.android.m4b.maps.bm.j;
import com.google.android.m4b.maps.bn.g;
import com.google.android.m4b.maps.bn.k;
import com.google.android.m4b.maps.bo.ac;
import com.google.android.m4b.maps.bo.m;
import com.google.android.m4b.maps.bx.ab;
import com.google.android.m4b.maps.bx.f;
import com.google.android.m4b.maps.bx.i;
import com.google.android.m4b.maps.bx.n;
import java.util.Collection;
import javax.microedition.khronos.opengles.GL10;

// Referenced classes of package com.google.android.m4b.maps.cc:
//            q

public final class e
    implements q
{

    private final ac a;
    private final m b;
    private final g c = new g(4);

    public e(ac ac1, int l)
    {
        a = ac1;
        b = a.d();
        l = (0x10000 * l) / 32;
        c.a(0, 0);
        c.a(0, l);
        c.a(l, 0);
        c.a(l, l);
    }

    public final int a(b b1, i l)
    {
        return l != i.g ? 1 : 0;
    }

    public final void a(d d1, b b1, ab ab1)
    {
        ab1 = d1.a;
        ab1.glPushMatrix();
        n.a(d1, b1, b.c(), b.f());
        c.d(d1);
        ab1.glDrawArrays(5, 0, 4);
        ab1.glPopMatrix();
    }

    public final void a(com.google.android.m4b.maps.br.b b1)
    {
    }

    public final void a(Collection collection)
    {
    }

    public final void a(boolean flag)
    {
    }

    public final boolean a()
    {
        return true;
    }

    public final boolean a(f f1)
    {
        return false;
    }

    public final ac b()
    {
        return a;
    }

    public final void b(d d1)
    {
    }

    public final void b(d d1, b b1, ab ab1)
    {
        if (ab1.b > 1)
        {
            return;
        } else
        {
            b1 = d1.a;
            b1.glBlendFunc(1, 771);
            b1.glTexEnvx(8960, 8704, 7681);
            d1.c();
            d1.r.d(d1);
            d1.C.a[20].a(b1);
            return;
        }
    }

    public final void b(Collection collection)
    {
    }

    public final void c(d d1)
    {
    }

    public final boolean c()
    {
        return false;
    }

    public final boolean d()
    {
        return false;
    }

    public final boolean e()
    {
        return false;
    }

    public final void f()
    {
    }

    public final int g()
    {
        return -1;
    }

    public final int h()
    {
        return c.b();
    }

    public final int i()
    {
        return c.c();
    }
}
