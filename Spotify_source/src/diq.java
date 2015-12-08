// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.ScrollView;
import com.spotify.android.paste.widget.prettylist.StickyListView;

public final class diq extends ViewGroup
    implements dir
{

    private final ScrollView a;
    private final dip b;
    private final StickyListView c;
    private dii d;

    public diq(Context context, View view)
    {
        super(context);
        b = new dip(context, view);
        a = new ScrollView(context);
        a.addView(b);
        c = new StickyListView(context);
        c.setPadding(0, dft.b(1.0F, context.getResources()), 0, 0);
        addView(a);
        addView(c);
    }

    public final StickyListView a()
    {
        return c;
    }

    public final void a(int i)
    {
        c.a(i);
    }

    public final void a(View view)
    {
        b.a(view);
    }

    public final void a(dii dii1)
    {
        d = dii1;
    }

    public final void a(String s)
    {
        if (d != null)
        {
            d.a(s);
        }
    }

    public final void a(boolean flag)
    {
    }

    public final dip b()
    {
        return b;
    }

    public final void b(View view)
    {
        c.a(view);
        c.b(view);
    }

    public final void b(boolean flag)
    {
    }

    public final ListView c()
    {
        return c.a;
    }

    public final void c(boolean flag)
    {
    }

    public final ImageView d()
    {
        return b.a();
    }

    public final void e()
    {
        c.a(true);
    }

    public final void f()
    {
        c.a(false);
    }

    public final View g()
    {
        return this;
    }

    protected final void onLayout(boolean flag, int i, int j, int k, int l)
    {
        k = getPaddingLeft();
        i = getPaddingTop();
        j = a.getMeasuredWidth() + k;
        l = a.getMeasuredHeight();
        a.layout(k, i, j, l + i);
        k = c.getMeasuredWidth();
        l = c.getMeasuredHeight();
        c.layout(j, i, k + j, l + i);
    }

    protected final void onMeasure(int i, int j)
    {
        i = android.view.View.MeasureSpec.getSize(i);
        j = android.view.View.MeasureSpec.getSize(j);
        int k = i - getPaddingLeft() - getPaddingRight();
        int l = j - getPaddingTop() - getPaddingBottom();
        int i1 = k / 3;
        b.a.e(l);
        a.measure(android.view.View.MeasureSpec.makeMeasureSpec(i1, 0x40000000), android.view.View.MeasureSpec.makeMeasureSpec(l, 0x40000000));
        c.measure(android.view.View.MeasureSpec.makeMeasureSpec(k - i1, 0x40000000), android.view.View.MeasureSpec.makeMeasureSpec(l, 0x40000000));
        setMeasuredDimension(i, j);
    }
}
