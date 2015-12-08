// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v7.internal.widget;

import android.content.Context;
import android.view.View;
import android.widget.ListAdapter;
import android.widget.ListView;

// Referenced classes of package android.support.v7.internal.widget:
//            ListPopupWindow

private static class setCacheColorHint extends ListView
{

    private boolean a;
    private boolean b;

    static boolean a(setCacheColorHint setcachecolorhint, boolean flag)
    {
        setcachecolorhint.a = flag;
        return flag;
    }

    final int a(int i, int j, int k, int l, int i1)
    {
        Object obj;
        ListAdapter listadapter;
        int j1;
        j = getListPaddingTop();
        j1 = getListPaddingBottom();
        getListPaddingLeft();
        getListPaddingRight();
        k = getDividerHeight();
        obj = getDivider();
        listadapter = getAdapter();
        if (listadapter != null) goto _L2; else goto _L1
_L1:
        i = j + j1;
_L4:
        return i;
_L2:
        j = j1 + j;
        int l1;
        int i2;
        int k2;
        if (k <= 0 || obj == null)
        {
            k = 0;
        }
        l1 = 0;
        obj = null;
        i2 = 0;
        k2 = listadapter.getCount();
        for (int k1 = 0; k1 < k2;)
        {
            int j2 = listadapter.getItemViewType(k1);
            if (j2 != i2)
            {
                obj = null;
                i2 = j2;
            }
            obj = listadapter.getView(k1, ((View) (obj)), this);
            android.view.rams rams = ((View) (obj)).getLayoutParams();
            if (rams != null && rams.height > 0)
            {
                j2 = android.view.akeMeasureSpec(rams.height, 0x40000000);
            } else
            {
                j2 = android.view.akeMeasureSpec(0, 0);
            }
            ((View) (obj)).measure(i, j2);
            if (k1 > 0)
            {
                j += k;
            }
            j += ((View) (obj)).getMeasuredHeight();
            if (j >= l)
            {
                i = l;
                if (i1 >= 0)
                {
                    i = l;
                    if (k1 > i1)
                    {
                        i = l;
                        if (l1 > 0)
                        {
                            i = l;
                            if (j != l)
                            {
                                return l1;
                            }
                        }
                    }
                }
                continue; /* Loop/switch isn't completed */
            }
            j2 = l1;
            if (i1 >= 0)
            {
                j2 = l1;
                if (k1 >= i1)
                {
                    j2 = j;
                }
            }
            k1++;
            l1 = j2;
        }

        return j;
        if (true) goto _L4; else goto _L3
_L3:
    }

    public boolean hasFocus()
    {
        return b || super.hasFocus();
    }

    public boolean hasWindowFocus()
    {
        return b || super.hasWindowFocus();
    }

    public boolean isFocused()
    {
        return b || super.isFocused();
    }

    public boolean isInTouchMode()
    {
        return b && a || super.isInTouchMode();
    }

    public (Context context, boolean flag)
    {
        super(context, null, android.support.v7.appcompat.tViewStyle);
        b = flag;
        setCacheColorHint(0);
    }
}
