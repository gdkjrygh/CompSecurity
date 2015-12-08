// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v7.widget;

import android.view.View;

// Referenced classes of package android.support.v7.widget:
//            au, bf, ad

final class bl
{

    static int a(bf bf1, ad ad1, View view, View view1, au au1, boolean flag)
    {
        if (au1.r() == 0 || bf1.e() == 0 || view == null || view1 == null)
        {
            return 0;
        }
        if (!flag)
        {
            return Math.abs(au.e(view) - au.e(view1)) + 1;
        } else
        {
            int i = ad1.b(view1);
            int j = ad1.a(view);
            return Math.min(ad1.f(), i - j);
        }
    }

    static int a(bf bf1, ad ad1, View view, View view1, au au1, boolean flag, boolean flag1)
    {
        boolean flag2 = false;
        int j = ((flag2) ? 1 : 0);
        if (au1.r() != 0)
        {
            j = ((flag2) ? 1 : 0);
            if (bf1.e() != 0)
            {
                j = ((flag2) ? 1 : 0);
                if (view != null)
                {
                    if (view1 == null)
                    {
                        j = ((flag2) ? 1 : 0);
                    } else
                    {
                        int i = Math.min(au.e(view), au.e(view1));
                        j = Math.max(au.e(view), au.e(view1));
                        if (flag1)
                        {
                            i = Math.max(0, bf1.e() - j - 1);
                        } else
                        {
                            i = Math.max(0, i);
                        }
                        j = i;
                        if (flag)
                        {
                            int k = Math.abs(ad1.b(view1) - ad1.a(view));
                            int l = Math.abs(au.e(view) - au.e(view1));
                            float f = (float)k / (float)(l + 1);
                            return Math.round((float)i * f + (float)(ad1.c() - ad1.a(view)));
                        }
                    }
                }
            }
        }
        return j;
    }

    static int b(bf bf1, ad ad1, View view, View view1, au au1, boolean flag)
    {
        if (au1.r() == 0 || bf1.e() == 0 || view == null || view1 == null)
        {
            return 0;
        }
        if (!flag)
        {
            return bf1.e();
        } else
        {
            int i = ad1.b(view1);
            int j = ad1.a(view);
            int k = Math.abs(au.e(view) - au.e(view1));
            return (int)(((float)(i - j) / (float)(k + 1)) * (float)bf1.e());
        }
    }
}
