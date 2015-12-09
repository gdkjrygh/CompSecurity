// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v4.app;

import android.graphics.Rect;
import android.transition.Transition;
import android.transition.TransitionManager;
import android.transition.TransitionSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

class l
{
    public static class a
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

    public static Object a(Object obj, Object obj1, Object obj2, boolean flag)
    {
        Transition transition = (Transition)obj;
        obj = (Transition)obj1;
        obj2 = (Transition)obj2;
        if (transition == null || obj == null)
        {
            flag = true;
        }
        if (flag)
        {
            obj1 = new TransitionSet();
            if (transition != null)
            {
                ((TransitionSet) (obj1)).addTransition(transition);
            }
            if (obj != null)
            {
                ((TransitionSet) (obj1)).addTransition(((Transition) (obj)));
            }
            if (obj2 != null)
            {
                ((TransitionSet) (obj1)).addTransition(((Transition) (obj2)));
            }
            return obj1;
        }
        obj1 = null;
        if (obj != null && transition != null)
        {
            obj = (new TransitionSet()).addTransition(((Transition) (obj))).addTransition(transition).setOrdering(1);
        } else
        if (obj == null)
        {
            obj = obj1;
            if (transition != null)
            {
                obj = transition;
            }
        }
        if (obj2 != null)
        {
            obj1 = new TransitionSet();
            if (obj != null)
            {
                ((TransitionSet) (obj1)).addTransition(((Transition) (obj)));
            }
            ((TransitionSet) (obj1)).addTransition(((Transition) (obj2)));
            return obj1;
        } else
        {
            return obj;
        }
    }

    public static String a(View view)
    {
        return view.getTransitionName();
    }

    private static void a(Transition transition, a a1)
    {
        if (transition != null)
        {
            transition.setEpicenterCallback(new android.transition.Transition.EpicenterCallback(a1) {

                final a a;
                private Rect b;

                public Rect onGetEpicenter(Transition transition1)
                {
                    if (b == null && a.a != null)
                    {
                        b = l.b(a.a);
                    }
                    return b;
                }

            
            {
                a = a1;
                super();
            }
            });
        }
    }

    public static void a(View view, View view1, Object obj, ArrayList arraylist, Object obj1, ArrayList arraylist1, Object obj2, ArrayList arraylist2, 
            Object obj3, ArrayList arraylist3, Map map)
    {
        obj = (Transition)obj;
        obj1 = (Transition)obj1;
        obj2 = (Transition)obj2;
        obj3 = (Transition)obj3;
        if (obj3 != null)
        {
            view.getViewTreeObserver().addOnPreDrawListener(new android.view.ViewTreeObserver.OnPreDrawListener(view, ((Transition) (obj)), view1, arraylist, ((Transition) (obj1)), arraylist1, ((Transition) (obj2)), arraylist2, map, arraylist3, ((Transition) (obj3))) {

                final View a;
                final Transition b;
                final View c;
                final ArrayList d;
                final Transition e;
                final ArrayList f;
                final Transition g;
                final ArrayList h;
                final Map i;
                final ArrayList j;
                final Transition k;

                public boolean onPreDraw()
                {
                    a.getViewTreeObserver().removeOnPreDrawListener(this);
                    if (b != null)
                    {
                        b.removeTarget(c);
                        l.a(b, d);
                    }
                    if (e != null)
                    {
                        l.a(e, f);
                    }
                    if (g != null)
                    {
                        l.a(g, h);
                    }
                    java.util.Map.Entry entry;
                    for (Iterator iterator = i.entrySet().iterator(); iterator.hasNext(); ((View)entry.getValue()).setTransitionName((String)entry.getKey()))
                    {
                        entry = (java.util.Map.Entry)iterator.next();
                    }

                    int j1 = j.size();
                    for (int i1 = 0; i1 < j1; i1++)
                    {
                        k.excludeTarget((View)j.get(i1), false);
                    }

                    k.excludeTarget(c, false);
                    return true;
                }

            
            {
                a = view;
                b = transition;
                c = view1;
                d = arraylist;
                e = transition1;
                f = arraylist1;
                g = transition2;
                h = arraylist2;
                i = map;
                j = arraylist3;
                k = transition3;
                super();
            }
            });
        }
    }

    public static void a(ViewGroup viewgroup, Object obj)
    {
        TransitionManager.beginDelayedTransition(viewgroup, (Transition)obj);
    }

    public static void a(Object obj, View view)
    {
        ((Transition)obj).setEpicenterCallback(new android.transition.Transition.EpicenterCallback(c(view)) {

            final Rect a;

            public Rect onGetEpicenter(Transition transition)
            {
                return a;
            }

            
            {
                a = rect;
                super();
            }
        });
    }

    public static void a(Object obj, View view, boolean flag)
    {
        ((Transition)obj).excludeTarget(view, flag);
    }

    public static void a(Object obj, Object obj1, View view, b b1, View view1, a a1, Map map, ArrayList arraylist, 
            Map map1, ArrayList arraylist1)
    {
        if (obj != null || obj1 != null)
        {
            obj = (Transition)obj;
            if (obj != null)
            {
                ((Transition) (obj)).addTarget(view1);
            }
            if (obj1 != null)
            {
                b((Transition)obj1, arraylist1);
            }
            if (b1 != null)
            {
                view.getViewTreeObserver().addOnPreDrawListener(new android.view.ViewTreeObserver.OnPreDrawListener(view, b1, map, map1, ((Transition) (obj)), arraylist, view1) {

                    final View a;
                    final b b;
                    final Map c;
                    final Map d;
                    final Transition e;
                    final ArrayList f;
                    final View g;

                    public boolean onPreDraw()
                    {
                        a.getViewTreeObserver().removeOnPreDrawListener(this);
                        View view2 = b.a();
                        if (view2 != null)
                        {
                            if (!c.isEmpty())
                            {
                                l.a(d, view2);
                                d.keySet().retainAll(c.values());
                                Iterator iterator = c.entrySet().iterator();
                                do
                                {
                                    if (!iterator.hasNext())
                                    {
                                        break;
                                    }
                                    java.util.Map.Entry entry = (java.util.Map.Entry)iterator.next();
                                    Object obj2 = (String)entry.getValue();
                                    obj2 = (View)d.get(obj2);
                                    if (obj2 != null)
                                    {
                                        ((View) (obj2)).setTransitionName((String)entry.getKey());
                                    }
                                } while (true);
                            }
                            if (e != null)
                            {
                                l.a(f, view2);
                                f.removeAll(d.values());
                                f.add(g);
                                e.removeTarget(g);
                                l.b(e, f);
                            }
                        }
                        return true;
                    }

            
            {
                a = view;
                b = b1;
                c = map;
                d = map1;
                e = transition;
                f = arraylist;
                g = view1;
                super();
            }
                });
            }
            a(((Transition) (obj)), a1);
        }
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

    static Rect b(View view)
    {
        return c(view);
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
            int i1 = arraylist.size();
            for (int j = 0; j < i1; j++)
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

    private static Rect c(View view)
    {
        Rect rect = new Rect();
        int ai[] = new int[2];
        view.getLocationOnScreen(ai);
        rect.set(ai[0], ai[1], ai[0] + view.getWidth(), ai[1] + view.getHeight());
        return rect;
    }
}
