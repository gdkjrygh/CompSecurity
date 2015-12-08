// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v7.app;

import android.content.Context;
import android.content.res.Resources;
import android.support.v4.view.bt;
import android.support.v4.view.dq;
import android.support.v4.widget.as;
import android.support.v7.a.b;
import android.support.v7.a.g;
import android.support.v7.c.a;
import android.support.v7.internal.view.c;
import android.support.v7.internal.view.e;
import android.support.v7.internal.widget.ActionBarContextView;
import android.support.v7.internal.widget.ViewStubCompat;
import android.util.TypedValue;
import android.view.ActionMode;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.PopupWindow;

// Referenced classes of package android.support.v7.app:
//            r, t, AppCompatDelegateImplV7, ae, 
//            a, aa, ac

class u extends r
{

    final t b;

    u(t t1, android.view.Window.Callback callback)
    {
        b = t1;
        super(t1, callback);
    }

    final ActionMode a(android.view.ActionMode.Callback callback)
    {
        e e1 = new e(b.a, callback);
        t t1 = b;
        if (((AppCompatDelegateImplV7) (t1)).p != null)
        {
            ((AppCompatDelegateImplV7) (t1)).p.c();
        }
        ae ae1 = new ae(t1, e1);
        callback = t1.a();
        if (callback != null)
        {
            t1.p = callback.a(ae1);
        }
        if (((AppCompatDelegateImplV7) (t1)).p == null)
        {
            t1.l();
            if (((AppCompatDelegateImplV7) (t1)).p != null)
            {
                ((AppCompatDelegateImplV7) (t1)).p.c();
            }
            ae ae2 = new ae(t1, ae1);
            if (((AppCompatDelegateImplV7) (t1)).q == null)
            {
                if (((AppCompatDelegateImplV7) (t1)).k)
                {
                    Object obj = new TypedValue();
                    callback = ((AppCompatDelegateImplV7) (t1)).a.getTheme();
                    callback.resolveAttribute(b.actionBarTheme, ((TypedValue) (obj)), true);
                    int i;
                    if (((TypedValue) (obj)).resourceId != 0)
                    {
                        android.content.res.Resources.Theme theme = ((AppCompatDelegateImplV7) (t1)).a.getResources().newTheme();
                        theme.setTo(callback);
                        theme.applyStyle(((TypedValue) (obj)).resourceId, true);
                        callback = new android.support.v7.internal.view.b(((AppCompatDelegateImplV7) (t1)).a, 0);
                        callback.getTheme().setTo(theme);
                    } else
                    {
                        callback = ((AppCompatDelegateImplV7) (t1)).a;
                    }
                    t1.q = new ActionBarContextView(callback);
                    t1.r = new PopupWindow(callback, null, b.actionModePopupWindowStyle);
                    as.a(((AppCompatDelegateImplV7) (t1)).r);
                    ((AppCompatDelegateImplV7) (t1)).r.setContentView(((AppCompatDelegateImplV7) (t1)).q);
                    ((AppCompatDelegateImplV7) (t1)).r.setWidth(-1);
                    callback.getTheme().resolveAttribute(b.actionBarSize, ((TypedValue) (obj)), true);
                    i = TypedValue.complexToDimensionPixelSize(((TypedValue) (obj)).data, callback.getResources().getDisplayMetrics());
                    ((AppCompatDelegateImplV7) (t1)).q.setContentHeight(i);
                    ((AppCompatDelegateImplV7) (t1)).r.setHeight(-2);
                    t1.s = new aa(t1);
                } else
                {
                    callback = (ViewStubCompat)((AppCompatDelegateImplV7) (t1)).u.findViewById(g.action_mode_bar_stub);
                    if (callback != null)
                    {
                        callback.setLayoutInflater(LayoutInflater.from(t1.k()));
                        t1.q = (ActionBarContextView)callback.a();
                    }
                }
            }
            if (((AppCompatDelegateImplV7) (t1)).q != null)
            {
                t1.l();
                ((AppCompatDelegateImplV7) (t1)).q.b();
                callback = ((AppCompatDelegateImplV7) (t1)).q.getContext();
                obj = ((AppCompatDelegateImplV7) (t1)).q;
                boolean flag;
                if (((AppCompatDelegateImplV7) (t1)).r == null)
                {
                    flag = true;
                } else
                {
                    flag = false;
                }
                callback = new c(callback, ((ActionBarContextView) (obj)), ae2, flag);
                if (ae1.a(callback, callback.b()))
                {
                    callback.d();
                    ((AppCompatDelegateImplV7) (t1)).q.a(callback);
                    t1.p = callback;
                    bt.b(((AppCompatDelegateImplV7) (t1)).q, 0.0F);
                    t1.t = bt.l(((AppCompatDelegateImplV7) (t1)).q).a(1.0F);
                    ((AppCompatDelegateImplV7) (t1)).t.a(new ac(t1));
                    if (((AppCompatDelegateImplV7) (t1)).r != null)
                    {
                        ((AppCompatDelegateImplV7) (t1)).b.getDecorView().post(((AppCompatDelegateImplV7) (t1)).s);
                    }
                } else
                {
                    t1.p = null;
                }
            }
            t1.p = ((AppCompatDelegateImplV7) (t1)).p;
        }
        callback = ((AppCompatDelegateImplV7) (t1)).p;
        if (callback != null)
        {
            return e1.b(callback);
        } else
        {
            return null;
        }
    }

    public ActionMode onWindowStartingActionMode(android.view.ActionMode.Callback callback)
    {
        if (b.o)
        {
            return a(callback);
        } else
        {
            return super.onWindowStartingActionMode(callback);
        }
    }
}
