// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v4.app;

import android.graphics.Rect;
import android.transition.Transition;
import android.transition.TransitionSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

final class p
{
    public static final class a
    {

        public View a;

        public a()
        {
        }
    }

    public static interface b
    {

        public abstract View a();
    }


    static Rect a(View view)
    {
        return b(view);
    }

    public static Object a(Object obj)
    {
        Object obj1 = obj;
        if (obj != null)
        {
            obj1 = ((Transition)obj).clone();
        }
        return obj1;
    }

    public static Object a(Object obj, View view, ArrayList arraylist, Map map, View view1)
    {
label0:
        {
            Object obj1 = obj;
            if (obj != null)
            {
                b(arraylist, view);
                if (map != null)
                {
                    arraylist.removeAll(map.values());
                }
                if (!arraylist.isEmpty())
                {
                    break label0;
                }
                obj1 = null;
            }
            return obj1;
        }
        arraylist.add(view1);
        b((Transition)obj, arraylist);
        return obj;
    }

    public static void a(Object obj, View view)
    {
        ((Transition)obj).setEpicenterCallback(new android.transition.Transition.EpicenterCallback(b(view)) {

            final Rect a;

            public final Rect onGetEpicenter(Transition transition)
            {
                return a;
            }

            
            {
                a = rect;
                super();
            }
        });
    }

    public static void a(Object obj, View view, Map map, ArrayList arraylist)
    {
        obj = (TransitionSet)obj;
        arraylist.clear();
        arraylist.addAll(map.values());
        map = ((TransitionSet) (obj)).getTargets();
        map.clear();
        int i1 = arraylist.size();
        for (int i = 0; i < i1; i++)
        {
            View view1 = (View)arraylist.get(i);
            int l = map.size();
            if (a(((List) (map)), view1, l))
            {
                continue;
            }
            map.add(view1);
            for (int j = l; j < map.size(); j++)
            {
                Object obj1 = (View)map.get(j);
                if (!(obj1 instanceof ViewGroup))
                {
                    continue;
                }
                obj1 = (ViewGroup)obj1;
                int j1 = ((ViewGroup) (obj1)).getChildCount();
                for (int k = 0; k < j1; k++)
                {
                    View view2 = ((ViewGroup) (obj1)).getChildAt(k);
                    if (!a(((List) (map)), view2, l))
                    {
                        map.add(view2);
                    }
                }

            }

        }

        arraylist.add(view);
        b(obj, arraylist);
    }

    public static void a(Object obj, View view, boolean flag)
    {
        ((Transition)obj).excludeTarget(view, flag);
    }

    public static void a(Object obj, ArrayList arraylist)
    {
        obj = (Transition)obj;
        if (obj instanceof TransitionSet)
        {
            obj = (TransitionSet)obj;
            int k = ((TransitionSet) (obj)).getTransitionCount();
            for (int i = 0; i < k; i++)
            {
                a(((TransitionSet) (obj)).getTransitionAt(i), arraylist);
            }

        } else
        if (!a(((Transition) (obj))))
        {
            List list = ((Transition) (obj)).getTargets();
            if (list != null && list.size() == arraylist.size() && list.containsAll(arraylist))
            {
                for (int j = arraylist.size() - 1; j >= 0; j--)
                {
                    ((Transition) (obj)).removeTarget((View)arraylist.get(j));
                }

            }
        }
    }

    static void a(ArrayList arraylist, View view)
    {
        b(arraylist, view);
    }

    public static void a(Map map, View view)
    {
        if (view.getVisibility() == 0)
        {
            String s = view.getTransitionName();
            if (s != null)
            {
                map.put(s, view);
            }
            if (view instanceof ViewGroup)
            {
                view = (ViewGroup)view;
                int j = view.getChildCount();
                for (int i = 0; i < j; i++)
                {
                    a(map, view.getChildAt(i));
                }

            }
        }
    }

    private static boolean a(Transition transition)
    {
        return !a(transition.getTargetIds()) || !a(transition.getTargetNames()) || !a(transition.getTargetTypes());
    }

    private static boolean a(List list)
    {
        return list == null || list.isEmpty();
    }

    private static boolean a(List list, View view, int i)
    {
        for (int j = 0; j < i; j++)
        {
            if (list.get(j) == view)
            {
                return true;
            }
        }

        return false;
    }

    private static Rect b(View view)
    {
        Rect rect = new Rect();
        int ai[] = new int[2];
        view.getLocationOnScreen(ai);
        rect.set(ai[0], ai[1], ai[0] + view.getWidth(), ai[1] + view.getHeight());
        return rect;
    }

