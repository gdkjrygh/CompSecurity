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
import java.util.List;
import java.util.Map;

// Referenced classes of package android.support.v4.app:
//            bc, bd, ba, bb, 
//            be, bf

class az
{

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

    private static void a(Transition transition, be be)
    {
        if (transition != null)
        {
            transition.setEpicenterCallback(new bc(be));
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
            view.getViewTreeObserver().addOnPreDrawListener(new bd(view, ((Transition) (obj)), arraylist, ((Transition) (obj1)), arraylist1, ((Transition) (obj2)), arraylist2, map, arraylist3, ((Transition) (obj3)), view1));
        }
    }

    public static void a(ViewGroup viewgroup, Object obj)
    {
        TransitionManager.beginDelayedTransition(viewgroup, (Transition)obj);
    }

    public static void a(Object obj, View view)
    {
        ((Transition)obj).setEpicenterCallback(new ba(c(view)));
    }

    public static void a(Object obj, View view, Map map, ArrayList arraylist)
    {
        obj = (TransitionSet)obj;
        arraylist.clear();
        arraylist.addAll(map.values());
        map = ((TransitionSet) (obj)).getTargets();
        map.clear();
        int j = arraylist.size();
        for (int i = 0; i < j; i++)
        {
            a(((List) (map)), (View)arraylist.get(i));
        }

        arraylist.add(view);
        b(obj, arraylist);
    }

    public static void a(Object obj, View view, boolean flag)
    {
        ((Transition)obj).excludeTarget(view, flag);
    }

    public static void a(Object obj, Object obj1, View view, bf bf, View view1, be be, Map map, ArrayList arraylist, 
            Map map1, Map map2, ArrayList arraylist1)
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
                a(obj1, view1, map1, arraylist1);
            }
            if (bf != null)
            {
                view.getViewTreeObserver().addOnPreDrawListener(new bb(view, ((Transition) (obj)), view1, bf, map, map2, arraylist));
            }
            a(((Transition) (obj)), be);
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

    private static void a(List list, View view)
    {
        int k = list.size();
        if (!a(list, view, k))
        {
            list.add(view);
            int i = k;
            while (i < list.size()) 
            {
                view = (View)list.get(i);
                if (view instanceof ViewGroup)
                {
                    view = (ViewGroup)view;
                    int l = view.getChildCount();
                    for (int j = 0; j < l; j++)
                    {
                        View view1 = view.getChildAt(j);
                        if (!a(list, view1, k))
                        {
                            list.add(view1);
                        }
                    }

                }
                i++;
            }
        }
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

    static Rect b(View view)
    {
        return c(view);
    }

    public static Object b(Object obj)
    {
        if (obj != null)
        {
            if ((obj = (Transition)obj) != null)
            {
                TransitionSet transitionset = new TransitionSet();
                transitionset.addTransition(((Transition) (obj)));
                return transitionset;
            }
        }
        return null;
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
