// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.animation.ValueAnimator;
import android.app.Activity;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Point;
import android.os.Bundle;
import android.os.Handler;
import android.view.Display;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowManager;
import android.view.accessibility.AccessibilityManager;
import com.google.android.apps.photos.actionabletoast.ToastRootView;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class dgk
    implements omb, ooc, ooe, opu, opv
{

    private static final String b = dgk.getSimpleName();
    Activity a;
    private final WindowManager c;
    private final Handler d = new Handler();
    private final Point e = new Point();
    private final List f = new ArrayList();
    private boolean g;
    private dge h;
    private dge i;
    private dge j;
    private boolean k;
    private noz l;
    private final Runnable m = new dgl(this);
    private final android.view.View.OnTouchListener n = new dgm(this);
    private final dgi o = new dgn(this);

    public dgk(Activity activity, opd opd1)
    {
        a = activity;
        c = (WindowManager)activity.getSystemService("window");
        opd1.a(this);
    }

    static dge a(dgk dgk1)
    {
        return dgk1.i;
    }

    private static void a(dge dge1, float f1)
    {
        ToastRootView toastrootview = dge1.a;
        View view = dge1.b;
        switch (dge1.e)
        {
        default:
            throw new UnsupportedOperationException("Only TOP and BOTTOM gravity is supported.");

        case 48: // '0'
            view.setTranslationY((float)(-toastrootview.getMeasuredHeight()) * (1.0F - f1));
            return;

        case 80: // 'P'
            view.setTranslationY((float)toastrootview.getMeasuredHeight() * (1.0F - f1));
            break;
        }
    }

    private static void a(dge dge1, int i1)
    {
        dge1 = dge1.d;
        if (dge1 != null)
        {
            dge1.a(i1);
        }
    }

    static void a(dgk dgk1, dge dge1)
    {
        dgk1.b(dge1);
    }

    static void a(dgk dgk1, dge dge1, float f1)
    {
        a(dge1, f1);
    }

    static boolean a(dgk dgk1, boolean flag)
    {
        dgk1.k = false;
        return false;
    }

    static dge b(dgk dgk1, dge dge1)
    {
        dgk1.j = null;
        return null;
    }

    static List b(dgk dgk1)
    {
        return dgk1.f;
    }

    private void b(dge dge1)
    {
        dge1 = dge1.a;
        if (g)
        {
            c.removeViewImmediate(dge1);
        }
        i = null;
    }

    static dge c(dgk dgk1)
    {
        return dgk1.j;
    }

    private ValueAnimator e()
    {
        return ValueAnimator.ofFloat(new float[] {
            1.0F
        }).setDuration(a.getResources().getInteger(b.iH));
    }

    public final void V_()
    {
        a(dgw.a, false);
    }

    public final dgg a()
    {
        return new dgg(this);
    }

    public final void a(int i1, boolean flag)
    {
        d.removeCallbacks(m);
        if (i != null && !k)
        {
            if (l.a())
            {
                boolean flag1 = g;
                (new StringBuilder(43)).append("Dismissing toast. isAttachedToWindow? ").append(flag1);
            }
            dge dge1 = i;
            dge1.a(false);
            if (!flag)
            {
                b(dge1);
                a(dge1, i1);
                Iterator iterator = f.iterator();
                while (iterator.hasNext()) 
                {
                    ((dgz)iterator.next()).b(dge1, 0.0F);
                }
            } else
            {
                k = true;
                ValueAnimator valueanimator = e();
                valueanimator.addUpdateListener(new dgt(this, dge1));
                valueanimator.addListener(new dgq(this, dge1));
                valueanimator.addUpdateListener(new dgr(this, dge1));
                valueanimator.start();
                a(dge1, i1);
                return;
            }
        }
    }

    public final void a(Context context, olm olm, Bundle bundle)
    {
        l = noz.a(a, 3, b, new String[0]);
    }

    public final void a(dge dge1)
    {
        p.a(dge1);
        if (!g && android.os.Build.VERSION.SDK_INT < 19)
        {
            h = dge1;
            return;
        }
        if (i != null)
        {
            j = dge1;
            a(dgw.e, true);
            return;
        }
        i = dge1;
        Object obj = i;
        ((dge) (obj)).a.setOnTouchListener(n);
        ((dge) (obj)).b.setOnTouchListener(n);
        obj = o;
        dge1.f.add(obj);
        d.removeCallbacks(m);
        obj = d;
        Object obj1 = m;
        android.view.WindowManager.LayoutParams layoutparams;
        String s;
        int i1;
        int j1;
        if (((AccessibilityManager)a.getSystemService("accessibility")).isTouchExplorationEnabled())
        {
            i1 = (int)dgh.a.c;
        } else
        {
            i1 = dge1.c;
        }
        ((Handler) (obj)).postDelayed(((Runnable) (obj1)), i1);
        dge1.a(false);
        obj1 = dge1.a;
        j1 = dge1.e;
        layoutparams = new android.view.WindowManager.LayoutParams();
        layoutparams.height = -2;
        layoutparams.width = -1;
        layoutparams.format = -3;
        if (android.os.Build.VERSION.SDK_INT >= 19)
        {
            i1 = 2005;
        } else
        {
            i1 = 1003;
        }
        layoutparams.type = i1;
        obj = String.valueOf("ActionableToast:");
        s = String.valueOf(Integer.toHexString(hashCode()));
        if (s.length() != 0)
        {
            obj = ((String) (obj)).concat(s);
        } else
        {
            obj = new String(((String) (obj)));
        }
        layoutparams.setTitle(((CharSequence) (obj)));
        layoutparams.gravity = j1;
        if (android.os.Build.VERSION.SDK_INT >= 19 && (a.getWindow().getAttributes().flags & 0x8000000) == 0x8000000)
        {
            i1 = 0x8000000;
        } else
        {
            i1 = 0;
        }
        layoutparams.flags = i1 | 0x40020 | 8;
        ((View) (obj1)).setLayoutParams(layoutparams);
        if (l.a())
        {
            obj = String.valueOf(dge1);
            i1 = dge1.c;
            (new StringBuilder(String.valueOf(obj).length() + 31)).append("Showing toast: ").append(((String) (obj))).append(" for ").append(i1);
        }
        c.addView(((View) (obj1)), ((View) (obj1)).getLayoutParams());
        obj = dge1.a;
        obj1 = (android.view.WindowManager.LayoutParams)((View) (obj)).getLayoutParams();
        c.getDefaultDisplay().getSize(e);
        ((View) (obj)).measure(ViewGroup.getChildMeasureSpec(android.view.View.MeasureSpec.makeMeasureSpec(e.x, 0x40000000), 0, ((android.view.WindowManager.LayoutParams) (obj1)).width), ViewGroup.getChildMeasureSpec(android.view.View.MeasureSpec.makeMeasureSpec(e.y, 0x40000000), 0, ((android.view.WindowManager.LayoutParams) (obj1)).height));
        a(dge1, 0.0F);
        obj = e();
        ((ValueAnimator) (obj)).addUpdateListener(new dgs(this, dge1));
        ((ValueAnimator) (obj)).addListener(new dgo(this));
        ((ValueAnimator) (obj)).addUpdateListener(new dgp(this, dge1));
        ((ValueAnimator) (obj)).start();
    }

    public final void a(dgz dgz1)
    {
        f.add(dgz1);
    }

    public final void b(dgz dgz1)
    {
        f.remove(dgz1);
    }

    public final void c()
    {
        g = true;
        if (h != null)
        {
            dge dge1 = h;
            h = null;
            a(dge1);
        }
    }

    public final void d()
    {
        g = false;
    }

}
