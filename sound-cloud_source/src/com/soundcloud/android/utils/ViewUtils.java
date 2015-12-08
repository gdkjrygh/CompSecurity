// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.utils;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Color;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewGroup;

public final class ViewUtils
{

    private ViewUtils()
    {
    }

    public static Iterable allChildViewsOf(final ViewGroup viewGroup)
    {
        return new _cls3();
    }

    public static int blendColors(int i, int j, float f)
    {
        float f1 = 1.0F - f;
        float f2 = Color.red(j);
        float f3 = Color.red(i);
        float f4 = Color.green(j);
        float f5 = Color.green(i);
        float f6 = Color.blue(j);
        float f7 = Color.blue(i);
        return Color.rgb((int)(f2 * f + f3 * f1), (int)(f4 * f + f5 * f1), (int)(f1 * f7 + f6 * f));
    }

    public static Iterable childViewsOf(final ViewGroup viewGroup)
    {
        return new _cls2();
    }

    public static void clearTouchDelegate(View view)
    {
        ((View)view.getParent()).setTouchDelegate(null);
    }

    public static int dpToPx(Context context, int i)
    {
        return dpToPx(context.getResources(), i);
    }

    public static int dpToPx(Resources resources, int i)
    {
        return (int)TypedValue.applyDimension(1, i, resources.getDisplayMetrics());
    }

    public static void extendTouchArea(final View delegate, final int extendPx)
    {
        extendPx = dpToPx(delegate.getContext(), extendPx);
        final View parent = (View)delegate.getParent();
        parent.post(new _cls1());
    }

    public static void setTouchClickable(View view, android.view.View.OnClickListener onclicklistener)
    {
        view.setClickable(true);
        view.setOnClickListener(onclicklistener);
        extendTouchArea(view, 10);
    }

    public static void unsetTouchClickable(View view)
    {
        clearTouchDelegate(view);
        view.setClickable(false);
    }

    private class _cls3
        implements Iterable
    {

        final ViewGroup val$viewGroup;
        private Stack views;

        public final Iterator iterator()
        {
            class _cls1
                implements Iterator
            {

                final _cls3 this$0;

                private void pushViews(ViewGroup viewgroup)
                {
                    View view;
                    for (viewgroup = ViewUtils.childViewsOf(viewgroup).iterator(); viewgroup.hasNext(); views.push(view))
                    {
                        view = (View)viewgroup.next();
                    }

                }

                public boolean hasNext()
                {
                    return !views.empty();
                }

                public View next()
                {
                    View view = (View)views.pop();
                    if (view instanceof ViewGroup)
                    {
                        pushViews((ViewGroup)view);
                    }
                    return view;
                }

                public volatile Object next()
                {
                    return next();
                }

                public void remove()
                {
                    throw new UnsupportedOperationException();
                }

                _cls1()
                {
                    this$0 = _cls3.this;
                    super();
                    pushViews(viewGroup);
                }
            }

            return new _cls1();
        }


        _cls3()
        {
            viewGroup = viewgroup;
            super();
            views = new Stack();
        }
    }


    private class _cls2
        implements Iterable
    {

        private final int count;
        final ViewGroup val$viewGroup;

        public final Iterator iterator()
        {
            class _cls1
                implements Iterator
            {

                int i;
                final _cls2 this$0;

                public boolean hasNext()
                {
                    return i < count;
                }

                public View next()
                {
                    ViewGroup viewgroup = viewGroup;
                    int j = i;
                    i = j + 1;
                    return viewgroup.getChildAt(j);
                }

                public volatile Object next()
                {
                    return next();
                }

                public void remove()
                {
                    throw new UnsupportedOperationException();
                }

                _cls1()
                {
                    this$0 = _cls2.this;
                    super();
                    i = 0;
                }
            }

            return new _cls1();
        }


        _cls2()
        {
            viewGroup = viewgroup;
            super();
            count = viewGroup.getChildCount();
        }
    }


    private class _cls1
        implements Runnable
    {

        final View val$delegate;
        final int val$extendPx;
        final View val$parent;

        public final void run()
        {
            Rect rect = new Rect();
            delegate.getHitRect(rect);
            rect.top = rect.top - extendPx;
            rect.left = rect.left - extendPx;
            rect.right = rect.right + extendPx;
            rect.bottom = rect.bottom + extendPx;
            parent.setTouchDelegate(new TouchDelegate(rect, delegate));
        }

        _cls1()
        {
            delegate = view;
            extendPx = i;
            parent = view1;
            super();
        }
    }

}
