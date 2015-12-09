// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.jcp.views;

import android.content.Context;
import android.graphics.Color;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.ImageView;
import android.widget.TextView;
import com.jcp.b.b;
import com.jcp.g.a;
import com.jcp.pojo.Accordion;
import com.jcp.util.ae;
import com.squareup.a.ak;
import com.squareup.a.ba;
import java.util.Stack;

// Referenced classes of package com.jcp.views:
//            DataListView, ag, k, HtmlTypefaceTextView, 
//            l

final class j extends ViewGroup
{

    final DataListView a;
    private final Stack b = new Stack();
    private int c;

    public j(DataListView datalistview, Context context)
    {
        a = datalistview;
        super(context);
        c = -1;
    }

    private float a(int i, int i1, float f)
    {
        if (i > i1)
        {
            return f;
        }
        if (i > 0)
        {
            return f + (1.0F - f) * ((float)(i1 - i) / (float)i1);
        } else
        {
            return 1.0F;
        }
    }

    private int a(float f)
    {
        return Color.argb(Math.max(0, Math.round(150F - (150F / DataListView.l(a)) * (f - DataListView.l(a)))), 0, 0, 0);
    }

    static int a(j j1, int i)
    {
        j1.c = i;
        return i;
    }

    private View a(int i)
    {
        if (i < DataListView.j(a) - 1)
        {
            Accordion accordion = DataListView.f(a)[i];
            Object obj = null;
            if (!b.isEmpty())
            {
                obj = (View)b.pop();
            }
            Object obj1;
            ViewTreeObserver viewtreeobserver;
            if (obj == null || ((View) (obj)).getTag() != null)
            {
                obj = new ag();
                obj1 = DataListView.n(a).inflate(0x7f030068, this, false);
                ((ag) (obj)).b(((View) (obj1)), Integer.valueOf(0x7f0e026e));
                ((ag) (obj)).b(((View) (obj1)), Integer.valueOf(0x7f0e0271));
                ((ag) (obj)).b(((View) (obj1)), Integer.valueOf(0x7f0e026f));
                ((ag) (obj)).b(((View) (obj1)), Integer.valueOf(0x7f0e0270));
                DataListView.o(a);
                ((View) (obj1)).setTag(obj);
            } else
            {
                ag ag1 = (ag)((View) (obj)).getTag();
                obj1 = obj;
                obj = ag1;
            }
            viewtreeobserver = ((ImageView)((ag) (obj)).a(Integer.valueOf(0x7f0e026e))).getViewTreeObserver();
            if (viewtreeobserver.isAlive() && DataListView.p(a) == 0)
            {
                viewtreeobserver.addOnGlobalLayoutListener(new k(this, ((ag) (obj))));
            }
            if (!TextUtils.isEmpty(DataListView.f(a)[i].getUrl()))
            {
                if (DataListView.p(a) <= 0 && DataListView.q(a) <= 0)
                {
                    com.jcp.g.a.a().a(accordion.getUrl().concat(b.g)).a((ImageView)((ag) (obj)).a(Integer.valueOf(0x7f0e026e)));
                } else
                {
                    com.jcp.g.a.a().a(accordion.getUrl().concat(b.g)).a(DataListView.p(a), DataListView.q(a)).a((ImageView)((ag) (obj)).a(Integer.valueOf(0x7f0e026e)));
                }
            }
            a((HtmlTypefaceTextView)((ag) (obj)).a(Integer.valueOf(0x7f0e026f)), (TextView)((ag) (obj)).a(Integer.valueOf(0x7f0e0270)), accordion);
            ((View) (obj1)).setOnClickListener(new l(this, accordion));
            return ((View) (obj1));
        } else
        {
            return DataListView.r(a);
        }
    }

    private void a()
    {
        if (DataListView.h(a) > 0)
        {
            c();
            b();
        }
    }

    private void a(HtmlTypefaceTextView htmltypefacetextview, TextView textview, Accordion accordion)
    {
        if (!TextUtils.isEmpty(accordion.getTitleText()))
        {
            htmltypefacetextview.setHtmlText(accordion.getTitleText().replaceAll("\\{", "<b>").replaceAll("\\}", "</b>"));
        }
        if (!TextUtils.isEmpty(accordion.getSubTitleText()))
        {
            textview.setText(accordion.getSubTitleText());
        }
    }

