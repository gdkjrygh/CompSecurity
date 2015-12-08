// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v7.widget;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.support.v4.view.x;
import android.support.v7.internal.widget.r;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.view.View;
import android.view.ViewTreeObserver;
import android.widget.AdapterView;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.SpinnerAdapter;

// Referenced classes of package android.support.v7.widget:
//            j, AppCompatSpinner

private final class k extends j
{

    final AppCompatSpinner a;
    private CharSequence c;
    private ListAdapter d;
    private final Rect e = new Rect();

    static ListAdapter a(k k)
    {
        return k.d;
    }

    static boolean a(d d1, View view)
    {
        return x.G(view) && view.getGlobalVisibleRect(d1.e);
    }

    static void b(e e1)
    {
        e1.super.c();
    }

    public final CharSequence a()
    {
        return c;
    }

    public final void a(ListAdapter listadapter)
    {
        super.a(listadapter);
        d = listadapter;
    }

    public final void a(CharSequence charsequence)
    {
        c = charsequence;
    }

    final void b()
    {
        Drawable drawable = f();
        int i = 0;
        int j1;
        int k1;
        int l1;
        if (drawable != null)
        {
            drawable.getPadding(AppCompatSpinner.b(a));
            int k;
            int l;
            int i1;
            if (r.a(a))
            {
                i = AppCompatSpinner.b(a).right;
            } else
            {
                i = -AppCompatSpinner.b(a).left;
            }
        } else
        {
            Rect rect = AppCompatSpinner.b(a);
            AppCompatSpinner.b(a).right = 0;
            rect.left = 0;
        }
        j1 = a.getPaddingLeft();
        k1 = a.getPaddingRight();
        l1 = a.getWidth();
        if (AppCompatSpinner.c(a) == -2)
        {
            l = AppCompatSpinner.a(a, (SpinnerAdapter)d, f());
            i1 = a.getContext().getResources().getDisplayMetrics().widthPixels - AppCompatSpinner.b(a).left - AppCompatSpinner.b(a).right;
            k = l;
            if (l > i1)
            {
                k = i1;
            }
            d(Math.max(k, l1 - j1 - k1));
        } else
        if (AppCompatSpinner.c(a) == -1)
        {
            d(l1 - j1 - k1);
        } else
        {
            d(AppCompatSpinner.c(a));
        }
        if (r.a(a))
        {
            i += l1 - k1 - j();
        } else
        {
            i += j1;
        }
        a(i);
    }

    public final void c()
    {
        boolean flag = n();
        b();
        l();
        super.c();
        p().setChoiceMode(1);
        e(a.getSelectedItemPosition());
        ViewTreeObserver viewtreeobserver;
        if (!flag)
        {
            if ((viewtreeobserver = a.getViewTreeObserver()) != null)
            {
                android.view.GlobalLayoutListener globallayoutlistener = new android.view.ViewTreeObserver.OnGlobalLayoutListener() {

                    final AppCompatSpinner.b a;

                    public final void onGlobalLayout()
                    {
                        if (!AppCompatSpinner.b.a(a, a.a))
                        {
                            a.k();
                            return;
                        } else
                        {
                            a.b();
                            AppCompatSpinner.b.b(a);
                            return;
                        }
                    }

            
            {
                a = AppCompatSpinner.b.this;
                super();
            }
                };
                viewtreeobserver.addOnGlobalLayoutListener(globallayoutlistener);
                a(new android.widget.PopupWindow.OnDismissListener(globallayoutlistener) {

                    final android.view.ViewTreeObserver.OnGlobalLayoutListener a;
                    final AppCompatSpinner.b b;

                    public final void onDismiss()
                    {
                        ViewTreeObserver viewtreeobserver1 = b.a.getViewTreeObserver();
                        if (viewtreeobserver1 != null)
                        {
                            viewtreeobserver1.removeGlobalOnLayoutListener(a);
                        }
                    }

            
            {
                b = AppCompatSpinner.b.this;
                a = ongloballayoutlistener;
                super();
            }
                });
                return;
            }
        }
    }

    public r(AppCompatSpinner appcompatspinner, Context context, AttributeSet attributeset, int i)
    {
        a = appcompatspinner;
        super(context, attributeset, i);
        a(appcompatspinner);
        e();
        d();
        a(new android.widget.AdapterView.OnItemClickListener(appcompatspinner) {

            final AppCompatSpinner a;
            final AppCompatSpinner.b b;

            public final void onItemClick(AdapterView adapterview, View view, int k, long l)
            {
                b.a.setSelection(k);
                if (b.a.getOnItemClickListener() != null)
                {
                    b.a.performItemClick(view, k, AppCompatSpinner.b.a(b).getItemId(k));
                }
                b.k();
            }

            
            {
                b = AppCompatSpinner.b.this;
                a = appcompatspinner;
                super();
            }
        });
    }
}
