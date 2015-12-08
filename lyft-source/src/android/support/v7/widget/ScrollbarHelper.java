// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v7.widget;

import android.view.View;

// Referenced classes of package android.support.v7.widget:
//            OrientationHelper

class ScrollbarHelper
{

    static int a(RecyclerView.State state, OrientationHelper orientationhelper, View view, View view1, RecyclerView.LayoutManager layoutmanager, boolean flag)
    {
        if (layoutmanager.q() == 0 || state.e() == 0 || view == null || view1 == null)
        {
            return 0;
        }
        if (!flag)
        {
            return Math.abs(layoutmanager.d(view) - layoutmanager.d(view1)) + 1;
        } else
        {
            int i = orientationhelper.b(view1);
            int j = orientationhelper.a(view);
            return Math.min(orientationhelper.f(), i - j);
        }
    }

    static int a(RecyclerView.State state, OrientationHelper orientationhelper, View view, View view1, RecyclerView.LayoutManager layoutmanager, boolean flag, boolean flag1)
    {
        boolean flag2 = false;
        int j = ((flag2) ? 1 : 0);
        if (layoutmanager.q() != 0)
        {
            j = ((flag2) ? 1 : 0);
            if (state.e() != 0)
            {
                j = ((flag2) ? 1 : 0);
                if (view != null)
                {
                    if (view1 == null)
                    {
                        j = ((flag2) ? 1 : 0);
                    } else
                    {
                        int i = Math.min(layoutmanager.d(view), layoutmanager.d(view1));
                        j = Math.max(layoutmanager.d(view), layoutmanager.d(view1));
                        if (flag1)
                        {
                            i = Math.max(0, state.e() - j - 1);
                        } else
                        {
                            i = Math.max(0, i);
                        }
                        j = i;
                        if (flag)
                        {
                            int k = Math.abs(orientationhelper.b(view1) - orientationhelper.a(view));
                            int l = Math.abs(layoutmanager.d(view) - layoutmanager.d(view1));
                            float f = (float)k / (float)(l + 1);
                            return Math.round((float)i * f + (float)(orientationhelper.c() - orientationhelper.a(view)));
                        }
                    }
                }
            }
        }
        return j;
    }

    static int b(RecyclerView.State state, OrientationHelper orientationhelper, View view, View view1, RecyclerView.LayoutManager layoutmanager, boolean flag)
    {
        if (layoutmanager.q() == 0 || state.e() == 0 || view == null || view1 == null)
        {
            return 0;
        }
        if (!flag)
        {
            return state.e();
        } else
        {
            int i = orientationhelper.b(view1);
            int j = orientationhelper.a(view);
            int k = Math.abs(layoutmanager.d(view) - layoutmanager.d(view1));
            return (int)(((float)(i - j) / (float)(k + 1)) * (float)state.e());
        }
    }
}
