// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v4.widget;

import android.view.View;
import android.widget.ListView;

// Referenced classes of package android.support.v4.widget:
//            AutoScrollHelper

public class ListViewAutoScrollHelper extends AutoScrollHelper
{

    private final ListView mTarget;

    public ListViewAutoScrollHelper(ListView listview)
    {
        super(listview);
        mTarget = listview;
    }

    public boolean canTargetScrollHorizontally(int i)
    {
        return false;
    }

    public boolean canTargetScrollVertically(int i)
    {
        ListView listview = mTarget;
        int j = listview.getCount();
        int k = listview.getChildCount();
        int l = listview.getFirstVisiblePosition();
        return i <= 0 ? i >= 0 || l <= 0 && listview.getChildAt(0).getTop() >= 0 : l + k >= j && listview.getChildAt(k - 1).getBottom() <= listview.getHeight();
    }

    public void scrollTargetBy(int i, int j)
    {
        ListView listview = mTarget;
        i = listview.getFirstVisiblePosition();
        View view;
        if (i != -1)
        {
            if ((view = listview.getChildAt(0)) != null)
            {
                listview.setSelectionFromTop(i, view.getTop() - j);
                return;
            }
        }
    }
}
