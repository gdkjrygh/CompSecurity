// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v7.internal.widget;

import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.res.TypedArray;
import android.database.DataSetObserver;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.SpinnerAdapter;

// Referenced classes of package android.support.v7.internal.widget:
//            AbsSpinnerICS, ListPopupWindow, c

class android.support.v7.internal.widget.d extends AbsSpinnerICS
    implements android.content.DialogInterface.OnClickListener
{
    private class a
        implements android.content.DialogInterface.OnClickListener, d
    {

        final android.support.v7.internal.widget.d a;
        private AlertDialog b;
        private ListAdapter c;
        private CharSequence d;

        public void a(ListAdapter listadapter)
        {
            c = listadapter;
        }

        public void a(CharSequence charsequence)
        {
            d = charsequence;
        }

        public void c()
        {
            android.app.AlertDialog.Builder builder = new android.app.AlertDialog.Builder(a.getContext());
            if (d != null)
            {
                builder.setTitle(d);
            }
            b = builder.setSingleChoiceItems(c, a.f(), this).show();
        }

        public void d()
        {
            b.dismiss();
            b = null;
        }

        public boolean f()
        {
            if (b != null)
            {
                return b.isShowing();
            } else
            {
                return false;
            }
        }

        public void onClick(DialogInterface dialoginterface, int i)
        {
            a.a(i);
            if (a.t != null)
            {
                a.a(null, i, c.getItemId(i));
            }
            d();
        }

        private a()
        {
            a = android.support.v7.internal.widget.d.this;
            super();
        }

    }

    private static class b
        implements ListAdapter, SpinnerAdapter
    {

        private SpinnerAdapter a;
        private ListAdapter b;

        public boolean areAllItemsEnabled()
        {
            ListAdapter listadapter = b;
            if (listadapter != null)
            {
                return listadapter.areAllItemsEnabled();
            } else
            {
                return true;
            }
        }

        public int getCount()
        {
            if (a == null)
            {
                return 0;
            } else
            {
                return a.getCount();
            }
        }

        public View getDropDownView(int i, View view, ViewGroup viewgroup)
        {
            if (a == null)
            {
                return null;
            } else
            {
                return a.getDropDownView(i, view, viewgroup);
            }
        }

        public Object getItem(int i)
        {
            if (a == null)
            {
                return null;
            } else
            {
                return a.getItem(i);
            }
        }

        public long getItemId(int i)
        {
            if (a == null)
            {
                return -1L;
            } else
            {
                return a.getItemId(i);
            }
        }

        public int getItemViewType(int i)
        {
            return 0;
        }

        public View getView(int i, View view, ViewGroup viewgroup)
        {
            return getDropDownView(i, view, viewgroup);
        }

        public int getViewTypeCount()
        {
            return 1;
        }

        public boolean hasStableIds()
        {
            return a != null && a.hasStableIds();
        }

        public boolean isEmpty()
        {
            return getCount() == 0;
        }

        public boolean isEnabled(int i)
        {
            ListAdapter listadapter = b;
            if (listadapter != null)
            {
                return listadapter.isEnabled(i);
            } else
            {
                return true;
            }
        }

        public void registerDataSetObserver(DataSetObserver datasetobserver)
        {
            if (a != null)
            {
                a.registerDataSetObserver(datasetobserver);
            }
        }

        public void unregisterDataSetObserver(DataSetObserver datasetobserver)
        {
            if (a != null)
            {
                a.unregisterDataSetObserver(datasetobserver);
            }
        }

        public b(SpinnerAdapter spinneradapter)
        {
            a = spinneradapter;
            if (spinneradapter instanceof ListAdapter)
            {
                b = (ListAdapter)spinneradapter;
            }
        }
    }

    private class c extends ListPopupWindow
        implements d
    {

        final android.support.v7.internal.widget.d b;
        private CharSequence c;
        private ListAdapter d;

        static ListAdapter a(c c1)
        {
            return c1.d;
        }

        public void a(ListAdapter listadapter)
        {
            super.a(listadapter);
            d = listadapter;
        }

        public void a(CharSequence charsequence)
        {
            c = charsequence;
        }

        public void c()
        {
            int k = b.getPaddingLeft();
            Drawable drawable;
            int j;
            if (b.E == -2)
            {
                int i = b.getWidth();
                int l = b.getPaddingRight();
                e(Math.max(b.a((SpinnerAdapter)d, a()), i - k - l));
            } else
            if (b.E == -1)
            {
                e(b.getWidth() - k - b.getPaddingRight());
            } else
            {
                e(b.E);
            }
            drawable = a();
            j = 0;
            if (drawable != null)
            {
                drawable.getPadding(android.support.v7.internal.widget.d.a(b));
                j = -android.support.v7.internal.widget.d.a(b).left;
            }
            b(j + k);
            f(2);
            super.c();
            h().setChoiceMode(1);
            g(b.f());
        }

        public c(Context context, AttributeSet attributeset, int i)
        {
            b = android.support.v7.internal.widget.d.this;
            super(context, attributeset, i);
            a(android.support.v7.internal.widget.d.this);
            a(true);
            a(0);
            a(new c.c(android.support.v7.internal.widget.d.this, new _cls1(this, android.support.v7.internal.widget.d.this)));
        }
    }

    private static interface d
    {

        public abstract void a(ListAdapter listadapter);

        public abstract void a(CharSequence charsequence);

        public abstract void c();

        public abstract void d();

        public abstract boolean f();
    }


    int E;
    private d F;
    private b G;
    private int H;
    private Rect I;

    android.support.v7.internal.widget.d(Context context, AttributeSet attributeset, int i)
    {
        this(context, attributeset, i, -1);
    }

    android.support.v7.internal.widget.d(Context context, AttributeSet attributeset, int i, int j)
    {
        TypedArray typedarray;
        int k;
        super(context, attributeset, i);
        I = new Rect();
        typedarray = context.obtainStyledAttributes(attributeset, android.support.v7.appcompat.R.styleable.Spinner, i, 0);
        k = j;
        if (j == -1)
        {
            k = typedarray.getInt(7, 0);
        }
        k;
        JVM INSTR tableswitch 0 1: default 76
    //                   0 135
    //                   1 151;
           goto _L1 _L2 _L3
_L1:
        H = typedarray.getInt(0, 17);
        F.a(typedarray.getString(6));
        typedarray.recycle();
        if (G != null)
        {
            F.a(G);
            G = null;
        }
        return;
_L2:
        F = new a();
        continue; /* Loop/switch isn't completed */
_L3:
        context = new c(context, attributeset, i);
        E = typedarray.getLayoutDimension(3, -2);
        context.a(typedarray.getDrawable(2));
        i = typedarray.getDimensionPixelOffset(5, 0);
        if (i != 0)
        {
            context.c(i);
        }
        i = typedarray.getDimensionPixelOffset(4, 0);
        if (i != 0)
        {
            context.b(i);
        }
        F = context;
        if (true) goto _L1; else goto _L4
_L4:
    }

    static Rect a(android.support.v7.internal.widget.d d1)
    {
        return d1.I;
    }

    private void c(View view)
    {
        android.view.ViewGroup.LayoutParams layoutparams1 = view.getLayoutParams();
        android.view.ViewGroup.LayoutParams layoutparams = layoutparams1;
        if (layoutparams1 == null)
        {
            layoutparams = generateDefaultLayoutParams();
        }
        addViewInLayout(view, 0, layoutparams);
        view.setSelected(hasFocus());
        int i = ViewGroup.getChildMeasureSpec(b, this.i.top + this.i.bottom, layoutparams.height);
        view.measure(ViewGroup.getChildMeasureSpec(c, this.i.left + this.i.right, layoutparams.width), i);
        i = this.i.top + (getMeasuredHeight() - this.i.bottom - this.i.top - view.getMeasuredHeight()) / 2;
        int j = view.getMeasuredHeight();
        view.layout(0, i, view.getMeasuredWidth() + 0, j + i);
    }

    private View e(int i)
    {
        if (!u)
        {
            View view = j.a(i);
            if (view != null)
            {
                c(view);
                return view;
            }
        }
        View view1 = a.getView(i, null, this);
        c(view1);
        return view1;
    }

    int a(SpinnerAdapter spinneradapter, Drawable drawable)
    {
        if (spinneradapter == null)
        {
            return 0;
        }
        int i1 = android.view.View.MeasureSpec.makeMeasureSpec(0, 0);
        int j1 = android.view.View.MeasureSpec.makeMeasureSpec(0, 0);
        int i = Math.max(0, f());
        int k1 = Math.min(spinneradapter.getCount(), i + 15);
        int j = Math.max(0, i - (15 - (k1 - i)));
        View view = null;
        int k = 0;
        i = 0;
        for (; j < k1; j++)
        {
            int l = spinneradapter.getItemViewType(j);
            if (l != i)
            {
                view = null;
                i = l;
            }
            view = spinneradapter.getView(j, view, this);
            if (view.getLayoutParams() == null)
            {
                view.setLayoutParams(new android.view.ViewGroup.LayoutParams(-2, -2));
            }
            view.measure(i1, j1);
            k = Math.max(k, view.getMeasuredWidth());
        }

        if (drawable != null)
        {
            drawable.getPadding(I);
            return I.left + I.right + k;
        } else
        {
            return k;
        }
    }

    void a(int i, boolean flag)
    {
        View view;
        int j;
        int k;
        i = this.i.left;
        j = getRight() - getLeft() - this.i.left - this.i.right;
        if (u)
        {
            k();
        }
        if (z == 0)
        {
            a();
            return;
        }
        if (v >= 0)
        {
            c(v);
        }
        b();
        removeAllViewsInLayout();
        this.k = x;
        view = e(x);
        k = view.getMeasuredWidth();
        H & 7;
        JVM INSTR lookupswitch 2: default 136
    //                   1: 175
    //                   5: 190;
           goto _L1 _L2 _L3
_L1:
        view.offsetLeftAndRight(i);
        this.j.a();
        invalidate();
        l();
        u = false;
        p = false;
        d(x);
        return;
_L2:
        i = (i + j / 2) - k / 2;
        continue; /* Loop/switch isn't completed */
_L3:
        i = (i + j) - k;
        if (true) goto _L1; else goto _L4
_L4:
    }

    public void a(c.b b1)
    {
        throw new RuntimeException("setOnItemClickListener cannot be used with a spinner.");
    }

    public void a(SpinnerAdapter spinneradapter)
    {
        super.a(spinneradapter);
        if (F != null)
        {
            F.a(new b(spinneradapter));
            return;
        } else
        {
            G = new b(spinneradapter);
            return;
        }
    }

    void b(c.b b1)
    {
        super.a(b1);
    }

    public int getBaseline()
    {
        Object obj;
        byte byte0;
        byte0 = -1;
        obj = null;
        if (getChildCount() <= 0) goto _L2; else goto _L1
_L1:
        View view = getChildAt(0);
_L4:
        int i = byte0;
        if (view != null)
        {
            int j = view.getBaseline();
            i = byte0;
            if (j >= 0)
            {
                i = view.getTop() + j;
            }
        }
        return i;
_L2:
        view = obj;
        if (a != null)
        {
            view = obj;
            if (a.getCount() > 0)
            {
                view = e(0);
                this.j.a(0, view);
                removeAllViewsInLayout();
            }
        }
        if (true) goto _L4; else goto _L3
_L3:
    }

    public void onClick(DialogInterface dialoginterface, int i)
    {
        a(i);
        dialoginterface.dismiss();
    }

    protected void onDetachedFromWindow()
    {
        super.onDetachedFromWindow();
        if (F != null && F.f())
        {
            F.d();
        }
    }

    protected void onLayout(boolean flag, int i, int j, int k, int l)
    {
        super.onLayout(flag, i, j, k, l);
        r = true;
        a(0, false);
        r = false;
    }

    protected void onMeasure(int i, int j)
    {
        super.onMeasure(i, j);
        if (F != null && android.view.View.MeasureSpec.getMode(i) == 0x80000000)
        {
            setMeasuredDimension(Math.min(Math.max(getMeasuredWidth(), a(d(), getBackground())), android.view.View.MeasureSpec.getSize(i)), getMeasuredHeight());
        }
    }

    public boolean performClick()
    {
        boolean flag1 = super.performClick();
        boolean flag = flag1;
        if (!flag1)
        {
            boolean flag2 = true;
            flag = flag2;
            if (!F.f())
            {
                F.c();
                flag = flag2;
            }
        }
        return flag;
    }

    // Unreferenced inner class android/support/v7/internal/widget/d$c$1

/* anonymous class */
    class c._cls1
        implements c.b
    {

        final android.support.v7.internal.widget.d a;
        final c b;

        public void a(android.support.v7.internal.widget.c c1, View view, int i, long l)
        {
            b.b.a(i);
            if (b.b.t != null)
            {
                b.b.a(view, i, c.a(b).getItemId(i));
            }
            b.d();
        }

            
            {
                b = c1;
                a = d1;
                super();
            }
    }

}
