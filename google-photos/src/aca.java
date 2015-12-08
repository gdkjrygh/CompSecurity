// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.view.View;
import android.view.ViewTreeObserver;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.PopupWindow;
import android.widget.SpinnerAdapter;

final class aca extends adq
{

    CharSequence a;
    final abx b;
    private ListAdapter n;
    private final Rect o = new Rect();

    public aca(abx abx1, Context context, AttributeSet attributeset, int i)
    {
        b = abx1;
        super(context, attributeset, i);
        super.l = abx1;
        a(true);
        super.k = 0;
        super.m = new acb(this, abx1);
    }

    static ListAdapter a(aca aca1)
    {
        return aca1.n;
    }

    static boolean a(aca aca1, View view)
    {
        return mk.A(view) && view.getGlobalVisibleRect(aca1.o);
    }

    static void b(aca aca1)
    {
        aca1.adq.b();
    }

    final void a()
    {
        Drawable drawable = super.c.getBackground();
        int i;
        int l;
        int i1;
        int j1;
        if (drawable != null)
        {
            drawable.getPadding(abx.b(b));
            int j;
            int k;
            if (yo.a(b))
            {
                i = abx.b(b).right;
            } else
            {
                i = -abx.b(b).left;
            }
        } else
        {
            Rect rect = abx.b(b);
            abx.b(b).right = 0;
            rect.left = 0;
            i = 0;
        }
        l = b.getPaddingLeft();
        i1 = b.getPaddingRight();
        j1 = b.getWidth();
        if (abx.c(b) == -2)
        {
            j = abx.a(b, (SpinnerAdapter)n, super.c.getBackground());
            k = b.getContext().getResources().getDisplayMetrics().widthPixels - abx.b(b).left - abx.b(b).right;
            if (j > k)
            {
                j = k;
            }
            a(Math.max(j, j1 - l - i1));
        } else
        if (abx.c(b) == -1)
        {
            a(j1 - l - i1);
        } else
        {
            a(abx.c(b));
        }
        if (yo.a(b))
        {
            i = (j1 - i1 - super.e) + i;
        } else
        {
            i += l;
        }
        super.f = i;
    }

    public final void a(ListAdapter listadapter)
    {
        super.a(listadapter);
        n = listadapter;
    }

    public final void b()
    {
        boolean flag = super.c.isShowing();
        a();
        b(2);
        super.b();
        super.d.setChoiceMode(1);
        int i = b.getSelectedItemPosition();
        Object obj = super.d;
        if (super.c.isShowing() && obj != null)
        {
            adt.a(((adt) (obj)), false);
            ((adt) (obj)).setSelection(i);
            if (android.os.Build.VERSION.SDK_INT >= 11 && ((adt) (obj)).getChoiceMode() != 0)
            {
                ((adt) (obj)).setItemChecked(i, true);
            }
        }
        if (!flag)
        {
            if ((obj = b.getViewTreeObserver()) != null)
            {
                acc acc1 = new acc(this);
                ((ViewTreeObserver) (obj)).addOnGlobalLayoutListener(acc1);
                a(new acd(this, acc1));
                return;
            }
        }
    }
}
