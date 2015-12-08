// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v7.widget;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.support.v4.view.bt;
import android.support.v7.internal.widget.at;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.view.View;
import android.view.ViewTreeObserver;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.PopupWindow;
import android.widget.SpinnerAdapter;

// Referenced classes of package android.support.v7.widget:
//            ListPopupWindow, r, AppCompatSpinner, s, 
//            t

final class q extends ListPopupWindow
{

    CharSequence a;
    final AppCompatSpinner b;
    private ListAdapter n;
    private final Rect o = new Rect();

    public q(AppCompatSpinner appcompatspinner, Context context, AttributeSet attributeset, int i)
    {
        b = appcompatspinner;
        super(context, attributeset, i);
        super.l = appcompatspinner;
        c();
        super.k = 0;
        super.m = new r(this, appcompatspinner);
    }

    static ListAdapter a(q q1)
    {
        return q1.n;
    }

    static boolean a(q q1, View view)
    {
        return bt.x(view) && view.getGlobalVisibleRect(q1.o);
    }

    static void b(q q1)
    {
        q1.ListPopupWindow.b();
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
            drawable.getPadding(AppCompatSpinner.b(b));
            int j;
            int k;
            if (at.a(b))
            {
                i = AppCompatSpinner.b(b).right;
            } else
            {
                i = -AppCompatSpinner.b(b).left;
            }
        } else
        {
            Rect rect = AppCompatSpinner.b(b);
            AppCompatSpinner.b(b).right = 0;
            rect.left = 0;
            i = 0;
        }
        l = b.getPaddingLeft();
        i1 = b.getPaddingRight();
        j1 = b.getWidth();
        if (AppCompatSpinner.c(b) == -2)
        {
            j = AppCompatSpinner.a(b, (SpinnerAdapter)n, super.c.getBackground());
            k = b.getContext().getResources().getDisplayMetrics().widthPixels - AppCompatSpinner.b(b).left - AppCompatSpinner.b(b).right;
            if (j > k)
            {
                j = k;
            }
            a(Math.max(j, j1 - l - i1));
        } else
        if (AppCompatSpinner.c(b) == -1)
        {
            a(j1 - l - i1);
        } else
        {
            a(AppCompatSpinner.c(b));
        }
        if (at.a(b))
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
        e();
        super.b();
        super.d.setChoiceMode(1);
        int i = b.getSelectedItemPosition();
        Object obj = super.d;
        if (super.c.isShowing() && obj != null)
        {
            ListPopupWindow.DropDownListView.a(((ListPopupWindow.DropDownListView) (obj)), false);
            ((ListPopupWindow.DropDownListView) (obj)).setSelection(i);
            if (android.os.Build.VERSION.SDK_INT >= 11 && ((ListPopupWindow.DropDownListView) (obj)).getChoiceMode() != 0)
            {
                ((ListPopupWindow.DropDownListView) (obj)).setItemChecked(i, true);
            }
        }
        if (!flag)
        {
            if ((obj = b.getViewTreeObserver()) != null)
            {
                s s1 = new s(this);
                ((ViewTreeObserver) (obj)).addOnGlobalLayoutListener(s1);
                a(new t(this, s1));
                return;
            }
        }
    }
}
