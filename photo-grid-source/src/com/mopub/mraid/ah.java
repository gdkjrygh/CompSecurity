// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.mopub.mraid;

import android.content.Context;
import android.graphics.Rect;
import com.mopub.common.util.Dips;

final class ah
{

    private final Context a;
    private final Rect b = new Rect();
    private final Rect c = new Rect();
    private final Rect d = new Rect();
    private final Rect e = new Rect();
    private final Rect f = new Rect();
    private final Rect g = new Rect();
    private final Rect h = new Rect();
    private final Rect i = new Rect();
    private final float j;

    ah(Context context, float f1)
    {
        a = context.getApplicationContext();
        j = f1;
    }

    private void a(Rect rect, Rect rect1)
    {
        rect1.set(Dips.pixelsToIntDips(rect.left, a), Dips.pixelsToIntDips(rect.top, a), Dips.pixelsToIntDips(rect.right, a), Dips.pixelsToIntDips(rect.bottom, a));
    }

    final Rect a()
    {
        return c;
    }

    final void a(int k, int l)
    {
        b.set(0, 0, k, l);
        a(b, c);
    }

    final void a(int k, int l, int i1, int j1)
    {
        d.set(k, l, k + i1, l + j1);
        a(d, e);
    }

    final Rect b()
    {
        return d;
    }

    final void b(int k, int l, int i1, int j1)
    {
        f.set(k, l, k + i1, l + j1);
        a(f, g);
    }

    final Rect c()
    {
        return e;
    }

    final void c(int k, int l, int i1, int j1)
    {
        h.set(k, l, k + i1, l + j1);
        a(h, i);
    }

    final Rect d()
    {
        return f;
    }

    final Rect e()
    {
        return g;
    }

    final Rect f()
    {
        return h;
    }

    final Rect g()
    {
        return i;
    }

    public final float getDensity()
    {
        return j;
    }
}
