// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.bumptech.glide.request.b;

import android.content.Context;
import android.graphics.Point;
import android.util.Log;
import android.view.Display;
import android.view.View;
import android.view.ViewTreeObserver;
import android.view.WindowManager;
import com.bumptech.glide.request.c;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

// Referenced classes of package com.bumptech.glide.request.b:
//            a, h

public abstract class k extends com.bumptech.glide.request.b.a
{
    private static class a
    {

        private final View a;
        private final List b = new ArrayList();
        private a c;
        private Point d;

        private int a(int i, boolean flag)
        {
            if (i == -2)
            {
                Point point = d();
                if (flag)
                {
                    return point.y;
                } else
                {
                    return point.x;
                }
            } else
            {
                return i;
            }
        }

        private void a()
        {
            if (!b.isEmpty())
            {
                int i = c();
                int j = b();
                if (a(i) && a(j))
                {
                    a(i, j);
                    ViewTreeObserver viewtreeobserver = a.getViewTreeObserver();
                    if (viewtreeobserver.isAlive())
                    {
                        viewtreeobserver.removeOnPreDrawListener(c);
                    }
                    c = null;
                    return;
                }
            }
        }

        private void a(int i, int j)
        {
            for (Iterator iterator = b.iterator(); iterator.hasNext(); ((h)iterator.next()).a(i, j)) { }
            b.clear();
        }

        static void a(a a1)
        {
            a1.a();
        }

        private boolean a(int i)
        {
            return i > 0 || i == -2;
        }

        private int b()
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

        private int c()
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

        private Point d()
        {
            if (d != null)
            {
                return d;
            }
            Display display = ((WindowManager)a.getContext().getSystemService("window")).getDefaultDisplay();
            if (android.os.Build.VERSION.SDK_INT >= 13)
            {
                d = new Point();
                display.getSize(d);
            } else
            {
                d = new Point(display.getWidth(), display.getHeight());
            }
            return d;
        }

        public void a(h h1)
        {
            int i = c();
            int j = b();
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
                    c = new a(this);
                    h1.addOnPreDrawListener(c);
                    return;
                }
            }
        }

        public a(View view)
        {
            a = view;
        }
    }

    private static class a.a
        implements android.view.ViewTreeObserver.OnPreDrawListener
    {

        private final WeakReference a;

        public boolean onPreDraw()
        {
            if (Log.isLoggable("ViewTarget", 2))
            {
                Log.v("ViewTarget", (new StringBuilder()).append("OnGlobalLayoutListener called listener=").append(this).toString());
            }
            a a1 = (a)a.get();
            if (a1 != null)
            {
                a.a(a1);
            }
            return true;
        }

        public a.a(a a1)
        {
            a = new WeakReference(a1);
        }
    }


    private static boolean b = false;
    private static Integer c = null;
    protected final View a;
    private final a d;

    public k(View view)
    {
        if (view == null)
        {
            throw new NullPointerException("View must not be null!");
        } else
        {
            a = view;
            d = new a(view);
            return;
        }
    }

    private void a(Object obj)
    {
        if (c == null)
        {
            b = true;
            a.setTag(obj);
            return;
        } else
        {
            a.setTag(c.intValue(), obj);
            return;
        }
    }

    private Object c()
    {
        if (c == null)
        {
            return a.getTag();
        } else
        {
            return a.getTag(c.intValue());
        }
    }

    public c a()
    {
        Object obj = c();
        if (obj != null)
        {
            if (obj instanceof c)
            {
                return (c)obj;
            } else
            {
                throw new IllegalArgumentException("You must not call setTag() on a view Glide is targeting");
            }
        } else
        {
            return null;
        }
    }

    public void a(h h)
    {
        d.a(h);
    }

    public void a(c c1)
    {
        a(c1);
    }

    public View g_()
    {
        return a;
    }

    public String toString()
    {
        return (new StringBuilder()).append("Target for: ").append(a).toString();
    }

}
