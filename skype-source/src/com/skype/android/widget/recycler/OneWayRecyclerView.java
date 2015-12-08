// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.widget.recycler;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import com.skype.android.widget.fastscroll.FastScrollDelegate;
import com.skype.android.widget.fastscroll.Positionable;

public class OneWayRecyclerView extends RecyclerView
    implements Positionable
{
    static final class a extends LinearLayoutManager
    {

        public final void onItemsAdded(RecyclerView recyclerview, int i, int j)
        {
            super.onItemsAdded(recyclerview, i, j);
            if (i == findFirstVisibleItemPosition())
            {
                scrollToPosition(i);
            }
        }

        public final void scrollToPosition(int i)
        {
            scrollToPositionWithOffset(i, 0);
        }

        public final boolean supportsPredictiveItemAnimations()
        {
            return false;
        }

        public a(Context context)
        {
            super(context, 1, false);
        }
    }


    FastScrollDelegate a;
    int b;
    private int c;
    private boolean d;

    public OneWayRecyclerView(Context context)
    {
        this(context, null);
    }

    public OneWayRecyclerView(Context context, AttributeSet attributeset)
    {
        this(context, attributeset, 0);
    }

    public OneWayRecyclerView(Context context, AttributeSet attributeset, int i)
    {
        super(context, attributeset, i);
        setFocusableInTouchMode(true);
        setLayoutManager(new a(context));
        setHasFixedSize(true);
        float f1 = (int)getResources().getDimension(0x7f0c01b6);
        float f = f1;
        if (attributeset != null)
        {
            context = context.obtainStyledAttributes(attributeset, com.skype.android.app.R.styleable.OneWayRecyclerView, i, 0);
            f = context.getDimension(2, f1);
            attributeset = context.getDrawable(0);
            if (attributeset != null)
            {
                b = attributeset.getIntrinsicHeight();
            }
            d = context.getBoolean(1, false);
            context.recycle();
        }
        if (d)
        {
            a = new FastScrollDelegate(this, (int)f);
            addOnScrollListener(new android.support.v7.widget.RecyclerView.m() {

                final OneWayRecyclerView a;

                public final void onScrollStateChanged(RecyclerView recyclerview, int j)
                {
                    recyclerview = a.a;
                    boolean flag;
                    if (j != 0)
                    {
                        flag = true;
                    } else
                    {
                        flag = false;
                    }
                    recyclerview.a(flag);
                }

                public final void onScrolled(RecyclerView recyclerview, int j, int k)
                {
                    a.a.a(a.computeVerticalScrollOffset(), a.computeVerticalScrollExtent(), a.computeVerticalScrollRange());
                }

            
            {
                a = OneWayRecyclerView.this;
                super();
            }
            });
        }
        setViewCacheExtension(new android.support.v7.widget.RecyclerView.t() {

            final OneWayRecyclerView a;

            public final View a(int j)
            {
                a.getRecycledViewPool().a(j, a.getContext().getResources().getInteger(0x7f0e000b));
                return null;
            }

            
            {
                a = OneWayRecyclerView.this;
                super();
            }
        });
    }

    private int a(int i)
    {
        return (b * i) / getHeight() + 1;
    }

    public final void a(float f)
    {
        int i = getAdapter().getItemCount();
        if (f <= 0.0F)
        {
            scrollToPosition(0);
        } else
        {
            if (f >= 1.0F)
            {
                scrollToPosition(i - 1);
                return;
            }
            i -= getChildCount();
            if (i > 0)
            {
                scrollToPosition((int)((float)i * f));
                return;
            }
        }
    }

    protected boolean canAnimate()
    {
        return false;
    }

    public int computeVerticalScrollExtent()
    {
        if (d)
        {
            int j = super.computeVerticalScrollExtent();
            int i = j;
            if (b != 0)
            {
                i = j;
                if (getHeight() != 0)
                {
                    i = a(super.computeVerticalScrollRange());
                }
            }
            return i;
        } else
        {
            return super.computeVerticalScrollExtent();
        }
    }

    public int computeVerticalScrollRange()
    {
        if (d)
        {
            int j = super.computeVerticalScrollRange();
            int i = j;
            if (b != 0)
            {
                i = j;
                if (getHeight() != 0)
                {
                    i = super.computeVerticalScrollExtent();
                    i = j + (a(j) - i);
                }
            }
            return i;
        } else
        {
            return super.computeVerticalScrollRange();
        }
    }

    public boolean onInterceptTouchEvent(MotionEvent motionevent)
    {
        return d && a.a(motionevent) || super.onInterceptTouchEvent(motionevent);
    }

    protected void onLayout(boolean flag, int i, int j, int k, int l)
    {
        super.onLayout(flag, i, j, k, l);
        i = getChildCount();
        if (i > c)
        {
            setItemViewCacheSize(i);
        }
    }

    public boolean onTouchEvent(MotionEvent motionevent)
    {
        return d && a.b(motionevent) || super.onTouchEvent(motionevent);
    }

    public void setItemViewCacheSize(int i)
    {
        c = i;
        super.setItemViewCacheSize(i);
    }
}
