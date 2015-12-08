// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.android.slyce.report.c;

import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import java.util.List;

// Referenced classes of package com.android.slyce.report.c:
//            w, x, v

class u
{

    private final w a = new w();

    public u()
    {
    }

    private View a(x x1, View view, int i)
    {
        int j = a.a(i);
        if (a(x1, view))
        {
            a.b(i);
            if (x1.c == -1 || x1.c == j)
            {
                return view;
            }
        }
        if (x1.a == 1 && (view instanceof ViewGroup))
        {
            view = (ViewGroup)view;
            int l = view.getChildCount();
            for (int k = 0; k < l; k++)
            {
                View view1 = a(x1, view.getChildAt(k), i);
                if (view1 != null)
                {
                    return view1;
                }
            }

        }
        return null;
    }

    private boolean a(x x1, View view)
    {
        if ((x1.b == null || a(view, x1.b)) && (-1 == x1.d || view.getId() == x1.d) && (x1.e == null || x1.e.equals(view.getContentDescription())))
        {
            String s = x1.f;
            if (x1.f == null || view.getTag() != null && s.equals(view.getTag().toString()))
            {
                return true;
            }
        }
        return false;
    }

    private static boolean a(Object obj, String s)
    {
        obj = obj.getClass();
        do
        {
            if (((Class) (obj)).getCanonicalName().equals(s))
            {
                return true;
            }
            if (obj == java/lang/Object)
            {
                return false;
            }
            obj = ((Class) (obj)).getSuperclass();
        } while (true);
    }

    private void b(View view, List list, v v1)
    {
        int i = 0;
        if (list.isEmpty())
        {
            v1.a(view);
        } else
        if (view instanceof ViewGroup)
        {
            if (a.a())
            {
                Log.v("MixpanelAPI.PathFinder", "Path is too deep, will not match");
                return;
            }
            view = (ViewGroup)view;
            x x1 = (x)list.get(0);
            list = list.subList(1, list.size());
            int j = view.getChildCount();
            int k = a.b();
            do
            {
label0:
                {
                    if (i < j)
                    {
                        View view1 = a(x1, view.getChildAt(i), k);
                        if (view1 != null)
                        {
                            b(view1, list, v1);
                        }
                        if (x1.c < 0 || a.a(k) <= x1.c)
                        {
                            break label0;
                        }
                    }
                    a.c();
                    return;
                }
                i++;
            } while (true);
        }
    }

    public void a(View view, List list, v v1)
    {
        if (!list.isEmpty())
        {
            if (a.a())
            {
                Log.w("MixpanelAPI.PathFinder", "There appears to be a concurrency issue in the pathfinding code. Path will not be matched.");
                return;
            }
            x x1 = (x)list.get(0);
            list = list.subList(1, list.size());
            view = a(x1, view, a.b());
            a.c();
            if (view != null)
            {
                b(view, list, v1);
                return;
            }
        }
    }
}
