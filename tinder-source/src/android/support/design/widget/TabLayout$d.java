// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.design.widget;

import java.lang.ref.WeakReference;

// Referenced classes of package android.support.design.widget:
//            TabLayout

public static final class a
    implements android.support.v4.view.out.d
{

    private final WeakReference a;
    private int b;
    private int c;

    public final void a(int i)
    {
        b = c;
        c = i;
    }

    public final void a(int i, float f, int j)
    {
        boolean flag1 = true;
        TabLayout tablayout = (TabLayout)a.get();
        if (tablayout != null)
        {
            boolean flag = flag1;
            if (c != 1)
            {
                if (c == 2 && b == 1)
                {
                    flag = flag1;
                } else
                {
                    flag = false;
                }
            }
            tablayout.a(i, f, flag);
        }
    }

    public final void b(int i)
    {
        TabLayout tablayout = (TabLayout)a.get();
        if (tablayout != null)
        {
            b b1 = tablayout.a(i);
            boolean flag;
            if (c == 0)
            {
                flag = true;
            } else
            {
                flag = false;
            }
            tablayout.a(b1, flag);
        }
    }

    public (TabLayout tablayout)
    {
        a = new WeakReference(tablayout);
    }
}
