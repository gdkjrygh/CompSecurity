// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.databinding.adapters;

import android.animation.LayoutTransition;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;

public class ViewGroupBindingAdapter
{
    public static interface OnAnimationEnd
    {

        public abstract void onAnimationEnd(Animation animation);
    }

    public static interface OnAnimationRepeat
    {

        public abstract void onAnimationRepeat(Animation animation);
    }

    public static interface OnAnimationStart
    {

        public abstract void onAnimationStart(Animation animation);
    }

    public static interface OnChildViewAdded
    {

        public abstract void onChildViewAdded(View view, View view1);
    }

    public static interface OnChildViewRemoved
    {

        public abstract void onChildViewRemoved(View view, View view1);
    }


    public ViewGroupBindingAdapter()
    {
    }

    public static void setAnimateLayoutChanges(ViewGroup viewgroup, boolean flag)
    {
        if (flag)
        {
            viewgroup.setLayoutTransition(new LayoutTransition());
            return;
        } else
        {
            viewgroup.setLayoutTransition(null);
            return;
        }
    }

    public static void setListener(ViewGroup viewgroup, OnAnimationEnd onanimationend)
    {
        setListener(viewgroup, null, onanimationend, null);
    }

    public static void setListener(ViewGroup viewgroup, OnAnimationEnd onanimationend, OnAnimationRepeat onanimationrepeat)
    {
        setListener(viewgroup, null, onanimationend, onanimationrepeat);
    }

    public static void setListener(ViewGroup viewgroup, OnAnimationRepeat onanimationrepeat)
    {
        setListener(viewgroup, null, null, onanimationrepeat);
    }

    public static void setListener(ViewGroup viewgroup, OnAnimationStart onanimationstart)
    {
        setListener(viewgroup, onanimationstart, null, null);
    }

    public static void setListener(ViewGroup viewgroup, OnAnimationStart onanimationstart, OnAnimationEnd onanimationend)
    {
        setListener(viewgroup, onanimationstart, onanimationend, null);
    }

    public static void setListener(ViewGroup viewgroup, OnAnimationStart onanimationstart, OnAnimationEnd onanimationend, OnAnimationRepeat onanimationrepeat)
    {
        if (onanimationstart == null && onanimationend == null && onanimationrepeat == null)
        {
            viewgroup.setLayoutAnimationListener(null);
            return;
        } else
        {
            viewgroup.setLayoutAnimationListener(new android.view.animation.Animation.AnimationListener(onanimationstart, onanimationend, onanimationrepeat) {

                final OnAnimationEnd val$end;
                final OnAnimationRepeat val$repeat;
                final OnAnimationStart val$start;

                public void onAnimationEnd(Animation animation)
                {
                    if (end != null)
                    {
                        end.onAnimationEnd(animation);
                    }
                }

                public void onAnimationRepeat(Animation animation)
                {
                    if (repeat != null)
                    {
                        repeat.onAnimationRepeat(animation);
                    }
                }

                public void onAnimationStart(Animation animation)
                {
                    if (start != null)
                    {
                        start.onAnimationStart(animation);
                    }
                }

            
            {
                start = onanimationstart;
                end = onanimationend;
                repeat = onanimationrepeat;
                super();
            }
            });
            return;
        }
    }

    public static void setListener(ViewGroup viewgroup, OnAnimationStart onanimationstart, OnAnimationRepeat onanimationrepeat)
    {
        setListener(viewgroup, onanimationstart, null, onanimationrepeat);
    }

    public static void setListener(ViewGroup viewgroup, OnChildViewAdded onchildviewadded)
    {
        setListener(viewgroup, onchildviewadded, ((OnChildViewRemoved) (null)));
    }

    public static void setListener(ViewGroup viewgroup, OnChildViewAdded onchildviewadded, OnChildViewRemoved onchildviewremoved)
    {
        if (onchildviewadded == null && onchildviewremoved == null)
        {
            viewgroup.setOnHierarchyChangeListener(null);
            return;
        } else
        {
            viewgroup.setOnHierarchyChangeListener(new android.view.ViewGroup.OnHierarchyChangeListener(onchildviewadded, onchildviewremoved) {

                final OnChildViewAdded val$added;
                final OnChildViewRemoved val$removed;

                public void onChildViewAdded(View view, View view1)
                {
                    if (added != null)
                    {
                        added.onChildViewAdded(view, view1);
                    }
                }

                public void onChildViewRemoved(View view, View view1)
                {
                    if (removed != null)
                    {
                        removed.onChildViewRemoved(view, view1);
                    }
                }

            
            {
                added = onchildviewadded;
                removed = onchildviewremoved;
                super();
            }
            });
            return;
        }
    }

    public static void setListener(ViewGroup viewgroup, OnChildViewRemoved onchildviewremoved)
    {
        setListener(viewgroup, ((OnChildViewAdded) (null)), onchildviewremoved);
    }
}
