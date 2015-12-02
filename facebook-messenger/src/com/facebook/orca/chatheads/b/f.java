// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.orca.chatheads.b;

import android.content.Context;
import android.os.Handler;
import android.view.WindowManager;
import com.facebook.orca.chatheads.dv;
import com.google.common.d.a.ab;
import com.google.common.d.a.s;
import com.google.common.d.a.w;

// Referenced classes of package com.facebook.orca.chatheads.b:
//            a, e, i, h, 
//            g, j

public class f extends dv
{

    private final Context b;
    private final Handler c;
    private int d;
    private int e;
    private int f;

    public f(Context context, WindowManager windowmanager, Handler handler)
    {
        super(windowmanager, f());
        b = context;
        c = handler;
        setX(0x186a0);
        c(false);
    }

    static void a(f f1)
    {
        f1.e();
    }

    private void e()
    {
        if (h() != null && ((a)h()).getWidth() > 0 && ((a)h()).getHeight() > 0)
        {
            e e1 = ((a)h()).getOrigin();
            if (e1 == e.LEFT || e1 == e.RIGHT)
            {
                setX(e);
                setY(f - ((a)h()).getHeight() / 2);
            } else
            if (e1 == e.BOTTOM)
            {
                setX(e - ((a)h()).getWidth() / 2);
                setY(f);
                return;
            }
        }
    }

    private static final android.view.WindowManager.LayoutParams f()
    {
        android.view.WindowManager.LayoutParams layoutparams = new android.view.WindowManager.LayoutParams(-2, -2, a, 0x1000300, -3);
        layoutparams.gravity = 51;
        return layoutparams;
    }

    public void a(int j)
    {
        d = j;
        a(((android.view.View) (new a(b, d))));
        ((a)h()).setOnSizeChangedListener(new i(this));
    }

    public void a(long l, j j)
    {
        c.removeCallbacksAndMessages(null);
        c.postDelayed(new h(this, j), l);
        d();
    }

    public void a(e e1)
    {
        Object obj;
        obj = (a)h();
        if (e1 == ((a) (obj)).getOrigin())
        {
            return;
        }
        ((a) (obj)).setOrigin(e1);
        obj = k();
        if (e1 != e.LEFT) goto _L2; else goto _L1
_L1:
        obj.gravity = 51;
_L4:
        a(((android.view.WindowManager.LayoutParams) (obj)));
        return;
_L2:
        if (e1 == e.RIGHT)
        {
            obj.gravity = 53;
        } else
        if (e1 == e.BOTTOM)
        {
            obj.gravity = 83;
        }
        if (true) goto _L4; else goto _L3
_L3:
    }

    public void b()
    {
        c.removeCallbacksAndMessages(null);
        ((a)h()).setOnSizeChangedListener(null);
        super.b();
    }

    public void b(int j)
    {
        e = j;
        e();
    }

    public void c()
    {
        ab.a();
        ((a)h()).b().a(new g(this), w.a());
    }

    public void d()
    {
        ((a)h()).a();
    }

    public void g(int j)
    {
        f = j;
        e();
    }
}
