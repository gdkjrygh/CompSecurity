// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.animation.ObjectAnimator;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Paint;
import android.view.View;
import android.view.ViewOverlay;

public final class ori
{

    final ViewOverlay a;
    public float b;
    public int c;
    public int d;
    private final int e;
    private final Context f;
    private final View g;
    private orh h;

    public ori(Context context, View view)
    {
        b = 1.0F;
        f = context;
        g = view;
        Resources resources = context.getResources();
        e = resources.getInteger(b.IJ);
        context = null;
        if (android.os.Build.VERSION.SDK_INT >= 18)
        {
            context = view.getOverlay();
        }
        a = context;
        c = resources.getColor(b.Is);
        d = resources.getColor(b.It);
    }

    public final void a()
    {
        if (a == null)
        {
            return;
        } else
        {
            b();
            h = new orh(f, b, c, d);
            a.add(h);
            h.setAlpha(0);
            ObjectAnimator objectanimator = ObjectAnimator.ofInt(h, "alpha", new int[] {
                255
            });
            objectanimator.setDuration(e);
            objectanimator.start();
            return;
        }
    }

    public final void a(String s, int i, int j, View view, boolean flag)
    {
        if (a == null || h == null)
        {
            return;
        }
        view = (View)p.a(view);
        int l = j;
        for (; view != g; view = (View)view)
        {
            i = (int)((float)i + view.getX());
            l = (int)((float)l + view.getY());
            view = view.getParent();
            p.b(view instanceof View);
        }

        view = h;
        p.a(s);
        if (!c.c(((orh) (view)).b, s))
        {
            view.b = s;
            view.c = (int)((orh) (view)).a.measureText(s);
            view.invalidateSelf();
        }
        s = h;
        int l1 = g.getWidth();
        int k1 = s.getIntrinsicWidth();
        int j1 = s.getIntrinsicHeight();
        int k;
        int i1;
        if (!flag)
        {
            k = i - k1;
        } else
        {
            k = i;
        }
        i1 = k + k1;
        if (!flag) goto _L2; else goto _L1
_L1:
        i = i1;
        j = k;
        if (i1 > l1)
        {
            flag = false;
            j = k - k1;
            i = i1 - k1;
        }
_L4:
        s.d = flag;
        s.setBounds(j, l - j1, i, l);
        return;
_L2:
        i = i1;
        j = k;
        if (k < 0)
        {
            flag = true;
            j = k + k1;
            i = i1 + k1;
        }
        if (true) goto _L4; else goto _L3
_L3:
    }

    public final void b()
    {
        if (a == null || h == null)
        {
            return;
        } else
        {
            orh orh1 = h;
            ObjectAnimator objectanimator = ObjectAnimator.ofInt(orh1, "alpha", new int[] {
                0
            });
            objectanimator.setDuration(e);
            objectanimator.addListener(new orj(this, orh1));
            objectanimator.start();
            h = null;
            return;
        }
    }
}
