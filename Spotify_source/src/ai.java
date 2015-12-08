// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

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

final class ai
{

    static Rect a(View view)
    {
        Rect rect = new Rect();
        int ai1[] = new int[2];
        view.getLocationOnScreen(ai1);
        rect.set(ai1[0], ai1[1], ai1[0] + view.getWidth(), ai1[1] + view.getHeight());
        return rect;
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

    public static void a(Object obj, View view)
    {
        ((Transition)obj).setEpicenterCallback(new android.transition.Transition.EpicenterCallback(a(view)) {

            private Rect a;

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
                        a(arraylist, view.getChildAt(i));
                        i++;
                    }
                }
            }
            return;
        }
        arraylist.add(view);
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
        boolean flag1 = false;
        int j = 0;
        do
        {
label0:
            {
                boolean flag = flag1;
                if (j < i)
                {
                    if (list.get(j) != view)
                    {
                        break label0;
                    }
                    flag = true;
                }
                return flag;
            }
            j++;
        } while (true);
    }

    public static void b(Object obj, ArrayList arraylist)
    {
        int i = 0;
        obj = (Transition)obj;
        if (obj instanceof TransitionSet)
        {
            obj = (TransitionSet)obj;
            for (int k = ((TransitionSet) (obj)).getTransitionCount(); i < k; i++)
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

    // Unreferenced inner class ai$2

/* anonymous class */
    final class _cls2
        implements android.view.ViewTreeObserver.OnPreDrawListener
    {

        private View a;
        private Transition b;
        private View c;
        private ak d;
        private Map e;
        private Map f;
        private ArrayList g;

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
                    ai.a(f, view);
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
                    ai.a(g, view);
                    g.removeAll(f.values());
                    g.add(c);
                    ai.b(b, g);
                }
            }
            return true;
        }

            
            {
                a = view;
                b = transition;
                c = view1;
                d = ak1;
                e = map;
                f = map1;
                g = arraylist;
                super();
            }
    }


    // Unreferenced inner class ai$3

/* anonymous class */
    final class _cls3 extends android.transition.Transition.EpicenterCallback
    {

        private Rect a;
        private aj b;

        public final Rect onGetEpicenter(Transition transition)
        {
            if (a == null && b.a != null)
            {
                a = ai.a(b.a);
            }
            return a;
        }

            
            {
                b = aj1;
                super();
            }
    }


    // Unreferenced inner class ai$4

/* anonymous class */
    final class _cls4
        implements android.view.ViewTreeObserver.OnPreDrawListener
    {

        private View a;
        private Transition b;
        private ArrayList c;
        private Transition d;
        private ArrayList e;
        private Transition f;
        private ArrayList g;
        private Map h;
        private ArrayList i;
        private Transition j;
        private View k;

        public final boolean onPreDraw()
        {
            a.getViewTreeObserver().removeOnPreDrawListener(this);
            if (b != null)
            {
                ai.a(b, c);
            }
            if (d != null)
            {
                ai.a(d, e);
            }
            if (f != null)
            {
                ai.a(f, g);
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
