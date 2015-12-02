// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.reflex;

import android.content.Context;
import android.view.MotionEvent;
import android.view.SurfaceHolder;
import android.view.SurfaceView;
import android.view.View;
import android.view.ViewTreeObserver;
import android.view.Window;
import com.facebook.reflex.view.ContainerView;
import com.facebook.reflex.view.b.p;

// Referenced classes of package com.facebook.reflex:
//            Container, n, o, p, 
//            j, Widget

class m extends ContainerView
{

    final j a;
    private Container c;
    private SurfaceView d;
    private int e[];
    private int f;
    private int g;
    private int h;
    private int i;

    public m(j j1, Context context)
    {
        a = j1;
        super(context);
        c = new Container();
        c.a(getBackingWidget());
        d = new SurfaceView(context);
        d.setWillNotDraw(true);
        d.setZOrderOnTop(true);
        d.getHolder().setFormat(2);
        d.getHolder().addCallback(new n(this, j1));
        e = new int[2];
        getViewTreeObserver().addOnPreDrawListener(new o(this, j1));
        c.a(new com.facebook.reflex.p(this, j1));
    }

    static SurfaceView a(m m1)
    {
        return m1.d;
    }

    static void a(m m1, MotionEvent motionevent)
    {
        m1.b(motionevent);
    }

    private void b(MotionEvent motionevent)
    {
        View view = a.getWindow().getDecorView();
        view.getLocationInWindow(e);
        motionevent.setLocation(motionevent.getX() - (float)e[0], motionevent.getY() - (float)e[1]);
        view.dispatchTouchEvent(motionevent);
    }

    static void b(m m1)
    {
        m1.h();
    }

    private void h()
    {
        getLocationInWindow(e);
        View view = a.getWindow().getDecorView();
        if (f == e[0] && g == e[1] && h == view.getWidth() && i == view.getHeight())
        {
            return;
        } else
        {
            f = e[0];
            g = e[1];
            h = view.getWidth();
            i = view.getHeight();
            Widget.b(-f, -g);
            Widget.updateRootWidgetBounds(-f, -g, h, i);
            c.a(h, i);
            getBackingWidget().b(f, g);
            return;
        }
    }

    public Widget a()
    {
        return c;
    }

    public boolean dispatchTouchEvent(MotionEvent motionevent)
    {
        return false;
    }

    public void g()
    {
        removeAllViews();
    }

    protected void onLayout(boolean flag, int k, int l, int i1, int j1)
    {
        super.onLayout(flag, k, l, i1, j1);
        j.a(a).a();
    }
}
