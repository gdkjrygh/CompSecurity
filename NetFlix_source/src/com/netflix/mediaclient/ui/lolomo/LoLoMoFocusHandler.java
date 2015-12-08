// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.netflix.mediaclient.ui.lolomo;

import android.database.DataSetObserver;
import android.view.KeyEvent;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewParent;
import android.widget.AbsListView;
import com.netflix.mediaclient.Log;
import com.netflix.mediaclient.ui.lomo.VideoViewGroup;
import com.netflix.mediaclient.util.DeviceUtils;
import com.viewpagerindicator.android.osp.ViewPager;
import se.emilsjolander.stickylistheaders.StickyListHeadersAdapter;
import se.emilsjolander.stickylistheaders.StickyListHeadersListView;

public class LoLoMoFocusHandler extends DataSetObserver
{

    private static final boolean LEFT = false;
    private static final boolean LOG_VERBOSE = false;
    private static final boolean RIGHT = true;
    private static final String TAG = "LoLoMoFocusHandler";
    private static final int VERTICAL_SCROLL_POSITION_OFFSET_PX = 16;
    private static final int VIEW_ID_ROW_MULTIPLIER = 1000;
    private static boolean viewIdsValidated;
    private int col;
    private final StickyListHeadersListView listView;
    private int row;
    private boolean touchEnabled;

    LoLoMoFocusHandler(StickyListHeadersListView stickylistheaderslistview)
    {
        touchEnabled = true;
        validateViewIdsIfNecessary();
        listView = stickylistheaderslistview;
        stickylistheaderslistview.setOnScrollListener(new android.widget.AbsListView.OnScrollListener() {

            final LoLoMoFocusHandler this$0;

            public void onScroll(AbsListView abslistview, int i, int j, int k)
            {
            }

            public void onScrollStateChanged(AbsListView abslistview, int i)
            {
                if (touchEnabled)
                {
                    return;
                } else
                {
                    requestFocusAtCurrPos();
                    return;
                }
            }

            
            {
                this$0 = LoLoMoFocusHandler.this;
                super();
            }
        });
        stickylistheaderslistview.setOnTouchListener(new android.view.View.OnTouchListener() {

            final LoLoMoFocusHandler this$0;

            public boolean onTouch(View view, MotionEvent motionevent)
            {
                touchEnabled = true;
                return false;
            }

            
            {
                this$0 = LoLoMoFocusHandler.this;
                super();
            }
        });
    }

    private boolean canScrollHorizontally(boolean flag)
    {
        int i;
        if (flag)
        {
            i = col + 1;
        } else
        {
            i = col - 1;
        }
        return listView.findViewById(computeViewId(row, i)) != null;
    }

    private int computeColFromViewId(int i)
    {
        return i % 1000;
    }

    private int computeCurrViewId()
    {
        return computeViewId(row, col);
    }

    public static int computeViewId(int i, int j)
    {
        return (i + 1) * 1000 + j;
    }

    private boolean disableTouchMode()
    {
        if (touchEnabled)
        {
            touchEnabled = false;
            requestFocusAtCurrPos();
            return false;
        } else
        {
            return true;
        }
    }

    private VideoViewGroup getVideoViewGroup(View view)
    {
        if (view != null)
        {
            ViewParent viewparent = view.getParent();
            view = viewparent;
            if (!(viewparent instanceof VideoViewGroup))
            {
                view = viewparent.getParent();
            }
            if (view instanceof VideoViewGroup)
            {
                return (VideoViewGroup)view;
            }
        }
        return null;
    }

    private ViewPager getViewPager(View view)
    {
        view = getVideoViewGroup(view);
        if (view == null)
        {
            return null;
        } else
        {
            return (ViewPager)view.getParent();
        }
    }

