// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v7.widget;

import android.view.View;

// Referenced classes of package android.support.v7.widget:
//            bj, bs, au

final class by
{

    static int a(bs bs1, au au1, View view, View view1, bj bj1, boolean flag)
    {
        if (bj1.j() == 0 || bs1.e() == 0 || view == null || view1 == null)
        {
            return 0;
        }
        if (!flag)
        {
            return Math.abs(bj.c(view) - bj.c(view1)) + 1;
        } else
        {
            int i = au1.b(view1);
            int j = au1.a(view);
            return Math.min(au1.f(), i - j);
        }
    }

    static int a(bs bs1, au au1, View view, View view1, bj bj1, boolean flag, boolean flag1)
    {
        boolean flag2 = false;
        int j = ((flag2) ? 1 : 0);
        if (bj1.j() != 0)
        {
            j = ((flag2) ? 1 : 0);
            if (bs1.e() != 0)
            {
                j = ((flag2) ? 1 : 0);
                if (view != null)
                {
                    if (view1 == null)
                    {
                        j = ((flag2) ? 1 : 0);
                    } else
                    {
                        int i = Math.min(bj.c(view), bj.c(view1));
                        j = Math.max(bj.c(view), bj.c(view1));
                        if (flag1)
                        {
                            i = Math.max(0, bs1.e() - j - 1);
                        } else
                        {
                            i = Math.max(0, i);
                        }
                        j = i;
                        if (flag)
                        {
                            int k = Math.abs(au1.b(view1) - au1.a(view));
                            int l = Math.abs(bj.c(view) - bj.c(view1));
                            float f = (float)k / (float)(l + 1);
                            return Math.round((float)i * f + (float)(au1.c() - au1.a(view)));
                        }
                    }
                }
            }
        }
        return j;
    }

    static int b(bs bs1, au au1, View view, View view1, bj bj1, boolean flag)
    {
        if (bj1.j() == 0 || bs1.e() == 0 || view == null || view1 == null)
        {
            return 0;
        }
        if (!flag)
        {
            return bs1.e();
        } else
        {
            int i = au1.b(view1);
            int j = au1.a(view);
            int k = Math.abs(bj.c(view) - bj.c(view1));
            return (int)(((float)(i - j) / (float)(k + 1)) * (float)bs1.e());
        }
    }
}
