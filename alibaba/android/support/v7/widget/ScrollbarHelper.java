// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v7.widget;

import android.view.View;

// Referenced classes of package android.support.v7.widget:
//            OrientationHelper

class ScrollbarHelper
{

    ScrollbarHelper()
    {
    }

    static int computeScrollExtent(RecyclerView.State state, OrientationHelper orientationhelper, View view, View view1, RecyclerView.LayoutManager layoutmanager, boolean flag)
    {
        if (layoutmanager.getChildCount() == 0 || state.getItemCount() == 0 || view == null || view1 == null)
        {
            return 0;
        }
        if (!flag)
        {
            return Math.abs(layoutmanager.getPosition(view) - layoutmanager.getPosition(view1)) + 1;
        } else
        {
            int i = orientationhelper.getDecoratedEnd(view1);
            int j = orientationhelper.getDecoratedStart(view);
            return Math.min(orientationhelper.getTotalSpace(), i - j);
        }
    }

    static int computeScrollOffset(RecyclerView.State state, OrientationHelper orientationhelper, View view, View view1, RecyclerView.LayoutManager layoutmanager, boolean flag, boolean flag1)
    {
        boolean flag2 = false;
        int j = ((flag2) ? 1 : 0);
        if (layoutmanager.getChildCount() != 0)
        {
            j = ((flag2) ? 1 : 0);
            if (state.getItemCount() != 0)
            {
                j = ((flag2) ? 1 : 0);
                if (view != null)
                {
                    if (view1 == null)
                    {
                        j = ((flag2) ? 1 : 0);
                    } else
                    {
                        int i = Math.min(layoutmanager.getPosition(view), layoutmanager.getPosition(view1));
                        j = Math.max(layoutmanager.getPosition(view), layoutmanager.getPosition(view1));
                        if (flag1)
                        {
                            i = Math.max(0, state.getItemCount() - j - 1);
                        } else
                        {
                            i = Math.max(0, i);
                        }
                        j = i;
                        if (flag)
                        {
                            int k = Math.abs(orientationhelper.getDecoratedEnd(view1) - orientationhelper.getDecoratedStart(view));
                            int l = Math.abs(layoutmanager.getPosition(view) - layoutmanager.getPosition(view1));
                            float f = (float)k / (float)(l + 1);
                            return Math.round((float)i * f + (float)(orientationhelper.getStartAfterPadding() - orientationhelper.getDecoratedStart(view)));
                        }
                    }
                }
            }
        }
        return j;
    }

    static int computeScrollRange(RecyclerView.State state, OrientationHelper orientationhelper, View view, View view1, RecyclerView.LayoutManager layoutmanager, boolean flag)
    {
        if (layoutmanager.getChildCount() == 0 || state.getItemCount() == 0 || view == null || view1 == null)
        {
            return 0;
        }
        if (!flag)
        {
            return state.getItemCount();
        } else
        {
            int i = orientationhelper.getDecoratedEnd(view1);
            int j = orientationhelper.getDecoratedStart(view);
            int k = Math.abs(layoutmanager.getPosition(view) - layoutmanager.getPosition(view1));
            return (int)(((float)(i - j) / (float)(k + 1)) * (float)state.getItemCount());
        }
    }
}
