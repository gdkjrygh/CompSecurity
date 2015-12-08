// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.view.View;

public final class abq
{

    public static int a(abm abm1, aau aau1, View view, View view1, abd abd1, boolean flag)
    {
        if (abd1.p() == 0 || abm1.b() == 0 || view == null || view1 == null)
        {
            return 0;
        }
        if (!flag)
        {
            return Math.abs(abd.b(view) - abd.b(view1)) + 1;
        } else
        {
            int i = aau1.b(view1);
            int j = aau1.a(view);
            return Math.min(aau1.e(), i - j);
        }
    }

    public static int a(abm abm1, aau aau1, View view, View view1, abd abd1, boolean flag, boolean flag1)
    {
        boolean flag2 = false;
        int j = ((flag2) ? 1 : 0);
        if (abd1.p() != 0)
        {
            j = ((flag2) ? 1 : 0);
            if (abm1.b() != 0)
            {
                j = ((flag2) ? 1 : 0);
                if (view != null)
                {
                    if (view1 == null)
                    {
                        j = ((flag2) ? 1 : 0);
                    } else
                    {
                        int i = Math.min(abd.b(view), abd.b(view1));
                        j = Math.max(abd.b(view), abd.b(view1));
                        if (flag1)
                        {
                            i = Math.max(0, abm1.b() - j - 1);
                        } else
                        {
                            i = Math.max(0, i);
                        }
                        j = i;
                        if (flag)
                        {
                            int k = Math.abs(aau1.b(view1) - aau1.a(view));
                            int l = Math.abs(abd.b(view) - abd.b(view1));
                            float f = (float)k / (float)(l + 1);
                            return Math.round((float)i * f + (float)(aau1.b() - aau1.a(view)));
                        }
                    }
                }
            }
        }
        return j;
    }

    public static int b(abm abm1, aau aau1, View view, View view1, abd abd1, boolean flag)
    {
        if (abd1.p() == 0 || abm1.b() == 0 || view == null || view1 == null)
        {
            return 0;
        }
        if (!flag)
        {
            return abm1.b();
        } else
        {
            int i = aau1.b(view1);
            int j = aau1.a(view);
            int k = Math.abs(abd.b(view) - abd.b(view1));
            return (int)(((float)(i - j) / (float)(k + 1)) * (float)abm1.b());
        }
    }
}
