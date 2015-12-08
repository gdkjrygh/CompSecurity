// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.bumptech.glide.g.b;

import android.content.Context;
import android.graphics.Point;
import android.view.Display;
import android.view.View;
import android.view.ViewTreeObserver;
import android.view.WindowManager;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

// Referenced classes of package com.bumptech.glide.g.b:
//            h, n

final class m
{

    private final View a;
    private final List b = new ArrayList();
    private n c;
    private Point d;

    public m(View view)
    {
        a = view;
    }

    private int a()
    {
        android.view.ViewGroup.LayoutParams layoutparams = a.getLayoutParams();
        if (a(a.getHeight()))
        {
            return a.getHeight();
        }
        if (layoutparams != null)
        {
            return a(layoutparams.height, true);
        } else
        {
            return 0;
        }
    }

    private int a(int i, boolean flag)
    {
        Object obj;
label0:
        {
            int j = i;
            if (i == -2)
            {
                if (d == null)
                {
                    obj = ((WindowManager)a.getContext().getSystemService("window")).getDefaultDisplay();
                    if (android.os.Build.VERSION.SDK_INT >= 13)
                    {
                        d = new Point();
                        ((Display) (obj)).getSize(d);
                    } else
                    {
                        d = new Point(((Display) (obj)).getWidth(), ((Display) (obj)).getHeight());
                    }
                }
                obj = d;
                if (!flag)
                {
                    break label0;
                }
                j = ((Point) (obj)).y;
            }
            return j;
        }
        return ((Point) (obj)).x;
    }

    static void a(m m1)
    {
        int i;
        int j;
label0:
        {
            if (!m1.b.isEmpty())
            {
                i = m1.b();
                j = m1.a();
                if (a(i) && a(j))
                {
                    break label0;
                }
            }
            return;
        }
        for (Iterator iterator = m1.b.iterator(); iterator.hasNext(); ((h)iterator.next()).a(i, j)) { }
        m1.b.clear();
        ViewTreeObserver viewtreeobserver = m1.a.getViewTreeObserver();
        if (viewtreeobserver.isAlive())
        {
            viewtreeobserver.removeOnPreDrawListener(m1.c);
        }
        m1.c = null;
    }

    private static boolean a(int i)
    {
        return i > 0 || i == -2;
    }

    private int b()
    {
        int i = 0;
        android.view.ViewGroup.LayoutParams layoutparams = a.getLayoutParams();
        if (a(a.getWidth()))
        {
            i = a.getWidth();
        } else
        if (layoutparams != null)
        {
            return a(layoutparams.width, false);
        }
        return i;
    }

    public final void a(h h1)
    {
        int i = b();
        int j = a();
        if (a(i) && a(j))
        {
            h1.a(i, j);
        } else
        {
            if (!b.contains(h1))
            {
                b.add(h1);
            }
            if (c == null)
            {
                h1 = a.getViewTreeObserver();
                c = new n(this);
                h1.addOnPreDrawListener(c);
                return;
            }
        }
    }
}
