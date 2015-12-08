// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.graphics.Rect;
import android.support.v7.widget.RecyclerView;
import android.view.View;

public final class zm
{

    final Zz a;
    final Zu b;
    private final Zr c;

    public zm(Zr zr, Zu zu, Zz zz)
    {
        c = zr;
        b = zu;
        a = zz;
    }

    static int a(RecyclerView recyclerview)
    {
        if (recyclerview.e.r())
        {
            return recyclerview.getPaddingTop();
        } else
        {
            return 0;
        }
    }

    static int b(RecyclerView recyclerview)
    {
        if (recyclerview.e.r())
        {
            return recyclerview.getPaddingLeft();
        } else
        {
            return 0;
        }
    }

    private boolean b(int i)
    {
        return i < 0 || i >= c.b();
    }

    final View a(RecyclerView recyclerview, View view)
    {
        int j = 0;
_L9:
        if (j >= recyclerview.getChildCount()) goto _L2; else goto _L1
_L1:
        View view1;
        android.support.v7.widget.RecyclerView.LayoutParams layoutparams;
        Rect rect;
        int i;
        view1 = recyclerview.getChildAt(j);
        i = a.a(recyclerview);
        layoutparams = (android.support.v7.widget.RecyclerView.LayoutParams)view1.getLayoutParams();
        rect = Zw.a(view);
        if (i != 1) goto _L4; else goto _L3
_L3:
        if (view1.getTop() - layoutparams.topMargin <= view.getBottom() + rect.bottom + rect.top) goto _L6; else goto _L5
_L5:
        boolean flag = false;
_L8:
        if (!flag)
        {
            return view1;
        }
        continue; /* Loop/switch isn't completed */
_L4:
        if (view1.getLeft() - layoutparams.leftMargin > view.getRight() + rect.right + rect.left)
        {
            flag = false;
            continue; /* Loop/switch isn't completed */
        }
_L6:
        flag = true;
        if (true) goto _L8; else goto _L7
_L7:
        j++;
          goto _L9
_L2:
        return null;
    }

    public final boolean a(int i)
    {
        if (!b(i)) goto _L2; else goto _L1
_L1:
        return false;
_L2:
        int j = 0;
_L5:
        if (j >= c.b())
        {
            break MISSING_BLOCK_LABEL_54;
        }
        if (c.f(j) < 0L) goto _L4; else goto _L3
_L3:
        if (j == i)
        {
            return true;
        }
        continue; /* Loop/switch isn't completed */
_L4:
        j++;
          goto _L5
        j = -1;
          goto _L3
        if (c.f(i) < 0L || b(i) || c.f(i) == c.f(i - 1)) goto _L1; else goto _L6
_L6:
        return true;
    }
}
