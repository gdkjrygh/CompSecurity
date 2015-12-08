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

    public static final int INVALID_POSITION = -1;
    static final int NO_POSITION = -1;
    private static final String TAG = "ListPopupWindow.DropDownListView";
    private boolean mHijackFocus;
    private boolean mListSelectionHidden;

    private int lookForSelectablePosition(int i, boolean flag)
    {
        ListAdapter listadapter = getAdapter();
        if (listadapter != null && !isInTouchMode()) goto _L2; else goto _L1
_L1:
        return -1;
_L2:
        int j;
        int k;
        k = listadapter.getCount();
        if (getAdapter().areAllItemsEnabled())
        {
            continue; /* Loop/switch isn't completed */
        }
        if (flag)
        {
            i = Math.max(0, i);
            do
            {
                j = i;
                if (i >= k)
                {
                    continue; /* Loop/switch isn't completed */
                }
                j = i;
                if (listadapter.isEnabled(i))
                {
                    continue; /* Loop/switch isn't completed */
                }
                i++;
            } while (true);
        }
        i = Math.min(i, k - 1);
        do
        {
            j = i;
            if (i < 0)
            {
                break;
            }
            j = i;
            if (listadapter.isEnabled(i))
            {
                break;
            }
            i--;
        } while (true);
        if (j < 0 || j >= k) goto _L1; else goto _L3
_L3:
        return j;
        if (i < 0 || i >= k) goto _L1; else goto _L4
_L4:
        return i;
    }

    public boolean hasFocus()
    {
        return mHijackFocus || super.hasFocus();
    }

    public boolean hasWindowFocus()
    {
        return mHijackFocus || super.hasWindowFocus();
    }

    public boolean isFocused()
    {
        return mHijackFocus || super.isFocused();
    }

    public boolean isInTouchMode()
    {
        return mHijackFocus && mListSelectionHidden || super.isInTouchMode();
    }

    final int measureHeightOfChildrenCompat(int i, int j, int k, int l, int i1)
    {
        Object obj;
        ListAdapter listadapter;
        int j1;
        j = getListPaddingTop();
        k = getListPaddingBottom();
        getListPaddingLeft();
        getListPaddingRight();
        j1 = getDividerHeight();
        obj = getDivider();
        listadapter = getAdapter();
        if (listadapter != null) goto _L2; else goto _L1
_L1:
        j += k;
_L4:
        return j;
_L2:
        k = j + k;
        int i2;
        int k2;
        if (j1 <= 0 || obj == null)
        {
            j1 = 0;
        }
        j = 0;
        obj = null;
        i2 = 0;
        k2 = listadapter.getCount();
        for (int k1 = 0; k1 < k2;)
        {
            int j2 = listadapter.getItemViewType(k1);
            int l1 = i2;
            if (j2 != i2)
            {
                obj = null;
                l1 = j2;
            }
            obj = listadapter.getView(k1, ((View) (obj)), this);
            i2 = ((View) (obj)).getLayoutParams().getAdapter;
            if (i2 > 0)
            {
                i2 = android.view.ndow.DropDownListView.getAdapter(i2, 0x40000000);
            } else
            {
                i2 = android.view.ndow.DropDownListView.getAdapter(0, 0);
            }
            ((View) (obj)).measure(i, i2);
            i2 = k;
            if (k1 > 0)
            {
                i2 = k + j1;
            }
            k = i2 + ((View) (obj)).getMeasuredHeight();
            if (k >= l)
            {
                if (i1 < 0 || k1 <= i1 || j <= 0 || k == l)
                {
                    return l;
                }
                continue; /* Loop/switch isn't completed */
            }
            i2 = j;
            if (i1 >= 0)
            {
                i2 = j;
                if (k1 >= i1)
                {
                    i2 = k;
                }
            }
            k1++;
            j = i2;
            i2 = l1;
        }

        return k;
        if (true) goto _L4; else goto _L3
_L3:
    }


/*
    static boolean access$502(I i, boolean flag)
    {
        i.mListSelectionHidden = flag;
        return flag;
    }

*/


    public mListSelectionHidden(Context context, boolean flag)
    {
        super(context, null, android.support.v7.appcompat.tView);
        mHijackFocus = flag;
        setCacheColorHint(0);
    }
}
