// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v7.widget;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.support.v4.view.bq;
import android.support.v7.internal.widget.aq;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.view.View;
import android.view.ViewTreeObserver;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.SpinnerAdapter;

// Referenced classes of package android.support.v7.widget:
//            ac, v, r, w, 
//            x

class u extends ac
{

    final r a;
    private CharSequence c;
    private ListAdapter d;
    private final Rect e = new Rect();

    public u(r r1, Context context, AttributeSet attributeset, int i)
    {
        a = r1;
        super(context, attributeset, i);
        a(r1);
        a(true);
        a(0);
        a(new v(this, r1));
    }

    static ListAdapter a(u u1)
    {
        return u1.d;
    }

    static boolean a(u u1, View view)
    {
        return u1.b(view);
    }

    static void b(u u1)
    {
        u1.ac.c();
    }

    private boolean b(View view)
    {
        return bq.q(view) && view.getGlobalVisibleRect(e);
    }

    public CharSequence a()
    {
        return c;
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

    void b()
    {
        Drawable drawable = d();
        int i;
        int l;
        int i1;
        int j1;
        if (drawable != null)
        {
            drawable.getPadding(r.b(a));
            int j;
            int k;
            if (aq.a(a))
            {
                i = r.b(a).right;
            } else
            {
                i = -r.b(a).left;
            }
        } else
        {
            Rect rect = r.b(a);
            r.b(a).right = 0;
            rect.left = 0;
            i = 0;
        }
        l = a.getPaddingLeft();
        i1 = a.getPaddingRight();
        j1 = a.getWidth();
        if (r.c(a) == -2)
        {
            j = r.a(a, (SpinnerAdapter)d, d());
            k = a.getContext().getResources().getDisplayMetrics().widthPixels - r.b(a).left - r.b(a).right;
            if (j > k)
            {
                j = k;
            }
            f(Math.max(j, j1 - l - i1));
        } else
        if (r.c(a) == -1)
        {
            f(j1 - l - i1);
        } else
        {
            f(r.c(a));
        }
        if (aq.a(a))
        {
            i = (j1 - i1 - h()) + i;
        } else
        {
            i += l;
        }
        b(i);
    }

    public void c()
    {
        boolean flag = k();
        b();
        g(2);
        super.c();
        m().setChoiceMode(1);
        h(a.getSelectedItemPosition());
        ViewTreeObserver viewtreeobserver;
        if (!flag)
        {
            if ((viewtreeobserver = a.getViewTreeObserver()) != null)
            {
                w w1 = new w(this);
                viewtreeobserver.addOnGlobalLayoutListener(w1);
                a(new x(this, w1));
                return;
            }
        }
    }
}
