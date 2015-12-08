// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package xyz.danoz.recyclerviewfastscroller;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.support.v7.widget.RecyclerView;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.FrameLayout;
import aoD;
import aoE;
import aoH;
import aoz;

public abstract class AbsRecyclerViewFastScroller extends FrameLayout
{

    private static final int e[];
    public final View a;
    public final View b;
    public RecyclerView c;
    public aoH d;
    private android.support.v7.widget.RecyclerView.l f;

    public AbsRecyclerViewFastScroller(Context context)
    {
        this(context, null, 0);
    }

    public AbsRecyclerViewFastScroller(Context context, AttributeSet attributeset)
    {
        this(context, attributeset, 0);
    }

    public AbsRecyclerViewFastScroller(Context context, AttributeSet attributeset, int i)
    {
        super(context, attributeset, i);
        attributeset = getContext().getTheme().obtainStyledAttributes(attributeset, e, 0, 0);
        i = attributeset.getResourceId(aoA.c.AbsRecyclerViewFastScroller_rfs_fast_scroller_layout, c());
        ((LayoutInflater)context.getSystemService("layout_inflater")).inflate(i, this, true);
        a = findViewById(aoA.a.scroll_bar);
        b = findViewById(aoA.a.scroll_handle);
        context = attributeset.getDrawable(aoA.c.AbsRecyclerViewFastScroller_rfs_barBackground);
        i = attributeset.getColor(aoA.c.AbsRecyclerViewFastScroller_rfs_barColor, 0xff888888);
        a(a, context, i);
        context = attributeset.getDrawable(aoA.c.AbsRecyclerViewFastScroller_rfs_handleBackground);
        i = attributeset.getColor(aoA.c.AbsRecyclerViewFastScroller_rfs_handleColor, 0xff888888);
        a(b, context, i);
        attributeset.recycle();
        setOnTouchListener(new aoz(this));
        return;
        context;
        attributeset.recycle();
        throw context;
    }

    private static void a(View view, Drawable drawable)
    {
        if (android.os.Build.VERSION.SDK_INT >= 16)
        {
            view.setBackground(drawable);
            return;
        } else
        {
            view.setBackgroundDrawable(drawable);
            return;
        }
    }

    private static void a(View view, Drawable drawable, int i)
    {
        if (drawable != null)
        {
            a(view, drawable);
            return;
        } else
        {
            view.setBackgroundColor(i);
            return;
        }
    }

    public final android.support.v7.widget.RecyclerView.l a()
    {
        if (f == null)
        {
            f = new android.support.v7.widget.RecyclerView.l() {

                private AbsRecyclerViewFastScroller a;

                public final void a(RecyclerView recyclerview, int i, int j)
                {
                    float f1 = 0.0F;
                    aoE aoe = a.d();
                    if (aoe != null)
                    {
                        f1 = aoe.a(recyclerview);
                    }
                    a.a(f1);
                }

            
            {
                a = AbsRecyclerViewFastScroller.this;
                super();
            }
            };
        }
        return f;
    }

    public abstract void a(float f1);

    public abstract void b();

    public abstract int c();

    public abstract aoE d();

    protected void onLayout(boolean flag, int i, int j, int k, int l)
    {
        super.onLayout(flag, i, j, k, l);
        if (d() == null)
        {
            b();
        }
        a(d().a(c));
    }

    public void setBarBackground(Drawable drawable)
    {
        a(a, drawable);
    }

    public void setBarColor(int i)
    {
        a.setBackgroundColor(i);
    }

    public void setHandleBackground(Drawable drawable)
    {
        a(b, drawable);
    }

    public void setHandleColor(int i)
    {
        b.setBackgroundColor(i);
    }

    public void setRecyclerView(RecyclerView recyclerview)
    {
        c = recyclerview;
    }

    public void setSectionIndicator(aoH aoh)
    {
        d = aoh;
    }

    static 
    {
        e = aoA.c.AbsRecyclerViewFastScroller;
    }
}
