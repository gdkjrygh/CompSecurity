// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v7.widget;

import android.view.View;

// Referenced classes of package android.support.v7.widget:
//            q

final class aa
{

    static int a(RecyclerView.q q1, q q2, View view, View view1, RecyclerView.i i, boolean flag)
    {
        if (i.p() == 0 || q1.e() == 0 || view == null || view1 == null)
        {
            return 0;
        }
        if (!flag)
        {
            return Math.abs(RecyclerView.i.e(view) - RecyclerView.i.e(view1)) + 1;
        } else
        {
            int j = q2.b(view1);
            int k = q2.a(view);
            return Math.min(q2.f(), j - k);
        }
    }

    static int a(RecyclerView.q q1, q q2, View view, View view1, RecyclerView.i i, boolean flag, boolean flag1)
    {
        boolean flag2 = false;
        int k = ((flag2) ? 1 : 0);
        if (i.p() != 0)
        {
            k = ((flag2) ? 1 : 0);
            if (q1.e() != 0)
            {
                k = ((flag2) ? 1 : 0);
                if (view != null)
                {
                    if (view1 == null)
                    {
                        k = ((flag2) ? 1 : 0);
                    } else
                    {
                        int j = Math.min(RecyclerView.i.e(view), RecyclerView.i.e(view1));
                        k = Math.max(RecyclerView.i.e(view), RecyclerView.i.e(view1));
                        if (flag1)
                        {
                            j = Math.max(0, q1.e() - k - 1);
                        } else
                        {
                            j = Math.max(0, j);
                        }
                        k = j;
                        if (flag)
                        {
                            int l = Math.abs(q2.b(view1) - q2.a(view));
                            int i1 = Math.abs(RecyclerView.i.e(view) - RecyclerView.i.e(view1));
                            float f = (float)l / (float)(i1 + 1);
                            return Math.round((float)j * f + (float)(q2.c() - q2.a(view)));
                        }
                    }
                }
            }
        }
        return k;
    }

    static int b(RecyclerView.q q1, q q2, View view, View view1, RecyclerView.i i, boolean flag)
    {
        if (i.p() == 0 || q1.e() == 0 || view == null || view1 == null)
        {
            return 0;
        }
        if (!flag)
        {
            return q1.e();
        } else
        {
            int j = q2.b(view1);
            int k = q2.a(view);
            int l = Math.abs(RecyclerView.i.e(view) - RecyclerView.i.e(view1));
            return (int)(((float)(j - k) / (float)(l + 1)) * (float)q1.e());
        }
    }
}
