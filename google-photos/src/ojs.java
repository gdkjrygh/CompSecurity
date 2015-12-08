// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.widget.AbsListView;
import com.google.android.libraries.social.ui.views.expandingscrollview.ExpandingScrollView;

public final class ojs
{

    public final int a;
    public final int b;
    public final ExpandingScrollView c;
    public final ojg d;
    public final ojg e;
    public int f;
    public float g;
    public float h;
    public float i;
    public float j;
    public float k;
    public boolean l;

    public ojs(ExpandingScrollView expandingscrollview, ojw ojw, ojw ojw1)
    {
        f = ojt.a;
        k = -1F;
        c = expandingscrollview;
        d = new ojg(ojw);
        e = new ojg(ojw1);
        expandingscrollview = ViewConfiguration.get(expandingscrollview.getContext());
        a = expandingscrollview.getScaledTouchSlop();
        b = expandingscrollview.getScaledPagingTouchSlop();
    }

    public static boolean a(View view, int i1, int j1)
    {
        if (view instanceof ViewGroup)
        {
            ViewGroup viewgroup = (ViewGroup)view;
            int l1 = view.getScrollX();
            int i2 = view.getScrollY();
            for (int k1 = viewgroup.getChildCount() - 1; k1 >= 0; k1--)
            {
                View view1 = viewgroup.getChildAt(k1);
                if (i1 + l1 >= view1.getLeft() && i1 + l1 < view1.getRight() && j1 + i2 >= view1.getTop() && j1 + i2 < view1.getBottom() && a(view1, (i1 + l1) - view1.getLeft(), (j1 + i2) - view1.getTop()))
                {
                    return true;
                }
            }

        }
        if (android.os.Build.VERSION.SDK_INT >= 14) goto _L2; else goto _L1
_L1:
        if (!(view instanceof AbsListView)) goto _L4; else goto _L3
_L3:
        boolean flag;
        view = (AbsListView)view;
        if (view.getChildCount() == 0 || view.getFirstVisiblePosition() == 0 && view.getChildAt(0).getTop() == view.getListPaddingTop() && view.getScrollY() == 0)
        {
            i1 = 1;
        } else
        {
            i1 = 0;
        }
        if (i1 != 0) goto _L6; else goto _L5
_L5:
        flag = true;
_L7:
        return flag;
_L6:
        return false;
_L4:
        flag = false;
        if (true) goto _L7; else goto _L2
_L2:
        return mk.b(view, -1);
    }
}