    static void a(j j1)
    {
        j1.a();
    }

    private void b()
    {
        int i = -1;
        int i1 = 0;
        while (i1 < getChildCount()) 
        {
            int j1 = c + i1;
            int l1 = getMeasuredWidth();
            View view = getChildAt(i1);
            if (i < 0)
            {
                i = DataListView.g(a) * j1;
            }
            if (j1 < DataListView.j(a) - 1)
            {
                float f = a(i - DataListView.k(a), DataListView.g(a), DataListView.l(a));
                int k1 = i + Math.round((float)DataListView.g(a) * f);
                ((ag)view.getTag()).a(Integer.valueOf(0x7f0e0271)).setBackgroundColor(a(f));
                view.measure(android.view.View.MeasureSpec.makeMeasureSpec(l1, 0x40000000), android.view.View.MeasureSpec.makeMeasureSpec(DataListView.g(a), 0x40000000));
                view.layout(0, i, l1, k1);
                i = k1;
            } else
            {
                float f1 = a(i - DataListView.k(a) - DataListView.g(a), DataListView.i(a), DataListView.l(a));
                view.findViewById(0x7f0e0271).setBackgroundColor(a(f1));
                view.measure(android.view.View.MeasureSpec.makeMeasureSpec(l1, 0x40000000), android.view.View.MeasureSpec.makeMeasureSpec(DataListView.i(a), 0x40000000));
                view.layout(0, i, l1, DataListView.i(a) + i);
            }
            i1++;
        }
    }

    private void c()
    {
        int i;
        int j1;
        int j2;
        int k2;
        j2 = DataListView.k(a);
        k2 = DataListView.h(a);
        if (getChildCount() == 0)
        {
            c = DataListView.k(a) / DataListView.g(a);
            View view = a(c);
            if (view != null)
            {
                addView(view);
            }
        }
        i = c * DataListView.g(a);
        j1 = DataListView.g(a);
        j1 = DataListView.m(a) * (getChildCount() - 1) + (j1 + i);
_L2:
        View view1;
        if (i <= DataListView.k(a) || c <= 0)
        {
            break; /* Loop/switch isn't completed */
        }
        c = c - 1;
        view1 = a(c);
        if (view1 == null)
        {
            continue; /* Loop/switch isn't completed */
        }
        android.view.ViewParent viewparent = view1.getParent();
        if (viewparent != null && (viewparent instanceof ViewGroup))
        {
            ((ViewGroup)viewparent).removeView(view1);
        }
        int l1;
        addView(view1, 0);
        l1 = DataListView.m(a);
        i -= l1;
        continue; /* Loop/switch isn't completed */
        Exception exception;
        exception;
        ae.d(com.jcp.views.DataListView.a(), (new StringBuilder()).append("Exception while adding view: ").append(exception.getMessage()).toString());
        if (true) goto _L2; else goto _L1
_L1:
        int i2 = (c + getChildCount()) - 1;
        int i1 = j1;
        for (int k1 = i2; i1 < j2 + k2 && k1 < DataListView.j(a) - 1; i1 = DataListView.m(a) + i1)
        {
            k1++;
            View view2 = a(k1);
            if (view2 == null)
            {
                continue;
            }
            android.view.ViewParent viewparent1 = view2.getParent();
            if (viewparent1 != null && (viewparent1 instanceof ViewGroup))
            {
                ((ViewGroup)viewparent1).removeView(view2);
            }
            addView(view2);
        }

        return;
    }

    protected void onLayout(boolean flag, int i, int i1, int j1, int k1)
    {
        b();
    }

    protected void onMeasure(int i, int i1)
    {
        i1 = 0;
        if (DataListView.f(a) != null)
        {
            i1 = DataListView.f(a).length * DataListView.g(a);
        }
        int j1 = i1;
        if (i1 > DataListView.h(a))
        {
            j1 = i1 + DataListView.i(a);
        }
        setMeasuredDimension(android.view.View.MeasureSpec.getSize(i), j1);
    }
}
