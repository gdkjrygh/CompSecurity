// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.orca.threadview;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import com.facebook.orca.threads.ThreadSummary;
import com.facebook.widget.titlebar.a;

// Referenced classes of package com.facebook.orca.threadview:
//            ay, ThreadTitleView, v

public class dn
{

    private final Context a;
    private final com.facebook.orca.common.ui.widgets.text.a b;
    private ThreadTitleView c;
    private ay d;
    private a e;

    public dn(Context context, com.facebook.orca.common.ui.widgets.text.a a1)
    {
        a = context;
        b = a1;
    }

    private int a(ViewGroup viewgroup, View view)
    {
        return viewgroup.indexOfChild(view) + 1;
    }

    private void a(ViewGroup viewgroup, int i)
    {
        if (viewgroup.getChildCount() > i && (viewgroup.getChildAt(i) instanceof ay))
        {
            viewgroup.removeViewAt(i);
        }
    }

    public void a()
    {
        if (e != null && !e.a())
        {
            View view = (View)e;
            ViewGroup viewgroup = (ViewGroup)view.getParent();
            a(viewgroup, a(viewgroup, view));
        }
    }

    public void a(ThreadSummary threadsummary)
    {
        a(b.a(threadsummary));
    }

    public void a(v v)
    {
        if (c != null)
        {
            c.setThreadNameViewData(v);
        } else
        if (d != null)
        {
            d.setThreadNameViewData(v);
            return;
        }
    }

    public void a(a a1)
    {
        e = a1;
        if (a1.a())
        {
            c = new ThreadTitleView(a);
            a1.setCustomTitleView(c);
            return;
        } else
        {
            Object obj = new android.widget.LinearLayout.LayoutParams(-1, -2);
            d = new ay(a);
            d.setLayoutParams(((android.view.ViewGroup.LayoutParams) (obj)));
            a1 = (View)a1;
            obj = (ViewGroup)a1.getParent();
            int i = a(((ViewGroup) (obj)), ((View) (a1)));
            a(((ViewGroup) (obj)), i);
            ((ViewGroup) (obj)).addView(d, i);
            return;
        }
    }

    public void a(boolean flag)
    {
        if (e != null && e.a())
        {
            c.a(flag);
        }
    }
}
