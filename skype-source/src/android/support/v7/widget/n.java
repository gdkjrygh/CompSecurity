// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v7.widget;

import android.view.View;

// Referenced classes of package android.support.v7.widget:
//            l

final class n
{

    static int a(RecyclerView.s s, l l1, View view, View view1, RecyclerView.i i, boolean flag)
    {
        if (i.getChildCount() == 0 || s.e() == 0 || view == null || view1 == null)
        {
            return 0;
        }
        if (!flag)
        {
            return Math.abs(i.getPosition(view) - i.getPosition(view1)) + 1;
        } else
        {
            int j = l1.b(view1);
            int k = l1.a(view);
            return Math.min(l1.f(), j - k);
        }
    }

    static int a(RecyclerView.s s, l l1, View view, View view1, RecyclerView.i i, boolean flag, boolean flag1)
    {
        boolean flag2 = false;
        int k = ((flag2) ? 1 : 0);
        if (i.getChildCount() != 0)
        {
            k = ((flag2) ? 1 : 0);
            if (s.e() != 0)
            {
                k = ((flag2) ? 1 : 0);
                if (view != null)
                {
                    if (view1 == null)
                    {
                        k = ((flag2) ? 1 : 0);
                    } else
                    {
                        int j = Math.min(i.getPosition(view), i.getPosition(view1));
                        k = Math.max(i.getPosition(view), i.getPosition(view1));
                        if (flag1)
                        {
                            j = Math.max(0, s.e() - k - 1);
                        } else
                        {
                            j = Math.max(0, j);
                        }
                        k = j;
                        if (flag)
                        {
                            int i1 = Math.abs(l1.b(view1) - l1.a(view));
                            int j1 = Math.abs(i.getPosition(view) - i.getPosition(view1));
                            float f = (float)i1 / (float)(j1 + 1);
                            return Math.round((float)j * f + (float)(l1.c() - l1.a(view)));
                        }
                    }
                }
            }
        }
        return k;
    }

    static int b(RecyclerView.s s, l l1, View view, View view1, RecyclerView.i i, boolean flag)
    {
        if (i.getChildCount() == 0 || s.e() == 0 || view == null || view1 == null)
        {
            return 0;
        }
        if (!flag)
        {
            return s.e();
        } else
        {
            int j = l1.b(view1);
            int k = l1.a(view);
            int i1 = Math.abs(i.getPosition(view) - i.getPosition(view1));
            return (int)(((float)(j - k) / (float)(i1 + 1)) * (float)s.e());
        }
    }
}
