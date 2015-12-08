// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v7.internal.widget;

import android.content.Context;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.SpinnerAdapter;

// Referenced classes of package android.support.v7.internal.widget:
//            ListPopupWindow, d, c

private class d extends ListPopupWindow
    implements PopupWindow
{

    final d b;
    private CharSequence c;
    private ListAdapter d;

    static ListAdapter a(PopupWindow popupwindow)
    {
        return popupwindow.d;
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

    public ner(d d1, Context context, AttributeSet attributeset, int i)
    {
        b = d1;
        super(context, attributeset, i);
        a(d1);
        a(true);
        a(0);
        a(new <init>(d1, new c.b(d1) {

            final d a;
            final d.c b;

            public void a(c c1, View view, int j, long l)
            {
                b.b.a(j);
                if (b.b.t != null)
                {
                    b.b.a(view, j, d.c.a(b).getItemId(j));
                }
                b.d();
            }

            
            {
                b = d.c.this;
                a = d1;
                super();
            }
        }));
    }
}
