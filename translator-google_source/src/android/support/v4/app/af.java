// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v4.app;

import android.graphics.Rect;
import android.transition.Transition;
import android.transition.TransitionSet;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

// Referenced classes of package android.support.v4.app:
//            ag

final class af
{

    static Rect a(View view)
    {
        Rect rect = new Rect();
        int ai[] = new int[2];
        view.getLocationOnScreen(ai);
        rect.set(ai[0], ai[1], ai[0] + view.getWidth(), ai[1] + view.getHeight());
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
        ((Transition)obj).setEpicenterCallback(new ag(a(view)));
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
}