    public static void b(Object obj, ArrayList arraylist)
    {
        obj = (Transition)obj;
        if (obj instanceof TransitionSet)
        {
            obj = (TransitionSet)obj;
            int k = ((TransitionSet) (obj)).getTransitionCount();
            for (int i = 0; i < k; i++)
            {
                b(((TransitionSet) (obj)).getTransitionAt(i), arraylist);
            }

        } else
        if (!a(((Transition) (obj))) && a(((Transition) (obj)).getTargets()))
        {
            int l = arraylist.size();
            for (int j = 0; j < l; j++)
            {
                ((Transition) (obj)).addTarget((View)arraylist.get(j));
            }

        }
    }

    private static void b(ArrayList arraylist, View view)
    {
label0:
        {
            if (view.getVisibility() == 0)
            {
                if (!(view instanceof ViewGroup))
                {
                    break label0;
                }
                view = (ViewGroup)view;
                if (view.isTransitionGroup())
                {
                    arraylist.add(view);
                } else
                {
                    int j = view.getChildCount();
                    int i = 0;
                    while (i < j) 
                    {
                        b(arraylist, view.getChildAt(i));
                        i++;
                    }
                }
            }
            return;
        }
        arraylist.add(view);
    }

    // Unreferenced inner class android/support/v4/app/p$2

/* anonymous class */
    static final class _cls2
        implements android.view.ViewTreeObserver.OnPreDrawListener
    {

        final View a;
        final Transition b;
        final View c;
        final b d;
        final Map e;
        final Map f;
        final ArrayList g;

        public final boolean onPreDraw()
        {
            a.getViewTreeObserver().removeOnPreDrawListener(this);
            if (b != null)
            {
                b.removeTarget(c);
            }
            View view = d.a();
            if (view != null)
            {
                if (!e.isEmpty())
                {
                    p.a(f, view);
                    f.keySet().retainAll(e.values());
                    Iterator iterator = e.entrySet().iterator();
                    do
                    {
                        if (!iterator.hasNext())
                        {
                            break;
                        }
                        java.util.Map.Entry entry = (java.util.Map.Entry)iterator.next();
                        Object obj = (String)entry.getValue();
                        obj = (View)f.get(obj);
                        if (obj != null)
                        {
                            ((View) (obj)).setTransitionName((String)entry.getKey());
                        }
                    } while (true);
                }
                if (b != null)
                {
                    p.a(g, view);
                    g.removeAll(f.values());
                    g.add(c);
                    p.b(b, g);
                }
            }
            return true;
        }

            
            {
                a = view;
                b = transition;
                c = view1;
                d = b1;
                e = map;
                f = map1;
                g = arraylist;
                super();
            }
    }


    // Unreferenced inner class android/support/v4/app/p$3

/* anonymous class */
    static final class _cls3 extends android.transition.Transition.EpicenterCallback
    {

        final a a;
        private Rect b;

        public final Rect onGetEpicenter(Transition transition)
        {
            if (b == null && a.a != null)
            {
                b = p.a(a.a);
            }
            return b;
        }

            
            {
                a = a1;
                super();
            }
    }


    // Unreferenced inner class android/support/v4/app/p$4

/* anonymous class */
    static final class _cls4
        implements android.view.ViewTreeObserver.OnPreDrawListener
    {

        final View a;
        final Transition b;
        final ArrayList c;
        final Transition d;
        final ArrayList e;
        final Transition f;
        final ArrayList g;
        final Map h;
        final ArrayList i;
        final Transition j;
        final View k;

        public final boolean onPreDraw()
        {
            a.getViewTreeObserver().removeOnPreDrawListener(this);
            if (b != null)
            {
                p.a(b, c);
            }
            if (d != null)
            {
                p.a(d, e);
            }
            if (f != null)
            {
                p.a(f, g);
            }
            java.util.Map.Entry entry;
            for (Iterator iterator = h.entrySet().iterator(); iterator.hasNext(); ((View)entry.getValue()).setTransitionName((String)entry.getKey()))
            {
                entry = (java.util.Map.Entry)iterator.next();
            }

            int i1 = i.size();
            for (int l = 0; l < i1; l++)
            {
                j.excludeTarget((View)i.get(l), false);
            }

            j.excludeTarget(k, false);
            return true;
        }

            
            {
                a = view;
                b = transition;
                c = arraylist;
                d = transition1;
                e = arraylist1;
                f = transition2;
                g = arraylist2;
                h = map;
                i = arraylist3;
                j = transition3;
                k = view1;
                super();
            }
    }

}
