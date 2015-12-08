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

final class FragmentTransitionCompat21
{
    public static final class EpicenterView
    {

        public View epicenter;

        public EpicenterView()
        {
        }
    }

    public static interface ViewRetriever
    {

        public abstract View getView();
    }


    public static void addTargets(Object obj, ArrayList arraylist)
    {
        obj = (Transition)obj;
        if (obj instanceof TransitionSet)
        {
            obj = (TransitionSet)obj;
            int k = ((TransitionSet) (obj)).getTransitionCount();
            for (int i = 0; i < k; i++)
            {
                addTargets(((TransitionSet) (obj)).getTransitionAt(i), arraylist);
            }

        } else
        if (!hasSimpleTarget(((Transition) (obj))) && isNullOrEmpty(((Transition) (obj)).getTargets()))
        {
            int l = arraylist.size();
            for (int j = 0; j < l; j++)
            {
                ((Transition) (obj)).addTarget((View)arraylist.get(j));
            }

        }
    }

    static void captureTransitioningViews(ArrayList arraylist, View view)
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
                        captureTransitioningViews(arraylist, view.getChildAt(i));
                        i++;
                    }
                }
            }
            return;
        }
        arraylist.add(view);
    }

    public static Object cloneTransition(Object obj)
    {
        Object obj1 = obj;
        if (obj != null)
        {
            obj1 = ((Transition)obj).clone();
        }
        return obj1;
    }

    public static void excludeTarget(Object obj, View view, boolean flag)
    {
        ((Transition)obj).excludeTarget(view, flag);
    }

    public static void findNamedViews(Map map, View view)
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
                    findNamedViews(map, view.getChildAt(i));
                }

            }
        }
    }

    static Rect getBoundsOnScreen(View view)
    {
        Rect rect = new Rect();
        int ai[] = new int[2];
        view.getLocationOnScreen(ai);
        rect.set(ai[0], ai[1], ai[0] + view.getWidth(), ai[1] + view.getHeight());
        return rect;
    }

    private static boolean hasSimpleTarget(Transition transition)
    {
        return !isNullOrEmpty(transition.getTargetIds()) || !isNullOrEmpty(transition.getTargetNames()) || !isNullOrEmpty(transition.getTargetTypes());
    }

    private static boolean isNullOrEmpty(List list)
    {
        return list == null || list.isEmpty();
    }

    public static void removeTargets(Object obj, ArrayList arraylist)
    {
        obj = (Transition)obj;
        if (obj instanceof TransitionSet)
        {
            obj = (TransitionSet)obj;
            int k = ((TransitionSet) (obj)).getTransitionCount();
            for (int i = 0; i < k; i++)
            {
                removeTargets(((TransitionSet) (obj)).getTransitionAt(i), arraylist);
            }

        } else
        if (!hasSimpleTarget(((Transition) (obj))))
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

    public static void setEpicenter(Object obj, View view)
    {
        ((Transition)obj).setEpicenterCallback(new android.transition.Transition.EpicenterCallback(getBoundsOnScreen(view)) {

            final Rect val$epicenter;

            public final Rect onGetEpicenter(Transition transition)
            {
                return epicenter;
            }

            
            {
                epicenter = rect;
                super();
            }
        });
    }

    // Unreferenced inner class android/support/v4/app/FragmentTransitionCompat21$2

/* anonymous class */
    static final class _cls2
        implements android.view.ViewTreeObserver.OnPreDrawListener
    {

        final View val$container;
        final Transition val$enterTransition;
        final ArrayList val$enteringViews;
        final ViewRetriever val$inFragment;
        final Map val$nameOverrides;
        final View val$nonExistentView;
        final Map val$renamedViews;

        public final boolean onPreDraw()
        {
            container.getViewTreeObserver().removeOnPreDrawListener(this);
            View view = inFragment.getView();
            if (view != null)
            {
                if (!nameOverrides.isEmpty())
                {
                    FragmentTransitionCompat21.findNamedViews(renamedViews, view);
                    renamedViews.keySet().retainAll(nameOverrides.values());
                    Iterator iterator = nameOverrides.entrySet().iterator();
                    do
                    {
                        if (!iterator.hasNext())
                        {
                            break;
                        }
                        java.util.Map.Entry entry = (java.util.Map.Entry)iterator.next();
                        Object obj = (String)entry.getValue();
                        obj = (View)renamedViews.get(obj);
                        if (obj != null)
                        {
                            ((View) (obj)).setTransitionName((String)entry.getKey());
                        }
                    } while (true);
                }
                if (enterTransition != null)
                {
                    FragmentTransitionCompat21.captureTransitioningViews(enteringViews, view);
                    enteringViews.removeAll(renamedViews.values());
                    enteringViews.add(nonExistentView);
                    enterTransition.removeTarget(nonExistentView);
                    FragmentTransitionCompat21.addTargets(enterTransition, enteringViews);
                }
            }
            return true;
        }

            
            {
                container = view;
                inFragment = viewretriever;
                nameOverrides = map;
                renamedViews = map1;
                enterTransition = transition;
                enteringViews = arraylist;
                nonExistentView = view1;
                super();
            }
    }


    // Unreferenced inner class android/support/v4/app/FragmentTransitionCompat21$3

/* anonymous class */
    static final class _cls3 extends android.transition.Transition.EpicenterCallback
    {

        private Rect mEpicenter;
        final EpicenterView val$epicenterView;

        public final Rect onGetEpicenter(Transition transition)
        {
            if (mEpicenter == null && epicenterView.epicenter != null)
            {
                mEpicenter = FragmentTransitionCompat21.getBoundsOnScreen(epicenterView.epicenter);
            }
            return mEpicenter;
        }

            
            {
                epicenterView = epicenterview;
                super();
            }
    }


    // Unreferenced inner class android/support/v4/app/FragmentTransitionCompat21$4

/* anonymous class */
    static final class _cls4
        implements android.view.ViewTreeObserver.OnPreDrawListener
    {

        final Transition val$enterTransition;
        final ArrayList val$enteringViews;
        final Transition val$exitTransition;
        final ArrayList val$exitingViews;
        final ArrayList val$hiddenViews;
        final View val$nonExistentView;
        final Transition val$overallTransition;
        final Map val$renamedViews;
        final View val$sceneRoot;
        final ArrayList val$sharedElementTargets;
        final Transition val$sharedElementTransition;

        public final boolean onPreDraw()
        {
            sceneRoot.getViewTreeObserver().removeOnPreDrawListener(this);
            if (enterTransition != null)
            {
                enterTransition.removeTarget(nonExistentView);
                FragmentTransitionCompat21.removeTargets(enterTransition, enteringViews);
            }
            if (exitTransition != null)
            {
                FragmentTransitionCompat21.removeTargets(exitTransition, exitingViews);
            }
            if (sharedElementTransition != null)
            {
                FragmentTransitionCompat21.removeTargets(sharedElementTransition, sharedElementTargets);
            }
            java.util.Map.Entry entry;
            for (Iterator iterator = renamedViews.entrySet().iterator(); iterator.hasNext(); ((View)entry.getValue()).setTransitionName((String)entry.getKey()))
            {
                entry = (java.util.Map.Entry)iterator.next();
            }

            int j = hiddenViews.size();
            for (int i = 0; i < j; i++)
            {
                overallTransition.excludeTarget((View)hiddenViews.get(i), false);
            }

            overallTransition.excludeTarget(nonExistentView, false);
            return true;
        }

            
            {
                sceneRoot = view;
                enterTransition = transition;
                nonExistentView = view1;
                enteringViews = arraylist;
                exitTransition = transition1;
                exitingViews = arraylist1;
                sharedElementTransition = transition2;
                sharedElementTargets = arraylist2;
                renamedViews = map;
                hiddenViews = arraylist3;
                overallTransition = transition3;
                super();
            }
    }

}
