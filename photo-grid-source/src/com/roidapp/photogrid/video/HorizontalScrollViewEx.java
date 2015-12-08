// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.roidapp.photogrid.video;

import android.content.Context;
import android.util.AttributeSet;
import android.util.SparseArray;
import android.view.MotionEvent;
import android.view.View;
import android.widget.BaseAdapter;
import android.widget.HorizontalScrollView;
import android.widget.LinearLayout;
import com.roidapp.photogrid.release.hr;
import com.roidapp.photogrid.release.hs;

// Referenced classes of package com.roidapp.photogrid.video:
//            d

public class HorizontalScrollViewEx extends HorizontalScrollView
    implements android.view.View.OnClickListener, d
{

    boolean a;
    private LinearLayout b;
    private BaseAdapter c;
    private android.widget.AdapterView.OnItemClickListener d;
    private SparseArray e;
    private hr f;
    private boolean g;
    private boolean h;
    private hs i;

    public HorizontalScrollViewEx(Context context)
    {
        super(context);
        b = null;
        c = null;
        d = null;
        e = null;
        g = true;
        h = true;
        i = null;
        a = false;
        c();
    }

    public HorizontalScrollViewEx(Context context, AttributeSet attributeset)
    {
        super(context, attributeset);
        b = null;
        c = null;
        d = null;
        e = null;
        g = true;
        h = true;
        i = null;
        a = false;
        c();
    }

    public HorizontalScrollViewEx(Context context, AttributeSet attributeset, int j)
    {
        super(context, attributeset, j);
        b = null;
        c = null;
        d = null;
        e = null;
        g = true;
        h = true;
        i = null;
        a = false;
        c();
    }

    private void c()
    {
        if (b == null)
        {
            b = new LinearLayout(getContext());
            b.setOrientation(0);
        }
        addView(b, new android.widget.LinearLayout.LayoutParams(-1, -1));
    }

    public final View a(int j)
    {
        if (e == null)
        {
            return null;
        } else
        {
            return (View)e.get(j);
        }
    }

    public final LinearLayout a()
    {
        return b;
    }

    public final void a(android.widget.AdapterView.OnItemClickListener onitemclicklistener)
    {
        d = onitemclicklistener;
    }

    public final void a(BaseAdapter baseadapter)
    {
        c = baseadapter;
        b.removeAllViews();
        if (e != null)
        {
            e.clear();
            e = null;
        }
        e = new SparseArray();
        if (c != null)
        {
            for (int j = 0; j < c.getCount(); j++)
            {
                baseadapter = c.getView(j, null, null);
                if (baseadapter != null)
                {
                    baseadapter.setOnClickListener(this);
                    e.put(j, baseadapter);
                    b.addView(baseadapter);
                }
            }

        }
    }

    public final void a(hr hr1)
    {
        f = hr1;
    }

    public final void a(hs hs1)
    {
        i = hs1;
    }

    public final void a(boolean flag)
    {
        g = flag;
    }

    public final void b()
    {
        if (b != null)
        {
            b.removeAllViews();
            b = null;
        }
        if (e != null)
        {
            e.clear();
            e = null;
        }
    }

    public final void b(int j)
    {
        a = false;
        super.scrollTo(j, 0);
    }

    public void fling(int j)
    {
        a = true;
        super.fling(j);
    }

    public boolean isClickable()
    {
        return h;
    }

    public void onClick(View view)
    {
        if (e == null || d == null || !isClickable())
        {
            return;
        } else
        {
            a = false;
            d.onItemClick(null, view, e.indexOfValue(view), view.getId());
            return;
        }
    }

    protected void onLayout(boolean flag, int j, int k, int l, int i1)
    {
        super.onLayout(flag, j, k, l, i1);
        if (f != null)
        {
            f.a();
        }
    }

    protected void onScrollChanged(int j, int k, int l, int i1)
    {
        super.onScrollChanged(j, k, l, i1);
        if (i != null && a && j != l)
        {
            i.a(j);
        }
    }

    public boolean onTouchEvent(MotionEvent motionevent)
    {
        a = true;
        motionevent.getAction();
        JVM INSTR tableswitch 1 1: default 28
    //                   1 34;
           goto _L1 _L2
_L1:
        return super.onTouchEvent(motionevent);
_L2:
        a = false;
        if (true) goto _L1; else goto _L3
_L3:
    }

    public void setClickable(boolean flag)
    {
        h = flag;
    }
}
