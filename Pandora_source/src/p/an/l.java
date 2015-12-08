// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package p.an;

import android.content.Context;
import android.graphics.Point;
import android.util.Log;
import android.view.Display;
import android.view.View;
import android.view.ViewTreeObserver;
import android.view.WindowManager;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import p.al.c;

// Referenced classes of package p.an:
//            a, i

public abstract class l extends p.an.a
{
    private static class a
    {

        private final View a;
        private final List b = new ArrayList();
        private a c;
        private Point d;

        private int a(int j, boolean flag)
        {
            if (j == -2)
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
                return j;
            }
        }

        private void a()
        {
            if (!b.isEmpty())
            {
                int j = c();
                int k = b();
                if (a(j) && a(k))
                {
                    a(j, k);
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

        private void a(int j, int k)
        {
            for (Iterator iterator = b.iterator(); iterator.hasNext(); ((i)iterator.next()).a(j, k)) { }
            b.clear();
        }

        static void a(a a1)
        {
            a1.a();
        }

        private boolean a(int j)
        {
            return j > 0 || j == -2;
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
            int j = 0;
            android.view.ViewGroup.LayoutParams layoutparams = a.getLayoutParams();
            if (a(a.getWidth()))
            {
                j = a.getWidth();
            } else
            if (layoutparams != null)
            {
                return a(layoutparams.width, false);
            }
            return j;
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

        public void a(i j)
        {
            int k = c();
            int i1 = b();
            if (a(k) && a(i1))
            {
                j.a(k, i1);
            } else
            {
                if (!b.contains(j))
                {
                    b.add(j);
                }
                if (c == null)
                {
                    j = a.getViewTreeObserver();
                    c = new a(this);
                    j.addOnPreDrawListener(c);
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

    public l(View view)
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

    public void a(c c1)
    {
        a(c1);
    }

    public void a(i i)
    {
        d.a(i);
    }

    public View d_()
    {
        return a;
    }

    public String toString()
    {
        return (new StringBuilder()).append("Target for: ").append(a).toString();
    }

}
