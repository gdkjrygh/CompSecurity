// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.orca.chatheads;

import android.content.Context;
import android.graphics.Rect;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.a.c.a;
import com.facebook.i;
import com.facebook.inject.t;
import com.facebook.k;
import com.facebook.n.c;
import com.facebook.n.g;
import com.facebook.n.j;
import com.facebook.orca.chatheads.annotations.ForChatHeads;
import com.facebook.widget.d;
import com.google.common.d.a.ab;
import com.google.common.d.a.s;

// Referenced classes of package com.facebook.orca.chatheads:
//            cb, ChatHeadCloseTargetView, cc, cd, 
//            ce

public class ca extends d
{

    private static final g a = com.facebook.n.g.a(40D, 7D);
    private final View b;
    private final ViewGroup c;
    private final FrameLayout d;
    private final ChatHeadCloseTargetView e;
    private final c f;
    private final Rect g = new Rect();
    private final Rect h = new Rect();
    private ce i;
    private cd j;
    private ab k;

    public ca(Context context)
    {
        super(context);
        context = (j)getInjector().a(com/facebook/n/j, com/facebook/orca/chatheads/annotations/ForChatHeads);
        setContentView(k.orca_chat_heads_full_view);
        b = c(i.background_darken);
        b.setOnClickListener(new cb(this));
        com.a.c.a.a(b, 0.0F);
        c = (ViewGroup)c(i.thread_view_container);
        d = (FrameLayout)c(i.chat_heads_container);
        e = (ChatHeadCloseTargetView)c(i.close_target);
        f = context.b().a(a).a(true).e(0.0050000000000000001D).d(0.0050000000000000001D).a(new cc(this, null));
        k = ab.a();
        k.a_(null);
    }

    static cd a(ca ca1)
    {
        return ca1.j;
    }

    private s a(double d1)
    {
        if (f.d() != d1)
        {
            d();
            k = ab.a();
            f.b(d1);
        }
        if (k != null)
        {
            return k;
        } else
        {
            return com.google.common.d.a.i.a(null);
        }
    }

    static View b(ca ca1)
    {
        return ca1.b;
    }

    static ab c(ca ca1)
    {
        return ca1.k;
    }

    private void d()
    {
        if (k != null)
        {
            k.cancel(false);
            k = null;
        }
    }

    private void e()
    {
        android.view.ViewGroup.MarginLayoutParams marginlayoutparams = (android.view.ViewGroup.MarginLayoutParams)c.getLayoutParams();
        marginlayoutparams.leftMargin = Math.max(g.left, h.left);
        marginlayoutparams.topMargin = Math.max(g.top, h.top);
        marginlayoutparams.rightMargin = Math.max(g.right, h.right);
        marginlayoutparams.bottomMargin = Math.max(g.bottom, h.bottom);
        c.setLayoutParams(marginlayoutparams);
    }

    public void a()
    {
        f.a();
        if (k != null)
        {
            k.cancel(false);
        }
        if (e != null)
        {
            e.a();
        }
    }

    public s b()
    {
        return a(1.0D);
    }

    public s c()
    {
        return a(0.0D);
    }

    public boolean dispatchKeyEvent(KeyEvent keyevent)
    {
        if (keyevent.getKeyCode() == 4)
        {
            android.view.KeyEvent.DispatcherState dispatcherstate = getKeyDispatcherState();
            if (keyevent.getAction() == 0)
            {
                dispatcherstate.startTracking(keyevent, this);
                return true;
            }
            if (keyevent.getAction() == 1 && !keyevent.isCanceled() && dispatcherstate.isTracking(keyevent) && j != null)
            {
                j.a("back_button");
                return true;
            }
        }
        return super.dispatchKeyEvent(keyevent);
    }

    protected boolean fitSystemWindows(Rect rect)
    {
        h.set(rect);
        e();
        return true;
    }

    public FrameLayout getChatHeadsContainer()
    {
        return d;
    }

    public ChatHeadCloseTargetView getCloseTargetView()
    {
        return e;
    }

    public ViewGroup getThreadViewContainer()
    {
        return c;
    }

    public void onSizeChanged(int l, int i1, int j1, int k1)
    {
        if (i != null)
        {
            i.a(l, i1, j1, k1);
        }
    }

    public void setOnDismissListener(cd cd1)
    {
        j = cd1;
    }

    public void setOnSizeChangeListener(ce ce1)
    {
        i = ce1;
    }

    public void setSystemWindowInsets(Rect rect)
    {
        g.set(rect);
        e();
    }

}
