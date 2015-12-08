// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.graphics.Rect;
import android.os.Bundle;
import android.view.WindowInsets;

public class fpj
    implements nuc, nug, omb, opn, opv
{

    public final Rect a;
    public final Rect b;
    public int c;
    public final nud d;
    private fpj e;
    private WindowInsets f;

    public fpj(opd opd1)
    {
        a = new Rect();
        b = new Rect();
        d = new ntz(this);
        opd1.a(this);
    }

    public fpj(opd opd1, byte byte0)
    {
        a = new Rect();
        b = new Rect();
        d = new ntz(this);
        opd1.a(this);
    }

    private void a(fpj fpj1)
    {
        if (e != null)
        {
            e.d.a(this);
        }
        e = fpj1;
        if (e != null)
        {
            e.d.a(this, true);
        }
    }

    public final fpj a(olm olm1)
    {
        olm1.a(fpj, this);
        return this;
    }

    public final nud a()
    {
        return d;
    }

    public final void a(Context context, olm olm1, Bundle bundle)
    {
        if (olm1.a != null)
        {
            context = (fpj)olm1.a.b(fpj);
        } else
        {
            context = null;
        }
        a(((fpj) (context)));
    }

    public final void a(Rect rect)
    {
        b.set(rect);
        if (android.os.Build.VERSION.SDK_INT < 19)
        {
            a.set(b);
            d.b();
        }
    }

    public final void a(WindowInsets windowinsets)
    {
        f = windowinsets.replaceSystemWindowInsets(windowinsets.getSystemWindowInsetLeft() + b.left, windowinsets.getSystemWindowInsetTop() + b.top, windowinsets.getSystemWindowInsetRight() + b.right, windowinsets.getSystemWindowInsetBottom() + b.bottom);
        a.set(f.getSystemWindowInsetLeft(), f.getSystemWindowInsetTop(), f.getSystemWindowInsetRight(), f.getSystemWindowInsetBottom());
        d.b();
    }

    public final int b()
    {
        if (c == 0 && e != null)
        {
            return e.c;
        } else
        {
            return c;
        }
    }

    public final void b(Rect rect)
    {
        a.set(rect.left + b.left, rect.top + b.top, rect.right + b.right, rect.bottom + b.bottom);
        d.b();
    }

    public final void b_(Object obj)
    {
        obj = (fpj)obj;
        if (((fpj) (obj)).f != null)
        {
            a(((fpj) (obj)).f);
        } else
        {
            b(((fpj) (obj)).a);
        }
        d.b();
    }

    public final void c()
    {
        a(((fpj) (null)));
    }
}