    private void handleDpadEvent(int i)
    {
        boolean flag;
        boolean flag3;
        flag3 = true;
        flag = false;
        i;
        JVM INSTR tableswitch 19 22: default 36
    //                   19 85
    //                   20 45
    //                   21 102
    //                   22 129;
           goto _L1 _L2 _L3 _L4 _L5
_L1:
        Log.w("LoLoMoFocusHandler", "Unknown keyCode");
        return;
_L3:
        row = Math.min(row + 1, listView.getAdapter().getCount() - 1);
_L7:
        if (flag)
        {
            scrollHorizontallyIfRequired();
            requestFocusAtCurrPos();
            return;
        }
        break; /* Loop/switch isn't completed */
_L2:
        row = Math.max(0, row - 1);
        continue; /* Loop/switch isn't completed */
_L4:
        boolean flag1 = true;
        flag = flag1;
        if (canScrollHorizontally(false))
        {
            col = col - 1;
            flag = flag1;
        }
        continue; /* Loop/switch isn't completed */
_L5:
        boolean flag2 = true;
        flag = flag2;
        if (canScrollHorizontally(true))
        {
            col = col + 1;
            flag = flag2;
        }
        if (true) goto _L7; else goto _L6
_L6:
        scrollVertically(row);
        if (i != 20)
        {
            flag3 = false;
        }
        handleVerticalKeyEvent(flag3);
        return;
    }

    private void handleVerticalKeyEvent(boolean flag)
    {
        Object obj = listView;
        char c;
        if (flag)
        {
            c = '\202';
        } else
        {
            c = '!';
        }
        obj = ((StickyListHeadersListView) (obj)).focusSearch(c);
        if (obj != null && !(obj instanceof MenuItem))
        {
            if ((obj = getVideoViewGroup(((View) (obj)))) != null)
            {
                int i = col;
                int j = ((VideoViewGroup) (obj)).getChildCount();
                col = computeColFromViewId(((VideoViewGroup) (obj)).getChildAt(0).getId()) + i % j;
                requestFocusAtCurrPos();
                return;
            }
        }
    }

    private void requestFocusAtCurrPos()
    {
        int i = computeCurrViewId();
        View view = listView.findViewById(i);
        if (view == null)
        {
            return;
        } else
        {
            view.requestFocus();
            return;
        }
    }

    private void scrollHorizontallyIfRequired()
    {
        ViewPager viewpager;
        int j;
        int k;
        int l;
        int i1;
        View view = listView.findViewById(computeCurrViewId());
        viewpager = getViewPager(view);
        if (viewpager == null)
        {
            return;
        }
        int ai[] = new int[2];
        view.getLocationOnScreen(ai);
        k = ai[0];
        l = view.getWidth();
        i1 = DeviceUtils.getScreenWidthInPixels(listView.getContext());
        j = viewpager.getCurrentItem();
        if (k >= 0) goto _L2; else goto _L1
_L1:
        int i = j - 1;
_L4:
        viewpager.setCurrentItem(i, true, true);
        return;
_L2:
        i = j;
        if (k + l > i1)
        {
            i = j + 1;
        }
        if (true) goto _L4; else goto _L3
_L3:
    }

    private void scrollVertically(int i)
    {
        listView.smoothScrollToPositionFromTop(i, 16);
    }

    private void validateViewIdsIfNecessary()
    {
    }

    public boolean dispatchKeyEvent(KeyEvent keyevent)
    {
        if (keyevent.getAction() != 0) goto _L2; else goto _L1
_L1:
        keyevent.getKeyCode();
        JVM INSTR tableswitch 19 22: default 40
    //                   19 42
    //                   20 42
    //                   21 42
    //                   22 42;
           goto _L2 _L3 _L3 _L3 _L3
_L2:
        return false;
_L3:
        if (disableTouchMode())
        {
            handleDpadEvent(keyevent.getKeyCode());
        }
        return true;
    }

    public void onChanged()
    {
        super.onChanged();
    }



/*
    static boolean access$002(LoLoMoFocusHandler lolomofocushandler, boolean flag)
    {
        lolomofocushandler.touchEnabled = flag;
        return flag;
    }

*/

}
