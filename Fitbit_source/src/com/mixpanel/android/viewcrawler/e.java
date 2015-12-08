// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.mixpanel.android.viewcrawler;

import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import java.util.List;
import org.json.JSONException;
import org.json.JSONObject;

class e
{
    public static interface a
    {

        public abstract void a(View view);
    }

    public static class c
    {

        public static final int g = 0;
        public static final int h = 1;
        public final int a;
        public final String b;
        public final int c;
        public final int d;
        public final String e;
        public final String f;

        public String toString()
        {
            Object obj;
            try
            {
                obj = new JSONObject();
                if (a == 1)
                {
                    ((JSONObject) (obj)).put("prefix", "shortest");
                }
                if (b != null)
                {
                    ((JSONObject) (obj)).put("view_class", b);
                }
                if (c > -1)
                {
                    ((JSONObject) (obj)).put("index", c);
                }
                if (d > -1)
                {
                    ((JSONObject) (obj)).put("id", d);
                }
                if (e != null)
                {
                    ((JSONObject) (obj)).put("contentDescription", e);
                }
                if (f != null)
                {
                    ((JSONObject) (obj)).put("tag", f);
                }
                obj = ((JSONObject) (obj)).toString();
            }
            catch (JSONException jsonexception)
            {
                throw new RuntimeException("Can't serialize PathElement to String", jsonexception);
            }
            return ((String) (obj));
        }

        public c(int i, String s, int j, int k, String s1, String s2)
        {
            a = i;
            b = s;
            c = j;
            d = k;
            e = s1;
            f = s2;
        }
    }


    private static final String b = "MixpanelAPI.PathFinder";
    private final b a = new b();

    public e()
    {
    /* block-local class not found */
    class b {}

    }

    private View a(c c1, View view, int i)
    {
        int j = a.a(i);
        if (a(c1, view))
        {
            a.b(i);
            if (c1.c == -1 || c1.c == j)
            {
                return view;
            }
        }
        if (c1.a == 1 && (view instanceof ViewGroup))
        {
            view = (ViewGroup)view;
            int l = view.getChildCount();
            for (int k = 0; k < l; k++)
            {
                View view1 = a(c1, view.getChildAt(k), i);
                if (view1 != null)
                {
                    return view1;
                }
            }

        }
        return null;
    }

    private boolean a(c c1, View view)
    {
        if ((c1.b == null || a(view, c1.b)) && (-1 == c1.d || view.getId() == c1.d) && (c1.e == null || c1.e.equals(view.getContentDescription())))
        {
            String s = c1.f;
            if (c1.f == null || view.getTag() != null && s.equals(view.getTag().toString()))
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

    private void b(View view, List list, a a1)
    {
        int i = 0;
        if (list.isEmpty())
        {
            a1.a(view);
        } else
        if (view instanceof ViewGroup)
        {
            if (a.a())
            {
                Log.v("MixpanelAPI.PathFinder", "Path is too deep, will not match");
                return;
            }
            view = (ViewGroup)view;
            c c1 = (c)list.get(0);
            list = list.subList(1, list.size());
            int j = view.getChildCount();
            int k = a.b();
            do
            {
label0:
                {
                    if (i < j)
                    {
                        View view1 = a(c1, view.getChildAt(i), k);
                        if (view1 != null)
                        {
                            b(view1, list, a1);
                        }
                        if (c1.c < 0 || a.a(k) <= c1.c)
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

    public void a(View view, List list, a a1)
    {
        if (!list.isEmpty())
        {
            if (a.a())
            {
                Log.w("MixpanelAPI.PathFinder", "There appears to be a concurrency issue in the pathfinding code. Path will not be matched.");
                return;
            }
            c c1 = (c)list.get(0);
            list = list.subList(1, list.size());
            view = a(c1, view, a.b());
            a.c();
            if (view != null)
            {
                b(view, list, a1);
                return;
            }
        }
    }
}
