// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.widget;

import android.content.Context;
import android.content.res.Resources;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.facebook.c.a.b;
import com.facebook.c.a.c;
import com.facebook.c.a.d;
import com.facebook.debug.d.e;
import com.facebook.inject.t;
import com.google.common.base.Preconditions;

// Referenced classes of package com.facebook.widget:
//            g, j, q

public class f extends ViewGroup
    implements g
{

    private d mSubscriberListManager;

    public f(Context context)
    {
        super(context);
    }

    public f(Context context, AttributeSet attributeset)
    {
        super(context, attributeset);
    }

    public f(Context context, AttributeSet attributeset, int i)
    {
        super(context, attributeset, i);
    }

    protected boolean addFbEventSubscriber(c c)
    {
        if (mSubscriberListManager == null)
        {
            mSubscriberListManager = new d();
        }
        return mSubscriberListManager.a(c);
    }

    public void attachRecyclableViewToParent(View view, int i, android.view.ViewGroup.LayoutParams layoutparams)
    {
        if ((view instanceof j) && q.a(this, view, i))
        {
            return;
        } else
        {
            view.onFinishTemporaryDetach();
            super.attachViewToParent(view, i, layoutparams);
            requestLayout();
            return;
        }
    }

    protected boolean checkLayoutParams(android.view.ViewGroup.LayoutParams layoutparams)
    {
        return layoutparams instanceof android.widget.FrameLayout.LayoutParams;
    }

    public void detachRecyclableViewFromParent(View view)
    {
        view.onStartTemporaryDetach();
        super.detachViewFromParent(view);
        requestLayout();
    }

    public void detachRecyclableViewsFromParent(int i, int k)
    {
        for (int l = 0; l < k; l++)
        {
            View view = getChildAt(i + l);
            if (view != null)
            {
                view.onStartTemporaryDetach();
            }
        }

        super.detachViewsFromParent(i, k);
        requestLayout();
    }

    protected android.view.ViewGroup.LayoutParams generateDefaultLayoutParams()
    {
        return new android.widget.FrameLayout.LayoutParams(-1, -1);
    }

    public android.view.ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeset)
    {
        return new android.widget.FrameLayout.LayoutParams(getContext(), attributeset);
    }

    protected android.view.ViewGroup.LayoutParams generateLayoutParams(android.view.ViewGroup.LayoutParams layoutparams)
    {
        return new android.widget.FrameLayout.LayoutParams(layoutparams);
    }

    protected b getEventBus()
    {
        return null;
    }

    public t getInjector()
    {
        return t.a(getContext());
    }

    protected View getView(int i)
    {
        return findViewById(i);
    }

    protected View getViewRequired(int i)
    {
        View view = getView(i);
        if (view == null)
        {
            Preconditions.checkNotNull(view, "Required view with ID %s not found", new Object[] {
                getResources().getResourceEntryName(i)
            });
        }
        return view;
    }

    protected void layoutChild(int i, int k, int l, int i1, View view)
    {
        android.widget.FrameLayout.LayoutParams layoutparams;
        int j1;
        int k1;
        int l1;
        int i2;
        int j2;
        layoutparams = (android.widget.FrameLayout.LayoutParams)view.getLayoutParams();
        l1 = view.getMeasuredWidth();
        i2 = view.getMeasuredHeight();
        j2 = layoutparams.gravity;
        k1 = i;
        j1 = l;
        if (j2 == -1) goto _L2; else goto _L1
_L1:
        j2 & 7;
        JVM INSTR tableswitch 1 5: default 84
    //                   1 175
    //                   2 84
    //                   3 164
    //                   4 84
    //                   5 201;
           goto _L3 _L4 _L3 _L5 _L3 _L6
_L3:
        i += layoutparams.leftMargin;
_L11:
        j2 & 0x70;
        JVM INSTR lookupswitch 3: default 132
    //                   16: 230
    //                   48: 215
    //                   80: 261;
           goto _L7 _L8 _L9 _L10
_L7:
        j1 = l + layoutparams.topMargin;
        k1 = i;
_L2:
        view.layout(k1, j1, k1 + l1, j1 + i2);
        return;
_L5:
        i += layoutparams.leftMargin;
          goto _L11
_L4:
        i = ((k - i - l1) / 2 + i + layoutparams.leftMargin) - layoutparams.rightMargin;
          goto _L11
_L6:
        i = k - l1 - layoutparams.rightMargin;
          goto _L11
_L9:
        j1 = l + layoutparams.topMargin;
        k1 = i;
          goto _L2
_L8:
        j1 = ((i1 - l - i2) / 2 + l + layoutparams.topMargin) - layoutparams.bottomMargin;
        k1 = i;
          goto _L2
_L10:
        j1 = i1 - i2 - layoutparams.bottomMargin;
        k1 = i;
          goto _L2
    }

    protected void onAttachedToWindow()
    {
        super.onAttachedToWindow();
        registerAllSubscribers();
    }

    protected void onDetachedFromWindow()
    {
        super.onDetachedFromWindow();
        unregisterAllSubscribers();
    }

    public void onFinishTemporaryDetach()
    {
        super.onFinishTemporaryDetach();
        registerAllSubscribers();
    }

    protected void onLayout(boolean flag, int i, int k, int l, int i1)
    {
        k = getChildCount();
        l = getPaddingLeft();
        i1 = getRight();
        int j1 = getLeft();
        int k1 = getPaddingRight();
        int l1 = getPaddingTop();
        int i2 = getBottom();
        int j2 = getTop();
        int k2 = getPaddingBottom();
        for (i = 0; i < k; i++)
        {
            View view = getChildAt(i);
            if (view.getVisibility() != 8)
            {
                layoutChild(l, i1 - j1 - k1, l1, i2 - j2 - k2, view);
            }
        }

    }

    protected void onMeasure(int i, int k)
    {
        int k1 = getChildCount();
        int j1 = 0;
        int i1 = 0;
        int l = 0;
        for (; j1 < k1; j1++)
        {
            View view = getChildAt(j1);
            if (view.getVisibility() != 8)
            {
                android.view.ViewGroup.MarginLayoutParams marginlayoutparams = (android.view.ViewGroup.MarginLayoutParams)view.getLayoutParams();
                measureChildWithMargins(view, i, 0, k, 0);
                i1 = Math.max(i1, view.getMeasuredWidth() + marginlayoutparams.leftMargin + marginlayoutparams.rightMargin);
                l = Math.max(l, view.getMeasuredHeight() + marginlayoutparams.topMargin + marginlayoutparams.bottomMargin);
            }
        }

        j1 = getPaddingLeft();
        k1 = getPaddingRight();
        l = Math.max(getPaddingTop() + getPaddingBottom() + l, getSuggestedMinimumHeight());
        setMeasuredDimension(resolveSize(Math.max(j1 + k1 + i1, getSuggestedMinimumWidth()), i), resolveSize(l, k));
    }

    public void onStartTemporaryDetach()
    {
        super.onStartTemporaryDetach();
        unregisterAllSubscribers();
    }

    protected void registerAllSubscribers()
    {
        if (mSubscriberListManager != null)
        {
            mSubscriberListManager.a(getEventBus());
        }
    }

    protected boolean removeFbEventSubscriber(c c)
    {
        if (mSubscriberListManager == null)
        {
            return false;
        } else
        {
            return mSubscriberListManager.b(c);
        }
    }

    public void removeRecyclableViewFromParent(View view, boolean flag)
    {
        super.removeDetachedView(view, flag);
    }

    protected void setContentView(int i)
    {
        e e1 = e.a("CustomViewGroup.setContentView");
        LayoutInflater.from(getContext()).inflate(i, this);
        e1.a();
    }

    protected void unregisterAllSubscribers()
    {
        if (mSubscriberListManager != null)
        {
            mSubscriberListManager.b(getEventBus());
        }
    }
}
