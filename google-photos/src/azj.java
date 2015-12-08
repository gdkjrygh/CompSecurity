// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.graphics.Point;
import android.view.Display;
import android.view.View;
import android.view.ViewTreeObserver;
import android.view.WindowManager;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

final class azj
{

    final View a;
    final List b = new ArrayList();
    azk c;
    private Point d;

    public azj(View view)
    {
        a = view;
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

    static void a(azj azj1)
    {
        int i;
        int j;
label0:
        {
            if (!azj1.b.isEmpty())
            {
                i = azj1.c();
                j = azj1.b();
                if (a(i) && a(j))
                {
                    break label0;
                }
            }
            return;
        }
        for (Iterator iterator = azj1.b.iterator(); iterator.hasNext(); ((azg)iterator.next()).a(i, j)) { }
        azj1.a();
    }

    static boolean a(int i)
    {
        return i > 0 || i == -2;
    }

    final void a()
    {
        ViewTreeObserver viewtreeobserver = a.getViewTreeObserver();
        if (viewtreeobserver.isAlive())
        {
            viewtreeobserver.removeOnPreDrawListener(c);
        }
        c = null;
        b.clear();
    }

    int b()
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

    int c()
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
}
