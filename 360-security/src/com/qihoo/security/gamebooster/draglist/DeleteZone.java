// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.qihoo.security.gamebooster.draglist;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;

// Referenced classes of package com.qihoo.security.gamebooster.draglist:
//            DragListAdapter

public class DeleteZone extends LinearLayout
{

    private int a;
    private DragListAdapter b;

    public DeleteZone(Context context, AttributeSet attributeset)
    {
        super(context, attributeset);
        a = -1;
    }

    private int a(float f)
    {
        int i = getChildCount();
        return Math.max(Math.min((int)(f / (float)(getMeasuredWidth() / i)), 1), 0);
    }

    private boolean b(float f)
    {
        return f < (float)getMeasuredHeight();
    }

    public void a()
    {
        for (int i = 0; i < getChildCount(); i++)
        {
            getChildAt(i).setPressed(false);
        }

        setVisibility(0);
    }

    public void a(View view, float f, float f1)
    {
        if (!b(f1)) goto _L2; else goto _L1
_L1:
        View view1 = getChildAt(a(f));
        if (view1 != null) goto _L4; else goto _L3
_L3:
        return;
_L4:
        view1.setPressed(true);
_L2:
        boolean flag;
        flag = b(f1);
        if (a != -1)
        {
            break; /* Loop/switch isn't completed */
        }
        if (flag)
        {
            int i = a(f);
            if (i != -1)
            {
                a = i;
                View view2 = getChildAt(i);
                if (view2 != null)
                {
                    view2.setPressed(true);
                    if (b != null)
                    {
                        b.a(DragListAdapter.DragState.In, view);
                        return;
                    }
                }
            }
        }
        if (true) goto _L3; else goto _L5
_L5:
        if (flag)
        {
            int j = a(f);
            if (j != a)
            {
                getChildAt(a).setPressed(false);
                if (b != null)
                {
                    b.a(DragListAdapter.DragState.Out, view);
                }
                a = j;
                getChildAt(a).setPressed(true);
                if (b != null)
                {
                    b.a(DragListAdapter.DragState.In, view);
                    return;
                }
            }
        } else
        {
            getChildAt(a).setPressed(false);
            if (b != null)
            {
                b.a(DragListAdapter.DragState.Out, view);
            }
            a = -1;
            return;
        }
        if (true) goto _L3; else goto _L6
_L6:
    }

    public int b(View view, float f, float f1)
    {
        if (b(f1))
        {
            return a(f);
        } else
        {
            a = -1;
            setVisibility(8);
            return -1;
        }
    }

    public DragListAdapter getAdapter()
    {
        return b;
    }

    public void setAdapter(DragListAdapter draglistadapter)
    {
        b = draglistadapter;
    }
}
