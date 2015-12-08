// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.translate.e;

import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewPropertyAnimator;
import android.widget.ListView;
import com.google.android.apps.translate.m;
import com.google.android.libraries.translate.e.o;
import java.util.ArrayList;
import java.util.List;

// Referenced classes of package com.google.android.apps.translate.e:
//            a, r, s, u, 
//            t, q

public final class p
    implements android.view.View.OnTouchListener, a
{

    private final int a;
    private final int b;
    private final int c;
    private final long d;
    private final List e = new ArrayList();
    private final ListView f;
    private final t g;
    private int h;
    private int i;
    private float j;
    private boolean k;
    private VelocityTracker l;
    private int m;
    private View n;
    private boolean o;

    public p(ListView listview, t t1)
    {
        h = 1;
        i = 0;
        ViewConfiguration viewconfiguration = ViewConfiguration.get(listview.getContext());
        a = viewconfiguration.getScaledTouchSlop();
        b = viewconfiguration.getScaledMinimumFlingVelocity() << 4;
        c = viewconfiguration.getScaledMaximumFlingVelocity();
        d = listview.getContext().getResources().getInteger(0x10e0000);
        f = listview;
        g = t1;
    }

    static int a(p p1)
    {
        int i1 = p1.i - 1;
        p1.i = i1;
        return i1;
    }

    static void a(p p1, View view, int i1)
    {
        android.view.ViewGroup.LayoutParams layoutparams = view.getLayoutParams();
        int j1 = view.getHeight();
        ValueAnimator valueanimator = ValueAnimator.ofInt(new int[] {
            j1, 1
        }).setDuration(p1.d);
        valueanimator.addListener(new r(p1, j1));
        valueanimator.addUpdateListener(new s(p1, layoutparams, view));
        p1.e.add(new u(p1, i1, view));
        valueanimator.start();
    }

    static int b(p p1)
    {
        return p1.i;
    }

    static List c(p p1)
    {
        return p1.e;
    }

    static t d(p p1)
    {
        return p1.g;
    }

    public final void a(boolean flag)
    {
        if (!flag)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        o = flag;
    }

    public final boolean onTouch(View view, MotionEvent motionevent)
    {
        int i1;
        i1 = 0;
        if (h < 2)
        {
            h = f.getWidth();
        }
        motionevent.getActionMasked();
        JVM INSTR tableswitch 0 3: default 56
    //                   0 58
    //                   1 304
    //                   2 759
    //                   3 684;
           goto _L1 _L2 _L3 _L4 _L5
_L1:
        return false;
_L2:
        if (o)
        {
            continue; /* Loop/switch isn't completed */
        }
        Rect rect = new Rect();
        int k1 = f.getChildCount();
        int ai[] = new int[2];
        f.getLocationOnScreen(ai);
        int i2 = (int)motionevent.getRawX() - ai[0];
        int k2 = (int)motionevent.getRawY() - ai[1];
        do
        {
label0:
            {
                if (i1 < k1)
                {
                    View view1 = f.getChildAt(i1);
                    view1.getHitRect(rect);
                    if (!rect.contains(i2, k2))
                    {
                        break label0;
                    }
                    n = view1;
                }
                if (n != null)
                {
                    j = motionevent.getRawX();
                    m = f.getPositionForView(n);
                    if (g.a(m))
                    {
                        l = VelocityTracker.obtain();
                        l.addMovement(motionevent);
                    } else
                    {
                        n = null;
                    }
                }
                view.onTouchEvent(motionevent);
                if (o.f && n != null)
                {
                    view = n.findViewById(m.card_bg_holder);
                    if (view != null)
                    {
                        view.getBackground().setHotspot(i2 - view.getLeft(), k2 - n.getTop());
                    }
                }
                return true;
            }
            i1++;
        } while (true);
_L3:
        if (l != null)
        {
            float f1 = motionevent.getRawX() - j;
            l.addMovement(motionevent);
            l.computeCurrentVelocity(1000);
            float f2 = l.getXVelocity();
            float f3 = Math.abs(f2);
            float f4 = Math.abs(l.getYVelocity());
            int j1;
            int l1;
            if (Math.abs(f1) > (float)(h / 2))
            {
                if (f1 > 0.0F)
                {
                    j1 = 1;
                } else
                {
                    j1 = 0;
                }
                l1 = 1;
            } else
            if ((float)b <= f3 && f3 <= (float)c && f4 < f3)
            {
                int j2;
                if (f2 < 0.0F)
                {
                    j1 = 1;
                } else
                {
                    j1 = 0;
                }
                if (f1 < 0.0F)
                {
                    l1 = 1;
                } else
                {
                    l1 = 0;
                }
                if (j1 == l1)
                {
                    j1 = 1;
                } else
                {
                    j1 = 0;
                }
                if (l.getXVelocity() > 0.0F)
                {
                    l1 = 1;
                } else
                {
                    l1 = 0;
                }
                j2 = j1;
                j1 = l1;
                l1 = j2;
            } else
            {
                j1 = 0;
                l1 = 0;
            }
            if (l1 != 0)
            {
                view = n;
                l1 = m;
                i = i + 1;
                if (view == null)
                {
                    g.a(new int[] {
                        l1
                    });
                } else
                {
                    motionevent = view.animate();
                    if (j1 != 0)
                    {
                        f1 = h;
                    } else
                    {
                        f1 = -h;
                    }
                    motionevent.translationX(f1).alpha(0.0F).setDuration(d).setListener(new q(this, view, l1));
                }
            } else
            {
                n.animate().translationX(0.0F).alpha(1.0F).setDuration(d).setListener(null);
            }
            l.recycle();
            l = null;
            j = 0.0F;
            n = null;
            m = -1;
            k = false;
            return false;
        }
        continue; /* Loop/switch isn't completed */
_L5:
        if (l != null)
        {
            if (n != null)
            {
                n.animate().translationX(0.0F).alpha(1.0F).setDuration(d).setListener(null);
            }
            l.recycle();
            l = null;
            j = 0.0F;
            n = null;
            m = -1;
            k = false;
            return false;
        }
        continue; /* Loop/switch isn't completed */
_L4:
        if (l != null && !o)
        {
            l.addMovement(motionevent);
            f1 = motionevent.getRawX() - j;
            if (Math.abs(f1) > (float)a)
            {
                k = true;
                f.requestDisallowInterceptTouchEvent(true);
                view = MotionEvent.obtain(motionevent);
                view.setAction(motionevent.getActionIndex() << 8 | 3);
                f.onTouchEvent(view);
                view.recycle();
            }
            if (k)
            {
                n.setTranslationX(f1);
                n.setAlpha(Math.max(0.15F, Math.min(1.0F, 1.0F - (Math.abs(f1) * 2.0F) / (float)h)));
                return true;
            }
        }
        if (true) goto _L1; else goto _L6
_L6:
    }
}
