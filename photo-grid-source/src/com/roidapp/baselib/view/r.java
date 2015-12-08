// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.roidapp.baselib.view;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Rect;
import android.view.View;
import android.view.ViewTreeObserver;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.PopupWindow;
import com.roidapp.baselib.c;
import com.roidapp.baselib.c.n;
import com.roidapp.baselib.d;
import com.roidapp.baselib.e;

// Referenced classes of package com.roidapp.baselib.view:
//            t, s, u

public final class r
    implements android.widget.AdapterView.OnItemClickListener
{

    private t a;
    private PopupWindow b;
    private u c;
    private android.widget.PopupWindow.OnDismissListener d;
    private Context e;
    private String f[];
    private int g;
    private int h;
    private int i;
    private int j;
    private int k;

    public r(Context context, String as[])
    {
        this(context, as, 0);
    }

    public r(Context context, String as[], int l)
    {
        this(context, as, l, 0);
    }

    public r(Context context, String as[], int l, int i1)
    {
        g = -1;
        e = context;
        if (as == null || as.length <= 0)
        {
            throw new IllegalArgumentException("MenuArray must more than 0");
        } else
        {
            f = as;
            h = l;
            k = i1;
            return;
        }
    }

    static PopupWindow a(r r1)
    {
        return r1.b;
    }

    public final void a(View view, int l)
    {
        a(view, l, 0, 0);
    }

    public final void a(View view, int l, int i1, int j1)
    {
        if (b == null)
        {
            i = e.getResources().getDimensionPixelSize(d.a);
            ListView listview = new ListView(e);
            listview.setLayoutParams(new android.view.ViewGroup.LayoutParams(-1, -2));
            listview.setVerticalScrollBarEnabled(false);
            listview.setFastScrollEnabled(false);
            listview.setCacheColorHint(0);
            b = new PopupWindow(listview, i, -2, true);
            n.a(b);
            b.setOutsideTouchable(true);
            b.setTouchable(true);
            b.setFocusable(true);
            b.setClippingEnabled(false);
            if (d != null)
            {
                b.setOnDismissListener(d);
            }
            String as[];
            int j2;
            if (h == 0)
            {
                b.setBackgroundDrawable(e.getResources().getDrawable(e.bf));
                listview.setDivider(e.getResources().getDrawable(c.a));
            } else
            {
                b.setBackgroundDrawable(e.getResources().getDrawable(e.be));
                listview.setDivider(e.getResources().getDrawable(c.b));
            }
            if (a == null)
            {
                a = new t(e, h);
            }
            as = f;
            j2 = as.length;
            for (int k1 = 0; k1 < j2; k1++)
            {
                String s1 = as[k1];
                a.a(s1);
            }

            listview.setDividerHeight(2);
            listview.setAdapter(a);
            listview.setOnItemClickListener(this);
            listview.measure(android.view.View.MeasureSpec.makeMeasureSpec(0, 0), android.view.View.MeasureSpec.makeMeasureSpec(0, 0));
            int l1 = a.getCount();
            j2 = listview.getDividerHeight();
            j = l1 * (listview.getMeasuredHeight() + j2);
            b = b;
        }
        if (view == null) goto _L2; else goto _L1
_L1:
        Rect rect1;
        int i2;
        int k2;
        int j3;
        i2 = view.getWidth();
        j3 = view.getHeight();
        Rect rect = new Rect();
        rect1 = new Rect();
        view.getGlobalVisibleRect(rect);
        view.getWindowVisibleDisplayFrame(rect1);
        k2 = rect.bottom;
        int l2 = rect.left;
        int k3 = rect.bottom - rect.top;
        if (rect.top < j * 2)
        {
            k = 0;
        }
        if (k == 0 && k3 < j3)
        {
            k2 += j3 - k3;
        }
        for (; l2 + i1 + i > rect1.right; i1 -= i2 / 4) { }
        i2 = j1;
        if (k != 1) goto _L4; else goto _L3
_L3:
        int i3;
        View view1 = b.getContentView();
        i3 = j1;
        if (view1 != null)
        {
            view1.getViewTreeObserver().addOnGlobalLayoutListener(new s(this, j3, view1, view, i1));
            i3 = j1;
        }
_L6:
        b.showAsDropDown(view, i1, i3);
_L2:
        g = l;
        return;
_L4:
        do
        {
            i3 = i2;
            if (k2 + i2 + j <= rect1.bottom)
            {
                continue;
            }
            i2 -= j3 / 4;
        } while (true);
        if (true) goto _L6; else goto _L5
_L5:
    }

    public final void a(android.widget.PopupWindow.OnDismissListener ondismisslistener)
    {
        d = ondismisslistener;
    }

    public final void a(t t1)
    {
        a = t1;
    }

    public final void a(u u1)
    {
        c = u1;
    }

    public final void onItemClick(AdapterView adapterview, View view, int l, long l1)
    {
        if (c != null)
        {
            c.b(l, g);
        }
        if (b != null && b.isShowing())
        {
            b.dismiss();
        }
    }
}
